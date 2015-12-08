// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.trackorder;

import java.io.Serializable;

public class Options
    implements Serializable
{

    private float charge;
    private String duration;
    private String estimatedDeliveryMsg;
    private String holidayShipping;
    private String message;
    private String selected;
    private String type;

    public Options()
    {
    }

    public float getCharge()
    {
        return charge;
    }

    public String getDuration()
    {
        return duration;
    }

    public String getEstimatedDeliveryMsg()
    {
        return estimatedDeliveryMsg;
    }

    public String getHolidayShipping()
    {
        return holidayShipping;
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

    public void setCharge(float f)
    {
        charge = f;
    }

    public void setDuration(String s)
    {
        duration = s;
    }

    public void setEstimatedDeliveryMsg(String s)
    {
        estimatedDeliveryMsg = s;
    }

    public void setHolidayShipping(String s)
    {
        holidayShipping = s;
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
