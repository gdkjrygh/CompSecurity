// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery.provider;

import com.connectsdk.core.upnp.ssdp.SSDPSocket;
import java.io.IOException;
import java.util.TimerTask;

// Referenced classes of package com.connectsdk.discovery.provider:
//            SSDPDiscoveryProvider

class val.message extends TimerTask
{

    final SSDPDiscoveryProvider this$0;
    final String val$message;

    public void run()
    {
        try
        {
            if (mSSDPSocket != null)
            {
                mSSDPSocket.send(val$message);
            }
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    ()
    {
        this$0 = final_ssdpdiscoveryprovider;
        val$message = String.this;
        super();
    }
}
