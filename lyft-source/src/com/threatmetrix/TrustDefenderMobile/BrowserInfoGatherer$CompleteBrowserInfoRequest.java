// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            BrowserInfoGatherer

class c
    implements Runnable
{

    BrowserInfoGatherer b;
    CountDownLatch c;

    public void run()
    {
        throw new NoSuchMethodError();
    }

    public Y(BrowserInfoGatherer browserinfogatherer, CountDownLatch countdownlatch)
    {
        b = null;
        c = null;
        b = browserinfogatherer;
        c = countdownlatch;
    }
}
