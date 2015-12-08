// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.eventclient;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.jsonrpc.ApiCallback;
import org.xbmc.kore.jsonrpc.HostConnection;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.eventclient:
//            EventServerConnection, Packet, PacketHELO, PacketBUTTON

class val.initialMuteStatus
    implements ApiCallback
{

    final auxThread this$1;
    final boolean val$initialMuteStatus;

    public void onError(int i, String s)
    {
        LogUtils.LOGD(EventServerConnection.access$000(), (new StringBuilder()).append("Got an error on Application.GetProperties: ").append(s).toString());
        EventServerConnection.access$500(callerHandler, callerCallback, false);
        EventServerConnection.access$600(auxThread);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((org.xbmc.kore.jsonrpc.type.e)obj);
    }

    public void onSuccess(org.xbmc.kore.jsonrpc.type.e e)
    {
        Handler handler = callerHandler;
        erverConnectionCallback erverconnectioncallback = callerCallback;
        boolean flag;
        if (val$initialMuteStatus != e.muted.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        EventServerConnection.access$500(handler, erverconnectioncallback, flag);
        try
        {
            mutePacket.send(hostInetAddress, hostInfo.getEventServerPort());
        }
        // Misplaced declaration of an exception variable
        catch (org.xbmc.kore.jsonrpc.type.e e)
        {
            LogUtils.LOGD(EventServerConnection.access$000(), "Couldn't revert MUTE status");
        }
        EventServerConnection.access$600(auxThread);
    }

    auxHandler()
    {
        this$1 = final_auxhandler;
        val$initialMuteStatus = Z.this;
        super();
    }

    // Unreferenced inner class org/xbmc/kore/eventclient/EventServerConnection$4

/* anonymous class */
    static final class EventServerConnection._cls4
        implements Runnable
    {

        final Handler val$auxHandler;
        final HandlerThread val$auxThread;
        final EventServerConnection.EventServerConnectionCallback val$callerCallback;
        final Handler val$callerHandler;
        final HostInfo val$hostInfo;

        public void run()
        {
            InetAddress inetaddress;
            Object obj;
            org.xbmc.kore.jsonrpc.method.Application.GetProperties getproperties;
            try
            {
                inetaddress = InetAddress.getByName(hostInfo.getAddress());
            }
            catch (UnknownHostException unknownhostexception)
            {
                LogUtils.LOGD(EventServerConnection.access$000(), "Couldn't get host InetAddress");
                EventServerConnection.access$500(callerHandler, callerCallback, false);
                EventServerConnection.access$600(auxThread);
                return;
            }
            obj = new PacketHELO("Kore Remote");
            try
            {
                ((Packet) (obj)).send(inetaddress, hostInfo.getEventServerPort());
            }
            catch (IOException ioexception)
            {
                LogUtils.LOGD(EventServerConnection.access$000(), "Couldn't send HELO packet to host");
                EventServerConnection.access$500(callerHandler, callerCallback, false);
                EventServerConnection.access$600(auxThread);
                return;
            }
            obj = new HostConnection(new HostInfo(hostInfo.getName(), hostInfo.getAddress(), 1, hostInfo.getHttpPort(), hostInfo.getTcpPort(), hostInfo.getUsername(), hostInfo.getPassword(), false, 0));
            getproperties = new org.xbmc.kore.jsonrpc.method.Application.GetProperties(new String[] {
                "muted"
            });
            getproperties.execute(((HostConnection) (obj)), ((EventServerConnection._cls4._cls1) (obj)). new EventServerConnection._cls4._cls1(), auxHandler);
        }

            
            {
                hostInfo = hostinfo;
                callerHandler = handler;
                callerCallback = eventserverconnectioncallback;
                auxThread = handlerthread;
                auxHandler = handler1;
                super();
            }
    }


    // Unreferenced inner class org/xbmc/kore/eventclient/EventServerConnection$4$1

/* anonymous class */
    class EventServerConnection._cls4._cls1
        implements ApiCallback
    {

        final EventServerConnection._cls4 this$0;
        final org.xbmc.kore.jsonrpc.method.Application.GetProperties val$action;
        final HostConnection val$auxHostConnection;
        final InetAddress val$hostInetAddress;
        final Packet val$mutePacket;

        public void onError(int i, String s)
        {
            LogUtils.LOGD(EventServerConnection.access$000(), (new StringBuilder()).append("Got an error on Application.GetProperties: ").append(s).toString());
            EventServerConnection.access$500(callerHandler, callerCallback, false);
            EventServerConnection.access$600(auxThread);
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue)obj);
        }

        public void onSuccess(org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue propertyvalue)
        {
            boolean flag = propertyvalue.muted.booleanValue();
            try
            {
                mutePacket.send(hostInetAddress, hostInfo.getEventServerPort());
            }
            // Misplaced declaration of an exception variable
            catch (org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue propertyvalue)
            {
                LogUtils.LOGD(EventServerConnection.access$000(), "Couldn't send first MUTE packet to host");
                EventServerConnection.access$500(callerHandler, callerCallback, false);
                EventServerConnection.access$600(auxThread);
                return;
            }
            try
            {
                Thread.sleep(2000L);
            }
            // Misplaced declaration of an exception variable
            catch (org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue propertyvalue) { }
            action.execute(auxHostConnection, flag. new EventServerConnection._cls4._cls1._cls1(), auxHandler);
        }

            
            {
                this$0 = final__pcls4;
                mutePacket = packet;
                hostInetAddress = inetaddress;
                action = getproperties;
                auxHostConnection = HostConnection.this;
                super();
            }
    }

}
