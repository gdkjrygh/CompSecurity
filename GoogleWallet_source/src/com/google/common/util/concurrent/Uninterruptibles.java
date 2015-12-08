// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class Uninterruptibles
{

    public static Object getUninterruptibly(Future future)
        throws ExecutionException
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

    public static Object takeUninterruptibly(BlockingQueue blockingqueue)
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
}
