// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.paypal.android.sdk:
//            ad, cn, ae, f

public final class hp
{

    private static final String a = com/paypal/android/sdk/hp.getSimpleName();
    private static ad b;

    public hp()
    {
    }

    static ad a()
    {
        return b;
    }

    public static final String a(ExecutorService executorservice, Context context, cn cn1, String s)
    {
        com/paypal/android/sdk/hp;
        JVM INSTR monitorenter ;
        ad ad1 = b;
        if (ad1 != null) goto _L2; else goto _L1
_L1:
        ad ad2 = ad.a();
        b = ad2;
        context = ad2.a(context, cn1.e(), ae.b, s, null, false, null, null);
        executorservice.submit(new f());
        (new StringBuilder("Init risk component: ")).append(ad.d());
        executorservice = context;
_L4:
        com/paypal/android/sdk/hp;
        JVM INSTR monitorexit ;
        return executorservice;
        executorservice;
        Log.e("paypal.sdk", (new StringBuilder("An internal component failed to initialize: ")).append(executorservice.getMessage()).toString());
        executorservice = null;
        continue; /* Loop/switch isn't completed */
_L2:
        executorservice = b.g();
        (new StringBuilder("risk component already initialized, returning new pairing id:")).append(executorservice);
        if (true) goto _L4; else goto _L3
_L3:
        executorservice;
        throw executorservice;
    }

}
