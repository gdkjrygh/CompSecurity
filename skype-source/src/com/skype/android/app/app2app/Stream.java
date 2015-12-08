// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.app2app;

import android.os.Handler;
import com.skype.SkyLib;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.app2app:
//            Protocol

public class Stream
{

    private static final Logger log = Logger.getLogger("Translator");
    private String applicationName;
    private String channelName;
    private boolean connected;
    private Handler handler;
    private SkyLib lib;
    private int pingPacketsFailed;
    private int pingPacketsSent;
    private Protocol protocol;

    public Stream(SkyLib skylib, Protocol protocol1, Handler handler1, String s, String s1)
    {
        lib = skylib;
        protocol = protocol1;
        handler = handler1;
        applicationName = s;
        channelName = s1;
    }

    void checkAndSendPingPacket()
    {
        if (connected)
        {
            if (pingPacketsSent < protocol.getNumberPingPackets())
            {
                log.info("sending ping");
                if (sendApp2AppData(protocol.getPingPacket()))
                {
                    pingPacketsSent = pingPacketsSent + 1;
                } else
                {
                    pingPacketsFailed = pingPacketsFailed + 1;
                    log.info("Ping send failed");
                }
                if (pingPacketsFailed < protocol.getNumberFailedPingPackets())
                {
                    schedulePing();
                }
                return;
            } else
            {
                log.info("ignore ping as we all set");
                return;
            }
        } else
        {
            log.info("Not connected");
            return;
        }
    }

    public void connect()
    {
        if (!connected)
        {
            connected = true;
            log.info((new StringBuilder("Connecting: ")).append(channelName).toString());
            connected = lib.app2AppConnect(applicationName, channelName);
            if (connected)
            {
                log.info((new StringBuilder("Successfuly connected to: ")).append(channelName).toString());
                checkAndSendPingPacket();
                return;
            } else
            {
                log.info((new StringBuilder("Connection failed to: ")).append(channelName).toString());
                return;
            }
        } else
        {
            log.info("We are already connected ignore");
            return;
        }
    }

    public void disconnect()
    {
        lib.app2AppDisconnect(applicationName, channelName);
        connected = false;
        pingPacketsSent = 0;
        pingPacketsFailed = 0;
    }

    public boolean isConnected()
    {
        return connected;
    }

    void schedulePing()
    {
        handler.postDelayed(new Runnable() {

            final Stream this$0;

            public final void run()
            {
                checkAndSendPingPacket();
            }

            
            {
                this$0 = Stream.this;
                super();
            }
        }, protocol.getPingInterval());
    }

    public boolean sendApp2AppData(byte abyte0[])
    {
        boolean flag = false;
        if (connected)
        {
            flag = lib.app2AppDatagram(applicationName, channelName, abyte0);
        }
        return flag;
    }

    public void setName(String s)
    {
        channelName = s;
    }

}
