// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class mtu
    implements ThreadFactory
{

    private final AtomicInteger a = new AtomicInteger(1);

    mtu()
    {
    }

    public final Thread newThread(Runnable runnable)
    {
        int i = a.getAndIncrement();
        runnable = new Thread(runnable, (new StringBuilder(27)).append("BackgroundTask #").append(i).toString());
        runnable.setPriority(1);
        return runnable;
    }
}
