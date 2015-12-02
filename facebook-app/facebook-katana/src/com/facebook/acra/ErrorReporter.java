// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.acra.reporter.ReportsCrashes;
import com.facebook.acra.sender.FlexibleReportSender;
import com.facebook.acra.sender.ReportSender;
import com.facebook.acra.sender.ReportSenderException;
import com.facebook.acra.util.Installation;
import com.facebook.acra.util.PackageManagerWrapper;
import com.facebook.acra.util.ProcFileReader;
import com.facebook.acra.util.SimpleTraceLogger;
import com.facebook.androidcompat.AndroidCompat;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.io.Writer;
import java.net.Proxy;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.facebook.acra:
//            ACRA, ReportField, CrashReportData, CustomReportDataSupplier, 
//            ReflectionCollector, DeviceFeaturesCollector, SettingsCollector, NonCrashException, 
//            MinidumpExcludeReason, ConfigurationInspector, DumpSysCollector, PermissionsReporter, 
//            LogCatCollector, DropBoxCollector, LogBridge, DexVerifyBridge

public class ErrorReporter
    implements Thread.UncaughtExceptionHandler
{

    public static final String ACRA_DIRNAME = "acra-reports";
    private static final CrashReportType ALL_REPORT_TYPES[];
    private static final String ANDROID_RUNTIME_ART = "ART";
    private static final String ANDROID_RUNTIME_DALVIK = "DALVIK";
    private static final String ANDROID_RUNTIME_UNKNOWN = "UNKNOWN";
    public static final String CRASH_ATTACHMENT_DUMMY_STACKTRACE = "crash attachment";
    public static final long DEFAULT_MAX_REPORT_SIZE = 0x100000L;
    private static int DEFAULT_TRACE_COUNT_LIMIT = 0;
    public static final String DUMPFILE_EXTENSION = ".dmp";
    public static final String DUMP_DIR = "minidumps";
    private static final String EMPTY_LAST_URL = "EMPTY_URL";
    private static final String FILE_IAB_OPEN_TIMES = "iab_open_times";
    private static final String FILE_LAST_ACTIVITY = "last_activity_opened";
    private static final String FILE_LAST_URL = "last_url_opened";
    private static final String IS_PROCESSING_ANOTHER_EXCEPTION = "IS_PROCESSING_ANOTHER_EXCEPTION";
    private static final String JAVA_BOOT_CLASS_PATH = "java.boot.class.path";
    private static final String KNOWN_ART_JAR = "/system/framework/core-libart.jar";
    private static final String KNOWN_DALVIK_JAR = "/system/framework/core.jar";
    public static final long MAX_REPORT_AGE = 0x240c8400L;
    public static final int MAX_SEND_REPORTS = 5;
    private static int MAX_TRACE_COUNT_LIMIT = 0;
    private static final long MIN_TEMP_REPORT_AGE = 0x927c0L;
    public static final long NATIVE_MAX_REPORT_SIZE = 0x800000L;
    private static final String NO_FILE = "NO_FILE";
    public static final long PREALLOCATED_FILESIZE = 0x100000L;
    public static final String PREALLOCATED_REPORTFILE = "reportfile.prealloc";
    public static final String REPORTFILE_EXTENSION = ".stacktrace";
    public static final String SIGQUIT_DIR = "traces";
    public static final long SIGQUIT_MAX_REPORT_SIZE = 0x80000L;
    public static final String TAG = "ErrorReporter";
    public static final String TEMP_REPORTFILE_EXTENSION = ".temp_stacktrace";
    private static final Pattern VERSION_CODE_REGEX = Pattern.compile("^\\d+-[a-zA-Z0-9_\\-]+-(\\d+)\\.(temp_stacktrace|stacktrace)$");
    private static final String WEBVIEW_PACKAGE_NAME = "com.google.android.webview";
    private static ErrorReporter mInstanceSingleton;
    private static final String mInternalException = "ACRA_INTERNAL=java.lang.Exception: An exception occurred while trying to collect data about an ACRA internal error\n\tat com.facebook.acra.ErrorReporter.handleException(ErrorReporter.java:810)\n\tat com.facebook.acra.ErrorReporter.handleException(ErrorReporter.java:866)\n\tat com.facebook.acra.ErrorReporter.uncaughtException(ErrorReporter.java:666)\n\tat java.lang.ThreadGroup.uncaughtException(ThreadGroup.java:693)\n\tat java.lang.ThreadGroup.uncaughtException(ThreadGroup.java:690)\n";
    private static AtomicBoolean mProcessingCrash = new AtomicBoolean(false);
    private final SimpleTraceLogger activityLogger;
    private final Time mAppStartDate = new Time();
    private String mAppVersionCode;
    private String mAppVersionName;
    private final Map mConstantFields = new HashMap();
    private Context mContext;
    private boolean mCurrentlyProcessingOOM;
    private final Map mDeviceSpecificFields = new HashMap();
    private DexVerifyBridge mDexVerifyBridge;
    private Thread.UncaughtExceptionHandler mDfltExceptionHandler;
    private boolean mHasNativeCrashDumpOnInit;
    Map mInstanceCustomParameters;
    Map mInstanceLazyCustomParameters;
    private boolean mIsInternalBuild;
    private LogBridge mLogBridge;
    private long mMaxReportSize;
    private PackageManagerWrapper mPackageManager;
    private ArrayList mReportSenders;
    private final Object mShouldContinueProcessingExceptionLock = new Object();
    private volatile String mUserId;
    private File preallocFile;
    private String processNameByAms;
    private boolean processNameByAmsReady;
    private volatile boolean sendInMemoryReport;
    private boolean usePreallocatedFile;

    public ErrorReporter()
    {
        mMaxReportSize = 0x100000L;
        mHasNativeCrashDumpOnInit = false;
        mReportSenders = new ArrayList();
        mInstanceCustomParameters = new ConcurrentHashMap();
        mInstanceLazyCustomParameters = new ConcurrentHashMap();
        mCurrentlyProcessingOOM = false;
        preallocFile = null;
        activityLogger = new SimpleTraceLogger(MAX_TRACE_COUNT_LIMIT);
        sendInMemoryReport = false;
        usePreallocatedFile = false;
    }

    public static boolean anyFilesPresentOfType(File file, String as[])
    {
        if (file != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if ((file = file.list()) != null && file.length != 0)
        {
            if (as == null || as.length == 0)
            {
                return true;
            }
            int k = file.length;
            int i = 0;
            while (i < k) 
            {
                String s = file[i];
                int l = as.length;
                for (int j = 0; j < l; j++)
                {
                    if (s.endsWith(as[j]))
                    {
                        return true;
                    }
                }

                i++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void checkAndSendAcraReports(Context context)
    {
        File afile[];
        String s1;
        int i;
        int j;
        int k;
        j = 0;
        afile = getCrashReportFilesList("acra-reports", new String[] {
            ".stacktrace", ".temp_stacktrace"
        });
        s1 = getProcessNameFromAms();
        k = afile.length;
        i = 0;
_L2:
        File file;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        file = afile[i];
        if (j < 5)
        {
            break; /* Loop/switch isn't completed */
        }
        deleteFile(file);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        String s;
        s = file.getName();
        String s2 = ACRA.LOG_TAG;
        (new StringBuilder("Loading file ")).append(s);
        CrashReportData crashreportdata = loadAcraCrashReport(context, file);
        if (crashreportdata == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        crashreportdata.put(ReportField.ACRA_REPORT_TYPE, CrashReportType.ACRA_CRASH_REPORT.name());
        crashreportdata.put(ReportField.ACRA_REPORT_FILENAME, s);
        crashreportdata.put(ReportField.UPLOADED_BY_PROCESS, s1);
        String s3 = ACRA.LOG_TAG;
        (new StringBuilder("Sending file ")).append(s);
        sendCrashReport(crashreportdata);
        deleteFile(file);
        j++;
          goto _L3
        context;
        Log.e(ACRA.LOG_TAG, "Failed to send crash reports", context);
        deleteFile(file);
        return;
        context;
        Log.e(ACRA.LOG_TAG, (new StringBuilder("Failed to load crash report for ")).append(s).toString(), context);
        deleteFile(file);
        return;
        context;
        Log.e(ACRA.LOG_TAG, (new StringBuilder("Failed to send crash report for ")).append(s).toString(), context);
        return;
    }

    private int checkAndSendCrashAttachments(Context context, CrashReportType crashreporttype)
    {
        File afile[];
        int j;
        j = 0;
        String s = ACRA.LOG_TAG;
        if ((new File((new StringBuilder()).append(crashreporttype.directory).append("/.noupload").toString())).exists())
        {
            return 0;
        }
        afile = getCrashReportFilesList(crashreporttype.directory, crashreporttype.fileExtensions);
        if (afile == null || afile.length <= 0) goto _L2; else goto _L1
_L1:
        CrashReportData crashreportdata;
        File file;
        int i;
        int k;
        crashreportdata = new CrashReportData();
        crashreportdata.put(ReportField.ACRA_REPORT_TYPE, crashreporttype.name());
        int l;
        try
        {
            gatherCrashData("crash attachment", new CrashAttachmentException(null), ACRA.ALL_CRASH_REPORT_FIELDS, crashreportdata, null, null);
        }
        catch (Exception exception)
        {
            String s1 = (new StringBuilder("retrieve exception: ")).append(exception.getMessage()).toString();
            put(ReportField.REPORT_LOAD_THROW, s1, crashreportdata, null);
        }
        l = afile.length;
        i = 0;
        k = i;
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        file = afile[j];
        if (i < 5)
        {
            break; /* Loop/switch isn't completed */
        }
        deleteFile(file);
_L5:
        j++;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_118;
_L3:
        String s2 = file.getName();
        CrashReportData crashreportdata1 = loadCrashAttachment(context, file, crashreporttype);
        if (crashreportdata1 != null) goto _L6; else goto _L5
_L6:
        String s3 = (String)crashreportdata1.get(crashreporttype.attachmentField);
        crashreportdata.put(ReportField.REPORT_ID, s2.substring(0, s2.lastIndexOf('.')), null);
        crashreportdata.put(crashreporttype.attachmentField, s3, null);
        crashreportdata.merge(crashreportdata1);
        crashreportdata.put(ReportField.EXCEPTION_CAUSE, "crash attachment", null);
        sendCrashReport(crashreportdata);
        deleteFile(file);
        i++;
          goto _L5
        context;
        Log.e(ACRA.LOG_TAG, (new StringBuilder("Failed to send crash attachment report ")).append(s2).toString(), context);
        k = i;
_L8:
        context = ACRA.LOG_TAG;
        (new StringBuilder("#checkAndSendCrashAttachments - finish, sent: ")).append(Integer.toString(k));
        return k;
        context;
        Log.e(ACRA.LOG_TAG, (new StringBuilder("Failed on crash attachment file ")).append(s2).toString(), context);
        deleteFile(file);
        k = i;
        continue; /* Loop/switch isn't completed */
_L2:
        k = 0;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void createPreallocatedReportFile()
    {
        Object obj;
        Object obj1;
        Object obj2;
        long l;
        obj1 = null;
        obj2 = null;
        l = 0L;
        obj = obj1;
        if (!preallocFile.exists()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        l = preallocFile.length();
          goto _L2
_L9:
        obj = obj1;
        byte abyte0[] = new byte[10240];
        obj = obj1;
        obj1 = new FileOutputStream(preallocFile, true);
_L4:
        if (l >= 0x100000L)
        {
            break; /* Loop/switch isn't completed */
        }
        ((FileOutputStream) (obj1)).write(abyte0);
        l += 10240L;
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            ((FileOutputStream) (obj1)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj;
        obj1 = obj2;
        obj2 = obj;
_L7:
        obj = obj1;
        Log.e(ACRA.LOG_TAG, "Failed to pre-allocate crash report file", ((Throwable) (obj2)));
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
        }
        break; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L6:
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            catch (IOException ioexception) { }
        }
        throw obj;
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
        if (true) goto _L7; else goto _L2
_L2:
        if (l <= 0x100000L) goto _L9; else goto _L8
_L8:
    }

    private static void deleteFile(File file)
    {
        while (file == null || file.delete() || !file.exists()) 
        {
            return;
        }
        Log.w(ACRA.LOG_TAG, (new StringBuilder("Could not delete error report: ")).append(file.getName()).toString());
    }

    private void dumpCustomDataEntry(StringBuilder stringbuilder, String s, String s1)
    {
        String s2 = null;
        if (s != null)
        {
            s = s.replace("\n", "\\n");
        } else
        {
            s = null;
        }
        if (s1 != null)
        {
            s2 = s1.replace("\n", "\\n");
        }
        stringbuilder.append(s).append(" = ").append(s2).append("\n");
    }

    private void dumpCustomDataMap(StringBuilder stringbuilder, Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); dumpCustomDataEntry(stringbuilder, (String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    private void dumpLazyCustomDataMap(StringBuilder stringbuilder, Map map, Throwable throwable)
    {
        map = map.entrySet().iterator();
_L2:
        String s;
        Object obj;
        if (!map.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (java.util.Map.Entry)map.next();
        s = (String)((java.util.Map.Entry) (obj)).getKey();
        obj = ((CustomReportDataSupplier)((java.util.Map.Entry) (obj)).getValue()).getCustomData(throwable);
        if (obj != null)
        {
            dumpCustomDataEntry(stringbuilder, s, ((String) (obj)));
        }
        continue; /* Loop/switch isn't completed */
        Throwable throwable1;
        throwable1;
        Log.e(ACRA.LOG_TAG, "Caught throwable while getting custom report data", throwable1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static File fileForName(Context context, String s, String s1)
    {
        return new File(context.getDir(s, 0), s1);
    }

    private String formatTimestamp(long l)
    {
        Time time = new Time();
        time.set(l);
        return time.format3339(false);
    }

    private void gatherCrashData(String s, Throwable throwable, ReportField areportfield[], CrashReportData crashreportdata, Writer writer, Map map)
    {
        if (areportfield == null)
        {
            areportfield = ACRA.MINIMAL_REPORT_FIELDS;
        }
        put(ReportField.UID, getUserId(), crashreportdata, writer);
        put(ReportField.STACK_TRACE, s, crashreportdata, writer);
        java.util.Map.Entry entry;
        for (s = mConstantFields.entrySet().iterator(); s.hasNext(); put((ReportField)entry.getKey(), (String)entry.getValue(), crashreportdata, writer))
        {
            entry = (java.util.Map.Entry)s.next();
        }

        retrieveCrashTimeData(mContext, throwable, areportfield, crashreportdata, writer);
        populateConstantDeviceData(crashreportdata, writer);
        put(ReportField.CUSTOM_DATA, dumpCustomDataToString(map, throwable), crashreportdata, writer);
    }

    private String genCrashReportFileName(Class class1, String s)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(Long.toString(System.currentTimeMillis())).append("-").append(class1.getSimpleName());
        if (mAppVersionCode != null)
        {
            class1 = (new StringBuilder("-")).append(mAppVersionCode).toString();
        } else
        {
            class1 = "";
        }
        return stringbuilder.append(class1).append(s).toString();
    }

    private String getAndroidRuntime()
    {
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            return "DALVIK";
        }
        String s = System.getProperty("java.boot.class.path");
        if (s != null)
        {
            if (s.contains("/system/framework/core-libart.jar"))
            {
                return "ART";
            }
            if (s.contains("/system/framework/core.jar"))
            {
                return "DALVIK";
            }
        }
        return "UNKNOWN";
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

    private Map getConstantDeviceData()
    {
        Map map = mDeviceSpecificFields;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        if (!mDeviceSpecificFields.isEmpty())
        {
            break MISSING_BLOCK_LABEL_356;
        }
        mDeviceSpecificFields.put(ReportField.BUILD, ReflectionCollector.collectConstants(android/os/Build));
        mDeviceSpecificFields.put(ReportField.JAIL_BROKEN, getJailStatus());
        mDeviceSpecificFields.put(ReportField.INSTALLATION_ID, Installation.id(mContext));
        mDeviceSpecificFields.put(ReportField.TOTAL_MEM_SIZE, Long.toString(getTotalInternalMemorySize()));
        if (!mPackageManager.hasPermission("android.permission.READ_PHONE_STATE"))
        {
            break MISSING_BLOCK_LABEL_142;
        }
        obj = ((TelephonyManager)mContext.getSystemService("phone")).getDeviceId();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        mDeviceSpecificFields.put(ReportField.DEVICE_ID, obj);
        obj = ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay();
        mDeviceSpecificFields.put(ReportField.DISPLAY, toString(((Display) (obj))));
        mDeviceSpecificFields.put(ReportField.ENVIRONMENT, ReflectionCollector.collectStaticGettersResults(android/os/Environment));
        mDeviceSpecificFields.put(ReportField.DEVICE_FEATURES, DeviceFeaturesCollector.getFeatures(mContext));
        mDeviceSpecificFields.put(ReportField.SETTINGS_SYSTEM, SettingsCollector.collectSystemSettings(mContext));
        mDeviceSpecificFields.put(ReportField.SETTINGS_SECURE, SettingsCollector.collectSecureSettings(mContext));
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj = (ActivityManager)mContext.getSystemService("activity");
            mDeviceSpecificFields.put(ReportField.IS_LOW_RAM_DEVICE, Boolean.toString(((ActivityManager) (obj)).isLowRamDevice()));
        }
        mDeviceSpecificFields.put(ReportField.ANDROID_RUNTIME, getAndroidRuntime());
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        obj = mPackageManager.getPackageInfo("com.google.android.webview", 0);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        mDeviceSpecificFields.put(ReportField.WEBVIEW_VERSION, ((PackageInfo) (obj)).versionName);
        obj = mDeviceSpecificFields;
        map;
        JVM INSTR monitorexit ;
        return ((Map) (obj));
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private long getDeviceUptime()
    {
        return SystemClock.elapsedRealtime();
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
        break MISSING_BLOCK_LABEL_54;
        Exception exception;
        exception;
        Log.e(ACRA.LOG_TAG, "Failed to find Superuser.pak", exception);
        String as[];
        int i;
        int j;
        Map map = System.getenv();
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        as = ((String)map.get("PATH")).split(":");
        j = as.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = as[i];
        s1 = (new StringBuilder()).append(s1).append("/su").toString();
        if ((new File(s1)).exists())
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
            break MISSING_BLOCK_LABEL_149;
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
        processNameByAms = null;
        int i = Process.myPid();
        Object obj = (ActivityManager)mContext.getSystemService("activity");
        if (obj == null)
        {
            return processNameByAms;
        }
        obj = ((ActivityManager) (obj)).getRunningAppProcesses();
        if (obj == null)
        {
            return processNameByAms;
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
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

    private ReportField[] getReportFieldsForException(Throwable throwable)
    {
        if (throwable instanceof NonCrashException)
        {
            return ACRA.MINIMAL_REPORT_FIELDS;
        }
        if (throwable instanceof OutOfMemoryError)
        {
            return ACRA.MINIMAL_REPORT_FIELDS;
        } else
        {
            return ACRA.ALL_CRASH_REPORT_FIELDS;
        }
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

    private ReportsSenderWorker handleExceptionInternal(Throwable throwable, Map map, String s, ReportField areportfield[], boolean flag)
    {
        Object obj;
        Object obj1;
        Object obj2;
        CrashReportData crashreportdata;
        File file;
        File file1;
        obj = getMostSignificantCause(throwable);
        Class class1 = obj.getClass();
        if (!shouldContinueProcessingException(((Throwable) (obj))))
        {
            return null;
        }
        crashreportdata = new CrashReportData();
        String s1;
        if (throwable instanceof NonCrashException)
        {
            obj = ((NonCrashException)throwable).getExceptionFriendlyName();
        } else
        {
            obj = "crash";
        }
        writeToLogBridge(ACRA.LOG_TAG, (new StringBuilder("Handling exception for ")).append(((String) (obj))).toString(), throwable, s);
        obj1 = ACRA.LOG_TAG;
        (new StringBuilder("Generating report file for ")).append(((String) (obj)));
        obj = genCrashReportFileName(class1, ".temp_stacktrace");
        file = fileForName(mContext, "acra-reports", ((String) (obj)));
        s1 = genCrashReportFileName(class1, ".stacktrace");
        file1 = fileForName(mContext, "acra-reports", s1);
        obj1 = null;
        obj2 = null;
        if (usePreallocatedFile)
        {
            preallocFile.renameTo(file);
        }
        obj = new RandomAccessFile(file, "rw");
        obj1 = CrashReportData.getWriter(new FileOutputStream(((RandomAccessFile) (obj)).getFD()));
_L1:
        put(ReportField.ACRA_REPORT_FILENAME, s1, crashreportdata, ((Writer) (obj1)));
        put(ReportField.EXCEPTION_CAUSE, class1.getName(), crashreportdata, ((Writer) (obj1)));
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        s = throwableToString(throwable);
        gatherCrashData(s, throwable, areportfield, crashreportdata, ((Writer) (obj1)), map);
        if (obj != null)
        {
            try
            {
                throwable = ((RandomAccessFile) (obj)).getChannel();
                throwable.truncate(throwable.position());
                ((RandomAccessFile) (obj)).close();
                file.renameTo(file1);
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                Log.e(ACRA.LOG_TAG, "An error occurred while deleting closing the report file ...", throwable);
            }
        }
_L2:
        if (flag)
        {
            Exception exception;
            if (sendInMemoryReport)
            {
                throwable = new ReportsSenderWorker(crashreportdata);
            } else
            {
                throwable = new ReportsSenderWorker(new CrashReportType[] {
                    CrashReportType.ACRA_CRASH_REPORT
                });
            }
            map = ACRA.LOG_TAG;
            throwable.start();
            return throwable;
        } else
        {
            throwable = ACRA.LOG_TAG;
            return null;
        }
        exception;
        obj = obj1;
        obj1 = exception;
_L4:
        Log.e(ACRA.LOG_TAG, "An error occurred while creating the report file ...", ((Throwable) (obj1)));
        sendInMemoryReport = true;
        obj1 = obj2;
          goto _L1
        throwable;
        Log.e(ACRA.LOG_TAG, "An error occurred while gathering crash data ...", throwable);
        put(ReportField.ACRA_INTERNAL, throwableToString(throwable), crashreportdata, ((Writer) (obj1)));
        Log.e(ACRA.LOG_TAG, "An error occurred while gathering crash data ...", throwable);
_L3:
        if (obj != null)
        {
            try
            {
                throwable = ((RandomAccessFile) (obj)).getChannel();
                throwable.truncate(throwable.position());
                ((RandomAccessFile) (obj)).close();
                file.renameTo(file1);
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                Log.e(ACRA.LOG_TAG, "An error occurred while deleting closing the report file ...", throwable);
            }
        }
          goto _L2
        map;
        Log.e(ACRA.LOG_TAG, "An error occurred while gathering internal crash data ...", map);
        put(ReportField.ACRA_INTERNAL, "ACRA_INTERNAL=java.lang.Exception: An exception occurred while trying to collect data about an ACRA internal error\n\tat com.facebook.acra.ErrorReporter.handleException(ErrorReporter.java:810)\n\tat com.facebook.acra.ErrorReporter.handleException(ErrorReporter.java:866)\n\tat com.facebook.acra.ErrorReporter.uncaughtException(ErrorReporter.java:666)\n\tat java.lang.ThreadGroup.uncaughtException(ThreadGroup.java:693)\n\tat java.lang.ThreadGroup.uncaughtException(ThreadGroup.java:690)\n", crashreportdata, ((Writer) (obj1)));
        Log.e(ACRA.LOG_TAG, "An error occurred while gathering crash data ...", throwable);
          goto _L3
        throwable;
        if (obj != null)
        {
            try
            {
                map = ((RandomAccessFile) (obj)).getChannel();
                map.truncate(map.position());
                ((RandomAccessFile) (obj)).close();
                file.renameTo(file1);
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                Log.e(ACRA.LOG_TAG, "An error occurred while deleting closing the report file ...", map);
            }
        }
        throw throwable;
        map;
        Log.e(ACRA.LOG_TAG, "An error occurred while gathering crash data ...", throwable);
        throw map;
        obj1;
          goto _L4
    }

    private CrashReportData loadAcraCrashReport(Context context, File file)
    {
        return loadCrashReport(context, file, CrashReportType.ACRA_CRASH_REPORT, mMaxReportSize);
    }

    private String loadAttachment(InputStream inputstream, int i)
    {
        byte abyte0[];
        int j = 0;
        abyte0 = new byte[i];
        int k = 0;
        int l;
        do
        {
            l = j;
            if (i - k <= 0)
            {
                break;
            }
            j = inputstream.read(abyte0, k, i - k);
            l = j;
            if (j == -1)
            {
                break;
            }
            k += j;
        } while (true);
        if (l == 0)
        {
            return "";
        }
        inputstream = new ByteArrayOutputStream();
        GZIPOutputStream gzipoutputstream = new GZIPOutputStream(inputstream);
        gzipoutputstream.write(abyte0, 0, i);
        gzipoutputstream.finish();
        inputstream = Base64.encodeToString(inputstream.toByteArray(), 0);
        gzipoutputstream.close();
        return inputstream;
        inputstream;
        gzipoutputstream = null;
_L2:
        if (gzipoutputstream != null)
        {
            gzipoutputstream.close();
        }
        throw inputstream;
        inputstream;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private CrashReportData loadCrashAttachment(Context context, File file, CrashReportType crashreporttype)
    {
        return loadCrashReport(context, file, crashreporttype, crashreporttype.defaultMaxSize);
    }

    private CrashReportData loadCrashReport(Context context, File file, CrashReportType crashreporttype, long l)
    {
        FileInputStream fileinputstream;
        String s;
        CrashReportData crashreportdata;
        long l1;
        s = file.getName();
        l1 = System.currentTimeMillis();
        long l2 = file.lastModified();
        if (s.endsWith(".temp_stacktrace"))
        {
            if (l2 > 0L && l1 - l2 < 0x927c0L)
            {
                Log.w(ACRA.LOG_TAG, (new StringBuilder("temp file ")).append(s).append(" is too recent; skipping").toString());
                return null;
            }
            if (!file.exists())
            {
                Log.w(ACRA.LOG_TAG, (new StringBuilder("temp file ")).append(s).append(" deleted. skipping").toString());
                return null;
            }
        }
        crashreportdata = new CrashReportData();
        crashreportdata.put(ReportField.TIME_OF_CRASH, Long.toString(l2));
        if (l1 - l2 > 0x240c8400L)
        {
            Log.w(ACRA.LOG_TAG, (new StringBuilder("crash report ")).append(s).append(" was too old; deleted").toString());
            deleteFile(file);
            if (crashreporttype.attachmentField != null)
            {
                crashreportdata.put(crashreporttype.attachmentField, "attachment too old");
            }
            crashreportdata.put(ReportField.MINIDUMP_EXCLUDE_REASON, MinidumpExcludeReason.DUMP_TOO_OLD.name());
            return crashreportdata;
        }
        l1 = file.length();
        if (l1 > l)
        {
            Log.w(ACRA.LOG_TAG, (new StringBuilder()).append(l1).append("-byte crash report ").append(s).append(" exceeded max size of ").append(l).append(" bytes; deleted").toString());
            deleteFile(file);
            if (crashreporttype.attachmentField != null)
            {
                crashreportdata.put(crashreporttype.attachmentField, "attachment too big");
            }
            crashreportdata.put(ReportField.MINIDUMP_EXCLUDE_REASON, MinidumpExcludeReason.DUMP_TOO_BIG.name());
            crashreportdata.put(ReportField.ATTACHMENT_ORIGINAL_SIZE, String.valueOf(l1));
            return crashreportdata;
        }
        fileinputstream = new FileInputStream(file);
        if (crashreporttype != CrashReportType.ACRA_CRASH_REPORT) goto _L2; else goto _L1
_L1:
        crashreportdata.load(fileinputstream);
_L11:
        fileinputstream.close();
_L12:
        crashreportdata.put(ReportField.ACRA_REPORT_FILENAME, s);
        backfillCrashReportData(crashreportdata);
        return crashreportdata;
_L2:
        int i = (int)l1;
        file = loadAttachment(fileinputstream, i);
        if (crashreporttype != CrashReportType.NATIVE_CRASH_REPORT) goto _L4; else goto _L3
_L3:
        File file1;
        File file2;
        file1 = mContext.getFilesDir();
        file2 = new File(file1, "last_url_opened");
        if (file2.exists()) goto _L6; else goto _L5
_L5:
        crashreportdata.put(ReportField.LAST_URL_VISITED, "NO_FILE");
_L13:
        file2 = new File(file1, "last_activity_opened");
        if (file2.exists()) goto _L8; else goto _L7
_L7:
        crashreportdata.put(ReportField.LAST_ACTIVITY_LOGGED, "NO_FILE");
_L23:
        Object obj;
        Object obj1;
        obj = new File(file1, "iab_open_times");
        obj1 = readFile(((File) (obj)));
        if (!"NO_FILE".equals(obj1)) goto _L10; else goto _L9
_L9:
        crashreportdata.put(ReportField.IAB_OPEN_TIMES, "0");
_L31:
        if (((File) (obj)).exists())
        {
            ((File) (obj)).delete();
        }
_L4:
        crashreportdata.put(crashreporttype.attachmentField, file);
        crashreportdata.put(ReportField.ATTACHMENT_ORIGINAL_SIZE, String.valueOf(l1));
          goto _L11
_L20:
        crashreportdata.put(ReportField.REPORT_LOAD_THROW, (new StringBuilder("throwable: ")).append(file.getMessage()).toString());
        Log.e(ACRA.LOG_TAG, (new StringBuilder("Could not load crash report:")).append(s).append(" ").append(file).toString());
        fileinputstream.close();
        boolean flag = true;
        context.deleteFile(s);
        Log.e(ACRA.LOG_TAG, (new StringBuilder("Crash report:")).append(s).append(" deleted").toString());
          goto _L12
        context;
_L14:
        if (!flag)
        {
            fileinputstream.close();
        }
        throw context;
_L6:
        obj1 = new FileReader(file2);
        BufferedReader bufferedreader = new BufferedReader(((java.io.Reader) (obj1)), 1024);
        obj = null;
        String s1 = bufferedreader.readLine();
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_778;
        }
        crashreportdata.put(ReportField.LAST_URL_VISITED, "EMPTY_URL");
_L15:
        file2.delete();
        bufferedreader.close();
        ((FileReader) (obj1)).close();
          goto _L13
        context;
        flag = false;
          goto _L14
        s1 = s1.trim();
        crashreportdata.put(ReportField.LAST_URL_VISITED, s1);
        crashreportdata.put(ReportField.LAST_URL_VISITED_TIME, Long.toString(file2.lastModified()));
          goto _L15
        crashreporttype;
        throw crashreporttype;
        file;
_L33:
        if (crashreporttype == null) goto _L17; else goto _L16
_L16:
        bufferedreader.close();
_L21:
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (CrashReportType crashreporttype) { }
        throw crashreporttype;
        file;
_L34:
        if (crashreporttype == null) goto _L19; else goto _L18
_L18:
        ((FileReader) (obj1)).close();
_L22:
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
          goto _L20
        obj;
        AndroidCompat.addSuppressed(crashreporttype, ((Throwable) (obj)));
          goto _L21
_L17:
        bufferedreader.close();
          goto _L21
        obj;
        AndroidCompat.addSuppressed(crashreporttype, ((Throwable) (obj)));
          goto _L22
_L19:
        ((FileReader) (obj1)).close();
          goto _L22
_L8:
        obj1 = new FileReader(file2);
        bufferedreader = new BufferedReader(((java.io.Reader) (obj1)), 1024);
        obj = null;
        s1 = bufferedreader.readLine();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_952;
        }
        crashreportdata.put(ReportField.LAST_ACTIVITY_LOGGED, s1);
        crashreportdata.put(ReportField.LAST_ACTIVITY_LOGGED_TIME, Long.toString(file2.lastModified()));
        file2.delete();
        bufferedreader.close();
        ((FileReader) (obj1)).close();
          goto _L23
        crashreporttype;
        throw crashreporttype;
        file;
_L32:
        if (crashreporttype == null) goto _L25; else goto _L24
_L24:
        bufferedreader.close();
_L28:
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (CrashReportType crashreporttype) { }
        throw crashreporttype;
        file;
_L35:
        if (crashreporttype == null) goto _L27; else goto _L26
_L26:
        ((FileReader) (obj1)).close();
_L29:
        throw file;
        obj;
        AndroidCompat.addSuppressed(crashreporttype, ((Throwable) (obj)));
          goto _L28
_L25:
        bufferedreader.close();
          goto _L28
        obj;
        AndroidCompat.addSuppressed(crashreporttype, ((Throwable) (obj)));
          goto _L29
_L27:
        ((FileReader) (obj1)).close();
          goto _L29
_L10:
        if (obj1 == null) goto _L31; else goto _L30
_L30:
        crashreportdata.put(ReportField.IAB_OPEN_TIMES, obj1);
          goto _L31
        file;
        crashreporttype = ((CrashReportType) (obj));
          goto _L32
        file;
        crashreporttype = ((CrashReportType) (obj));
          goto _L33
        file;
        crashreporttype = null;
          goto _L34
        file;
        crashreporttype = null;
          goto _L35
    }

    private void populateConstantDeviceData(CrashReportData crashreportdata, Writer writer)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = getConstantDeviceData().entrySet().iterator(); iterator.hasNext(); put((ReportField)entry.getKey(), (String)entry.getValue(), crashreportdata, writer))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    private void put(ReportField reportfield, String s, CrashReportData crashreportdata, Writer writer)
    {
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
    }

    private static String readFile(File file)
    {
        if (!file.exists())
        {
            return "NO_FILE";
        }
        Object obj = new FileReader(file);
        Object obj1 = new BufferedReader(((java.io.Reader) (obj)), 1024);
        file = ((BufferedReader) (obj1)).readLine();
        if (file == null) goto _L2; else goto _L1
_L1:
        ((BufferedReader) (obj1)).close();
        ((FileReader) (obj)).close();
        return file;
_L4:
        return null;
_L2:
        ((BufferedReader) (obj1)).close();
        try
        {
            ((FileReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        if (true) goto _L4; else goto _L3
_L3:
        Throwable throwable;
        throwable;
        throw throwable;
        file;
_L11:
        if (throwable == null) goto _L6; else goto _L5
_L5:
        ((BufferedReader) (obj1)).close();
_L9:
        try
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        throw throwable;
        file;
_L12:
        if (throwable == null) goto _L8; else goto _L7
_L7:
        ((FileReader) (obj)).close();
_L10:
        throw file;
        obj1;
        AndroidCompat.addSuppressed(throwable, ((Throwable) (obj1)));
          goto _L9
_L6:
        ((BufferedReader) (obj1)).close();
          goto _L9
        obj;
        AndroidCompat.addSuppressed(throwable, ((Throwable) (obj)));
          goto _L10
_L8:
        ((FileReader) (obj)).close();
          goto _L10
        file;
        throwable = null;
          goto _L11
        file;
        throwable = null;
          goto _L12
    }

    private void resetProcessNameByAmsCache()
    {
        processNameByAms = null;
        processNameByAmsReady = false;
    }

    private void retrieveCrashTimeData(Context context, Throwable throwable, ReportField areportfield[], CrashReportData crashreportdata, Writer writer)
    {
        areportfield = Arrays.asList(areportfield);
        if (areportfield.contains(ReportField.REPORT_ID))
        {
            put(ReportField.REPORT_ID, UUID.randomUUID().toString(), crashreportdata, writer);
        }
        if (areportfield.contains(ReportField.PROCESS_NAME))
        {
            put(ReportField.PROCESS_NAME, getProcessName(), crashreportdata, writer);
        }
        if (areportfield.contains(ReportField.USER_APP_START_DATE))
        {
            put(ReportField.USER_APP_START_DATE, mAppStartDate.format3339(false), crashreportdata, writer);
        }
        if (areportfield.contains(ReportField.PROCESS_UPTIME))
        {
            put(ReportField.PROCESS_UPTIME, Long.toString(getProcessUptime()), crashreportdata, writer);
        }
        if (areportfield.contains(ReportField.DEVICE_UPTIME))
        {
            put(ReportField.DEVICE_UPTIME, Long.toString(getDeviceUptime()), crashreportdata, writer);
        }
        if (areportfield.contains(ReportField.CRASH_CONFIGURATION))
        {
            android.content.res.Configuration configuration = context.getResources().getConfiguration();
            put(ReportField.CRASH_CONFIGURATION, ConfigurationInspector.toString(configuration), crashreportdata, writer);
        }
        if (areportfield.contains(ReportField.AVAILABLE_MEM_SIZE))
        {
            String s = Long.toString(getAvailableInternalMemorySize());
            put(ReportField.AVAILABLE_MEM_SIZE, s, crashreportdata, writer);
        }
        if (areportfield.contains(ReportField.DUMPSYS_MEMINFO))
        {
            put(ReportField.DUMPSYS_MEMINFO, DumpSysCollector.collectMemInfo(context), crashreportdata, writer);
        }
        if (areportfield.contains(ReportField.USER_CRASH_DATE))
        {
            Time time = new Time();
            time.setToNow();
            put(ReportField.USER_CRASH_DATE, time.format3339(false), crashreportdata, writer);
        }
        if (areportfield.contains(ReportField.ACTIVITY_LOG))
        {
            if (throwable instanceof OutOfMemoryError)
            {
                throwable = activityLogger.toString();
            } else
            {
                throwable = activityLogger.toString(DEFAULT_TRACE_COUNT_LIMIT);
            }
            put(ReportField.ACTIVITY_LOG, throwable, crashreportdata, writer);
        }
        if (areportfield.contains(ReportField.PROCESS_NAME_BY_AMS))
        {
            put(ReportField.PROCESS_NAME_BY_AMS, getProcessNameFromAms(), crashreportdata, writer);
        }
        resetProcessNameByAmsCache();
        if (areportfield.contains(ReportField.OPEN_FD_COUNT))
        {
            put(ReportField.OPEN_FD_COUNT, String.valueOf(ProcFileReader.getOpenFDCount()), crashreportdata, writer);
        }
        if (areportfield.contains(ReportField.OPEN_FD_SOFT_LIMIT) || areportfield.contains(ReportField.OPEN_FD_HARD_LIMIT))
        {
            throwable = ProcFileReader.getOpenFDLimits();
            if (throwable != null)
            {
                if (areportfield.contains(ReportField.OPEN_FD_SOFT_LIMIT))
                {
                    put(ReportField.OPEN_FD_SOFT_LIMIT, ((com.facebook.acra.util.ProcFileReader.OpenFDLimits) (throwable)).softLimit, crashreportdata, writer);
                }
                if (areportfield.contains(ReportField.OPEN_FD_HARD_LIMIT))
                {
                    put(ReportField.OPEN_FD_HARD_LIMIT, ((com.facebook.acra.util.ProcFileReader.OpenFDLimits) (throwable)).hardLimit, crashreportdata, writer);
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 23 && areportfield.contains(ReportField.RUNTIME_PERMISSIONS))
        {
            throwable = PermissionsReporter.getAppGrantedPermissions(mContext);
            put(ReportField.RUNTIME_PERMISSIONS, throwable, crashreportdata, writer);
        }
        if (android.os.Build.VERSION.SDK_INT >= 16 && mIsInternalBuild)
        {
            if (areportfield.contains(ReportField.LOGCAT))
            {
                put(ReportField.LOGCAT, LogCatCollector.collectLogCat(null), crashreportdata, writer);
            }
            if (areportfield.contains(ReportField.EVENTSLOG))
            {
                put(ReportField.EVENTSLOG, LogCatCollector.collectLogCat("events"), crashreportdata, writer);
            }
            if (areportfield.contains(ReportField.RADIOLOG))
            {
                put(ReportField.RADIOLOG, LogCatCollector.collectLogCat("radio"), crashreportdata, writer);
            }
            if (areportfield.contains(ReportField.DROPBOX))
            {
                throwable = DropBoxCollector.read(mContext, ACRA.getConfig().additionalDropBoxTags());
                put(ReportField.DROPBOX, throwable, crashreportdata, writer);
            }
        }
        if (areportfield.contains(ReportField.LARGE_MEM_HEAP) && android.os.Build.VERSION.SDK_INT >= 11)
        {
            put(ReportField.LARGE_MEM_HEAP, DumpSysCollector.collectLargerMemoryInfo(context), crashreportdata, writer);
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
        Log.w(ACRA.LOG_TAG, (new StringBuilder("ReportSender of class ")).append(reportsender.getClass().getName()).append(" failed but other senders completed their task. ACRA will not send this report again.").toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean shouldContinueProcessingException(Throwable throwable)
    {
label0:
        {
            synchronized (mShouldContinueProcessingExceptionLock)
            {
                if (!mCurrentlyProcessingOOM)
                {
                    break label0;
                }
            }
            return false;
        }
        if (throwable instanceof OutOfMemoryError)
        {
            mCurrentlyProcessingOOM = true;
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    private String throwableToString(Throwable throwable)
    {
        Object obj = throwable;
        if (throwable == null)
        {
            obj = new Exception("Report requested by developer");
        }
        throwable = new StringWriter();
        PrintWriter printwriter = new PrintWriter(throwable);
        ((Throwable) (obj)).printStackTrace(printwriter);
        printwriter.close();
        return throwable.toString();
    }

    private static String toString(Display display)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("width=").append(display.getWidth()).append('\n').append("height=").append(display.getHeight()).append('\n').append("pixelFormat=").append(display.getPixelFormat()).append('\n').append("refreshRate=").append(display.getRefreshRate()).append("fps\n").append("metrics.density=x").append(displaymetrics.density).append('\n').append("metrics.scaledDensity=x").append(displaymetrics.scaledDensity).append('\n').append("metrics.widthPixels=").append(displaymetrics.widthPixels).append('\n').append("metrics.heightPixels=").append(displaymetrics.heightPixels).append('\n').append("metrics.xdpi=").append(displaymetrics.xdpi).append('\n').append("metrics.ydpi=").append(displaymetrics.ydpi);
        return stringbuilder.toString();
    }

    private void writeToLogBridge(String s, String s1, Throwable throwable, String s2)
    {
        LogBridge logbridge = getLogBridge();
        if (logbridge != null)
        {
            if (s2 != null)
            {
                logbridge.log(s, (new StringBuilder()).append(s1).append("\n").append(s2).toString(), null);
                return;
            } else
            {
                logbridge.log(s, s1, throwable);
                return;
            }
        }
        if (s2 != null)
        {
            Log.e(s, (new StringBuilder()).append(s1).append("\n").append(s2).toString());
            return;
        } else
        {
            Log.e(s, s1, throwable);
            return;
        }
    }

    public void addReportSender(ReportSender reportsender)
    {
        mReportSenders.add(reportsender);
    }

    public transient boolean anyReportsOfType(CrashReportType acrashreporttype[])
    {
        if (mContext == null)
        {
            Log.e(ACRA.LOG_TAG, "Trying to get ACRA reports but ACRA is not initialized.");
        } else
        {
            int j = acrashreporttype.length;
            int i = 0;
            while (i < j) 
            {
                CrashReportType crashreporttype = acrashreporttype[i];
                File file = mContext.getDir(crashreporttype.directory, 0);
                if (file != null && anyFilesPresentOfType(file, crashreporttype.fileExtensions))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    void backfillCrashReportData(CrashReportData crashreportdata)
    {
        Object obj;
        boolean flag;
        if (!parseVersionCodeFromFileName(crashreportdata.getProperty(ReportField.ACRA_REPORT_FILENAME)).equals(mAppVersionCode))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = (String)crashreportdata.get(ReportField.REPORT_ID);
        if (obj == null || ((String) (obj)).length() == 0)
        {
            obj = mConstantFields.entrySet().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                if (((ReportField)entry.getKey()).equals(ReportField.APP_VERSION_NAME))
                {
                    if (!flag)
                    {
                        crashreportdata.put((Enum)entry.getKey(), entry.getValue());
                    }
                } else
                if (crashreportdata.get(entry.getKey()) == null)
                {
                    crashreportdata.put((Enum)entry.getKey(), entry.getValue());
                }
            } while (true);
        }
        obj = getUserId();
        String s = (String)crashreportdata.get(ReportField.UID);
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && TextUtils.isEmpty(s))
        {
            crashreportdata.put(ReportField.UID, obj);
        }
    }

    transient void checkAndSendReports(Context context, CrashReportType acrashreporttype[])
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        String s = ACRA.LOG_TAG;
        j = acrashreporttype.length;
        int i = 0;
_L2:
        CrashReportType crashreporttype;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        crashreporttype = acrashreporttype[i];
        if (CrashReportType.ACRA_CRASH_REPORT == crashreporttype)
        {
            checkAndSendAcraReports(context);
            break MISSING_BLOCK_LABEL_62;
        }
        checkAndSendCrashAttachments(context, crashreporttype);
        break MISSING_BLOCK_LABEL_62;
        context;
        throw context;
        context = ACRA.LOG_TAG;
        this;
        JVM INSTR monitorexit ;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public transient ReportsSenderWorker checkReportsOfType(CrashReportType acrashreporttype[])
    {
        acrashreporttype = new ReportsSenderWorker(acrashreporttype);
        acrashreporttype.start();
        return acrashreporttype;
    }

    public ReportsSenderWorker checkReportsOnApplicationStart()
    {
        boolean flag = false;
        mHasNativeCrashDumpOnInit = anyReportsOfType(new CrashReportType[] {
            CrashReportType.NATIVE_CRASH_REPORT
        });
        if (mHasNativeCrashDumpOnInit || anyReportsOfType(new CrashReportType[] {
    CrashReportType.ACRA_CRASH_REPORT, CrashReportType.ANR_REPORT
}))
        {
            flag = true;
        }
        if (flag)
        {
            return checkReportsOfType(ALL_REPORT_TYPES);
        } else
        {
            return null;
        }
    }

    public String dumpCustomDataToString(Map map, Throwable throwable)
    {
        StringBuilder stringbuilder = new StringBuilder();
        dumpCustomDataMap(stringbuilder, mInstanceCustomParameters);
        if (map != null)
        {
            dumpCustomDataMap(stringbuilder, map);
        }
        dumpLazyCustomDataMap(stringbuilder, mInstanceLazyCustomParameters, throwable);
        return stringbuilder.toString();
    }

    public transient File[] getCrashReportFilesList(String s, final String extensions[])
    {
        if (mContext == null)
        {
            Log.e(ACRA.LOG_TAG, "Trying to get ACRA reports but ACRA is not initialized.");
            return new File[0];
        }
        s = mContext.getDir(s, 0);
        if (s == null)
        {
            Log.w(ACRA.LOG_TAG, "Application files directory does not exist! The application may not be installed correctly. Please try reinstalling.");
            return new File[0];
        }
        String s1 = ACRA.LOG_TAG;
        (new StringBuilder("Looking for error files in ")).append(s.getAbsolutePath());
        s = s.listFiles(new _cls1());
        if (s == null)
        {
            return new File[0];
        } else
        {
            Arrays.sort(s, new _cls2());
            return s;
        }
    }

    public String getCustomData(String s)
    {
        return (String)mInstanceCustomParameters.get(s);
    }

    public DexVerifyBridge getDexVerifyBridge()
    {
        return mDexVerifyBridge;
    }

    public LogBridge getLogBridge()
    {
        return mLogBridge;
    }

    Throwable getMostSignificantCause(Throwable throwable)
    {
        Throwable throwable1 = throwable;
        if (!(throwable instanceof NonCrashException)) goto _L2; else goto _L1
_L1:
        return throwable;
_L2:
        do
        {
            throwable = throwable1;
            if (throwable1.getCause() == null)
            {
                continue;
            }
            throwable1 = throwable1.getCause();
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public String getUserId()
    {
        return mUserId;
    }

    public ReportsSenderWorker handleException(Throwable throwable)
    {
        return handleException(throwable, null);
    }

    public ReportsSenderWorker handleException(Throwable throwable, String s, Map map)
    {
        return handleExceptionInternal(throwable, map, s, getReportFieldsForException(throwable), true);
    }

    public ReportsSenderWorker handleException(Throwable throwable, Map map)
    {
        boolean flag;
        if (!(throwable instanceof OutOfMemoryError))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return handleExceptionInternal(throwable, map, null, getReportFieldsForException(throwable), flag);
    }

    public void handleExceptionDelayed(Throwable throwable, Map map)
    {
        handleExceptionInternal(throwable, map, null, getReportFieldsForException(throwable), false);
    }

    public void handleExceptionWithCustomFields(Exception exception, Map map, ReportField areportfield[])
    {
        handleExceptionInternal(exception, map, null, areportfield, true);
    }

    public void init(Context context, boolean flag)
    {
        if (mDfltExceptionHandler != null)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        mDfltExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        mIsInternalBuild = flag;
        mContext = context;
        PackageInfo packageinfo = (new PackageManagerWrapper(context)).getPackageInfo();
        if (packageinfo != null)
        {
            mAppVersionCode = Integer.toString(packageinfo.versionCode);
            String s;
            File file;
            if (packageinfo.versionName != null)
            {
                s = packageinfo.versionName;
            } else
            {
                s = "not set";
            }
            mAppVersionName = s;
        }
        mPackageManager = new PackageManagerWrapper(context);
        mAppStartDate.setToNow();
        mConstantFields.put(ReportField.ANDROID_ID, android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id"));
        mConstantFields.put(ReportField.APP_VERSION_CODE, mAppVersionCode);
        mConstantFields.put(ReportField.APP_VERSION_NAME, mAppVersionName);
        mConstantFields.put(ReportField.PACKAGE_NAME, context.getPackageName());
        mConstantFields.put(ReportField.PHONE_MODEL, Build.MODEL);
        mConstantFields.put(ReportField.DEVICE, Build.DEVICE);
        mConstantFields.put(ReportField.ANDROID_VERSION, android.os.Build.VERSION.RELEASE);
        mConstantFields.put(ReportField.OS_VERSION, System.getProperty("os.version"));
        mConstantFields.put(ReportField.BUILD_HOST, Build.HOST);
        mConstantFields.put(ReportField.BRAND, Build.BRAND);
        mConstantFields.put(ReportField.PRODUCT, Build.PRODUCT);
        s = "n/a";
        file = context.getFilesDir();
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        s = file.getAbsolutePath();
        mConstantFields.put(ReportField.FILE_PATH, s);
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        mConstantFields.put(ReportField.SERIAL, Build.SERIAL);
        if (packageinfo != null)
        {
            try
            {
                mConstantFields.put(ReportField.APP_INSTALL_TIME, formatTimestamp(packageinfo.firstInstallTime));
                mConstantFields.put(ReportField.APP_UPGRADE_TIME, formatTimestamp(packageinfo.lastUpdateTime));
            }
            catch (Exception exception)
            {
                Log.e(ACRA.LOG_TAG, "failed to install constants", exception);
            }
        }
        preallocFile = fileForName(context, "acra-reports", "reportfile.prealloc");
        createPreallocatedReportFile();
    }

    public boolean isNativeCrashedOnPreviousRun()
    {
        return mHasNativeCrashDumpOnInit;
    }

    public String parseVersionCodeFromFileName(String s)
    {
        if (s != null)
        {
            s = VERSION_CODE_REGEX.matcher(s);
            if (s.matches())
            {
                return s.group(1);
            }
        }
        return "";
    }

    public String putCustomData(String s, String s1)
    {
        if (s == null)
        {
            return null;
        }
        if (s1 != null)
        {
            return (String)mInstanceCustomParameters.put(s, s1);
        } else
        {
            return removeCustomData(s);
        }
    }

    public void putLazyCustomData(String s, CustomReportDataSupplier customreportdatasupplier)
    {
        mInstanceLazyCustomParameters.put(s, customreportdatasupplier);
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
        if (s == null)
        {
            return null;
        } else
        {
            return (String)mInstanceCustomParameters.remove(s);
        }
    }

    public CustomReportDataSupplier removeLazyCustomData(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (CustomReportDataSupplier)mInstanceLazyCustomParameters.remove(s);
        }
    }

    void sendInMemoryReport(Context context, CrashReportData crashreportdata)
    {
        this;
        JVM INSTR monitorenter ;
        String s = ACRA.LOG_TAG;
        String s1 = getProcessNameFromAms();
        crashreportdata.put(ReportField.UPLOADED_BY_PROCESS, s1);
        sendCrashReport(crashreportdata);
        crashreportdata = (String)crashreportdata.get(ReportField.ACRA_REPORT_FILENAME);
        if (crashreportdata == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        deleteFile(fileForName(context, "acra-reports", crashreportdata));
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

    public void setDexVerifyBridge(DexVerifyBridge dexverifybridge)
    {
        mDexVerifyBridge = dexverifybridge;
    }

    public void setLogBridge(LogBridge logbridge)
    {
        mLogBridge = logbridge;
    }

    public void setMaxReportSize(long l)
    {
        mMaxReportSize = l;
    }

    public void setReportProxy(Proxy proxy)
    {
        Iterator iterator = mReportSenders.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ReportSender reportsender = (ReportSender)iterator.next();
            if (reportsender instanceof FlexibleReportSender)
            {
                ((FlexibleReportSender)reportsender).setProxy(proxy);
            }
        } while (true);
    }

    public void setReportSender(ReportSender reportsender)
    {
        removeAllReportSenders();
        addReportSender(reportsender);
    }

    public void setUserId(String s)
    {
        mUserId = s;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
label0:
        {
            Log.e(ACRA.LOG_TAG, (new StringBuilder("ACRA caught a ")).append(throwable.getClass().getSimpleName()).append(" exception for ").append(mContext.getPackageName()).append(". Building report.").toString());
            usePreallocatedFile = true;
            boolean flag = mProcessingCrash.getAndSet(true);
            HashMap hashmap;
            Object obj;
            Object obj1;
            InterruptedException interruptedexception;
            try
            {
                hashmap = new HashMap();
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror = null;
                if (false)
                {
                } else
                {
                    break label0;
                }
            }
            try
            {
                hashmap.put("IS_PROCESSING_ANOTHER_EXCEPTION", String.valueOf(flag));
            }
            catch (OutOfMemoryError outofmemoryerror1) { }
        }
        obj1 = getDexVerifyBridge();
        obj = throwable;
        if (obj1 != null)
        {
            obj1 = ((DexVerifyBridge) (obj1)).verifyDexes();
            obj = throwable;
            if (obj1 != null)
            {
                obj = obj1;
            }
        }
        throwable = handleException(((Throwable) (obj)), hashmap);
        if (throwable != null)
        {
            while (throwable.isAlive()) 
            {
                try
                {
                    Thread.sleep(100L);
                }
                // Misplaced declaration of an exception variable
                catch (InterruptedException interruptedexception)
                {
                    Log.e(ACRA.LOG_TAG, "Error : ", interruptedexception);
                }
            }
            throwable = throwable.getException();
            if (throwable != null)
            {
                Log.e(ACRA.LOG_TAG, "ReportsWorkerSender failed with exception", throwable);
                handleExceptionInternal(throwable, hashmap, null, getReportFieldsForException(((Throwable) (obj))), false);
            }
        }
        if (mDfltExceptionHandler != null)
        {
            mDfltExceptionHandler.uncaughtException(thread, ((Throwable) (obj)));
        }
    }

    public void writeReportToStream(Throwable throwable, OutputStream outputstream)
    {
        CrashReportData crashreportdata = new CrashReportData();
        outputstream = CrashReportData.getWriter(outputstream);
        gatherCrashData(throwableToString(throwable), throwable, ACRA.ALL_CRASH_REPORT_FIELDS, crashreportdata, outputstream, null);
    }

    static 
    {
        ALL_REPORT_TYPES = (new CrashReportType[] {
            CrashReportType.ACRA_CRASH_REPORT, CrashReportType.NATIVE_CRASH_REPORT, CrashReportType.ANR_REPORT
        });
        DEFAULT_TRACE_COUNT_LIMIT = 5;
        MAX_TRACE_COUNT_LIMIT = 20;
    }


    private class CrashReportType extends Enum
    {

        private static final CrashReportType $VALUES[];
        public static final CrashReportType ACRA_CRASH_REPORT;
        public static final CrashReportType ANR_REPORT;
        public static final CrashReportType NATIVE_CRASH_REPORT;
        private final ReportField attachmentField;
        private final long defaultMaxSize;
        private final String directory;
        private final String fileExtensions[];

        public static CrashReportType valueOf(String s)
        {
            return (CrashReportType)Enum.valueOf(com/facebook/acra/ErrorReporter$CrashReportType, s);
        }

        public static CrashReportType[] values()
        {
            return (CrashReportType[])$VALUES.clone();
        }

        static 
        {
            ACRA_CRASH_REPORT = new CrashReportType("ACRA_CRASH_REPORT", 0, "acra-reports", 0x100000L, null, new String[] {
                ".stacktrace", ".temp_stacktrace"
            });
            NATIVE_CRASH_REPORT = new CrashReportType("NATIVE_CRASH_REPORT", 1, "minidumps", 0x800000L, ReportField.MINIDUMP, new String[] {
                ".dmp"
            });
            ANR_REPORT = new CrashReportType("ANR_REPORT", 2, "traces", 0x80000L, ReportField.SIGQUIT, new String[] {
                ".stacktrace", ".temp_stacktrace"
            });
            $VALUES = (new CrashReportType[] {
                ACRA_CRASH_REPORT, NATIVE_CRASH_REPORT, ANR_REPORT
            });
        }





        private transient CrashReportType(String s, int i, String s1, long l, ReportField reportfield, String as[])
        {
            super(s, i);
            directory = s1;
            defaultMaxSize = l;
            attachmentField = reportfield;
            fileExtensions = as;
        }
    }


    private class CrashAttachmentException extends Throwable
    {

        final ErrorReporter this$0;

        private CrashAttachmentException()
        {
            this$0 = ErrorReporter.this;
            super();
        }

        CrashAttachmentException(_cls1 _pcls1)
        {
            this();
        }
    }


    private class ReportsSenderWorker extends Thread
    {

        private Throwable exception;
        private CrashReportData mInMemoryReportToSend;
        private final CrashReportType mReportTypesToSend[];
        final ErrorReporter this$0;

        private android.os.PowerManager.WakeLock acquireWakeLock()
        {
            if (!(new PackageManagerWrapper(mContext)).hasPermission("android.permission.WAKE_LOCK"))
            {
                return null;
            } else
            {
                android.os.PowerManager.WakeLock wakelock = ((PowerManager)mContext.getSystemService("power")).newWakeLock(1, "ACRA wakelock");
                wakelock.setReferenceCounted(false);
                wakelock.acquire();
                return wakelock;
            }
        }

        public final Throwable getException()
        {
            return exception;
        }

        public final void run()
        {
            android.os.PowerManager.WakeLock wakelock;
            android.os.PowerManager.WakeLock wakelock1;
            wakelock1 = null;
            wakelock = null;
            android.os.PowerManager.WakeLock wakelock2 = acquireWakeLock();
            wakelock = wakelock2;
            wakelock1 = wakelock2;
            if (mInMemoryReportToSend == null) goto _L2; else goto _L1
_L1:
            wakelock = wakelock2;
            wakelock1 = wakelock2;
            sendInMemoryReport(mContext, mInMemoryReportToSend);
_L6:
            if (wakelock2 != null && wakelock2.isHeld())
            {
                wakelock2.release();
            }
_L4:
            return;
_L2:
            wakelock = wakelock2;
            wakelock1 = wakelock2;
            checkAndSendReports(mContext, mReportTypesToSend);
            continue; /* Loop/switch isn't completed */
            Throwable throwable;
            throwable;
            wakelock1 = wakelock;
            exception = throwable;
            if (wakelock == null || !wakelock.isHeld()) goto _L4; else goto _L3
_L3:
            wakelock.release();
            return;
            Exception exception1;
            exception1;
            if (wakelock1 != null && wakelock1.isHeld())
            {
                wakelock1.release();
            }
            throw exception1;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public ReportsSenderWorker(CrashReportData crashreportdata)
        {
            this(new CrashReportType[0]);
            mInMemoryReportToSend = crashreportdata;
        }

        public transient ReportsSenderWorker(CrashReportType acrashreporttype[])
        {
            this$0 = ErrorReporter.this;
            super();
            exception = null;
            mReportTypesToSend = acrashreporttype;
        }
    }


    private class _cls1
        implements FilenameFilter
    {

        final ErrorReporter this$0;
        final String val$extensions[];

        public boolean accept(File file, String s)
        {
            boolean flag1 = false;
            file = extensions;
            int j = file.length;
            int i = 0;
            do
            {
label0:
                {
                    boolean flag = flag1;
                    if (i < j)
                    {
                        if (!s.endsWith(file[i]))
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    return flag;
                }
                i++;
            } while (true);
        }

        _cls1()
        {
            this$0 = ErrorReporter.this;
            extensions = as;
            super();
        }
    }


    private class _cls2
        implements Comparator
    {

        final ErrorReporter this$0;

        public int compare(File file, File file1)
        {
            long l = file.lastModified();
            long l1 = file1.lastModified();
            if (l == l1)
            {
                return 0;
            }
            return l >= l1 ? -1 : 1;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((File)obj, (File)obj1);
        }

        _cls2()
        {
            this$0 = ErrorReporter.this;
            super();
        }
    }

}
