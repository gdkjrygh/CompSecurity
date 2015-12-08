// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package android.support.v4.content:
//            ModernAsyncTask

final class v extends FutureTask
{

    final ModernAsyncTask a;

    v(ModernAsyncTask modernasynctask, Callable callable)
    {
        a = modernasynctask;
        super(callable);
    }

    protected final void done()
    {
        try
        {
            Object obj = get();
            ModernAsyncTask.b(a, obj);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        catch (ExecutionException executionexception)
        {
            throw new RuntimeException("An error occurred while executing doInBackground()", executionexception.getCause());
        }
        catch (CancellationException cancellationexception)
        {
            ModernAsyncTask.b(a, null);
        }
        catch (Throwable throwable)
        {
            throw new RuntimeException("An error occurred while executing doInBackground()", throwable);
        }
    }
}
