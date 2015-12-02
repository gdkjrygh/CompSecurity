// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.acra;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.format.Time;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.acra.reporter.ReportsCrashes;
import org.acra.sender.ReportSender;
import org.acra.sender.ReportSenderException;
import org.acra.util.Installation;
import org.acra.util.PackageManagerWrapper;
import org.acra.util.SimpleTraceLogger;

// Referenced classes of package org.acra:
//            CrashReportData, ACRA, ReportField, ReflectionCollector, 
//            ConfigurationInspector, DumpSysCollector, DeviceFeaturesCollector, SettingsCollector, 
//            LogCatCollector, DropBoxCollector

public class ErrorReporter
    implements Thread.UncaughtExceptionHandler
{

    public static final String ACRA_DIRNAME = "acra-reports";
    public static final long DEFAULT_MAX_REPORT_SIZE = 51200L;
    public static final long MAX_REPORT_AGE = 0x5265c00L;
    private static final int MAX_SEND_REPORTS = 5;
    public static final String REPORTFILE_EXTENSION = ".stacktrace";
    private static int TRACE_COUNT_LIMIT = 5;
    private static ErrorReporter mInstanceSingleton;
    private static String mInternalException = "ACRA_INTERNAL=java.lang.Exception: An exception occurred while trying to collect data about an ACRA internal error\n\tat org.acra.ErrorReporter.handleException(ErrorReporter.java:810)\n\tat org.acra.ErrorReporter.handleException(ErrorReporter.java:866)\n\tat org.acra.ErrorReporter.uncaughtException(ErrorReporter.java:666)\n\tat java.lang.ThreadGroup.uncaughtException(ThreadGroup.java:693)\n\tat java.lang.ThreadGroup.uncaughtException(ThreadGroup.java:690)\n";
    private final SimpleTraceLogger activityLogger;
    private boolean forceDump;
    private String mAppVersionCode;
    private String mAppVersionName;
    private Context mContext;
    private CrashReportData mCrashProperties;
    Map mCustomParameters;
    private Thread.UncaughtExceptionHandler mDfltExceptionHandler;
    private String mInitialConfiguration;
    private long mMaxReportSize;
    private ArrayList mReportSenders;
    private String processNameByAms;
    private boolean processNameByAmsReady;
    private boolean sendInMemoryReport;

    public ErrorReporter()
    {
        mMaxReportSize = 51200L;
        mReportSenders = new ArrayList();
        mCrashProperties = new CrashReportData();
        mCustomParameters = new ConcurrentHashMap();
        activityLogger = new SimpleTraceLogger(TRACE_COUNT_LIMIT);
        sendInMemoryReport = false;
        forceDump = false;
    }

    private void deleteFile(Context context, String s)
    {
        if (!fileForName(context, s).delete())
        {
            Log.w(ACRA.LOG_TAG, (new StringBuilder()).append("Could not delete error report : ").append(s).toString());
        }
    }

    private static File fileForName(Context context, String s)
    {
        return new File(context.getDir("acra-reports", 0), s);
    }

    private void gatherCrashData(String s, Writer writer)
    {
        put(ReportField.STACK_TRACE, s, writer);
        retrieveCrashData(mContext, writer);
    }

    private String genCrashReportFileName()
    {
        Log.d(ACRA.LOG_TAG, "Generating crash report file.");
        Object obj = new Time();
        ((Time) (obj)).setToNow();
        long l = ((Time) (obj)).toMillis(false);
        StringBuilder stringbuilder = (new StringBuilder()).append("").append(l);
        if (mAppVersionCode != null)
        {
            obj = (new StringBuilder()).append("-").append(mAppVersionCode).toString();
        } else
        {
            obj = "";
        }
        return stringbuilder.append(((String) (obj))).append(".stacktrace").toString();
    }

    private static long getAvailableInternalMemorySize()
    {
        int i;
        long l;
        try
        {
            StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
            l = statfs.getBlockSize();
            i = statfs.getAvailableBlocks();
        }
        catch (Exception exception)
        {
            return -1L;
        }
        return (long)i * l;
    }

    public static ErrorReporter getInstance()
    {
        if (mInstanceSingleton == null)
        {
            mInstanceSingleton = new ErrorReporter();
        }
        return mInstanceSingleton;
    }

    private String getJailStatus()
    {
        String s = Build.TAGS;
        if (s != null && s.contains("test-keys"))
        {
            return "yes";
        }
        if ((new File("/system/app/Superuser.apk")).exists())
        {
            return "yes";
        }
        break MISSING_BLOCK_LABEL_49;
        Exception exception;
        exception;
        Log.e(ACRA.LOG_TAG, "Failed to find Superuser.pak", exception);
        String as[];
        int i;
        int j;
        Map map = System.getenv();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        as = ((String)map.get("PATH")).split(":");
        j = as.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = as[i];
        obj = (new StringBuilder()).append(((String) (obj))).append("/").append("su").toString();
        obj = new File(((String) (obj)));
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((File) (obj)).exists())
        {
            return "yes";
        }
        continue; /* Loop/switch isn't completed */
        Exception exception1;
        exception1;
        Log.e(ACRA.LOG_TAG, "Failed to find su binary in the PATH", exception1);
        i++;
          goto _L3
_L2:
        return "no";
    }

    private String getProcessName()
    {
        Object obj;
        Object obj2;
        obj = getProcessNameFromAmsOrNull();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        obj2 = null;
        Object obj1 = new BufferedReader(new FileReader("/proc/self/cmdline"), 128);
        obj2 = ((BufferedReader) (obj1)).readLine();
        Object obj3;
        obj = obj2;
        obj3 = obj1;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = ((String) (obj2)).trim();
        obj3 = obj1;
_L1:
        obj1 = obj;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        ((BufferedReader) (obj3)).close();
        obj1 = obj;
_L2:
        obj = obj1;
        if (obj1 == null)
        {
            obj = "";
        }
        return ((String) (obj));
        IOException ioexception;
        ioexception;
        obj1 = obj;
        obj = obj2;
        obj2 = ioexception;
_L3:
        Log.e(ACRA.LOG_TAG, "Failed to get process name.", ((Throwable) (obj2)));
        ioexception = ((IOException) (obj));
        obj = obj1;
          goto _L1
        obj1;
        Log.e(ACRA.LOG_TAG, "Failed to close file.", ((Throwable) (obj1)));
        obj1 = obj;
          goto _L2
        obj2;
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L3
        obj4;
        obj = obj1;
        obj1 = obj2;
        obj2 = obj4;
          goto _L3
        obj1 = obj;
          goto _L2
    }

    private String getProcessNameFromAms()
    {
        String s1 = getProcessNameFromAmsOrNull();
        String s = s1;
        if (s1 == null)
        {
            s = "n/a";
        }
        return s;
    }

    private String getProcessNameFromAmsOrNull()
    {
        if (processNameByAmsReady)
        {
            return processNameByAms;
        }
        int i = Process.myPid();
        processNameByAms = null;
        Iterator iterator = ((ActivityManager)mContext.getSystemService("activity")).getRunningAppProcesses().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
            if (runningappprocessinfo.pid != i)
            {
                continue;
            }
            processNameByAms = runningappprocessinfo.processName;
            break;
        } while (true);
        processNameByAmsReady = true;
        return processNameByAms;
    }

    private long getProcessUptime()
    {
        return Process.getElapsedCpuTime();
    }

    private static long getTotalInternalMemorySize()
    {
        int i;
        long l;
        try
        {
            StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
            l = statfs.getBlockSize();
            i = statfs.getBlockCount();
        }
        catch (Exception exception)
        {
            return -1L;
        }
        return (long)i * l;
    }

    private CrashReportData loadCrashReport(Context context, String s)
    {
        CrashReportData crashreportdata;
        Object obj;
        boolean flag;
        boolean flag1;
        crashreportdata = new CrashReportData();
        obj = fileForName(context, s);
        if (System.currentTimeMillis() - ((File) (obj)).lastModified() > 0x5265c00L)
        {
            Log.w(ACRA.LOG_TAG, (new StringBuilder()).append("crash report ").append(s).append(" was too old; deleted").toString());
            deleteFile(context, s);
            return null;
        }
        if (((File) (obj)).length() > mMaxReportSize)
        {
            Log.w(ACRA.LOG_TAG, (new StringBuilder()).append("").append(((File) (obj)).length()).append("-byte crash report ").append(s).append(" exceeded max size of ").append(mMaxReportSize).append(" bytes; deleted").toString());
            deleteFile(context, s);
            return null;
        }
        obj = new FileInputStream(((File) (obj)));
        flag1 = false;
        flag = flag1;
        crashreportdata.load(((java.io.InputStream) (obj)));
        ((FileInputStream) (obj)).close();
_L2:
        return crashreportdata;
        Throwable throwable;
        throwable;
        flag = flag1;
        Log.e(ACRA.LOG_TAG, (new StringBuilder()).append("Could not load crash report:").append(s).append(" ").append(throwable).toString());
        flag = flag1;
        ((FileInputStream) (obj)).close();
        flag1 = true;
        flag = flag1;
        context.deleteFile(s);
        flag = flag1;
        Log.e(ACRA.LOG_TAG, (new StringBuilder()).append("Crash report:").append(s).append(" deleted").toString());
        if (true) goto _L2; else goto _L1
_L1:
        context;
        if (!flag)
        {
            ((FileInputStream) (obj)).close();
        }
        throw context;
    }

    private void put(ReportField reportfield, String s, Writer writer)
    {
        CrashReportData crashreportdata = mCrashProperties;
        if (sendInMemoryReport)
        {
            writer = null;
        }
        try
        {
            crashreportdata.put(reportfield, s, writer);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ReportField reportfield)
        {
            sendInMemoryReport = true;
        }
        return;
    }

    private void resetProcessNameByAmsCache()
    {
        processNameByAms = null;
        processNameByAmsReady = false;
    }

    private void retrieveCrashData(Context context, Writer writer)
    {
        List list = Arrays.asList(ACRA.DEFAULT_REPORT_FIELDS);
        if (list.contains(ReportField.REPORT_ID))
        {
            put(ReportField.REPORT_ID, UUID.randomUUID().toString(), writer);
        }
        if (list.contains(ReportField.APP_VERSION_CODE))
        {
            put(ReportField.APP_VERSION_CODE, mAppVersionCode, writer);
        }
        if (list.contains(ReportField.APP_VERSION_NAME))
        {
            put(ReportField.APP_VERSION_NAME, mAppVersionName, writer);
        }
        if (list.contains(ReportField.PACKAGE_NAME))
        {
            put(ReportField.PACKAGE_NAME, context.getPackageName(), writer);
        }
        if (list.contains(ReportField.PROCESS_NAME))
        {
            put(ReportField.PROCESS_NAME, getProcessName(), writer);
        }
        if (list.contains(ReportField.PROCESS_UPTIME))
        {
            put(ReportField.PROCESS_UPTIME, Long.toString(getProcessUptime()), writer);
        }
        if (list.contains(ReportField.BUILD))
        {
            put(ReportField.BUILD, ReflectionCollector.collectConstants(android/os/Build), writer);
        }
        if (list.contains(ReportField.PHONE_MODEL))
        {
            put(ReportField.PHONE_MODEL, Build.MODEL, writer);
        }
        if (list.contains(ReportField.ANDROID_VERSION))
        {
            put(ReportField.ANDROID_VERSION, android.os.Build.VERSION.RELEASE, writer);
        }
        if (list.contains(ReportField.BRAND))
        {
            put(ReportField.BRAND, Build.BRAND, writer);
        }
        if (list.contains(ReportField.PRODUCT))
        {
            put(ReportField.PRODUCT, Build.PRODUCT, writer);
        }
        if (list.contains(ReportField.JAIL_BROKEN))
        {
            put(ReportField.JAIL_BROKEN, getJailStatus(), writer);
        }
        if (list.contains(ReportField.CUSTOM_DATA))
        {
            put(ReportField.CUSTOM_DATA, createCustomInfoString(), writer);
        }
        if (list.contains(ReportField.INSTALLATION_ID))
        {
            put(ReportField.INSTALLATION_ID, Installation.id(mContext), writer);
        }
        if (list.contains(ReportField.INITIAL_CONFIGURATION))
        {
            put(ReportField.INITIAL_CONFIGURATION, mInitialConfiguration, writer);
        }
        if (list.contains(ReportField.CRASH_CONFIGURATION))
        {
            android.content.res.Configuration configuration = context.getResources().getConfiguration();
            put(ReportField.CRASH_CONFIGURATION, ConfigurationInspector.toString(configuration), writer);
        }
        if (list.contains(ReportField.TOTAL_MEM_SIZE))
        {
            put(ReportField.TOTAL_MEM_SIZE, Long.toString(getTotalInternalMemorySize()), writer);
        }
        if (list.contains(ReportField.AVAILABLE_MEM_SIZE))
        {
            put(ReportField.AVAILABLE_MEM_SIZE, Long.toString(getAvailableInternalMemorySize()), writer);
        }
        if (list.contains(ReportField.DUMPSYS_MEMINFO))
        {
            put(ReportField.DUMPSYS_MEMINFO, DumpSysCollector.collectMemInfo(context), writer);
        }
        if (list.contains(ReportField.FILE_PATH))
        {
            put(ReportField.FILE_PATH, context.getFilesDir().getAbsolutePath(), writer);
        }
        if (list.contains(ReportField.USER_CRASH_DATE))
        {
            Time time = new Time();
            time.setToNow();
            put(ReportField.USER_CRASH_DATE, time.format3339(false), writer);
        }
        if (list.contains(ReportField.DEVICE_FEATURES))
        {
            put(ReportField.DEVICE_FEATURES, DeviceFeaturesCollector.getFeatures(context), writer);
        }
        if (list.contains(ReportField.ENVIRONMENT))
        {
            put(ReportField.ENVIRONMENT, ReflectionCollector.collectStaticGettersResults(android/os/Environment), writer);
        }
        if (list.contains(ReportField.ACTIVITY_LOG))
        {
            put(ReportField.ACTIVITY_LOG, activityLogger.toString(), writer);
        }
        if (list.contains(ReportField.DISPLAY))
        {
            Display display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            put(ReportField.DISPLAY, toString(display), writer);
        }
        if (list.contains(ReportField.SETTINGS_SYSTEM))
        {
            put(ReportField.SETTINGS_SYSTEM, SettingsCollector.collectSystemSettings(mContext), writer);
        }
        if (list.contains(ReportField.SETTINGS_SECURE))
        {
            put(ReportField.SETTINGS_SECURE, SettingsCollector.collectSecureSettings(mContext), writer);
        }
        if (list.contains(ReportField.PROCESS_NAME_BY_AMS))
        {
            put(ReportField.PROCESS_NAME_BY_AMS, getProcessNameFromAms(), writer);
        }
        resetProcessNameByAmsCache();
        PackageManagerWrapper packagemanagerwrapper = new PackageManagerWrapper(context);
        if (packagemanagerwrapper != null)
        {
            if (forceDump && packagemanagerwrapper.hasPermission("android.permission.READ_LOGS"))
            {
                Log.i(ACRA.LOG_TAG, "READ_LOGS granted! ACRA can include LogCat and DropBox data.");
                if (list.contains(ReportField.LOGCAT))
                {
                    put(ReportField.LOGCAT, LogCatCollector.collectLogCat(null).toString(), writer);
                }
                if (list.contains(ReportField.EVENTSLOG))
                {
                    put(ReportField.EVENTSLOG, LogCatCollector.collectLogCat("events").toString(), writer);
                }
                if (list.contains(ReportField.RADIOLOG))
                {
                    put(ReportField.RADIOLOG, LogCatCollector.collectLogCat("radio").toString(), writer);
                }
                if (list.contains(ReportField.DROPBOX))
                {
                    put(ReportField.DROPBOX, DropBoxCollector.read(mContext, ACRA.getConfig().additionalDropBoxTags()), writer);
                }
            } else
            {
                Log.i(ACRA.LOG_TAG, "READ_LOGS not allowed. ACRA will not include LogCat and DropBox data.");
            }
            if (list.contains(ReportField.DEVICE_ID) && packagemanagerwrapper.hasPermission("android.permission.READ_PHONE_STATE"))
            {
                context = ((TelephonyManager)context.getSystemService("phone")).getDeviceId();
                if (context != null)
                {
                    put(ReportField.DEVICE_ID, context, writer);
                }
            }
        }
    }

    private void sendCrashReport(CrashReportData crashreportdata)
    {
        Iterator iterator;
        boolean flag;
        iterator = mReportSenders.iterator();
        flag = false;
_L2:
        ReportSender reportsender;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        reportsender = (ReportSender)iterator.next();
        reportsender.send(crashreportdata);
        flag = true;
        continue; /* Loop/switch isn't completed */
        ReportSenderException reportsenderexception;
        reportsenderexception;
        if (!flag)
        {
            throw reportsenderexception;
        }
        Log.w(ACRA.LOG_TAG, (new StringBuilder()).append("ReportSender of class ").append(reportsender.getClass().getName()).append(" failed but other senders completed their task. ACRA will not send this report again.").toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String throwableToString(Throwable throwable)
    {
        Object obj = throwable;
        if (throwable == null)
        {
            obj = new Exception("Report requested by developer");
        }
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        ((Throwable) (obj)).printStackTrace(printwriter);
        for (throwable = ((Throwable) (obj)).getCause(); throwable != null; throwable = throwable.getCause())
        {
            throwable.printStackTrace(printwriter);
        }

        printwriter.close();
        return stringwriter.toString();
    }

    private static String toString(Display display)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("width=").append(display.getWidth()).append('\n').append("height=").append(display.getHeight()).append('\n').append("pixelFormat=").append(display.getPixelFormat()).append('\n').append("refreshRate=").append(display.getRefreshRate()).append("fps").append('\n').append("metrics.density=x").append(displaymetrics.density).append('\n').append("metrics.scaledDensity=x").append(displaymetrics.scaledDensity).append('\n').append("metrics.widthPixels=").append(displaymetrics.widthPixels).append('\n').append("metrics.heightPixels=").append(displaymetrics.heightPixels).append('\n').append("metrics.xdpi=").append(displaymetrics.xdpi).append('\n').append("metrics.ydpi=").append(displaymetrics.ydpi);
        return stringbuilder.toString();
    }

    public void addReportSender(ReportSender reportsender)
    {
        mReportSenders.add(reportsender);
    }

    void checkAndSendReports(Context context)
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        int k;
        Log.d(ACRA.LOG_TAG, "#checkAndSendReports - start");
        obj = getCrashReportFilesList();
        Arrays.sort(((Object []) (obj)));
        k = obj.length;
        int j = 0;
          goto _L1
_L4:
        Log.d(ACRA.LOG_TAG, "#checkAndSendReports - finish");
        this;
        JVM INSTR monitorexit ;
        return;
_L5:
        String s;
        Log.i(ACRA.LOG_TAG, (new StringBuilder()).append("Sending file ").append(s).toString());
        CrashReportData crashreportdata = loadCrashReport(context, s);
        if (crashreportdata == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        crashreportdata.put(ReportField.ACRA_REPORT_FILENAME, s);
        sendCrashReport(crashreportdata);
        deleteFile(context, s);
        j++;
        i++;
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e(ACRA.LOG_TAG, "Failed to send crash reports", ((Throwable) (obj)));
        deleteFile(context, s);
        break; /* Loop/switch isn't completed */
        context;
        throw context;
        obj;
        Log.e(ACRA.LOG_TAG, (new StringBuilder()).append("Failed to load crash report for ").append(s).toString(), ((Throwable) (obj)));
        deleteFile(context, s);
        break; /* Loop/switch isn't completed */
        context;
        Log.e(ACRA.LOG_TAG, (new StringBuilder()).append("Failed to send crash report for ").append(s).toString(), context);
        break; /* Loop/switch isn't completed */
_L1:
        if (i >= k) goto _L3; else goto _L2
_L2:
        break MISSING_BLOCK_LABEL_227;
_L3:
        break; /* Loop/switch isn't completed */
        s = obj[i];
        if (j < 5) goto _L5; else goto _L4
    }

    public ReportsSenderWorker checkReportsOnApplicationStart()
    {
        String as[] = getCrashReportFilesList();
        if (as != null && as.length > 0)
        {
            Log.v(ACRA.LOG_TAG, "About to start ReportSenderWorker from #checkReportOnApplicationStart");
            ReportsSenderWorker reportssenderworker = new ReportsSenderWorker();
            reportssenderworker.start();
            return reportssenderworker;
        } else
        {
            return null;
        }
    }

    public String createCustomInfoString()
    {
        Iterator iterator = mCustomParameters.entrySet().iterator();
        String s;
        String s1;
        Object obj;
        for (s = ""; iterator.hasNext(); s = (new StringBuilder()).append(s).append(s1).append(" = ").append(((String) (obj))).append("\n").toString())
        {
            obj = (java.util.Map.Entry)iterator.next();
            s1 = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (String)((java.util.Map.Entry) (obj)).getValue();
        }

        return s;
    }

    String[] getCrashReportFilesList()
    {
        Object obj;
        if (mContext == null)
        {
            Log.e(ACRA.LOG_TAG, "Trying to get ACRA reports but ACRA is not initialized.");
            obj = new String[0];
        } else
        {
            obj = mContext.getDir("acra-reports", 0);
            if (obj != null)
            {
                Log.d(ACRA.LOG_TAG, (new StringBuilder()).append("Looking for error files in ").append(((File) (obj)).getAbsolutePath()).toString());
                String as[] = ((File) (obj)).list(new _cls1());
                obj = as;
                if (as == null)
                {
                    return new String[0];
                }
            } else
            {
                Log.w(ACRA.LOG_TAG, "Application files directory does not exist! The application may not be installed correctly. Please try reinstalling.");
                return new String[0];
            }
        }
        return ((String []) (obj));
    }

    public String getCustomData(String s)
    {
        return (String)mCustomParameters.get(s);
    }

    public ReportsSenderWorker handleException(String s)
    {
        return handleException(s, true);
    }

    ReportsSenderWorker handleException(String s, boolean flag)
    {
        String s1 = genCrashReportFileName();
        FileOutputStream fileoutputstream = new FileOutputStream(fileForName(mContext, s1));
        Object obj = CrashReportData.getWriter(fileoutputstream);
_L1:
        put(ReportField.ACRA_REPORT_FILENAME, s1, ((Writer) (obj)));
        gatherCrashData(s, ((Writer) (obj)));
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(ACRA.LOG_TAG, "An error occurred while deleting closing the report file ...", s);
        }
_L2:
        Exception exception1;
        if (flag)
        {
            s = new ReportsSenderWorker(sendInMemoryReport);
            Log.v(ACRA.LOG_TAG, "About to start ReportSenderWorker from #handleException");
            s.start();
            return s;
        } else
        {
            Log.v(ACRA.LOG_TAG, "ACRA caught an OutOfMemoryError. Report upload deferred until next ACRA launch.");
            return null;
        }
        obj;
        fileoutputstream = null;
_L4:
        Log.e(ACRA.LOG_TAG, "An error occurred while creating the report file ...", ((Throwable) (obj)));
        sendInMemoryReport = true;
        obj = null;
          goto _L1
        s;
        Log.e(ACRA.LOG_TAG, "An error occurred while gathering crash data ...", s);
        PrintWriter printwriter = new PrintWriter(new StringWriter());
        s.printStackTrace(printwriter);
        put(ReportField.ACRA_INTERNAL, printwriter.toString(), ((Writer) (obj)));
        Log.e(ACRA.LOG_TAG, "An error occurred while gathering crash data ...", s);
_L3:
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(ACRA.LOG_TAG, "An error occurred while deleting closing the report file ...", s);
        }
          goto _L2
        exception1;
        Log.e(ACRA.LOG_TAG, "An error occurred while gathering internal crash data ...", exception1);
        put(ReportField.ACRA_INTERNAL, mInternalException, ((Writer) (obj)));
        Log.e(ACRA.LOG_TAG, "An error occurred while gathering crash data ...", s);
          goto _L3
        s;
        try
        {
            fileoutputstream.close();
        }
        catch (Exception exception)
        {
            Log.e(ACRA.LOG_TAG, "An error occurred while deleting closing the report file ...", exception);
        }
        throw s;
        obj;
        Log.e(ACRA.LOG_TAG, "An error occurred while gathering crash data ...", s);
        throw obj;
        obj;
          goto _L4
    }

    public ReportsSenderWorker handleException(Throwable throwable)
    {
        boolean flag;
        if (!(throwable instanceof OutOfMemoryError))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return handleException(throwableToString(throwable), flag);
    }

    public void init(Context context)
    {
        if (mDfltExceptionHandler == null)
        {
            mDfltExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
            mContext = context;
            mInitialConfiguration = ConfigurationInspector.toString(mContext.getResources().getConfiguration());
            context = (new PackageManagerWrapper(context)).getPackageInfo();
            if (context != null)
            {
                mAppVersionCode = Integer.toString(((PackageInfo) (context)).versionCode);
                if (((PackageInfo) (context)).versionName != null)
                {
                    context = ((PackageInfo) (context)).versionName;
                } else
                {
                    context = "not set";
                }
                mAppVersionName = context;
            }
        }
    }

    public String putCustomData(String s, String s1)
    {
        if (s1 != null)
        {
            return (String)mCustomParameters.put(s, s1);
        } else
        {
            return removeCustomData(s);
        }
    }

    public void registerActivity(String s)
    {
        if (s != null)
        {
            activityLogger.append(s);
        }
    }

    public void removeAllReportSenders()
    {
        mReportSenders.clear();
    }

    public String removeCustomData(String s)
    {
        return (String)mCustomParameters.remove(s);
    }

    void sendInMemoryReport(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        Log.i(ACRA.LOG_TAG, "Sending in-memory report");
        String s;
        sendCrashReport(mCrashProperties);
        s = (String)mCrashProperties.get(ReportField.ACRA_REPORT_FILENAME);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        context = fileForName(context, s);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        context.delete();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        Log.e(ACRA.LOG_TAG, "Failed to send in-memory crash report: ", context);
        if (true) goto _L2; else goto _L1
_L1:
        context;
        throw context;
    }

    public void setAppStartDate(Time time)
    {
        mCrashProperties.put(ReportField.USER_APP_START_DATE, time.format3339(false));
    }

    public void setMaxReportSize(long l)
    {
        mMaxReportSize = l;
    }

    public void setReportSender(ReportSender reportsender)
    {
        removeAllReportSenders();
        addReportSender(reportsender);
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Log.e(ACRA.LOG_TAG, (new StringBuilder()).append("ACRA caught a ").append(throwable.getClass().getSimpleName()).append(" exception for ").append(mContext.getPackageName()).append(". Building report.").toString());
        if (throwable instanceof SecurityException)
        {
            forceDump = true;
        }
        mCrashProperties.remove(ReportField.IS_SILENT);
        ReportsSenderWorker reportssenderworker = handleException(throwable);
        if (reportssenderworker != null)
        {
            while (reportssenderworker.isAlive()) 
            {
                try
                {
                    Thread.sleep(100L);
                }
                catch (InterruptedException interruptedexception)
                {
                    Log.e(ACRA.LOG_TAG, "Error : ", interruptedexception);
                }
            }
        }
        if (mDfltExceptionHandler != null)
        {
            mDfltExceptionHandler.uncaughtException(thread, throwable);
        }
    }

    public void writeReportToStream(Throwable throwable, OutputStream outputstream)
    {
        try
        {
            outputstream = CrashReportData.getWriter(outputstream);
            gatherCrashData(throwableToString(throwable), outputstream);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            Log.e("ACRA", (new StringBuilder()).append("Crash in writeReportToStream:").append(throwable).toString());
        }
    }



    private class ReportsSenderWorker extends Thread
    {

        private boolean mSendInMemoryReport;
        final ErrorReporter this$0;

        private android.os.PowerManager.WakeLock acquireWakeLock()
        {
            if (!(new PackageManagerWrapper(mContext)).hasPermission("android.permission.WAKE_LOCK"))
            {
                return null;
            } else
            {
                android.os.PowerManager.WakeLock wakelock = ((PowerManager)mContext.getSystemService("power")).newWakeLock(1, "ACRA wakelock");
                wakelock.acquire();
                return wakelock;
            }
        }

        public void run()
        {
            android.os.PowerManager.WakeLock wakelock = acquireWakeLock();
            if (mSendInMemoryReport)
            {
                sendInMemoryReport(mContext);
            }
            checkAndSendReports(mContext);
            if (wakelock != null)
            {
                wakelock.release();
            }
            return;
            Exception exception;
            exception;
            if (wakelock != null)
            {
                wakelock.release();
            }
            throw exception;
        }

        public ReportsSenderWorker()
        {
            this$0 = ErrorReporter.this;
            super();
            mSendInMemoryReport = false;
        }

        public ReportsSenderWorker(boolean flag)
        {
            this$0 = ErrorReporter.this;
            super();
            mSendInMemoryReport = false;
            mSendInMemoryReport = flag;
        }
    }


    private class _cls1
        implements FilenameFilter
    {

        final ErrorReporter this$0;

        public boolean accept(File file, String s)
        {
            return s.endsWith(".stacktrace");
        }

        _cls1()
        {
            this$0 = ErrorReporter.this;
            super();
        }
    }

}
