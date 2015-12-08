// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class bk
    implements ThreadFactory
{

    public Thread.UncaughtExceptionHandler a;
    private final AtomicInteger b = new AtomicInteger(1);

    public bk()
    {
    }

    public Thread newThread(Runnable runnable)
    {
        if (a == null)
        {
            throw new IllegalStateException("No UncaughtExceptionHandler. You must call setUncaughtExceptionHandler before creating a new thread");
        } else
        {
            runnable = new Thread(runnable, String.format("%s #%d", new Object[] {
                bo/app/bk.getSimpleName(), Integer.valueOf(b.getAndIncrement())
            }));
            runnable.setUncaughtExceptionHandler(a);
            return runnable;
        }
    }
}
