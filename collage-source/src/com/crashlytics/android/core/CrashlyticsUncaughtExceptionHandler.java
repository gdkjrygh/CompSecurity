// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.crashlytics.android.core.internal.models.SessionEventData;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.l;
import io.fabric.sdk.android.services.common.h;
import io.fabric.sdk.android.services.common.k;
import io.fabric.sdk.android.services.common.n;
import io.fabric.sdk.android.services.d.p;
import io.fabric.sdk.android.services.d.q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
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
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore, LogFileManager, ClsFileOutputStream, CLSUUID, 
//            CodedOutputStream, ExceptionUtils, UserMetaData, MetaDataStore, 
//            CrashlyticsListener, CrashlyticsExecutorServiceWrapper, Utils, SessionDataWriter, 
//            NativeCrashWriter, ReportUploader, SessionReport

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
    private final CrashlyticsCore crashlyticsCore;
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final CrashlyticsExecutorServiceWrapper executorServiceWrapper;
    private final File filesDir;
    private final n idManager;
    private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
    private final LogFileManager logFileManager;
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
    private final SessionDataWriter sessionDataWriter;

    CrashlyticsUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashlyticsListener crashlyticslistener, CrashlyticsExecutorServiceWrapper crashlyticsexecutorservicewrapper, n n1, SessionDataWriter sessiondatawriter, CrashlyticsCore crashlyticscore)
    {
        defaultHandler = uncaughtexceptionhandler;
        executorServiceWrapper = crashlyticsexecutorservicewrapper;
        idManager = n1;
        crashlyticsCore = crashlyticscore;
        sessionDataWriter = sessiondatawriter;
        filesDir = crashlyticscore.getSdkDirectory();
        logFileManager = new LogFileManager(crashlyticscore.getContext(), filesDir);
        notifyCrashlyticsListenerOfPreviousCrash(crashlyticslistener);
        uncaughtexceptionhandler = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        crashlyticslistener = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        crashlyticsexecutorservicewrapper = crashlyticscore.getContext();
        crashlyticsexecutorservicewrapper.registerReceiver(powerConnectedReceiver, uncaughtexceptionhandler);
        crashlyticsexecutorservicewrapper.registerReceiver(powerDisconnectedReceiver, crashlyticslistener);
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
        c.h().e("Fabric", "Error closing session file stream in the presence of an exception", clsfileoutputstream);
        return;
    }

    private void deleteLegacyInvalidCacheDir()
    {
        File file = new File(crashlyticsCore.getSdkDirectory(), "invalidClsFiles");
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
            obj = crashlyticsCore.getSessionSettingsData();
            if (obj != null)
            {
                int j = ((p) (obj)).c;
                c.h().a("Fabric", "Closing all open sessions.");
                File afile[] = listSessionBeginFiles();
                if (afile != null && afile.length > 0)
                {
                    int i1 = afile.length;
                    for (int i = 0; i < i1; i++)
                    {
                        File file = afile[i];
                        String s = getSessionIdFromSessionFile(file);
                        c.h().a("Fabric", (new StringBuilder()).append("Closing session: ").append(s).toString());
                        writeSessionPartsToSessionFile(file, s, j);
                    }

                }
            } else
            {
                c.h().a("Fabric", "Unable to close session. Settings are not loaded.");
            }
            return;
        } else
        {
            c.h().a("Fabric", "No open sessions exist.");
            return;
        }
    }

    private void doOpenSession()
        throws Exception
    {
        Date date = new Date();
        String s = (new CLSUUID(idManager)).toString();
        c.h().a("Fabric", (new StringBuilder()).append("Opening an new session with ID ").append(s).toString());
        logFileManager.onSessionChange(s);
        writeBeginSession(s, date);
        writeSessionApp(s);
        writeSessionOS(s);
        writeSessionDevice(s);
    }

    private void doWriteNonFatal(Date date, Thread thread, Throwable throwable)
    {
        CodedOutputStream codedoutputstream;
        CodedOutputStream codedoutputstream1;
        CodedOutputStream codedoutputstream2;
        Object obj1;
        String s;
        codedoutputstream = null;
        obj1 = null;
        codedoutputstream2 = null;
        codedoutputstream1 = null;
        s = getCurrentSessionId();
        if (s == null) goto _L2; else goto _L1
_L1:
        CrashlyticsCore.recordLoggedExceptionEvent(s);
        Object obj;
        c.h().a("Fabric", (new StringBuilder()).append("Crashlytics is logging non-fatal exception \"").append(throwable).append("\" from thread ").append(thread.getName()).toString());
        obj = h.a(eventCounter.getAndIncrement());
        obj = (new StringBuilder()).append(s).append("SessionEvent").append(((String) (obj))).toString();
        obj = new ClsFileOutputStream(filesDir, ((String) (obj)));
        codedoutputstream = obj1;
        codedoutputstream1 = codedoutputstream2;
        codedoutputstream2 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
        codedoutputstream = codedoutputstream2;
        codedoutputstream1 = codedoutputstream2;
        writeSessionEvent(codedoutputstream2, date, thread, throwable, "error", false);
        h.a(codedoutputstream2, "Failed to flush to non-fatal file.");
        h.a(((java.io.Closeable) (obj)), "Failed to close non-fatal file output stream.");
        break MISSING_BLOCK_LABEL_177;
        thread;
        date = null;
_L6:
        c.h().e("Fabric", "An error occurred in the non-fatal exception logger", thread);
        ExceptionUtils.writeStackTraceIfNotNull(thread, date);
        h.a(codedoutputstream1, "Failed to flush to non-fatal file.");
        h.a(date, "Failed to close non-fatal file output stream.");
          goto _L3
        thread;
        date = null;
_L5:
        h.a(codedoutputstream, "Failed to flush to non-fatal file.");
        h.a(date, "Failed to close non-fatal file output stream.");
        throw thread;
_L3:
        try
        {
            trimSessionEventFiles(s, 64);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            c.h().e("Fabric", "An error occurred when trimming non-fatal files.", date);
        }
        return;
_L2:
        c.h().e("Fabric", "Tried to write a non-fatal exception while no session was open.", null);
        return;
        thread;
        date = ((Date) (obj));
        continue; /* Loop/switch isn't completed */
        thread;
        codedoutputstream = codedoutputstream1;
        if (true) goto _L5; else goto _L4
_L4:
        thread;
        date = ((Date) (obj));
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

    private String getSessionIdFromSessionFile(File file)
    {
        return file.getName().substring(0, 35);
    }

    private UserMetaData getUserMetaData(String s)
    {
        if (isHandlingException())
        {
            return new UserMetaData(crashlyticsCore.getUserIdentifier(), crashlyticsCore.getUserName(), crashlyticsCore.getUserEmail());
        } else
        {
            return (new MetaDataStore(filesDir)).readUserData(s);
        }
    }

    private void handleUncaughtException(Date date, Thread thread, Throwable throwable)
        throws Exception
    {
        writeFatal(date, thread, throwable);
        doCloseSessions();
        doOpenSession();
        trimSessionFiles();
        if (!crashlyticsCore.shouldPromptUserBeforeSendingCrashReports())
        {
            sendSessionReports();
        }
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
        c.h().a("Fabric", "Checking for previous crash marker.");
        File file = new File(crashlyticsCore.getSdkDirectory(), "crash_marker");
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
        c.h().e("Fabric", "Exception thrown by CrashlyticsListener while notifying of previous crash.", crashlyticslistener);
        return;
    }

    private void sendSessionReports()
    {
        File afile[] = listCompleteSessionFiles();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            final File toSend = afile[i];
            executorServiceWrapper.executeAsync(new Runnable() {

                final CrashlyticsUncaughtExceptionHandler this$0;
                final File val$toSend;

                public void run()
                {
                    if (h.n(crashlyticsCore.getContext()))
                    {
                        c.h().a("Fabric", "Attempting to send crash report at time of crash...");
                        Object obj = q.a().b();
                        obj = crashlyticsCore.getCreateReportSpiCall(((io.fabric.sdk.android.services.d.t) (obj)));
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

    private void trimOpenSessions(int i)
    {
        boolean flag = false;
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
        for (i = ((flag) ? 1 : 0); i < j; i++)
        {
            File file = afile[i];
            String s = file.getName();
            Matcher matcher = SESSION_FILE_PATTERN.matcher(s);
            matcher.matches();
            if (!hashset.contains(matcher.group(1)))
            {
                c.h().a("Fabric", (new StringBuilder()).append("Trimming open session file: ").append(s).toString());
                file.delete();
            }
        }

    }

    private void trimSessionEventFiles(String s, int i)
    {
        Utils.capFileCount(filesDir, new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionEvent").toString()), i, SMALLEST_FILE_NAME_FIRST);
    }

    private void writeBeginSession(String s, Date date)
        throws Exception
    {
        CodedOutputStream codedoutputstream;
        CodedOutputStream codedoutputstream1;
        CodedOutputStream codedoutputstream2;
        String s1;
        codedoutputstream = null;
        s1 = null;
        codedoutputstream2 = null;
        codedoutputstream1 = null;
        Object obj = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("BeginSession").toString());
        codedoutputstream = s1;
        codedoutputstream1 = codedoutputstream2;
        codedoutputstream2 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
        codedoutputstream = codedoutputstream2;
        codedoutputstream1 = codedoutputstream2;
        s1 = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
            crashlyticsCore.getVersion()
        });
        codedoutputstream = codedoutputstream2;
        codedoutputstream1 = codedoutputstream2;
        long l1 = date.getTime() / 1000L;
        codedoutputstream = codedoutputstream2;
        codedoutputstream1 = codedoutputstream2;
        sessionDataWriter.writeBeginSession(codedoutputstream2, s, s1, l1);
        h.a(codedoutputstream2, "Failed to flush to session begin file.");
        h.a(((java.io.Closeable) (obj)), "Failed to close begin session file.");
        return;
        date;
        s = null;
_L4:
        ExceptionUtils.writeStackTraceIfNotNull(date, s);
        throw date;
        obj;
        date = s;
        codedoutputstream = codedoutputstream1;
        s = ((String) (obj));
_L2:
        h.a(codedoutputstream, "Failed to flush to session begin file.");
        h.a(date, "Failed to close begin session file.");
        throw s;
        s;
        date = null;
        continue; /* Loop/switch isn't completed */
        s;
        date = ((Date) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        date;
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeExternalCrashEvent(SessionEventData sessioneventdata)
        throws IOException
    {
        Object obj1 = null;
        Object obj2 = getCurrentSessionId();
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        CrashlyticsCore.recordFatalExceptionEvent(((String) (obj2)));
        obj = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(((String) (obj2))).append("SessionCrash").toString());
        try
        {
            obj1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (SessionEventData sessioneventdata)
        {
            obj1 = obj;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = obj;
            obj = null;
        }
        obj2 = (new MetaDataStore(filesDir)).readKeyData(((String) (obj2)));
        NativeCrashWriter.writeNativeCrash(sessioneventdata, logFileManager, ((Map) (obj2)), ((CodedOutputStream) (obj1)));
_L4:
        h.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        h.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
        return;
_L2:
        c.h().e("Fabric", "Tried to write a native crash while no session was open.", null);
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        sessioneventdata;
        obj1 = null;
        obj = null;
_L8:
        c.h().e("Fabric", "An error occurred in the native crash logger", sessioneventdata);
        ExceptionUtils.writeStackTraceIfNotNull(sessioneventdata, ((java.io.OutputStream) (obj1)));
        h.a(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        h.a(((java.io.Closeable) (obj1)), "Failed to close fatal exception file output stream.");
        return;
        sessioneventdata;
        obj1 = null;
        obj = null;
_L6:
        h.a(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        h.a(((java.io.Closeable) (obj1)), "Failed to close fatal exception file output stream.");
        throw sessioneventdata;
        sessioneventdata;
        Object obj3 = obj;
        obj = obj1;
        obj1 = obj3;
        continue; /* Loop/switch isn't completed */
        sessioneventdata;
        if (true) goto _L6; else goto _L5
_L5:
        sessioneventdata;
        ClsFileOutputStream clsfileoutputstream = ((ClsFileOutputStream) (obj));
        obj = obj1;
        obj1 = clsfileoutputstream;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void writeFatal(Date date, Thread thread, Throwable throwable)
    {
        CodedOutputStream codedoutputstream;
        ClsFileOutputStream clsfileoutputstream;
        CodedOutputStream codedoutputstream1;
        Object obj1;
        Object obj2;
        codedoutputstream1 = null;
        codedoutputstream = null;
        obj2 = null;
        obj1 = null;
        clsfileoutputstream = null;
        Object obj;
        (new File(filesDir, "crash_marker")).createNewFile();
        obj = getCurrentSessionId();
        if (obj == null) goto _L2; else goto _L1
_L1:
        CrashlyticsCore.recordFatalExceptionEvent(((String) (obj)));
        obj = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(((String) (obj))).append("SessionCrash").toString());
        codedoutputstream = obj2;
        clsfileoutputstream = ((ClsFileOutputStream) (obj));
        codedoutputstream1 = ((CodedOutputStream) (obj1));
        obj1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
        codedoutputstream = ((CodedOutputStream) (obj1));
        clsfileoutputstream = ((ClsFileOutputStream) (obj));
        codedoutputstream1 = ((CodedOutputStream) (obj1));
        writeSessionEvent(((CodedOutputStream) (obj1)), date, thread, throwable, "crash", true);
_L4:
        h.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        h.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
        return;
_L2:
        c.h().e("Fabric", "Tried to write a fatal exception while no session was open.", null);
        obj = null;
        obj1 = clsfileoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
        date;
        obj = null;
_L8:
        codedoutputstream = codedoutputstream1;
        clsfileoutputstream = ((ClsFileOutputStream) (obj));
        c.h().e("Fabric", "An error occurred in the fatal exception logger", date);
        codedoutputstream = codedoutputstream1;
        clsfileoutputstream = ((ClsFileOutputStream) (obj));
        ExceptionUtils.writeStackTraceIfNotNull(date, ((java.io.OutputStream) (obj)));
        h.a(codedoutputstream1, "Failed to flush to session begin file.");
        h.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
        return;
        date;
        clsfileoutputstream = null;
_L6:
        h.a(codedoutputstream, "Failed to flush to session begin file.");
        h.a(clsfileoutputstream, "Failed to close fatal exception file output stream.");
        throw date;
        date;
        if (true) goto _L6; else goto _L5
_L5:
        date;
        if (true) goto _L8; else goto _L7
_L7:
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
                c.h().e("Fabric", (new StringBuilder()).append("Can't find ").append(s1).append(" data for session ID ").append(s).toString(), null);
            } else
            {
                c.h().a("Fabric", (new StringBuilder()).append("Collecting ").append(s1).append(" data for session ID ").append(s).toString());
                writeToCosFromFile(codedoutputstream, afile[0]);
            }
            i++;
        }
    }

    private void writeNonFatalEventsTo(CodedOutputStream codedoutputstream, File afile[], String s)
    {
        Arrays.sort(afile, h.a);
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file = afile[i];
            try
            {
                c.h().a("Fabric", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
                    s, file.getName()
                }));
                writeToCosFromFile(codedoutputstream, file);
            }
            catch (Exception exception)
            {
                c.h().e("Fabric", "Error writting non-fatal to session.", exception);
            }
            i++;
        }
    }

    private void writeSessionApp(String s)
        throws Exception
    {
        Object obj;
        Object obj3;
        String s1;
        String s2;
        obj3 = null;
        s2 = null;
        s1 = null;
        obj = null;
        Object obj2 = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("SessionApp").toString());
        s = s2;
        obj = s1;
        obj3 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj2)));
        s = ((String) (obj3));
        obj = obj3;
        s1 = crashlyticsCore.getPackageName();
        s = ((String) (obj3));
        obj = obj3;
        s2 = crashlyticsCore.getVersionCode();
        s = ((String) (obj3));
        obj = obj3;
        String s3 = crashlyticsCore.getVersionName();
        s = ((String) (obj3));
        obj = obj3;
        String s4 = idManager.b();
        s = ((String) (obj3));
        obj = obj3;
        int i = k.a(crashlyticsCore.getInstallerPackageName()).a();
        s = ((String) (obj3));
        obj = obj3;
        sessionDataWriter.writeSessionApp(((CodedOutputStream) (obj3)), s1, s2, s3, s4, i);
        h.a(((java.io.Flushable) (obj3)), "Failed to flush to session app file.");
        h.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        return;
        obj2;
        s = null;
