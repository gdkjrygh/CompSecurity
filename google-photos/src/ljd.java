// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ljd extends ThreadPoolExecutor
{

    final ljb a;

    public ljd(ljb ljb)
    {
        a = ljb;
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        setThreadFactory(new ljf());
    }

    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new lje(this, runnable, obj);
    }
}
