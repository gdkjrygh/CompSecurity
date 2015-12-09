// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery.provider;

import java.util.TimerTask;

// Referenced classes of package com.connectsdk.discovery.provider:
//            SSDPDiscoveryProvider

class this._cls0 extends TimerTask
{

    final SSDPDiscoveryProvider this$0;

    public void run()
    {
        sendSearch();
    }

    ()
    {
        this$0 = SSDPDiscoveryProvider.this;
        super();
    }
}
