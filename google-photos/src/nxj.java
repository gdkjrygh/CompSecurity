// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class nxj
    implements ThreadFactory
{

    private final AtomicInteger a = new AtomicInteger(0);

    nxj(nxh nxh)
    {
    }

    public final Thread newThread(Runnable runnable)
    {
        runnable = Executors.defaultThreadFactory().newThread(runnable);
        int i = a.incrementAndGet();
        runnable.setName((new StringBuilder(36)).append("Resource Decoder Thread #").append(i).toString());
        return runnable;
    }
}
