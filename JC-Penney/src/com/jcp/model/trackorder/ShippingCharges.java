// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.trackorder;

import java.io.Serializable;

public class ShippingCharges
    implements Serializable
{

    private String charge;
    private String type;

    public ShippingCharges()
    {
    }

    public String getCharge()
    {
        return charge;
    }

    public String getType()
    {
        return type;
    }
}
