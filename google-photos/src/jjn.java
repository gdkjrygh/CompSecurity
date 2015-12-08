// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.Arrays;

public abstract class jjn extends jig
{

    private final jjm a[] = new jjm[1];
    private int b[];
    private int d[];
    private long e;
    jjm g;
    int h;

    public transient jjn(jjl ajjl[])
    {
        for (int i = 0; i <= 0; i++)
        {
            a[0] = ajjl[0].a();
        }

    }

    private static void a(jjm jjm1)
    {
        try
        {
            jjm1.d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (jjm jjm1)
        {
            throw new jie(jjm1);
        }
    }

    protected final int a(long l, jji jji, jjk jjk, boolean flag)
    {
        return g.a(h, l, jji, jjk, flag);
    }

    protected final jjh a(int i)
    {
        return a[b[i]].a(d[i]);
    }

    public void a()
    {
        g.b(h);
        g = null;
    }

    protected void a(int i, long l, boolean flag)
    {
        g = a[b[i]];
        h = d[i];
        g.a(h, l);
    }

    protected final boolean a(long l)
    {
        boolean flag = true;
        for (int i = 0; i < a.length; i++)
        {
            flag &= a[i].b();
        }

        if (!flag)
        {
            return false;
        }
        int i1 = 0;
        for (int j = 0; j < a.length; j++)
        {
            i1 += a[j].c();
        }

        Object obj = new int[i1];
        int ai[] = new int[i1];
        int l1 = a.length;
        int k = 0;
        long l2 = 0L;
        i1 = 0;
        do
        {
            if (i1 >= l1)
            {
                break;
            }
            jjm jjm1 = a[i1];
            int i2 = jjm1.c();
            int j1 = 0;
            while (j1 < i2) 
            {
                jjh jjh1 = jjm1.a(j1);
                int k1;
                boolean flag1;
                try
                {
                    flag1 = a(jjh1);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw new jie(((Throwable) (obj)));
                }
                k1 = k;
                l = l2;
                if (flag1)
                {
                    obj[k] = i1;
                    ai[k] = j1;
                    k++;
                    k1 = k;
                    l = l2;
                    if (l2 != -1L)
                    {
                        long l3 = jjh1.d;
                        if (l3 == -1L)
                        {
                            l = -1L;
                            k1 = k;
                        } else
                        {
                            k1 = k;
                            l = l2;
                            if (l3 != -2L)
                            {
                                l = Math.max(l2, l3);
                                k1 = k;
                            }
                        }
                    }
                }
                j1++;
                k = k1;
                l2 = l;
            }
            i1++;
        } while (true);
        e = l2;
        b = Arrays.copyOf(((int []) (obj)), k);
        d = Arrays.copyOf(ai, k);
        return true;
    }

    public abstract boolean a(jjh jjh1);

    protected final int aB_()
    {
        return d.length;
    }

    protected void b(long l)
    {
        g.a(l);
    }

    protected final void e()
    {
        if (g != null)
        {
            a(g);
        } else
        {
            int j = a.length;
            int i = 0;
            while (i < j) 
            {
                a(a[i]);
                i++;
            }
        }
    }

    protected final long f()
    {
        return e;
    }

    protected final long g()
    {
        return g.e();
    }

    protected final void p()
    {
        int j = a.length;
        for (int i = 0; i < j; i++)
        {
            a[i].f();
        }

    }
}
