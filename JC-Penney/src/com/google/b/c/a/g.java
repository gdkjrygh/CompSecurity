// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.a;

import com.google.b.h;

// Referenced classes of package com.google.b.c.a:
//            j, i

public final class g
{

    private static final g a[] = h();
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final j g;
    private final int h;

    private g(int k, int l, int i1, int j1, int k1, j j2)
    {
        boolean flag = false;
        super();
        b = k;
        c = l;
        d = i1;
        e = j1;
        f = k1;
        g = j2;
        i1 = j2.a();
        j2 = j2.b();
        j1 = j2.length;
        l = 0;
        for (k = ((flag) ? 1 : 0); k < j1; k++)
        {
            i l1 = j2[k];
            k1 = l1.a();
            l += (l1.b() + i1) * k1;
        }

        h = l;
    }

    public static g a(int k, int l)
    {
        if ((k & 1) != 0 || (l & 1) != 0)
        {
            throw com.google.b.h.a();
        }
        g ag[] = a;
        int j1 = ag.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            g g1 = ag[i1];
            if (g1.c == k && g1.d == l)
            {
                return g1;
            }
        }

        throw com.google.b.h.a();
    }

    private static g[] h()
    {
        return (new g[] {
            new g(1, 10, 10, 8, 8, new j(5, new i(1, 3, null), null)), new g(2, 12, 12, 10, 10, new j(7, new i(1, 5, null), null)), new g(3, 14, 14, 12, 12, new j(10, new i(1, 8, null), null)), new g(4, 16, 16, 14, 14, new j(12, new i(1, 12, null), null)), new g(5, 18, 18, 16, 16, new j(14, new i(1, 18, null), null)), new g(6, 20, 20, 18, 18, new j(18, new i(1, 22, null), null)), new g(7, 22, 22, 20, 20, new j(20, new i(1, 30, null), null)), new g(8, 24, 24, 22, 22, new j(24, new i(1, 36, null), null)), new g(9, 26, 26, 24, 24, new j(28, new i(1, 44, null), null)), new g(10, 32, 32, 14, 14, new j(36, new i(1, 62, null), null)), 
            new g(11, 36, 36, 16, 16, new j(42, new i(1, 86, null), null)), new g(12, 40, 40, 18, 18, new j(48, new i(1, 114, null), null)), new g(13, 44, 44, 20, 20, new j(56, new i(1, 144, null), null)), new g(14, 48, 48, 22, 22, new j(68, new i(1, 174, null), null)), new g(15, 52, 52, 24, 24, new j(42, new i(2, 102, null), null)), new g(16, 64, 64, 14, 14, new j(56, new i(2, 140, null), null)), new g(17, 72, 72, 16, 16, new j(36, new i(4, 92, null), null)), new g(18, 80, 80, 18, 18, new j(48, new i(4, 114, null), null)), new g(19, 88, 88, 20, 20, new j(56, new i(4, 144, null), null)), new g(20, 96, 96, 22, 22, new j(68, new i(4, 174, null), null)), 
            new g(21, 104, 104, 24, 24, new j(56, new i(6, 136, null), null)), new g(22, 120, 120, 18, 18, new j(68, new i(6, 175, null), null)), new g(23, 132, 132, 20, 20, new j(62, new i(8, 163, null), null)), new g(24, 144, 144, 22, 22, new j(62, new i(8, 156, null), new i(2, 155, null), null)), new g(25, 8, 18, 6, 16, new j(7, new i(1, 5, null), null)), new g(26, 8, 32, 6, 14, new j(11, new i(1, 10, null), null)), new g(27, 12, 26, 10, 24, new j(14, new i(1, 16, null), null)), new g(28, 12, 36, 10, 16, new j(18, new i(1, 22, null), null)), new g(29, 16, 36, 14, 16, new j(24, new i(1, 32, null), null)), new g(30, 16, 48, 14, 22, new j(28, new i(1, 49, null), null))
        });
    }

    public int a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public int c()
    {
        return d;
    }

    public int d()
    {
        return e;
    }

    public int e()
    {
        return f;
    }

    public int f()
    {
        return h;
    }

    j g()
    {
        return g;
    }

    public String toString()
    {
        return String.valueOf(b);
    }

}
