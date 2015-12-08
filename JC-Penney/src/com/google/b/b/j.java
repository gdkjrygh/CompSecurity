// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import com.google.b.b;
import com.google.b.i;
import java.lang.reflect.Array;

// Referenced classes of package com.google.b.b:
//            h, b

public final class j extends h
{

    private com.google.b.b.b a;

    public j(i k)
    {
        super(k);
    }

    private static int a(int k, int l, int i1)
    {
        if (k < l)
        {
            return l;
        }
        if (k > i1)
        {
            return i1;
        } else
        {
            return k;
        }
    }

    private static void a(byte abyte0[], int k, int l, int i1, int j1, com.google.b.b.b b1)
    {
        int k1 = l * j1 + k;
        for (int l1 = 0; l1 < 8;)
        {
            for (int i2 = 0; i2 < 8; i2++)
            {
                if ((abyte0[k1 + i2] & 0xff) <= i1)
                {
                    b1.b(k + i2, l + l1);
                }
            }

            l1++;
            k1 += j1;
        }

    }

    private static void a(byte abyte0[], int k, int l, int i1, int j1, int ai[][], com.google.b.b.b b1)
    {
        for (int k1 = 0; k1 < l; k1++)
        {
            int l1 = k1 << 3;
            int i2 = j1 - 8;
            if (l1 > i2)
            {
                l1 = i2;
            }
            for (int j2 = 0; j2 < k; j2++)
            {
                int k2 = j2 << 3;
                int l2 = i1 - 8;
                if (k2 > l2)
                {
                    k2 = l2;
                }
                int k3 = a(j2, 2, k - 3);
                int l3 = a(k1, 2, l - 3);
                int j3 = 0;
                for (int i3 = -2; i3 <= 2; i3++)
                {
                    int ai1[] = ai[l3 + i3];
                    int i4 = ai1[k3 - 2];
                    int j4 = ai1[k3 - 1];
                    int k4 = ai1[k3];
                    int l4 = ai1[k3 + 1];
                    j3 += ai1[k3 + 2] + (i4 + j4 + k4 + l4);
                }

                a(abyte0, k2, l1, j3 / 25, i1, b1);
            }

        }

    }

    private static int[][] a(byte abyte0[], int k, int l, int i1, int j1)
    {
        int ai[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            l, k
        });
        for (int l3 = 0; l3 < l; l3++)
        {
            int i4 = l3 << 3;
            int k1 = j1 - 8;
            if (i4 > k1)
            {
                i4 = k1;
            }
            for (int j4 = 0; j4 < k; j4++)
            {
                int l1 = j4 << 3;
                int i2 = i1 - 8;
                if (l1 > i2)
                {
                    l1 = i2;
                }
                boolean flag = false;
                int k2 = 255;
                i2 = 0;
                int l2 = 0;
                int i3 = i4 * i1 + l1;
                l1 = ((flag) ? 1 : 0);
                int l4;
                for (; l2 < 8; l2 = l4 + 1)
                {
                    for (int j3 = 0; j3 < 8;)
                    {
                        int k4 = abyte0[i3 + j3] & 0xff;
                        if (k4 < k2)
                        {
                            k2 = k4;
                        }
                        if (k4 > i2)
                        {
                            i2 = k4;
                        }
                        j3++;
                        l1 += k4;
                    }

                    int k3;
                    int i5;
                    if (i2 - k2 > 24)
                    {
                        k3 = i3 + i1;
                        i3 = l2 + 1;
                        l2 = k3;
                        do
                        {
                            i5 = l2;
                            l4 = i3;
                            k3 = l1;
                            if (i3 >= 8)
                            {
                                break;
                            }
                            for (k3 = 0; k3 < 8; k3++)
                            {
                                l1 += abyte0[l2 + k3] & 0xff;
                            }

                            i3++;
                            l2 += i1;
                        } while (true);
                    } else
                    {
                        k3 = l1;
                        l4 = l2;
                        i5 = i3;
                    }
                    i3 = i5 + i1;
                    l1 = k3;
                }

                l1 >>= 6;
                if (i2 - k2 <= 24)
                {
                    l1 = k2 / 2;
                    if (l3 > 0 && j4 > 0)
                    {
                        int j2 = (ai[l3 - 1][j4] + ai[l3][j4 - 1] * 2 + ai[l3 - 1][j4 - 1]) / 4;
                        if (k2 < j2)
                        {
                            l1 = j2;
                        }
                    }
                }
                ai[l3][j4] = l1;
            }

        }

        return ai;
    }

    public b a(i k)
    {
        return new j(k);
    }

    public com.google.b.b.b b()
    {
        if (a != null)
        {
            return a;
        }
        i k = a();
        int k1 = k.b();
        int l1 = k.c();
        if (k1 >= 40 && l1 >= 40)
        {
            byte abyte0[] = k.a();
            int i1 = k1 >> 3;
            int l = i1;
            if ((k1 & 7) != 0)
            {
                l = i1 + 1;
            }
            int j1 = l1 >> 3;
            i1 = j1;
            if ((l1 & 7) != 0)
            {
                i1 = j1 + 1;
            }
            int ai[][] = a(abyte0, l, i1, k1, l1);
            com.google.b.b.b b1 = new com.google.b.b.b(k1, l1);
            a(abyte0, l, i1, k1, l1, ai, b1);
            a = b1;
        } else
        {
            a = super.b();
        }
        return a;
    }
}
