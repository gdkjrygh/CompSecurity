// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.a;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.qihoo.security.opti.a:
//            a

static final class d
    implements Runnable
{

    final CountDownLatch a;
    final Latch b;
    final Map c;
    final CountDownLatch d;

    public void run()
    {
        Exception exception1;
        try
        {
            a.await();
            float f = com.qihoo.security.opti.a.a.a(b.b);
            d d1 = new <init>(b.a, f);
            c.put(b.a, d1);
        }
        catch (Exception exception)
        {
            d.countDown();
            return;
        }
        finally
        {
            d.countDown();
        }
        d.countDown();
        return;
        throw exception1;
    }

    Latch(CountDownLatch countdownlatch, Latch latch, Map map, CountDownLatch countdownlatch1)
    {
        a = countdownlatch;
        b = latch;
        c = map;
        d = countdownlatch1;
        super();
    }
}
