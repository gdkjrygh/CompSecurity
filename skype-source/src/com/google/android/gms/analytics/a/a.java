// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.a;

import com.google.android.gms.analytics.j;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.jc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a
{

    Map a;

    public a()
    {
        a = new HashMap();
    }

    private void a(String s, String s1)
    {
        y.a(s, "Name should be non-null");
        a.put(s, s1);
    }

    public final a a(double d1)
    {
        a("pr", Double.toString(d1));
        return this;
    }

    public final a a(int i)
    {
        a("ps", Integer.toString(i));
        return this;
    }

    public final a a(int i, int k)
    {
        a(j.k(i), Integer.toString(k));
        return this;
    }

    public final a a(int i, String s)
    {
        a(j.j(i), s);
        return this;
    }

    public final a a(String s)
    {
        a("id", s);
        return this;
    }

    public final a b(int i)
    {
        a("qt", Integer.toString(i));
        return this;
    }

    public final a b(String s)
    {
        a("nm", s);
        return this;
    }

    public final a c(String s)
    {
        a("br", s);
        return this;
    }

    public final a d(String s)
    {
        a("ca", s);
        return this;
    }

    public final a e(String s)
    {
        a("va", s);
        return this;
    }

    public final a f(String s)
    {
        a("cc", s);
        return this;
    }

    public final Map g(String s)
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append(s).append((String)entry.getKey()).toString(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return hashmap;
    }

    public final String toString()
    {
        return jc.a(a);
    }
}
