// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            ag

class g
    implements Runnable
{

    private ag a;
    private CountDownLatch b;

    public g(ag ag1, CountDownLatch countdownlatch)
    {
        a = null;
        b = null;
        a = ag1;
        b = countdownlatch;
    }

    public void run()
    {
        a.c();
        if (b != null)
        {
            b.countDown();
        }
    }
}
