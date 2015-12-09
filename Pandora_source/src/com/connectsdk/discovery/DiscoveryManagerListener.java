// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.command.ServiceCommandError;

// Referenced classes of package com.connectsdk.discovery:
//            DiscoveryManager

public interface DiscoveryManagerListener
{

    public abstract void onDeviceAdded(DiscoveryManager discoverymanager, ConnectableDevice connectabledevice);

    public abstract void onDeviceRemoved(DiscoveryManager discoverymanager, ConnectableDevice connectabledevice);

    public abstract void onDeviceUpdated(DiscoveryManager discoverymanager, ConnectableDevice connectabledevice);

    public abstract void onDiscoveryFailed(DiscoveryManager discoverymanager, ServiceCommandError servicecommanderror);
}
