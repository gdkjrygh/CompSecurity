// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.screen;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.properties.ApplicationProperties;

public class BaseLayoutHelper
{

    private ApplicationProperties applicationProperties;

    BaseLayoutHelper(ApplicationProperties applicationproperties)
    {
        applicationProperties = applicationproperties;
    }

    private void addContent(AppCompatActivity appcompatactivity, int i, View view)
    {
        ((ViewGroup)view.findViewById(0x7f0f00b5)).addView(appcompatactivity.getLayoutInflater().inflate(i, null));
    }

    private View createLayout(AppCompatActivity appcompatactivity, int i)
    {
        appcompatactivity.supportRequestWindowFeature(9);
        View view = appcompatactivity.getLayoutInflater().inflate(i, null);
        appcompatactivity.setContentView(view);
        appcompatactivity = (DrawerLayout)view.findViewById(0x7f0f00b8);
        if (appcompatactivity != null && applicationProperties.isDebugBuild())
        {
            View.inflate(view.getContext(), 0x7f03005c, appcompatactivity);
        }
        return view;
    }

    public View createActionBarLayout(AppCompatActivity appcompatactivity, int i)
    {
        View view = createLayout(appcompatactivity, i);
        setupActionBar(appcompatactivity);
        return view;
    }

    public View setBaseLayout(AppCompatActivity appcompatactivity)
    {
        return createActionBarLayout(appcompatactivity, 0x7f030025);
    }

    public View setBaseLayoutWithContent(AppCompatActivity appcompatactivity, int i)
    {
        View view = setBaseLayout(appcompatactivity);
        addContent(appcompatactivity, i, view);
        return view;
    }

    public View setBaseLayoutWithMargins(AppCompatActivity appcompatactivity)
    {
        return createActionBarLayout(appcompatactivity, 0x7f030026);
    }

    public View setBaseTabsLayout(AppCompatActivity appcompatactivity)
    {
        int i;
        if (applicationProperties.isDebugBuild())
        {
            i = 0x7f030028;
        } else
        {
            i = 0x7f030027;
        }
        return createLayout(appcompatactivity, i);
    }

    public View setContainerLayout(AppCompatActivity appcompatactivity)
    {
        return createActionBarLayout(appcompatactivity, 0x7f03004e);
    }

    public void setupActionBar(AppCompatActivity appcompatactivity)
    {
        Toolbar toolbar = (Toolbar)appcompatactivity.findViewById(0x7f0f0022);
        if (toolbar != null)
        {
            appcompatactivity.setSupportActionBar(toolbar);
            appcompatactivity = appcompatactivity.getSupportActionBar();
            if (appcompatactivity != null)
            {
                appcompatactivity.setDisplayHomeAsUpEnabled(true);
                appcompatactivity.setDisplayShowTitleEnabled(true);
            }
        }
    }
}
