// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.b;


// Referenced classes of package com.google.b.b.b:
//            b, a, e

public final class c
{

    private final a a;

    public c(a a1)
    {
        a = a1;
    }

    private int[] a(b b1)
    {
        int j = 0;
        int i = 1;
        int l = b1.b();
        if (l == 1)
        {
            return (new int[] {
                b1.a(1)
            });
        }
        int ai[] = new int[l];
        int k;
        for (; i < a.c() && j < l; j = k)
        {
            k = j;
            if (b1.b(i) == 0)
            {
                ai[j] = a.c(i);
                k = j + 1;
            }
            i++;
        }

        if (j != l)
        {
            throw new e("Error locator degree does not match number of roots");
        } else
        {
            return ai;
        }
    }

    private int[] a(b b1, int ai[])
    {
        int i1 = ai.length;
        int ai1[] = new int[i1];
        for (int j = 0; j < i1; j++)
        {
            int j1 = a.c(ai[j]);
            int i = 1;
            int k = 0;
            while (k < i1) 
            {
                if (j != k)
                {
                    int l = a.c(ai[k], j1);
                    if ((l & 1) == 0)
                    {
                        l |= 1;
                    } else
                    {
                        l &= -2;
                    }
                    i = a.c(i, l);
                }
                k++;
            }
            ai1[j] = a.c(b1.b(j1), a.c(i));
            if (a.d() != 0)
            {
                ai1[j] = a.c(ai1[j], j1);
            }
        }

        return ai1;
    }

    private b[] a(b b1, b b2, int i)
    {
        b b3;
        b b5;
        if (b1.b() >= b2.b())
        {
            b b4 = b1;
            b1 = b2;
            b2 = b4;
        }
        b5 = a.a();
        b3 = a.b();
        while (b1.b() >= i / 2) 
        {
            if (b1.c())
            {
                throw new e("r_{i-1} was zero");
            }
            b b6 = a.a();
            int j = b1.a(b1.b());
            j = a.c(j);
            int k;
            int l;
            for (; b2.b() >= b1.b() && !b2.c(); b2 = b2.a(b1.a(k, l)))
            {
                k = b2.b() - b1.b();
                l = a.c(b2.a(b2.b()), j);
                b6 = b6.a(a.a(k, l));
            }

            b5 = b6.b(b3).a(b5);
            if (b2.b() >= b1.b())
            {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            b6 = b1;
            b1 = b2;
            b2 = b5;
            b5 = b3;
            b3 = b2;
            b2 = b6;
        }
        i = b3.a(0);
        if (i == 0)
        {
            throw new e("sigmaTilde(0) was zero");
        } else
        {
            i = a.c(i);
            return (new b[] {
                b3.c(i), b1.c(i)
            });
        }
    }

    public void a(int ai[], int i)
    {
        boolean flag1 = false;
        b b1 = new b(a, ai);
        Object aobj[] = new int[i];
        int j = 0;
        boolean flag = true;
        for (; j < i; j++)
        {
            int l = b1.b(a.a(a.d() + j));
            aobj[aobj.length - 1 - j] = l;
            if (l != 0)
            {
                flag = false;
            }
        }

        if (!flag)
        {
            b b2 = new b(a, ((int []) (aobj)));
            aobj = a(a.a(i, 1), b2, i);
            b2 = aobj[0];
            b b3 = aobj[1];
            int ai1[] = a(b2);
            b3 = a(b3, ai1);
            i = ((flag1) ? 1 : 0);
            while (i < ai1.length) 
            {
                int k = ai.length - 1 - a.b(ai1[i]);
                if (k < 0)
                {
                    throw new e("Bad error location");
                }
                ai[k] = com.google.b.b.b.a.b(ai[k], b3[i]);
                i++;
            }
        }
    }
}
