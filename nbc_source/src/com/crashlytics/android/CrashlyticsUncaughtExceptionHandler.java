// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.QueueFile;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android:
//            ByteString, Crashlytics, ClsFileOutputStream, CLSUUID, 
//            CodedOutputStream, CrashlyticsListener, Utils, ReportUploader, 
//            SessionReport

class CrashlyticsUncaughtExceptionHandler
    implements Thread.UncaughtExceptionHandler
{
    private static class AnySessionPartFileFilter
        implements FilenameFilter
    {

        public boolean accept(File file, String s)
        {
            return !CrashlyticsUncaughtExceptionHandler.SESSION_FILE_FILTER.accept(file, s) && CrashlyticsUncaughtExceptionHandler.SESSION_FILE_PATTERN.matcher(s).matches();
        }

        private AnySessionPartFileFilter()
        {
        }

    }

    static class FileNameContainsFilter
        implements FilenameFilter
    {

        private final String string;

        public boolean accept(File file, String s)
        {
            return s.contains(string) && !s.endsWith(".cls_temp");
        }

        public FileNameContainsFilter(String s)
        {
            string = s;
        }
    }

    static class SessionPartFileFilter
        implements FilenameFilter
    {

        private final String sessionId;

        public boolean accept(File file, String s)
        {
            while (s.equals((new StringBuilder()).append(sessionId).append(".cls").toString()) || !s.contains(sessionId) || s.endsWith(".cls_temp")) 
            {
                return false;
            }
            return true;
        }

        public SessionPartFileFilter(String s)
        {
            sessionId = s;
        }
    }


    private static final int ANALYZER_VERSION = 1;
    static final FilenameFilter ANY_SESSION_FILENAME_FILTER = new FilenameFilter() {

        public boolean accept(File file, String s)
        {
            return CrashlyticsUncaughtExceptionHandler.SESSION_FILE_PATTERN.matcher(s).matches();
        }

    };
    static final String CLS_CRASH_MARKER_FILE_NAME = "crash_marker";
    private static final String EVENT_TYPE_CRASH = "crash";
    private static final String EVENT_TYPE_LOGGED = "error";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final String INVALID_CLS_CACHE_DIR = "invalidClsFiles";
    static final Comparator LARGEST_FILE_NAME_FIRST = new Comparator() {

        public int compare(File file, File file1)
        {
            return file1.getName().compareTo(file.getName());
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((File)obj, (File)obj1);
        }

    };
    private static final int MAX_COMPLETE_SESSIONS_COUNT = 4;
    private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
    static final int MAX_LOG_SIZE = 0x10000;
    static final int MAX_OPEN_SESSIONS = 8;
    private static final Map SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    static final String SESSION_APP_TAG = "SessionApp";
    static final String SESSION_BEGIN_TAG = "BeginSession";
    static final String SESSION_DEVICE_TAG = "SessionDevice";
    static final String SESSION_FATAL_TAG = "SessionCrash";
    static final FilenameFilter SESSION_FILE_FILTER = new FilenameFilter() {

        public boolean accept(File file, String s)
        {
            return s.length() == ".cls".length() + 35 && s.endsWith(".cls");
        }

    };
    private static final Pattern SESSION_FILE_PATTERN = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final int SESSION_ID_LENGTH = 35;
    static final String SESSION_NON_FATAL_TAG = "SessionEvent";
    static final String SESSION_OS_TAG = "SessionOS";
    static final String SESSION_USER_TAG = "SessionUser";
    private static final String SIGNAL_DEFAULT = "0";
    private static final ByteString SIGNAL_DEFAULT_BYTE_STRING = ByteString.copyFromUtf8("0");
    static final Comparator SMALLEST_FILE_NAME_FIRST = new Comparator() {

        public int compare(File file, File file1)
        {
            return file.getName().compareTo(file1.getName());
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((File)obj, (File)obj1);
        }

    };
    private final Crashlytics crashlytics;
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private StackTraceElement exceptionStack[];
    private final ExecutorService executorService;
    private final File filesDir;
    private final String generator;
    private final IdManager idManager;
    private final File initializationMarkerFile;
    private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
    private QueueFile logFile;
    private final int maxChainedExceptionsDepth = 8;
    private final ByteString optionalBuildIdBytes;
    private final ByteString packageName;
    private boolean powerConnected;
    private final BroadcastReceiver powerConnectedReceiver = new BroadcastReceiver() {

        final CrashlyticsUncaughtExceptionHandler this$0;

        public void onReceive(Context context, Intent intent)
        {
            powerConnected = true;
        }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
    };
    private final BroadcastReceiver powerDisconnectedReceiver = new BroadcastReceiver() {

        final CrashlyticsUncaughtExceptionHandler this$0;

        public void onReceive(Context context, Intent intent)
        {
            powerConnected = false;
        }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
    };
    private final AtomicBoolean receiversRegistered = new AtomicBoolean(false);
    private android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
    private List stacks;
    private Thread threads[];

    CrashlyticsUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashlyticsListener crashlyticslistener, ExecutorService executorservice, String s, IdManager idmanager, Crashlytics crashlytics1)
    {
        defaultHandler = uncaughtexceptionhandler;
        executorService = executorservice;
        idManager = idmanager;
        crashlytics = crashlytics1;
        filesDir = crashlytics1.getSdkDirectory();
        initializationMarkerFile = new File(filesDir, "initialization_marker");
        generator = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
            crashlytics1.getVersion()
        });
        notifyCrashlyticsListenerOfPreviousCrash(crashlyticslistener);
        packageName = ByteString.copyFromUtf8(crashlytics1.getPackageName());
        if (s == null)
        {
            uncaughtexceptionhandler = null;
        } else
        {
            uncaughtexceptionhandler = ByteString.copyFromUtf8(s.replace("-", ""));
        }
        optionalBuildIdBytes = uncaughtexceptionhandler;
        uncaughtexceptionhandler = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        crashlyticslistener = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        executorservice = crashlytics1.getContext();
        executorservice.registerReceiver(powerConnectedReceiver, uncaughtexceptionhandler);
        executorservice.registerReceiver(powerDisconnectedReceiver, crashlyticslistener);
        receiversRegistered.set(true);
    }

    private void closeWithoutRenamingOrLog(ClsFileOutputStream clsfileoutputstream)
    {
        if (clsfileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        clsfileoutputstream.closeInProgressStream();
        return;
        clsfileoutputstream;
        Fabric.getLogger().e("Fabric", "Error closing session file stream in the presence of an exception", clsfileoutputstream);
        return;
    }

    private void deleteLegacyInvalidCacheDir()
    {
        File file = new File(crashlytics.getSdkDirectory(), "invalidClsFiles");
        if (file.exists())
        {
            if (file.isDirectory())
            {
                File afile[] = file.listFiles();
                int j = afile.length;
                for (int i = 0; i < j; i++)
                {
                    afile[i].delete();
                }

            }
            file.delete();
        }
    }

    private void deleteSessionPartFilesFor(String s)
    {
        s = listSessionPartFilesFor(s);
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            s[i].delete();
        }

    }

    private void doCloseSessions()
        throws Exception
    {
        trimOpenSessions(8);
        Object obj = getCurrentSessionId();
        if (obj != null)
        {
            writeSessionUser(((String) (obj)));
            obj = crashlytics.getSessionSettingsData();
            if (obj != null)
            {
                int j = ((SessionSettingsData) (obj)).maxCustomExceptionEvents;
                Fabric.getLogger().d("Fabric", "Closing all open sessions.");
                File afile[] = listSessionBeginFiles();
                if (afile != null && afile.length > 0)
                {
                    int k = afile.length;
                    for (int i = 0; i < k; i++)
                    {
                        File file = afile[i];
                        String s = getSessionIdFromSessionFile(file);
                        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Closing session: ").append(s).toString());
                        writeSessionPartsToSessionFile(file, s, j);
                    }

                }
            } else
            {
                Fabric.getLogger().d("Fabric", "Unable to close session. Settings are not loaded.");
            }
            return;
        } else
        {
            Fabric.getLogger().d("Fabric", "No open sessions exist.");
            return;
        }
    }

    private void doOpenSession()
        throws Exception
    {
        Date date = new Date();
        String s = (new CLSUUID(idManager)).toString();
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Opening an new session with ID ").append(s).toString());
        writeBeginSession(date, s);
        writeSessionApp(s);
        writeSessionOS(s);
        writeSessionDevice(s);
    }

    private void doWriteNonFatal(Date date, Thread thread, Throwable throwable)
    {
        String s = getCurrentSessionId();
        if (s == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        ClsFileOutputStream clsfileoutputstream;
        CodedOutputStream codedoutputstream;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Crashlytics.recordLoggedExceptionEvent(s);
        clsfileoutputstream = null;
        obj2 = null;
        obj5 = null;
        obj4 = null;
        obj3 = null;
        codedoutputstream = null;
        obj = obj5;
        obj1 = clsfileoutputstream;
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Crashlytics is logging non-fatal exception \"").append(throwable).append("\" from thread ").append(thread.getName()).toString());
        obj = obj5;
        obj1 = clsfileoutputstream;
        String s1 = CommonUtils.padWithZerosToMaxIntWidth(eventCounter.getAndIncrement());
        obj = obj5;
        obj1 = clsfileoutputstream;
        s1 = (new StringBuilder()).append(s).append("SessionEvent").append(s1).toString();
        obj = obj5;
        obj1 = clsfileoutputstream;
        clsfileoutputstream = new ClsFileOutputStream(filesDir, s1);
        obj = obj4;
        obj1 = obj3;
        codedoutputstream = CodedOutputStream.newInstance(clsfileoutputstream);
        obj = codedoutputstream;
        obj1 = codedoutputstream;
        writeSessionEvent(date, codedoutputstream, thread, throwable, "error", false);
        CommonUtils.flushOrLog(codedoutputstream, "Failed to flush to non-fatal file.");
        CommonUtils.closeOrLog(clsfileoutputstream, "Failed to close non-fatal file output stream.");
        break MISSING_BLOCK_LABEL_215;
        throwable;
        thread = obj2;
        date = codedoutputstream;
