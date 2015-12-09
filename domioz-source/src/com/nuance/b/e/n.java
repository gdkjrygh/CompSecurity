// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class n
{

    private String a;
    private volatile CountDownLatch b;

    public n(String s)
    {
        a = s;
        b = null;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (d())
        {
            Log.w("Nina", (new StringBuilder("Starting a new latch when another one hasn't finished. (")).append(a).append(")").toString());
            b.countDown();
        }
        Log.d("Nina", (new StringBuilder("Starting latch (")).append(a).append(")").toString());
        b = new CountDownLatch(1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (d())
        {
            Log.d("Nina", (new StringBuilder("Finishing latch (")).append(a).append(")").toString());
            b.countDown();
            b = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean c()
    {
        CountDownLatch countdownlatch = b;
        if (countdownlatch != null)
        {
            Log.d("Nina", (new StringBuilder("Waiting for finish... (")).append(a).append(")").toString());
            return countdownlatch.await(30000L, TimeUnit.MILLISECONDS);
        } else
        {
            return true;
        }
    }

    public final boolean d()
    {
        return b != null;
    }
}
