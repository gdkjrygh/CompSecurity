// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.trackorder;

import java.io.Serializable;

public class Charges
    implements Serializable
{

    private String amount;
    private String description;
    private String name;

    public Charges()
    {
    }

    public String getAmount()
    {
        return amount;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public void setAmount(String s)
    {
        amount = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setName(String s)
    {
        name = s;
    }
}
