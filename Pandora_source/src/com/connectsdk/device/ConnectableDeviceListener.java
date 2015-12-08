// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.device;

import com.connectsdk.service.DeviceService;
import com.connectsdk.service.command.ServiceCommandError;
import java.util.List;

// Referenced classes of package com.connectsdk.device:
//            ConnectableDevice

public interface ConnectableDeviceListener
{

    public abstract void onCapabilityUpdated(ConnectableDevice connectabledevice, List list, List list1);

    public abstract void onConnectionFailed(ConnectableDevice connectabledevice, ServiceCommandError servicecommanderror);

    public abstract void onDeviceDisconnected(ConnectableDevice connectabledevice);

    public abstract void onDeviceReady(ConnectableDevice connectabledevice);

    public abstract void onPairingRequired(ConnectableDevice connectabledevice, DeviceService deviceservice, com.connectsdk.service.DeviceService.PairingType pairingtype);
}
