// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productfilter.pojo;

import java.io.Serializable;

public class Prices
    implements Serializable
{

    private String max;
    private String min;
    private String type;

    public Prices()
    {
    }

    public String getMax()
    {
        return max;
    }

    public String getMin()
    {
        return min;
    }

    public String getType()
    {
        return type;
    }

    public void setMax(String s)
    {
        max = s;
    }

    public void setMin(String s)
    {
        min = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
