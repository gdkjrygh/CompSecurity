// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.trackorder;

import java.io.Serializable;

public class Price
    implements Serializable
{

    private String active;
    private double amount;
    private String type;

    public Price()
    {
    }

    public String getActive()
    {
        return active;
    }

    public double getAmount()
    {
        return amount;
    }

    public String getType()
    {
        return type;
    }
}
