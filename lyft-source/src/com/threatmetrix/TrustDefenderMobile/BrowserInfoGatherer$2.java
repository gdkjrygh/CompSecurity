// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            BrowserInfoGatherer

class mpleteBrowserInfoRequest extends mpleteBrowserInfoRequest
{

    final BrowserInfoGatherer a;

    public void run()
    {
        try
        {
            Log.d(BrowserInfoGatherer.j(), "Calling getBrowserInfo() - on UI thread");
            BrowserInfoGatherer.e(b);
        }
        catch (InterruptedException interruptedexception)
        {
            Log.d(BrowserInfoGatherer.j(), "getBrowserInfo interrupted", interruptedexception);
        }
        if (c != null)
        {
            Log.d(BrowserInfoGatherer.j(), (new StringBuilder()).append("getBrowserInfo countdown using latch: ").append(c.hashCode()).append(" with count: ").append(c.getCount()).toString());
            c.countDown();
        }
    }

    mpleteBrowserInfoRequest(BrowserInfoGatherer browserinfogatherer, BrowserInfoGatherer browserinfogatherer1, CountDownLatch countdownlatch)
    {
        a = browserinfogatherer;
        super(browserinfogatherer1, countdownlatch);
    }
}
