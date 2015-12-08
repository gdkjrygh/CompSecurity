// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class .AtomicInteger
    implements ThreadFactory
{

    private final AtomicInteger counter = new AtomicInteger(0);

    public final Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder("FacebookSdk #")).append(counter.incrementAndGet()).toString());
    }

    .AtomicInteger()
    {
    }
}
