// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.device.ConnectableDeviceListener;

// Referenced classes of package com.connectsdk.service:
//            DeviceService

public static class listener
{

    public ConnectableDevice device;
    public ConnectableDeviceListener listener;

    public (ConnectableDevice connectabledevice, ConnectableDeviceListener connectabledevicelistener)
    {
        device = connectabledevice;
        listener = connectabledevicelistener;
    }
}
