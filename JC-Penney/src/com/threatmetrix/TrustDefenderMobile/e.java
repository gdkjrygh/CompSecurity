// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            f, c

final class e extends f
{

    final c a;

    e(c c1, c c2, CountDownLatch countdownlatch)
    {
        a = c1;
        super(c2, countdownlatch);
    }

    public final void run()
    {
        try
        {
            c.e();
            c.e(b);
        }
        catch (InterruptedException interruptedexception)
        {
            c.e();
        }
        if (c != null)
        {
            c.e();
            (new StringBuilder("getBrowserInfo countdown using latch: ")).append(c.hashCode()).append(" with count: ").append(c.getCount());
            c.countDown();
        }
    }
}
