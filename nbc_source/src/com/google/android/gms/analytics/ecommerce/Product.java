// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzc;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zznq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Product
{

    Map zzJj;

    public Product()
    {
        zzJj = new HashMap();
    }

    void put(String s, String s1)
    {
        zzu.zzb(s, "Name should be non-null");
        zzJj.put(s, s1);
    }

    public Product setBrand(String s)
    {
        put("br", s);
        return this;
    }

    public Product setCategory(String s)
    {
        put("ca", s);
        return this;
    }

    public Product setCouponCode(String s)
    {
        put("cc", s);
        return this;
    }

    public Product setCustomDimension(int i, String s)
    {
        put(zzc.zzY(i), s);
        return this;
    }

    public Product setCustomMetric(int i, int j)
    {
        put(zzc.zzZ(i), Integer.toString(j));
        return this;
    }

    public Product setId(String s)
    {
        put("id", s);
        return this;
    }

    public Product setName(String s)
    {
        put("nm", s);
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

    public Product setVariant(String s)
    {
        put("va", s);
        return this;
    }

    public String toString()
    {
        return zznq.zzD(zzJj);
    }

    public Map zzaQ(String s)
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = zzJj.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append(s).append((String)entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return hashmap;
    }
}
