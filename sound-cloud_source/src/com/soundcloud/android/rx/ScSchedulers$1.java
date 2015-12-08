// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.rx;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

final class val.threadIdentifier
    implements ThreadFactory
{

    final AtomicLong counter = new AtomicLong();
    final String val$threadIdentifier;

    public final Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder()).append(val$threadIdentifier).append("-").append(counter.incrementAndGet()).toString());
    }

    ()
    {
        val$threadIdentifier = s;
        super();
    }
}
