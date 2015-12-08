// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import me.lyft.android.common.INullable;
import me.lyft.android.common.Objects;

public class Pricing
    implements INullable
{

    Integer dynamicPricing;
    String minimum;
    String perMile;
    String perMinute;
    String pickup;

    public Pricing()
    {
    }

    public static Pricing empty()
    {
        return NullPricing.getInstance();
    }

    public Integer getDynamicPricing()
    {
        return (Integer)Objects.firstNonNull(dynamicPricing, Integer.valueOf(0));
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

    public boolean isNull()
    {
        return false;
    }

    public boolean isPrimeTime()
    {
        return getDynamicPricing().intValue() > 0;
    }

    public void setDynamicPricing(Integer integer)
    {
        dynamicPricing = integer;
    }

    public void setMinimum(String s)
    {
        minimum = s;
    }

    public void setPerMile(String s)
    {
        perMile = s;
    }

    public void setPerMinute(String s)
    {
        perMinute = s;
    }

    public void setPickup(String s)
    {
        pickup = s;
    }

    private class NullPricing extends Pricing
    {

        private static final Pricing INSTANCE = new NullPricing();

        static Pricing getInstance()
        {
            return INSTANCE;
        }

        public boolean isNull()
        {
            return true;
        }


        NullPricing()
        {
        }
    }

}