_L6:
        obj = date;
        obj1 = thread;
        Fabric.getLogger().e("Fabric", "An error occurred in the non-fatal exception logger", throwable);
        obj = date;
        obj1 = thread;
        writeStackTraceIfNotNull(throwable, thread);
        CommonUtils.flushOrLog(date, "Failed to flush to non-fatal file.");
        CommonUtils.closeOrLog(thread, "Failed to close non-fatal file output stream.");
          goto _L3
        date;
_L5:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to non-fatal file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close non-fatal file output stream.");
        throw date;
_L3:
        try
        {
            trimSessionEventFiles(s, 64);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            Fabric.getLogger().e("Fabric", "An error occurred when trimming non-fatal files.", date);
        }
        return;
_L2:
        Fabric.getLogger().e("Fabric", "Tried to write a non-fatal exception while no session was open.", null);
        return;
        date;
        obj1 = clsfileoutputstream;
        if (true) goto _L5; else goto _L4
_L4:
        throwable;
        thread = clsfileoutputstream;
        date = ((Date) (obj1));
          goto _L6
    }

    private File[] ensureFileArrayNotNull(File afile[])
    {
        File afile1[] = afile;
        if (afile == null)
        {
            afile1 = new File[0];
        }
        return afile1;
    }

    private Future executeAsync(final Runnable runnable)
    {
        try
        {
            runnable = executorService.submit(new Runnable() {

                final CrashlyticsUncaughtExceptionHandler this$0;
                final Runnable val$runnable;

                public void run()
                {
                    try
                    {
                        runnable.run();
                        return;
                    }
                    catch (Exception exception)
                    {
                        Fabric.getLogger().e("Fabric", "Failed to execute task.", exception);
                    }
                }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                runnable = runnable1;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (final Runnable runnable)
        {
            Fabric.getLogger().d("Fabric", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return runnable;
    }

    private Future executeAsync(final Callable callable)
    {
        try
        {
            callable = executorService.submit(new Callable() {

                final CrashlyticsUncaughtExceptionHandler this$0;
                final Callable val$callable;

                public Object call()
                    throws Exception
                {
                    Object obj;
                    try
                    {
                        obj = callable.call();
                    }
                    catch (Exception exception)
                    {
                        Fabric.getLogger().e("Fabric", "Failed to execute task.", exception);
                        return null;
                    }
                    return obj;
                }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                callable = callable1;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (final Callable callable)
        {
            Fabric.getLogger().d("Fabric", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return callable;
    }

    private Object executeSyncLoggingException(Callable callable)
    {
        try
        {
            if (Looper.getMainLooper() == Looper.myLooper())
            {
                return executorService.submit(callable).get(4L, TimeUnit.SECONDS);
            }
            callable = ((Callable) (executorService.submit(callable).get()));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            Fabric.getLogger().d("Fabric", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            Fabric.getLogger().e("Fabric", "Failed to execute task.", callable);
            return null;
        }
        return callable;
    }

    private int getBinaryImageSize()
    {
        int j = 0 + CodedOutputStream.computeUInt64Size(1, 0L) + CodedOutputStream.computeUInt64Size(2, 0L) + CodedOutputStream.computeBytesSize(3, packageName);
        int i = j;
        if (optionalBuildIdBytes != null)
        {
            i = j + CodedOutputStream.computeBytesSize(4, optionalBuildIdBytes);
        }
        return i;
    }

    private String getCurrentSessionId()
    {
        File afile[] = listFilesMatching(new FileNameContainsFilter("BeginSession"));
        Arrays.sort(afile, LARGEST_FILE_NAME_FIRST);
        if (afile.length > 0)
        {
            return getSessionIdFromSessionFile(afile[0]);
        } else
        {
            return null;
        }
    }

    private int getDeviceIdentifierSize(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType deviceidentifiertype, String s)
    {
        return CodedOutputStream.computeEnumSize(1, deviceidentifiertype.protobufIndex) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
    }

    private int getEventAppCustomAttributeSize(String s, String s1)
    {
        int i = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(s));
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
    }

    private int getEventAppExecutionExceptionSize(Throwable throwable, int i)
    {
        int j;
label0:
        {
            int k = 0 + CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(throwable.getClass().getName()));
            String s = throwable.getLocalizedMessage();
            j = k;
            if (s != null)
            {
                j = k + CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(s));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int l = astacktraceelement.length;
            for (k = 0; k < l; k++)
            {
                int i1 = getFrameSize(astacktraceelement[k], true);
                j += CodedOutputStream.computeTagSize(4) + CodedOutputStream.computeRawVarint32Size(i1) + i1;
            }

            throwable = throwable.getCause();
            k = j;
            if (throwable != null)
            {
                if (i >= maxChainedExceptionsDepth)
                {
                    break label0;
                }
                i = getEventAppExecutionExceptionSize(throwable, i + 1);
                k = j + (CodedOutputStream.computeTagSize(6) + CodedOutputStream.computeRawVarint32Size(i) + i);
            }
            return k;
        }
        for (i = 0; throwable != null; i++)
        {
            throwable = throwable.getCause();
        }

        return j + CodedOutputStream.computeUInt32Size(7, i);
    }

    private int getEventAppExecutionSignalSize()
    {
        return 0 + CodedOutputStream.computeBytesSize(1, SIGNAL_DEFAULT_BYTE_STRING) + CodedOutputStream.computeBytesSize(2, SIGNAL_DEFAULT_BYTE_STRING) + CodedOutputStream.computeUInt64Size(3, 0L);
    }

    private int getEventAppExecutionSize(Thread thread, Throwable throwable)
    {
        int i = getThreadSize(thread, exceptionStack, 4, true);
        i = 0 + (CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(i) + i);
        int l = threads.length;
        for (int j = 0; j < l; j++)
        {
            int i1 = getThreadSize(threads[j], (StackTraceElement[])stacks.get(j), 0, false);
            i += CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(i1) + i1;
        }

        int k = getEventAppExecutionExceptionSize(throwable, 1);
        l = CodedOutputStream.computeTagSize(2);
        int j1 = CodedOutputStream.computeRawVarint32Size(k);
        int k1 = getEventAppExecutionSignalSize();
        int l1 = CodedOutputStream.computeTagSize(3);
        int i2 = CodedOutputStream.computeRawVarint32Size(k1);
        int j2 = getBinaryImageSize();
        return i + (l + j1 + k) + (l1 + i2 + k1) + (CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(j2) + j2);
    }

    private int getEventAppSize(Thread thread, Throwable throwable, Map map)
    {
        int i = getEventAppExecutionSize(thread, throwable);
        int j = 0 + (CodedOutputStream.computeTagSize(1) + CodedOutputStream.computeRawVarint32Size(i) + i);
        i = j;
        if (map != null)
        {
            thread = map.entrySet().iterator();
            do
            {
                i = j;
                if (!thread.hasNext())
                {
                    break;
                }
                throwable = (java.util.Map.Entry)thread.next();
                i = getEventAppCustomAttributeSize((String)throwable.getKey(), (String)throwable.getValue());
                j += CodedOutputStream.computeTagSize(2) + CodedOutputStream.computeRawVarint32Size(i) + i;
            } while (true);
        }
        j = i;
        if (runningAppProcessInfo != null)
        {
            boolean flag;
            if (runningAppProcessInfo.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = i + CodedOutputStream.computeBoolSize(3, flag);
        }
        return j + CodedOutputStream.computeUInt32Size(4, crashlytics.getContext().getResources().getConfiguration().orientation);
    }

    private int getEventDeviceSize(float f, int i, boolean flag, int j, long l, long l1)
    {
        return 0 + CodedOutputStream.computeFloatSize(1, f) + CodedOutputStream.computeSInt32Size(2, i) + CodedOutputStream.computeBoolSize(3, flag) + CodedOutputStream.computeUInt32Size(4, j) + CodedOutputStream.computeUInt64Size(5, l) + CodedOutputStream.computeUInt64Size(6, l1);
    }

    private int getEventLogSize(ByteString bytestring)
    {
        return CodedOutputStream.computeBytesSize(1, bytestring);
    }

    private int getFrameSize(StackTraceElement stacktraceelement, boolean flag)
    {
        byte byte0 = 2;
        int i;
        int j;
        if (stacktraceelement.isNativeMethod())
        {
            i = 0 + CodedOutputStream.computeUInt64Size(1, Math.max(stacktraceelement.getLineNumber(), 0));
        } else
        {
            i = 0 + CodedOutputStream.computeUInt64Size(1, 0L);
        }
        j = i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        i = j;
        if (stacktraceelement.getFileName() != null)
        {
            i = j + CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(stacktraceelement.getFileName()));
        }
        j = i;
        if (!stacktraceelement.isNativeMethod())
        {
            j = i;
            if (stacktraceelement.getLineNumber() > 0)
            {
                j = i + CodedOutputStream.computeUInt64Size(4, stacktraceelement.getLineNumber());
            }
        }
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        return j + CodedOutputStream.computeUInt32Size(5, i);
    }

    private static String getMessage(Throwable throwable)
    {
        throwable = throwable.getLocalizedMessage();
        if (throwable == null)
        {
            return null;
        } else
        {
            return throwable.replaceAll("(\r\n|\n|\f)", " ");
        }
    }

    private int getSessionAppOrgSize()
    {
        return 0 + CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(ApiKey.getApiKey(crashlytics.getContext(), Fabric.isDebuggable())));
    }

    private int getSessionAppSize(ByteString bytestring, ByteString bytestring1, ByteString bytestring2, ByteString bytestring3, int i)
    {
        int j = CodedOutputStream.computeBytesSize(1, bytestring);
        int k = CodedOutputStream.computeBytesSize(2, bytestring1);
        int l = CodedOutputStream.computeBytesSize(3, bytestring2);
        int i1 = getSessionAppOrgSize();
        return 0 + j + k + l + (CodedOutputStream.computeTagSize(5) + CodedOutputStream.computeRawVarint32Size(i1) + i1) + CodedOutputStream.computeBytesSize(6, bytestring3) + CodedOutputStream.computeEnumSize(10, i);
    }

    private int getSessionDeviceSize(int i, ByteString bytestring, ByteString bytestring1, int j, long l, long l1, boolean flag, Map map, int k, ByteString bytestring2, ByteString bytestring3)
    {
        int i1 = CodedOutputStream.computeBytesSize(1, bytestring);
        int j1 = CodedOutputStream.computeEnumSize(3, i);
        if (bytestring1 == null)
        {
            i = 0;
        } else
        {
            i = CodedOutputStream.computeBytesSize(4, bytestring1);
        }
        i = 0 + i1 + j1 + i + CodedOutputStream.computeUInt32Size(5, j) + CodedOutputStream.computeUInt64Size(6, l) + CodedOutputStream.computeUInt64Size(7, l1) + CodedOutputStream.computeBoolSize(10, flag);
        j = i;
        if (map != null)
        {
            bytestring = map.entrySet().iterator();
            do
            {
                j = i;
                if (!bytestring.hasNext())
                {
                    break;
                }
                bytestring1 = (java.util.Map.Entry)bytestring.next();
                j = getDeviceIdentifierSize((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)bytestring1.getKey(), (String)bytestring1.getValue());
                i += CodedOutputStream.computeTagSize(11) + CodedOutputStream.computeRawVarint32Size(j) + j;
            } while (true);
        }
        i1 = CodedOutputStream.computeUInt32Size(12, k);
        if (bytestring2 == null)
        {
            i = 0;
        } else
        {
            i = CodedOutputStream.computeBytesSize(13, bytestring2);
        }
        if (bytestring3 == null)
        {
            k = 0;
        } else
        {
            k = CodedOutputStream.computeBytesSize(14, bytestring3);
        }
        return j + i1 + i + k;
    }

    private int getSessionEventSize(Thread thread, Throwable throwable, String s, long l, Map map, float f, 
            int i, boolean flag, int j, long l1, long l2, 
            ByteString bytestring)
    {
        int k = CodedOutputStream.computeUInt64Size(1, l);
        int i1 = CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
        int j1 = getEventAppSize(thread, throwable, map);
        int k1 = CodedOutputStream.computeTagSize(3);
        int i2 = CodedOutputStream.computeRawVarint32Size(j1);
        i = getEventDeviceSize(f, i, flag, j, l1, l2);
        j = 0 + k + i1 + (k1 + i2 + j1) + (CodedOutputStream.computeTagSize(5) + CodedOutputStream.computeRawVarint32Size(i) + i);
        i = j;
        if (bytestring != null)
        {
            i = getEventLogSize(bytestring);
            i = j + (CodedOutputStream.computeTagSize(6) + CodedOutputStream.computeRawVarint32Size(i) + i);
        }
        return i;
    }

    private String getSessionIdFromSessionFile(File file)
    {
        return file.getName().substring(0, 35);
    }

    private int getSessionOSSize(ByteString bytestring, ByteString bytestring1, boolean flag)
    {
        return 0 + CodedOutputStream.computeEnumSize(1, 3) + CodedOutputStream.computeBytesSize(2, bytestring) + CodedOutputStream.computeBytesSize(3, bytestring1) + CodedOutputStream.computeBoolSize(4, flag);
    }

    private int getThreadSize(Thread thread, StackTraceElement astacktraceelement[], int i, boolean flag)
    {
        int j = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(thread.getName())) + CodedOutputStream.computeUInt32Size(2, i);
        int k = astacktraceelement.length;
        for (i = 0; i < k; i++)
        {
            int l = getFrameSize(astacktraceelement[i], flag);
            j += CodedOutputStream.computeTagSize(3) + CodedOutputStream.computeRawVarint32Size(l) + l;
        }

        return j;
    }

    private void handleUncaughtException(Date date, Thread thread, Throwable throwable)
        throws Exception
    {
        writeFatal(date, thread, throwable);
        doCloseSessions();
        doOpenSession();
        trimSessionFiles();
        if (!crashlytics.shouldPromptUserBeforeSendingCrashReports())
        {
            sendSessionReports();
        }
    }

    private boolean initLogFile()
    {
        Object obj1;
        if (!CommonUtils.getBooleanResourceValue(crashlytics.getContext(), "com.crashlytics.CollectCustomLogs", true))
        {
            Fabric.getLogger().d("Fabric", "Preferences requested no custom logs. Aborting log file creation.");
            return false;
        }
        CommonUtils.closeOrLog(logFile, (new StringBuilder()).append("Could not close log file: ").append(logFile).toString());
        obj1 = null;
        Object obj;
        obj = (new StringBuilder()).append("crashlytics-userlog-").append(UUID.randomUUID().toString()).append(".temp").toString();
        obj = new File(crashlytics.getSdkDirectory(), ((String) (obj)));
        logFile = new QueueFile(((File) (obj)));
        ((File) (obj)).delete();
        return true;
        obj;
_L2:
        Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Could not create log file: ").append(obj1).toString(), ((Throwable) (obj)));
        return false;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private File[] listCompleteSessionFiles()
    {
        return listFilesMatching(SESSION_FILE_FILTER);
    }

    private File[] listFilesMatching(FilenameFilter filenamefilter)
    {
        return ensureFileArrayNotNull(filesDir.listFiles(filenamefilter));
    }

    private File[] listSessionPartFilesFor(String s)
    {
        return listFilesMatching(new SessionPartFileFilter(s));
    }

    private void notifyCrashlyticsListenerOfPreviousCrash(CrashlyticsListener crashlyticslistener)
    {
        Fabric.getLogger().d("Fabric", "Checking for previous crash marker.");
        File file = new File(crashlytics.getSdkDirectory(), "crash_marker");
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_53;
        }
        file.delete();
        if (crashlyticslistener == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        crashlyticslistener.crashlyticsDidDetectCrashDuringPreviousExecution();
        return;
        crashlyticslistener;
        Fabric.getLogger().e("Fabric", "Exception thrown by CrashlyticsListener while notifying of previous crash.", crashlyticslistener);
        return;
    }

    private void sendSessionReports()
    {
        File afile[] = listCompleteSessionFiles();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            executeAsync(new Runnable() {

                final CrashlyticsUncaughtExceptionHandler this$0;
                final File val$toSend;

                public void run()
                {
                    if (CommonUtils.canTryConnection(crashlytics.getContext()))
                    {
                        Fabric.getLogger().d("Fabric", "Attempting to send crash report at time of crash...");
                        Object obj = Settings.getInstance().awaitSettingsData();
                        obj = crashlytics.getCreateReportSpiCall(((io.fabric.sdk.android.services.settings.SettingsData) (obj)));
                        if (obj != null)
                        {
                            (new ReportUploader(((CreateReportSpiCall) (obj)))).forceUpload(new SessionReport(toSend, CrashlyticsUncaughtExceptionHandler.SEND_AT_CRASHTIME_HEADER));
                        }
                    }
                }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                toSend = file;
                super();
            }
            });
        }

    }

    private ByteString stringToByteString(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return ByteString.copyFromUtf8(s);
        }
    }

    private void trimOpenSessions(int i)
    {
        HashSet hashset = new HashSet();
        File afile[] = listSessionBeginFiles();
        Arrays.sort(afile, LARGEST_FILE_NAME_FIRST);
        int j = Math.min(i, afile.length);
        for (i = 0; i < j; i++)
        {
            hashset.add(getSessionIdFromSessionFile(afile[i]));
        }

        afile = listFilesMatching(new AnySessionPartFileFilter());
        j = afile.length;
        for (i = 0; i < j; i++)
        {
            File file = afile[i];
            String s = file.getName();
            Matcher matcher = SESSION_FILE_PATTERN.matcher(s);
            matcher.matches();
            if (!hashset.contains(matcher.group(1)))
            {
                Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Trimming open session file: ").append(s).toString());
                file.delete();
            }
        }

    }

    private void trimSessionEventFiles(String s, int i)
    {
        Utils.capFileCount(filesDir, new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionEvent").toString()), i, SMALLEST_FILE_NAME_FIRST);
    }

    private void writeBeginSession(Date date, String s)
        throws Exception
    {
        Object obj;
        Object obj1;
        CodedOutputStream codedoutputstream;
        Object obj3;
        Object obj4;
        Object obj5;
        obj1 = null;
        obj3 = null;
        obj = null;
        obj5 = null;
        obj4 = null;
        codedoutputstream = null;
        Object obj2 = new ClsFileOutputStream(crashlytics.getSdkDirectory(), (new StringBuilder()).append(s).append("BeginSession").toString());
        obj = obj5;
        obj1 = obj4;
        codedoutputstream = CodedOutputStream.newInstance(((OutputStream) (obj2)));
        obj = codedoutputstream;
        obj1 = codedoutputstream;
        codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(generator));
        obj = codedoutputstream;
        obj1 = codedoutputstream;
        codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
        obj = codedoutputstream;
        obj1 = codedoutputstream;
        codedoutputstream.writeUInt64(3, date.getTime() / 1000L);
        CommonUtils.flushOrLog(codedoutputstream, "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close begin session file.");
        return;
        obj2;
        s = obj3;
        date = codedoutputstream;
_L4:
        obj = date;
        obj1 = s;
        writeStackTraceIfNotNull(((Throwable) (obj2)), s);
        obj = date;
        obj1 = s;
        throw obj2;
        date;
_L2:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close begin session file.");
        throw date;
        date;
        obj1 = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        s = ((String) (obj2));
        date = ((Date) (obj1));
        obj2 = exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeFatal(Date date, Thread thread, Throwable throwable)
    {
        Object obj;
        Object obj1;
        ClsFileOutputStream clsfileoutputstream;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        obj3 = null;
        obj7 = null;
        clsfileoutputstream = null;
        obj2 = null;
        obj8 = null;
        obj5 = null;
        obj4 = null;
        obj6 = null;
        obj = obj8;
        obj1 = obj7;
        (new File(filesDir, "crash_marker")).createNewFile();
        obj = obj8;
        obj1 = obj7;
        String s = getCurrentSessionId();
        if (s == null) goto _L2; else goto _L1
_L1:
        obj = obj8;
        obj1 = obj7;
        Crashlytics.recordFatalExceptionEvent(s);
        obj = obj8;
        obj1 = obj7;
        clsfileoutputstream = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("SessionCrash").toString());
        obj = obj5;
        obj2 = obj4;
        obj1 = CodedOutputStream.newInstance(clsfileoutputstream);
        obj = obj1;
        obj2 = obj1;
        writeSessionEvent(date, ((CodedOutputStream) (obj1)), thread, throwable, "crash", true);
        date = clsfileoutputstream;
_L4:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(date, "Failed to close fatal exception file output stream.");
        return;
_L2:
        obj = obj8;
        obj1 = obj7;
        Fabric.getLogger().e("Fabric", "Tried to write a fatal exception while no session was open.", null);
        obj1 = obj6;
        date = clsfileoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
        thread;
        date = obj3;
_L8:
        obj = obj2;
        obj1 = date;
        Fabric.getLogger().e("Fabric", "An error occurred in the fatal exception logger", thread);
        obj = obj2;
        obj1 = date;
        writeStackTraceIfNotNull(thread, date);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj2)), "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(date, "Failed to close fatal exception file output stream.");
        return;
        date;
_L6:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close fatal exception file output stream.");
        throw date;
        date;
        obj1 = clsfileoutputstream;
        if (true) goto _L6; else goto _L5
_L5:
        thread;
        date = clsfileoutputstream;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void writeFrame(CodedOutputStream codedoutputstream, int i, StackTraceElement stacktraceelement, boolean flag)
        throws Exception
    {
        byte byte0 = 4;
        codedoutputstream.writeTag(i, 2);
        codedoutputstream.writeRawVarint32(getFrameSize(stacktraceelement, flag));
        if (stacktraceelement.isNativeMethod())
        {
            codedoutputstream.writeUInt64(1, Math.max(stacktraceelement.getLineNumber(), 0));
        } else
        {
            codedoutputstream.writeUInt64(1, 0L);
        }
        codedoutputstream.writeBytes(2, ByteString.copyFromUtf8((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        if (stacktraceelement.getFileName() != null)
        {
            codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            codedoutputstream.writeUInt64(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        codedoutputstream.writeUInt32(5, i);
    }

    private void writeInitialPartsTo(CodedOutputStream codedoutputstream, String s)
        throws IOException
    {
        String as[] = new String[4];
        as[0] = "SessionUser";
        as[1] = "SessionApp";
        as[2] = "SessionOS";
        as[3] = "SessionDevice";
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s1 = as[i];
            File afile[] = listFilesMatching(new FileNameContainsFilter((new StringBuilder()).append(s).append(s1).toString()));
            if (afile.length == 0)
            {
                Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Can't find ").append(s1).append(" data for session ID ").append(s).toString(), null);
            } else
            {
                Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Collecting ").append(s1).append(" data for session ID ").append(s).toString());
                writeToCosFromFile(codedoutputstream, afile[0]);
            }
            i++;
        }
    }

    private void writeNonFatalEventsTo(CodedOutputStream codedoutputstream, File afile[], String s)
    {
        Arrays.sort(afile, CommonUtils.FILE_MODIFIED_COMPARATOR);
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file = afile[i];
            try
            {
                Fabric.getLogger().d("Fabric", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
                    s, file.getName()
                }));
                writeToCosFromFile(codedoutputstream, file);
            }
            catch (Exception exception)
            {
                Fabric.getLogger().e("Fabric", "Error writting non-fatal to session.", exception);
            }
            i++;
        }
    }

    private void writeSessionApp(String s)
        throws Exception
    {
        Object obj;
        Object obj1;
        Object obj3;
        ByteString bytestring;
        ByteString bytestring1;
        ByteString bytestring2;
        obj1 = null;
        obj3 = null;
        obj = null;
        bytestring2 = null;
        bytestring1 = null;
        bytestring = null;
        Object obj2 = new ClsFileOutputStream(crashlytics.getSdkDirectory(), (new StringBuilder()).append(s).append("SessionApp").toString());
        s = bytestring2;
        obj = bytestring1;
        obj1 = CodedOutputStream.newInstance(((OutputStream) (obj2)));
        s = ((String) (obj1));
        obj = obj1;
        obj3 = ByteString.copyFromUtf8(crashlytics.getPackageName());
        s = ((String) (obj1));
        obj = obj1;
        bytestring = ByteString.copyFromUtf8(crashlytics.getVersionCode());
        s = ((String) (obj1));
        obj = obj1;
        bytestring1 = ByteString.copyFromUtf8(crashlytics.getVersionName());
        s = ((String) (obj1));
        obj = obj1;
        bytestring2 = ByteString.copyFromUtf8(idManager.getAppInstallIdentifier());
        s = ((String) (obj1));
        obj = obj1;
        int i = DeliveryMechanism.determineFrom(crashlytics.getInstallerPackageName()).getId();
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeTag(7, 2);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeRawVarint32(getSessionAppSize(((ByteString) (obj3)), bytestring, bytestring1, bytestring2, i));
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(1, ((ByteString) (obj3)));
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(2, bytestring);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(3, bytestring1);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeTag(5, 2);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeRawVarint32(getSessionAppOrgSize());
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeString(1, ApiKey.getApiKey(crashlytics.getContext()));
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(6, bytestring2);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeEnum(10, i);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush to session app file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        return;
        s;
        obj2 = obj3;
        obj3 = s;
        s = bytestring;
_L4:
        obj = s;
        obj1 = obj2;
        writeStackTraceIfNotNull(((Throwable) (obj3)), ((OutputStream) (obj2)));
        obj = s;
        obj1 = obj2;
        throw obj3;
        obj2;
        s = ((String) (obj));
        obj = obj2;
_L2:
        CommonUtils.flushOrLog(s, "Failed to flush to session app file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session app file.");
        throw obj;
        obj;
        obj1 = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeSessionDevice(String s)
        throws Exception
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        ByteString bytestring;
        Object obj4;
        Object obj5;
        Map map;
        obj2 = null;
        bytestring = null;
        obj3 = null;
        map = null;
        obj4 = null;
        obj5 = null;
        obj = map;
        obj1 = obj2;
        Context context = crashlytics.getContext();
        obj = map;
        obj1 = obj2;
        obj2 = new ClsFileOutputStream(crashlytics.getSdkDirectory(), (new StringBuilder()).append(s).append("SessionDevice").toString());
        s = ((String) (obj5));
        obj = obj4;
        obj1 = CodedOutputStream.newInstance(((OutputStream) (obj2)));
        s = ((String) (obj1));
        obj = obj1;
        obj5 = new StatFs(Environment.getDataDirectory().getPath());
        s = ((String) (obj1));
        obj = obj1;
        int i = CommonUtils.getCpuArchitectureInt();
        s = ((String) (obj1));
        obj = obj1;
        obj4 = stringToByteString(Build.MODEL);
        s = ((String) (obj1));
        obj = obj1;
        obj3 = stringToByteString(Build.MANUFACTURER);
        s = ((String) (obj1));
        obj = obj1;
        bytestring = stringToByteString(Build.PRODUCT);
        s = ((String) (obj1));
        obj = obj1;
        int j = Runtime.getRuntime().availableProcessors();
        s = ((String) (obj1));
        obj = obj1;
        long l = CommonUtils.getTotalRamInBytes();
        s = ((String) (obj1));
        obj = obj1;
        long l1 = (long)((StatFs) (obj5)).getBlockCount() * (long)((StatFs) (obj5)).getBlockSize();
        s = ((String) (obj1));
        obj = obj1;
        boolean flag = CommonUtils.isEmulator(context);
        s = ((String) (obj1));
        obj = obj1;
        obj5 = ByteString.copyFromUtf8(idManager.getDeviceUUID());
        s = ((String) (obj1));
        obj = obj1;
        map = idManager.getDeviceIdentifiers();
        s = ((String) (obj1));
        obj = obj1;
        int k = CommonUtils.getDeviceState(context);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeTag(9, 2);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeRawVarint32(getSessionDeviceSize(i, ((ByteString) (obj5)), ((ByteString) (obj4)), j, l, l1, flag, map, k, ((ByteString) (obj3)), bytestring));
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(1, ((ByteString) (obj5)));
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeEnum(3, i);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(4, ((ByteString) (obj4)));
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeUInt32(5, j);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeUInt64(6, l);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeUInt64(7, l1);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBool(10, flag);
        s = ((String) (obj1));
        obj = obj1;
        obj4 = map.entrySet().iterator();
_L2:
        s = ((String) (obj1));
        obj = obj1;
        if (!((Iterator) (obj4)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((String) (obj1));
        obj = obj1;
        obj5 = (java.util.Map.Entry)((Iterator) (obj4)).next();
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeTag(11, 2);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeRawVarint32(getDeviceIdentifierSize((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)((java.util.Map.Entry) (obj5)).getKey(), (String)((java.util.Map.Entry) (obj5)).getValue()));
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeEnum(1, ((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)((java.util.Map.Entry) (obj5)).getKey()).protobufIndex);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(2, ByteString.copyFromUtf8((String)((java.util.Map.Entry) (obj5)).getValue()));
        if (true) goto _L2; else goto _L1
        obj3;
_L6:
        obj = s;
        obj1 = obj2;
        writeStackTraceIfNotNull(((Throwable) (obj3)), ((OutputStream) (obj2)));
        obj = s;
        obj1 = obj2;
        throw obj3;
        s;
_L4:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush session device info.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session device file.");
        throw s;
_L1:
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeUInt32(12, k);
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_576;
        }
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(13, ((ByteString) (obj3)));
        if (bytestring == null)
        {
            break MISSING_BLOCK_LABEL_593;
        }
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(14, bytestring);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush session device info.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close session device file.");
        return;
        s;
        obj1 = obj2;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        s = ((String) (obj3));
        obj3 = exception;
        obj2 = bytestring;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void writeSessionEvent(Date date, CodedOutputStream codedoutputstream, Thread thread, Throwable throwable, String s, boolean flag)
        throws Exception
    {
        float f;
        Context context;
        ByteString bytestring;
        int j;
        int k;
        long l;
        long l1;
        long l2;
        boolean flag1;
        context = crashlytics.getContext();
        l = date.getTime() / 1000L;
        f = CommonUtils.getBatteryLevel(context);
        j = CommonUtils.getBatteryVelocity(context, powerConnected);
        flag1 = CommonUtils.getProximitySensorEnabled(context);
        k = context.getResources().getConfiguration().orientation;
        l1 = CommonUtils.getTotalRamInBytes() - CommonUtils.calculateFreeRamInBytes(context);
        l2 = CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath());
        runningAppProcessInfo = CommonUtils.getAppProcessInfo(crashlytics.getPackageName(), context);
        stacks = new LinkedList();
        exceptionStack = throwable.getStackTrace();
        if (flag)
        {
            date = Thread.getAllStackTraces();
            threads = new Thread[date.size()];
            int i = 0;
            for (date = date.entrySet().iterator(); date.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)date.next();
                threads[i] = (Thread)entry.getKey();
                stacks.add(entry.getValue());
                i++;
            }

        } else
        {
            threads = new Thread[0];
        }
        bytestring = getByteStringForLog(logFile);
        if (bytestring == null)
        {
            Fabric.getLogger().d("Fabric", "No log data to include with this event.");
        }
        CommonUtils.closeOrLog(logFile, "There was a problem closing the Crashlytics log file.");
        logFile = null;
        if (CommonUtils.getBooleanResourceValue(context, "com.crashlytics.CollectCustomKeys", true)) goto _L2; else goto _L1
_L1:
        date = new TreeMap();
_L4:
        codedoutputstream.writeTag(10, 2);
        codedoutputstream.writeRawVarint32(getSessionEventSize(thread, throwable, s, l, date, f, j, flag1, k, l1, l2, bytestring));
        codedoutputstream.writeUInt64(1, l);
        codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
        writeSessionEventApp(codedoutputstream, thread, throwable, date);
        writeSessionEventDevice(codedoutputstream, f, j, flag1, k, l1, l2);
        writeSessionEventLog(codedoutputstream, bytestring);
        return;
_L2:
        Map map = crashlytics.getAttributes();
        date = map;
        if (map != null)
        {
            date = map;
            if (map.size() > 1)
            {
                date = new TreeMap(map);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeSessionEventApp(CodedOutputStream codedoutputstream, Thread thread, Throwable throwable, Map map)
        throws Exception
    {
        codedoutputstream.writeTag(3, 2);
        codedoutputstream.writeRawVarint32(getEventAppSize(thread, throwable, map));
        writeSessionEventAppExecution(codedoutputstream, thread, throwable);
        if (map != null && !map.isEmpty())
        {
            writeSessionEventAppCustomAttributes(codedoutputstream, map);
        }
        if (runningAppProcessInfo != null)
        {
            boolean flag;
            if (runningAppProcessInfo.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            codedoutputstream.writeBool(3, flag);
        }
        codedoutputstream.writeUInt32(4, crashlytics.getContext().getResources().getConfiguration().orientation);
    }

    private void writeSessionEventAppCustomAttributes(CodedOutputStream codedoutputstream, Map map)
        throws Exception
    {
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(map)))
        {
            map = (java.util.Map.Entry)iterator.next();
            codedoutputstream.writeTag(2, 2);
            codedoutputstream.writeRawVarint32(getEventAppCustomAttributeSize((String)map.getKey(), (String)map.getValue()));
            codedoutputstream.writeBytes(1, ByteString.copyFromUtf8((String)map.getKey()));
            String s = (String)map.getValue();
            map = s;
            if (s == null)
            {
                map = "";
            }
        }

    }

    private void writeSessionEventAppExecution(CodedOutputStream codedoutputstream, Thread thread, Throwable throwable)
        throws Exception
    {
        codedoutputstream.writeTag(1, 2);
        codedoutputstream.writeRawVarint32(getEventAppExecutionSize(thread, throwable));
        writeThread(codedoutputstream, thread, exceptionStack, 4, true);
        int j = threads.length;
        for (int i = 0; i < j; i++)
        {
            writeThread(codedoutputstream, threads[i], (StackTraceElement[])stacks.get(i), 0, false);
        }

        writeSessionEventAppExecutionException(codedoutputstream, throwable, 1, 2);
        codedoutputstream.writeTag(3, 2);
        codedoutputstream.writeRawVarint32(getEventAppExecutionSignalSize());
        codedoutputstream.writeBytes(1, SIGNAL_DEFAULT_BYTE_STRING);
        codedoutputstream.writeBytes(2, SIGNAL_DEFAULT_BYTE_STRING);
        codedoutputstream.writeUInt64(3, 0L);
        codedoutputstream.writeTag(4, 2);
        codedoutputstream.writeRawVarint32(getBinaryImageSize());
        codedoutputstream.writeUInt64(1, 0L);
        codedoutputstream.writeUInt64(2, 0L);
        codedoutputstream.writeBytes(3, packageName);
        if (optionalBuildIdBytes != null)
        {
            codedoutputstream.writeBytes(4, optionalBuildIdBytes);
        }
    }

    private void writeSessionEventAppExecutionException(CodedOutputStream codedoutputstream, Throwable throwable, int i, int j)
        throws Exception
    {
label0:
        {
            codedoutputstream.writeTag(j, 2);
            codedoutputstream.writeRawVarint32(getEventAppExecutionExceptionSize(throwable, 1));
            codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(throwable.getClass().getName()));
            String s = throwable.getLocalizedMessage();
            if (s != null)
            {
                codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(s));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int k = astacktraceelement.length;
            for (j = 0; j < k; j++)
            {
                writeFrame(codedoutputstream, 4, astacktraceelement[j], true);
            }

            throwable = throwable.getCause();
            if (throwable != null)
            {
                if (i >= maxChainedExceptionsDepth)
                {
                    break label0;
                }
                writeSessionEventAppExecutionException(codedoutputstream, throwable, i + 1, 6);
            }
            return;
        }
        for (i = 0; throwable != null; i++)
        {
            throwable = throwable.getCause();
        }

        codedoutputstream.writeUInt32(7, i);
    }

    private void writeSessionEventDevice(CodedOutputStream codedoutputstream, float f, int i, boolean flag, int j, long l, 
            long l1)
        throws Exception
    {
        codedoutputstream.writeTag(5, 2);
        codedoutputstream.writeRawVarint32(getEventDeviceSize(f, i, flag, j, l, l1));
        codedoutputstream.writeFloat(1, f);
        codedoutputstream.writeSInt32(2, i);
        codedoutputstream.writeBool(3, flag);
        codedoutputstream.writeUInt32(4, j);
        codedoutputstream.writeUInt64(5, l);
        codedoutputstream.writeUInt64(6, l1);
    }

    private void writeSessionEventLog(CodedOutputStream codedoutputstream, ByteString bytestring)
        throws Exception
    {
        if (bytestring != null)
        {
            codedoutputstream.writeTag(6, 2);
            codedoutputstream.writeRawVarint32(getEventLogSize(bytestring));
            codedoutputstream.writeBytes(1, bytestring);
        }
    }

    private void writeSessionOS(String s)
        throws Exception
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        ByteString bytestring;
        Object obj4;
        Object obj5;
        Object obj6;
        obj2 = null;
        obj3 = null;
        obj6 = null;
        obj5 = null;
        obj4 = null;
        bytestring = null;
        obj = obj6;
        obj1 = obj2;
        Context context = crashlytics.getContext();
        obj = obj6;
        obj1 = obj2;
        obj2 = new ClsFileOutputStream(crashlytics.getSdkDirectory(), (new StringBuilder()).append(s).append("SessionOS").toString());
        s = obj5;
        obj = obj4;
        obj1 = CodedOutputStream.newInstance(((OutputStream) (obj2)));
        s = ((String) (obj1));
        obj = obj1;
        obj3 = ByteString.copyFromUtf8(android.os.Build.VERSION.RELEASE);
        s = ((String) (obj1));
        obj = obj1;
        bytestring = ByteString.copyFromUtf8(android.os.Build.VERSION.CODENAME);
        s = ((String) (obj1));
        obj = obj1;
        boolean flag = CommonUtils.isRooted(context);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeTag(8, 2);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeRawVarint32(getSessionOSSize(((ByteString) (obj3)), bytestring, flag));
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeEnum(1, 3);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(2, ((ByteString) (obj3)));
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(3, bytestring);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBool(4, flag);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush to session OS file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close session OS file.");
        return;
        s;
        obj2 = obj3;
        obj3 = s;
        s = bytestring;
_L4:
        obj = s;
        obj1 = obj2;
        writeStackTraceIfNotNull(((Throwable) (obj3)), ((OutputStream) (obj2)));
        obj = s;
        obj1 = obj2;
        throw obj3;
        obj2;
        s = ((String) (obj));
_L2:
        CommonUtils.flushOrLog(s, "Failed to flush to session OS file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session OS file.");
        throw obj2;
        obj;
        obj1 = obj2;
        obj2 = obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeSessionPartsToSessionFile(File file, String s, int i)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Collecting session parts for ID ").append(s).toString());
        File afile1[] = listFilesMatching(new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionCrash").toString()));
        File afile[];
        Object obj5;
        Object obj6;
        boolean flag;
        boolean flag1;
        if (afile1 != null && afile1.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Fabric.getLogger().d("Fabric", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
            s, Boolean.valueOf(flag)
        }));
        afile = listFilesMatching(new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionEvent").toString()));
        if (afile != null && afile.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Fabric.getLogger().d("Fabric", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
            s, Boolean.valueOf(flag1)
        }));
        if (!flag && !flag1) goto _L2; else goto _L1
_L1:
        obj1 = null;
        obj3 = null;
        obj = null;
        obj6 = null;
        obj5 = null;
        obj4 = null;
        obj2 = new ClsFileOutputStream(filesDir, s);
        obj = obj6;
        obj1 = obj5;
        obj3 = CodedOutputStream.newInstance(((OutputStream) (obj2)));
        obj = obj3;
        obj1 = obj3;
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Collecting SessionStart data for session ID ").append(s).toString());
        obj = obj3;
        obj1 = obj3;
        writeToCosFromFile(((CodedOutputStream) (obj3)), file);
        obj = obj3;
        obj1 = obj3;
        ((CodedOutputStream) (obj3)).writeUInt64(4, (new Date()).getTime() / 1000L);
        obj = obj3;
        obj1 = obj3;
        ((CodedOutputStream) (obj3)).writeBool(5, flag);
        obj = obj3;
        obj1 = obj3;
        writeInitialPartsTo(((CodedOutputStream) (obj3)), s);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_496;
        }
        file = afile;
        obj = obj3;
        obj1 = obj3;
        if (afile.length <= i)
        {
            break MISSING_BLOCK_LABEL_480;
        }
        obj = obj3;
        obj1 = obj3;
        Fabric.getLogger().d("Fabric", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
            Integer.valueOf(i)
        }));
        obj = obj3;
        obj1 = obj3;
        trimSessionEventFiles(s, i);
        obj = obj3;
        obj1 = obj3;
        file = listFilesMatching(new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionEvent").toString()));
        obj = obj3;
        obj1 = obj3;
        writeNonFatalEventsTo(((CodedOutputStream) (obj3)), file, s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_519;
        }
        obj = obj3;
        obj1 = obj3;
        writeToCosFromFile(((CodedOutputStream) (obj3)), afile1[0]);
        obj = obj3;
        obj1 = obj3;
        ((CodedOutputStream) (obj3)).writeUInt32(11, 1);
        obj = obj3;
        obj1 = obj3;
        ((CodedOutputStream) (obj3)).writeEnum(12, 3);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj3)), "Error flushing session file stream");
        if (false)
        {
            closeWithoutRenamingOrLog(((ClsFileOutputStream) (obj2)));
        } else
        {
            CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close CLS file");
        }
_L3:
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Removing session part files for ID ").append(s).toString());
        deleteSessionPartFilesFor(s);
        return;
        file;
        obj2 = obj3;
        obj3 = file;
        file = obj4;
_L5:
        obj = file;
        obj1 = obj2;
        Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Failed to write session file for session ID: ").append(s).toString(), ((Throwable) (obj3)));
        obj = file;
        obj1 = obj2;
        writeStackTraceIfNotNull(((Throwable) (obj3)), ((OutputStream) (obj2)));
        CommonUtils.flushOrLog(file, "Error flushing session file stream");
        if (true)
        {
            closeWithoutRenamingOrLog(((ClsFileOutputStream) (obj2)));
        } else
        {
            CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close CLS file");
        }
          goto _L3
        file;
_L4:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Error flushing session file stream");
        if (false)
        {
            closeWithoutRenamingOrLog(((ClsFileOutputStream) (obj1)));
        } else
        {
            CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close CLS file");
        }
        throw file;
_L2:
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("No events present for session ID ").append(s).toString());
          goto _L3
        file;
        obj1 = obj2;
          goto _L4
        obj3;
        file = ((File) (obj1));
          goto _L5
    }

    private void writeSessionUser(String s)
        throws Exception
    {
        Object obj;
        Object obj1;
        Object obj3;
        ByteString bytestring;
        Object obj4;
        String s1;
        String s2;
        bytestring = null;
        obj1 = null;
        obj3 = null;
        obj = null;
        s2 = null;
        s1 = null;
        obj4 = null;
        Object obj2 = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("SessionUser").toString());
        s = s2;
        obj = s1;
        obj1 = CodedOutputStream.newInstance(((OutputStream) (obj2)));
        s = ((String) (obj1));
        obj = obj1;
        obj4 = crashlytics.getUserIdentifier();
        s = ((String) (obj1));
        obj = obj1;
        s2 = crashlytics.getUserName();
        s = ((String) (obj1));
        obj = obj1;
        s1 = crashlytics.getUserEmail();
        if (obj4 == null && s2 == null && s1 == null)
        {
            CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush session user file.");
            CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close session user file.");
            return;
        }
        obj3 = obj4;
        if (obj4 == null)
        {
            obj3 = "";
        }
        s = ((String) (obj1));
        obj = obj1;
        obj4 = ByteString.copyFromUtf8(((String) (obj3)));
        if (s2 != null) goto _L2; else goto _L1
