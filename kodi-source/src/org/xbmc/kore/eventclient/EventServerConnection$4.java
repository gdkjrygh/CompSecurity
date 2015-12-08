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
//            EventServerConnection, PacketHELO, Packet, PacketBUTTON

static final class val.auxHandler
    implements Runnable
{

    final Handler val$auxHandler;
    final HandlerThread val$auxThread;
    final entServerConnectionCallback val$callerCallback;
    final Handler val$callerHandler;
    final HostInfo val$hostInfo;

    public void run()
    {
        InetAddress inetaddress;
        Object obj;
        org.xbmc.kore.jsonrpc.method.s s;
        try
        {
            inetaddress = InetAddress.getByName(val$hostInfo.getAddress());
        }
        catch (UnknownHostException unknownhostexception)
        {
            LogUtils.LOGD(EventServerConnection.access$000(), "Couldn't get host InetAddress");
            EventServerConnection.access$500(val$callerHandler, val$callerCallback, false);
            EventServerConnection.access$600(val$auxThread);
            return;
        }
        obj = new PacketHELO("Kore Remote");
        try
        {
            ((Packet) (obj)).send(inetaddress, val$hostInfo.getEventServerPort());
        }
        catch (IOException ioexception)
        {
            LogUtils.LOGD(EventServerConnection.access$000(), "Couldn't send HELO packet to host");
            EventServerConnection.access$500(val$callerHandler, val$callerCallback, false);
            EventServerConnection.access$600(val$auxThread);
            return;
        }
        obj = new HostConnection(new HostInfo(val$hostInfo.getName(), val$hostInfo.getAddress(), 1, val$hostInfo.getHttpPort(), val$hostInfo.getTcpPort(), val$hostInfo.getUsername(), val$hostInfo.getPassword(), false, 0));
        s = new org.xbmc.kore.jsonrpc.method.s(new String[] {
            "muted"
        });
        s.execute(((HostConnection) (obj)), new ApiCallback() {

            final EventServerConnection._cls4 this$0;
            final org.xbmc.kore.jsonrpc.method.Application.GetProperties val$action;
            final HostConnection val$auxHostConnection;
            final InetAddress val$hostInetAddress;
            final Packet val$mutePacket;

            public void onError(int i, String s1)
            {
                LogUtils.LOGD(EventServerConnection.access$000(), (new StringBuilder()).append("Got an error on Application.GetProperties: ").append(s1).toString());
                EventServerConnection.access$500(callerHandler, callerCallback, false);
                EventServerConnection.access$600(auxThread);
            }

            public volatile void onSuccess(Object obj1)
            {
                onSuccess((org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue)obj1);
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
                action.execute(auxHostConnection, flag. new ApiCallback() {

                    final _cls1 this$1;
                    final boolean val$initialMuteStatus;

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
                        Handler handler = callerHandler;
                        EventServerConnection.EventServerConnectionCallback eventserverconnectioncallback = callerCallback;
                        boolean flag;
                        if (initialMuteStatus != propertyvalue.muted.booleanValue())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        EventServerConnection.access$500(handler, eventserverconnectioncallback, flag);
                        try
                        {
                            mutePacket.send(hostInetAddress, hostInfo.getEventServerPort());
                        }
                        // Misplaced declaration of an exception variable
                        catch (org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue propertyvalue)
                        {
                            LogUtils.LOGD(EventServerConnection.access$000(), "Couldn't revert MUTE status");
                        }
                        EventServerConnection.access$600(auxThread);
                    }

            
            {
                this$1 = final__pcls1;
                initialMuteStatus = Z.this;
                super();
            }
                }, auxHandler);
            }

            
            {
                this$0 = EventServerConnection._cls4.this;
                mutePacket = packet;
                hostInetAddress = inetaddress;
                action = getproperties;
                auxHostConnection = hostconnection;
                super();
            }
        }, val$auxHandler);
    }

    entServerConnectionCallback(HostInfo hostinfo, Handler handler, entServerConnectionCallback entserverconnectioncallback, HandlerThread handlerthread, Handler handler1)
    {
        val$hostInfo = hostinfo;
        val$callerHandler = handler;
        val$callerCallback = entserverconnectioncallback;
        val$auxThread = handlerthread;
        val$auxHandler = handler1;
        super();
    }
}
