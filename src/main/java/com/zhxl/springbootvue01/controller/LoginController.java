package com.zhxl.springbootvue01.controller;

import com.zhxl.springbootvue01.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by 不爱编程的程序猿
 * 2018/11/8
 */
@RestController
@RequestMapping("/rest")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Boolean Login(@RequestBody User user) {
        System.out.printf("用户名" + user.getUsername());
        System.out.printf("用户密码" + user.getPassword());
        return Boolean.TRUE;
    }

}

