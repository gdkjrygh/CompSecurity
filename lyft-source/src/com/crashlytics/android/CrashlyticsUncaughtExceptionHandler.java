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
import android.os.StatFs;
import com.crashlytics.android.internal.models.SessionEventData;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
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

// Referenced classes of package com.crashlytics.android:
//            Crashlytics, LogFileManager, ClsFileOutputStream, CodedOutputStream, 
//            SessionDataWriter, CrashlyticsListener, NativeCrashWriter, ExceptionUtils, 
//            Utils, CLSUUID, CrashlyticsExecutorServiceWrapper, ReportUploader, 
//            SessionReport

class CrashlyticsUncaughtExceptionHandler
    implements Thread.UncaughtExceptionHandler
{

    static final FilenameFilter a = new FilenameFilter() {

        public boolean accept(File file, String s1)
        {
            return s1.length() == ".cls".length() + 35 && s1.endsWith(".cls");
        }

    };
    static final Comparator b = new Comparator() {

        public int a(File file, File file1)
        {
            return file1.getName().compareTo(file.getName());
        }

        public int compare(Object obj, Object obj1)
        {
            return a((File)obj, (File)obj1);
        }

    };
    static final Comparator c = new Comparator() {

        public int a(File file, File file1)
        {
            return file.getName().compareTo(file1.getName());
        }

        public int compare(Object obj, Object obj1)
        {
            return a((File)obj, (File)obj1);
        }

    };
    static final FilenameFilter d = new FilenameFilter() {

        public boolean accept(File file, String s1)
        {
            return CrashlyticsUncaughtExceptionHandler.h().matcher(s1).matches();
        }

    };
    private static final Pattern e = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map f = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final Thread.UncaughtExceptionHandler i;
    private final File j;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final BroadcastReceiver l = new BroadcastReceiver() {

        final CrashlyticsUncaughtExceptionHandler a;

        public void onReceive(Context context, Intent intent)
        {
            CrashlyticsUncaughtExceptionHandler.a(a, false);
        }

            
            {
                a = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
    };
    private final BroadcastReceiver m = new BroadcastReceiver() {

        final CrashlyticsUncaughtExceptionHandler a;

        public void onReceive(Context context, Intent intent)
        {
            CrashlyticsUncaughtExceptionHandler.a(a, true);
        }

            
            {
                a = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
    };
    private final CrashlyticsExecutorServiceWrapper n;
    private final IdManager o;
    private boolean p;
    private final Crashlytics q;
    private final LogFileManager r;
    private final SessionDataWriter s;

    CrashlyticsUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashlyticsListener crashlyticslistener, CrashlyticsExecutorServiceWrapper crashlyticsexecutorservicewrapper, IdManager idmanager, SessionDataWriter sessiondatawriter, Crashlytics crashlytics)
    {
        i = uncaughtexceptionhandler;
        n = crashlyticsexecutorservicewrapper;
        o = idmanager;
        q = crashlytics;
        s = sessiondatawriter;
        j = crashlytics.u();
        r = new LogFileManager(crashlytics.C(), j);
        a(crashlyticslistener);
        uncaughtexceptionhandler = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        crashlyticslistener = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        crashlyticsexecutorservicewrapper = crashlytics.C();
        crashlyticsexecutorservicewrapper.registerReceiver(m, uncaughtexceptionhandler);
        crashlyticsexecutorservicewrapper.registerReceiver(l, crashlyticslistener);
        h.set(true);
    }

    private String a(File file)
    {
        return file.getName().substring(0, 35);
    }

    static AtomicBoolean a(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        return crashlyticsuncaughtexceptionhandler.k;
    }

    private void a(int i1)
    {
        boolean flag = false;
        HashSet hashset = new HashSet();
        File afile[] = e();
        Arrays.sort(afile, b);
        int j1 = Math.min(i1, afile.length);
        for (i1 = 0; i1 < j1; i1++)
        {
            hashset.add(a(afile[i1]));
        }

        afile = a(((FilenameFilter) (new AnySessionPartFileFilter())));
        j1 = afile.length;
        for (i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
        {
            File file = afile[i1];
            String s1 = file.getName();
            Matcher matcher = e.matcher(s1);
            matcher.matches();
            if (!hashset.contains(matcher.group(1)))
            {
                Fabric.g().a("Fabric", (new StringBuilder()).append("Trimming open session file: ").append(s1).toString());
                file.delete();
            }
        }

    }

    private void a(ClsFileOutputStream clsfileoutputstream)
    {
        if (clsfileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        clsfileoutputstream.a();
        return;
        clsfileoutputstream;
        Fabric.g().d("Fabric", "Error closing session file stream in the presence of an exception", clsfileoutputstream);
        return;
    }

    private void a(CodedOutputStream codedoutputstream, File file)
    {
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        byte abyte0[] = new byte[(int)file.length()];
        file = new FileInputStream(file);
        int i1 = 0;
_L4:
        int j1;
        if (i1 >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = file.read(abyte0, i1, abyte0.length - i1);
        if (j1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 += j1;
        if (true) goto _L4; else goto _L3
_L3:
        CommonUtils.a(file, "Failed to close file input stream.");
        codedoutputstream.a(abyte0);
        return;
        codedoutputstream;
        file = null;
_L6:
        CommonUtils.a(file, "Failed to close file input stream.");
        throw codedoutputstream;
_L2:
        Fabric.g().d("Fabric", (new StringBuilder()).append("Tried to include a file that doesn't exist: ").append(file.getName()).toString(), null);
        return;
        codedoutputstream;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(CodedOutputStream codedoutputstream, String s1)
    {
        String as[] = new String[4];
        as[0] = "SessionUser";
        as[1] = "SessionApp";
        as[2] = "SessionOS";
        as[3] = "SessionDevice";
        int j1 = as.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            String s2 = as[i1];
            File afile[] = a(((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(s1).append(s2).toString()))));
            if (afile.length == 0)
            {
                Fabric.g().d("Fabric", (new StringBuilder()).append("Can't find ").append(s2).append(" data for session ID ").append(s1).toString(), null);
            } else
            {
                Fabric.g().a("Fabric", (new StringBuilder()).append("Collecting ").append(s2).append(" data for session ID ").append(s1).toString());
                a(codedoutputstream, afile[0]);
            }
            i1++;
        }
    }

    private void a(CodedOutputStream codedoutputstream, Date date, Thread thread, Throwable throwable, String s1, boolean flag)
    {
        float f1;
        Thread athread[];
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        LinkedList linkedlist;
        StackTraceElement astacktraceelement[];
        Context context;
        int j1;
        int k1;
        long l1;
        long l2;
        long l3;
        long l4;
        boolean flag1;
        context = q.C();
        l1 = date.getTime() / 1000L;
        f1 = CommonUtils.c(context);
        j1 = CommonUtils.a(context, p);
        flag1 = CommonUtils.d(context);
        k1 = context.getResources().getConfiguration().orientation;
        l2 = CommonUtils.b();
        l3 = CommonUtils.b(context);
        l4 = CommonUtils.b(Environment.getDataDirectory().getPath());
        runningappprocessinfo = CommonUtils.a(context.getPackageName(), context);
        linkedlist = new LinkedList();
        astacktraceelement = throwable.getStackTrace();
        if (flag)
        {
            Map map = Thread.getAllStackTraces();
            date = new Thread[map.size()];
            Iterator iterator = map.entrySet().iterator();
            int i1 = 0;
            do
            {
                athread = date;
                if (!iterator.hasNext())
                {
                    break;
                }
                athread = (java.util.Map.Entry)iterator.next();
                date[i1] = (Thread)athread.getKey();
                linkedlist.add(athread.getValue());
                i1++;
            } while (true);
        } else
        {
            athread = new Thread[0];
        }
        if (CommonUtils.a(context, "com.crashlytics.CollectCustomKeys", true)) goto _L2; else goto _L1
_L1:
        date = new TreeMap();
_L4:
        s.a(codedoutputstream, l1, thread, throwable, s1, athread, f1, j1, flag1, k1, l2 - l3, l4, runningappprocessinfo, linkedlist, astacktraceelement, r, date);
        return;
_L2:
        date = q.g();
        if (date != null && date.size() > 1)
        {
            date = new TreeMap(date);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(CodedOutputStream codedoutputstream, File afile[], String s1)
    {
        Arrays.sort(afile, CommonUtils.a);
        int j1 = afile.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            File file = afile[i1];
            try
            {
                Fabric.g().a("Fabric", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
                    s1, file.getName()
                }));
                a(codedoutputstream, file);
            }
            catch (Exception exception)
            {
                Fabric.g().d("Fabric", "Error writting non-fatal to session.", exception);
            }
            i1++;
        }
    }

    private void a(CrashlyticsListener crashlyticslistener)
    {
        Fabric.g().a("Fabric", "Checking for previous crash marker.");
        File file = new File(q.u(), "crash_marker");
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        file.delete();
        if (crashlyticslistener == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        crashlyticslistener.a();
        return;
        crashlyticslistener;
        Fabric.g().d("Fabric", "Exception thrown by CrashlyticsListener while notifying of previous crash.", crashlyticslistener);
        return;
    }

    static void a(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, SessionEventData sessioneventdata)
    {
        crashlyticsuncaughtexceptionhandler.a(sessioneventdata);
    }

    static void a(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, Date date, Thread thread, Throwable throwable)
    {
        crashlyticsuncaughtexceptionhandler.a(date, thread, throwable);
    }

    private void a(SessionEventData sessioneventdata)
    {
        Object obj1 = null;
        Object obj = j();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Crashlytics.f(((String) (obj)));
        obj = new ClsFileOutputStream(j, (new StringBuilder()).append(((String) (obj))).append("SessionCrash").toString());
        try
        {
            obj1 = CodedOutputStream.a(((java.io.OutputStream) (obj)));
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
        NativeCrashWriter.a(sessioneventdata, ((CodedOutputStream) (obj1)));
_L4:
        CommonUtils.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
        return;
_L2:
        Fabric.g().d("Fabric", "Tried to write a native crash while no session was open.", null);
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        sessioneventdata;
        obj1 = null;
        obj = null;
_L8:
        Fabric.g().d("Fabric", "An error occurred in the native crash logger", sessioneventdata);
        ExceptionUtils.a(sessioneventdata, ((java.io.OutputStream) (obj1)));
        CommonUtils.a(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close fatal exception file output stream.");
        return;
        sessioneventdata;
        obj1 = null;
        obj = null;
_L6:
        CommonUtils.a(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close fatal exception file output stream.");
        throw sessioneventdata;
        sessioneventdata;
        Object obj2 = obj;
        obj = obj1;
        obj1 = obj2;
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

    private void a(File file, String s1, int i1)
    {
        Object obj;
        CodedOutputStream codedoutputstream;
        Object obj1;
        codedoutputstream = null;
        Fabric.g().a("Fabric", (new StringBuilder()).append("Collecting session parts for ID ").append(s1).toString());
        File afile[] = a(((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(s1).append("SessionCrash").toString()))));
        boolean flag;
        boolean flag1;
        if (afile != null && afile.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Fabric.g().a("Fabric", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
            s1, Boolean.valueOf(flag)
        }));
        obj1 = a(((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(s1).append("SessionEvent").toString()))));
        if (obj1 != null && obj1.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Fabric.g().a("Fabric", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
            s1, Boolean.valueOf(flag1)
        }));
        if (!flag && !flag1) goto _L2; else goto _L1
_L1:
        obj = new ClsFileOutputStream(j, s1);
        codedoutputstream = CodedOutputStream.a(((java.io.OutputStream) (obj)));
        Fabric.g().a("Fabric", (new StringBuilder()).append("Collecting SessionStart data for session ID ").append(s1).toString());
        a(codedoutputstream, file);
        codedoutputstream.a(4, (new Date()).getTime() / 1000L);
        codedoutputstream.a(5, flag);
        a(codedoutputstream, s1);
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (obj1.length <= i1)
        {
            break MISSING_BLOCK_LABEL_642;
        }
        Fabric.g().a("Fabric", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
            Integer.valueOf(i1)
        }));
        a(s1, i1);
        file = a(((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(s1).append("SessionEvent").toString()))));
_L8:
        a(codedoutputstream, ((File []) (file)), s1);
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_408;
        }
        a(codedoutputstream, afile[0]);
        codedoutputstream.a(11, 1);
        codedoutputstream.b(12, 3);
        CommonUtils.a(codedoutputstream, "Error flushing session file stream");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
_L5:
        Fabric.g().a("Fabric", (new StringBuilder()).append("Removing session part files for ID ").append(s1).toString());
        a(s1);
        return;
        obj1;
        file = null;
        obj = codedoutputstream;
_L7:
        Fabric.g().d("Fabric", (new StringBuilder()).append("Failed to write session file for session ID: ").append(s1).toString(), ((Throwable) (obj1)));
        ExceptionUtils.a(((Throwable) (obj1)), ((java.io.OutputStream) (obj)));
        CommonUtils.a(file, "Error flushing session file stream");
        a(((ClsFileOutputStream) (obj)));
          goto _L5
        s1;
        file = null;
        obj = null;
_L6:
        CommonUtils.a(file, "Error flushing session file stream");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
        throw s1;
_L2:
        Fabric.g().a("Fabric", (new StringBuilder()).append("No events present for session ID ").append(s1).toString());
          goto _L5
        s1;
        file = null;
          goto _L6
        s1;
        file = codedoutputstream;
          goto _L6
        s1;
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

    private void a(String s1)
    {
        s1 = b(s1);
        int j1 = s1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            s1[i1].delete();
        }

    }

    private void a(String s1, int i1)
    {
        Utils.a(j, new FileNameContainsFilter((new StringBuilder()).append(s1).append("SessionEvent").toString()), i1, c);
    }

    private void a(String s1, Date date)
    {
        CodedOutputStream codedoutputstream;
        CodedOutputStream codedoutputstream1;
        CodedOutputStream codedoutputstream2;
        String s2;
        codedoutputstream = null;
        s2 = null;
        codedoutputstream2 = null;
        codedoutputstream1 = null;
        Object obj = new ClsFileOutputStream(j, (new StringBuilder()).append(s1).append("BeginSession").toString());
        codedoutputstream = s2;
        codedoutputstream1 = codedoutputstream2;
        codedoutputstream2 = CodedOutputStream.a(((java.io.OutputStream) (obj)));
        codedoutputstream = codedoutputstream2;
        codedoutputstream1 = codedoutputstream2;
        s2 = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
            q.d()
        });
        codedoutputstream = codedoutputstream2;
        codedoutputstream1 = codedoutputstream2;
        long l1 = date.getTime() / 1000L;
        codedoutputstream = codedoutputstream2;
        codedoutputstream1 = codedoutputstream2;
        s.a(codedoutputstream2, s1, s2, l1);
        CommonUtils.a(codedoutputstream2, "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close begin session file.");
        return;
        date;
        s1 = null;
