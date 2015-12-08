// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.crashlytics.android.core.internal.CrashEventDataProvider;
import com.crashlytics.android.core.internal.models.SessionEventData;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.g;
import io.fabric.sdk.android.services.settings.p;
import io.fabric.sdk.android.services.settings.q;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
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
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore, LogFileManager, CodedOutputStream, SessionDataWriter, 
//            ByteString, ClsFileOutputStream, MetaDataStore, NativeCrashWriter, 
//            ExceptionUtils, Utils, UserMetaData, CLSUUID, 
//            CrashlyticsExecutorServiceWrapper, ReportUploader, SessionReport, FileLogStore

public class CrashlyticsUncaughtExceptionHandler
    implements Thread.UncaughtExceptionHandler
{
    private static class AnySessionPartFileFilter
        implements FilenameFilter
    {

        public boolean accept(File file, String s1)
        {
            return !CrashlyticsUncaughtExceptionHandler.a.accept(file, s1) && CrashlyticsUncaughtExceptionHandler.a().matcher(s1).matches();
        }

        private AnySessionPartFileFilter()
        {
        }

        AnySessionPartFileFilter(byte byte0)
        {
            this();
        }
    }

    static class FileNameContainsFilter
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

    static class SessionPartFileFilter
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


    static final FilenameFilter a = new FilenameFilter() {

        public final boolean accept(File file, String s1)
        {
            return s1.length() == 39 && s1.endsWith(".cls");
        }

    };
    static final Comparator b = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (File)obj;
            return ((File)obj1).getName().compareTo(((File) (obj)).getName());
        }

    };
    static final Comparator c = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (File)obj;
            obj1 = (File)obj1;
            return ((File) (obj)).getName().compareTo(((File) (obj1)).getName());
        }

    };
    static final FilenameFilter d = new FilenameFilter() {

        public final boolean accept(File file, String s1)
        {
            return CrashlyticsUncaughtExceptionHandler.a().matcher(s1).matches();
        }

    };
    private static final Pattern h = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map i = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    final AtomicBoolean e = new AtomicBoolean(false);
    public final CrashlyticsExecutorServiceWrapper f;
    final CrashlyticsCore g;
    private final AtomicInteger j = new AtomicInteger(0);
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final Thread.UncaughtExceptionHandler l;
    private final File m;
    private final BroadcastReceiver n = new BroadcastReceiver() {

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
    private final BroadcastReceiver o = new BroadcastReceiver() {

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
    private final IdManager p;
    private boolean q;
    private final LogFileManager r;
    private final SessionDataWriter s;

    CrashlyticsUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashlyticsExecutorServiceWrapper crashlyticsexecutorservicewrapper, IdManager idmanager, SessionDataWriter sessiondatawriter, CrashlyticsCore crashlyticscore)
    {
        l = uncaughtexceptionhandler;
        f = crashlyticsexecutorservicewrapper;
        p = idmanager;
        g = crashlyticscore;
        s = sessiondatawriter;
        m = crashlyticscore.g();
        r = new LogFileManager(((h) (crashlyticscore)).n, m);
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Checking for previous crash marker.");
        uncaughtexceptionhandler = new File(g.g(), "crash_marker");
        if (uncaughtexceptionhandler.exists())
        {
            uncaughtexceptionhandler.delete();
        }
        uncaughtexceptionhandler = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        crashlyticsexecutorservicewrapper = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        idmanager = ((h) (crashlyticscore)).n;
        idmanager.registerReceiver(o, uncaughtexceptionhandler);
        idmanager.registerReceiver(n, crashlyticsexecutorservicewrapper);
        k.set(true);
    }

    static String a(File file)
    {
        return file.getName().substring(0, 35);
    }

    static AtomicBoolean a(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        return crashlyticsuncaughtexceptionhandler.e;
    }

    static Pattern a()
    {
        return h;
    }

    private static void a(CodedOutputStream codedoutputstream, File file)
        throws IOException
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
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", (new StringBuilder("Tried to include a file that doesn't exist: ")).append(file.getName()).toString(), null);
        return;
        codedoutputstream;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(CodedOutputStream codedoutputstream, String s1)
        throws IOException
    {
        int i1 = 0;
        while (i1 < 4) 
        {
            String s2 = (new String[] {
                "SessionUser", "SessionApp", "SessionOS", "SessionDevice"
            })[i1];
            File afile[] = a(((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(s1).append(s2).toString()))));
            if (afile.length == 0)
            {
                io.fabric.sdk.android.c.a().c("CrashlyticsCore", (new StringBuilder("Can't find ")).append(s2).append(" data for session ID ").append(s1).toString(), null);
            } else
            {
                io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Collecting ")).append(s2).append(" data for session ID ").append(s1).toString());
                a(codedoutputstream, afile[0]);
            }
            i1++;
        }
    }

    private void a(CodedOutputStream codedoutputstream, Date date, Thread thread, Throwable throwable, String s1, boolean flag)
        throws Exception
    {
        Object obj1 = ((h) (g)).n;
        long l3 = date.getTime() / 1000L;
        float f1 = CommonUtils.c(((Context) (obj1)));
        int l1 = CommonUtils.a(((Context) (obj1)), q);
        boolean flag1 = CommonUtils.d(((Context) (obj1)));
        int i2 = ((Context) (obj1)).getResources().getConfiguration().orientation;
        long l4 = CommonUtils.b() - CommonUtils.b(((Context) (obj1)));
        long l5 = CommonUtils.b(Environment.getDataDirectory().getPath());
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = CommonUtils.a(((Context) (obj1)).getPackageName(), ((Context) (obj1)));
        LinkedList linkedlist = new LinkedList();
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        Object obj;
        LogFileManager logfilemanager;
        int j1;
        int k1;
        int j2;
        int k2;
        int l2;
        int i3;
        if (flag)
        {
            date = Thread.getAllStackTraces();
            obj = new Thread[date.size()];
            date = date.entrySet().iterator();
            for (int i1 = 0; date.hasNext(); i1++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)date.next();
                obj[i1] = (Thread)entry.getKey();
                linkedlist.add(entry.getValue());
            }

        } else
        {
            obj = new Thread[0];
        }
        if (!CommonUtils.a(((Context) (obj1)), "com.crashlytics.CollectCustomKeys", true))
        {
            date = new TreeMap();
        } else
        {
            date = Collections.unmodifiableMap(g.a);
            if (date != null && date.size() > 1)
            {
                date = new TreeMap(date);
            }
        }
        obj1 = s;
        logfilemanager = r;
        obj1.a = runningappprocessinfo;
        obj1.c = linkedlist;
        obj1.d = astacktraceelement;
        obj1.b = ((Thread []) (obj));
        obj = logfilemanager.a();
        if (obj == null)
        {
            io.fabric.sdk.android.c.a().a("CrashlyticsCore", "No log data to include with this event.");
        }
        logfilemanager.b();
        codedoutputstream.e(10, 2);
        j1 = CodedOutputStream.b(1, l3);
        k1 = CodedOutputStream.b(2, ByteString.a(s1));
        j2 = ((SessionDataWriter) (obj1)).a(thread, throwable, i2, date);
        k2 = CodedOutputStream.d(3);
        l2 = CodedOutputStream.f(j2);
        i3 = SessionDataWriter.a(l1, i2, l4, l5);
        k1 = j1 + 0 + k1 + (j2 + (k2 + l2)) + (i3 + (CodedOutputStream.d(5) + CodedOutputStream.f(i3)));
        j1 = k1;
        if (obj != null)
        {
            j1 = SessionDataWriter.a(((ByteString) (obj)));
            j1 = k1 + (j1 + (CodedOutputStream.d(6) + CodedOutputStream.f(j1)));
        }
        codedoutputstream.e(j1);
        codedoutputstream.a(1, l3);
        codedoutputstream.a(2, ByteString.a(s1));
        codedoutputstream.e(3, 2);
        codedoutputstream.e(((SessionDataWriter) (obj1)).a(thread, throwable, i2, date));
        ((SessionDataWriter) (obj1)).a(codedoutputstream, thread, throwable);
        if (date != null && !date.isEmpty())
        {
            SessionDataWriter.a(codedoutputstream, date);
        }
        if (((SessionDataWriter) (obj1)).a != null)
        {
            if (((SessionDataWriter) (obj1)).a.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            codedoutputstream.a(3, flag);
        }
        codedoutputstream.a(4, i2);
        codedoutputstream.e(5, 2);
        codedoutputstream.e(SessionDataWriter.a(l1, i2, l4, l5));
        codedoutputstream.a(f1);
        codedoutputstream.a(l1);
        codedoutputstream.a(3, flag1);
        codedoutputstream.a(4, i2);
        codedoutputstream.a(5, l4);
        codedoutputstream.a(6, l5);
        if (obj != null)
        {
            codedoutputstream.e(6, 2);
            codedoutputstream.e(SessionDataWriter.a(((ByteString) (obj))));
            codedoutputstream.a(1, ((ByteString) (obj)));
        }
    }

    private static void a(CodedOutputStream codedoutputstream, File afile[], String s1)
    {
        Arrays.sort(afile, CommonUtils.a);
        int j1 = afile.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            File file = afile[i1];
            try
            {
                io.fabric.sdk.android.c.a().a("CrashlyticsCore", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
                    s1, file.getName()
                }));
                a(codedoutputstream, file);
            }
            catch (Exception exception)
            {
                io.fabric.sdk.android.c.a().c("CrashlyticsCore", "Error writting non-fatal to session.", exception);
            }
            i1++;
        }
    }

    static void a(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, SessionEventData sessioneventdata)
        throws IOException
    {
        CodedOutputStream codedoutputstream = null;
        File afile[];
        afile = crashlyticsuncaughtexceptionhandler.e();
        Arrays.sort(afile, b);
        if (afile.length <= 1) goto _L2; else goto _L1
_L1:
        String s1 = a(afile[1]);
_L12:
        if (s1 == null) goto _L4; else goto _L3
_L3:
        ClsFileOutputStream clsfileoutputstream;
        CrashlyticsCore.b(s1);
        clsfileoutputstream = new ClsFileOutputStream(crashlyticsuncaughtexceptionhandler.m, (new StringBuilder()).append(s1).append("SessionCrash").toString());
        Map map;
        try
        {
            codedoutputstream = CodedOutputStream.a(clsfileoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
        {
            sessioneventdata = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            sessioneventdata = null;
        }
        map = (new MetaDataStore(crashlyticsuncaughtexceptionhandler.m)).b(s1);
        NativeCrashWriter.a(sessioneventdata, new LogFileManager(((h) (crashlyticsuncaughtexceptionhandler.g)).n, crashlyticsuncaughtexceptionhandler.m, s1), map, codedoutputstream);
_L6:
        CommonUtils.a(codedoutputstream, "Failed to flush to session begin file.");
        CommonUtils.a(clsfileoutputstream, "Failed to close fatal exception file output stream.");
        return;
_L2:
        s1 = null;
        continue; /* Loop/switch isn't completed */
_L4:
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", "Tried to write a native crash while no session was open.", null);
        clsfileoutputstream = null;
        if (true) goto _L6; else goto _L5
_L5:
        crashlyticsuncaughtexceptionhandler;
        clsfileoutputstream = null;
        sessioneventdata = null;
_L10:
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", "An error occurred in the native crash logger", crashlyticsuncaughtexceptionhandler);
        ExceptionUtils.a(crashlyticsuncaughtexceptionhandler, clsfileoutputstream);
        CommonUtils.a(sessioneventdata, "Failed to flush to session begin file.");
        CommonUtils.a(clsfileoutputstream, "Failed to close fatal exception file output stream.");
        return;
        crashlyticsuncaughtexceptionhandler;
        clsfileoutputstream = null;
        sessioneventdata = null;
_L8:
        CommonUtils.a(sessioneventdata, "Failed to flush to session begin file.");
        CommonUtils.a(clsfileoutputstream, "Failed to close fatal exception file output stream.");
        throw crashlyticsuncaughtexceptionhandler;
        crashlyticsuncaughtexceptionhandler;
        sessioneventdata = codedoutputstream;
        continue; /* Loop/switch isn't completed */
        crashlyticsuncaughtexceptionhandler;
        if (true) goto _L8; else goto _L7
_L7:
        crashlyticsuncaughtexceptionhandler;
        sessioneventdata = codedoutputstream;
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L12; else goto _L11
_L11:
    }

    static void a(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, Date date, Thread thread, Throwable throwable)
        throws Exception
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
        (new File(crashlyticsuncaughtexceptionhandler.m, "crash_marker")).createNewFile();
        obj = crashlyticsuncaughtexceptionhandler.c();
        if (obj == null) goto _L2; else goto _L1
_L1:
        CrashlyticsCore.b(((String) (obj)));
        obj = new ClsFileOutputStream(crashlyticsuncaughtexceptionhandler.m, (new StringBuilder()).append(((String) (obj))).append("SessionCrash").toString());
        codedoutputstream = obj2;
        clsfileoutputstream = ((ClsFileOutputStream) (obj));
        codedoutputstream1 = ((CodedOutputStream) (obj1));
        obj1 = CodedOutputStream.a(((java.io.OutputStream) (obj)));
        codedoutputstream = ((CodedOutputStream) (obj1));
        clsfileoutputstream = ((ClsFileOutputStream) (obj));
        codedoutputstream1 = ((CodedOutputStream) (obj1));
        crashlyticsuncaughtexceptionhandler.a(((CodedOutputStream) (obj1)), date, thread, throwable, "crash", true);
_L3:
        CommonUtils.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
_L4:
        crashlyticsuncaughtexceptionhandler.a(false);
        crashlyticsuncaughtexceptionhandler.d();
        Utils.a(crashlyticsuncaughtexceptionhandler.m, a, 4, c);
        if (!crashlyticsuncaughtexceptionhandler.g.h())
        {
            crashlyticsuncaughtexceptionhandler.f();
        }
        return;
_L2:
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", null);
        obj = null;
        obj1 = clsfileoutputstream;
          goto _L3
        date;
        obj = null;
_L7:
        codedoutputstream = codedoutputstream1;
        clsfileoutputstream = ((ClsFileOutputStream) (obj));
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", "An error occurred in the fatal exception logger", date);
        codedoutputstream = codedoutputstream1;
        clsfileoutputstream = ((ClsFileOutputStream) (obj));
        ExceptionUtils.a(date, ((java.io.OutputStream) (obj)));
        CommonUtils.a(codedoutputstream1, "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
          goto _L4
        crashlyticsuncaughtexceptionhandler;
        clsfileoutputstream = null;
_L6:
        CommonUtils.a(codedoutputstream, "Failed to flush to session begin file.");
        CommonUtils.a(clsfileoutputstream, "Failed to close fatal exception file output stream.");
        throw crashlyticsuncaughtexceptionhandler;
        crashlyticsuncaughtexceptionhandler;
        if (true) goto _L6; else goto _L5
_L5:
        date;
          goto _L7
    }

    private void a(String s1)
    {
        s1 = a(((FilenameFilter) (new SessionPartFileFilter(s1))));
        int j1 = s1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            s1[i1].delete();
        }

    }

    private void a(String s1, int i1)
    {
        Utils.a(m, new FileNameContainsFilter((new StringBuilder()).append(s1).append("SessionEvent").toString()), i1, c);
    }

    private void a(boolean flag)
        throws Exception
    {
        File afile1[];
        int i1;
        HashSet hashset;
        File afile[];
        int i2;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        hashset = new HashSet();
        afile = e();
        Arrays.sort(afile, b);
        i2 = Math.min(i1 + 8, afile.length);
        for (int j1 = 0; j1 < i2; j1++)
        {
            hashset.add(a(afile[j1]));
        }

        r.a(hashset);
        afile = a(((FilenameFilter) (new AnySessionPartFileFilter((byte)0))));
        i2 = afile.length;
        for (int k1 = 0; k1 < i2; k1++)
        {
            File file = afile[k1];
            String s1 = file.getName();
            Matcher matcher = h.matcher(s1);
            matcher.matches();
            if (!hashset.contains(matcher.group(1)))
            {
                io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Trimming open session file: ")).append(s1).toString());
                file.delete();
            }
        }

        afile1 = e();
        Arrays.sort(afile1, b);
        if (afile1.length <= i1) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        Object obj6;
        Object obj7;
        obj7 = a(afile1[i1]);
        obj = null;
        obj1 = null;
        obj6 = null;
        obj2 = null;
        java.io.Closeable closeable = new ClsFileOutputStream(m, (new StringBuilder()).append(((String) (obj7))).append("SessionUser").toString());
        obj1 = closeable;
        obj2 = obj6;
        obj6 = CodedOutputStream.a(closeable);
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        if (!e.get()) goto _L4; else goto _L3
_L3:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj7 = g;
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        if (!((h) (obj7)).p.b) goto _L6; else goto _L5
_L5:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj7 = ((CrashlyticsCore) (obj7)).c;
_L20:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        Object obj8 = g;
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        if (!((h) (obj8)).p.b) goto _L8; else goto _L7
_L7:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj8 = ((CrashlyticsCore) (obj8)).e;
_L21:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        Object obj9 = g;
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        if (!((h) (obj9)).p.b) goto _L10; else goto _L9
_L9:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj9 = ((CrashlyticsCore) (obj9)).d;
_L22:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj7 = new UserMetaData(((String) (obj7)), ((String) (obj8)), ((String) (obj9)));
_L23:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        if (((UserMetaData) (obj7)).b != null)
        {
            break MISSING_BLOCK_LABEL_1830;
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        if (((UserMetaData) (obj7)).c != null)
        {
            break MISSING_BLOCK_LABEL_1830;
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj8 = ((UserMetaData) (obj7)).d;
        int l1;
        if (obj8 != null)
        {
            break MISSING_BLOCK_LABEL_1830;
        }
        l1 = 1;
_L30:
        if (l1 == 0) goto _L12; else goto _L11
_L11:
        CommonUtils.a(((java.io.Flushable) (obj6)), "Failed to flush session user file.");
        CommonUtils.a(closeable, "Failed to close session user file.");
_L24:
        obj = CrashlyticsCore.i();
        if (obj == null) goto _L14; else goto _L13
_L13:
        l1 = ((p) (obj)).c;
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Closing open sessions.");
_L19:
        if (i1 >= afile1.length) goto _L16; else goto _L15
_L15:
        Exception exception1;
        obj8 = afile1[i1];
        obj7 = a(((File) (obj8)));
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Closing session: ")).append(((String) (obj7))).toString());
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Collecting session parts for ID ")).append(((String) (obj7))).toString());
        obj6 = a(((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(((String) (obj7))).append("SessionCrash").toString()))));
        Exception exception;
        String s2;
        ByteString bytestring;
        int j2;
        boolean flag1;
        if (obj6 != null && obj6.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
            obj7, Boolean.valueOf(flag)
        }));
        closeable = a(((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(((String) (obj7))).append("SessionEvent").toString()))));
        if (closeable != null && closeable.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
            obj7, Boolean.valueOf(flag1)
        }));
        if (!flag && !flag1) goto _L18; else goto _L17
