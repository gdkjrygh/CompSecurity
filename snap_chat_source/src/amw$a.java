// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

static final class f extends amR
{

    private alt a;
    private alw b;
    private alz c;
    private boolean d;
    private alz e;
    private alz f;

    private int g(long l)
    {
        int i = b.b(l);
        if (((long)i + l ^ l) < 0L && ((long)i ^ l) >= 0L)
        {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        } else
        {
            return i;
        }
    }

    public final int a(long l)
    {
        l = b.d(l);
        return a.a(l);
    }

    public final int a(Locale locale)
    {
        return a.a(locale);
    }

    public final long a(long l, int i)
    {
        if (d)
        {
            int j = g(l);
            return a.a((long)j + l, i) - (long)j;
        } else
        {
            long l1 = b.d(l);
            l1 = a.a(l1, i);
            return b.a(l1, l);
        }
    }

    public final long a(long l, long l1)
    {
        if (d)
        {
            int i = g(l);
            return a.a((long)i + l, l1) - (long)i;
        } else
        {
            long l2 = b.d(l);
            l1 = a.a(l2, l1);
            return b.a(l1, l);
        }
    }

    public final long a(long l, String s, Locale locale)
    {
        long l1 = b.d(l);
        l1 = a.a(l1, s, locale);
        return b.a(l1, l);
    }

    public final String a(int i, Locale locale)
    {
        return a.a(i, locale);
    }

    public final String a(long l, Locale locale)
    {
        l = b.d(l);
        return a.a(l, locale);
    }

    public final int b(long l, long l1)
    {
        int j = g(l1);
        alt alt1 = a;
        int i;
        if (d)
        {
            i = j;
        } else
        {
            i = g(l);
        }
        return alt1.b((long)i + l, (long)j + l1);
    }

    public final long b(long l, int i)
    {
        long l1 = b.d(l);
        l1 = a.b(l1, i);
        l = b.a(l1, l);
        if (a(l) != i)
        {
            alC alc = new alC(l1, b.c);
            alB alb = new alB(a.a(), Integer.valueOf(i), alc.getMessage());
            alb.initCause(alc);
            throw alb;
        } else
        {
            return l;
        }
    }

    public final String b(int i, Locale locale)
    {
        return a.b(i, locale);
    }

    public final String b(long l, Locale locale)
    {
        l = b.d(l);
        return a.b(l, locale);
    }

    public final boolean b(long l)
    {
        l = b.d(l);
        return a.b(l);
    }

    public final int c(long l)
    {
        l = b.d(l);
        return a.c(l);
    }

    public final long c(long l, long l1)
    {
        int j = g(l1);
        alt alt1 = a;
        int i;
        if (d)
        {
            i = j;
        } else
        {
            i = g(l);
        }
        return alt1.c((long)i + l, (long)j + l1);
    }

    public final long d(long l)
    {
        if (d)
        {
            int i = g(l);
            return a.d((long)i + l) - (long)i;
        } else
        {
            long l1 = b.d(l);
            l1 = a.d(l1);
            return b.a(l1, l);
        }
    }

    public final alz d()
    {
        return c;
    }

    public final long e(long l)
    {
        if (d)
        {
            int i = g(l);
            return a.e((long)i + l) - (long)i;
        } else
        {
            long l1 = b.d(l);
            l1 = a.e(l1);
            return b.a(l1, l);
        }
    }

    public final alz e()
    {
        return e;
    }

    public final long f(long l)
    {
        l = b.d(l);
        return a.f(l);
    }

    public final alz f()
    {
        return f;
    }

    public final int g()
    {
        return a.g();
    }

    public final int h()
    {
        return a.h();
    }

    (alt alt1, alw alw1, alz alz, alz alz1, alz alz2)
    {
        super(alt1.a());
        if (!alt1.c())
        {
            throw new IllegalArgumentException();
        } else
        {
            a = alt1;
            b = alw1;
            c = alz;
            d = amw.a(alz);
            e = alz1;
            f = alz2;
            return;
        }
    }
}
