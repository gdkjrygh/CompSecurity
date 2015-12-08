// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.a;

import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.jm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class c
{

    Map a;

    public c()
    {
        a = new HashMap();
    }

    public c a(String s)
    {
        a("id", s);
        return this;
    }

    void a(String s, String s1)
    {
        z.a(s, "Name should be non-null");
        a.put(s, s1);
    }

    public c b(String s)
    {
        a("nm", s);
        return this;
    }

    public c c(String s)
    {
        a("cr", s);
        return this;
    }

    public c d(String s)
    {
        a("ps", s);
        return this;
    }

    public Map e(String s)
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append(s).append((String)entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return hashmap;
    }

    public String toString()
    {
        return jm.a(a);
    }
}
