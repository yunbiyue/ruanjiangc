package com.ldu.controller;

import org.springframework.stereotype.Controller;

import com.ldu.service.CatelogService;

import javax.annotation.Resource;


@Controller
public class CatelogController {
    @Resource
    private CatelogService catelogService;

}
