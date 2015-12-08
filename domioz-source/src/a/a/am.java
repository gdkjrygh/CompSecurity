// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class am
    implements ThreadFactory
{

    public Thread.UncaughtExceptionHandler a;
    private final AtomicInteger b = new AtomicInteger(1);

    public am()
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
                a/a/am.getSimpleName(), Integer.valueOf(b.getAndIncrement())
            }));
            runnable.setUncaughtExceptionHandler(a);
            return runnable;
        }
    }
}
