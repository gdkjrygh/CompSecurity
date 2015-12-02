// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.a;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.qihoo.security.opti.a:
//            c

class c
    implements Runnable
{

    final CountDownLatch a;
    final Latch b;
    final CountDownLatch c;
    final c d;

    public void run()
    {
        Exception exception;
        try
        {
            a.await();
            com.qihoo.security.opti.a.c.a(d, b);
        }
        catch (InterruptedException interruptedexception)
        {
            c.countDown();
            return;
        }
        finally
        {
            c.countDown();
        }
        c.countDown();
        return;
        throw exception;
    }

    Latch(c c1, CountDownLatch countdownlatch, Latch latch, CountDownLatch countdownlatch1)
    {
        d = c1;
        a = countdownlatch;
        b = latch;
        c = countdownlatch1;
        super();
    }
}
