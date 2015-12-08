// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.device;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

// Referenced classes of package com.connectsdk.device:
//            DefaultConnectableDeviceStore

class val.lastUpdate
    implements Runnable
{

    final DefaultConnectableDeviceStore this$0;
    final double val$lastUpdate;

    public void run()
    {
        Object obj = new File(DefaultConnectableDeviceStore.access$000(DefaultConnectableDeviceStore.this));
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).getParentFile().mkdirs();
        }
        obj = new FileWriter(((File) (obj)));
        ((FileWriter) (obj)).write(DefaultConnectableDeviceStore.access$100(DefaultConnectableDeviceStore.this).toString());
        ((FileWriter) (obj)).close();
        DefaultConnectableDeviceStore.access$202(DefaultConnectableDeviceStore.this, false);
_L2:
        if (val$lastUpdate != (double)updated)
        {
            DefaultConnectableDeviceStore.access$300(DefaultConnectableDeviceStore.this);
        }
        return;
        Object obj1;
        obj1;
        DefaultConnectableDeviceStore.access$202(DefaultConnectableDeviceStore.this, false);
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        DefaultConnectableDeviceStore.access$202(DefaultConnectableDeviceStore.this, false);
        throw obj1;
    }

    ()
    {
        this$0 = final_defaultconnectabledevicestore;
        val$lastUpdate = D.this;
        super();
    }
}
