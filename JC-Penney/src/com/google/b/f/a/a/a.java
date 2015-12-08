// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.a.a;

import com.google.b.d;

// Referenced classes of package com.google.b.f.a.a:
//            b, c

public final class a
{

    private final b a;

    public a()
    {
        a = b.a;
    }

    private int[] a(c c1)
    {
        int l = c1.a();
        int ai[] = new int[l];
        int j = 0;
        int k;
        for (int i = 1; i < a.c() && j < l; j = k)
        {
            k = j;
            if (c1.b(i) == 0)
            {
                ai[j] = a.c(i);
                k = j + 1;
            }
            i++;
        }

        if (j != l)
        {
            throw d.a();
        } else
        {
            return ai;
        }
    }

    private int[] a(c c1, c c2, int ai[])
    {
        int k = c2.a();
        int ai1[] = new int[k];
        for (int i = 1; i <= k; i++)
        {
            ai1[k - i] = a.d(i, c2.a(i));
        }

        c2 = new c(a, ai1);
        k = ai.length;
        ai1 = new int[k];
        for (int j = 0; j < k; j++)
        {
            int i1 = a.c(ai[j]);
            int l = a.c(0, c1.b(i1));
            i1 = a.c(c2.b(i1));
            ai1[j] = a.d(l, i1);
        }

        return ai1;
    }

    private c[] a(c c1, c c2, int i)
    {
        c c3;
        c c5;
        if (c1.a() >= c2.a())
        {
            c c4 = c1;
            c1 = c2;
            c2 = c4;
        }
        c5 = a.a();
        c3 = a.b();
        while (c1.a() >= i / 2) 
        {
            if (c1.b())
            {
                throw d.a();
            }
            c c6 = a.a();
            int j = c1.a(c1.a());
            j = a.c(j);
            int k;
            int l;
            for (; c2.a() >= c1.a() && !c2.b(); c2 = c2.b(c1.a(k, l)))
            {
                k = c2.a() - c1.a();
                l = a.d(c2.a(c2.a()), j);
                c6 = c6.a(a.a(k, l));
            }

            c5 = c6.c(c3).b(c5).c();
            c6 = c1;
            c1 = c2;
            c2 = c5;
            c5 = c3;
            c3 = c2;
            c2 = c6;
        }
        i = c3.a(0);
        if (i == 0)
        {
            throw d.a();
        } else
        {
            i = a.c(i);
            return (new c[] {
                c3.c(i), c1.c(i)
            });
        }
    }

    public int a(int ai[], int i, int ai1[])
    {
        c c1 = new c(a, ai);
        int ai2[] = new int[i];
        int j = i;
        boolean flag = false;
        for (; j > 0; j--)
        {
            int j1 = c1.b(a.a(j));
            ai2[i - j] = j1;
            if (j1 != 0)
            {
                flag = true;
            }
        }

        if (!flag)
        {
            return 0;
        }
        c1 = a.b();
        if (ai1 != null)
        {
            int i1 = ai1.length;
            for (int k = 0; k < i1; k++)
            {
                int k1 = ai1[k];
                k1 = a.a(ai.length - 1 - k1);
                c1 = c1.c(new c(a, new int[] {
                    a.c(0, k1), 1
                }));
            }

        }
        ai1 = new c(a, ai2);
        Object aobj[] = a(a.a(i, 1), ((c) (ai1)), i);
        ai1 = aobj[0];
        c c2 = aobj[1];
        aobj = a(((c) (ai1)));
        ai1 = a(c2, ((c) (ai1)), ((int []) (aobj)));
        for (i = 0; i < aobj.length; i++)
        {
            int l = ai.length - 1 - a.b(aobj[i]);
            if (l < 0)
            {
                throw d.a();
            }
            ai[l] = a.c(ai[l], ai1[i]);
        }

        return aobj.length;
    }
}
