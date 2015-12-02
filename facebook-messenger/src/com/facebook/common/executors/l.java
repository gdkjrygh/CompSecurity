// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import android.os.Handler;
import com.google.common.d.a.s;
import com.google.common.d.a.t;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.common.executors:
//            k

public class l extends k
    implements s, Runnable, ScheduledFuture
{

    private final t a;

    public l(Handler handler, Runnable runnable, Object obj)
    {
        super(handler);
        a = t.a(runnable, obj);
    }

    public l(Handler handler, Callable callable)
    {
        super(handler);
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

    public volatile Object get()
    {
        return super.get();
    }

    public volatile Object get(long l1, TimeUnit timeunit)
    {
        return super.get(l1, timeunit);
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
