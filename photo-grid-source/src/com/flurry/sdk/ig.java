// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.flurry.sdk:
//            kn, ik, ih, in

public class ig extends kn
{

    private static final String c = com/flurry/sdk/ig.getName();
    public ArrayList a;
    public ik b;
    private final int d = 1000;
    private final int e = 30000;
    private final long f;
    private final int g;
    private final int h;
    private final in i;
    private final Map j;
    private long k;
    private int l;
    private int m;
    private String n;
    private String o;
    private boolean p;

    public ig(String s, long l1, String s1, long l2, int i1, 
            int j1, in in, Map map, int k1, int i2, String s2)
    {
        a(s1);
        a(l2);
        a_();
        o = s;
        f = l1;
        c(i1);
        g = i1;
        h = j1;
        i = in;
        j = map;
        l = k1;
        m = i2;
        n = s2;
        k = 30000L;
        a = new ArrayList();
    }

    static long a(ig ig1, long l1)
    {
        ig1.k = l1;
        return l1;
    }

    static String a(ig ig1)
    {
        return ig1.o;
    }

    static boolean a(ig ig1, boolean flag)
    {
        ig1.p = flag;
        return flag;
    }

    static long b(ig ig1)
    {
        return ig1.f;
    }

    static int c(ig ig1)
    {
        return ig1.g;
    }

    static int d(ig ig1)
    {
        return ig1.h;
    }

    static in e(ig ig1)
    {
        return ig1.i;
    }

    static Map f(ig ig1)
    {
        return ig1.j;
    }

    static long g(ig ig1)
    {
        return ig1.k;
    }

    static int h(ig ig1)
    {
        return ig1.l;
    }

    static int i(ig ig1)
    {
        return ig1.m;
    }

    static String j(ig ig1)
    {
        return ig1.n;
    }

    static boolean k(ig ig1)
    {
        return ig1.p;
    }

    public void a(ih ih1)
    {
        a.add(ih1);
    }

    public void a(ik ik1)
    {
        b = ik1;
    }

    public void a(boolean flag)
    {
        p = flag;
    }

    public boolean a(int i1)
    {
        return i1 > h;
    }

    public void a_()
    {
        super.a_();
        if (super.r() != 1)
        {
            k = k * 3L;
        }
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        b.g();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean c()
    {
        return r() >= g;
    }

    public long e()
    {
        return f;
    }

    public in f()
    {
        return i;
    }

    public long g()
    {
        return k;
    }

    public Map h()
    {
        return j;
    }

    public String i()
    {
        return o;
    }

    public int j()
    {
        return l;
    }

    public int k()
    {
        return m;
    }

    public String l()
    {
        return n;
    }

    public String m()
    {
        return b.c();
    }

    public boolean n()
    {
        return p;
    }

    public void o()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ((ih)iterator.next()).l = this;
        }

    }

}
