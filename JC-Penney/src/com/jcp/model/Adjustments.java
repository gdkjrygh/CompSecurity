// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;

import java.io.Serializable;

// Referenced classes of package com.jcp.model:
//            CouponIneligibleItems

public class Adjustments
    implements Serializable
{

    private double amount;
    private String code;
    private String coupontype;
    private String description;
    private String id;
    private CouponIneligibleItems ineligibleItems[];
    private String message;
    private String serialNumber;
    private String subType;
    private String token;
    private String type;

    public Adjustments()
    {
    }

    public double getAmount()
    {
        return amount;
    }

    public String getCode()
    {
        return code;
    }

    public String getCoupontype()
    {
        return coupontype;
    }

    public String getDescription()
    {
        return description;
    }

    public String getId()
    {
        return id;
    }

    public CouponIneligibleItems[] getIneligibleItems()
    {
        return ineligibleItems;
    }

    public String getMessage()
    {
        return message;
    }

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public String getSubType()
    {
        return subType;
    }

    public String getToken()
    {
        return token;
    }

    public String getType()
    {
        return type;
    }

    public void setAmount(double d)
    {
        amount = d;
    }

    public void setCode(String s)
    {
        code = s;
    }

    public void setCoupontype(String s)
    {
        coupontype = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setIneligibleItems(CouponIneligibleItems acouponineligibleitems[])
    {
        ineligibleItems = acouponineligibleitems;
    }

    public void setMessage(String s)
    {
        message = s;
    }

    public void setSerialNumber(String s)
    {
        serialNumber = s;
    }

    public void setSubType(String s)
    {
        subType = s;
    }

    public void setToken(String s)
    {
        token = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
