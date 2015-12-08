// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g;

import com.google.b.a;
import com.google.b.g.a.o;
import com.google.b.g.c.c;
import com.google.b.g.c.g;
import com.google.b.u;
import java.util.Map;

public final class b
    implements u
{

    public b()
    {
    }

    private static com.google.b.b.b a(g g1, int i, int j, int k)
    {
        g1 = g1.a();
        if (g1 == null)
        {
            throw new IllegalStateException();
        }
        int k1 = g1.b();
        int l1 = g1.a();
        int l = k * 2 + k1;
        int j1 = k * 2 + l1;
        i = Math.max(i, l);
        k = Math.max(j, j1);
        int i2 = Math.min(i / l, k / j1);
        j1 = (i - k1 * i2) / 2;
        j = (k - l1 * i2) / 2;
        com.google.b.b.b b1 = new com.google.b.b.b(i, k);
        for (i = 0; i < l1; i++)
        {
            int i1 = 0;
            for (k = j1; i1 < k1; k += i2)
            {
                if (g1.a(i1, i) == 1)
                {
                    b1.a(k, j, i2, i2);
                }
                i1++;
            }

            j += i2;
        }

        return b1;
    }

    public com.google.b.b.b a(String s, a a1, int i, int j, Map map)
    {
        Object obj;
        if (s.isEmpty())
        {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (a1 != a.l)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode QR_CODE, but got ").append(a1).toString());
        }
        if (i < 0 || j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Requested dimensions are too small: ").append(i).append('x').append(j).toString());
        }
        a1 = o.a;
        obj = a1;
        if (map == null) goto _L2; else goto _L1
_L1:
        Integer integer;
        obj = (o)map.get(com.google.b.g.a);
        if (obj != null)
        {
            a1 = ((a) (obj));
        }
        integer = (Integer)map.get(com.google.b.g.f);
        obj = a1;
        if (integer == null) goto _L2; else goto _L3
_L3:
        int k = integer.intValue();
_L5:
        return a(c.a(s, a1, map), i, j, k);
_L2:
        k = 4;
        a1 = ((a) (obj));
        if (true) goto _L5; else goto _L4
_L4:
    }
}
