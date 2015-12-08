// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import java.util.HashMap;

public abstract class LabsProductOption
{

    public static final String LEFT_PART = "1/2";
    public static final double QUANTITY_DEFAULT = -1D;
    public static final double QUANTITY_DOUBLE = 2D;
    public static final double QUANTITY_EXTRA = 1.5D;
    public static final double QUANTITY_LIGHT = 0.5D;
    public static final double QUANTITY_NONE = 0D;
    public static final double QUANTITY_NORMAL = 1D;
    public static final double QUANTITY_TRIPLE = 3D;
    public static final String RIGHT_PART = "2/2";
    public static final String WHOLE_PART = "1/1";
    protected HashMap options;

    public LabsProductOption()
    {
    }

    public abstract String getCode();

    protected HashMap getOptionMap()
    {
        return options;
    }

    public double getQuantityForPart(String s)
    {
        if (options == null)
        {
            reset();
        }
        return ((Double)options.get(s)).doubleValue();
    }

    public void reset()
    {
        options = new HashMap();
        options.put("1/1", Double.valueOf(0.0D));
        options.put("1/2", Double.valueOf(0.0D));
        options.put("2/2", Double.valueOf(0.0D));
    }

    public abstract void setCode(String s);

    public abstract void setOptions(HashMap hashmap);

    public void setQuantityForPart(String s, double d)
    {
        if (options == null)
        {
            reset();
        }
        options.put(s, Double.valueOf(d));
    }
}
