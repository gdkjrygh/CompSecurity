// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.device;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.connectsdk.device:
//            ConnectableDevice, ConnectableDeviceListener

class val.removed
    implements Runnable
{

    final ConnectableDevice this$0;
    final List val$removed;

    public void run()
    {
        com.connectsdk.service.tableDeviceListenerPair tabledevicelistenerpair;
        for (Iterator iterator = deviceListeners.iterator(); iterator.hasNext(); tabledevicelistenerpair.listener.onCapabilityUpdated(tabledevicelistenerpair.device, null, val$removed))
        {
            tabledevicelistenerpair = (com.connectsdk.service.tableDeviceListenerPair)iterator.next();
        }

    }

    tener()
    {
        this$0 = final_connectabledevice;
        val$removed = List.this;
        super();
    }
}
