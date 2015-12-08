// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;


// Referenced classes of package com.adobe.mobile:
//            MobileConfig, StaticMethods, AnalyticsWorker

class this._cls0
    implements Runnable
{

    final MobileConfig this$0;

    public void run()
    {
        StaticMethods.logDebugFormat("Analytics - Privacy status set to opt in, attempting to send all hits in queue.", new Object[0]);
        AnalyticsWorker.sharedInstance().kick(false);
    }

    ()
    {
        this$0 = MobileConfig.this;
        super();
    }
}
