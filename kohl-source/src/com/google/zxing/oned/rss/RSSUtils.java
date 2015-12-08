// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss;


public final class RSSUtils
{

    private RSSUtils()
    {
    }

    private static int combins(int i, int j)
    {
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        if (i - j > j)
        {
            k = j;
            l = i - j;
        } else
        {
            k = i - j;
            l = j;
        }
        j = 1;
        j1 = 1;
        i1 = i;
        i = j1;
        do
        {
            j1 = i;
            k1 = j;
            if (i1 <= l)
            {
                break;
            }
            k1 = j * i1;
            j1 = i;
            j = k1;
            if (i <= k)
            {
                j = k1 / i;
                j1 = i + 1;
            }
            i1--;
            i = j1;
        } while (true);
        for (; j1 <= k; j1++)
        {
            k1 /= j1;
        }

        return k1;
    }

    public static int getRSSvalue(int ai[], int i, boolean flag)
    {
        int i3 = ai.length;
        int j = 0;
        int j1 = ai.length;
        for (int l = 0; l < j1; l++)
        {
            j += ai[l];
        }

        int j2 = 0;
        int i1 = 0;
        int l1 = 0;
        int i2 = j;
        do
        {
            if (l1 >= i3 - 1)
            {
                break;
            }
            int k2 = 1;
            int k = i1 | 1 << l1;
            while (k2 < ai[l1]) 
            {
                int k1 = combins(i2 - k2 - 1, i3 - l1 - 2);
                i1 = k1;
                if (flag)
                {
                    i1 = k1;
                    if (k == 0)
                    {
                        i1 = k1;
                        if (i2 - k2 - (i3 - l1 - 1) >= i3 - l1 - 1)
                        {
                            i1 = k1 - combins(i2 - k2 - (i3 - l1), i3 - l1 - 2);
                        }
                    }
                }
                if (i3 - l1 - 1 > 1)
                {
                    int l2 = 0;
                    for (k1 = i2 - k2 - (i3 - l1 - 2); k1 > i; k1--)
                    {
                        l2 += combins(i2 - k2 - k1 - 1, i3 - l1 - 3);
                    }

                    k1 = i1 - (i3 - 1 - l1) * l2;
                } else
                {
                    k1 = i1;
                    if (i2 - k2 > i)
                    {
                        k1 = i1 - 1;
                    }
                }
                j2 += k1;
                k2++;
                k &= ~(1 << l1);
            }
            i2 -= k2;
            l1++;
            i1 = k;
        } while (true);
        return j2;
    }
}
