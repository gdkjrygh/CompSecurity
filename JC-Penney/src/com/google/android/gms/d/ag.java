// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.util.Log;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.d:
//            af, ad

class ag extends FutureTask
{

    final af a;

    ag(af af1, Runnable runnable, Object obj)
    {
        a = af1;
        super(runnable, obj);
    }

    protected void setException(Throwable throwable)
    {
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = ad.b(a.a);
        if (uncaughtexceptionhandler == null) goto _L2; else goto _L1
_L1:
        uncaughtexceptionhandler.uncaughtException(Thread.currentThread(), throwable);
_L4:
        super.setException(throwable);
        return;
_L2:
        if (Log.isLoggable("GAv4", 6))
        {
            Log.e("GAv4", (new StringBuilder()).append("MeasurementExecutor: job failed with ").append(throwable).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
