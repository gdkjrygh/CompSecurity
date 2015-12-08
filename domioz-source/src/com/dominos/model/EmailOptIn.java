// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.model;

import com.google.b.k;

public class EmailOptIn
{

    private String city;
    private String email;
    private String firstName;
    private boolean isOptIn;
    private String lastName;
    private String postalCode;
    private String region;
    private String storeId;
    private String street;

    public EmailOptIn()
    {
    }

    public String getCity()
    {
        return city;
    }

    public String getEmail()
    {
        return email;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPostalCode()
    {
        return postalCode;
    }

    public String getRegion()
    {
        return region;
    }

    public String getStoreId()
    {
        return storeId;
    }

    public String getStreet()
    {
        return street;
    }

    public boolean isOptIn()
    {
        return isOptIn;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setOptIn(boolean flag)
    {
        isOptIn = flag;
    }

    public void setPostalCode(String s)
    {
        postalCode = s;
    }

    public void setRegion(String s)
    {
        region = s;
    }

    public void setStoreId(String s)
    {
        storeId = s;
    }

    public void setStreet(String s)
    {
        street = s;
    }

    public String toJson()
    {
        return (new k()).b(this, com/dominos/model/EmailOptIn);
    }
}
