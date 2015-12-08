// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.picksinit;

import java.util.Set;

public class Config
{

    private boolean isDebug;
    private boolean isNeedWebView;
    private Set mtType;
    private Set showType;
    private String testReportIp;

    public Config(Set set, Set set1, boolean flag, boolean flag1, String s)
    {
        showType = set;
        mtType = set1;
        isNeedWebView = flag;
        isDebug = flag1;
        testReportIp = s;
    }

    public Set getMtType()
    {
        return mtType;
    }

    public Set getShowType()
    {
        return showType;
    }

    public String getTestReportIp()
    {
        return testReportIp;
    }

    public boolean isDebug()
    {
        return isDebug;
    }

    public boolean isNeedWebView()
    {
        return isNeedWebView;
    }

    public void setDebug(boolean flag)
    {
        isDebug = flag;
    }

    public void setMtType(Set set)
    {
        mtType = set;
    }

    public void setNeedWebView(boolean flag)
    {
        isNeedWebView = flag;
    }

    public void setShowType(Set set)
    {
        showType = set;
    }

    public void setTestReportIp(String s)
    {
        testReportIp = s;
    }
}
