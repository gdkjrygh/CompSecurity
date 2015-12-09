// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.config;


// Referenced classes of package com.google.android.gms.common.config:
//            G, GservicesValue

public static final class ue
{

    public static GservicesValue periodicMonitoringInterval = GservicesValue.value("gms:playlog:service:monitoring_interval", Long.valueOf(0x5265c00L));
    public static GservicesValue systemHealthLogDelayAfterBoot = GservicesValue.value("gms:common:system_health_log_delay_after_boot_millis", Long.valueOf(0x1b7740L));
    public static GservicesValue systemHealthLogDelayAfterInstall = GservicesValue.value("gms:common:system_health_log_delay_after_install_millis", Long.valueOf(60000L));
    public static GservicesValue uploadInternalStatsInterval = GservicesValue.value("gms:common:upload_internal_stats_interval", Long.valueOf(0L));
    public static GservicesValue uploadNetworkStatsInterval = GservicesValue.value("gms:common:upload_network_stats_interval", Long.valueOf(0L));

}
