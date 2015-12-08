// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.c.d;
import java.util.HashMap;
import java.util.Map;

public final class wv extends d
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    public wv()
    {
    }

    public final String a()
    {
        return a;
    }

    public final void a(d d1)
    {
        d1 = (wv)d1;
        if (!TextUtils.isEmpty(a))
        {
            d1.a = a;
        }
        if (!TextUtils.isEmpty(b))
        {
            d1.b = b;
        }
        if (!TextUtils.isEmpty(c))
        {
            d1.c = c;
        }
        if (!TextUtils.isEmpty(d))
        {
            d1.d = d;
        }
        if (!TextUtils.isEmpty(e))
        {
            d1.e = e;
        }
        if (!TextUtils.isEmpty(f))
        {
            d1.f = f;
        }
        if (!TextUtils.isEmpty(g))
        {
            d1.g = g;
        }
        if (!TextUtils.isEmpty(h))
        {
            d1.h = h;
        }
        if (!TextUtils.isEmpty(i))
        {
            d1.i = i;
        }
        if (!TextUtils.isEmpty(j))
        {
            d1.j = j;
        }
    }

    public final void a(String s)
    {
        a = s;
    }

    public final String b()
    {
        return b;
    }

    public final void b(String s)
    {
        b = s;
    }

    public final String c()
    {
        return c;
    }

    public final void c(String s)
    {
        c = s;
    }

    public final String d()
    {
        return d;
    }

    public final void d(String s)
    {
        d = s;
    }

    public final String e()
    {
        return e;
    }

    public final void e(String s)
    {
        e = s;
    }

    public final String f()
    {
        return f;
    }

    public final void f(String s)
    {
        f = s;
    }

    public final String g()
    {
        return g;
    }

    public final void g(String s)
    {
        g = s;
    }

    public final String h()
    {
        return h;
    }

    public final void h(String s)
    {
        h = s;
    }

    public final String i()
    {
        return i;
    }

    public final void i(String s)
    {
        i = s;
    }

    public final String j()
    {
        return j;
    }

    public final void j(String s)
    {
        j = s;
    }

    public final String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("name", a);
        hashmap.put("source", b);
        hashmap.put("medium", c);
        hashmap.put("keyword", d);
        hashmap.put("content", e);
        hashmap.put("id", f);
        hashmap.put("adNetworkId", g);
        hashmap.put("gclid", h);
        hashmap.put("dclid", i);
        hashmap.put("aclid", j);
        return a(hashmap);
    }
}
