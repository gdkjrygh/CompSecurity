// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;


public class CityStateZipResponseModel
{

    private String city;
    private String state;
    private String zipCode;

    public CityStateZipResponseModel()
    {
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setState(String s)
    {
        state = s;
    }

    public void setZipCode(String s)
    {
        zipCode = s;
    }
}
