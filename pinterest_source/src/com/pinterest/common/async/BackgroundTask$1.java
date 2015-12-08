// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.common.async;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class 
    implements ThreadFactory
{

    private final AtomicInteger _count = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder("BackgroundTask #")).append(_count.getAndIncrement()).toString());
    }

    ()
    {
    }
}
