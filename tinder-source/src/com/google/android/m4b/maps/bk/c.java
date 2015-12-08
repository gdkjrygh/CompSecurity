// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;

import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bk:
//            j, a, g

final class c extends j
{

    private boolean d[];

    c(g g)
    {
        super(g);
        d = new boolean[d() + 2];
        Arrays.fill(d, false);
        d[0] = true;
    }

    private static int a(double ad[], double d1, double d2, int i, int k)
    {
        for (; i < k; i++)
        {
            if (ad[i * 2] == d1 && ad[i * 2 + 1] == d2)
            {
                return i;
            }
        }

        return -1;
    }

    private static boolean a(double d1, double d2, double d3, double d4, 
            double d5, double d6)
    {
        return (d1 - d3) * (d6 - d4) - (d2 - d4) * (d5 - d3) > 0.0D;
    }

    public final j a(int ai[])
    {
        if (d() == 0)
        {
            return this;
        }
        double ad[] = new double[(e() + ai.length) * 2];
        int l = a.g(1);
        a.a(0, ad, 0, l);
        Arrays.fill(d, false);
        d[0] = true;
        int k = 0;
        while (k < ai.length) 
        {
            int i1 = ai[k];
            int i = ai[k + 1];
            int j1 = a.f(i);
            double d1;
            double d2;
            int i3;
            int j3;
            if (d[j1])
            {
                int k1 = a.f(i1);
                j1 = i1;
                i1 = k1;
            } else
            {
                int j2 = i;
                i = i1;
                i1 = j1;
                j1 = j2;
            }
            i3 = a.g(i1);
            j3 = a.g(i1 + 1);
            d1 = a.a(i);
            d2 = a.b(i);
            i = a(ad, d1, d2, 0, l);
            if (a(ad, d1, d2, i + 1, l) != -1)
            {
                boolean flag = false;
                while (!flag) 
                {
                    int l2 = (i - 1) % l;
                    int k2 = l2;
                    if (l2 < 0)
                    {
                        k2 = l2 + l;
                    }
                    l2 = (i + 1) % l;
                    if (l2 < 0)
                    {
                        l2 += l;
                    }
                    boolean flag1 = a(ad[k2 * 2], ad[k2 * 2 + 1], ad[i * 2], ad[i * 2 + 1], ad[l2 * 2], ad[l2 * 2 + 1]);
                    boolean flag2 = a(b(j1), c(j1), ad[i * 2], ad[i * 2 + 1], ad[l2 * 2], ad[l2 * 2 + 1]);
                    boolean flag3 = a(ad[k2 * 2], ad[k2 * 2 + 1], ad[i * 2], ad[i * 2 + 1], b(j1), c(j1));
                    if (flag1 ? flag2 && flag3 : flag2 || flag3)
                    {
                        i = a(ad, d1, d2, i + 1, l);
                    } else
                    {
                        flag = true;
                    }
                }
            }
            if (a.a(j1) != d1 || a.b(j1) != d2)
            {
                System.arraycopy(ad, i * 2, ad, (((i + j3) - i3) + 2) * 2, (l - i) * 2);
                i++;
                int l1 = j3 - j1;
                a.a(j1, ad, i, l1);
                a.a(i3, ad, i + l1, (j1 - i3) + 1);
                i = l + ((j3 - i3) + 2);
                d[i1] = true;
            } else
            {
                System.arraycopy(ad, (i + 1) * 2, ad, ((i + j3) - i3) * 2, (l - i - 1) * 2);
                i++;
                int i2 = j3 - j1 - 1;
                a.a(j1, ad, i, i2);
                a.a(i3, ad, i + i2, (j1 - i3) + 1);
                i = l + ((j3 - i3) + 2);
                d[i1] = true;
            }
            k += 2;
            l = i;
        }
        return new j(ad);
    }

    public final boolean a(Object obj)
    {
        return obj instanceof c;
    }

    public final boolean c(int i, int k)
    {
        i = a.f(i);
        for (k = a.f(k); i == k || d[i] && d[k];)
        {
            return false;
        }

        if (d[i])
        {
            d[k] = true;
            return true;
        }
        if (d[k])
        {
            d[i] = true;
            return true;
        } else
        {
            throw new e.a("Some outer chains have not been cut.");
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof c))
            {
                return false;
            }
            obj = (c)obj;
            if (!(this instanceof c) || !super.equals(obj) || Arrays.equals(d, ((c) (obj)).d))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return super.hashCode() + Arrays.hashCode(d) * 31;
    }
}
