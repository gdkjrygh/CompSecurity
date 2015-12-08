// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.paypal.android.sdk:
//            ac, b, a, f

public final class e
{

    private static final String a = com/paypal/android/sdk/e.getSimpleName();
    private static ac b;

    public e()
    {
    }

    static ac a()
    {
        return b;
    }

    public static final String a(ExecutorService executorservice, Context context, b b1, String s)
    {
        com/paypal/android/sdk/e;
        JVM INSTR monitorenter ;
        ac ac1 = b;
        if (ac1 != null) goto _L2; else goto _L1
_L1:
        ac ac2 = ac.a();
        b = ac2;
        context = ac2.a(context, b1.e(), a.b, s);
        executorservice.submit(new f());
        (new StringBuilder("Init risk component: ")).append(ac.c());
        executorservice = context;
_L4:
        com/paypal/android/sdk/e;
        JVM INSTR monitorexit ;
        return executorservice;
        executorservice;
        Log.e("paypal.sdk", (new StringBuilder("An internal component failed to initialize: ")).append(executorservice.getMessage()).toString());
        executorservice = null;
        continue; /* Loop/switch isn't completed */
_L2:
        executorservice = b.f();
        if (true) goto _L4; else goto _L3
_L3:
        executorservice;
        throw executorservice;
    }

}
