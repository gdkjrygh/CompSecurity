// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.common.internal.zzx;
import java.util.HashMap;
import java.util.Map;

public class ProductAction
{

    Map zzFz;

    public ProductAction(String s)
    {
        zzFz = new HashMap();
        put("&pa", s);
    }

    public Map build()
    {
        return new HashMap(zzFz);
    }

    void put(String s, String s1)
    {
        zzx.zzb(s, "Name should be non-null");
        zzFz.put(s, s1);
    }

    public ProductAction setCheckoutOptions(String s)
    {
        put("&col", s);
        return this;
    }

    public ProductAction setCheckoutStep(int i)
    {
        put("&cos", Integer.toString(i));
        return this;
    }

    public ProductAction setProductActionList(String s)
    {
        put("&pal", s);
        return this;
    }

    public ProductAction setTransactionAffiliation(String s)
    {
        put("&ta", s);
        return this;
    }

    public ProductAction setTransactionCouponCode(String s)
    {
        put("&tcc", s);
        return this;
    }

    public ProductAction setTransactionId(String s)
    {
        put("&ti", s);
        return this;
    }

    public ProductAction setTransactionRevenue(double d)
    {
        put("&tr", Double.toString(d));
        return this;
    }

    public ProductAction setTransactionShipping(double d)
    {
        put("&ts", Double.toString(d));
        return this;
    }

    public ProductAction setTransactionTax(double d)
    {
        put("&tt", Double.toString(d));
        return this;
    }
}
