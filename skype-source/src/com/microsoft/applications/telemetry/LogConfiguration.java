// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;

import android.content.Context;
import java.io.File;

public class LogConfiguration
{

    private static LogConfiguration DEFAULT_CONFIGURATION;
    private static final String DEFAULT_PROD_BLOB_COLLECTOR_URI = "https://pipe.skype.com/Collector/3.0/";
    private static final String DEFAULT_PROD_EVENT_COLLECTOR_URI = "https://pipe.skype.com/Collector/3.0/";
    private static final String LOG_TAG = com/microsoft/applications/telemetry/LogConfiguration.getSimpleName();
    public String blobCollectorUri;
    public String cacheFilePath;
    public int cacheFileSizeLimitInBytes;
    public int cacheMemorySizeLimitInBytes;
    public long configurationProviderInstance;
    public String eventCollectorUri;
    public long httpStackInstance;
    public long palFactoryInstance;

    public LogConfiguration()
    {
        eventCollectorUri = "";
        blobCollectorUri = "";
        cacheFilePath = "";
        cacheFileSizeLimitInBytes = 0;
        cacheMemorySizeLimitInBytes = 0;
        httpStackInstance = 0L;
        palFactoryInstance = 0L;
        configurationProviderInstance = 0L;
    }

    public static LogConfiguration getDefaultConfiguration(Context context)
    {
        com/microsoft/applications/telemetry/LogConfiguration;
        JVM INSTR monitorenter ;
        if (DEFAULT_CONFIGURATION != null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        throw new IllegalArgumentException("Cannot pass in a null context when initializing the default configuration");
        context;
        com/microsoft/applications/telemetry/LogConfiguration;
        JVM INSTR monitorexit ;
        throw context;
        LogConfiguration logconfiguration = new LogConfiguration();
        DEFAULT_CONFIGURATION = logconfiguration;
        logconfiguration.eventCollectorUri = "https://pipe.skype.com/Collector/3.0/";
        DEFAULT_CONFIGURATION.blobCollectorUri = "https://pipe.skype.com/Collector/3.0/";
        DEFAULT_CONFIGURATION.cacheFilePath = (new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/offlinestorage.db").toString();
        DEFAULT_CONFIGURATION.cacheFileSizeLimitInBytes = 0x300000;
        DEFAULT_CONFIGURATION.cacheMemorySizeLimitInBytes = 0x300000;
        DEFAULT_CONFIGURATION.httpStackInstance = 0L;
        DEFAULT_CONFIGURATION.palFactoryInstance = 0L;
        DEFAULT_CONFIGURATION.configurationProviderInstance = 0L;
        (new StringBuilder("Creating default config: ")).append(DEFAULT_CONFIGURATION.toString());
        context = DEFAULT_CONFIGURATION;
        com/microsoft/applications/telemetry/LogConfiguration;
        JVM INSTR monitorexit ;
        return context;
    }

    public String toString()
    {
        return String.format("{eventUri: %s|blobUri: %s|cacheFilePath: %s|cacheSizeFileLimit: %s|cacheSizeMemoryLimit: %s|httpStack: 0x%d|palFactory: 0x%d|configProvider: 0x%d }", new Object[] {
            eventCollectorUri, blobCollectorUri, cacheFilePath, Integer.valueOf(cacheFileSizeLimitInBytes), Integer.valueOf(cacheMemorySizeLimitInBytes), Long.valueOf(httpStackInstance), Long.valueOf(palFactoryInstance), Long.valueOf(configurationProviderInstance)
        });
    }

}
