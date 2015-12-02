// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class ad
{

    private ad()
    {
    }

    public static Object a(BlockingQueue blockingqueue)
    {
        boolean flag = false;
_L2:
        Object obj = blockingqueue.take();
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        return obj;
        InterruptedException interruptedexception;
        interruptedexception;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        blockingqueue;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw blockingqueue;
    }

    public static Object a(Future future)
    {
        boolean flag = false;
_L2:
        Object obj = future.get();
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        return obj;
        InterruptedException interruptedexception;
        interruptedexception;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        future;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw future;
    }

    public static Object a(Future future, long l, TimeUnit timeunit)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        flag = flag2;
        long l1 = timeunit.toNanos(l);
        flag = flag2;
        long l2 = System.nanoTime();
        l = l1;
_L2:
        flag = flag1;
        timeunit = ((TimeUnit) (future.get(l, TimeUnit.NANOSECONDS)));
        if (flag1)
        {
            Thread.currentThread().interrupt();
        }
        return timeunit;
        timeunit;
        flag = true;
        flag1 = true;
        l = System.nanoTime();
        l = (l2 + l1) - l;
        if (true) goto _L2; else goto _L1
_L1:
        future;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw future;
    }

    public static void a(BlockingQueue blockingqueue, Object obj)
    {
        boolean flag = false;
_L2:
        blockingqueue.put(obj);
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        blockingqueue;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw blockingqueue;
    }
}
