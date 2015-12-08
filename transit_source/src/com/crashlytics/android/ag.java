// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

final class ag
    implements ThreadFactory
{

    private String a;
    private AtomicLong b;

    ag(String s, AtomicLong atomiclong)
    {
        a = s;
        b = atomiclong;
        super();
    }

    public final Thread newThread(Runnable runnable)
    {
        runnable = Executors.defaultThreadFactory().newThread(runnable);
        runnable.setName(String.format(a, new Object[] {
            Long.valueOf(b.getAndIncrement())
        }));
        return runnable;
    }
}