_L17:
        obj2 = null;
        obj1 = null;
        obj = new ClsFileOutputStream(m, ((String) (obj7)));
        obj1 = obj2;
        obj2 = CodedOutputStream.a(((java.io.OutputStream) (obj)));
        obj1 = obj2;
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Collecting SessionStart data for session ID ")).append(((String) (obj7))).toString());
        obj1 = obj2;
        a(((CodedOutputStream) (obj2)), ((File) (obj8)));
        obj1 = obj2;
        ((CodedOutputStream) (obj2)).a(4, (new Date()).getTime() / 1000L);
        obj1 = obj2;
        ((CodedOutputStream) (obj2)).a(5, flag);
        obj1 = obj2;
        a(((CodedOutputStream) (obj2)), ((String) (obj7)));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1082;
        }
        obj1 = obj2;
        if (closeable.length <= l1)
        {
            break MISSING_BLOCK_LABEL_1070;
        }
        obj1 = obj2;
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
            Integer.valueOf(l1)
        }));
        obj1 = obj2;
        a(((String) (obj7)), l1);
        obj1 = obj2;
        closeable = a(((FilenameFilter) (new FileNameContainsFilter((new StringBuilder()).append(((String) (obj7))).append("SessionEvent").toString()))));
        obj1 = obj2;
        a(((CodedOutputStream) (obj2)), ((File []) (closeable)), ((String) (obj7)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1098;
        }
        obj1 = obj2;
        a(((CodedOutputStream) (obj2)), obj6[0]);
        obj1 = obj2;
        ((CodedOutputStream) (obj2)).a(11, 1);
        obj1 = obj2;
        ((CodedOutputStream) (obj2)).b(12, 3);
        CommonUtils.a(((java.io.Flushable) (obj2)), "Error flushing session file stream");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
_L25:
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Removing session part files for ID ")).append(((String) (obj7))).toString());
        a(((String) (obj7)));
        i1++;
          goto _L19
_L6:
        obj7 = null;
          goto _L20
_L8:
        obj8 = null;
          goto _L21
_L10:
        obj9 = null;
          goto _L22
_L4:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj7 = (new MetaDataStore(m)).a(((String) (obj7)));
          goto _L23
_L12:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj8 = ((UserMetaData) (obj7)).b;
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj9 = ((UserMetaData) (obj7)).c;
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        s2 = ((UserMetaData) (obj7)).d;
        obj7 = obj8;
        if (obj8 == null)
        {
            obj7 = "";
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj7 = ByteString.a(((String) (obj7)));
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj8 = SessionDataWriter.a(((String) (obj9)));
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        bytestring = SessionDataWriter.a(s2);
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        j2 = CodedOutputStream.b(1, ((ByteString) (obj7))) + 0;
        l1 = j2;
        if (obj9 == null)
        {
            break MISSING_BLOCK_LABEL_1393;
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        l1 = j2 + CodedOutputStream.b(2, ((ByteString) (obj8)));
        j2 = l1;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_1423;
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        j2 = l1 + CodedOutputStream.b(3, bytestring);
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        ((CodedOutputStream) (obj6)).e(6, 2);
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        ((CodedOutputStream) (obj6)).e(j2);
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        ((CodedOutputStream) (obj6)).a(1, ((ByteString) (obj7)));
        if (obj9 == null)
        {
            break MISSING_BLOCK_LABEL_1499;
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        ((CodedOutputStream) (obj6)).a(2, ((ByteString) (obj8)));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_1522;
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        ((CodedOutputStream) (obj6)).a(3, bytestring);
        CommonUtils.a(((java.io.Flushable) (obj6)), "Failed to flush session user file.");
        CommonUtils.a(closeable, "Failed to close session user file.");
          goto _L24
        exception1;
        closeable = null;
_L29:
        obj = obj2;
        obj1 = closeable;
        ExceptionUtils.a(exception1, closeable);
        obj = obj2;
        obj1 = closeable;
        throw exception1;
        exception;
        obj2 = obj1;
        obj1 = obj;
        obj = exception;
_L28:
        CommonUtils.a(((java.io.Flushable) (obj1)), "Failed to flush session user file.");
        CommonUtils.a(((java.io.Closeable) (obj2)), "Failed to close session user file.");
        throw obj;
        obj2;
        obj = null;
        obj1 = null;
_L27:
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", (new StringBuilder("Failed to write session file for session ID: ")).append(((String) (obj7))).toString(), ((Throwable) (obj2)));
        ExceptionUtils.a(((Throwable) (obj2)), ((java.io.OutputStream) (obj1)));
        CommonUtils.a(((java.io.Flushable) (obj)), "Error flushing session file stream");
        if (obj1 != null)
        {
            try
            {
                ((ClsFileOutputStream) (obj1)).a();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                io.fabric.sdk.android.c.a().c("CrashlyticsCore", "Error closing session file stream in the presence of an exception", ((Throwable) (obj)));
            }
        }
          goto _L25
        obj2;
        obj = null;
_L26:
        CommonUtils.a(((java.io.Flushable) (obj1)), "Error flushing session file stream");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
        throw obj2;
_L18:
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("No events present for session ID ")).append(((String) (obj7))).toString());
          goto _L25
_L14:
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Unable to close session. Settings are not loaded.");
_L16:
        return;
_L2:
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", "No open sessions to be closed.");
        return;
        obj2;
          goto _L26
        obj2;
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
          goto _L26
        obj2;
        Object obj4 = null;
        obj1 = obj;
        obj = obj4;
          goto _L27
        exception1;
        obj1 = obj2;
        Object obj5 = obj;
        obj2 = exception1;
        obj = obj1;
        obj1 = obj5;
          goto _L27
        obj;
        obj2 = null;
          goto _L28
        exception1;
          goto _L29
        l1 = 0;
          goto _L30
    }

    static boolean a(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, boolean flag)
    {
        crashlyticsuncaughtexceptionhandler.q = flag;
        return flag;
    }

    static File[] a(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, FilenameFilter filenamefilter)
    {
        return crashlyticsuncaughtexceptionhandler.a(filenamefilter);
    }

    static LogFileManager b(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        return crashlyticsuncaughtexceptionhandler.r;
    }

    static Map b()
    {
        return i;
    }

    static void b(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, Date date, Thread thread, Throwable throwable)
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
        s1 = crashlyticsuncaughtexceptionhandler.c();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        CrashlyticsCore.a(s1);
        Object obj;
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Crashlytics is logging non-fatal exception \"")).append(throwable).append("\" from thread ").append(thread.getName()).toString());
        obj = CommonUtils.a(crashlyticsuncaughtexceptionhandler.j.getAndIncrement());
        obj = (new StringBuilder()).append(s1).append("SessionEvent").append(((String) (obj))).toString();
        obj = new ClsFileOutputStream(crashlyticsuncaughtexceptionhandler.m, ((String) (obj)));
        codedoutputstream = obj1;
        codedoutputstream1 = codedoutputstream2;
        codedoutputstream2 = CodedOutputStream.a(((java.io.OutputStream) (obj)));
        codedoutputstream = codedoutputstream2;
        codedoutputstream1 = codedoutputstream2;
        crashlyticsuncaughtexceptionhandler.a(codedoutputstream2, date, thread, throwable, "error", false);
        CommonUtils.a(codedoutputstream2, "Failed to flush to non-fatal file.");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close non-fatal file output stream.");
        break MISSING_BLOCK_LABEL_175;
        thread;
        date = null;
