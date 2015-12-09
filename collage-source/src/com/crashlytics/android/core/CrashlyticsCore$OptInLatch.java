// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore

private class <init>
{

    private final CountDownLatch latch;
    private boolean send;
    final CrashlyticsCore this$0;

    void await()
    {
        try
        {
            latch.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    boolean getOptIn()
    {
        return send;
    }

    void setOptIn(boolean flag)
    {
        send = flag;
        latch.countDown();
    }

    private ()
    {
        this$0 = CrashlyticsCore.this;
        super();
        send = false;
        latch = new CountDownLatch(1);
    }

    latch(latch latch1)
    {
        this();
    }
}
