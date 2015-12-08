// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics

final class C
{

    private boolean a;
    private final CountDownLatch b;

    private C(Crashlytics crashlytics)
    {
        a = false;
        b = new CountDownLatch(1);
    }

    C(Crashlytics crashlytics, byte byte0)
    {
        this(crashlytics);
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
