// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import java.util.concurrent.CountDownLatch;

final class m
{

    private Boolean a;
    private final CountDownLatch b = new CountDownLatch(1);

    m()
    {
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = Boolean.valueOf(false);
            b.countDown();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
