// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import java.util.HashMap;

// Referenced classes of package com.yume.android.sdk:
//            ar, av, k, C

final class aq
{

    int a;
    public av b;
    public k c;
    public String d;
    public ar e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    private String l;
    private String m;
    private int n;
    private int o;
    private HashMap p;
    private String q;
    private String r;
    private String s;

    aq()
    {
        a = -1;
        q = "none";
        s = "none";
        e = ar.a;
        f = false;
        g = false;
        h = false;
        i = false;
        j = false;
        k = false;
    }

    public final String a()
    {
        return l;
    }

    public final void a(int i1)
    {
        n = i1;
    }

    public final void a(int i1, C c1)
    {
        if (p == null)
        {
            p = new HashMap();
        }
        p.put(Integer.valueOf(i1), c1);
    }

    public final void a(String s1)
    {
        l = s1;
    }

    public final String b()
    {
        return m;
    }

    public final void b(int i1)
    {
        o = i1;
    }

    public final void b(String s1)
    {
        m = s1;
    }

    public final int c()
    {
        return n;
    }

    public final void c(String s1)
    {
        q = s1;
    }

    public final int d()
    {
        return o;
    }

    public final void d(String s1)
    {
        s = s1;
    }

    public final String e()
    {
        return q;
    }

    public final void e(String s1)
    {
        r = s1;
    }

    public final String f()
    {
        return s;
    }

    public final String g()
    {
        return r;
    }

    public final HashMap h()
    {
        return p;
    }
}
