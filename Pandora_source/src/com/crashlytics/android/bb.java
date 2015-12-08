// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.crashlytics.android:
//            d

final class bb
{

    private boolean a;
    private final CountDownLatch b;

    private bb(d d)
    {
        a = false;
        b = new CountDownLatch(1);
    }

    bb(d d, byte byte0)
    {
        this(d);
    }

    final void a(boolean flag)
    {
        a = flag;
        b.countDown();
    }

    final boolean a()
    {
        return a;
    }

    final void b()
    {
        try
        {
            b.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
