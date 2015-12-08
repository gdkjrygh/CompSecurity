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

class val.handler
    implements Runnable
{

    final AddHostFragmentZeroconf this$0;
    final Handler val$handler;

    public void run()
    {
        android.net.wifi.onf._cls1 _lcls1;
        android.net.wifi.onf._cls1 _lcls1_1;
        android.net.wifi.onf._cls1 _lcls1_2;
        Object obj;
        WifiManager wifimanager;
        wifimanager = (WifiManager)getActivity().getSystemService("wifi");
        obj = null;
        _lcls1_2 = null;
        _lcls1_1 = _lcls1_2;
        _lcls1 = ((android.net.wifi.SystemService) (obj));
        java.net.InetAddress inetaddress = NetUtils.intToInetAddress(wifimanager.getConnectionInfo().getIpAddress());
        _lcls1_1 = _lcls1_2;
        _lcls1 = ((android.net.wifi.nfo) (obj));
        _lcls1_2 = wifimanager.createMulticastLock("kore2.multicastlock");
        _lcls1_1 = _lcls1_2;
        _lcls1 = _lcls1_2;
        _lcls1_2.setReferenceCounted(false);
        _lcls1_1 = _lcls1_2;
        _lcls1 = _lcls1_2;
        _lcls1_2.acquire();
        if (inetaddress == null) goto _L2; else goto _L1
_L1:
        _lcls1_1 = _lcls1_2;
        _lcls1 = _lcls1_2;
        obj = JmDNS.create(inetaddress);
_L6:
        _lcls1_1 = _lcls1_2;
        _lcls1 = _lcls1_2;
        final ServiceInfo serviceInfos[] = ((JmDNS) (obj)).list("_xbmc-jsonrpc-h._tcp.local.", 5000L);
        _lcls1_1 = _lcls1_2;
        _lcls1 = _lcls1_2;
        obj = AddHostFragmentZeroconf.access$000(AddHostFragmentZeroconf.this);
        _lcls1_1 = _lcls1_2;
        _lcls1 = _lcls1_2;
        obj;
        JVM INSTR monitorenter ;
        if (!AddHostFragmentZeroconf.access$100(AddHostFragmentZeroconf.this) && isAdded())
        {
            val$handler.post(new Runnable() {

                final AddHostFragmentZeroconf._cls1 this$1;
                final ServiceInfo val$serviceInfos[];

                public void run()
                {
                    if (serviceInfos == null || serviceInfos.length == 0)
                    {
                        noHostFound();
                        return;
                    } else
                    {
                        foundHosts(serviceInfos);
                        return;
                    }
                }

            
            {
                this$1 = AddHostFragmentZeroconf._cls1.this;
                serviceInfos = aserviceinfo;
                super();
            }
            });
        }
        obj;
        JVM INSTR monitorexit ;
        if (_lcls1_2 != null)
        {
            _lcls1_2.release();
        }
_L4:
        return;
_L2:
        _lcls1_1 = _lcls1_2;
        _lcls1 = _lcls1_2;
        obj = JmDNS.create();
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        _lcls1_1 = _lcls1_2;
        _lcls1 = _lcls1_2;
        throw exception1;
        IOException ioexception;
        ioexception;
        _lcls1 = _lcls1_1;
        LogUtils.LOGD(AddHostFragmentZeroconf.access$200(), "Got an IO Exception", ioexception);
        if (_lcls1_1 == null) goto _L4; else goto _L3
_L3:
        _lcls1_1.release();
        return;
        Exception exception;
        exception;
        if (_lcls1 != null)
        {
            _lcls1.release();
        }
        throw exception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    _cls1.val.serviceInfos()
    {
        this$0 = final_addhostfragmentzeroconf;
        val$handler = Handler.this;
        super();
    }
}
