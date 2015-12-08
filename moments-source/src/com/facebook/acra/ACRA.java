// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;

import android.content.Context;
import android.util.Log;
import com.facebook.acra.reporter.ReportsCrashes;
import com.facebook.acra.sender.FlexibleReportSender;
import com.facebook.acra.sender.HttpPostSender;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

// Referenced classes of package com.facebook.acra:
//            ReportField, ErrorReporter

public class ACRA
{

    public static final ReportField ALL_CRASH_REPORT_FIELDS[];
    private static final String ENABLE_SSL_CERT_CHECKS_FILE_NAME = "cert_checks.txt";
    public static final String LOG_TAG = com/facebook/acra/ACRA.getSimpleName();
    public static final ReportField MINIMAL_REPORT_FIELDS[];
    public static final String NULL_VALUE = "ACRA-NULL-STRING";
    private static final String REPORT_HOST_FILE_NAME = "report_host.txt";
    private static final String TAG = "ACRA";
    private static FlexibleReportSender mReportSender;
    private static ReportsCrashes mReportsCrashes;

    public ACRA()
    {
    }

    private static void closeStreamNoException(Closeable closeable)
    {
        if (closeable == null)
        {
            return;
        }
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            Log.e("ACRA", "Error while closing stream: ", closeable);
        }
    }

    public static ReportsCrashes getConfig()
    {
        return mReportsCrashes;
    }

    public static ErrorReporter init(ReportsCrashes reportscrashes, String s, boolean flag)
    {
        ErrorReporter errorreporter = ErrorReporter.getInstance();
        if (mReportsCrashes == null)
        {
            mReportsCrashes = reportscrashes;
            reportscrashes = reportscrashes.getApplicationContext();
            (new StringBuilder("ACRA is enabled for ")).append(reportscrashes.getPackageName()).append(", intializing...");
            errorreporter.init(reportscrashes, flag);
            Thread.setDefaultUncaughtExceptionHandler(errorreporter);
            if (s != null)
            {
                setReportSender(reportscrashes, errorreporter, s);
            }
            initCertChecks(reportscrashes);
            errorreporter.checkReportsOnApplicationStart();
        }
        return errorreporter;
    }

    private static void initCertChecks(Context context)
    {
        Object obj;
        String s;
        boolean flag1;
        boolean flag2;
        s = null;
        obj = null;
        flag1 = true;
        flag2 = true;
        context = context.getFileStreamPath("cert_checks.txt");
        if (!context.canRead()) goto _L2; else goto _L1
_L1:
        context = new BufferedReader(new FileReader(context));
        s = context.readLine().trim();
        boolean flag;
        flag = flag2;
        obj = context;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        flag = flag2;
        obj = context;
        if (s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_76;
        }
        flag = Boolean.parseBoolean(s);
        obj = context;
_L9:
        closeStreamNoException(((Closeable) (obj)));
_L4:
        mReportsCrashes.checkSSLCertsOnCrashReport(flag);
        return;
        context;
        context = ((Context) (obj));
_L7:
        closeStreamNoException(context);
        flag = flag1;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        obj = s;
_L6:
        closeStreamNoException(((Closeable) (obj)));
        throw context;
        Exception exception;
        exception;
        obj = context;
        context = exception;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
          goto _L7
_L2:
        obj = null;
        flag = flag2;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static void setEnableSSLcertChecks(boolean flag)
    {
        mReportsCrashes.checkSSLCertsOnCrashReport(flag);
        writeCertChecksFile(flag);
    }

    public static void setReportHost(String s)
    {
        mReportSender.setHost(s);
        writeReportHostFile(s);
    }

    private static void setReportSender(Context context, ErrorReporter errorreporter, String s)
    {
        Object obj;
        obj = null;
        mReportSender = new HttpPostSender(s);
        errorreporter.setReportSender(mReportSender);
        boolean flag;
        context = context.getFileStreamPath("report_host.txt");
        flag = context.canRead();
        if (!flag)
        {
            closeStreamNoException(null);
            return;
        }
        context = new BufferedReader(new FileReader(context));
        errorreporter = context.readLine().trim();
        if (errorreporter == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        if (!errorreporter.isEmpty())
        {
            mReportSender.setHost(errorreporter);
        }
        closeStreamNoException(context);
        return;
        context;
        context = null;
_L4:
        closeStreamNoException(context);
        return;
        errorreporter;
        context = obj;
_L2:
        closeStreamNoException(context);
        throw errorreporter;
        errorreporter;
        if (true) goto _L2; else goto _L1
_L1:
        errorreporter;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void writeCertChecksFile(boolean flag)
    {
        OutputStreamWriter outputstreamwriter1 = new OutputStreamWriter(mReportsCrashes.getApplicationContext().openFileOutput("cert_checks.txt", 0));
        OutputStreamWriter outputstreamwriter = outputstreamwriter1;
        outputstreamwriter1.write(Boolean.toString(flag));
        outputstreamwriter = outputstreamwriter1;
        outputstreamwriter1.flush();
        closeStreamNoException(outputstreamwriter1);
        return;
        IOException ioexception;
        ioexception;
        outputstreamwriter1 = null;
_L4:
        outputstreamwriter = outputstreamwriter1;
        Log.e("ACRA", "could not write to ssl cert checks file: ", ioexception);
        closeStreamNoException(outputstreamwriter1);
        return;
        Exception exception;
        exception;
        outputstreamwriter = null;
_L2:
        closeStreamNoException(outputstreamwriter);
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void writeReportHostFile(String s)
    {
        Object obj = null;
        OutputStreamWriter outputstreamwriter = new OutputStreamWriter(mReportsCrashes.getApplicationContext().openFileOutput("report_host.txt", 0));
        obj = outputstreamwriter;
        outputstreamwriter.write(s);
        obj = outputstreamwriter;
        outputstreamwriter.flush();
        closeStreamNoException(outputstreamwriter);
        return;
        IOException ioexception;
        ioexception;
        s = null;
_L4:
        obj = s;
        Log.e("ACRA", "could not write to host file: ", ioexception);
        closeStreamNoException(s);
        return;
        s;
_L2:
        closeStreamNoException(((Closeable) (obj)));
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
        s = outputstreamwriter;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        ALL_CRASH_REPORT_FIELDS = (new ReportField[] {
            ReportField.ACRA_REPORT_TYPE, ReportField.REPORT_ID, ReportField.APP_VERSION_CODE, ReportField.APP_VERSION_NAME, ReportField.APP_INSTALL_TIME, ReportField.APP_UPGRADE_TIME, ReportField.PACKAGE_NAME, ReportField.FILE_PATH, ReportField.PHONE_MODEL, ReportField.BRAND, 
            ReportField.PRODUCT, ReportField.ANDROID_VERSION, ReportField.OS_VERSION, ReportField.BUILD, ReportField.BUILD_HOST, ReportField.TOTAL_MEM_SIZE, ReportField.AVAILABLE_MEM_SIZE, ReportField.CUSTOM_DATA, ReportField.STACK_TRACE, ReportField.DEVICE, 
            ReportField.CRASH_CONFIGURATION, ReportField.DISPLAY, ReportField.USER_APP_START_DATE, ReportField.USER_CRASH_DATE, ReportField.DUMPSYS_MEMINFO, ReportField.DROPBOX, ReportField.LOGCAT, ReportField.EVENTSLOG, ReportField.RADIOLOG, ReportField.DEVICE_ID, 
            ReportField.INSTALLATION_ID, ReportField.DEVICE_FEATURES, ReportField.ENVIRONMENT, ReportField.SETTINGS_SYSTEM, ReportField.SETTINGS_SECURE, ReportField.PROCESS_NAME, ReportField.PROCESS_NAME_BY_AMS, ReportField.ACTIVITY_LOG, ReportField.JAIL_BROKEN, ReportField.PROCESS_UPTIME, 
            ReportField.DEVICE_UPTIME, ReportField.ACRA_REPORT_FILENAME, ReportField.EXCEPTION_CAUSE, ReportField.REPORT_LOAD_THROW, ReportField.MINIDUMP, ReportField.ANDROID_ID, ReportField.UID, ReportField.UPLOADED_BY_PROCESS, ReportField.OPEN_FD_COUNT, ReportField.OPEN_FD_SOFT_LIMIT, 
            ReportField.OPEN_FD_HARD_LIMIT, ReportField.IS_LOW_RAM_DEVICE, ReportField.SIGQUIT, ReportField.LARGE_MEM_HEAP, ReportField.ANDROID_RUNTIME, ReportField.MINIDUMP_EXCLUDE_REASON, ReportField.ATTACHMENT_ORIGINAL_SIZE, ReportField.LAST_URL_VISITED, ReportField.LAST_URL_VISITED_TIME, ReportField.TIME_OF_CRASH, 
            ReportField.WEBVIEW_VERSION, ReportField.LAST_ACTIVITY_LOGGED, ReportField.LAST_ACTIVITY_LOGGED_TIME, ReportField.IAB_OPEN_TIMES, ReportField.RUNTIME_PERMISSIONS
        });
        MINIMAL_REPORT_FIELDS = (new ReportField[] {
            ReportField.ACRA_REPORT_TYPE, ReportField.REPORT_ID, ReportField.APP_VERSION_CODE, ReportField.APP_VERSION_NAME, ReportField.APP_INSTALL_TIME, ReportField.APP_UPGRADE_TIME, ReportField.PACKAGE_NAME, ReportField.FILE_PATH, ReportField.PHONE_MODEL, ReportField.BRAND, 
            ReportField.PRODUCT, ReportField.ANDROID_VERSION, ReportField.OS_VERSION, ReportField.BUILD, ReportField.BUILD_HOST, ReportField.TOTAL_MEM_SIZE, ReportField.AVAILABLE_MEM_SIZE, ReportField.CUSTOM_DATA, ReportField.STACK_TRACE, ReportField.DEVICE, 
            ReportField.CRASH_CONFIGURATION, ReportField.DISPLAY, ReportField.USER_APP_START_DATE, ReportField.USER_CRASH_DATE, ReportField.DUMPSYS_MEMINFO, ReportField.DROPBOX, ReportField.DEVICE_ID, ReportField.INSTALLATION_ID, ReportField.DEVICE_FEATURES, ReportField.ENVIRONMENT, 
            ReportField.SETTINGS_SYSTEM, ReportField.SETTINGS_SECURE, ReportField.PROCESS_NAME, ReportField.PROCESS_NAME_BY_AMS, ReportField.ACTIVITY_LOG, ReportField.JAIL_BROKEN, ReportField.PROCESS_UPTIME, ReportField.DEVICE_UPTIME, ReportField.ACRA_REPORT_FILENAME, ReportField.EXCEPTION_CAUSE, 
            ReportField.REPORT_LOAD_THROW, ReportField.MINIDUMP, ReportField.ANDROID_ID, ReportField.UID, ReportField.UPLOADED_BY_PROCESS, ReportField.IS_LOW_RAM_DEVICE, ReportField.LARGE_MEM_HEAP, ReportField.ANDROID_RUNTIME, ReportField.ATTACHMENT_ORIGINAL_SIZE, ReportField.WEBVIEW_VERSION, 
            ReportField.RUNTIME_PERMISSIONS
        });
    }
}
