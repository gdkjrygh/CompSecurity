// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config;

import com.skype.android.crash.CrashReporterConfig;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

// Referenced classes of package com.skype.android.config:
//            UpdateConfig, LoggingConfig, PeriodicWakeupConfig, OnApplicationConfigUpdated

public class ApplicationConfig
{

    private static ApplicationConfig INSTANCE = new ApplicationConfig();
    private CrashReporterConfig crashReporterConfig;
    private LoggingConfig loggingConfig;
    private PeriodicWakeupConfig periodicWakeupConfig;
    private UpdateConfig updateConfig;

    private ApplicationConfig()
    {
        updateConfig = new UpdateConfig();
        crashReporterConfig = new CrashReporterConfig();
        loggingConfig = new LoggingConfig();
        periodicWakeupConfig = new PeriodicWakeupConfig();
    }

    public static ApplicationConfig getInstance()
    {
        return INSTANCE;
    }

    public CrashReporterConfig getCrashReporterConfig()
    {
        return crashReporterConfig;
    }

    public LoggingConfig getLoggingConfig()
    {
        return loggingConfig;
    }

    public PeriodicWakeupConfig getPeriodicWakeupConfig()
    {
        return periodicWakeupConfig;
    }

    public UpdateConfig getUpdateConfig()
    {
        return updateConfig;
    }

    public void sendConfigUpdatedEvent()
    {
        EventBusInstance.a().a(new OnApplicationConfigUpdated(this));
    }

}
