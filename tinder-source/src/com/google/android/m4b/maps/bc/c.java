// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bc;

import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.k;

// Referenced classes of package com.google.android.m4b.maps.bc:
//            d, a

public final class c
{

    public static final d a = new d("Unknown Road", null, false);
    static final a b[] = new a[0];
    a c[];
    private final int d;
    private final long e;
    private final d f[];
    private final k g;
    private final int h;
    private final int i;
    private final int j;

    public c(long l, d ad[], k k1, int i1, int j1, int l1, 
            int i2)
    {
        if (ad.length == 0)
        {
            throw new IllegalArgumentException("Segments must have at least one name");
        } else
        {
            d = i1;
            e = l;
            f = ad;
            g = k1;
            h = j1;
            c = b;
            i = l1;
            j = i2;
            return;
        }
    }

    public static long a(ac ac1, int l)
    {
        return (long)ac1.b << 48 | (long)ac1.c << 32 | (long)l;
    }

    private g a(int l)
    {
        g g1 = new g();
        int i1 = l;
        if ((d & 4) != 0)
        {
            i1 = g.a.length / 3 - l - 1;
        }
        g.a(i1, g1);
        return g1;
    }

    public final boolean equals(Object obj)
    {
        while (!(obj instanceof c) || e != ((c)obj).e) 
        {
            return false;
        }
        return true;
    }

    public final int hashCode()
    {
        return (int)((e >>> 48 & 255L) << 24 | (e >>> 32 & 255L) << 16 | e & 65535L);
    }

    public final String toString()
    {
        boolean flag1 = true;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[name: ").append(f[0]);
        StringBuilder stringbuilder1 = stringbuilder.append(" unroutable: ");
        boolean flag;
        if ((d & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder1.append(flag);
        stringbuilder1 = stringbuilder.append(" leaves-region: ");
        if ((d & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        stringbuilder1.append(flag);
        stringbuilder1 = stringbuilder.append(" enters-region: ");
        if ((d & 2) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        stringbuilder1.append(flag);
        stringbuilder.append(" num-points: ").append(g.a.length / 3);
        stringbuilder.append(" first-point: ").append(a(0).f());
        stringbuilder.append(" last-point: ").append(a(g.a.length / 3 - 1).f());
        stringbuilder.append(" num-arcs: ").append(c.length);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

}
