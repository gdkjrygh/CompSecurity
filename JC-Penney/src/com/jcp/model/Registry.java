// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;


public class Registry
{

    private String mName;
    private String mUrl;

    public Registry()
    {
    }

    public String getName()
    {
        return mName;
    }

    public String getUrl()
    {
        return mUrl;
    }

    public void setName(String s)
    {
        mName = s;
    }

    public void setUrl(String s)
    {
        mUrl = s;
    }
}
