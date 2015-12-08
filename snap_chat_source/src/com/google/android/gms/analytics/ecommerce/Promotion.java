// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.common.internal.zzx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Promotion
{

    Map zzFz;

    public Promotion()
    {
        zzFz = new HashMap();
    }

    void put(String s, String s1)
    {
        zzx.zzb(s, "Name should be non-null");
        zzFz.put(s, s1);
    }

    public Promotion setCreative(String s)
    {
        put("cr", s);
        return this;
    }

    public Promotion setId(String s)
    {
        put("id", s);
        return this;
    }

    public Promotion setName(String s)
    {
        put("nm", s);
        return this;
    }

    public Promotion setPosition(String s)
    {
        put("ps", s);
        return this;
    }

    public Map zzaw(String s)
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = zzFz.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append(s).append((String)entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return hashmap;
    }
}
