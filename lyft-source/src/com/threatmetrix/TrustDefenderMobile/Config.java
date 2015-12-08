// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            BaseConfig, EndNotifierBase

public class Config extends BaseConfig
{

    private int a;
    private String b;
    private EndNotifierBase c;
    private boolean d;
    private long e;
    private long f;
    private int g;
    private int h;
    private Context i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;

    public Config()
    {
        a = 30;
        b = null;
        c = null;
        d = false;
        e = 0xdbba0L;
        f = 0x36ee80L;
        g = 1;
        h = 64766;
        i = null;
        j = 0;
        k = 10000;
        l = 0;
        m = 30000;
        n = true;
        o = false;
        p = false;
        q = false;
        r = false;
        s = "h.online-metrix.net";
        t = true;
    }

    public Config a(Context context)
    {
        i = context;
        return this;
    }

    public Config a(EndNotifierBase endnotifierbase)
    {
        c = endnotifierbase;
        return this;
    }

    public Config a(boolean flag)
    {
        d = flag;
        return this;
    }

    boolean a()
    {
        return t;
    }

    boolean b()
    {
        return r;
    }

    boolean c()
    {
        return q;
    }

    int d()
    {
        return a;
    }

    String e()
    {
        return b;
    }

    EndNotifierBase f()
    {
        return c;
    }

    boolean g()
    {
        return d;
    }

    long h()
    {
        return e;
    }

    long i()
    {
        return f;
    }

    int j()
    {
        return g;
    }

    int k()
    {
        int j1 = h;
        int i1 = j1;
        if (o)
        {
            i1 = j1 & 0xffffffd9;
        }
        j1 = i1;
        if (p)
        {
            j1 = i1 & 0xffffcfff;
        }
        return j1;
    }

    Context l()
    {
        return i;
    }

    int m()
    {
        return j;
    }

    int n()
    {
        return k;
    }

    int o()
    {
        return l;
    }

    int p()
    {
        return m;
    }

    boolean q()
    {
        return n;
    }

    String r()
    {
        return s;
    }
}
