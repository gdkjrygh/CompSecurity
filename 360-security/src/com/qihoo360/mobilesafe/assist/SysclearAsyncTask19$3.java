// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.assist;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.qihoo360.mobilesafe.assist:
//            SysclearAsyncTask19

class a extends FutureTask
{

    final SysclearAsyncTask19 a;

    protected void done()
    {
        try
        {
            SysclearAsyncTask19.c(a, get());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w("SysclearAsyncTask19", interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            throw new RuntimeException("An error occured while executing doInBackground()", executionexception.getCause());
        }
        catch (CancellationException cancellationexception)
        {
            SysclearAsyncTask19.c(a, null);
        }
    }

    (SysclearAsyncTask19 sysclearasynctask19, Callable callable)
    {
        a = sysclearasynctask19;
        super(callable);
    }
}
