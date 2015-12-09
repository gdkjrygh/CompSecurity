// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.mdxcontroller;

import com.netflix.mediaclient.javabridge.ui.Nrdp;
import java.util.concurrent.atomic.AtomicLong;

public final class TransactionId
{

    private static AtomicLong mCounter = new AtomicLong();
    private static Nrdp mNrdp;

    private TransactionId()
    {
    }

    public static long nextTransactionId()
    {
        AtomicLong atomiclong = mCounter;
        atomiclong;
        JVM INSTR monitorenter ;
        long l;
        l = now();
        if (l > mCounter.get())
        {
            break MISSING_BLOCK_LABEL_32;
        }
        l = mCounter.incrementAndGet();
_L2:
        return l;
        mCounter.set(l);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        atomiclong;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static long now()
    {
        if (mNrdp == null)
        {
            return System.currentTimeMillis();
        } else
        {
            return mNrdp.now();
        }
    }

    public static void setTransactionIdSource(Nrdp nrdp)
    {
        mNrdp = nrdp;
        mCounter.set(now());
    }

}
