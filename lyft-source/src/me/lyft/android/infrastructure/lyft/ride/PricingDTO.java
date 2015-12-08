// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;


public class PricingDTO
{

    public final Integer dynamicPricing;
    public final String minimum;
    public final String perMile;
    public final String perMinute;
    public final String pickup;

    public PricingDTO(Integer integer, String s, String s1, String s2, String s3)
    {
        dynamicPricing = integer;
        minimum = s;
        pickup = s1;
        perMile = s2;
        perMinute = s3;
    }

    public Integer getDynamicPricing()
    {
        return dynamicPricing;
    }

    public String getMinimum()
    {
        return minimum;
    }

    public String getPerMile()
    {
        return perMile;
    }

    public String getPerMinute()
    {
        return perMinute;
    }

    public String getPickup()
    {
        return pickup;
    }
}
