// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

class f extends amR
{

    final alt a;
    final alt b;
    final long c;
    final boolean d;
    protected alz e;
    protected alz f;
    private aml h;

    public final int a(long l)
    {
        if (l >= c)
        {
            return b.a(l);
        } else
        {
            return a.a(l);
        }
    }

    public final int a(Locale locale)
    {
        return Math.max(a.a(locale), b.a(locale));
    }

    public long a(long l, int i)
    {
        return b.a(l, i);
    }

    public long a(long l, long l1)
    {
        return b.a(l, l1);
    }

    public final long a(long l, String s, Locale locale)
    {
        if (l >= c)
        {
            long l1 = b.a(l, s, locale);
            l = l1;
            if (l1 < c)
            {
                l = l1;
                if (aml.a(h) + l1 < c)
                {
                    l = h(l1);
                }
            }
        } else
        {
            long l2 = a.a(l, s, locale);
            l = l2;
            if (l2 >= c)
            {
                l = l2;
                if (l2 - aml.a(h) >= c)
                {
                    return g(l2);
                }
            }
        }
        return l;
    }

    public final String a(int i, Locale locale)
    {
        return b.a(i, locale);
    }

    public final String a(long l, Locale locale)
    {
        if (l >= c)
        {
            return b.a(l, locale);
        } else
        {
            return a.a(l, locale);
        }
    }

    public int b(long l, long l1)
    {
        return b.b(l, l1);
    }

    public final long b(long l, int i)
    {
        if (l >= c)
        {
            long l3 = b.b(l, i);
            l = l3;
            if (l3 < c)
            {
                long l1 = l3;
                if (aml.a(h) + l3 < c)
                {
                    l1 = h(l3);
                }
                l = l1;
                if (a(l1) != i)
                {
                    throw new alB(b.a(), Integer.valueOf(i), null, null);
                }
            }
        } else
        {
            long l4 = a.b(l, i);
            l = l4;
            if (l4 >= c)
            {
                long l2 = l4;
                if (l4 - aml.a(h) >= c)
                {
                    l2 = g(l4);
                }
                l = l2;
                if (a(l2) != i)
                {
                    throw new alB(a.a(), Integer.valueOf(i), null, null);
                }
            }
        }
        return l;
    }

    public final String b(int i, Locale locale)
    {
        return b.b(i, locale);
    }

    public final String b(long l, Locale locale)
    {
        if (l >= c)
        {
            return b.b(l, locale);
        } else
        {
            return a.b(l, locale);
        }
    }

    public final boolean b(long l)
    {
        if (l >= c)
        {
            return b.b(l);
        } else
        {
            return a.b(l);
        }
    }

    public int c(long l)
    {
        int i;
        if (l >= c)
        {
            i = b.c(l);
        } else
        {
            int j = a.c(l);
            i = j;
            if (a.b(l, j) >= c)
            {
                return a.a(a.a(c, -1));
            }
        }
        return i;
    }

    public long c(long l, long l1)
    {
        return b.c(l, l1);
    }

    public final long d(long l)
    {
        if (l >= c)
        {
            long l1 = b.d(l);
            l = l1;
            if (l1 < c)
            {
                l = l1;
                if (aml.a(h) + l1 < c)
                {
                    l = h(l1);
                }
            }
            return l;
        } else
        {
            return a.d(l);
        }
    }

    public final alz d()
    {
        return e;
    }

    public final long e(long l)
    {
        if (l >= c)
        {
            l = b.e(l);
        } else
        {
            long l1 = a.e(l);
            l = l1;
            if (l1 >= c)
            {
                l = l1;
                if (l1 - aml.a(h) >= c)
                {
                    return g(l1);
                }
            }
        }
        return l;
    }

    public final alz e()
    {
        return f;
    }

    public final alz f()
    {
        return b.f();
    }

    public final int g()
    {
        return a.g();
    }

    protected final long g(long l)
    {
        if (d)
        {
            aml aml1 = h;
            return aml.b(l, aml1.E, aml1.F);
        } else
        {
            return h.a(l);
        }
    }

    public final int h()
    {
        return b.h();
    }

    protected final long h(long l)
    {
        if (d)
        {
            aml aml1 = h;
            return aml.b(l, aml1.F, aml1.E);
        } else
        {
            aml aml2 = h;
            return aml.a(l, aml2.F, aml2.E);
        }
    }

    (aml aml1, alt alt1, alt alt2, long l)
    {
        this(aml1, alt1, alt2, l, false);
    }

    (aml aml1, alt alt1, alt alt2, long l, boolean flag)
    {
        h = aml1;
        super(alt2.a());
        a = alt1;
        b = alt2;
        c = l;
        d = flag;
        e = alt2.d();
        alt2 = alt2.e();
        aml1 = alt2;
        if (alt2 == null)
        {
            aml1 = alt1.e();
        }
        f = aml1;
    }
}
