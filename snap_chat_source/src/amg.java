// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class amg extends amR
{

    private final String a;

    amg(String s)
    {
        super(alu.w());
        a = s;
    }

    public final int a(long l)
    {
        return 1;
    }

    public final int a(Locale locale)
    {
        return a.length();
    }

    public final long a(long l, String s, Locale locale)
    {
        if (!a.equals(s) && !"1".equals(s))
        {
            throw new alB(alu.w(), s);
        } else
        {
            return l;
        }
    }

    public final String a(int i, Locale locale)
    {
        return a;
    }

    public final long b(long l, int i)
    {
        amX.a(this, i, 1, 1);
        return l;
    }

    public final long d(long l)
    {
        return 0x8000000000000000L;
    }

    public final alz d()
    {
        return anj.a(alA.l());
    }

    public final long e(long l)
    {
        return 0x7fffffffffffffffL;
    }

    public final alz e()
    {
        return null;
    }

    public final int g()
    {
        return 1;
    }

    public final int h()
    {
        return 1;
    }
}