_L4:
        ExceptionUtils.a(date, s1);
        throw date;
        obj;
        date = s1;
        codedoutputstream = codedoutputstream1;
        s1 = ((String) (obj));
_L2:
        CommonUtils.a(codedoutputstream, "Failed to flush to session begin file.");
        CommonUtils.a(date, "Failed to close begin session file.");
        throw s1;
        s1;
        date = null;
        continue; /* Loop/switch isn't completed */
        s1;
        date = ((Date) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        date;
        s1 = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(Date date, Thread thread, Throwable throwable)
    {
        b(date, thread, throwable);
        l();
        k();
        f();
        if (!q.v())
        {
            o();
        }
    }

    static boolean a(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, boolean flag)
    {
        crashlyticsuncaughtexceptionhandler.p = flag;
        return flag;
    }

    static File[] a(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, FilenameFilter filenamefilter)
    {
        return crashlyticsuncaughtexceptionhandler.a(filenamefilter);
    }

    private File[] a(FilenameFilter filenamefilter)
    {
        return b(j.listFiles(filenamefilter));
    }

    static LogFileManager b(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        return crashlyticsuncaughtexceptionhandler.r;
    }

    static void b(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, Date date, Thread thread, Throwable throwable)
    {
        crashlyticsuncaughtexceptionhandler.c(date, thread, throwable);
    }

    private void b(Date date, Thread thread, Throwable throwable)
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
        (new File(j, "crash_marker")).createNewFile();
        obj = j();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Crashlytics.f(((String) (obj)));
        obj = new ClsFileOutputStream(j, (new StringBuilder()).append(((String) (obj))).append("SessionCrash").toString());
        codedoutputstream = obj2;
        clsfileoutputstream = ((ClsFileOutputStream) (obj));
        codedoutputstream1 = ((CodedOutputStream) (obj1));
        obj1 = CodedOutputStream.a(((java.io.OutputStream) (obj)));
        codedoutputstream = ((CodedOutputStream) (obj1));
        clsfileoutputstream = ((ClsFileOutputStream) (obj));
        codedoutputstream1 = ((CodedOutputStream) (obj1));
        a(((CodedOutputStream) (obj1)), date, thread, throwable, "crash", true);
_L4:
        CommonUtils.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
        return;
_L2:
        Fabric.g().d("Fabric", "Tried to write a fatal exception while no session was open.", null);
        obj = null;
        obj1 = clsfileoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
        date;
        obj = null;
_L8:
        codedoutputstream = codedoutputstream1;
        clsfileoutputstream = ((ClsFileOutputStream) (obj));
        Fabric.g().d("Fabric", "An error occurred in the fatal exception logger", date);
        codedoutputstream = codedoutputstream1;
        clsfileoutputstream = ((ClsFileOutputStream) (obj));
        ExceptionUtils.a(date, ((java.io.OutputStream) (obj)));
        CommonUtils.a(codedoutputstream1, "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
        return;
        date;
        clsfileoutputstream = null;
_L6:
        CommonUtils.a(codedoutputstream, "Failed to flush to session begin file.");
        CommonUtils.a(clsfileoutputstream, "Failed to close fatal exception file output stream.");
        throw date;
        date;
        if (true) goto _L6; else goto _L5
_L5:
        date;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private File[] b(String s1)
    {
        return a(new SessionPartFileFilter(s1));
    }

    private File[] b(File afile[])
    {
        File afile1[] = afile;
        if (afile == null)
        {
            afile1 = new File[0];
        }
        return afile1;
    }

    static void c(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        crashlyticsuncaughtexceptionhandler.k();
    }

    private void c(String s1)
    {
        Object obj;
        Object obj3;
        String s2;
        String s3;
        obj3 = null;
        s3 = null;
        s2 = null;
        obj = null;
        Object obj2 = new ClsFileOutputStream(j, (new StringBuilder()).append(s1).append("SessionApp").toString());
        s1 = s3;
        obj = s2;
        obj3 = CodedOutputStream.a(((java.io.OutputStream) (obj2)));
        s1 = ((String) (obj3));
        obj = obj3;
        s2 = q.h();
        s1 = ((String) (obj3));
        obj = obj3;
        s3 = q.k();
        s1 = ((String) (obj3));
        obj = obj3;
        String s4 = q.j();
        s1 = ((String) (obj3));
        obj = obj3;
        String s5 = o.b();
        s1 = ((String) (obj3));
        obj = obj3;
        int i1 = DeliveryMechanism.a(q.i()).a();
        s1 = ((String) (obj3));
        obj = obj3;
        s.a(((CodedOutputStream) (obj3)), s2, s3, s4, s5, i1);
        CommonUtils.a(((java.io.Flushable) (obj3)), "Failed to flush to session app file.");
        CommonUtils.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        return;
        obj2;
        s1 = null;
_L4:
        ExceptionUtils.a(((Throwable) (obj2)), s1);
        throw obj2;
        obj3;
        Object obj1;
        obj2 = s1;
        s1 = ((String) (obj));
        obj1 = obj3;
_L2:
        CommonUtils.a(s1, "Failed to flush to session app file.");
        CommonUtils.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        throw obj1;
        obj1;
        obj2 = null;
        s1 = ((String) (obj3));
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        s1 = ((String) (obj2));
        obj2 = exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c(Date date, Thread thread, Throwable throwable)
    {
        CodedOutputStream codedoutputstream;
        CodedOutputStream codedoutputstream1;
        CodedOutputStream codedoutputstream2;
        Object obj1;
        String s1;
        codedoutputstream = null;
        obj1 = null;
        codedoutputstream2 = null;
        codedoutputstream1 = null;
        s1 = j();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        Crashlytics.e(s1);
        Object obj;
        Fabric.g().a("Fabric", (new StringBuilder()).append("Crashlytics is logging non-fatal exception \"").append(throwable).append("\" from thread ").append(thread.getName()).toString());
        obj = CommonUtils.a(g.getAndIncrement());
        obj = (new StringBuilder()).append(s1).append("SessionEvent").append(((String) (obj))).toString();
        obj = new ClsFileOutputStream(j, ((String) (obj)));
        codedoutputstream = obj1;
        codedoutputstream1 = codedoutputstream2;
        codedoutputstream2 = CodedOutputStream.a(((java.io.OutputStream) (obj)));
        codedoutputstream = codedoutputstream2;
        codedoutputstream1 = codedoutputstream2;
        a(codedoutputstream2, date, thread, throwable, "error", false);
        CommonUtils.a(codedoutputstream2, "Failed to flush to non-fatal file.");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close non-fatal file output stream.");
        break MISSING_BLOCK_LABEL_179;
        thread;
        date = null;
_L6:
        Fabric.g().d("Fabric", "An error occurred in the non-fatal exception logger", thread);
        ExceptionUtils.a(thread, date);
        CommonUtils.a(codedoutputstream1, "Failed to flush to non-fatal file.");
        CommonUtils.a(date, "Failed to close non-fatal file output stream.");
          goto _L3
        thread;
        date = null;
_L5:
        CommonUtils.a(codedoutputstream, "Failed to flush to non-fatal file.");
        CommonUtils.a(date, "Failed to close non-fatal file output stream.");
        throw thread;
_L3:
        try
        {
            a(s1, 64);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            Fabric.g().d("Fabric", "An error occurred when trimming non-fatal files.", date);
        }
        return;
_L2:
        Fabric.g().d("Fabric", "Tried to write a non-fatal exception while no session was open.", null);
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

    static Crashlytics d(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        return crashlyticsuncaughtexceptionhandler.q;
    }

    private void d(String s1)
    {
        Object obj;
        Object obj1;
        CodedOutputStream codedoutputstream;
        Object obj2;
        obj2 = null;
        obj = null;
        codedoutputstream = null;
        obj1 = null;
        ClsFileOutputStream clsfileoutputstream = new ClsFileOutputStream(j, (new StringBuilder()).append(s1).append("SessionOS").toString());
        s1 = obj2;
        obj = clsfileoutputstream;
        obj1 = codedoutputstream;
        codedoutputstream = CodedOutputStream.a(clsfileoutputstream);
        s1 = codedoutputstream;
        obj = clsfileoutputstream;
        obj1 = codedoutputstream;
        boolean flag = CommonUtils.g(q.C());
        s1 = codedoutputstream;
        obj = clsfileoutputstream;
        obj1 = codedoutputstream;
        s.a(codedoutputstream, flag);
        CommonUtils.a(codedoutputstream, "Failed to flush to session OS file.");
        CommonUtils.a(clsfileoutputstream, "Failed to close session OS file.");
        return;
        Exception exception1;
        exception1;
        clsfileoutputstream = null;
_L4:
        s1 = ((String) (obj1));
        obj = clsfileoutputstream;
        ExceptionUtils.a(exception1, clsfileoutputstream);
        s1 = ((String) (obj1));
        obj = clsfileoutputstream;
        throw exception1;
        Exception exception;
        exception;
        obj1 = obj;
        obj = s1;
        s1 = exception;
_L2:
        CommonUtils.a(((java.io.Flushable) (obj)), "Failed to flush to session OS file.");
        CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close session OS file.");
        throw s1;
        s1;
        obj1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void e(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        crashlyticsuncaughtexceptionhandler.l();
    }

    private void e(String s1)
    {
        Object obj;
        Object obj3;
        Context context;
        String s2;
        Object obj4;
        context = null;
        obj3 = null;
        obj4 = null;
        s2 = null;
        obj = null;
        Object obj2 = new ClsFileOutputStream(j, (new StringBuilder()).append(s1).append("SessionDevice").toString());
        s1 = ((String) (obj4));
        obj = s2;
        obj3 = CodedOutputStream.a(((java.io.OutputStream) (obj2)));
        s1 = ((String) (obj3));
        obj = obj3;
        context = q.C();
        s1 = ((String) (obj3));
        obj = obj3;
        obj4 = new StatFs(Environment.getDataDirectory().getPath());
        s1 = ((String) (obj3));
        obj = obj3;
        s2 = o.f();
        s1 = ((String) (obj3));
        obj = obj3;
        int i1 = CommonUtils.a();
        s1 = ((String) (obj3));
        obj = obj3;
        int j1 = Runtime.getRuntime().availableProcessors();
        s1 = ((String) (obj3));
        obj = obj3;
        long l1 = CommonUtils.b();
        s1 = ((String) (obj3));
        obj = obj3;
        long l2 = ((StatFs) (obj4)).getBlockCount();
        s1 = ((String) (obj3));
        obj = obj3;
        long l3 = ((StatFs) (obj4)).getBlockSize();
        s1 = ((String) (obj3));
        obj = obj3;
        boolean flag = CommonUtils.f(context);
        s1 = ((String) (obj3));
        obj = obj3;
        obj4 = o.g();
        s1 = ((String) (obj3));
        obj = obj3;
        int k1 = CommonUtils.h(context);
        s1 = ((String) (obj3));
        obj = obj3;
        s.a(((CodedOutputStream) (obj3)), s2, i1, Build.MODEL, j1, l1, l2 * l3, flag, ((Map) (obj4)), k1, Build.MANUFACTURER, Build.PRODUCT);
        CommonUtils.a(((java.io.Flushable) (obj3)), "Failed to flush session device info.");
        CommonUtils.a(((java.io.Closeable) (obj2)), "Failed to close session device file.");
        return;
        obj2;
        s1 = context;
_L4:
        ExceptionUtils.a(((Throwable) (obj2)), s1);
        throw obj2;
        obj3;
        Object obj1;
        obj2 = s1;
        s1 = ((String) (obj));
        obj1 = obj3;
_L2:
        CommonUtils.a(s1, "Failed to flush session device info.");
        CommonUtils.a(((java.io.Closeable) (obj2)), "Failed to close session device file.");
        throw obj1;
        obj1;
        obj2 = null;
        s1 = ((String) (obj3));
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        s1 = ((String) (obj2));
        obj2 = exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void f(String s1)
    {
        Object obj;
        Object obj1;
        CodedOutputStream codedoutputstream;
        String s2;
        s2 = null;
        obj = null;
        codedoutputstream = null;
        obj1 = null;
        ClsFileOutputStream clsfileoutputstream = new ClsFileOutputStream(j, (new StringBuilder()).append(s1).append("SessionUser").toString());
        s1 = s2;
        obj = clsfileoutputstream;
        obj1 = codedoutputstream;
        codedoutputstream = CodedOutputStream.a(clsfileoutputstream);
        s1 = codedoutputstream;
        obj = clsfileoutputstream;
        obj1 = codedoutputstream;
        s2 = q.n();
        s1 = codedoutputstream;
        obj = clsfileoutputstream;
        obj1 = codedoutputstream;
        String s3 = q.p();
        s1 = codedoutputstream;
        obj = clsfileoutputstream;
        obj1 = codedoutputstream;
        String s4 = q.o();
        if (s2 == null && s3 == null && s4 == null)
        {
            CommonUtils.a(codedoutputstream, "Failed to flush session user file.");
            CommonUtils.a(clsfileoutputstream, "Failed to close session user file.");
            return;
        }
        s1 = codedoutputstream;
        obj = clsfileoutputstream;
        obj1 = codedoutputstream;
        s.a(codedoutputstream, s2, s3, s4);
        CommonUtils.a(codedoutputstream, "Failed to flush session user file.");
        CommonUtils.a(clsfileoutputstream, "Failed to close session user file.");
        return;
        Exception exception1;
        exception1;
        clsfileoutputstream = null;
_L4:
        s1 = ((String) (obj1));
        obj = clsfileoutputstream;
        ExceptionUtils.a(exception1, clsfileoutputstream);
        s1 = ((String) (obj1));
        obj = clsfileoutputstream;
        throw exception1;
        Exception exception;
        exception;
        obj1 = obj;
        obj = s1;
        s1 = exception;
_L2:
        CommonUtils.a(((java.io.Flushable) (obj)), "Failed to flush session user file.");
        CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close session user file.");
        throw s1;
        s1;
        obj1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static Pattern h()
    {
        return e;
    }

    static Map i()
    {
        return f;
    }

    private String j()
    {
        File afile[] = a(new FileNameContainsFilter("BeginSession"));
        Arrays.sort(afile, b);
        if (afile.length > 0)
        {
            return a(afile[0]);
        } else
        {
            return null;
        }
    }

    private void k()
    {
        Date date = new Date();
        String s1 = (new CLSUUID(o)).toString();
        Fabric.g().a("Fabric", (new StringBuilder()).append("Opening an new session with ID ").append(s1).toString());
        a(s1, date);
        c(s1);
        d(s1);
        e(s1);
    }

    private void l()
    {
        a(8);
        Object obj = j();
        if (obj != null)
        {
            f(((String) (obj)));
            obj = q.y();
            if (obj != null)
            {
                int j1 = ((SessionSettingsData) (obj)).c;
                Fabric.g().a("Fabric", "Closing all open sessions.");
                File afile[] = e();
                if (afile != null && afile.length > 0)
                {
                    int k1 = afile.length;
                    for (int i1 = 0; i1 < k1; i1++)
                    {
                        File file = afile[i1];
                        String s1 = a(file);
                        Fabric.g().a("Fabric", (new StringBuilder()).append("Closing session: ").append(s1).toString());
                        a(file, s1, j1);
                    }

                }
            } else
            {
                Fabric.g().a("Fabric", "Unable to close session. Settings are not loaded.");
            }
            return;
        } else
        {
            Fabric.g().a("Fabric", "No open sessions exist.");
            return;
        }
    }

    private File[] m()
    {
        return a(a);
    }

    private void n()
    {
        File file = new File(q.u(), "invalidClsFiles");
        if (file.exists())
        {
            if (file.isDirectory())
            {
                File afile[] = file.listFiles();
                int j1 = afile.length;
                for (int i1 = 0; i1 < j1; i1++)
                {
                    afile[i1].delete();
                }

            }
            file.delete();
        }
    }

    private void o()
    {
        File afile[] = m();
        int j1 = afile.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            File file = afile[i1];
            n.a(new Runnable(file) {

                final File a;
                final CrashlyticsUncaughtExceptionHandler b;

                public void run()
                {
                    if (CommonUtils.n(CrashlyticsUncaughtExceptionHandler.d(b).C()))
                    {
                        Fabric.g().a("Fabric", "Attempting to send crash report at time of crash...");
                        Object obj = Settings.a().b();
                        obj = CrashlyticsUncaughtExceptionHandler.d(b).a(((io.fabric.sdk.android.services.settings.SettingsData) (obj)));
                        if (obj != null)
                        {
                            (new ReportUploader(((CreateReportSpiCall) (obj)))).a(new SessionReport(a, CrashlyticsUncaughtExceptionHandler.i()));
                        }
                    }
                }

            
            {
                b = CrashlyticsUncaughtExceptionHandler.this;
                a = file;
                super();
            }
            });
        }

    }

    void a(long l1, String s1)
    {
        n.b(new Callable(l1, s1) {

            final long a;
            final String b;
            final CrashlyticsUncaughtExceptionHandler c;

            public Void a()
            {
                if (!CrashlyticsUncaughtExceptionHandler.a(c).get())
                {
                    CrashlyticsUncaughtExceptionHandler.b(c).a(a, b);
                }
                return null;
            }

            public Object call()
            {
                return a();
            }

            
            {
                c = CrashlyticsUncaughtExceptionHandler.this;
                a = l1;
                b = s1;
                super();
            }
        });
    }

    void a(Thread thread, Throwable throwable)
    {
        Date date = new Date();
        n.a(new Runnable(date, thread, throwable) {

            final Date a;
            final Thread b;
            final Throwable c;
            final CrashlyticsUncaughtExceptionHandler d;

            public void run()
            {
                if (!CrashlyticsUncaughtExceptionHandler.a(d).get())
                {
                    CrashlyticsUncaughtExceptionHandler.b(d, a, b, c);
                }
            }

            
            {
                d = CrashlyticsUncaughtExceptionHandler.this;
                a = date;
                b = thread;
                c = throwable;
                super();
            }
        });
    }

    void a(File afile[])
    {
        n();
        int k1 = afile.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            Object obj = afile[i1];
            Fabric.g().a("Fabric", (new StringBuilder()).append("Found invalid session part file: ").append(obj).toString());
            obj = a(((File) (obj)));
            FilenameFilter filenamefilter = new FilenameFilter(((String) (obj))) {

                final String a;
                final CrashlyticsUncaughtExceptionHandler b;

                public boolean accept(File file1, String s1)
                {
                    return s1.startsWith(a);
                }

            
            {
                b = CrashlyticsUncaughtExceptionHandler.this;
                a = s1;
                super();
            }
            };
            Fabric.g().a("Fabric", (new StringBuilder()).append("Deleting all part files for invalid session: ").append(((String) (obj))).toString());
            File afile1[] = a(filenamefilter);
            int l1 = afile1.length;
            for (int j1 = 0; j1 < l1; j1++)
            {
                File file = afile1[j1];
                Fabric.g().a("Fabric", (new StringBuilder()).append("Deleting session file: ").append(file).toString());
                file.delete();
            }

        }

    }

    boolean a()
    {
        return k.get();
    }

    void b()
    {
        n.b(new Callable() {

            final CrashlyticsUncaughtExceptionHandler a;

            public Void a()
            {
                if (!a.c())
                {
                    CrashlyticsUncaughtExceptionHandler.c(a);
                }
                return null;
            }

            public Object call()
            {
                return a();
            }

            
            {
                a = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
        });
    }

    boolean c()
    {
        return e().length > 0;
    }

    boolean d()
    {
        return ((Boolean)n.a(new Callable() {

            final CrashlyticsUncaughtExceptionHandler a;

            public Boolean a()
            {
                if (!CrashlyticsUncaughtExceptionHandler.a(a).get())
                {
                    SessionEventData sessioneventdata = CrashlyticsUncaughtExceptionHandler.d(a).t();
                    if (sessioneventdata != null)
                    {
                        CrashlyticsUncaughtExceptionHandler.a(a, sessioneventdata);
                    }
                    CrashlyticsUncaughtExceptionHandler.e(a);
                    CrashlyticsUncaughtExceptionHandler.c(a);
                    Fabric.g().a("Fabric", "Open sessions were closed and a new session was opened.");
                    return Boolean.valueOf(true);
                } else
                {
                    Fabric.g().a("Fabric", "Skipping session finalization because a crash has already occurred.");
                    return Boolean.valueOf(false);
                }
            }

            public Object call()
            {
                return a();
            }

            
            {
                a = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
        })).booleanValue();
    }

    File[] e()
    {
        return a(new FileNameContainsFilter("BeginSession"));
    }

    void f()
    {
        Utils.a(j, a, 4, c);
    }

    void g()
    {
        n.a(new Runnable() {

            final CrashlyticsUncaughtExceptionHandler a;

            public void run()
            {
                a.a(CrashlyticsUncaughtExceptionHandler.a(a, ClsFileOutputStream.a));
            }

            
            {
                a = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
        });
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        k.set(true);
        Fabric.g().a("Fabric", (new StringBuilder()).append("Crashlytics is handling uncaught exception \"").append(throwable).append("\" from thread ").append(thread.getName()).toString());
        if (!h.getAndSet(true))
        {
            Fabric.g().a("Fabric", "Unregistering power receivers.");
            Context context = q.C();
            context.unregisterReceiver(m);
            context.unregisterReceiver(l);
        }
        Date date = new Date();
        n.a(new Callable(date, thread, throwable) {

            final Date a;
            final Thread b;
            final Throwable c;
            final CrashlyticsUncaughtExceptionHandler d;

            public Void a()
            {
                CrashlyticsUncaughtExceptionHandler.a(d, a, b, c);
                return null;
            }

            public Object call()
            {
                return a();
            }

            
            {
                d = CrashlyticsUncaughtExceptionHandler.this;
                a = date;
                b = thread;
                c = throwable;
                super();
            }
        });
        Fabric.g().a("Fabric", "Crashlytics completed exception processing. Invoking default exception handler.");
        i.uncaughtException(thread, throwable);
        k.set(false);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Fabric.g().d("Fabric", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
        Fabric.g().a("Fabric", "Crashlytics completed exception processing. Invoking default exception handler.");
        i.uncaughtException(thread, throwable);
        k.set(false);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        throw thread;
        obj;
        Fabric.g().a("Fabric", "Crashlytics completed exception processing. Invoking default exception handler.");
        i.uncaughtException(thread, throwable);
        k.set(false);
        throw obj;
    }


    private class AnySessionPartFileFilter
        implements FilenameFilter
    {

        public boolean accept(File file, String s1)
        {
            return !CrashlyticsUncaughtExceptionHandler.a.accept(file, s1) && CrashlyticsUncaughtExceptionHandler.h().matcher(s1).matches();
        }

        private AnySessionPartFileFilter()
        {
        }

    }


    private class FileNameContainsFilter
        implements FilenameFilter
    {

        private final String a;

        public boolean accept(File file, String s1)
        {
            return s1.contains(a) && !s1.endsWith(".cls_temp");
        }

        public FileNameContainsFilter(String s1)
        {
            a = s1;
        }
    }


    private class SessionPartFileFilter
        implements FilenameFilter
    {

        private final String a;

        public boolean accept(File file, String s1)
        {
            while (s1.equals((new StringBuilder()).append(a).append(".cls").toString()) || !s1.contains(a) || s1.endsWith(".cls_temp")) 
            {
                return false;
            }
            return true;
        }

        public SessionPartFileFilter(String s1)
        {
            a = s1;
        }
    }

}
