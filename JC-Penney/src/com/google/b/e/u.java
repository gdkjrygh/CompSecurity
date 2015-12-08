// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.b.a;
import com.google.b.m;
import com.google.b.q;
import com.google.b.r;
import com.google.b.s;
import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google.b.e:
//            x

final class u
{

    private final int a[] = new int[4];
    private final StringBuilder b = new StringBuilder();

    u()
    {
    }

    private static Map a(String s1)
    {
        if (s1.length() != 2)
        {
            return null;
        } else
        {
            EnumMap enummap = new EnumMap(com/google/b/r);
            enummap.put(r.e, Integer.valueOf(s1));
            return enummap;
        }
    }

    int a(a a1, int ai[], StringBuilder stringbuilder)
    {
        int ai1[] = a;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int j1 = a1.a();
        int i = ai[1];
        int k = 0;
        int j;
        int i1;
        for (j = 0; k < 2 && i < j1; j = i1)
        {
            int k1 = com.google.b.e.x.a(a1, ai1, i, x.e);
            stringbuilder.append((char)(k1 % 10 + 48));
            int l1 = ai1.length;
            for (int l = 0; l < l1;)
            {
                int i2 = ai1[l];
                l++;
                i = i2 + i;
            }

            i1 = j;
            if (k1 >= 10)
            {
                i1 = j | 1 << 1 - k;
            }
            j = i;
            if (k != 1)
            {
                j = a1.d(a1.c(i));
            }
            k++;
            i = j;
        }

        if (stringbuilder.length() != 2)
        {
            throw m.a();
        }
        if (Integer.parseInt(stringbuilder.toString()) % 4 != j)
        {
            throw m.a();
        } else
        {
            return i;
        }
    }

    q a(int i, a a1, int ai[])
    {
        Object obj = b;
        ((StringBuilder) (obj)).setLength(0);
        int j = a(a1, ai, ((StringBuilder) (obj)));
        obj = ((StringBuilder) (obj)).toString();
        a1 = a(((String) (obj)));
        ai = new s((float)(ai[0] + ai[1]) / 2.0F, i);
        s s1 = new s(j, i);
        com.google.b.a a2 = com.google.b.a.q;
        ai = new q(((String) (obj)), null, new s[] {
            ai, s1
        }, a2);
        if (a1 != null)
        {
            ai.a(a1);
        }
        return ai;
    }
}
