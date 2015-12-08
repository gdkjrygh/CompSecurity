// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.dto;

import com.dominos.android.sdk.core.models.LabsAddress;

public class Store
{

    private LabsAddress address;
    private String carryoutServiceHours;
    private String deliveryServiceHours;

    public Store()
    {
    }

    public LabsAddress getAddress()
    {
        return address;
    }

    public String getCarryoutServiceHours()
    {
        return carryoutServiceHours;
    }

    public String getDeliveryServiceHours()
    {
        return deliveryServiceHours;
    }

    public void setAddress(LabsAddress labsaddress)
    {
        address = labsaddress;
    }

    public void setCarryoutServiceHours(String s)
    {
        carryoutServiceHours = s;
    }

    public void setDeliveryServiceHours(String s)
    {
        deliveryServiceHours = s;
    }
}
