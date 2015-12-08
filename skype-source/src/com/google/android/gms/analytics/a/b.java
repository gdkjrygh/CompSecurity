// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.a;

import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.jc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b
{

    Map a;

    public b(String s)
    {
        a = new HashMap();
        a("&pa", s);
    }

    private void a(String s, String s1)
    {
        y.a(s, "Name should be non-null");
        a.put(s, s1);
    }

    public final b a(double d1)
    {
        a("&tr", Double.toString(d1));
        return this;
    }

    public final b a(int i)
    {
        a("&cos", Integer.toString(i));
        return this;
    }

    public final b a(String s)
    {
        a("&ti", s);
        return this;
    }

    public final Map a()
    {
        return new HashMap(a);
    }

    public final b b(double d1)
    {
        a("&tt", Double.toString(d1));
        return this;
    }

    public final b b(String s)
    {
        a("&ta", s);
        return this;
    }

    public final b c(double d1)
    {
        a("&ts", Double.toString(d1));
        return this;
    }

    public final b c(String s)
    {
        a("&tcc", s);
        return this;
    }

    public final b d(String s)
    {
        a("&col", s);
        return this;
    }

    public final b e(String s)
    {
        a("&pal", s);
        return this;
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((String)entry.getKey()).startsWith("&"))
            {
                hashmap.put(((String)entry.getKey()).substring(1), entry.getValue());
            } else
            {
                hashmap.put(entry.getKey(), entry.getValue());
            }
        }

        return jc.a(hashmap);
    }
}
