// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.connectsdk.device.ConnectableDevice;
import java.util.Collection;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.connectsdk.discovery:
//            DiscoveryManager, DiscoveryProvider

class this._cls0 extends BroadcastReceiver
{

    final DiscoveryManager this$0;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            if (intent.getAction().equals("android.net.wifi.supplicant.CONNECTION_CHANGE"))
            {
                if (!intent.getBooleanExtra("connected", false))
                {
                    break label0;
                }
                context = new TimerTask() {

                    final DiscoveryManager._cls1 this$1;

                    public void run()
                    {
                        if (DiscoveryManager.access$000(this$0))
                        {
                            for (Iterator iterator = DiscoveryManager.access$100(this$0).iterator(); iterator.hasNext(); ((DiscoveryProvider)iterator.next()).start()) { }
                        }
                    }

            
            {
                this$1 = DiscoveryManager._cls1.this;
                super();
            }
                };
                (new Timer()).schedule(context, 2000L);
            }
            return;
        }
        Log.w("Connect SDK", "Network connection is disconnected");
        for (context = DiscoveryManager.access$100(DiscoveryManager.this).iterator(); context.hasNext(); ((DiscoveryProvider)context.next()).reset()) { }
        DiscoveryManager.access$200(DiscoveryManager.this).clear();
        for (context = DiscoveryManager.access$300(DiscoveryManager.this).values().iterator(); context.hasNext(); handleDeviceLoss(intent))
        {
            intent = (ConnectableDevice)context.next();
        }

        DiscoveryManager.access$300(DiscoveryManager.this).clear();
        DiscoveryManager.access$002(DiscoveryManager.this, true);
        stop();
    }

    _cls1.this._cls1()
    {
        this$0 = DiscoveryManager.this;
        super();
    }
}
