// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics

class <init>
{

    final Crashlytics a;
    private boolean b;
    private final CountDownLatch c;

    void a(boolean flag)
    {
        b = flag;
        c.countDown();
    }

    boolean a()
    {
        return b;
    }

    void b()
    {
        try
        {
            c.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    private (Crashlytics crashlytics)
    {
        a = crashlytics;
        super();
        b = false;
        c = new CountDownLatch(1);
    }

    c(Crashlytics crashlytics, c c1)
    {
        this(crashlytics);
    }
}
