// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.eventclient;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.eventclient:
//            EventServerConnection

class entServerConnectionCallback
    implements Runnable
{

    final EventServerConnection this$0;
    final entServerConnectionCallback val$callback;
    final HostInfo val$hostInfo;

    public void run()
    {
        entServerConnectionCallback entserverconnectioncallback;
        boolean flag;
        try
        {
            EventServerConnection.access$102(EventServerConnection.this, InetAddress.getByName(val$hostInfo.getAddress()));
        }
        catch (UnknownHostException unknownhostexception)
        {
            LogUtils.LOGD(EventServerConnection.access$000(), "Got an UnknownHostException, disabling EventServer");
            EventServerConnection.access$102(EventServerConnection.this, null);
        }
        entserverconnectioncallback = val$callback;
        if (EventServerConnection.access$100(EventServerConnection.this) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        entserverconnectioncallback.OnConnectResult(flag);
    }

    entServerConnectionCallback()
    {
        this$0 = final_eventserverconnection;
        val$hostInfo = hostinfo;
        val$callback = entServerConnectionCallback.this;
        super();
    }
}
