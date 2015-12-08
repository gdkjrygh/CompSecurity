// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Locale;

public class amV extends alt
    implements Serializable
{

    final alt a;
    private final alu b;

    public amV(alt alt1)
    {
        this(alt1, null);
    }

    public amV(alt alt1, alu alu1)
    {
        if (alt1 == null)
        {
            throw new IllegalArgumentException("The field must not be null");
        }
        a = alt1;
        alu alu2 = alu1;
        if (alu1 == null)
        {
            alu2 = alt1.a();
        }
        b = alu2;
    }

    public int a(long l)
    {
        return a.a(l);
    }

    public final int a(Locale locale)
    {
        return a.a(locale);
    }

    public final long a(long l, int i)
    {
        return a.a(l, i);
    }

    public final long a(long l, long l1)
    {
        return a.a(l, l1);
    }

    public final long a(long l, String s, Locale locale)
    {
        return a.a(l, s, locale);
    }

    public final alu a()
    {
        return b;
    }

    public final String a(int i, Locale locale)
    {
        return a.a(i, locale);
    }

    public final String a(long l, Locale locale)
    {
        return a.a(l, locale);
    }

    public final String a(alO alo, Locale locale)
    {
        return a.a(alo, locale);
    }

    public final int b(long l, long l1)
    {
        return a.b(l, l1);
    }

    public long b(long l, int i)
    {
        return a.b(l, i);
    }

    public final String b()
    {
        return b.a;
    }

    public final String b(int i, Locale locale)
    {
        return a.b(i, locale);
    }

    public final String b(long l, Locale locale)
    {
        return a.b(l, locale);
    }

    public final String b(alO alo, Locale locale)
    {
        return a.b(alo, locale);
    }

    public final boolean b(long l)
    {
        return a.b(l);
    }

    public final int c(long l)
    {
        return a.c(l);
    }

    public final long c(long l, long l1)
    {
        return a.c(l, l1);
    }

    public final boolean c()
    {
        return a.c();
    }

    public final long d(long l)
    {
        return a.d(l);
    }

    public final alz d()
    {
        return a.d();
    }

    public final long e(long l)
    {
        return a.e(l);
    }

    public final alz e()
    {
        return a.e();
    }

    public final long f(long l)
    {
        return a.f(l);
    }

    public final alz f()
    {
        return a.f();
    }

    public int g()
    {
        return a.g();
    }

    public final int h()
    {
        return a.h();
    }

    public String toString()
    {
        return (new StringBuilder("DateTimeField[")).append(b.a).append(']').toString();
    }
}
