// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import java.util.concurrent.CountDownLatch;

final class aa
{

    private final CountDownLatch a = new CountDownLatch(1);
    private long b;
    private long c;

    aa()
    {
        b = -1L;
        c = -1L;
    }

    public void a()
    {
        if (b != -1L)
        {
            throw new IllegalStateException();
        } else
        {
            b = System.nanoTime();
            return;
        }
    }

    public void b()
    {
        if (c != -1L || b == -1L)
        {
            throw new IllegalStateException();
        } else
        {
            c = System.nanoTime();
            a.countDown();
            return;
        }
    }
}
