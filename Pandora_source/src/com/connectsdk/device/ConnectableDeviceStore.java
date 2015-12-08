// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.device;

import java.util.List;

// Referenced classes of package com.connectsdk.device:
//            ConnectableDevice

public interface ConnectableDeviceStore
{

    public abstract void addDevice(ConnectableDevice connectabledevice);

    public abstract List getStoredDevices();

    public abstract void removeAll();

    public abstract void removeDevice(ConnectableDevice connectabledevice);

    public abstract void updateDevice(ConnectableDevice connectabledevice);
}
