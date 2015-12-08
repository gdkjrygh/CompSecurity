// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.Executor;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            PriorityAsyncTask, PriorityFutureTask, Dependency

class b
    implements Executor
{

    private final Executor a;
    private final PriorityAsyncTask b;

    static PriorityAsyncTask a(b b1)
    {
        return b1.b;
    }

    public void execute(Runnable runnable)
    {
        a.execute(new PriorityFutureTask(runnable, null) {

            final PriorityAsyncTask.ProxyExecutor a;

            public Dependency a()
            {
                return PriorityAsyncTask.ProxyExecutor.a(a);
            }

            
            {
                a = PriorityAsyncTask.ProxyExecutor.this;
                super(runnable, obj);
            }
        });
    }

    public _cls1.a(Executor executor, PriorityAsyncTask priorityasynctask)
    {
        a = executor;
        b = priorityasynctask;
    }
}
