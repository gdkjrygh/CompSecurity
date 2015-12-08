// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.c.a;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bb, d, a, ac, 
//            g, t, bk

public final class h
    implements bb
{

    public final ac a;
    public final g b;
    public final String c;
    public final com.google.android.m4b.maps.ak.a d;
    public final t e;
    public final int f;
    public final int g;
    public final int h;
    public float i;
    public float j;
    public final com.google.android.m4b.maps.bo.a k[];
    public final bk l;
    public final bk m;
    public final ab.a n[];
    private final int o;
    private final String p;
    private final int q;
    private final int r[];
    private final int s;
    private final String t;
    private final String u;
    private final ab.a v;

    public h(int i1, ac ac, g g1, com.google.android.m4b.maps.ak.a a1, com.google.android.m4b.maps.bo.a aa[], bk bk, bk bk1, 
            ab.a aa1[], String s1, t t1, int j1, String s2, int k1, int l1, 
            int i2, int j2, String s3, String s4, ab.a a2, int ai[])
    {
        i = -1F;
        j = -1F;
        o = i1;
        d = a1;
        k = aa;
        l = bk;
        m = bk1;
        n = aa1;
        p = s1;
        e = t1;
        s = j1;
        t = s2;
        q = k1;
        f = l1;
        i1 = i2;
        if (i2 == -1)
        {
            i1 = 30;
        }
        g = i1;
        h = j2;
        u = s3;
        c = s4;
        v = a2;
        r = ai;
        a = ac;
        b = g1;
    }

    public final int a()
    {
        return 7;
    }

    public final com.google.android.m4b.maps.ak.a b()
    {
        return d;
    }

    public final String c()
    {
        if (d == null)
        {
            return "";
        }
        if (!(d instanceof com.google.android.m4b.maps.ak.a.a))
        {
            return "";
        }
        com.google.android.m4b.maps.ak.a.a a1 = (com.google.android.m4b.maps.ak.a.a)d;
        Object obj = (com.google.android.m4b.maps.cw.a.a)com.google.android.m4b.maps.cw.a.a.n().a(a1.c()).e();
        byte abyte0[] = ((com.google.android.m4b.maps.cw.a.a) (obj)).f();
        com.google.android.m4b.maps.cw.a.a.a a2 = com.google.android.m4b.maps.cw.a.a.n();
        if (((com.google.android.m4b.maps.cw.a.a) (obj)).c())
        {
            a2.a(((com.google.android.m4b.maps.cw.a.a) (obj)).d());
        }
        if (!((com.google.android.m4b.maps.cw.a.a) (obj)).d.isEmpty())
        {
            obj = ((com.google.android.m4b.maps.cw.a.a) (obj)).d;
            a2.b();
            com.google.android.m4b.maps.cw.a.a.a((com.google.android.m4b.maps.cw.a.a)a2.a, ((String) (obj)));
        }
        if (!Arrays.equals(((com.google.android.m4b.maps.cw.a.a)a2.e()).f(), abyte0))
        {
            throw new IllegalArgumentException("The place id is not normalized");
        } else
        {
            return com.google.android.m4b.maps.c.a.b().a().a(abyte0);
        }
    }

    public final t d()
    {
        return e;
    }

    public final int e()
    {
        return q;
    }

    public final int[] f()
    {
        return r;
    }

    public final int g()
    {
        int l2 = 0;
        boolean flag = false;
        int i1 = 120;
        if (c != null)
        {
            i1 = com.google.android.m4b.maps.bo.d.a(c) + 120;
        }
        int l1 = i1;
        if (p != null)
        {
            l1 = i1 + com.google.android.m4b.maps.bo.d.a(p);
        }
        int i2;
        if (k != null)
        {
            com.google.android.m4b.maps.bo.a aa[] = k;
            int i3 = aa.length;
            int j2 = 0;
            int j1 = 0;
            do
            {
                i2 = j1;
                if (j2 >= i3)
                {
                    break;
                }
                com.google.android.m4b.maps.bo.a a1 = aa[j2];
                i2 = com.google.android.m4b.maps.bo.d.a(a1.a);
                int k3 = com.google.android.m4b.maps.bo.d.a(a1.c);
                j2++;
                j1 = k3 + (i2 + 40) + j1;
            } while (true);
        } else
        {
            i2 = 0;
        }
        if (n != null)
        {
            int j3 = n.length;
            int k2 = 0;
            int k1 = ((flag) ? 1 : 0);
            do
            {
                l2 = k1;
                if (k2 >= j3)
                {
                    break;
                }
                l2 = ab.a.c();
                k2++;
                k1 = l2 + k1;
            } while (true);
        }
        return l1 + (i2 + l2 + com.google.android.m4b.maps.bo.d.a(l) + com.google.android.m4b.maps.bo.d.a(m) + com.google.android.m4b.maps.bo.d.a(d) + com.google.android.m4b.maps.bo.d.a(e) + com.google.android.m4b.maps.bo.d.a(t) + com.google.android.m4b.maps.bo.d.a(u));
    }
}
