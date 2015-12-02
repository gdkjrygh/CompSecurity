// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutorService;

public final class byc
{

    private static final String a = byc.getSimpleName();
    private static bqw b;

    public byc()
    {
    }

    static bqw a()
    {
        return b;
    }

    public static final String a(ExecutorService executorservice, Context context, bsx bsx1, String s)
    {
        byc;
        JVM INSTR monitorenter ;
        bqw bqw1 = b;
        if (bqw1 != null) goto _L2; else goto _L1
_L1:
        bqw bqw2 = bqw.a();
        b = bqw2;
        context = bqw2.a(context, bsx1.e(), bqx.b, s);
        executorservice.submit(new byd());
        (new StringBuilder("Init risk component: ")).append(bqw.d());
        executorservice = context;
_L4:
        byc;
        JVM INSTR monitorexit ;
        return executorservice;
        executorservice;
        Log.e("paypal.sdk", (new StringBuilder("An internal component failed to initialize: ")).append(executorservice.getMessage()).toString());
        executorservice = null;
        continue; /* Loop/switch isn't completed */
_L2:
        executorservice = b.g();
        if (true) goto _L4; else goto _L3
_L3:
        executorservice;
        throw executorservice;
    }

}
