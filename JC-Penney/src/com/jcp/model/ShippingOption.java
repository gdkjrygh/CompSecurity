// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;


public class ShippingOption
{

    private Double charge;
    private String duration;
    private String message;
    private Boolean selected;
    private String type;

    public ShippingOption()
    {
    }

    public Double getCharge()
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

    public Boolean getSelected()
    {
        return selected;
    }

    public String getType()
    {
        return type;
    }

    public void setCharge(Double double1)
    {
        charge = double1;
    }

    public void setDuration(String s)
    {
        duration = s;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setSelected(Boolean boolean1)
    {
        selected = boolean1;
    }

    public void setType(String s)
    {
        type = s;
    }
}
