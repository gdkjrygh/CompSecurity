// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.eventclient;

import java.io.IOException;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.eventclient:
//            EventServerConnection, Packet

class val.p
    implements Runnable
{

    final EventServerConnection this$0;
    final Packet val$p;

    public void run()
    {
        try
        {
            val$p.send(EventServerConnection.access$100(EventServerConnection.this), EventServerConnection.access$200(EventServerConnection.this).getEventServerPort());
            return;
        }
        catch (IOException ioexception)
        {
            LogUtils.LOGD(EventServerConnection.access$000(), "Got an IOException when sending a packet to Kodi's EventServer");
        }
    }

    ()
    {
        this$0 = final_eventserverconnection;
        val$p = Packet.this;
        super();
    }
}
