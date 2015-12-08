// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.osp;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.netflix.mediaclient.android.osp:
//            AsyncTaskCompat

class this._cls0 extends FutureTask
{

    final AsyncTaskCompat this$0;

    protected void done()
    {
        try
        {
            AsyncTaskCompat.access$400(AsyncTaskCompat.this, get());
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
            AsyncTaskCompat.access$400(AsyncTaskCompat.this, null);
        }
    }

    (Callable callable)
    {
        this$0 = AsyncTaskCompat.this;
        super(callable);
    }
}
