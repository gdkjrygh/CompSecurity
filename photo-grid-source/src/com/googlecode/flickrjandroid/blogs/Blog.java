// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.blogs;

import java.math.BigDecimal;

public class Blog
{

    public static final long serialVersionUID = 12L;
    private BigDecimal id;
    private String name;
    private boolean needPassword;
    private String url;

    public Blog()
    {
    }

    public BigDecimal getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getUrl()
    {
        return url;
    }

    public boolean isNeedPassword()
    {
        return needPassword;
    }

    public void setId(String s)
    {
        if (s != null)
        {
            setId(new BigDecimal(s));
        }
    }

    public void setId(BigDecimal bigdecimal)
    {
        id = bigdecimal;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setNeedPassword(boolean flag)
    {
        needPassword = flag;
    }

    public void setUrl(String s)
    {
        url = s;
    }
}
