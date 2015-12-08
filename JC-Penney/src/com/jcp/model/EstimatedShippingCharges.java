// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;

import java.io.Serializable;

public class EstimatedShippingCharges
    implements Serializable
{

    private double charge;
    private String duration;
    private String message;
    private String selected;
    private String type;

    public EstimatedShippingCharges()
    {
    }

    public double getCharge()
    {
        return charge;
    }

    public String getDuration()
    {
        return duration;
    }

    public String getMessage()
    {
        return message;
    }

    public String getSelected()
    {
        return selected;
    }

    public String getType()
    {
        return type;
    }

    public void setCharge(double d)
    {
        charge = d;
    }

    public void setDuration(String s)
    {
        duration = s;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setSelected(String s)
    {
        selected = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