_L4:
        ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj2)), s);
        throw obj2;
        obj3;
        Object obj1;
        obj2 = s;
        s = ((String) (obj));
        obj1 = obj3;
_L2:
        h.a(s, "Failed to flush to session app file.");
        h.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        throw obj1;
        obj1;
        obj2 = null;
        s = ((String) (obj3));
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        s = ((String) (obj2));
        obj2 = exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeSessionDevice(String s)
        throws Exception
    {
        Object obj;
        Object obj3;
        Context context;
        String s1;
        Object obj4;
        context = null;
        obj3 = null;
        obj4 = null;
        s1 = null;
        obj = null;
        Object obj2 = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("SessionDevice").toString());
        s = ((String) (obj4));
        obj = s1;
        obj3 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj2)));
        s = ((String) (obj3));
        obj = obj3;
        context = crashlyticsCore.getContext();
        s = ((String) (obj3));
        obj = obj3;
        obj4 = new StatFs(Environment.getDataDirectory().getPath());
        s = ((String) (obj3));
        obj = obj3;
        s1 = idManager.f();
        s = ((String) (obj3));
        obj = obj3;
        int i = h.a();
        s = ((String) (obj3));
        obj = obj3;
        int j = Runtime.getRuntime().availableProcessors();
        s = ((String) (obj3));
        obj = obj3;
        long l1 = h.b();
        s = ((String) (obj3));
        obj = obj3;
        long l2 = ((StatFs) (obj4)).getBlockCount();
        s = ((String) (obj3));
        obj = obj3;
        long l3 = ((StatFs) (obj4)).getBlockSize();
        s = ((String) (obj3));
        obj = obj3;
        boolean flag = h.f(context);
        s = ((String) (obj3));
        obj = obj3;
        obj4 = idManager.g();
        s = ((String) (obj3));
        obj = obj3;
        int i1 = h.h(context);
        s = ((String) (obj3));
        obj = obj3;
        sessionDataWriter.writeSessionDevice(((CodedOutputStream) (obj3)), s1, i, Build.MODEL, j, l1, l2 * l3, flag, ((Map) (obj4)), i1, Build.MANUFACTURER, Build.PRODUCT);
        h.a(((java.io.Flushable) (obj3)), "Failed to flush session device info.");
        h.a(((java.io.Closeable) (obj2)), "Failed to close session device file.");
        return;
        obj2;
        s = context;
