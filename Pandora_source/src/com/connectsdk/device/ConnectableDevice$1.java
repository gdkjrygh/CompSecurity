// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.device;

import com.connectsdk.core.Util;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.ServiceReadyListener;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.connectsdk.device:
//            ConnectableDevice, ConnectableDeviceListener

class this._cls0
    implements ServiceReadyListener
{

    final ConnectableDevice this$0;

    public void onServiceReady()
    {
        if (services == null || services.size() <= 0) goto _L2; else goto _L1
_L1:
        Iterator iterator = services.values().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (((DeviceService)iterator.next()).isServiceReady()) goto _L6; else goto _L5
_L5:
        boolean flag = false;
_L8:
        if (flag)
        {
            Util.runOnUI(new Runnable() {

                final ConnectableDevice._cls1 this$1;

                public void run()
                {
                    com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair connectabledevicelistenerpair;
                    for (Iterator iterator1 = deviceListeners.iterator(); iterator1.hasNext(); connectabledevicelistenerpair.listener.onDeviceReady(connectabledevicelistenerpair.device))
                    {
                        connectabledevicelistenerpair = (com.connectsdk.service.DeviceService.ConnectableDeviceListenerPair)iterator1.next();
                    }

                }

            
            {
                this$1 = ConnectableDevice._cls1.this;
                super();
            }
            });
        }
_L2:
        return;
_L4:
        flag = true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    _cls1.this._cls1()
    {
        this$0 = ConnectableDevice.this;
        super();
    }
}
