// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.c;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package b.a.a.a.a.c:
//            a

final class d extends FutureTask
{

    final a a;

    d(a a1, Callable callable)
    {
        a = a1;
        super(callable);
    }

    protected final void done()
    {
        try
        {
            b.a.a.a.a.c.a.b(a, get());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        catch (ExecutionException executionexception)
        {
            throw new RuntimeException("An error occured while executing doInBackground()", executionexception.getCause());
        }
        catch (CancellationException cancellationexception)
        {
            b.a.a.a.a.c.a.b(a, null);
        }
    }
}
