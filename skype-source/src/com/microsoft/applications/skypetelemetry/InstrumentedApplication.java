// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.microsoft.applications.skypetelemetry:
//            TelemetryStandaloneUtils, LogManager, d, e, 
//            b

public class InstrumentedApplication extends Application
{

    private static final String a = com/microsoft/applications/skypetelemetry/InstrumentedApplication.getSimpleName();
    private static e b;
    private static b c;
    private static String d = null;
    private static String e = null;
    private static boolean f = false;
    private static String g = null;

    public InstrumentedApplication()
    {
    }

    private static void a()
    {
        if (f)
        {
            Log.i(a, String.format("Shutting down log: %s", new Object[] {
                g
            }));
            TelemetryStandaloneUtils.a().b(g);
        }
    }

    public void finalize()
        throws Throwable
    {
        LogManager.b();
        a();
        super.finalize();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate()
    {
        super.onCreate();
        Object obj1;
        obj1 = getPackageManager().getApplicationInfo(getPackageName(), 128);
        if (((ApplicationInfo) (obj1)).metaData == null)
        {
            Log.e(a, "The application must provide <meta-data> with 'com.microsoft.applications.skypetelemetry.tenantToken' in the manifest");
            throw new IllegalStateException("The application must provide <meta-data> with 'com.microsoft.applications.skypetelemetry.tenantToken' in the manifest");
        }
          goto _L1
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Log.e(a, (new StringBuilder("Could not find metadata in package: ")).append(getPackageName()).toString());
_L5:
        Thread.setDefaultUncaughtExceptionHandler(new d(c, getApplicationContext()));
        return;
_L1:
        Object obj;
        obj = ((ApplicationInfo) (obj1)).metaData;
        obj1 = ((ApplicationInfo) (obj1)).metaData.keySet().iterator();
_L4:
        String s;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_319;
        }
        s = (String)((Iterator) (obj1)).next();
        if (!s.equals("com.microsoft.applications.skypetelemetry.tenantToken")) goto _L3; else goto _L2
_L2:
        d = ((Bundle) (obj)).getString("com.microsoft.applications.skypetelemetry.tenantToken");
        Log.i(a, String.format("Configured tenantToken: %s", new Object[] {
            d
        }));
          goto _L4
_L3:
label0:
        {
            if (!s.equals("com.microsoft.applications.skypetelemetry.eventCollectorUri"))
            {
                break label0;
            }
            e = ((Bundle) (obj)).getString("com.microsoft.applications.skypetelemetry.eventCollectorUri");
            Log.i(a, String.format("Configured Collector URI: %s", new Object[] {
                e
            }));
        }
          goto _L4
label1:
        {
            if (!s.equals("com.microsoft.applications.skypetelemetry.debugLogEnabled"))
            {
                break label1;
            }
            f = ((Bundle) (obj)).getBoolean("com.microsoft.applications.skypetelemetry.debugLogEnabled");
            Log.i(a, String.format("Debug Log Enabled: %s", new Object[] {
                Boolean.valueOf(f)
            }));
        }
          goto _L4
label2:
        {
            if (!s.equals("com.microsoft.applications.skypetelemetry.debugLogPath"))
            {
                break label2;
            }
            Log.i(a, String.format("Debug Log Path: %s", new Object[] {
                ((Bundle) (obj)).getString("com.microsoft.applications.skypetelemetry.debugLogPath")
            }));
        }
          goto _L4
        Log.w(a, String.format("Unrecognized metadata key: %s", new Object[] {
            s
        }));
          goto _L4
        obj1 = d;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_334;
        }
        if (!((String) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_361;
        }
        obj = String.format("An tenantToken is required! Please provide a token via metadata in the application manifest: '<meta-data android:name=\"com.microsoft.applications.skypetelemetry.tenantToken\" android:value=\"[yourtoken]\"' />", new Object[0]);
        Log.e(a, ((String) (obj)));
        throw new IllegalArgumentException(((String) (obj)));
        b = com.microsoft.applications.skypetelemetry.e.a(getApplicationContext());
        if (e != null)
        {
            b.a = e;
        }
        LogManager.a(this, d, b);
        c = LogManager.c();
        g = ((Bundle) (obj)).getString("com.microsoft.applications.skypetelemetry.debugLogPath", (new StringBuilder()).append(getFilesDir().getAbsolutePath()).append("/debug.log").toString());
        if (f)
        {
            Log.i(a, String.format("Debug log enabled. Log path: %s", new Object[] {
                g
            }));
            TelemetryStandaloneUtils.a().a(g);
        }
          goto _L5
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        LogManager.a();
    }

    public void onTerminate()
    {
        super.onTerminate();
        a();
        LogManager.b();
    }

    static 
    {
        System.loadLibrary("telemetryclient");
    }
}
