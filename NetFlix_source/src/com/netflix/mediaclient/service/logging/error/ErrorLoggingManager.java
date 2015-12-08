// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.error;

import android.app.Application;
import android.os.Build;
import com.crittercism.app.Crittercism;
import com.crittercism.app.CrittercismConfig;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.repository.SecurityRepository;
import org.json.JSONException;
import org.json.JSONObject;

public final class ErrorLoggingManager
{

    private static final String CRITTER_VERSION_NAME = "3.7.1";
    private static final boolean ENABLE_CRITTERCISM = true;
    private static final String TAG = "nf_log";
    private static boolean sCrittercismReady;

    public ErrorLoggingManager()
    {
    }

    public static void init(Application application)
    {
        com/netflix/mediaclient/service/logging/error/ErrorLoggingManager;
        JVM INSTR monitorenter ;
        CrittercismConfig crittercismconfig;
        Log.d("nf_log", "Crittercism init starts...");
        crittercismconfig = new CrittercismConfig();
        crittercismconfig.setNdkCrashReportingEnabled(true);
        crittercismconfig.setCustomVersionName("3.7.1");
        Crittercism.initialize(application.getApplicationContext(), SecurityRepository.getCrittercismAppId(), crittercismconfig);
        application = new JSONObject();
        application.put("android", android.os.Build.VERSION.SDK_INT);
        putValueOrNotAvailable(application, "oem", Build.MANUFACTURER);
        putValueOrNotAvailable(application, "model", Build.MODEL);
        Crittercism.setMetadata(application);
        sCrittercismReady = true;
        Log.d("nf_log", "Init Crittercism done.");
_L2:
        com/netflix/mediaclient/service/logging/error/ErrorLoggingManager;
        JVM INSTR monitorexit ;
        return;
        application;
        Log.e("nf_log", "Unable to build crittercism's config json object", application);
        if (true) goto _L2; else goto _L1
_L1:
        application;
        throw application;
    }

    public static boolean isCrittercismEnabled()
    {
        return true;
    }

    public static void leaveBreadcrumb(String s)
    {
        if (shouldLog())
        {
            Crittercism.leaveBreadcrumb(s);
        }
    }

    public static void logHandledException(Exception exception)
    {
        if (shouldLog())
        {
            Crittercism.logHandledException(exception);
        }
    }

    public static void logHandledException(String s)
    {
        if (shouldLog())
        {
            logHandledException(new Exception(s));
        }
    }

    private static void putValueOrNotAvailable(JSONObject jsonobject, String s, String s1)
        throws JSONException
    {
        if (s1 != null)
        {
            jsonobject.put(s, s1);
            return;
        } else
        {
            jsonobject.put(s, "N/A");
            return;
        }
    }

    public static boolean shouldLog()
    {
        return isCrittercismEnabled() && sCrittercismReady;
    }
}