_L6:
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", "An error occurred in the non-fatal exception logger", thread);
        ExceptionUtils.a(thread, date);
        CommonUtils.a(codedoutputstream1, "Failed to flush to non-fatal file.");
        CommonUtils.a(date, "Failed to close non-fatal file output stream.");
          goto _L3
        crashlyticsuncaughtexceptionhandler;
        date = null;
_L5:
        CommonUtils.a(codedoutputstream, "Failed to flush to non-fatal file.");
        CommonUtils.a(date, "Failed to close non-fatal file output stream.");
        throw crashlyticsuncaughtexceptionhandler;
_L3:
        try
        {
            crashlyticsuncaughtexceptionhandler.a(s1, 64);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
        {
            io.fabric.sdk.android.c.a().c("CrashlyticsCore", "An error occurred when trimming non-fatal files.", crashlyticsuncaughtexceptionhandler);
        }
        return;
_L2:
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", "Tried to write a non-fatal exception while no session was open.", null);
        return;
        crashlyticsuncaughtexceptionhandler;
        date = ((Date) (obj));
        continue; /* Loop/switch isn't completed */
        crashlyticsuncaughtexceptionhandler;
        codedoutputstream = codedoutputstream1;
        if (true) goto _L5; else goto _L4
_L4:
        thread;
        date = ((Date) (obj));
          goto _L6
    }

    private String c()
    {
        File afile[] = e();
        Arrays.sort(afile, b);
        if (afile.length > 0)
        {
            return a(afile[0]);
        } else
        {
            return null;
        }
    }

    static String c(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        return crashlyticsuncaughtexceptionhandler.c();
    }

    static File d(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        return crashlyticsuncaughtexceptionhandler.m;
    }

    private void d()
        throws Exception
    {
        Object obj;
        Object obj1;
        Object obj2;
        CodedOutputStream codedoutputstream;
        Object obj5;
        String s1;
        obj5 = new Date();
        s1 = (new CLSUUID(p)).toString();
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Opening an new session with ID ")).append(s1).toString());
        obj = null;
        obj1 = null;
        codedoutputstream = null;
        obj2 = null;
        Object obj3 = new ClsFileOutputStream(m, (new StringBuilder()).append(s1).append("BeginSession").toString());
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream = CodedOutputStream.a(((java.io.OutputStream) (obj3)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        SessionDataWriter.a(codedoutputstream, s1, String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
            "2.3.5.79"
        }), ((Date) (obj5)).getTime() / 1000L);
        CommonUtils.a(codedoutputstream, "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj3)), "Failed to close begin session file.");
        obj = null;
        obj1 = null;
        codedoutputstream = null;
        obj2 = null;
        obj3 = new ClsFileOutputStream(m, (new StringBuilder()).append(s1).append("SessionApp").toString());
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream = CodedOutputStream.a(((java.io.OutputStream) (obj3)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        Object obj7 = g.f;
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        Object obj9 = g.h;
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        Object obj8 = g.i;
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        Object obj6 = p.a();
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        int i1 = DeliveryMechanism.a(g.g).e;
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj5 = s;
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj7 = ByteString.a(((String) (obj7)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj9 = ByteString.a(((String) (obj9)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj8 = ByteString.a(((String) (obj8)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj6 = ByteString.a(((String) (obj6)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.e(7, 2);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        int j1 = CodedOutputStream.b(1, ((ByteString) (obj7)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        int k1 = CodedOutputStream.b(2, ((ByteString) (obj9)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        int l1 = CodedOutputStream.b(3, ((ByteString) (obj8)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        int i2 = ((SessionDataWriter) (obj5)).a();
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.e(j1 + 0 + k1 + l1 + (i2 + (CodedOutputStream.d(5) + CodedOutputStream.f(i2))) + CodedOutputStream.b(6, ((ByteString) (obj6))) + CodedOutputStream.d(10, i1));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(1, ((ByteString) (obj7)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(2, ((ByteString) (obj9)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(3, ((ByteString) (obj8)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.e(5, 2);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.e(((SessionDataWriter) (obj5)).a());
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        new g();
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(io.fabric.sdk.android.services.common.g.a(((SessionDataWriter) (obj5)).e));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(6, ((ByteString) (obj6)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.b(10, i1);
        CommonUtils.a(codedoutputstream, "Failed to flush to session app file.");
        CommonUtils.a(((java.io.Closeable) (obj3)), "Failed to close session app file.");
        obj = null;
        obj1 = null;
        codedoutputstream = null;
        obj2 = null;
        obj3 = new ClsFileOutputStream(m, (new StringBuilder()).append(s1).append("SessionOS").toString());
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream = CodedOutputStream.a(((java.io.OutputStream) (obj3)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        boolean flag = CommonUtils.f(((h) (g)).n);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj5 = ByteString.a(android.os.Build.VERSION.RELEASE);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj6 = ByteString.a(android.os.Build.VERSION.CODENAME);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.e(8, 2);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.e(SessionDataWriter.a(((ByteString) (obj5)), ((ByteString) (obj6))));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.b(1, 3);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(2, ((ByteString) (obj5)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(3, ((ByteString) (obj6)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(4, flag);
        CommonUtils.a(codedoutputstream, "Failed to flush to session OS file.");
        CommonUtils.a(((java.io.Closeable) (obj3)), "Failed to close session OS file.");
        obj = null;
        obj1 = null;
        obj5 = null;
        codedoutputstream = null;
        obj2 = null;
        obj3 = new ClsFileOutputStream(m, (new StringBuilder()).append(s1).append("SessionDevice").toString());
        obj1 = obj5;
        obj2 = codedoutputstream;
        codedoutputstream = CodedOutputStream.a(((java.io.OutputStream) (obj3)));
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        obj6 = ((h) (g)).n;
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        obj7 = new StatFs(Environment.getDataDirectory().getPath());
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        obj8 = p;
        obj = "";
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        if (!((IdManager) (obj8)).a)
        {
            break MISSING_BLOCK_LABEL_1150;
        }
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        obj5 = ((IdManager) (obj8)).g();
        obj = obj5;
        if (obj5 != null)
        {
            break MISSING_BLOCK_LABEL_1150;
        }
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        obj9 = CommonUtils.a(((IdManager) (obj8)).c);
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        obj5 = ((SharedPreferences) (obj9)).getString("crashlytics.installation.id", null);
        obj = obj5;
        if (obj5 != null)
        {
            break MISSING_BLOCK_LABEL_1150;
        }
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        obj = ((IdManager) (obj8)).a(((SharedPreferences) (obj9)));
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        i1 = CommonUtils.a();
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        j1 = Runtime.getRuntime().availableProcessors();
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        long l2 = CommonUtils.b();
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        long l3 = ((StatFs) (obj7)).getBlockCount();
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        long l4 = ((StatFs) (obj7)).getBlockSize();
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        flag = CommonUtils.e(((Context) (obj6)));
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        obj5 = p.d();
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        k1 = CommonUtils.g(((Context) (obj6)));
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        SessionDataWriter.a(codedoutputstream, ((String) (obj)), i1, Build.MODEL, j1, l2, l3 * l4, flag, ((Map) (obj5)), k1, Build.MANUFACTURER, Build.PRODUCT);
        CommonUtils.a(codedoutputstream, "Failed to flush session device info.");
        CommonUtils.a(((java.io.Closeable) (obj3)), "Failed to close session device file.");
        r.a(s1);
        return;
        Object obj4;
        obj4;
        obj3 = null;
_L16:
        obj = obj2;
        obj1 = obj3;
        ExceptionUtils.a(((Throwable) (obj4)), ((java.io.OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw obj4;
        obj3;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L14:
        CommonUtils.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj2)), "Failed to close begin session file.");
        throw obj;
        obj4;
        obj3 = null;
_L12:
        obj = obj2;
        obj1 = obj3;
        ExceptionUtils.a(((Throwable) (obj4)), ((java.io.OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw obj4;
        obj3;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L10:
        CommonUtils.a(((java.io.Flushable) (obj1)), "Failed to flush to session app file.");
        CommonUtils.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        throw obj;
        obj4;
        obj3 = null;
_L8:
        obj = obj2;
        obj1 = obj3;
        ExceptionUtils.a(((Throwable) (obj4)), ((java.io.OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw obj4;
        obj3;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L6:
        CommonUtils.a(((java.io.Flushable) (obj1)), "Failed to flush to session OS file.");
        CommonUtils.a(((java.io.Closeable) (obj2)), "Failed to close session OS file.");
        throw obj;
        obj1;
_L4:
        ExceptionUtils.a(((Throwable) (obj1)), ((java.io.OutputStream) (obj)));
        throw obj1;
        obj4;
        obj3 = obj;
        obj1 = obj2;
        obj = obj4;
_L2:
        CommonUtils.a(((java.io.Flushable) (obj1)), "Failed to flush session device info.");
        CommonUtils.a(((java.io.Closeable) (obj3)), "Failed to close session device file.");
        throw obj;
        obj;
        obj3 = null;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        obj = obj3;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        obj2 = null;
        if (true) goto _L6; else goto _L5
_L5:
        obj4;
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        obj2 = null;
        if (true) goto _L10; else goto _L9
_L9:
        obj4;
        if (true) goto _L12; else goto _L11
_L11:
        obj;
        obj2 = null;
        if (true) goto _L14; else goto _L13
_L13:
        obj4;
        if (true) goto _L16; else goto _L15
_L15:
    }

    static void e(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
        throws Exception
    {
        crashlyticsuncaughtexceptionhandler.d();
    }

    private File[] e()
    {
        return a(new FileNameContainsFilter("BeginSession"));
    }

    static CrashlyticsCore f(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
    {
        return crashlyticsuncaughtexceptionhandler.g;
    }

    private void f()
    {
        File afile[] = a(a);
        int j1 = afile.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            File file = afile[i1];
            f.a(new Runnable(file) {

                final File a;
                final CrashlyticsUncaughtExceptionHandler b;

                public void run()
                {
                    if (CommonUtils.l(((h) (CrashlyticsUncaughtExceptionHandler.f(b))).n))
                    {
                        io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                        Object obj = io.fabric.sdk.android.services.settings.q.a.a().a();
                        obj = CrashlyticsUncaughtExceptionHandler.f(b).a(((io.fabric.sdk.android.services.settings.s) (obj)));
                        if (obj != null)
                        {
                            (new ReportUploader(((CreateReportSpiCall) (obj)))).a(new SessionReport(a, CrashlyticsUncaughtExceptionHandler.b()));
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

    static void g(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler)
        throws Exception
    {
        crashlyticsuncaughtexceptionhandler.a(true);
    }

    public final void a(String s1, String s2, String s3)
    {
        f.b(new Callable(s1, s2, s3) {

            final String a;
            final String b;
            final String c;
            final CrashlyticsUncaughtExceptionHandler d;

            private Void a()
                throws Exception
            {
                Object obj;
                Object obj1;
                Object obj3;
                obj = null;
                String s4 = com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.c(d);
                obj3 = new MetaDataStore(CrashlyticsUncaughtExceptionHandler.d(d));
                obj1 = new UserMetaData(a, b, c);
                obj3 = ((MetaDataStore) (obj3)).c(s4);
                String s5;
                s5 = MetaDataStore.a(((UserMetaData) (obj1)));
                obj1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((File) (obj3))), MetaDataStore.a));
                obj = obj1;
                ((Writer) (obj1)).write(s5);
                obj = obj1;
                ((Writer) (obj1)).flush();
                CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close user metadata file.");
                return null;
                Object obj2;
                obj2;
                obj1 = null;
_L4:
                obj = obj1;
                io.fabric.sdk.android.c.a().c("CrashlyticsCore", "Error serializing user metadata.", ((Throwable) (obj2)));
                CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close user metadata file.");
                return null;
                obj2;
                obj1 = obj;
                obj = obj2;
_L2:
                CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close user metadata file.");
                throw obj;
                obj2;
                obj1 = obj;
                obj = obj2;
                if (true) goto _L2; else goto _L1
_L1:
                obj2;
                if (true) goto _L4; else goto _L3
_L3:
            }

            public Object call()
                throws Exception
            {
                return a();
            }

            
            {
                d = CrashlyticsUncaughtExceptionHandler.this;
                a = s1;
                b = s2;
                c = s3;
                super();
            }
        });
    }

    final File[] a(FilenameFilter filenamefilter)
    {
        File afile[] = m.listFiles(filenamefilter);
        filenamefilter = afile;
        if (afile == null)
        {
            filenamefilter = new File[0];
        }
        return filenamefilter;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        e.set(true);
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Crashlytics is handling uncaught exception \"")).append(throwable).append("\" from thread ").append(thread.getName()).toString());
        if (!k.getAndSet(true))
        {
            io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Unregistering power receivers.");
            Context context = ((h) (g)).n;
            context.unregisterReceiver(o);
            context.unregisterReceiver(n);
        }
        Date date = new Date();
        f.a(new Callable(date, thread, throwable) {

            final Date a;
            final Thread b;
            final Throwable c;
            final CrashlyticsUncaughtExceptionHandler d;

            public Object call()
                throws Exception
            {
                CrashlyticsUncaughtExceptionHandler.a(d, a, b, c);
                return null;
            }

            
            {
                d = CrashlyticsUncaughtExceptionHandler.this;
                a = date;
                b = thread;
                c = throwable;
                super();
            }
        });
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
        l.uncaughtException(thread, throwable);
        e.set(false);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        io.fabric.sdk.android.c.a().c("CrashlyticsCore", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
        l.uncaughtException(thread, throwable);
        e.set(false);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        throw thread;
        obj;
        io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
        l.uncaughtException(thread, throwable);
        e.set(false);
        throw obj;
    }


    // Unreferenced inner class com/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler$11

/* anonymous class */
    class _cls11
        implements Callable
    {

        final Map a;
        final CrashlyticsUncaughtExceptionHandler b;

        private Void a()
            throws Exception
        {
            Object obj;
            Object obj1;
            Object obj3;
            obj = null;
            String s1 = com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.c(b);
            obj3 = new MetaDataStore(CrashlyticsUncaughtExceptionHandler.d(b));
            obj1 = a;
            obj3 = ((MetaDataStore) (obj3)).d(s1);
            String s2;
            s2 = MetaDataStore.a(((Map) (obj1)));
            obj1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((File) (obj3))), MetaDataStore.a));
            obj = obj1;
            ((Writer) (obj1)).write(s2);
            obj = obj1;
            ((Writer) (obj1)).flush();
            CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close key/value metadata file.");
            return null;
            Object obj2;
            obj2;
            obj1 = null;
_L4:
            obj = obj1;
            io.fabric.sdk.android.c.a().c("CrashlyticsCore", "Error serializing key/value metadata.", ((Throwable) (obj2)));
            CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close key/value metadata file.");
            return null;
            obj2;
            obj1 = obj;
            obj = obj2;
_L2:
            CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close key/value metadata file.");
            throw obj;
            obj2;
            obj1 = obj;
            obj = obj2;
            if (true) goto _L2; else goto _L1
_L1:
            obj2;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public Object call()
            throws Exception
        {
            return a();
        }
    }


    // Unreferenced inner class com/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler$12

/* anonymous class */
    class _cls12
        implements Callable
    {

        final CrashlyticsUncaughtExceptionHandler a;

        public Object call()
            throws Exception
        {
            CrashlyticsUncaughtExceptionHandler.e(a);
            return null;
        }

            
            {
                a = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
    }


    // Unreferenced inner class com/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler$13

/* anonymous class */
    class _cls13
        implements Callable
    {

        final CrashlyticsUncaughtExceptionHandler a;

        public Object call()
            throws Exception
        {
            if (!CrashlyticsUncaughtExceptionHandler.a(a).get())
            {
                io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Finalizing previously open sessions.");
                CrashlyticsCore crashlyticscore = CrashlyticsUncaughtExceptionHandler.f(a);
                SessionEventData sessioneventdata = null;
                if (crashlyticscore.k != null)
                {
                    sessioneventdata = crashlyticscore.k.a();
                }
                if (sessioneventdata != null)
                {
                    CrashlyticsUncaughtExceptionHandler.a(a, sessioneventdata);
                }
                com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.g(a);
                io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Closed all previously open sessions");
                return Boolean.valueOf(true);
            } else
            {
                io.fabric.sdk.android.c.a().a("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
                return Boolean.valueOf(false);
            }
        }

            
            {
                a = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
    }


    // Unreferenced inner class com/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler$14

/* anonymous class */
    class _cls14
        implements Runnable
    {

        final CrashlyticsUncaughtExceptionHandler a;

        public void run()
        {
            CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler = a;
            File afile[] = CrashlyticsUncaughtExceptionHandler.a(a, ClsFileOutputStream.a);
            File file = new File(crashlyticsuncaughtexceptionhandler.g.g(), "invalidClsFiles");
            if (file.exists())
            {
                if (file.isDirectory())
                {
                    File afile2[] = file.listFiles();
                    int k1 = afile2.length;
                    for (int i1 = 0; i1 < k1; i1++)
                    {
                        afile2[i1].delete();
                    }

                }
                file.delete();
            }
            int i2 = afile.length;
            for (int j1 = 0; j1 < i2; j1++)
            {
                Object obj = afile[j1];
                io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Found invalid session part file: ")).append(obj).toString());
                obj = CrashlyticsUncaughtExceptionHandler.a(((File) (obj)));
                FilenameFilter filenamefilter = crashlyticsuncaughtexceptionhandler. new FilenameFilter(((String) (obj))) {

                    final String a;
                    final CrashlyticsUncaughtExceptionHandler b;

                    public boolean accept(File file, String s1)
                    {
                        return s1.startsWith(a);
                    }

            
            {
                b = CrashlyticsUncaughtExceptionHandler.this;
                a = s1;
                super();
            }
                };
                io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Deleting all part files for invalid session: ")).append(((String) (obj))).toString());
                File afile1[] = crashlyticsuncaughtexceptionhandler.a(filenamefilter);
                int j2 = afile1.length;
                for (int l1 = 0; l1 < j2; l1++)
                {
                    File file1 = afile1[l1];
                    io.fabric.sdk.android.c.a().a("CrashlyticsCore", (new StringBuilder("Deleting session file: ")).append(file1).toString());
                    file1.delete();
                }

            }

        }

            
            {
                a = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
    }


    // Unreferenced inner class com/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler$8

/* anonymous class */
    class _cls8
        implements Callable
    {

        final long a;
        final String b;
        final CrashlyticsUncaughtExceptionHandler c;

        public Object call()
            throws Exception
        {
            if (!CrashlyticsUncaughtExceptionHandler.a(c).get())
            {
                LogFileManager logfilemanager = CrashlyticsUncaughtExceptionHandler.b(c);
                long l1 = a;
                String s1 = b;
                logfilemanager.a.a(l1, s1);
            }
            return null;
        }

            
            {
                c = CrashlyticsUncaughtExceptionHandler.this;
                a = l1;
                b = s1;
                super();
            }
    }


    // Unreferenced inner class com/crashlytics/android/core/CrashlyticsUncaughtExceptionHandler$9

/* anonymous class */
    public class _cls9
        implements Runnable
    {

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

            public 
            {
                d = CrashlyticsUncaughtExceptionHandler.this;
                a = date;
                b = thread;
                c = throwable;
                super();
            }
    }

}
