// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service;

import com.connectsdk.device.ConnectableDeviceListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.connectsdk.service:
//            DeviceService

class val.capabilities
    implements Runnable
{

    final DeviceService this$0;
    final List val$capabilities;

    public void run()
    {
        nnectableDeviceListenerPair nnectabledevicelistenerpair;
        for (Iterator iterator = deviceListeners.iterator(); iterator.hasNext(); nnectabledevicelistenerpair.listener.onCapabilityUpdated(nnectabledevicelistenerpair.device, val$capabilities, null))
        {
            nnectabledevicelistenerpair = (nnectableDeviceListenerPair)iterator.next();
        }

    }

    Listener()
    {
        this$0 = final_deviceservice;
        val$capabilities = List.this;
        super();
    }
}
