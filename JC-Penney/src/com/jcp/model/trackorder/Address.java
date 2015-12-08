// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.trackorder;

import com.jcp.model.GetAddressResponseModel;

public class Address extends GetAddressResponseModel
{

    private String addressLineThree;
    private String email;
    private String province;
    private String secondaryPhoneNumber;
    private boolean store;
    private String storeNumber;
    private String type;

    public Address()
    {
    }

    public String getAddressLineThree()
    {
        return addressLineThree;
    }

    public String getEmail()
    {
        return email;
    }

    public String getProvince()
    {
        return province;
    }

    public String getSecondaryPhoneNumber()
    {
        return secondaryPhoneNumber;
    }

    public String getStoreNumber()
    {
        return storeNumber;
    }

    public String getType()
    {
        return type;
    }

    public boolean isStore()
    {
        return store;
    }

    public void setAddressLineThree(String s)
    {
        addressLineThree = s;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setProvince(String s)
    {
        province = s;
    }

    public void setSecondaryPhoneNumber(String s)
    {
        secondaryPhoneNumber = s;
    }

    public void setStore(boolean flag)
    {
        store = flag;
    }

    public void setStoreNumber(String s)
    {
        storeNumber = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
