// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            AsyncTask

class this._cls0 extends FutureTask
{

    final AsyncTask this$0;

    protected void done()
    {
        try
        {
            AsyncTask.access$400(AsyncTask.this, get());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w("AsyncTask", interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            throw new RuntimeException("An error occured while executing doInBackground()", executionexception.getCause());
        }
        catch (CancellationException cancellationexception)
        {
            AsyncTask.access$400(AsyncTask.this, null);
        }
    }

    (Callable callable)
    {
        this$0 = AsyncTask.this;
        super(callable);
    }
}
