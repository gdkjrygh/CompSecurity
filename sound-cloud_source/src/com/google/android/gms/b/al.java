// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.util.Log;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.gms.b:
//            aj

final class al extends FutureTask
{

    final aj.a a;

    al(aj.a a1, Runnable runnable, Object obj)
    {
        a = a1;
        super(runnable, obj);
    }

    protected final void setException(Throwable throwable)
    {
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = aj.b(a.a);
        if (uncaughtexceptionhandler == null) goto _L2; else goto _L1
_L1:
        uncaughtexceptionhandler.uncaughtException(Thread.currentThread(), throwable);
_L4:
        super.setException(throwable);
        return;
_L2:
        if (Log.isLoggable("GAv4", 6))
        {
            (new StringBuilder("MeasurementExecutor: job failed with ")).append(throwable);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
