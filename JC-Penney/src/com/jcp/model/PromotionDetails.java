// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model;


// Referenced classes of package com.jcp.model:
//            CouponIneligibleItems

public class PromotionDetails
{

    private double amount;
    private String caption;
    private String code;
    private String description;
    private String id;
    private CouponIneligibleItems ineligibleItems[];
    private String message;
    private String serialNumber;
    private String type;

    public PromotionDetails()
    {
    }

    public double getAmount()
    {
        return amount;
    }

    public String getCaption()
    {
        return caption;
    }

    public String getCode()
    {
        return code;
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

    public String getType()
    {
        return type;
    }

    public void setAmount(double d)
    {
        amount = d;
    }

    public void setCaption(String s)
    {
        caption = s;
    }

    public void setCode(String s)
    {
        code = s;
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

    public void setType(String s)
    {
        type = s;
    }
}