_L4:
        ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj2)), s);
        throw obj2;
        obj3;
        Object obj1;
        obj2 = s;
        s = ((String) (obj));
        obj1 = obj3;
_L2:
        h.a(s, "Failed to flush session device info.");
        h.a(((java.io.Closeable) (obj2)), "Failed to close session device file.");
        throw obj1;
        obj1;
        obj2 = null;
        s = ((String) (obj3));
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        s = ((String) (obj2));
        obj2 = exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeSessionEvent(CodedOutputStream codedoutputstream, Date date, Thread thread, Throwable throwable, String s, boolean flag)
        throws Exception
    {
        float f;
        Thread athread[];
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        LinkedList linkedlist;
        StackTraceElement astacktraceelement[];
        Context context;
        int j;
        int i1;
        long l1;
        long l2;
        long l3;
        long l4;
        boolean flag1;
        context = crashlyticsCore.getContext();
        l1 = date.getTime() / 1000L;
        f = h.c(context);
        j = h.a(context, powerConnected);
        flag1 = h.d(context);
        i1 = context.getResources().getConfiguration().orientation;
        l2 = h.b();
        l3 = h.b(context);
        l4 = h.b(Environment.getDataDirectory().getPath());
        runningappprocessinfo = h.a(context.getPackageName(), context);
        linkedlist = new LinkedList();
        astacktraceelement = throwable.getStackTrace();
        if (flag)
        {
            Map map = Thread.getAllStackTraces();
            date = new Thread[map.size()];
            Iterator iterator = map.entrySet().iterator();
            int i = 0;
            do
            {
                athread = date;
                if (!iterator.hasNext())
                {
                    break;
                }
                athread = (java.util.Map.Entry)iterator.next();
                date[i] = (Thread)athread.getKey();
                linkedlist.add(athread.getValue());
                i++;
            } while (true);
        } else
        {
            athread = new Thread[0];
        }
        if (h.a(context, "com.crashlytics.CollectCustomKeys", true)) goto _L2; else goto _L1
_L1:
        date = new TreeMap();
_L4:
        sessionDataWriter.writeSessionEvent(codedoutputstream, l1, thread, throwable, s, athread, f, j, flag1, i1, l2 - l3, l4, runningappprocessinfo, linkedlist, astacktraceelement, logFileManager, date);
        return;
_L2:
        date = crashlyticsCore.getAttributes();
        if (date != null && date.size() > 1)
        {
            date = new TreeMap(date);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeSessionOS(String s)
        throws Exception
    {
        Object obj;
        Object obj1;
        CodedOutputStream codedoutputstream;
        Object obj2;
        obj2 = null;
        obj = null;
        codedoutputstream = null;
        obj1 = null;
        ClsFileOutputStream clsfileoutputstream = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("SessionOS").toString());
        s = obj2;
        obj = clsfileoutputstream;
        obj1 = codedoutputstream;
        codedoutputstream = CodedOutputStream.newInstance(clsfileoutputstream);
        s = codedoutputstream;
        obj = clsfileoutputstream;
        obj1 = codedoutputstream;
        boolean flag = h.g(crashlyticsCore.getContext());
        s = codedoutputstream;
        obj = clsfileoutputstream;
        obj1 = codedoutputstream;
        sessionDataWriter.writeSessionOS(codedoutputstream, flag);
        h.a(codedoutputstream, "Failed to flush to session OS file.");
        h.a(clsfileoutputstream, "Failed to close session OS file.");
        return;
        Exception exception1;
        exception1;
        clsfileoutputstream = null;
_L4:
        s = ((String) (obj1));
        obj = clsfileoutputstream;
        ExceptionUtils.writeStackTraceIfNotNull(exception1, clsfileoutputstream);
        s = ((String) (obj1));
        obj = clsfileoutputstream;
        throw exception1;
        Exception exception;
        exception;
        obj1 = obj;
        obj = s;
        s = exception;
_L2:
        h.a(((java.io.Flushable) (obj)), "Failed to flush to session OS file.");
        h.a(((java.io.Closeable) (obj1)), "Failed to close session OS file.");
        throw s;
        s;
        obj1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeSessionPartsToSessionFile(File file, String s, int i)
    {
        Object obj;
        CodedOutputStream codedoutputstream;
        Object obj1;
        codedoutputstream = null;
        c.h().a("Fabric", (new StringBuilder()).append("Collecting session parts for ID ").append(s).toString());
        File afile[] = listFilesMatching(new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionCrash").toString()));
        boolean flag;
        boolean flag1;
        if (afile != null && afile.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.h().a("Fabric", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
            s, Boolean.valueOf(flag)
        }));
        obj1 = listFilesMatching(new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionEvent").toString()));
        if (obj1 != null && obj1.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        c.h().a("Fabric", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
            s, Boolean.valueOf(flag1)
        }));
        if (!flag && !flag1) goto _L2; else goto _L1
_L1:
        obj = new ClsFileOutputStream(filesDir, s);
        codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (obj)));
        c.h().a("Fabric", (new StringBuilder()).append("Collecting SessionStart data for session ID ").append(s).toString());
        writeToCosFromFile(codedoutputstream, file);
        codedoutputstream.writeUInt64(4, (new Date()).getTime() / 1000L);
        codedoutputstream.writeBool(5, flag);
        writeInitialPartsTo(codedoutputstream, s);
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (obj1.length <= i)
        {
            break MISSING_BLOCK_LABEL_639;
        }
        c.h().a("Fabric", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
            Integer.valueOf(i)
        }));
        trimSessionEventFiles(s, i);
        file = listFilesMatching(new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionEvent").toString()));
_L8:
        writeNonFatalEventsTo(codedoutputstream, file, s);
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        writeToCosFromFile(codedoutputstream, afile[0]);
        codedoutputstream.writeUInt32(11, 1);
        codedoutputstream.writeEnum(12, 3);
        h.a(codedoutputstream, "Error flushing session file stream");
        h.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
_L5:
        c.h().a("Fabric", (new StringBuilder()).append("Removing session part files for ID ").append(s).toString());
        deleteSessionPartFilesFor(s);
        return;
        obj1;
        file = null;
        obj = codedoutputstream;
_L7:
        c.h().e("Fabric", (new StringBuilder()).append("Failed to write session file for session ID: ").append(s).toString(), ((Throwable) (obj1)));
        ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj1)), ((java.io.OutputStream) (obj)));
        h.a(file, "Error flushing session file stream");
        closeWithoutRenamingOrLog(((ClsFileOutputStream) (obj)));
          goto _L5
        s;
        file = null;
        obj = null;
