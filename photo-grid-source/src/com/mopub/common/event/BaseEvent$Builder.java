// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;

import com.mopub.common.Preconditions;

// Referenced classes of package com.mopub.common.event:
//            BaseEvent

public abstract class s
{

    private tegory a;
    private tegory b;
    private  c;
    private ct d;
    private String e;
    private String f;
    private String g;
    private String h;
    private Double i;
    private Double j;
    private Double k;
    private Double l;
    private Double m;
    private Double n;
    private String o;
    private Integer p;
    private String q;
    private Integer r;
    private double s;

    static tegory a(s s1)
    {
        return s1.a;
    }

    static a b(a a1)
    {
        return a1.b;
    }

    static  c(b b1)
    {
        return b1.c;
    }

    static ct d(c c1)
    {
        return c1.d;
    }

    static String e(d d1)
    {
        return d1.e;
    }

    static String f(e e1)
    {
        return e1.f;
    }

    static String g(f f1)
    {
        return f1.g;
    }

    static String h(g g1)
    {
        return g1.h;
    }

    static Double i(h h1)
    {
        return h1.i;
    }

    static Double j(i i1)
    {
        return i1.j;
    }

    static Double k(j j1)
    {
        return j1.k;
    }

    static Double l(k k1)
    {
        return k1.l;
    }

    static Double m(l l1)
    {
        return l1.m;
    }

    static Double n(m m1)
    {
        return m1.n;
    }

    static String o(n n1)
    {
        return n1.o;
    }

    static Integer p(o o1)
    {
        return o1.p;
    }

    static String q(p p1)
    {
        return p1.q;
    }

    static Integer r(q q1)
    {
        return q1.r;
    }

    static double s(r r1)
    {
        return r1.s;
    }

    public abstract BaseEvent build();

    public s withAdCreativeId(String s1)
    {
        f = s1;
        return this;
    }

    public f withAdHeightPx(Double double1)
    {
        j = double1;
        return this;
    }

    public j withAdNetworkType(String s1)
    {
        h = s1;
        return this;
    }

    public h withAdType(String s1)
    {
        g = s1;
        return this;
    }

    public g withAdUnitId(String s1)
    {
        e = s1;
        return this;
    }

    public e withAdWidthPx(Double double1)
    {
        i = double1;
        return this;
    }

    public i withGeoAccuracy(Double double1)
    {
        m = double1;
        return this;
    }

    public m withGeoLat(Double double1)
    {
        k = double1;
        return this;
    }

    public k withGeoLon(Double double1)
    {
        l = double1;
        return this;
    }

    public l withPerformanceDurationMs(Double double1)
    {
        n = double1;
        return this;
    }

    public n withRequestId(String s1)
    {
        o = s1;
        return this;
    }

    public o withRequestRetries(Integer integer)
    {
        r = integer;
        return this;
    }

    public r withRequestStatusCode(Integer integer)
    {
        p = integer;
        return this;
    }

    public p withRequestUri(String s1)
    {
        q = s1;
        return this;
    }

    public ct withSdkProduct(ct ct)
    {
        d = ct;
        return this;
    }

    public (tegory tegory, tegory tegory1,  , double d1)
    {
        Preconditions.checkNotNull(tegory);
        Preconditions.checkNotNull(tegory1);
        Preconditions.checkNotNull();
        boolean flag;
        if (d1 >= 0.0D && d1 <= 1.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        a = tegory;
        b = tegory1;
        c = ;
        s = d1;
    }
}
