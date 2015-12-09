// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productlistentity;

import java.io.Serializable;

public class ProductListPriceEntity
    implements Serializable
{

    private double max;
    private double maxPercentOff;
    private double min;
    private double minPercentOff;
    private String type;

    public ProductListPriceEntity()
    {
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

    public String getType()
    {
        return type;
    }

    public void setMax(double d)
    {
        max = d;
    }

    public void setMaxPercentOff(double d)
    {
        maxPercentOff = d;
    }

    public void setMin(double d)
    {
        min = d;
    }

    public void setMinPercentOff(double d)
    {
        minPercentOff = d;
    }

    public void setType(String s)
    {
        type = s;
    }
}
