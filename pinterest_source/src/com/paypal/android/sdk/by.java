// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Locale;

// Referenced classes of package com.paypal.android.sdk:
//            cf, g

public final class by
    implements cf
{

    private static volatile by a;

    private by()
    {
    }

    public static by a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/paypal/android/sdk/by;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new by();
        }
        com/paypal/android/sdk/by;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/paypal/android/sdk/by;
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
