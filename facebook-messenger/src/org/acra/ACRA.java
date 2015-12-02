// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra;

import android.app.Application;
import android.text.format.Time;
import android.util.Log;
import org.acra.reporter.ReportsCrashes;

// Referenced classes of package org.acra:
//            ReportField, ErrorReporter

public class ACRA
{

    public static final ReportField DEFAULT_REPORT_FIELDS[];
    public static final String LOG_TAG = org/acra/ACRA.getSimpleName();
    public static final String NULL_VALUE = "ACRA-NULL-STRING";
    private static Time mAppStartDate;
    private static ReportsCrashes mReportsCrashes;

    public ACRA()
    {
    }

    public static ReportsCrashes getConfig()
    {
        return mReportsCrashes;
    }

    public static void init(ReportsCrashes reportscrashes)
    {
        mAppStartDate = new Time();
        mAppStartDate.setToNow();
        mReportsCrashes = reportscrashes;
        initAcra();
    }

    private static void initAcra()
    {
        Application application = mReportsCrashes.getApplication();
        Log.d(LOG_TAG, (new StringBuilder()).append("ACRA is enabled for ").append(application.getPackageName()).append(", intializing...").toString());
        ErrorReporter errorreporter = ErrorReporter.getInstance();
        errorreporter.setAppStartDate(mAppStartDate);
        errorreporter.init(application);
        errorreporter.checkReportsOnApplicationStart();
    }

    static 
    {
        DEFAULT_REPORT_FIELDS = (new ReportField[] {
            ReportField.REPORT_ID, ReportField.APP_VERSION_CODE, ReportField.APP_VERSION_NAME, ReportField.PACKAGE_NAME, ReportField.FILE_PATH, ReportField.PHONE_MODEL, ReportField.BRAND, ReportField.PRODUCT, ReportField.ANDROID_VERSION, ReportField.BUILD, 
            ReportField.TOTAL_MEM_SIZE, ReportField.AVAILABLE_MEM_SIZE, ReportField.CUSTOM_DATA, ReportField.STACK_TRACE, ReportField.INITIAL_CONFIGURATION, ReportField.CRASH_CONFIGURATION, ReportField.DISPLAY, ReportField.USER_APP_START_DATE, ReportField.USER_CRASH_DATE, ReportField.DUMPSYS_MEMINFO, 
            ReportField.DROPBOX, ReportField.LOGCAT, ReportField.EVENTSLOG, ReportField.RADIOLOG, ReportField.DEVICE_ID, ReportField.INSTALLATION_ID, ReportField.DEVICE_FEATURES, ReportField.ENVIRONMENT, ReportField.SETTINGS_SYSTEM, ReportField.SETTINGS_SECURE, 
            ReportField.PROCESS_NAME, ReportField.PROCESS_NAME_BY_AMS, ReportField.ACTIVITY_LOG, ReportField.JAIL_BROKEN, ReportField.PROCESS_UPTIME, ReportField.ACRA_REPORT_FILENAME
        });
    }
}
