// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.a;

import com.google.b.f.a;
import java.lang.reflect.Array;

final class k
{

    private static final float a[][];

    static int a(int ai[])
    {
        int i = c(b(ai));
        if (i != -1)
        {
            return i;
        } else
        {
            return e(ai);
        }
    }

    private static int[] b(int ai[])
    {
        int i1 = 0;
        float f = com.google.b.f.a.a(ai);
        int ai1[] = new int[8];
        int i = 0;
        int l;
        for (int j = 0; i < 17; j = l)
        {
            float f1 = f / 34F;
            float f2 = ((float)i * f) / 17F;
            int j1 = i1;
            l = j;
            if ((float)(ai[j] + i1) <= f1 + f2)
            {
                j1 = i1 + ai[j];
                l = j + 1;
            }
            ai1[l] = ai1[l] + 1;
            i++;
            i1 = j1;
        }

        return ai1;
    }

    private static int c(int ai[])
    {
        int i = d(ai);
        if (com.google.b.f.a.a(i) == -1)
        {
            return -1;
        } else
        {
            return i;
        }
    }

    private static int d(int ai[])
    {
        long l1 = 0L;
        for (int i = 0; i < ai.length; i++)
        {
            int j = 0;
            while (j < ai[i]) 
            {
                int l;
                long l2;
                if (i % 2 == 0)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                l2 = l;
                j++;
                l1 = l1 << 1 | l2;
            }
        }

        return (int)l1;
    }

    private static int e(int ai[])
    {
        int l = com.google.b.f.a.a(ai);
        float af[] = new float[8];
        for (int i = 0; i < af.length; i++)
        {
            af[i] = (float)ai[i] / (float)l;
        }

        float f2 = 3.402823E+38F;
        l = -1;
        int j = 0;
label0:
        do
        {
            if (j < a.length)
            {
                float f = 0.0F;
                ai = a[j];
                int i1 = 0;
                do
                {
label1:
                    {
                        float f1 = f;
                        if (i1 < 8)
                        {
                            f1 = ai[i1] - af[i1];
                            f += f1 * f1;
                            if (f < f2)
                            {
                                break label1;
                            }
                            f1 = f;
                        }
                        f = f2;
                        if (f1 < f2)
                        {
                            l = a.a[j];
                            f = f1;
                        }
                        j++;
                        f2 = f;
                        continue label0;
                    }
                    i1++;
                } while (true);
            }
            return l;
        } while (true);
    }

    static 
    {
        int i = a.a.length;
        a = (float[][])Array.newInstance(Float.TYPE, new int[] {
            i, 8
        });
        for (int j = 0; j < a.a.length; j++)
        {
            int j1 = a.a[j];
            int l = 0;
            int i1 = j1 & 1;
            for (; l < 8; l++)
            {
                float f = 0.0F;
                for (; (j1 & 1) == i1; j1 >>= 1)
                {
                    f++;
                }

                i1 = j1 & 1;
                a[j][8 - l - 1] = f / 17F;
            }

        }

    }
}
