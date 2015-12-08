// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.model.rewards;


public class Certificate
{

    private static final String TAG = com/jcp/model/rewards/Certificate.getName();
    private Double amount;
    private String amountType;
    private String barcode;
    private String code;
    private Integer daysLeft;
    private String description;
    private String expires;
    private boolean isApplied;
    private boolean isOpen;
    private String promoId;
    private String serialNumber;
    private String type;

    public Certificate()
    {
    }

    public Double getAmount()
    {
        return amount;
    }

    public String getAmountType()
    {
        return amountType;
    }

    public String getBarcode()
    {
        return barcode;
    }

    public String getCode()
    {
        return code;
    }

    public Integer getDaysLeft()
    {
        return daysLeft;
    }

    public String getDescription()
    {
        return description;
    }

    public String getExpires()
    {
        return expires;
    }

    public String getPromoId()
    {
        return promoId;
    }

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public String getType()
    {
        return type;
    }

    public boolean isApplied()
    {
        return isApplied;
    }

    public boolean isOpen()
    {
        return isOpen;
    }

    public void setAmount(Double double1)
    {
        amount = double1;
    }

    public void setAmountType(String s)
    {
        amountType = s;
    }

    public void setBarcode(String s)
    {
        barcode = s;
    }

    public void setCode(String s)
    {
        code = s;
    }

    public void setDaysLeft(Integer integer)
    {
        daysLeft = integer;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setExpires(String s)
    {
        expires = s;
    }

    public void setIsApplied(boolean flag)
    {
        isApplied = flag;
    }

    public void setOpen(boolean flag)
    {
        isOpen = flag;
    }

    public void setPromoId(String s)
    {
        promoId = s;
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
