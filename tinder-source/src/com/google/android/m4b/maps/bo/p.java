// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.a;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bb, k, bk, d, 
//            t

public final class p
    implements bb
{

    public final k a;
    public final bk b[];
    public final t c;
    public final int d;
    private final int e;
    private final a f;
    private final int g;
    private final String h;
    private final int i;
    private final int j;
    private final int k[];

    public p(int l, a a1, k k1, bk abk[], t t1, int i1, String s, 
            int j1, int l1, int i2, int ai[])
    {
        e = l;
        f = a1;
        a = k1;
        b = abk;
        c = t1;
        g = i1;
        h = s;
        i = j1;
        j = l1;
        d = i2;
        k = ai;
    }

    public final int a()
    {
        return 2;
    }

    public final a b()
    {
        return f;
    }

    public final int c()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.length;
        }
    }

    public final t d()
    {
        return c;
    }

    public final int e()
    {
        return j;
    }

    public final int[] f()
    {
        return k;
    }

    public final int g()
    {
        int j1 = 0;
        int l = 0;
        int k1 = a.f();
        if (b != null)
        {
            bk abk[] = b;
            int l1 = abk.length;
            int i1 = 0;
            do
            {
                j1 = l;
                if (i1 >= l1)
                {
                    break;
                }
                j1 = abk[i1].b();
                i1++;
                l = j1 + l;
            } while (true);
        }
        return j1 + com.google.android.m4b.maps.bo.d.a(f) + com.google.android.m4b.maps.bo.d.a(c) + com.google.android.m4b.maps.bo.d.a(h) + (k1 + 60);
    }

    public final boolean h()
    {
        return com.google.android.m4b.maps.bo.d.a(d, 1);
    }

    public final boolean i()
    {
        return (com.google.android.m4b.maps.bo.d.a(c.a, 16) || j()) && (h() || com.google.android.m4b.maps.bo.d.a(d, 2)) && i < 128 && !com.google.android.m4b.maps.bo.d.a(d, 8);
    }

    public final boolean j()
    {
        return com.google.android.m4b.maps.bo.d.a(d, 32) && !com.google.android.m4b.maps.bo.d.a(d, 8);
    }
}
