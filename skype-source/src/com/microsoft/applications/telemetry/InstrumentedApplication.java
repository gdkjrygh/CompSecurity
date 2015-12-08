// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.telemetry;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.microsoft.applications.telemetry:
//            TelemetryStandaloneUtils, LogManager, InstrumentedExceptionHandler, LogConfiguration, 
//            ILogger

public class InstrumentedApplication extends Application
{

    private static final String DEBUG_ENABLED_KEY = "com.microsoft.applications.telemetry.debugLogEnabled";
    private static final String DEBUG_LOG_PATH_KEY = "com.microsoft.applications.telemetry.debugLogPath";
    private static final String EVENT_COLLECTOR_URI_KEY = "com.microsoft.applications.telemetry.eventCollectorUri";
    private static final String LOG_TAG = com/microsoft/applications/telemetry/InstrumentedApplication.getSimpleName();
    private static final String TENANT_TOKEN_META_KEY = "com.microsoft.applications.telemetry.tenantToken";
    private static boolean debugLogEnabled = false;
    private static String debugLogPath = null;
    private static String eventCollectorUri = null;
    private static LogConfiguration logConfig;
    private static ILogger logger;
    private static String tenantToken = null;

    public InstrumentedApplication()
    {
    }

    private void checkTenantToken(String s)
    {
        if (s == null || s.isEmpty())
        {
            s = String.format("An tenantToken is required! Please provide a token via metadata in the application manifest: '<meta-data android:name=\"com.microsoft.applications.telemetry.tenantToken\" android:value=\"[yourtoken]\"' />", new Object[0]);
            Log.e(LOG_TAG, s);
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    private void setupLog()
    {
        Log.i(LOG_TAG, String.format("Debug log enabled. Log path: %s", new Object[] {
            debugLogPath
        }));
        TelemetryStandaloneUtils.getTelemetryClientUtils().setupLog(true, debugLogPath);
    }

    private void shutdownLog()
    {
        if (debugLogEnabled)
        {
            Log.i(LOG_TAG, String.format("Shutting down log: %s", new Object[] {
                debugLogPath
            }));
            TelemetryStandaloneUtils.getTelemetryClientUtils().shutdownLog(debugLogPath);
        }
    }

    public void finalize()
        throws Throwable
    {
        LogManager.appStop();
        shutdownLog();
        super.finalize();
    }

    public ILogger getLogger()
    {
        return logger;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate()
    {
        super.onCreate();
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        Object obj;
        obj = getPackageManager().getApplicationInfo(getPackageName(), 128);
        if (((ApplicationInfo) (obj)).metaData == null)
        {
            Log.e(LOG_TAG, "The application must provide <meta-data> with 'com.microsoft.applications.telemetry.tenantToken' in the manifest");
            throw new IllegalStateException("The application must provide <meta-data> with 'com.microsoft.applications.telemetry.tenantToken' in the manifest");
        }
          goto _L1
_L6:
        Thread.setDefaultUncaughtExceptionHandler(new InstrumentedExceptionHandler(logger, getApplicationContext()));
        return;
_L1:
        Bundle bundle;
        bundle = ((ApplicationInfo) (obj)).metaData;
        obj = ((ApplicationInfo) (obj)).metaData.keySet().iterator();
_L4:
        String s;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_319;
        }
        s = (String)((Iterator) (obj)).next();
        if (!s.equals("com.microsoft.applications.telemetry.tenantToken")) goto _L3; else goto _L2
_L2:
        tenantToken = bundle.getString("com.microsoft.applications.telemetry.tenantToken");
        Log.i(LOG_TAG, String.format("Configured tenantToken: %s", new Object[] {
            tenantToken
        }));
          goto _L4
_L3:
label0:
        {
            if (!s.equals("com.microsoft.applications.telemetry.eventCollectorUri"))
            {
                break label0;
            }
            eventCollectorUri = bundle.getString("com.microsoft.applications.telemetry.eventCollectorUri");
            Log.i(LOG_TAG, String.format("Configured Collector URI: %s", new Object[] {
                eventCollectorUri
            }));
        }
          goto _L4
label1:
        {
            if (!s.equals("com.microsoft.applications.telemetry.debugLogEnabled"))
            {
                break label1;
            }
            debugLogEnabled = bundle.getBoolean("com.microsoft.applications.telemetry.debugLogEnabled");
            Log.i(LOG_TAG, String.format("Debug Log Enabled: %s", new Object[] {
                Boolean.valueOf(debugLogEnabled)
            }));
        }
          goto _L4
label2:
        {
            if (!s.equals("com.microsoft.applications.telemetry.debugLogPath"))
            {
                break label2;
            }
            Log.i(LOG_TAG, String.format("Debug Log Path: %s", new Object[] {
                bundle.getString("com.microsoft.applications.telemetry.debugLogPath")
            }));
        }
          goto _L4
        Log.w(LOG_TAG, String.format("Unrecognized metadata key: %s", new Object[] {
            s
        }));
          goto _L4
        try
        {
            checkTenantToken(tenantToken);
            logConfig = LogConfiguration.getDefaultConfiguration(getApplicationContext());
            if (eventCollectorUri != null)
            {
                logConfig.eventCollectorUri = eventCollectorUri;
            }
            LogManager.appStart(this, tenantToken, logConfig);
            logger = LogManager.getLogger();
            debugLogPath = bundle.getString("com.microsoft.applications.telemetry.debugLogPath", (new StringBuilder()).append(getFilesDir().getAbsolutePath()).append("/debug.log").toString());
            if (debugLogEnabled)
            {
                setupLog();
            }
        }
        // Misplaced declaration of an exception variable
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            Log.e(LOG_TAG, (new StringBuilder("Could not find metadata in package: ")).append(getPackageName()).toString());
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        LogManager.flush();
    }

    public void onTerminate()
    {
        super.onTerminate();
        shutdownLog();
        LogManager.appStop();
    }

    static 
    {
        System.loadLibrary("telemetryclient");
    }
}
