// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.core;

import com.qihoo360.mobilesafe.core.d.c;
import com.qihoo360.mobilesafe.service.ProcessInfo;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.qihoo360.mobilesafe.core:
//            b

class e
    implements Runnable
{

    final b a;
    private final CountDownLatch b;
    private final CountDownLatch c;
    private final ProcessInfo d;
    private final boolean e;

    public void run()
    {
        Exception exception1;
        try
        {
            c.await();
            System.currentTimeMillis();
            com.qihoo360.mobilesafe.core.d.c.a(com.qihoo360.mobilesafe.core.b.b(a), d, e);
        }
        catch (Exception exception)
        {
            b.countDown();
            return;
        }
        finally
        {
            b.countDown();
        }
        b.countDown();
        return;
        throw exception1;
    }

    rocessInfo(b b1, CountDownLatch countdownlatch, CountDownLatch countdownlatch1, ProcessInfo processinfo, boolean flag)
    {
        a = b1;
        b = countdownlatch;
        c = countdownlatch1;
        d = processinfo;
        e = flag;
        super();
    }
}
