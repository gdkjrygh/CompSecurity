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
import org.xbmc.kore.utils.Utils;

// Referenced classes of package org.xbmc.kore.eventclient:
//            PacketPING, Packet, PacketHELO, PacketBUTTON

public class EventServerConnection
{
    public static interface EventServerConnectionCallback
    {

        public abstract void OnConnectResult(boolean flag);
    }


    private static final String TAG = LogUtils.makeLogTag(org/xbmc/kore/eventclient/EventServerConnection);
    private Handler commHandler;
    private HandlerThread handlerThread;
    private InetAddress hostInetAddress;
    private final HostInfo hostInfo;
    private PacketPING packetPING;
    private Runnable pingRunnable;

    public EventServerConnection(final HostInfo hostInfo, final EventServerConnectionCallback callback)
    {
        hostInetAddress = null;
        commHandler = null;
        handlerThread = null;
        packetPING = new PacketPING();
        pingRunnable = new Runnable() {

            final EventServerConnection this$0;

            public void run()
            {
                LogUtils.LOGD(EventServerConnection.TAG, "Pinging EventServer");
                if (hostInetAddress != null)
                {
                    try
                    {
                        packetPING.send(hostInetAddress, hostInfo.getEventServerPort());
                    }
                    catch (IOException ioexception)
                    {
                        LogUtils.LOGD(EventServerConnection.TAG, "Got an IOException when sending a PING Packet to Kodi's EventServer");
                    }
                }
                commHandler.postDelayed(this, 45000L);
            }

            
            {
                this$0 = EventServerConnection.this;
                super();
            }
        };
        this.hostInfo = hostInfo;
        LogUtils.LOGD(TAG, "Starting EventServer Thread");
        handlerThread = new HandlerThread("EventServerConnection", 0);
        handlerThread.start();
        commHandler = new Handler(handlerThread.getLooper());
        commHandler.post(new Runnable() {

            final EventServerConnection this$0;
            final EventServerConnectionCallback val$callback;
            final HostInfo val$hostInfo;

            public void run()
            {
                EventServerConnectionCallback eventserverconnectioncallback;
                boolean flag;
                try
                {
                    hostInetAddress = InetAddress.getByName(hostInfo.getAddress());
                }
                catch (UnknownHostException unknownhostexception)
                {
                    LogUtils.LOGD(EventServerConnection.TAG, "Got an UnknownHostException, disabling EventServer");
                    hostInetAddress = null;
                }
                eventserverconnectioncallback = callback;
                if (hostInetAddress != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                eventserverconnectioncallback.OnConnectResult(flag);
            }

            
            {
                this$0 = EventServerConnection.this;
                hostInfo = hostinfo;
                callback = eventserverconnectioncallback;
                super();
            }
        });
        commHandler.postDelayed(pingRunnable, 45000L);
    }

    private static void quitHandlerThread(HandlerThread handlerthread)
    {
        if (Utils.isJellybeanMR2OrLater())
        {
            handlerthread.quitSafely();
            return;
        } else
        {
            handlerthread.quit();
            return;
        }
    }

    private static void reportTestResult(Handler handler, EventServerConnectionCallback eventserverconnectioncallback, boolean flag)
    {
        handler.post(new Runnable(eventserverconnectioncallback, flag) {

            final EventServerConnectionCallback val$callback;
            final boolean val$result;

            public void run()
            {
                callback.OnConnectResult(result);
            }

            
            {
                callback = eventserverconnectioncallback;
                result = flag;
                super();
            }
        });
    }

    public static void testEventServerConnection(HostInfo hostinfo, EventServerConnectionCallback eventserverconnectioncallback, Handler handler)
    {
        HandlerThread handlerthread = new HandlerThread("EventServerConnectionTest", 0);
        handlerthread.start();
        Handler handler1 = new Handler(handlerthread.getLooper());
        handler1.post(new Runnable(hostinfo, handler, eventserverconnectioncallback, handlerthread, handler1) {

            final Handler val$auxHandler;
            final HandlerThread val$auxThread;
            final EventServerConnectionCallback val$callerCallback;
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
                    LogUtils.LOGD(EventServerConnection.TAG, "Couldn't get host InetAddress");
                    EventServerConnection.reportTestResult(callerHandler, callerCallback, false);
                    EventServerConnection.quitHandlerThread(auxThread);
                    return;
                }
                obj = new PacketHELO("Kore Remote");
                try
                {
                    ((Packet) (obj)).send(inetaddress, hostInfo.getEventServerPort());
                }
                catch (IOException ioexception)
                {
                    LogUtils.LOGD(EventServerConnection.TAG, "Couldn't send HELO packet to host");
                    EventServerConnection.reportTestResult(callerHandler, callerCallback, false);
                    EventServerConnection.quitHandlerThread(auxThread);
                    return;
                }
                obj = new HostConnection(new HostInfo(hostInfo.getName(), hostInfo.getAddress(), 1, hostInfo.getHttpPort(), hostInfo.getTcpPort(), hostInfo.getUsername(), hostInfo.getPassword(), false, 0));
                getproperties = new org.xbmc.kore.jsonrpc.method.Application.GetProperties(new String[] {
                    "muted"
                });
                getproperties.execute(((HostConnection) (obj)), ((_cls1) (obj)). new ApiCallback() {

                    final _cls4 this$0;
                    final org.xbmc.kore.jsonrpc.method.Application.GetProperties val$action;
                    final HostConnection val$auxHostConnection;
                    final InetAddress val$hostInetAddress;
                    final Packet val$mutePacket;

                    public void onError(int i, String s)
                    {
                        LogUtils.LOGD(EventServerConnection.TAG, (new StringBuilder()).append("Got an error on Application.GetProperties: ").append(s).toString());
                        EventServerConnection.reportTestResult(callerHandler, callerCallback, false);
                        EventServerConnection.quitHandlerThread(auxThread);
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
                            LogUtils.LOGD(EventServerConnection.TAG, "Couldn't send first MUTE packet to host");
                            EventServerConnection.reportTestResult(callerHandler, callerCallback, false);
                            EventServerConnection.quitHandlerThread(auxThread);
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
                                LogUtils.LOGD(EventServerConnection.TAG, (new StringBuilder()).append("Got an error on Application.GetProperties: ").append(s).toString());
                                EventServerConnection.reportTestResult(callerHandler, callerCallback, false);
                                EventServerConnection.quitHandlerThread(auxThread);
                            }

                            public volatile void onSuccess(Object obj)
                            {
                                onSuccess((org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue)obj);
                            }

                            public void onSuccess(org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue propertyvalue)
                            {
                                Handler handler = callerHandler;
                                EventServerConnectionCallback eventserverconnectioncallback = callerCallback;
                                boolean flag;
                                if (initialMuteStatus != propertyvalue.muted.booleanValue())
                                {
                                    flag = true;
                                } else
                                {
                                    flag = false;
                                }
                                EventServerConnection.reportTestResult(handler, eventserverconnectioncallback, flag);
                                try
                                {
                                    mutePacket.send(hostInetAddress, hostInfo.getEventServerPort());
                                }
                                // Misplaced declaration of an exception variable
                                catch (org.xbmc.kore.jsonrpc.type.ApplicationType.PropertyValue propertyvalue)
                                {
                                    LogUtils.LOGD(EventServerConnection.TAG, "Couldn't revert MUTE status");
                                }
                                EventServerConnection.quitHandlerThread(auxThread);
                            }

            
            {
                this$1 = final__pcls1;
                initialMuteStatus = Z.this;
                super();
            }
                        }, auxHandler);
                    }

            
            {
                this$0 = final__pcls4;
                mutePacket = packet;
                hostInetAddress = inetaddress;
                action = getproperties;
                auxHostConnection = HostConnection.this;
                super();
            }
                }, auxHandler);
            }

            
            {
                hostInfo = hostinfo;
                callerHandler = handler;
                callerCallback = eventserverconnectioncallback;
                auxThread = handlerthread;
                auxHandler = handler1;
                super();
            }
        });
    }

    public void quit()
    {
        LogUtils.LOGD(TAG, "Quiting EventServer handler thread");
        quitHandlerThread(handlerThread);
    }

    public void sendPacket(final Packet p)
    {
        if (!handlerThread.isAlive() || hostInetAddress == null)
        {
            return;
        } else
        {
            LogUtils.LOGD(TAG, "Sending Packet");
            commHandler.post(new Runnable() {

                final EventServerConnection this$0;
                final Packet val$p;

                public void run()
                {
                    try
                    {
                        p.send(hostInetAddress, hostInfo.getEventServerPort());
                        return;
                    }
                    catch (IOException ioexception)
                    {
                        LogUtils.LOGD(EventServerConnection.TAG, "Got an IOException when sending a packet to Kodi's EventServer");
                    }
                }

            
            {
                this$0 = EventServerConnection.this;
                p = packet;
                super();
            }
            });
            return;
        }
    }





/*
    static InetAddress access$102(EventServerConnection eventserverconnection, InetAddress inetaddress)
    {
        eventserverconnection.hostInetAddress = inetaddress;
        return inetaddress;
    }

*/





}
