// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import java.io.IOException;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import org.xbmc.kore.utils.LogUtils;
import org.xbmc.kore.utils.NetUtils;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            AddHostFragmentZeroconf

class val.serviceInfos
    implements Runnable
{

    final val.serviceInfos this$1;
    final ServiceInfo val$serviceInfos[];

    public void run()
    {
        if (val$serviceInfos == null || val$serviceInfos.length == 0)
        {
            noHostFound();
            return;
        } else
        {
            foundHosts(val$serviceInfos);
            return;
        }
    }

    l.handler()
    {
        this$1 = final_handler;
        val$serviceInfos = _5B_Ljavax.jmdns.ServiceInfo_3B_.this;
        super();
    }

    // Unreferenced inner class org/xbmc/kore/ui/hosts/AddHostFragmentZeroconf$1

/* anonymous class */
    class AddHostFragmentZeroconf._cls1
        implements Runnable
    {

        final AddHostFragmentZeroconf this$0;
        final Handler val$handler;

        public void run()
        {
            android.net.wifi.WifiManager.MulticastLock multicastlock;
            android.net.wifi.WifiManager.MulticastLock multicastlock1;
            android.net.wifi.WifiManager.MulticastLock multicastlock2;
            Object obj;
            WifiManager wifimanager;
            wifimanager = (WifiManager)getActivity().getSystemService("wifi");
            obj = null;
            multicastlock2 = null;
            multicastlock1 = multicastlock2;
            multicastlock = ((android.net.wifi.WifiManager.MulticastLock) (obj));
            java.net.InetAddress inetaddress = NetUtils.intToInetAddress(wifimanager.getConnectionInfo().getIpAddress());
            multicastlock1 = multicastlock2;
            multicastlock = ((android.net.wifi.WifiManager.MulticastLock) (obj));
            multicastlock2 = wifimanager.createMulticastLock("kore2.multicastlock");
            multicastlock1 = multicastlock2;
            multicastlock = multicastlock2;
            multicastlock2.setReferenceCounted(false);
            multicastlock1 = multicastlock2;
            multicastlock = multicastlock2;
            multicastlock2.acquire();
            if (inetaddress == null) goto _L2; else goto _L1
_L1:
            multicastlock1 = multicastlock2;
            multicastlock = multicastlock2;
            obj = JmDNS.create(inetaddress);
_L6:
            multicastlock1 = multicastlock2;
            multicastlock = multicastlock2;
            ServiceInfo aserviceinfo[] = ((JmDNS) (obj)).list("_xbmc-jsonrpc-h._tcp.local.", 5000L);
            multicastlock1 = multicastlock2;
            multicastlock = multicastlock2;
            obj = AddHostFragmentZeroconf.access$000(AddHostFragmentZeroconf.this);
            multicastlock1 = multicastlock2;
            multicastlock = multicastlock2;
            obj;
            JVM INSTR monitorenter ;
            if (!AddHostFragmentZeroconf.access$100(AddHostFragmentZeroconf.this) && isAdded())
            {
                handler.post(aserviceinfo. new AddHostFragmentZeroconf._cls1._cls1());
            }
            obj;
            JVM INSTR monitorexit ;
            if (multicastlock2 != null)
            {
                multicastlock2.release();
            }
_L4:
            return;
_L2:
            multicastlock1 = multicastlock2;
            multicastlock = multicastlock2;
            obj = JmDNS.create();
            continue; /* Loop/switch isn't completed */
            Exception exception1;
            exception1;
            obj;
            JVM INSTR monitorexit ;
            multicastlock1 = multicastlock2;
            multicastlock = multicastlock2;
            throw exception1;
            IOException ioexception;
            ioexception;
            multicastlock = multicastlock1;
            LogUtils.LOGD(AddHostFragmentZeroconf.access$200(), "Got an IO Exception", ioexception);
            if (multicastlock1 == null) goto _L4; else goto _L3
_L3:
            multicastlock1.release();
            return;
            Exception exception;
            exception;
            if (multicastlock != null)
            {
                multicastlock.release();
            }
            throw exception;
            if (true) goto _L6; else goto _L5
_L5:
        }

            
            {
                this$0 = final_addhostfragmentzeroconf;
                handler = Handler.this;
                super();
            }
    }

}
