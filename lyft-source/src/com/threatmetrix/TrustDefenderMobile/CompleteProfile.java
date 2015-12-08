// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            TrustDefenderMobile

class CompleteProfile
    implements Runnable
{

    private TrustDefenderMobile a;
    private CountDownLatch b;

    public CompleteProfile(TrustDefenderMobile trustdefendermobile)
    {
        a = null;
        b = null;
        a = trustdefendermobile;
        b = null;
    }

    public void run()
    {
        a.f();
        if (b != null)
        {
            b.countDown();
        }
    }
}
