// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

// Referenced classes of package com.mopub.network:
//            AdResponse

public class s
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
    private Integer j;
    private Integer k;
    private Integer l;
    private Integer m;
    private String n;
    private boolean o;
    private String p;
    private JSONObject q;
    private String r;
    private Map s;

    static String a(s s1)
    {
        return s1.a;
    }

    static String b(a a1)
    {
        return a1.b;
    }

    static String c(b b1)
    {
        return b1.c;
    }

    static String d(c c1)
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

    static String i(h h1)
    {
        return h1.i;
    }

    static Integer j(i i1)
    {
        return i1.j;
    }

    static Integer k(j j1)
    {
        return j1.k;
    }

    static Integer l(k k1)
    {
        return k1.l;
    }

    static Integer m(l l1)
    {
        return l1.m;
    }

    static String n(m m1)
    {
        return m1.n;
    }

    static boolean o(n n1)
    {
        return n1.o;
    }

    static String p(o o1)
    {
        return o1.p;
    }

    static JSONObject q(p p1)
    {
        return p1.q;
    }

    static String r(q q1)
    {
        return q1.r;
    }

    static Map s(r r1)
    {
        return r1.s;
    }

    public AdResponse build()
    {
        return new AdResponse(this, (byte)0);
    }

    public s setAdTimeoutDelayMilliseconds(Integer integer)
    {
        l = integer;
        return this;
    }

    public l setAdType(String s1)
    {
        a = s1;
        return this;
    }

    public a setAdUnitId(String s1)
    {
        b = s1;
        return this;
    }

    public b setClickTrackingUrl(String s1)
    {
        f = s1;
        return this;
    }

    public f setCustomEventClassName(String s1)
    {
        r = s1;
        return this;
    }

    public r setDimensions(Integer integer, Integer integer1)
    {
        j = integer;
        k = integer1;
        return this;
    }

    public k setDspCreativeId(String s1)
    {
        n = s1;
        return this;
    }

    public n setFailoverUrl(String s1)
    {
        h = s1;
        return this;
    }

    public h setFullAdType(String s1)
    {
        c = s1;
        return this;
    }

    public c setImpressionTrackingUrl(String s1)
    {
        g = s1;
        return this;
    }

    public g setJsonBody(JSONObject jsonobject)
    {
        q = jsonobject;
        return this;
    }

    public q setNetworkType(String s1)
    {
        d = s1;
        return this;
    }

    public d setRedirectUrl(String s1)
    {
        e = s1;
        return this;
    }

    public e setRefreshTimeMilliseconds(Integer integer)
    {
        m = integer;
        return this;
    }

    public m setRequestId(String s1)
    {
        i = s1;
        return this;
    }

    public i setResponseBody(String s1)
    {
        p = s1;
        return this;
    }

    public p setScrollable(Boolean boolean1)
    {
        boolean flag;
        if (boolean1 == null)
        {
            flag = o;
        } else
        {
            flag = boolean1.booleanValue();
        }
        o = flag;
        return this;
    }

    public o setServerExtras(Map map)
    {
        if (map == null)
        {
            s = new TreeMap();
            return this;
        } else
        {
            s = new TreeMap(map);
            return this;
        }
    }

    public ()
    {
        o = false;
        s = new TreeMap();
    }
}
