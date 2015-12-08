// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws;

import com.amazonaws.c.a;
import com.amazonaws.c.b;
import com.amazonaws.util.y;
import java.net.InetAddress;

// Referenced classes of package com.amazonaws:
//            Protocol

public class d
{

    public static final int a = 15000;
    public static final int b = 15000;
    public static final int c = 10;
    public static final String d = com.amazonaws.util.y.c();
    public static final b e;
    public static final boolean f = true;
    private String g;
    private int h;
    private b i;
    private InetAddress j;
    private Protocol k;
    private String l;
    private int m;
    private String n;
    private String o;
    private String p;
    private String q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private String y;

    public d()
    {
        g = d;
        h = -1;
        i = e;
        k = com.amazonaws.Protocol.b;
        l = null;
        m = -1;
        n = null;
        o = null;
        p = null;
        q = null;
        s = 10;
        t = 15000;
        u = 15000;
        v = 0;
        w = 0;
        x = true;
    }

    public d(d d1)
    {
        g = d;
        h = -1;
        i = e;
        k = com.amazonaws.Protocol.b;
        l = null;
        m = -1;
        n = null;
        o = null;
        p = null;
        q = null;
        s = 10;
        t = 15000;
        u = 15000;
        v = 0;
        w = 0;
        x = true;
        u = d1.u;
        s = d1.s;
        h = d1.h;
        i = d1.i;
        j = d1.j;
        k = d1.k;
        p = d1.p;
        l = d1.l;
        o = d1.o;
        m = d1.m;
        n = d1.n;
        q = d1.q;
        r = d1.r;
        t = d1.t;
        g = d1.g;
        x = d1.x;
        w = d1.w;
        v = d1.v;
        y = d1.y;
    }

    public Protocol a()
    {
        return k;
    }

    public void a(int i1)
    {
        s = i1;
    }

    public void a(int i1, int j1)
    {
        v = i1;
        w = j1;
    }

    public void a(Protocol protocol)
    {
        k = protocol;
    }

    public void a(b b1)
    {
        i = b1;
    }

    public void a(Boolean boolean1)
    {
        r = boolean1.booleanValue();
    }

    public void a(String s1)
    {
        g = s1;
    }

    public void a(InetAddress inetaddress)
    {
        j = inetaddress;
    }

    public void a(boolean flag)
    {
        x = flag;
    }

    public int b()
    {
        return s;
    }

    public d b(int i1)
    {
        a(i1);
        return this;
    }

    public d b(int i1, int j1)
    {
        a(i1, j1);
        return this;
    }

    public d b(Protocol protocol)
    {
        a(protocol);
        return this;
    }

    public d b(b b1)
    {
        a(b1);
        return this;
    }

    public d b(String s1)
    {
        a(s1);
        return this;
    }

    public d b(InetAddress inetaddress)
    {
        a(inetaddress);
        return this;
    }

    public d b(boolean flag)
    {
        a(flag);
        return this;
    }

    public d c(boolean flag)
    {
        a(Boolean.valueOf(flag));
        return this;
    }

    public String c()
    {
        return g;
    }

    public void c(int i1)
    {
        m = i1;
    }

    public void c(String s1)
    {
        l = s1;
    }

    public d d(int i1)
    {
        c(i1);
        return this;
    }

    public d d(String s1)
    {
        c(s1);
        return this;
    }

    public InetAddress d()
    {
        return j;
    }

    public String e()
    {
        return l;
    }

    public void e(int i1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException("maxErrorRetry shoud be non-negative");
        } else
        {
            h = i1;
            return;
        }
    }

    public void e(String s1)
    {
        n = s1;
    }

    public int f()
    {
        return m;
    }

    public d f(int i1)
    {
        e(i1);
        return this;
    }

    public d f(String s1)
    {
        e(s1);
        return this;
    }

    public String g()
    {
        return n;
    }

    public void g(int i1)
    {
        t = i1;
    }

    public void g(String s1)
    {
        o = s1;
    }

    public d h(int i1)
    {
        g(i1);
        return this;
    }

    public d h(String s1)
    {
        g(s1);
        return this;
    }

    public String h()
    {
        return o;
    }

    public String i()
    {
        return p;
    }

    public void i(int i1)
    {
        u = i1;
    }

    public void i(String s1)
    {
        p = s1;
    }

    public d j(int i1)
    {
        i(i1);
        return this;
    }

    public d j(String s1)
    {
        i(s1);
        return this;
    }

    public String j()
    {
        return q;
    }

    public b k()
    {
        return i;
    }

    public void k(String s1)
    {
        q = s1;
    }

    public int l()
    {
        return h;
    }

    public d l(String s1)
    {
        k(s1);
        return this;
    }

    public int m()
    {
        return t;
    }

    public void m(String s1)
    {
        y = s1;
    }

    public int n()
    {
        return u;
    }

    public d n(String s1)
    {
        m(s1);
        return this;
    }

    public boolean o()
    {
        return x;
    }

    public int[] p()
    {
        return (new int[] {
            v, w
        });
    }

    public String q()
    {
        return y;
    }

    public boolean r()
    {
        return r;
    }

    static 
    {
        e = a.b;
    }
}
