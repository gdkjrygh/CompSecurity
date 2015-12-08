// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

public final class dfg
{

    public final Queue a = new ConcurrentLinkedQueue();

    public dfg()
    {
    }

    public final ExecutorService a(ExecutorService executorservice)
    {
        a.add(b.a(executorservice, "executor", null));
        return executorservice;
    }

    public final void a()
    {
        do
        {
            ExecutorService executorservice = (ExecutorService)a.poll();
            if (executorservice != null)
            {
                executorservice.shutdown();
            } else
            {
                return;
            }
        } while (true);
    }
}
