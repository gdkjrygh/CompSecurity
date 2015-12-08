// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.CancellationException;

// Referenced classes of package bolts:
//            Task, CancellationToken, Continuation

final class ct
    implements Runnable
{

    final CancellationToken a;
    final kCompletionSource b;
    final Continuation c;
    final Task d;

    public void run()
    {
        if (a != null && a.a())
        {
            b.c();
            return;
        }
        try
        {
            Object obj = c.then(d);
            b.b(obj);
            return;
        }
        catch (CancellationException cancellationexception)
        {
            b.c();
            return;
        }
        catch (Exception exception)
        {
            b.b(exception);
        }
    }

    tion(CancellationToken cancellationtoken, kCompletionSource kcompletionsource, Continuation continuation, Task task)
    {
        a = cancellationtoken;
        b = kcompletionsource;
        c = continuation;
        d = task;
        super();
    }
}
