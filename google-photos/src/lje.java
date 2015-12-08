// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.concurrent.FutureTask;

final class lje extends FutureTask
{

    private ljd a;

    lje(ljd ljd1, Runnable runnable, Object obj)
    {
        a = ljd1;
        super(runnable, obj);
    }

    protected final void setException(Throwable throwable)
    {
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = ljb.b(a.a);
        if (uncaughtexceptionhandler == null) goto _L2; else goto _L1
_L1:
        uncaughtexceptionhandler.uncaughtException(Thread.currentThread(), throwable);
_L4:
        super.setException(throwable);
        return;
_L2:
        if (Log.isLoggable("GAv4", 6))
        {
            Log.e("GAv4", (new StringBuilder("MeasurementExecutor: job failed with ")).append(throwable).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
