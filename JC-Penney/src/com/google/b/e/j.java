// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.b.a;

// Referenced classes of package com.google.b.e:
//            x

public final class j extends x
{

    private final int a[] = new int[4];

    public j()
    {
    }

    protected int a(a a1, int ai[], StringBuilder stringbuilder)
    {
        int ai1[] = a;
        ai1[0] = 0;
        ai1[1] = 0;
        ai1[2] = 0;
        ai1[3] = 0;
        int k1 = a1.a();
        int i = ai[1];
        for (int k = 0; k < 4 && i < k1; k++)
        {
            stringbuilder.append((char)(a(a1, ai1, i, d) + 48));
            int l1 = ai1.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                i += ai1[i1];
            }

        }

        i = a(a1, i, true, c)[1];
        for (int l = 0; l < 4 && i < k1; l++)
        {
            stringbuilder.append((char)(a(a1, ai1, i, d) + 48));
            int i2 = ai1.length;
            for (int j1 = 0; j1 < i2; j1++)
            {
                i += ai1[j1];
            }

        }

        return i;
    }

    com.google.b.a b()
    {
        return com.google.b.a.g;
    }
}