_L1:
        obj3 = null;
          goto _L3
_L7:
        s = ((String) (obj1));
        obj = obj1;
        int j = 0 + CodedOutputStream.computeBytesSize(1, ((ByteString) (obj4)));
        int i;
        i = j;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        s = ((String) (obj1));
        obj = obj1;
        i = j + CodedOutputStream.computeBytesSize(2, ((ByteString) (obj3)));
        j = i;
        if (bytestring == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        s = ((String) (obj1));
        obj = obj1;
        j = i + CodedOutputStream.computeBytesSize(3, bytestring);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeTag(6, 2);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeRawVarint32(j);
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(1, ((ByteString) (obj4)));
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(2, ((ByteString) (obj3)));
        if (bytestring == null)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        s = ((String) (obj1));
        obj = obj1;
        ((CodedOutputStream) (obj1)).writeBytes(3, bytestring);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush session user file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close session user file.");
        return;
_L2:
        s = ((String) (obj1));
        obj = obj1;
        obj3 = ByteString.copyFromUtf8(s2);
          goto _L3
_L8:
        s = ((String) (obj1));
        obj = obj1;
        try
        {
            bytestring = ByteString.copyFromUtf8(s1);
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            s = ((String) (obj));
        }
        finally
        {
            obj1 = obj2;
            obj2 = obj;
        }
          goto _L4
        s;
        obj2 = obj3;
        obj3 = s;
        s = ((String) (obj4));
_L6:
        obj = s;
        obj1 = obj2;
        writeStackTraceIfNotNull(((Throwable) (obj3)), ((OutputStream) (obj2)));
        obj = s;
        obj1 = obj2;
        throw obj3;
        obj2;
        s = ((String) (obj));
_L5:
        CommonUtils.flushOrLog(s, "Failed to flush session user file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session user file.");
        throw obj2;
        if (true) goto _L5; else goto _L4
_L4:
        if (true) goto _L6; else goto _L3
_L3:
        if (s1 != null) goto _L8; else goto _L7
    }

    private void writeStackTrace(Throwable throwable, OutputStream outputstream)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        outputstream = new PrintWriter(outputstream);
        writeStackTrace(throwable, ((Writer) (outputstream)));
        CommonUtils.closeOrLog(outputstream, "Failed to close stack trace writer.");
        return;
        outputstream;
        throwable = obj1;