_L6:
        h.a(file, "Error flushing session file stream");
        h.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
        throw s;
_L2:
        c.h().a("Fabric", (new StringBuilder()).append("No events present for session ID ").append(s).toString());
          goto _L5
        s;
        file = null;
          goto _L6
        s;
        file = codedoutputstream;
          goto _L6
        s;
          goto _L6
        obj1;
        file = null;
          goto _L7
        obj1;
        file = codedoutputstream;
          goto _L7
        file = ((File) (obj1));
          goto _L8
    }

    private void writeSessionUser(String s)
        throws Exception
    {
        CodedOutputStream codedoutputstream;
        Object obj;
        CodedOutputStream codedoutputstream1;
        CodedOutputStream codedoutputstream2;
        obj = null;
        codedoutputstream = null;
        codedoutputstream2 = null;
        codedoutputstream1 = null;
        ClsFileOutputStream clsfileoutputstream = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("SessionUser").toString());
        codedoutputstream = ((CodedOutputStream) (obj));
        obj = clsfileoutputstream;
        codedoutputstream1 = codedoutputstream2;
        codedoutputstream2 = CodedOutputStream.newInstance(clsfileoutputstream);
        codedoutputstream = codedoutputstream2;
        obj = clsfileoutputstream;
        codedoutputstream1 = codedoutputstream2;
        s = getUserMetaData(s);
        codedoutputstream = codedoutputstream2;
        obj = clsfileoutputstream;
        codedoutputstream1 = codedoutputstream2;
        boolean flag = s.isEmpty();
        if (flag)
        {
            h.a(codedoutputstream2, "Failed to flush session user file.");
            h.a(clsfileoutputstream, "Failed to close session user file.");
            return;
        }
        codedoutputstream = codedoutputstream2;
        obj = clsfileoutputstream;
        codedoutputstream1 = codedoutputstream2;
        sessionDataWriter.writeSessionUser(codedoutputstream2, ((UserMetaData) (s)).id, ((UserMetaData) (s)).name, ((UserMetaData) (s)).email);
        h.a(codedoutputstream2, "Failed to flush session user file.");
        h.a(clsfileoutputstream, "Failed to close session user file.");
        return;
        Exception exception;
        exception;
        s = null;
