// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service;

import com.connectsdk.device.ConnectableDeviceListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.connectsdk.service:
//            DeviceService

class val.capability
    implements Runnable
{

    final DeviceService this$0;
    final String val$capability;

    public void run()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(val$capability);
        nnectableDeviceListenerPair nnectabledevicelistenerpair;
        for (Iterator iterator = deviceListeners.iterator(); iterator.hasNext(); nnectabledevicelistenerpair.listener.onCapabilityUpdated(nnectabledevicelistenerpair.device, arraylist, null))
        {
            nnectabledevicelistenerpair = (nnectableDeviceListenerPair)iterator.next();
        }

    }

    Listener()
    {
        this$0 = final_deviceservice;
        val$capability = String.this;
        super();
    }
}
