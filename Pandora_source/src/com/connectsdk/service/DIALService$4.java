// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service;

import com.connectsdk.device.ConnectableDeviceListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.connectsdk.service:
//            DIALService

class this._cls0
    implements Runnable
{

    final DIALService this$0;

    public void run()
    {
        ConnectableDeviceListenerPair connectabledevicelistenerpair;
        for (Iterator iterator = deviceListeners.iterator(); iterator.hasNext(); connectabledevicelistenerpair.listener.onDeviceDisconnected(connectabledevicelistenerpair.device))
        {
            connectabledevicelistenerpair = (ConnectableDeviceListenerPair)iterator.next();
        }

        deviceListeners.clear();
    }

    ceListener()
    {
        this$0 = DIALService.this;
        super();
    }
}
