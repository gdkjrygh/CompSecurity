// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class p
    implements ThreadFactory
{

    protected final AtomicLong a = new AtomicLong();
    private int b;

    public p()
    {
        b = Thread.currentThread().getPriority();
    }

    protected String a()
    {
        return String.format(Locale.ENGLISH, "com.facebook.ads thread-%d %tF %<tT", new Object[] {
            Long.valueOf(a.incrementAndGet()), Long.valueOf(System.currentTimeMillis())
        });
    }

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(null, runnable, a(), 0L);
        runnable.setPriority(b);
        return runnable;
    }
}
