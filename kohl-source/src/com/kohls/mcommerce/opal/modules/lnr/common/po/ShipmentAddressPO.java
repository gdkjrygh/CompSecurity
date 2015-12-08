// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.common.po;

import java.io.Serializable;

public class ShipmentAddressPO
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String ID;
    private String addr1;
    private String addr2;
    private String city;
    private String countryCode;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String postalCode;
    private String state;

    public ShipmentAddressPO()
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

    public String getCountryCode()
    {
        return countryCode;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getID()
    {
        return ID;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
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

    public void setCountryCode(String s)
    {
        countryCode = s;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setID(String s)
    {
        ID = s;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setPhoneNumber(String s)
    {
        phoneNumber = s;
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
