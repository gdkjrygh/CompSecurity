// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;


public class LocaleInfo
{

    private String country;
    private Long id;
    private String locale;

    public LocaleInfo()
    {
    }

    public LocaleInfo(Long long1)
    {
        id = long1;
    }

    public LocaleInfo(Long long1, String s, String s1)
    {
        id = long1;
        locale = s;
        country = s1;
    }

    public String getCountry()
    {
        return country;
    }

    public Long getId()
    {
        return id;
    }

    public String getLocale()
    {
        return locale;
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setLocale(String s)
    {
        locale = s;
    }
}
