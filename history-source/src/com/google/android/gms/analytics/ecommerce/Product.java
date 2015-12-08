// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.s;
import com.google.android.gms.internal.jx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Product
{

    Map CD;

    public Product()
    {
        CD = new HashMap();
    }

    public Map aq(String s1)
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = CD.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append(s1).append((String)entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return hashmap;
    }

    void put(String s1, String s2)
    {
        jx.b(s1, "Name should be non-null");
        CD.put(s1, s2);
    }

    public Product setBrand(String s1)
    {
        put("br", s1);
        return this;
    }

    public Product setCategory(String s1)
    {
        put("ca", s1);
        return this;
    }

    public Product setCouponCode(String s1)
    {
        put("cc", s1);
        return this;
    }

    public Product setCustomDimension(int i, String s1)
    {
        put(s.E(i), s1);
        return this;
    }

    public Product setCustomMetric(int i, int j)
    {
        put(s.F(i), Integer.toString(j));
        return this;
    }

    public Product setId(String s1)
    {
        put("id", s1);
        return this;
    }

    public Product setName(String s1)
    {
        put("nm", s1);
        return this;
    }

    public Product setPosition(int i)
    {
        put("ps", Integer.toString(i));
        return this;
    }

    public Product setPrice(double d)
    {
        put("pr", Double.toString(d));
        return this;
    }

    public Product setQuantity(int i)
    {
        put("qt", Integer.toString(i));
        return this;
    }

    public Product setVariant(String s1)
    {
        put("va", s1);
        return this;
    }
}
