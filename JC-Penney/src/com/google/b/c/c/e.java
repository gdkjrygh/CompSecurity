// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.c;

import java.util.Arrays;

public class e
{

    private final CharSequence a;
    private final int b;
    private final int c;
    private final byte d[];

    public e(CharSequence charsequence, int i, int j)
    {
        a = charsequence;
        c = i;
        b = j;
        d = new byte[i * j];
        Arrays.fill(d, (byte)-1);
    }

    private void a(int i)
    {
        a(b - 1, 0, i, 1);
        a(b - 1, 1, i, 2);
        a(b - 1, 2, i, 3);
        a(0, c - 2, i, 4);
        a(0, c - 1, i, 5);
        a(1, c - 1, i, 6);
        a(2, c - 1, i, 7);
        a(3, c - 1, i, 8);
    }

    private void a(int i, int j, int k)
    {
        a(i - 2, j - 2, k, 1);
        a(i - 2, j - 1, k, 2);
        a(i - 1, j - 2, k, 3);
        a(i - 1, j - 1, k, 4);
        a(i - 1, j, k, 5);
        a(i, j - 2, k, 6);
        a(i, j - 1, k, 7);
        a(i, j, k, 8);
    }

    private void a(int i, int j, int k, int l)
    {
        boolean flag = true;
        if (i < 0)
        {
            i += b;
            j = (4 - (b + 4) % 8) + j;
        }
        int j1 = j;
        int i1 = i;
        if (j < 0)
        {
            j1 = j + c;
            i1 = i + (4 - (c + 4) % 8);
        }
        if ((a.charAt(k) & 1 << 8 - l) == 0)
        {
            flag = false;
        }
        a(j1, i1, flag);
    }

    private void b(int i)
    {
        a(b - 3, 0, i, 1);
        a(b - 2, 0, i, 2);
        a(b - 1, 0, i, 3);
        a(0, c - 4, i, 4);
        a(0, c - 3, i, 5);
        a(0, c - 2, i, 6);
        a(0, c - 1, i, 7);
        a(1, c - 1, i, 8);
    }

    private void c(int i)
    {
        a(b - 3, 0, i, 1);
        a(b - 2, 0, i, 2);
        a(b - 1, 0, i, 3);
        a(0, c - 2, i, 4);
        a(0, c - 1, i, 5);
        a(1, c - 1, i, 6);
        a(2, c - 1, i, 7);
        a(3, c - 1, i, 8);
    }

    private void d(int i)
    {
        a(b - 1, 0, i, 1);
        a(b - 1, c - 1, i, 2);
        a(0, c - 3, i, 3);
        a(0, c - 2, i, 4);
        a(0, c - 1, i, 5);
        a(1, c - 3, i, 6);
        a(1, c - 2, i, 7);
        a(1, c - 1, i, 8);
    }

    public final void a()
    {
        int k = 0;
        int j = 4;
        int l = 0;
        int j1;
        do
        {
            int i;
            int i1;
            do
            {
                i = l;
                if (j == b)
                {
                    i = l;
                    if (k == 0)
                    {
                        a(l);
                        i = l + 1;
                    }
                }
                i1 = i;
                if (j == b - 2)
                {
                    i1 = i;
                    if (k == 0)
                    {
                        i1 = i;
                        if (c % 4 != 0)
                        {
                            b(i);
                            i1 = i + 1;
                        }
                    }
                }
                l = i1;
                if (j == b - 2)
                {
                    l = i1;
                    if (k == 0)
                    {
                        l = i1;
                        if (c % 8 == 4)
                        {
                            c(i1);
                            l = i1 + 1;
                        }
                    }
                }
                i1 = k;
                j1 = j;
                i = l;
                if (j == b + 4)
                {
                    i1 = k;
                    j1 = j;
                    i = l;
                    if (k == 2)
                    {
                        i1 = k;
                        j1 = j;
                        i = l;
                        if (c % 8 == 0)
                        {
                            d(l);
                            i = l + 1;
                            j1 = j;
                            i1 = k;
                        }
                    }
                }
                do
                {
                    j = i;
                    if (j1 < b)
                    {
                        j = i;
                        if (i1 >= 0)
                        {
                            j = i;
                            if (!b(i1, j1))
                            {
                                a(j1, i1, i);
                                j = i + 1;
                            }
                        }
                    }
                    l = j1 - 2;
                    k = i1 + 2;
                    if (l < 0)
                    {
                        break;
                    }
                    i1 = k;
                    j1 = l;
                    i = j;
                } while (k < c);
                l++;
                i1 = k + 3;
                i = j;
                k = l;
                j = i1;
                do
                {
                    if (k >= 0 && j < c && !b(j, k))
                    {
                        l = i + 1;
                        a(k, j, i);
                        i = l;
                    }
                    k += 2;
                    j -= 2;
                } while (k < b && j >= 0);
                i1 = k + 3;
                j1 = j + 1;
                k = j1;
                j = i1;
                l = i;
            } while (i1 < b);
            k = j1;
            j = i1;
            l = i;
        } while (j1 < c);
        if (!b(c - 1, b - 1))
        {
            a(c - 1, b - 1, true);
            a(c - 2, b - 2, true);
        }
    }

    final void a(int i, int j, boolean flag)
    {
        byte abyte0[] = d;
        int k = c;
        byte byte0;
        if (flag)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        abyte0[k * j + i] = byte0;
    }

    public final boolean a(int i, int j)
    {
        return d[c * j + i] == 1;
    }

    final boolean b(int i, int j)
    {
        return d[c * j + i] >= 0;
    }
}
