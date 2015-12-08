// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.utils;

import com.conviva.platforms.PlatformApi;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Settings
{

    public static final int POLL_STREAMER_INTERVAL_MS = 200;
    public static final int POLL_STREAMER_WINDOW_SIZE_MS = 1000;
    public int clientInstanceId;
    public String customerKey;
    public boolean enableLogging;
    public String gatewayPath;
    public String gatewayUrl;
    public int heartbeatIntervalMs;
    public int loadDataTimeoutMs;
    public int maxEventsPerHeartbeat;
    public String pingComponentName;
    public String pingUrl;
    public PlatformApi platformApi;
    public String platformApiName;
    public String protocolVersion;
    public boolean sendLogs;

    public Settings()
    {
        heartbeatIntervalMs = 20000;
        maxEventsPerHeartbeat = 10;
        customerKey = null;
        gatewayUrl = "https://cws.conviva.com";
        gatewayPath = "/0/wsg";
        protocolVersion = "1.7";
        clientInstanceId = 0;
        platformApiName = "com.conviva.platforms.AndroidApi";
        platformApi = null;
        loadDataTimeoutMs = 10000;
        enableLogging = false;
        sendLogs = false;
        pingComponentName = "javacws";
        pingUrl = "https://pings.conviva.com/ping.ping";
    }

    public void changeSettings(Map map)
        throws Exception
    {
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                Object obj = (java.util.Map.Entry)map.next();
                String s = (String)((java.util.Map.Entry) (obj)).getKey();
                obj = ((java.util.Map.Entry) (obj)).getValue();
                if (s.equals("platformApiName"))
                {
                    platformApiName = (String)obj;
                } else
                if (s.equals("platformApi"))
                {
                    platformApi = (PlatformApi)obj;
                } else
                if (s.equals("gatewayUrl"))
                {
                    gatewayUrl = (String)obj;
                } else
                if (s.equals("pingUrl"))
                {
                    pingUrl = (String)obj;
                } else
                if (s.equals("heartbeatIntervalMs"))
                {
                    heartbeatIntervalMs = ((Integer)obj).intValue();
                } else
                if (s.equals("enableLogging"))
                {
                    enableLogging = ((Boolean)obj).booleanValue();
                } else
                {
                    throw new Exception((new StringBuilder()).append("Unsupported settings: ").append(s).toString());
                }
            }
        }
    }
}
