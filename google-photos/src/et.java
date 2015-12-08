// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

final class et extends FutureTask
{

    private eq a;

    et(eq eq1, Callable callable)
    {
        a = eq1;
        super(callable);
    }

    protected final void done()
    {
        try
        {
            Object obj = get();
            eq.b(a, obj);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w("AsyncTask", interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            throw new RuntimeException("An error occurred while executing doInBackground()", executionexception.getCause());
        }
        catch (CancellationException cancellationexception)
        {
            eq.b(a, null);
        }
        catch (Throwable throwable)
        {
            throw new RuntimeException("An error occurred while executing doInBackground()", throwable);
        }
    }
}
