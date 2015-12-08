// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.b.a;
import com.google.b.m;

// Referenced classes of package com.google.b.e:
//            x

public final class h extends x
{

    static final int a[] = {
        0, 11, 13, 14, 19, 25, 28, 21, 22, 26
    };
    private final int f[] = new int[4];

    public h()
    {
    }

    private static void a(StringBuilder stringbuilder, int i)
    {
        for (int j = 0; j < 10; j++)
        {
            if (i == a[j])
            {
                stringbuilder.insert(0, (char)(j + 48));
                return;
            }
        }

        throw m.a();
    }

    protected int a(a a1, int ai[], StringBuilder stringbuilder)
    {
        int ai1[] = f;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int i2 = a1.a();
        int i = ai[1];
        int j = 0;
        int l;
        int k1;
        for (l = 0; j < 6 && i < i2; l = k1)
        {
            int j2 = a(a1, ai1, i, e);
            stringbuilder.append((char)(j2 % 10 + 48));
            int k2 = ai1.length;
            for (int j1 = 0; j1 < k2; j1++)
            {
                i += ai1[j1];
            }

            k1 = l;
            if (j2 >= 10)
            {
                k1 = l | 1 << 5 - j;
            }
            j++;
        }

        a(stringbuilder, l);
        i = a(a1, i, true, c)[1];
        for (int k = 0; k < 6 && i < i2; k++)
        {
            stringbuilder.append((char)(a(a1, ai1, i, d) + 48));
            int l1 = ai1.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                i += ai1[i1];
            }

        }

        return i;
    }

    com.google.b.a b()
    {
        return com.google.b.a.h;
    }

}
