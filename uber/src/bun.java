// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.g;
import java.util.Locale;

public final class bun
    implements bvv
{

    private static volatile bun a;

    private bun()
    {
    }

    public static bun a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        bun;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new bun();
        }
        bun;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        bun;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String a(String s)
    {
        return s;
    }

    public final Locale b()
    {
        return Locale.getDefault();
    }

    public final g c()
    {
        return new g(Locale.getDefault().getCountry());
    }

    public final g d()
    {
        return c();
    }
}
