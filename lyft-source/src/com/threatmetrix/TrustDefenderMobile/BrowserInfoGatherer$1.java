// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            BrowserInfoGatherer, JSExecutor

class mpleteBrowserInfoRequest extends mpleteBrowserInfoRequest
{

    final BrowserInfoGatherer a;

    public void run()
    {
        Log.d(BrowserInfoGatherer.j(), "Calling initJSExecutor() - on UI thread");
        BrowserInfoGatherer.a(b, new JSExecutor(BrowserInfoGatherer.a(a), BrowserInfoGatherer.b(a), BrowserInfoGatherer.c(a)));
        try
        {
            BrowserInfoGatherer.d(b).d();
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e(BrowserInfoGatherer.j(), "Interrupted initing js engine");
        }
        Log.d(BrowserInfoGatherer.j(), "js exec init complete");
        if (c != null)
        {
            Log.d(BrowserInfoGatherer.j(), (new StringBuilder()).append("js exec init countdown using latch: ").append(c.hashCode()).append(" with count: ").append(c.getCount()).toString());
            c.countDown();
        }
    }

    mpleteBrowserInfoRequest(BrowserInfoGatherer browserinfogatherer, BrowserInfoGatherer browserinfogatherer1, CountDownLatch countdownlatch)
    {
        a = browserinfogatherer;
        super(browserinfogatherer1, countdownlatch);
    }
}
