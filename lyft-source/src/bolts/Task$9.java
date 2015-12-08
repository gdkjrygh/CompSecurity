// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.concurrent.Executor;

// Referenced classes of package bolts:
//            Continuation, Task, CancellationToken

class ect
    implements Continuation
{

    final skCompletionSource a;
    final Continuation b;
    final Executor c;
    final CancellationToken d;
    final Task e;

    public Void a(Task task)
    {
        Task.a(a, b, task, c, d);
        return null;
    }

    public Object then(Task task)
    {
        return a(task);
    }

    ationToken(Task task, skCompletionSource skcompletionsource, Continuation continuation, Executor executor, CancellationToken cancellationtoken)
    {
        e = task;
        a = skcompletionsource;
        b = continuation;
        c = executor;
        d = cancellationtoken;
        super();
    }
}
