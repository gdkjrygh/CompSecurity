// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery;

import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.config.ServiceDescription;

// Referenced classes of package com.connectsdk.discovery:
//            DiscoveryProvider

public interface DiscoveryProviderListener
{

    public abstract void onServiceAdded(DiscoveryProvider discoveryprovider, ServiceDescription servicedescription);

    public abstract void onServiceDiscoveryFailed(DiscoveryProvider discoveryprovider, ServiceCommandError servicecommanderror);

    public abstract void onServiceRemoved(DiscoveryProvider discoveryprovider, ServiceDescription servicedescription);
}
