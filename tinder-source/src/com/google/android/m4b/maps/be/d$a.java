// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.be:
//            d

static final class b
{

    final byte a[];
    int b;
    private int c;

    static int[] a(long l)
    {
        int i = 0;
        int ai[] = new int[3];
        l = Long.rotateRight(l, 22);
        ai[0] = (int)(l % 8147L);
        l = Long.rotateRight(l, 22);
        ai[1] = (int)(l % 8147L);
        ai[2] = (int)(Long.rotateRight(l, 22) % 8147L);
        for (; i < 3; i++)
        {
            if (ai[i] < 0)
            {
                ai[i] = ai[i] + 8147;
            }
        }

        return ai;
    }

    final void a(int i)
    {
        i *= 1024;
        Arrays.fill(a, i, i + 1020, (byte)0);
    }

    final void a(a a1)
    {
        a(a1.b);
        for (int i = 0; i < a1.c; i++)
        {
            long l1 = a1.b(i);
            if (l1 == -1L)
            {
                continue;
            }
            int k = a1.b;
            int ai[] = a(l1);
            for (int j = 0; j < 3; j++)
            {
                int i1 = ai[j];
                int l = ai[j];
                byte abyte0[] = a;
                i1 = (i1 >> 3) + k * 1024;
                abyte0[i1] = (byte)(1 << (l & 7) | abyte0[i1]);
            }

        }

        if (a1.b >= b)
        {
            b = a1.b + 1;
        }
    }

    final boolean a(int ai[], int i)
    {
        for (int j = 0; j < ai.length; j++)
        {
            int k = ai[j];
            int l = ai[j];
            if ((a[(k >> 3) + i * 1024] & 1 << (l & 7)) == 0)
            {
                return false;
            }
        }

        return true;
    }

    final void b(int i)
    {
        i *= 1024;
        int j = d.c(a, i, 1020);
        d.a(a, i + 1020, j);
    }

    (int i, int j)
    {
        a = new byte[i * 1024];
        c = i;
        b = j;
    }
}
