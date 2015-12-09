// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.connectsdk.core.Util;
import com.connectsdk.service.command.ServiceCommandError;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.connectsdk.discovery:
//            DiscoveryManager, DiscoveryManagerListener, DiscoveryProvider

class this._cls1
    implements Runnable
{

    final rror this$1;

    public void run()
    {
        for (Iterator iterator = DiscoveryManager.access$500(_fld0).iterator(); iterator.hasNext(); ((DiscoveryManagerListener)iterator.next()).onDiscoveryFailed(_fld0, new ServiceCommandError(0, "No wifi connection", null))) { }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/connectsdk/discovery/DiscoveryManager$2

/* anonymous class */
    class DiscoveryManager._cls2
        implements Runnable
    {

        final DiscoveryManager this$0;

        public void run()
        {
            if (DiscoveryManager.access$000(DiscoveryManager.this))
            {
                DiscoveryManager.access$002(DiscoveryManager.this, false);
            } else
            {
                DiscoveryManager.access$400(DiscoveryManager.this);
            }
            if (((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1).isConnected())
            {
                for (Iterator iterator = DiscoveryManager.access$100(DiscoveryManager.this).iterator(); iterator.hasNext(); ((DiscoveryProvider)iterator.next()).start()) { }
            } else
            {
                Log.w("Connect SDK", "Wifi is not connected");
                DiscoveryManager.access$002(DiscoveryManager.this, true);
                Util.runOnUI(new DiscoveryManager._cls2._cls1());
            }
        }

            
            {
                this$0 = DiscoveryManager.this;
                super();
            }
    }

}
