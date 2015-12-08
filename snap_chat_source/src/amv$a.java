// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class d extends amT
{

    private final alz a;
    private final alz c;
    private final alz d;
    private amv e;

    public final int a(long l)
    {
        e.a(l, null);
        return super.b.a(l);
    }

    public final int a(Locale locale)
    {
        return super.b.a(locale);
    }

    public final long a(long l, int i)
    {
        e.a(l, null);
        l = super.b.a(l, i);
        e.a(l, "resulting");
        return l;
    }

    public final long a(long l, long l1)
    {
        e.a(l, null);
        l = super.b.a(l, l1);
        e.a(l, "resulting");
        return l;
    }

    public final long a(long l, String s, Locale locale)
    {
        e.a(l, null);
        l = super.b.a(l, s, locale);
        e.a(l, "resulting");
        return l;
    }

    public final String a(long l, Locale locale)
    {
        e.a(l, null);
        return super.b.a(l, locale);
    }

    public final int b(long l, long l1)
    {
        e.a(l, "minuend");
        e.a(l1, "subtrahend");
        return super.b.b(l, l1);
    }

    public final long b(long l, int i)
    {
        e.a(l, null);
        l = super.b.b(l, i);
        e.a(l, "resulting");
        return l;
    }

    public final String b(long l, Locale locale)
    {
        e.a(l, null);
        return super.b.b(l, locale);
    }

    public final boolean b(long l)
    {
        e.a(l, null);
        return super.b.b(l);
    }

    public final int c(long l)
    {
        e.a(l, null);
        return super.b.c(l);
    }

    public final long c(long l, long l1)
    {
        e.a(l, "minuend");
        e.a(l1, "subtrahend");
        return super.b.c(l, l1);
    }

    public final long d(long l)
    {
        e.a(l, null);
        l = super.b.d(l);
        e.a(l, "resulting");
        return l;
    }

    public final alz d()
    {
        return a;
    }

    public final long e(long l)
    {
        e.a(l, null);
        l = super.b.e(l);
        e.a(l, "resulting");
        return l;
    }

    public final alz e()
    {
        return c;
    }

    public final long f(long l)
    {
        e.a(l, null);
        l = super.b.f(l);
        e.a(l, "resulting");
        return l;
    }

    public final alz f()
    {
        return d;
    }

    (amv amv1, alt alt1, alz alz, alz alz1, alz alz2)
    {
        e = amv1;
        super(alt1, alt1.a());
        a = alz;
        c = alz1;
        d = alz2;
    }
}
