// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.eventclient;

import android.os.Handler;
import java.io.IOException;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.eventclient:
//            EventServerConnection, PacketPING

class this._cls0
    implements Runnable
{

    final EventServerConnection this$0;

    public void run()
    {
        LogUtils.LOGD(EventServerConnection.access$000(), "Pinging EventServer");
        if (EventServerConnection.access$100(EventServerConnection.this) != null)
        {
            try
            {
                EventServerConnection.access$300(EventServerConnection.this).send(EventServerConnection.access$100(EventServerConnection.this), EventServerConnection.access$200(EventServerConnection.this).getEventServerPort());
            }
            catch (IOException ioexception)
            {
                LogUtils.LOGD(EventServerConnection.access$000(), "Got an IOException when sending a PING Packet to Kodi's EventServer");
            }
        }
        EventServerConnection.access$400(EventServerConnection.this).postDelayed(this, 45000L);
    }

    ()
    {
        this$0 = EventServerConnection.this;
        super();
    }
}
