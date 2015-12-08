// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;

final class cva
    implements Callable
{

    private chp a;
    private cay b;
    private cba c;
    private cux d;
    private long e;
    private cuz f;

    cva(cuz cuz1, chp chp, cay cay, cba cba, cux cux, long l)
    {
        f = cuz1;
        a = chp;
        b = cay;
        c = cba;
        d = cux;
        e = l;
        super();
    }

    public final Object call()
    {
        cuz.a(f, a);
        cay cay = cuz.a(f, b, c);
        if (cuz.a(c, cay))
        {
            return null;
        } else
        {
            cuz.a(f, d, a, e, cay, c);
            return null;
        }
    }
}