_L4:
        obj = throwable;
        Fabric.getLogger().e("Fabric", "Failed to create PrintWriter", outputstream);
        CommonUtils.closeOrLog(throwable, "Failed to close stack trace writer.");
        return;
        throwable;
_L2:
        CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close stack trace writer.");
        throw throwable;
        throwable;
        obj = outputstream;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throwable = outputstream;
        outputstream = exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeStackTrace(Throwable throwable, Writer writer)
    {
        int i = 1;
_L4:
        if (throwable == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = getMessage(throwable);
        String s;
        boolean flag;
        int j;
        if (obj == null)
        {
            obj = "";
        }
        break MISSING_BLOCK_LABEL_164;
        writer.write((new StringBuilder()).append(s).append(throwable.getClass().getName()).append(": ").append(((String) (obj))).append("\n").toString());
        flag = false;
        obj = throwable.getStackTrace();
        j = obj.length;
        i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = obj[i];
        writer.write((new StringBuilder()).append("\tat ").append(s.toString()).append("\n").toString());
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        throwable = throwable.getCause();
        i = ((flag) ? 1 : 0);
        if (true) goto _L4; else goto _L3
        throwable;
        Fabric.getLogger().e("Fabric", "Could not write stack trace", throwable);
_L3:
        return;
        if (i != 0)
        {
            s = "";
        } else
        {
            s = "Caused by: ";
        }
        break MISSING_BLOCK_LABEL_19;
    }

    private void writeStackTrace(Throwable throwable, String s)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        s = new PrintWriter(crashlytics.getContext().openFileOutput(s, 0));
        writeStackTrace(throwable, ((Writer) (s)));
        CommonUtils.closeOrLog(s, "Failed to close stack trace writer.");
        return;
        s;
        throwable = obj1;
_L4:
        obj = throwable;
        Fabric.getLogger().e("Fabric", "Failed to create PrintWriter", s);
        CommonUtils.closeOrLog(throwable, "Failed to close stack trace writer.");
        return;
        throwable;
_L2:
        CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close stack trace writer.");
        throw throwable;
        throwable;
        obj = s;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throwable = s;
        s = exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeStackTraceIfNotNull(Throwable throwable, OutputStream outputstream)
    {
        if (outputstream != null)
        {
            writeStackTrace(throwable, outputstream);
        }
    }

    private void writeThread(CodedOutputStream codedoutputstream, Thread thread, StackTraceElement astacktraceelement[], int i, boolean flag)
        throws Exception
    {
        codedoutputstream.writeTag(1, 2);
        codedoutputstream.writeRawVarint32(getThreadSize(thread, astacktraceelement, i, flag));
        codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(thread.getName()));
        codedoutputstream.writeUInt32(2, i);
        int j = astacktraceelement.length;
        for (i = 0; i < j; i++)
        {
            writeFrame(codedoutputstream, 3, astacktraceelement[i], flag);
        }

    }

    private void writeToCosFromFile(CodedOutputStream codedoutputstream, File file)
        throws IOException
    {
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        Object obj;
        byte abyte0[];
        abyte0 = new byte[(int)file.length()];
        obj = null;
        file = new FileInputStream(file);
        int i = 0;
_L4:
        int j;
        if (i >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        j = file.read(abyte0, i, abyte0.length - i);
        if (j < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i += j;
        if (true) goto _L4; else goto _L3
_L3:
        CommonUtils.closeOrLog(file, "Failed to close file input stream.");
        codedoutputstream.writeRawBytes(abyte0);
        return;
        file;
        codedoutputstream = obj;
_L6:
        CommonUtils.closeOrLog(codedoutputstream, "Failed to close file input stream.");
        throw file;
_L2:
        Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Tried to include a file that doesn't exist: ").append(file.getName()).toString(), null);
        return;
        Exception exception;
        exception;
        codedoutputstream = file;
        file = exception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    void cleanInvalidTempFiles()
    {
        executeAsync(new Runnable() {

            final CrashlyticsUncaughtExceptionHandler this$0;

            public void run()
            {
                doCleanInvalidTempFiles(listFilesMatching(ClsFileOutputStream.TEMP_FILENAME_FILTER));
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
        });
    }

    boolean didPreviousInitializationComplete()
    {
        return ((Boolean)executeSyncLoggingException(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;

            public Boolean call()
                throws Exception
            {
                return Boolean.valueOf(initializationMarkerFile.exists());
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
        })).booleanValue();
    }

    void doCleanInvalidTempFiles(File afile[])
    {
        deleteLegacyInvalidCacheDir();
        int k = afile.length;
        for (int i = 0; i < k; i++)
        {
            final String sessionId = afile[i];
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Found invalid session part file: ").append(sessionId).toString());
            sessionId = getSessionIdFromSessionFile(sessionId);
            FilenameFilter filenamefilter = new FilenameFilter() {

                final CrashlyticsUncaughtExceptionHandler this$0;
                final String val$sessionId;

                public boolean accept(File file1, String s)
                {
                    return s.startsWith(sessionId);
                }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                sessionId = s;
                super();
            }
            };
            Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Deleting all part files for invalid session: ").append(sessionId).toString());
            File afile1[] = listFilesMatching(filenamefilter);
            int l = afile1.length;
            for (int j = 0; j < l; j++)
            {
                File file = afile1[j];
                Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Deleting session file: ").append(file).toString());
                file.delete();
            }

        }

    }

    void doWriteToLog(QueueFile queuefile, int i, long l, String s)
    {
        if (queuefile != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1 = s;
        if (s == null)
        {
            s1 = "null";
        }
        int j;
        try
        {
            j = i / 4;
        }
        // Misplaced declaration of an exception variable
        catch (QueueFile queuefile)
        {
            Fabric.getLogger().e("Fabric", "There was a problem writing to the Crashlytics log.", queuefile);
            return;
        }
        s = s1;
        if (s1.length() > j)
        {
            s = (new StringBuilder()).append("...").append(s1.substring(s1.length() - j)).toString();
        }
        s = s.replaceAll("\r", " ").replaceAll("\n", " ");
        queuefile.add(String.format(Locale.US, "%d %s%n", new Object[] {
            Long.valueOf(l), s
        }).getBytes("UTF-8"));
        while (!queuefile.isEmpty() && queuefile.usedBytes() > i) 
        {
            queuefile.remove();
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    void ensureOpenSessionExists()
    {
        executeAsync(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                if (!hasOpenSession())
                {
                    doOpenSession();
                }
                return null;
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
        });
    }

    boolean finalizeSessions()
    {
        return ((Boolean)executeSyncLoggingException(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;

            public Boolean call()
                throws Exception
            {
                if (!isHandlingException.get())
                {
                    doCloseSessions();
                    doOpenSession();
                    Fabric.getLogger().d("Fabric", "Open sessions were closed and a new session was opened.");
                    return Boolean.valueOf(true);
                } else
                {
                    Fabric.getLogger().d("Fabric", "Skipping session finalization because a crash has already occurred.");
                    return Boolean.valueOf(false);
                }
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
        })).booleanValue();
    }

    ByteString getByteStringForLog(QueueFile queuefile)
    {
        if (queuefile == null)
        {
            return null;
        }
        final int offsetHolder[] = new int[1];
        offsetHolder[0] = 0;
        final byte logBytes[] = new byte[queuefile.usedBytes()];
        try
        {
            queuefile.forEach(new io.fabric.sdk.android.services.common.QueueFile.ElementReader() {

                final CrashlyticsUncaughtExceptionHandler this$0;
                final byte val$logBytes[];
                final int val$offsetHolder[];

                public void read(InputStream inputstream, int i)
                    throws IOException
                {
                    int ai[];
                    inputstream.read(logBytes, offsetHolder[0], i);
                    ai = offsetHolder;
                    ai[0] = ai[0] + i;
                    inputstream.close();
                    return;
                    Exception exception;
                    exception;
                    inputstream.close();
                    throw exception;
                }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                logBytes = abyte0;
                offsetHolder = ai;
                super();
            }
            });
        }
        // Misplaced declaration of an exception variable
        catch (QueueFile queuefile)
        {
            Fabric.getLogger().e("Fabric", "A problem occurred while reading the Crashlytics log file.", queuefile);
        }
        return ByteString.copyFrom(logBytes, 0, offsetHolder[0]);
    }

    QueueFile getLogFile()
    {
        return logFile;
    }

    boolean hasOpenSession()
    {
        return listSessionBeginFiles().length > 0;
    }

    boolean isHandlingException()
    {
        return isHandlingException.get();
    }

    File[] listSessionBeginFiles()
    {
        return listFilesMatching(new FileNameContainsFilter("BeginSession"));
    }

    void markInitializationComplete()
    {
        executeAsync(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;

            public Boolean call()
                throws Exception
            {
                boolean flag;
                try
                {
                    flag = initializationMarkerFile.delete();
                    Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Initialization marker file removed: ").append(flag).toString());
                }
                catch (Exception exception)
                {
                    Fabric.getLogger().e("Fabric", "Problem encountered deleting Crashlytics initialization marker.", exception);
                    return Boolean.valueOf(false);
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
        });
    }

    void markInitializationStarted()
    {
        executeSyncLoggingException(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                initializationMarkerFile.createNewFile();
                Fabric.getLogger().d("Fabric", "Initialization marker file created.");
                return null;
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
        });
    }

    void trimSessionFiles()
    {
        Utils.capFileCount(filesDir, SESSION_FILE_FILTER, 4, SMALLEST_FILE_NAME_FIRST);
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        isHandlingException.set(true);
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Crashlytics is handling uncaught exception \"").append(throwable).append("\" from thread ").append(thread.getName()).toString());
        if (!receiversRegistered.getAndSet(true))
        {
            Fabric.getLogger().d("Fabric", "Unregistering power receivers.");
            Context context = crashlytics.getContext();
            context.unregisterReceiver(powerConnectedReceiver);
            context.unregisterReceiver(powerDisconnectedReceiver);
        }
        executeSyncLoggingException(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;
            final Throwable val$ex;
            final Date val$now;
            final Thread val$thread;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                handleUncaughtException(now, thread, ex);
                return null;
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                now = date;
                thread = thread1;
                ex = throwable;
                super();
            }
        });
        Fabric.getLogger().d("Fabric", "Crashlytics completed exception processing. Invoking default exception handler.");
        defaultHandler.uncaughtException(thread, throwable);
        isHandlingException.set(false);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Fabric.getLogger().e("Fabric", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
        Fabric.getLogger().d("Fabric", "Crashlytics completed exception processing. Invoking default exception handler.");
        defaultHandler.uncaughtException(thread, throwable);
        isHandlingException.set(false);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        throw thread;
        obj;
        Fabric.getLogger().d("Fabric", "Crashlytics completed exception processing. Invoking default exception handler.");
        defaultHandler.uncaughtException(thread, throwable);
        isHandlingException.set(false);
        throw obj;
    }

    void writeNonFatalException(Thread thread, Throwable throwable)
    {
        executeAsync(new Runnable() {

            final CrashlyticsUncaughtExceptionHandler this$0;
            final Throwable val$ex;
            final Date val$now;
            final Thread val$thread;

            public void run()
            {
                if (!isHandlingException.get())
                {
                    doWriteNonFatal(now, thread, ex);
                }
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                now = date;
                thread = thread1;
                ex = throwable;
                super();
            }
        });
    }

    void writeToLog(final long timestamp, final String msg)
    {
        executeAsync(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;
            final String val$msg;
            final long val$timestamp;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                if (!isHandlingException.get())
                {
                    if (logFile == null)
                    {
                        initLogFile();
                    }
                    doWriteToLog(logFile, 0x10000, timestamp, msg);
                }
                return null;
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                timestamp = l;
                msg = s;
                super();
            }
        });
    }





/*
    static boolean access$102(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, boolean flag)
    {
        crashlyticsuncaughtexceptionhandler.powerConnected = flag;
        return flag;
    }

*/










}
