// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.device;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.connectsdk.device:
//            ConnectableDevice, ConnectableDeviceListener

class this._cls0
    implements Runnable
{

    final ConnectableDevice this$0;

    public void run()
    {
        com.connectsdk.service.tableDeviceListenerPair tabledevicelistenerpair;
        for (Iterator iterator = deviceListeners.iterator(); iterator.hasNext(); tabledevicelistenerpair.listener.onDeviceReady(tabledevicelistenerpair.device))
        {
            tabledevicelistenerpair = (com.connectsdk.service.tableDeviceListenerPair)iterator.next();
        }

    }

    tener()
    {
        this$0 = ConnectableDevice.this;
        super();
    }
}