_L4:
        codedoutputstream = codedoutputstream1;
        obj = s;
        ExceptionUtils.writeStackTraceIfNotNull(exception, s);
        codedoutputstream = codedoutputstream1;
        obj = s;
        throw exception;
        s;
_L2:
        h.a(codedoutputstream, "Failed to flush session user file.");
        h.a(((java.io.Closeable) (obj)), "Failed to close session user file.");
        throw s;
        s;
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        s = clsfileoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeToCosFromFile(CodedOutputStream codedoutputstream, File file)
        throws IOException
    {
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        byte abyte0[] = new byte[(int)file.length()];
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
        h.a(file, "Failed to close file input stream.");
        codedoutputstream.writeRawBytes(abyte0);
        return;
        codedoutputstream;
        file = null;
_L6:
        h.a(file, "Failed to close file input stream.");
        throw codedoutputstream;
_L2:
        c.h().e("Fabric", (new StringBuilder()).append("Tried to include a file that doesn't exist: ").append(file.getName()).toString(), null);
        return;
        codedoutputstream;
        if (true) goto _L6; else goto _L5
_L5:
    }

    void cacheKeyData(final Map keyData)
    {
        executorServiceWrapper.executeAsync(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;
            final Map val$keyData;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                String s = getCurrentSessionId();
                (new MetaDataStore(filesDir)).writeKeyData(s, keyData);
                return null;
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                keyData = map;
                super();
            }
        });
    }

    void cacheUserData(final String userId, final String userName, final String userEmail)
    {
        executorServiceWrapper.executeAsync(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;
            final String val$userEmail;
            final String val$userId;
            final String val$userName;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                String s = getCurrentSessionId();
                (new MetaDataStore(filesDir)).writeUserData(s, new UserMetaData(userId, userName, userEmail));
                return null;
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                userId = s;
                userName = s1;
                userEmail = s2;
                super();
            }
        });
    }

    void cleanInvalidTempFiles()
    {
        executorServiceWrapper.executeAsync(new Runnable() {

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

    void doCleanInvalidTempFiles(File afile[])
    {
        deleteLegacyInvalidCacheDir();
        int i1 = afile.length;
        for (int i = 0; i < i1; i++)
        {
            final String sessionId = afile[i];
            c.h().a("Fabric", (new StringBuilder()).append("Found invalid session part file: ").append(sessionId).toString());
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
            c.h().a("Fabric", (new StringBuilder()).append("Deleting all part files for invalid session: ").append(sessionId).toString());
            File afile1[] = listFilesMatching(filenamefilter);
            int j1 = afile1.length;
            for (int j = 0; j < j1; j++)
            {
                File file = afile1[j];
                c.h().a("Fabric", (new StringBuilder()).append("Deleting session file: ").append(file).toString());
                file.delete();
            }

        }

    }

    void ensureOpenSessionExists()
    {
        executorServiceWrapper.executeAsync(new Callable() {

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
                } else
                {
                    logFileManager.onSessionChange(getCurrentSessionId());
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
        return ((Boolean)executorServiceWrapper.executeSyncLoggingException(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;

            public Boolean call()
                throws Exception
            {
                if (!isHandlingException.get())
                {
                    SessionEventData sessioneventdata = crashlyticsCore.getExternalCrashEventData();
                    if (sessioneventdata != null)
                    {
                        writeExternalCrashEvent(sessioneventdata);
                    }
                    doCloseSessions();
                    doOpenSession();
                    c.h().a("Fabric", "Open sessions were closed and a new session was opened.");
                    return Boolean.valueOf(true);
                } else
                {
                    c.h().a("Fabric", "Skipping session finalization because a crash has already occurred.");
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

    void trimSessionFiles()
    {
        Utils.capFileCount(filesDir, SESSION_FILE_FILTER, 4, SMALLEST_FILE_NAME_FIRST);
    }

    public void uncaughtException(final Thread thread, final Throwable ex)
    {
        this;
        JVM INSTR monitorenter ;
        isHandlingException.set(true);
        c.h().a("Fabric", (new StringBuilder()).append("Crashlytics is handling uncaught exception \"").append(ex).append("\" from thread ").append(thread.getName()).toString());
        if (!receiversRegistered.getAndSet(true))
        {
            c.h().a("Fabric", "Unregistering power receivers.");
            Context context = crashlyticsCore.getContext();
            context.unregisterReceiver(powerConnectedReceiver);
            context.unregisterReceiver(powerDisconnectedReceiver);
        }
        final Date now = new Date();
        executorServiceWrapper.executeSyncLoggingException(new Callable() {

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
        c.h().a("Fabric", "Crashlytics completed exception processing. Invoking default exception handler.");
        defaultHandler.uncaughtException(thread, ex);
        isHandlingException.set(false);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        c.h().e("Fabric", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
        c.h().a("Fabric", "Crashlytics completed exception processing. Invoking default exception handler.");
        defaultHandler.uncaughtException(thread, ex);
        isHandlingException.set(false);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        throw thread;
        obj;
        c.h().a("Fabric", "Crashlytics completed exception processing. Invoking default exception handler.");
        defaultHandler.uncaughtException(thread, ex);
        isHandlingException.set(false);
        throw obj;
    }

    void writeNonFatalException(final Thread thread, final Throwable ex)
    {
        final Date now = new Date();
        executorServiceWrapper.executeAsync(new Runnable() {

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
        executorServiceWrapper.executeAsync(new Callable() {

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
                    logFileManager.writeToLog(timestamp, msg);
                }
                return null;
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                timestamp = l1;
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
