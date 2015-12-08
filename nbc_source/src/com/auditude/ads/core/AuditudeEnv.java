// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.core;

import com.auditude.ads.reporting.ReportingHelper;
import com.auditude.ads.util.log.ILogger;
import com.auditude.ads.util.log.Log;
import com.auditude.ads.util.log.LogLevel;
import com.auditude.ads.util.log.targets.AbstractTarget;
import com.auditude.ads.util.log.targets.TraceTarget;

// Referenced classes of package com.auditude.ads.core:
//            AdSettings, APIBridge

public class AuditudeEnv
{

    public static final String PLAYER_REVISION = "57988";
    private static AuditudeEnv instance;
    private AdSettings adSettings;
    private APIBridge apiBridge;
    private ReportingHelper reporting;
    public Boolean shouldIgnoreNextBreak;
    public Boolean shouldPauseAdPatterns;

    public AuditudeEnv()
    {
        shouldPauseAdPatterns = Boolean.valueOf(false);
        shouldIgnoreNextBreak = Boolean.valueOf(false);
    }

    public static AuditudeEnv getInstance()
    {
        return instance;
    }

    private void initLoggers()
    {
        Log.flush();
        (new TraceTarget(Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true), Boolean.valueOf(true))).setLevel(LogLevel.ALL);
    }

    public static void setEnvironment(AuditudeEnv auditudeenv)
    {
        instance = auditudeenv;
    }

    public final APIBridge getAPI()
    {
        return apiBridge;
    }

    public final AdSettings getAdSettings()
    {
        return adSettings;
    }

    public final ReportingHelper getReportingHelper()
    {
        return reporting;
    }

    public final void init(APIBridge apibridge, ReportingHelper reportinghelper, AdSettings adsettings)
    {
        apiBridge = apibridge;
        reporting = reportinghelper;
        adSettings = adsettings;
        initLoggers();
        Log.getLogger().info("Auditude Library Version: 57988");
    }
}
