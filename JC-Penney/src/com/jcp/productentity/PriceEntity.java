// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;
import java.math.BigDecimal;

public class PriceEntity
    implements Serializable
{

    public static final int TWO_SCALE = 2;
    private static final long serialVersionUID = 1L;
    private String marketingLabel;
    private double max;
    private double maxPercentOff;
    private double min;
    private double minPercentOff;
    private String strMax;
    private String strMin;
    private String type;

    public PriceEntity()
    {
    }

    public String getMarketingLabel()
    {
        return marketingLabel;
    }

    public double getMax()
    {
        return max;
    }

    public double getMaxPercentOff()
    {
        return maxPercentOff;
    }

    public double getMin()
    {
        return min;
    }

    public double getMinPercentOff()
    {
        return minPercentOff;
    }

    public String getStrMax()
    {
        return strMax;
    }

    public String getStrMin()
    {
        return strMin;
    }

    public String getType()
    {
        return type;
    }

    public void setMarketingLabel(String s)
    {
        marketingLabel = s;
    }

    public void setMax(double d)
    {
        strMax = (new BigDecimal(d)).setScale(2, 4).toPlainString();
        max = d;
    }

    public void setMaxPercentOff(double d)
    {
        maxPercentOff = d;
    }

    public void setMin(double d)
    {
        strMin = (new BigDecimal(d)).setScale(2, 4).toPlainString();
        min = d;
    }

    public void setMinPercentOff(double d)
    {
        minPercentOff = d;
    }

    public void setStrMax(String s)
    {
        strMax = s;
    }

    public void setStrMin(String s)
    {
        strMin = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
