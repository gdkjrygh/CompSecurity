// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.util.concurrent.CountDownLatch;

public final class Ping
{

    private final CountDownLatch latch = new CountDownLatch(1);
    private long received;
    private long sent;

    Ping()
    {
        sent = -1L;
        received = -1L;
    }

    void cancel()
    {
        if (received != -1L || sent == -1L)
        {
            throw new IllegalStateException();
        } else
        {
            received = sent - 1L;
            latch.countDown();
            return;
        }
    }

    void receive()
    {
        if (received != -1L || sent == -1L)
        {
            throw new IllegalStateException();
        } else
        {
            received = System.nanoTime();
            latch.countDown();
            return;
        }
    }

    void send()
    {
        if (sent != -1L)
        {
            throw new IllegalStateException();
        } else
        {
            sent = System.nanoTime();
            return;
        }
    }
}
