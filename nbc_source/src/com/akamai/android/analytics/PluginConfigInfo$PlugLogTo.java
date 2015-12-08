// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            PluginConfigInfo, InternalCodes

class EDPARAMSEPARATOR
{

    String encodedParamSeparator;
    int feedback_limit;
    int feedback_socialShareLimit;
    String formatVersion;
    int heartBeatInterval;
    String host;
    int initBrowserCloseTime;
    int isSessionWithRebufferLimit;
    int logInterval;
    boolean logType;
    String logVersion;
    int maxLogLength;
    String path;
    int secondLogTime;
    int startUpTimeOutlierLimit;
    final PluginConfigInfo this$0;
    String urlParamSeparator;
    int visitTimeOut;

    public String debug()
    {
        return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("logInterval:").append(logInterval).append(":\n").toString()))).append("logType:").append(logType).append(":\n").toString()))).append("maxLogLength:").append(maxLogLength).append(":\n").toString()))).append("secondLogTime:").append(secondLogTime).append(":\n").toString()))).append("startUptimeoutlierlimit:").append(startUpTimeOutlierLimit).append(":\n").toString()))).append("initBrowserCloseTime:").append(initBrowserCloseTime).append(":\n").toString()))).append("urlParamSeparator:").append(urlParamSeparator).append(":\n").toString()))).append("host:").append(host).append(":\n").toString()))).append("path:").append(path).append(":\n").toString()))).append("logVersion:").append(logVersion).append(":\n").toString()))).append("formatVersion:").append(formatVersion).append(":\n").toString();
    }

    ()
    {
        this$0 = PluginConfigInfo.this;
        super();
        logInterval = InternalCodes.DEFAULT_LOG_INTERVAL;
        secondLogTime = InternalCodes.DEFAULT_SECONDARYLOGTIME;
        heartBeatInterval = InternalCodes.DEFAULT_HEARTBEAT_INTERVAL;
        logType = true;
        maxLogLength = 4096;
        startUpTimeOutlierLimit = 0x927c0;
        initBrowserCloseTime = 0xdbba0;
        urlParamSeparator = InternalCodes.DEFAULT_URLPARAM_SEPERATOR;
        visitTimeOut = 0x36ee80;
        feedback_limit = InternalCodes.FEEDBACK_LIMIT;
        feedback_socialShareLimit = InternalCodes.SOCIAL_SHARE_LIMIT;
        isSessionWithRebufferLimit = InternalCodes.DEFAULT_ISSESSIONWITHREBUFFER_LIMIT;
        encodedParamSeparator = InternalCodes.DEFAULT_ENCODEDPARAMSEPARATOR;
    }
}
