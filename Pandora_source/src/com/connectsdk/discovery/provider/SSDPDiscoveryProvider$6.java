// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery.provider;

import com.connectsdk.discovery.DiscoveryProviderListener;
import com.connectsdk.service.config.ServiceDescription;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.connectsdk.discovery.provider:
//            SSDPDiscoveryProvider

class val.service
    implements Runnable
{

    final SSDPDiscoveryProvider this$0;
    final ServiceDescription val$service;

    public void run()
    {
        for (Iterator iterator = SSDPDiscoveryProvider.access$000(SSDPDiscoveryProvider.this).iterator(); iterator.hasNext(); ((DiscoveryProviderListener)iterator.next()).onServiceRemoved(SSDPDiscoveryProvider.this, val$service)) { }
    }

    ()
    {
        this$0 = final_ssdpdiscoveryprovider;
        val$service = ServiceDescription.this;
        super();
    }
}
