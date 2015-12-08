// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            StateTimerOutputPacketType, PluginCallBackSnapShot, PluginMetricsSnapShot

class StateTimerOutputPacket
{

    Object auxInfo;
    Long currentTime;
    StateTimerOutputPacketType packetType;
    PluginCallBackSnapShot pluginCallBack;
    PluginMetricsSnapShot pluginMetrics;

    public StateTimerOutputPacket(StateTimerOutputPacketType statetimeroutputpackettype, Long long1, PluginCallBackSnapShot plugincallbacksnapshot, PluginMetricsSnapShot pluginmetricssnapshot, Object obj)
    {
        packetType = statetimeroutputpackettype;
        currentTime = long1;
        pluginCallBack = plugincallbacksnapshot;
        pluginMetrics = pluginmetricssnapshot;
        auxInfo = obj;
    }
}
