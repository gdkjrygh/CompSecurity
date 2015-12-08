// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

final class bia
    implements Runnable
{

    private bhy a;

    bia(bhy bhy1)
    {
        a = bhy1;
        super();
    }

    public final void run()
    {
        try
        {
            SystemClock.elapsedRealtime();
            bhy.c(a).get();
            a.runOnUiThread(bhy.d(a));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
            return;
        }
        catch (ExecutionException executionexception)
        {
            Log.e(bhy.k(), "loading of preferences failed", executionexception);
        }
    }
}
