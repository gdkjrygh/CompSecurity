// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.rest.containers;

import java.io.Serializable;

public class Address
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String addr1;
    private String addr2;
    private String city;
    private String postalCode;
    private String state;

    public Address()
    {
    }

    public String getAddr1()
    {
        return addr1;
    }

    public String getAddr2()
    {
        return addr2;
    }

    public String getCity()
    {
        return city;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getState()
    {
        return state;
    }

    public void setAddr1(String s)
    {
        addr1 = s;
    }

    public void setAddr2(String s)
    {
        addr2 = s;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setPostalCode(String s)
    {
        postalCode = s;
    }

    public void setState(String s)
    {
        state = s;
    }
}
