// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            f, c, q

final class d extends f
{

    final c a;

    d(c c1, c c2, CountDownLatch countdownlatch)
    {
        a = c1;
        super(c2, countdownlatch);
    }

    public final void run()
    {
        c.e();
        c.a(b, new q(c.a(a), c.b(a), c.c(a)));
        try
        {
            c.d(b).d();
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e(c.e(), "Interrupted initing js engine");
        }
        c.e();
        if (c != null)
        {
            c.e();
            (new StringBuilder("js exec init countdown using latch: ")).append(c.hashCode()).append(" with count: ").append(c.getCount());
            c.countDown();
        }
    }
}
