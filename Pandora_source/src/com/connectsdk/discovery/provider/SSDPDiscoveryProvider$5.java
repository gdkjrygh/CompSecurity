// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery.provider;

import com.connectsdk.core.upnp.ssdp.SSDP;
import com.connectsdk.core.upnp.ssdp.SSDPSocket;
import java.io.IOException;

// Referenced classes of package com.connectsdk.discovery.provider:
//            SSDPDiscoveryProvider

class this._cls0
    implements Runnable
{

    final SSDPDiscoveryProvider this$0;

    public void run()
    {
        do
        {
            if (mSSDPSocket == null)
            {
                break;
            }
            try
            {
                handleDatagramPacket(SSDP.convertDatagram(mSSDPSocket.notifyReceive()));
                continue;
            }
            catch (IOException ioexception) { }
            break;
        } while (true);
    }

    ()
    {
        this$0 = SSDPDiscoveryProvider.this;
        super();
    }
}
