// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e.a;

import com.google.b.e.q;
import com.google.b.m;

public abstract class a extends q
{

    private final int a[] = new int[4];
    private final int b[] = new int[8];
    private final float c[] = new float[4];
    private final float d[] = new float[4];
    private final int e[];
    private final int f[];

    protected a()
    {
        e = new int[b.length / 2];
        f = new int[b.length / 2];
    }

    protected static int a(int ai[])
    {
        int i = 0;
        int k = ai.length;
        int j = 0;
        for (; i < k; i++)
        {
            j += ai[i];
        }

        return j;
    }

    protected static int a(int ai[], int ai1[][])
    {
        for (int i = 0; i < ai1.length; i++)
        {
            if (a(ai, ai1[i], 0.45F) < 0.2F)
            {
                return i;
            }
        }

        throw m.a();
    }

    protected static void a(int ai[], float af[])
    {
        int j = 0;
        float f1 = af[0];
        for (int i = 1; i < ai.length;)
        {
            float f2 = f1;
            if (af[i] > f1)
            {
                f2 = af[i];
                j = i;
            }
            i++;
            f1 = f2;
        }

        ai[j] = ai[j] + 1;
    }

    protected static void b(int ai[], float af[])
    {
        int j = 0;
        float f1 = af[0];
        for (int i = 1; i < ai.length;)
        {
            float f2 = f1;
            if (af[i] < f1)
            {
                f2 = af[i];
                j = i;
            }
            i++;
            f1 = f2;
        }

        ai[j] = ai[j] - 1;
    }

    protected static boolean b(int ai[])
    {
        int i = ai[0] + ai[1];
        int k = ai[2];
        int i1 = ai[3];
        float f1 = (float)i / (float)(k + i + i1);
        if (f1 >= 0.7916667F && f1 <= 0.8928571F)
        {
            int j = 0x7fffffff;
            int k1 = 0x80000000;
            int i2 = ai.length;
            for (int l = 0; l < i2;)
            {
                int l1 = ai[l];
                int j1 = k1;
                if (l1 > k1)
                {
                    j1 = l1;
                }
                if (l1 < j)
                {
                    j = l1;
                }
                l++;
                k1 = j1;
            }

            return k1 < j * 10;
        } else
        {
            return false;
        }
    }

    protected final int[] b()
    {
        return a;
    }

    protected final int[] c()
    {
        return b;
    }

    protected final float[] d()
    {
        return c;
    }

    protected final float[] e()
    {
        return d;
    }

    protected final int[] f()
    {
        return e;
    }

    protected final int[] g()
    {
        return f;
    }
}
