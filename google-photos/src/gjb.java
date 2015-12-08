// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

final class gjb
    implements gjf
{

    private final Locale a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;

    gjb(gjc gjc1)
    {
        a = gjc1.a;
        b = gjc1.b;
        c = gjc1.c;
        d = gjc1.d;
        e = gjc1.e;
    }

    public final Locale a()
    {
        return a;
    }

    public final boolean a(double d1, double d2)
    {
        return d1 >= b && d1 <= d && d2 >= c && d2 <= e;
    }
}
