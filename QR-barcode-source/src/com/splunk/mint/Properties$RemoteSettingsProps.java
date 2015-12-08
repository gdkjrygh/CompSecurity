// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import org.json.JSONObject;

// Referenced classes of package com.splunk.mint:
//            Properties, MintLogLevel, Utils

public static class 
{

    protected static JSONObject devSettings = new JSONObject();
    protected static Integer eventLevel;
    protected static String hashCode = "none";
    protected static Integer logLevel;
    public static Boolean netMonitoringEnabled = Boolean.valueOf(true);
    protected static Integer sessionTime = Integer.valueOf(60);

    public static String toReadableFormat()
    {
        return (new StringBuilder()).append("loglevel: ").append(String.valueOf(logLevel)).append(" eventLevel: ").append(String.valueOf(eventLevel)).append(" netMonitoring: ").append(String.valueOf(netMonitoringEnabled)).append(" sessionTime: ").append(String.valueOf(sessionTime)).append(" devSettings: ").append(devSettings.toString()).append(" hashCode: ").append(hashCode).toString();
    }

    static 
    {
        logLevel = Integer.valueOf(Utils.convertLoggingLevelToInt(MintLogLevel.Verbose));
        eventLevel = Integer.valueOf(Utils.convertLoggingLevelToInt(MintLogLevel.Verbose));
    }

    public ()
    {
    }
}
