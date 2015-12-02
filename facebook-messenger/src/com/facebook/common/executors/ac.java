// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import com.google.common.d.a.g;
import com.google.common.d.a.s;
import com.google.common.d.a.t;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class ac extends g
    implements s, Runnable, ScheduledFuture
{

    private final t a;

    public ac(Runnable runnable, Object obj)
    {
        a = t.a(runnable, obj);
    }

    public ac(Callable callable)
    {
        a = t.a(callable);
    }

    public int a(Delayed delayed)
    {
        throw new UnsupportedOperationException();
    }

    protected t a()
    {
        return a;
    }

    public void a(Runnable runnable, Executor executor)
    {
        a().a(runnable, executor);
    }

    protected Future b()
    {
        return a();
    }

    protected Object c()
    {
        return a();
    }

    public int compareTo(Object obj)
    {
        return a((Delayed)obj);
    }

    public long getDelay(TimeUnit timeunit)
    {
        throw new UnsupportedOperationException();
    }

    public void run()
    {
        a().run();
    }
}
