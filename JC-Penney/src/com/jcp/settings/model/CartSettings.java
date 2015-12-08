// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.settings.model;


public class CartSettings
{

    private String maxCouponsPromotional;
    private String maxCouponsShipping;
    private String maxRewardsCount;

    public CartSettings()
    {
        maxCouponsPromotional = null;
        maxCouponsShipping = null;
        maxRewardsCount = null;
    }

    public String getMaxCouponsPromotional()
    {
        return maxCouponsPromotional;
    }

    public String getMaxCouponsShipping()
    {
        return maxCouponsShipping;
    }

    public String getMaxRewardsCount()
    {
        return maxRewardsCount;
    }

    public void setMaxCouponsPromotional(String s)
    {
        maxCouponsPromotional = s;
    }

    public void setMaxCouponsShipping(String s)
    {
        maxCouponsShipping = s;
    }

    public void setMaxRewardsCount(String s)
    {
        maxRewardsCount = s;
    }
}
