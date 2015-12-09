// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Locale;

// Referenced classes of package com.paypal.android.sdk:
//            fi, g

public final class ea
    implements fi
{

    private static volatile ea a;

    private ea()
    {
    }

    public static ea a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        com/paypal/android/sdk/ea;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new ea();
        }
        com/paypal/android/sdk/ea;
        JVM INSTR monitorexit ;
_L2:
        return a;
        Exception exception;
        exception;
        com/paypal/android/sdk/ea;
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
