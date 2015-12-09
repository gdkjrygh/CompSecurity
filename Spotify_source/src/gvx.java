// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class gvx extends ThreadPoolExecutor
{

    public gvx()
    {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new gwo());
    }

    final void a(int i)
    {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    public final Future submit(Runnable runnable)
    {
        runnable = new gvy((gvc)runnable);
        execute(runnable);
        return runnable;
    }
}
