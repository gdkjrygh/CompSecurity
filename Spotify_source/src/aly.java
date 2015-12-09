// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import com.crashlytics.android.core.CodedOutputStream;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
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

final class aly
    implements Thread.UncaughtExceptionHandler
{

    static final FilenameFilter a = new FilenameFilter() {

        public final boolean accept(File file, String s)
        {
            return s.length() == 39 && s.endsWith(".cls");
        }

    };
    private static Comparator e = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (File)obj;
            return ((File)obj1).getName().compareTo(((File) (obj)).getName());
        }

    };
    private static Comparator f = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (File)obj;
            obj1 = (File)obj1;
            return ((File) (obj)).getName().compareTo(((File) (obj1)).getName());
        }

    };
    private static final Pattern g = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map h = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    final AtomicBoolean b = new AtomicBoolean(false);
    final alw c;
    final alu d;
    private final AtomicInteger i = new AtomicInteger(0);
    private final AtomicBoolean j = new AtomicBoolean(false);
    private final Thread.UncaughtExceptionHandler k;
    private final File l;
    private final BroadcastReceiver m = new BroadcastReceiver() {

        private aly a;

        public final void onReceive(Context context, Intent intent)
        {
            aly.a(a, false);
        }

            
            {
                a = aly.this;
                super();
            }
    };
    private final BroadcastReceiver n = new BroadcastReceiver() {

        private aly a;

        public final void onReceive(Context context, Intent intent)
        {
            aly.a(a, true);
        }

            
            {
                a = aly.this;
                super();
            }
    };
    private final IdManager o;
    private boolean p;
    private final ami q;
    private final and r;

    aly(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, alw alw1, IdManager idmanager, and and1, alu alu1)
    {
        k = uncaughtexceptionhandler;
        c = alw1;
        o = idmanager;
        d = alu1;
        r = and1;
        l = alu1.g();
        q = new ami(((gyh) (alu1)).k, l);
        gya.a().a("CrashlyticsCore", "Checking for previous crash marker.");
        uncaughtexceptionhandler = new File(d.g(), "crash_marker");
        if (uncaughtexceptionhandler.exists())
        {
            uncaughtexceptionhandler.delete();
        }
        uncaughtexceptionhandler = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        alw1 = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        idmanager = ((gyh) (alu1)).k;
        idmanager.registerReceiver(n, uncaughtexceptionhandler);
        idmanager.registerReceiver(m, alw1);
        j.set(true);
    }

    static String a(File file)
    {
        return file.getName().substring(0, 35);
    }

    static AtomicBoolean a(aly aly1)
    {
        return aly1.b;
    }

    static Pattern a()
    {
        return g;
    }

    static void a(aly aly1, anl anl)
    {
        CodedOutputStream codedoutputstream = null;
        File afile[];
        afile = aly1.e();
        Arrays.sort(afile, e);
        if (afile.length <= 1) goto _L2; else goto _L1
_L1:
        String s = a(afile[1]);
_L12:
        if (s == null) goto _L4; else goto _L3
_L3:
        alt alt1;
        alu.d(s);
        alt1 = new alt(aly1.l, (new StringBuilder()).append(s).append("SessionCrash").toString());
        Map map;
        try
        {
            codedoutputstream = CodedOutputStream.a(alt1);
        }
        // Misplaced declaration of an exception variable
        catch (aly aly1)
        {
            anl = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            anl = null;
        }
        map = (new amk(aly1.l)).b(s);
        aml.a(anl, new ami(((gyh) (aly1.d)).k, aly1.l, s), map, codedoutputstream);
_L6:
        CommonUtils.a(codedoutputstream, "Failed to flush to session begin file.");
        CommonUtils.a(alt1, "Failed to close fatal exception file output stream.");
        return;
_L2:
        s = null;
        continue; /* Loop/switch isn't completed */
_L4:
        gya.a().c("CrashlyticsCore", "Tried to write a native crash while no session was open.", null);
        alt1 = null;
        if (true) goto _L6; else goto _L5
_L5:
        aly1;
        alt1 = null;
        anl = null;
_L10:
        gya.a().c("CrashlyticsCore", "An error occurred in the native crash logger", aly1);
        amg.a(aly1, alt1);
        CommonUtils.a(anl, "Failed to flush to session begin file.");
        CommonUtils.a(alt1, "Failed to close fatal exception file output stream.");
        return;
        aly1;
        alt1 = null;
        anl = null;
_L8:
        CommonUtils.a(anl, "Failed to flush to session begin file.");
        CommonUtils.a(alt1, "Failed to close fatal exception file output stream.");
        throw aly1;
        aly1;
        anl = codedoutputstream;
        continue; /* Loop/switch isn't completed */
        aly1;
        if (true) goto _L8; else goto _L7
_L7:
        aly1;
        anl = codedoutputstream;
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L12; else goto _L11
_L11:
    }

    static void a(aly aly1, Date date, Thread thread, Throwable throwable)
    {
        CodedOutputStream codedoutputstream;
        alt alt1;
        CodedOutputStream codedoutputstream1;
        Object obj1;
        Object obj2;
        codedoutputstream1 = null;
        codedoutputstream = null;
        obj2 = null;
        obj1 = null;
        alt1 = null;
        Object obj;
        (new File(aly1.l, "crash_marker")).createNewFile();
        obj = aly1.c();
        if (obj == null) goto _L2; else goto _L1
_L1:
        alu.d(((String) (obj)));
        obj = new alt(aly1.l, (new StringBuilder()).append(((String) (obj))).append("SessionCrash").toString());
        codedoutputstream = obj2;
        alt1 = ((alt) (obj));
        codedoutputstream1 = ((CodedOutputStream) (obj1));
        obj1 = CodedOutputStream.a(((java.io.OutputStream) (obj)));
        codedoutputstream = ((CodedOutputStream) (obj1));
        alt1 = ((alt) (obj));
        codedoutputstream1 = ((CodedOutputStream) (obj1));
        aly1.a(((CodedOutputStream) (obj1)), date, thread, throwable, "crash", true);
_L3:
        CommonUtils.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
_L4:
        aly1.a(false);
        aly1.d();
        ang.a(aly1.l, a, 4, f);
        if (!aly1.d.h())
        {
            aly1.f();
        }
        return;
_L2:
        gya.a().c("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", null);
        obj = null;
        obj1 = alt1;
          goto _L3
        date;
        obj = null;
_L7:
        codedoutputstream = codedoutputstream1;
        alt1 = ((alt) (obj));
        gya.a().c("CrashlyticsCore", "An error occurred in the fatal exception logger", date);
        codedoutputstream = codedoutputstream1;
        alt1 = ((alt) (obj));
        amg.a(date, ((java.io.OutputStream) (obj)));
        CommonUtils.a(codedoutputstream1, "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
          goto _L4
        aly1;
        alt1 = null;
_L6:
        CommonUtils.a(codedoutputstream, "Failed to flush to session begin file.");
        CommonUtils.a(alt1, "Failed to close fatal exception file output stream.");
        throw aly1;
        aly1;
        if (true) goto _L6; else goto _L5
_L5:
        date;
          goto _L7
    }

    private static void a(CodedOutputStream codedoutputstream, File file)
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
        gya.a().c("CrashlyticsCore", (new StringBuilder("Tried to include a file that doesn't exist: ")).append(file.getName()).toString(), null);
        return;
        codedoutputstream;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(CodedOutputStream codedoutputstream, String s)
    {
        int i1 = 0;
        while (i1 < 4) 
        {
            String s1 = (new String[] {
                "SessionUser", "SessionApp", "SessionOS", "SessionDevice"
            })[i1];
            File afile[] = a(((FilenameFilter) (new ama((new StringBuilder()).append(s).append(s1).toString()))));
            if (afile.length == 0)
            {
                gya.a().c("CrashlyticsCore", (new StringBuilder("Can't find ")).append(s1).append(" data for session ID ").append(s).toString(), null);
            } else
            {
                gya.a().a("CrashlyticsCore", (new StringBuilder("Collecting ")).append(s1).append(" data for session ID ").append(s).toString());
                a(codedoutputstream, afile[0]);
            }
            i1++;
        }
    }

    private void a(CodedOutputStream codedoutputstream, Date date, Thread thread, Throwable throwable, String s, boolean flag)
    {
        Object obj1 = ((gyh) (d)).k;
        long l3 = date.getTime() / 1000L;
        float f1 = CommonUtils.c(((Context) (obj1)));
        int l1 = CommonUtils.a(((Context) (obj1)), p);
        boolean flag1 = CommonUtils.d(((Context) (obj1)));
        int i2 = ((Context) (obj1)).getResources().getConfiguration().orientation;
        long l4 = CommonUtils.b() - CommonUtils.b(((Context) (obj1)));
        long l5 = CommonUtils.b(Environment.getDataDirectory().getPath());
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = CommonUtils.a(((Context) (obj1)).getPackageName(), ((Context) (obj1)));
        LinkedList linkedlist = new LinkedList();
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        Object obj;
        ami ami1;
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
            date = Collections.unmodifiableMap(d.a);
            if (date != null && date.size() > 1)
            {
                date = new TreeMap(date);
            }
        }
        obj1 = r;
        ami1 = q;
        obj1.a = runningappprocessinfo;
        obj1.c = linkedlist;
        obj1.d = astacktraceelement;
        obj1.b = ((Thread []) (obj));
        obj = ami1.a();
        if (obj == null)
        {
            gya.a().a("CrashlyticsCore", "No log data to include with this event.");
        }
        ami1.b();
        codedoutputstream.e(10, 2);
        j1 = CodedOutputStream.b(1, l3);
        k1 = CodedOutputStream.b(2, alr.a(s));
        j2 = ((and) (obj1)).a(thread, throwable, i2, date);
        k2 = CodedOutputStream.d(3);
        l2 = CodedOutputStream.f(j2);
        i3 = and.a(l1, i2, l4, l5);
        k1 = j1 + 0 + k1 + (j2 + (k2 + l2)) + (i3 + (CodedOutputStream.d(5) + CodedOutputStream.f(i3)));
        j1 = k1;
        if (obj != null)
        {
            j1 = and.a(((alr) (obj)));
            j1 = k1 + (j1 + (CodedOutputStream.d(6) + CodedOutputStream.f(j1)));
        }
        codedoutputstream.e(j1);
        codedoutputstream.a(1, l3);
        codedoutputstream.a(2, alr.a(s));
        codedoutputstream.e(3, 2);
        codedoutputstream.e(((and) (obj1)).a(thread, throwable, i2, date));
        ((and) (obj1)).a(codedoutputstream, thread, throwable);
        if (date != null && !date.isEmpty())
        {
            and.a(codedoutputstream, date);
        }
        if (((and) (obj1)).a != null)
        {
            if (((and) (obj1)).a.importance != 100)
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
        codedoutputstream.e(and.a(l1, i2, l4, l5));
        codedoutputstream.a(f1);
        codedoutputstream.a(l1);
        codedoutputstream.a(3, flag1);
        codedoutputstream.a(4, i2);
        codedoutputstream.a(5, l4);
        codedoutputstream.a(6, l5);
        if (obj != null)
        {
            codedoutputstream.e(6, 2);
            codedoutputstream.e(and.a(((alr) (obj))));
            codedoutputstream.a(1, ((alr) (obj)));
        }
    }

    private static void a(CodedOutputStream codedoutputstream, File afile[], String s)
    {
        Arrays.sort(afile, CommonUtils.a);
        int j1 = afile.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            File file = afile[i1];
            try
            {
                gya.a().a("CrashlyticsCore", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
                    s, file.getName()
                }));
                a(codedoutputstream, file);
            }
            catch (Exception exception)
            {
                gya.a().c("CrashlyticsCore", "Error writting non-fatal to session.", exception);
            }
            i1++;
        }
    }

    private void a(String s)
    {
        s = a(((FilenameFilter) (new amb(s))));
        int j1 = s.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            s[i1].delete();
        }

    }

    private void a(String s, int i1)
    {
        ang.a(l, new ama((new StringBuilder()).append(s).append("SessionEvent").toString()), i1, f);
    }

    private void a(boolean flag)
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
        Arrays.sort(afile, e);
        i2 = Math.min(i1 + 8, afile.length);
        for (int j1 = 0; j1 < i2; j1++)
        {
            hashset.add(a(afile[j1]));
        }

        q.a(hashset);
        afile = a(((FilenameFilter) (new alz((byte)0))));
        i2 = afile.length;
        for (int k1 = 0; k1 < i2; k1++)
        {
            File file = afile[k1];
            String s = file.getName();
            Matcher matcher = g.matcher(s);
            matcher.matches();
            if (!hashset.contains(matcher.group(1)))
            {
                gya.a().a("CrashlyticsCore", (new StringBuilder("Trimming open session file: ")).append(s).toString());
                file.delete();
            }
        }

        afile1 = e();
        Arrays.sort(afile1, e);
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
        java.io.Closeable closeable = new alt(l, (new StringBuilder()).append(((String) (obj7))).append("SessionUser").toString());
        obj1 = closeable;
        obj2 = obj6;
        obj6 = CodedOutputStream.a(closeable);
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        if (!b.get()) goto _L4; else goto _L3
_L3:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj7 = d;
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        if (!((gyh) (obj7)).m.b) goto _L6; else goto _L5
_L5:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj7 = ((alu) (obj7)).c;
_L16:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        flag = ((gyh) (d)).m.b;
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        flag = ((gyh) (d)).m.b;
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj7 = new anf(((String) (obj7)), null, null);
_L17:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        if (((anf) (obj7)).b != null)
        {
            break MISSING_BLOCK_LABEL_1749;
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        if (((anf) (obj7)).c != null)
        {
            break MISSING_BLOCK_LABEL_1749;
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        String s1 = ((anf) (obj7)).d;
        int l1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_1749;
        }
        l1 = 1;
_L24:
        if (l1 == 0) goto _L8; else goto _L7
_L7:
        CommonUtils.a(((java.io.Flushable) (obj6)), "Failed to flush session user file.");
        CommonUtils.a(closeable, "Failed to close session user file.");
_L18:
        obj = alu.i();
        if (obj == null) goto _L10; else goto _L9
_L9:
        l1 = ((hbu) (obj)).a;
        gya.a().a("CrashlyticsCore", "Closing open sessions.");
_L15:
        if (i1 >= afile1.length) goto _L12; else goto _L11
_L11:
        Exception exception1;
        Object obj8 = afile1[i1];
        obj7 = a(((File) (obj8)));
        gya.a().a("CrashlyticsCore", (new StringBuilder("Closing session: ")).append(((String) (obj7))).toString());
        gya.a().a("CrashlyticsCore", (new StringBuilder("Collecting session parts for ID ")).append(((String) (obj7))).toString());
        obj6 = a(((FilenameFilter) (new ama((new StringBuilder()).append(((String) (obj7))).append("SessionCrash").toString()))));
        Exception exception;
        String s2;
        String s3;
        alr alr1;
        int j2;
        boolean flag1;
        if (obj6 != null && obj6.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gya.a().a("CrashlyticsCore", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
            obj7, Boolean.valueOf(flag)
        }));
        closeable = a(((FilenameFilter) (new ama((new StringBuilder()).append(((String) (obj7))).append("SessionEvent").toString()))));
        if (closeable != null && closeable.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        gya.a().a("CrashlyticsCore", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
            obj7, Boolean.valueOf(flag1)
        }));
        if (!flag && !flag1) goto _L14; else goto _L13
_L13:
        obj2 = null;
        obj1 = null;
        obj = new alt(l, ((String) (obj7)));
        obj1 = obj2;
        obj2 = CodedOutputStream.a(((java.io.OutputStream) (obj)));
        obj1 = obj2;
        gya.a().a("CrashlyticsCore", (new StringBuilder("Collecting SessionStart data for session ID ")).append(((String) (obj7))).toString());
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
            break MISSING_BLOCK_LABEL_1013;
        }
        obj1 = obj2;
        if (closeable.length <= l1)
        {
            break MISSING_BLOCK_LABEL_1001;
        }
        obj1 = obj2;
        gya.a().a("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
            Integer.valueOf(l1)
        }));
        obj1 = obj2;
        a(((String) (obj7)), l1);
        obj1 = obj2;
        closeable = a(((FilenameFilter) (new ama((new StringBuilder()).append(((String) (obj7))).append("SessionEvent").toString()))));
        obj1 = obj2;
        a(((CodedOutputStream) (obj2)), ((File []) (closeable)), ((String) (obj7)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1029;
        }
        obj1 = obj2;
        a(((CodedOutputStream) (obj2)), obj6[0]);
        obj1 = obj2;
        ((CodedOutputStream) (obj2)).a(11, 1);
        obj1 = obj2;
        ((CodedOutputStream) (obj2)).b(12, 3);
        CommonUtils.a(((java.io.Flushable) (obj2)), "Error flushing session file stream");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
_L19:
        gya.a().a("CrashlyticsCore", (new StringBuilder("Removing session part files for ID ")).append(((String) (obj7))).toString());
        a(((String) (obj7)));
        i1++;
          goto _L15
_L6:
        obj7 = null;
          goto _L16
_L4:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj7 = (new amk(l)).a(((String) (obj7)));
          goto _L17
_L8:
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj8 = ((anf) (obj7)).b;
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        s2 = ((anf) (obj7)).c;
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        s3 = ((anf) (obj7)).d;
        obj7 = obj8;
        if (obj8 == null)
        {
            obj7 = "";
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj7 = alr.a(((String) (obj7)));
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        obj8 = and.a(s2);
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        alr1 = and.a(s3);
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        j2 = CodedOutputStream.b(1, ((alr) (obj7))) + 0;
        l1 = j2;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_1312;
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        l1 = j2 + CodedOutputStream.b(2, ((alr) (obj8)));
        j2 = l1;
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_1342;
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        j2 = l1 + CodedOutputStream.b(3, alr1);
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
        ((CodedOutputStream) (obj6)).a(1, ((alr) (obj7)));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_1418;
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        ((CodedOutputStream) (obj6)).a(2, ((alr) (obj8)));
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_1441;
        }
        obj = obj6;
        obj1 = closeable;
        obj2 = obj6;
        ((CodedOutputStream) (obj6)).a(3, alr1);
        CommonUtils.a(((java.io.Flushable) (obj6)), "Failed to flush session user file.");
        CommonUtils.a(closeable, "Failed to close session user file.");
          goto _L18
        exception1;
        closeable = null;
_L23:
        obj = obj2;
        obj1 = closeable;
        amg.a(exception1, closeable);
        obj = obj2;
        obj1 = closeable;
        throw exception1;
        exception;
        obj2 = obj1;
        obj1 = obj;
        obj = exception;
_L22:
        CommonUtils.a(((java.io.Flushable) (obj1)), "Failed to flush session user file.");
        CommonUtils.a(((java.io.Closeable) (obj2)), "Failed to close session user file.");
        throw obj;
        obj2;
        obj = null;
        obj1 = null;
_L21:
        gya.a().c("CrashlyticsCore", (new StringBuilder("Failed to write session file for session ID: ")).append(((String) (obj7))).toString(), ((Throwable) (obj2)));
        amg.a(((Throwable) (obj2)), ((java.io.OutputStream) (obj1)));
        CommonUtils.a(((java.io.Flushable) (obj)), "Error flushing session file stream");
        if (obj1 != null)
        {
            try
            {
                ((alt) (obj1)).a();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                gya.a().c("CrashlyticsCore", "Error closing session file stream in the presence of an exception", ((Throwable) (obj)));
            }
        }
          goto _L19
        obj2;
        obj = null;
_L20:
        CommonUtils.a(((java.io.Flushable) (obj1)), "Error flushing session file stream");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
        throw obj2;
_L14:
        gya.a().a("CrashlyticsCore", (new StringBuilder("No events present for session ID ")).append(((String) (obj7))).toString());
          goto _L19
_L10:
        gya.a().a("CrashlyticsCore", "Unable to close session. Settings are not loaded.");
_L12:
        return;
_L2:
        gya.a().a("CrashlyticsCore", "No open sessions to be closed.");
        return;
        obj2;
          goto _L20
        obj2;
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
          goto _L20
        obj2;
        Object obj4 = null;
        obj1 = obj;
        obj = obj4;
          goto _L21
        exception1;
        obj1 = obj2;
        Object obj5 = obj;
        obj2 = exception1;
        obj = obj1;
        obj1 = obj5;
          goto _L21
        obj;
        obj2 = null;
          goto _L22
        exception1;
          goto _L23
        l1 = 0;
          goto _L24
    }

    static boolean a(aly aly1, boolean flag)
    {
        aly1.p = flag;
        return flag;
    }

    static File[] a(aly aly1, FilenameFilter filenamefilter)
    {
        return aly1.a(filenamefilter);
    }

    static ami b(aly aly1)
    {
        return aly1.q;
    }

    static Map b()
    {
        return h;
    }

    static void b(aly aly1, Date date, Thread thread, Throwable throwable)
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
        s = aly1.c();
        if (s == null) goto _L2; else goto _L1
_L1:
        alu.c(s);
        Object obj;
        gya.a().a("CrashlyticsCore", (new StringBuilder("Crashlytics is logging non-fatal exception \"")).append(throwable).append("\" from thread ").append(thread.getName()).toString());
        obj = CommonUtils.a(aly1.i.getAndIncrement());
        obj = (new StringBuilder()).append(s).append("SessionEvent").append(((String) (obj))).toString();
        obj = new alt(aly1.l, ((String) (obj)));
        codedoutputstream = obj1;
        codedoutputstream1 = codedoutputstream2;
        codedoutputstream2 = CodedOutputStream.a(((java.io.OutputStream) (obj)));
        codedoutputstream = codedoutputstream2;
        codedoutputstream1 = codedoutputstream2;
        aly1.a(codedoutputstream2, date, thread, throwable, "error", false);
        CommonUtils.a(codedoutputstream2, "Failed to flush to non-fatal file.");
        CommonUtils.a(((java.io.Closeable) (obj)), "Failed to close non-fatal file output stream.");
        break MISSING_BLOCK_LABEL_175;
        thread;
        date = null;
_L6:
        gya.a().c("CrashlyticsCore", "An error occurred in the non-fatal exception logger", thread);
        amg.a(thread, date);
        CommonUtils.a(codedoutputstream1, "Failed to flush to non-fatal file.");
        CommonUtils.a(date, "Failed to close non-fatal file output stream.");
          goto _L3
        aly1;
        date = null;
_L5:
        CommonUtils.a(codedoutputstream, "Failed to flush to non-fatal file.");
        CommonUtils.a(date, "Failed to close non-fatal file output stream.");
        throw aly1;
_L3:
        try
        {
            aly1.a(s, 64);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aly aly1)
        {
            gya.a().c("CrashlyticsCore", "An error occurred when trimming non-fatal files.", aly1);
        }
        return;
_L2:
        gya.a().c("CrashlyticsCore", "Tried to write a non-fatal exception while no session was open.", null);
        return;
        aly1;
        date = ((Date) (obj));
        continue; /* Loop/switch isn't completed */
        aly1;
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
        Arrays.sort(afile, e);
        if (afile.length > 0)
        {
            return a(afile[0]);
        } else
        {
            return null;
        }
    }

    static String c(aly aly1)
    {
        return aly1.c();
    }

    static File d(aly aly1)
    {
        return aly1.l;
    }

    private void d()
    {
        Object obj;
        Object obj1;
        Object obj2;
        CodedOutputStream codedoutputstream;
        Object obj5;
        String s;
        obj5 = new Date();
        s = (new als(o)).toString();
        gya.a().a("CrashlyticsCore", (new StringBuilder("Opening an new session with ID ")).append(s).toString());
        obj = null;
        obj1 = null;
        codedoutputstream = null;
        obj2 = null;
        Object obj3 = new alt(l, (new StringBuilder()).append(s).append("BeginSession").toString());
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream = CodedOutputStream.a(((java.io.OutputStream) (obj3)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        and.a(codedoutputstream, s, String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
            "2.3.5.79"
        }), ((Date) (obj5)).getTime() / 1000L);
        CommonUtils.a(codedoutputstream, "Failed to flush to session begin file.");
        CommonUtils.a(((java.io.Closeable) (obj3)), "Failed to close begin session file.");
        obj = null;
        obj1 = null;
        codedoutputstream = null;
        obj2 = null;
        obj3 = new alt(l, (new StringBuilder()).append(s).append("SessionApp").toString());
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream = CodedOutputStream.a(((java.io.OutputStream) (obj3)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        Object obj7 = d.d;
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        Object obj9 = d.f;
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        Object obj8 = d.g;
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        Object obj6 = o.a();
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        int i1 = DeliveryMechanism.a(d.e).id;
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj5 = r;
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj7 = alr.a(((String) (obj7)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj9 = alr.a(((String) (obj9)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj8 = alr.a(((String) (obj8)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj6 = alr.a(((String) (obj6)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.e(7, 2);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        int j1 = CodedOutputStream.b(1, ((alr) (obj7)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        int k1 = CodedOutputStream.b(2, ((alr) (obj9)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        int l1 = CodedOutputStream.b(3, ((alr) (obj8)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        int i2 = ((and) (obj5)).a();
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.e(j1 + 0 + k1 + l1 + (i2 + (CodedOutputStream.d(5) + CodedOutputStream.f(i2))) + CodedOutputStream.b(6, ((alr) (obj6))) + CodedOutputStream.d(10, i1));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(1, ((alr) (obj7)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(2, ((alr) (obj9)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(3, ((alr) (obj8)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.e(5, 2);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.e(((and) (obj5)).a());
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        new gyx();
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(gyx.a(((and) (obj5)).e));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(6, ((alr) (obj6)));
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
        obj3 = new alt(l, (new StringBuilder()).append(s).append("SessionOS").toString());
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream = CodedOutputStream.a(((java.io.OutputStream) (obj3)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        boolean flag = CommonUtils.f(((gyh) (d)).k);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj5 = alr.a(android.os.Build.VERSION.RELEASE);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        obj6 = alr.a(android.os.Build.VERSION.CODENAME);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.e(8, 2);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.e(and.a(((alr) (obj5)), ((alr) (obj6))));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.b(1, 3);
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(2, ((alr) (obj5)));
        obj = codedoutputstream;
        obj1 = obj3;
        obj2 = codedoutputstream;
        codedoutputstream.a(3, ((alr) (obj6)));
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
        obj3 = new alt(l, (new StringBuilder()).append(s).append("SessionDevice").toString());
        obj1 = obj5;
        obj2 = codedoutputstream;
        codedoutputstream = CodedOutputStream.a(((java.io.OutputStream) (obj3)));
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        obj6 = ((gyh) (d)).k;
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        obj7 = new StatFs(Environment.getDataDirectory().getPath());
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        obj8 = o;
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
        obj5 = o.d();
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        k1 = CommonUtils.g(((Context) (obj6)));
        obj1 = codedoutputstream;
        obj2 = codedoutputstream;
        and.a(codedoutputstream, ((String) (obj)), i1, Build.MODEL, j1, l2, l3 * l4, flag, ((Map) (obj5)), k1, Build.MANUFACTURER, Build.PRODUCT);
        CommonUtils.a(codedoutputstream, "Failed to flush session device info.");
        CommonUtils.a(((java.io.Closeable) (obj3)), "Failed to close session device file.");
        q.a(s);
        return;
        Object obj4;
        obj4;
        obj3 = null;
_L16:
        obj = obj2;
        obj1 = obj3;
        amg.a(((Throwable) (obj4)), ((java.io.OutputStream) (obj3)));
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
        amg.a(((Throwable) (obj4)), ((java.io.OutputStream) (obj3)));
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
        amg.a(((Throwable) (obj4)), ((java.io.OutputStream) (obj3)));
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
        amg.a(((Throwable) (obj1)), ((java.io.OutputStream) (obj)));
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

    static void e(aly aly1)
    {
        aly1.d();
    }

    private File[] e()
    {
        return a(new ama("BeginSession"));
    }

    static alu f(aly aly1)
    {
        return aly1.d;
    }

    private void f()
    {
        File afile[] = a(a);
        int j1 = afile.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            File file = afile[i1];
            c.a(new Runnable(file) {

                private File a;
                private aly b;

                public final void run()
                {
                    if (CommonUtils.l(((gyh) (aly.f(b))).k))
                    {
                        gya.a().a("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                        Object obj = hbw.a().a();
                        obj = aly.f(b).a(((hbz) (obj)));
                        if (obj != null)
                        {
                            (new anb(((amd) (obj)))).a(new ane(a, aly.b()));
                        }
                    }
                }

            
            {
                b = aly.this;
                a = file;
                super();
            }
            });
        }

    }

    static void g(aly aly1)
    {
        aly1.a(true);
    }

    final File[] a(FilenameFilter filenamefilter)
    {
        File afile[] = l.listFiles(filenamefilter);
        filenamefilter = afile;
        if (afile == null)
        {
            filenamefilter = new File[0];
        }
        return filenamefilter;
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        b.set(true);
        gya.a().a("CrashlyticsCore", (new StringBuilder("Crashlytics is handling uncaught exception \"")).append(throwable).append("\" from thread ").append(thread.getName()).toString());
        if (!j.getAndSet(true))
        {
            gya.a().a("CrashlyticsCore", "Unregistering power receivers.");
            Context context = ((gyh) (d)).k;
            context.unregisterReceiver(n);
            context.unregisterReceiver(m);
        }
        Date date = new Date();
        c.a(new Callable(date, thread, throwable) {

            private Date a;
            private Thread b;
            private Throwable c;
            private aly d;

            public final Object call()
            {
                aly.a(d, a, b, c);
                return null;
            }

            
            {
                d = aly.this;
                a = date;
                b = thread;
                c = throwable;
                super();
            }
        });
        gya.a().a("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
        k.uncaughtException(thread, throwable);
        b.set(false);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        gya.a().c("CrashlyticsCore", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
        gya.a().a("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
        k.uncaughtException(thread, throwable);
        b.set(false);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        throw thread;
        obj;
        gya.a().a("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
        k.uncaughtException(thread, throwable);
        b.set(false);
        throw obj;
    }

    static 
    {
        new FilenameFilter() {

            public final boolean accept(File file, String s)
            {
                return aly.a().matcher(s).matches();
            }

        };
    }

    // Unreferenced inner class aly$15

/* anonymous class */
    final class _cls15
        implements Callable
    {

        private long a;
        private String b;
        private aly c;

        public final Object call()
        {
            if (!aly.a(c).get())
            {
                ami ami1 = aly.b(c);
                long l1 = a;
                String s = b;
                ami1.a.a(l1, s);
            }
            return null;
        }

            
            {
                c = aly.this;
                a = l1;
                b = s;
                super();
            }
    }


    // Unreferenced inner class aly$16

/* anonymous class */
    final class _cls16
        implements Runnable
    {

        private Date a;
        private Thread b;
        private Throwable c;
        private aly d;

        public final void run()
        {
            if (!aly.a(d).get())
            {
                aly.b(d, a, b, c);
            }
        }

            
            {
                d = aly.this;
                a = date;
                b = thread;
                c = throwable;
                super();
            }
    }


    // Unreferenced inner class aly$2

/* anonymous class */
    final class _cls2
        implements Callable
    {

        private String a;
        private aly b;

        private Void a()
        {
            Object obj;
            Object obj1;
            Object obj3;
            obj = null;
            String s = aly.c(b);
            obj3 = new amk(aly.d(b));
            obj1 = new anf(a, null, null);
            obj3 = ((amk) (obj3)).c(s);
            String s1;
            s1 = amk.a(((anf) (obj1)));
            obj1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((File) (obj3))), amk.a));
            obj = obj1;
            ((Writer) (obj1)).write(s1);
            obj = obj1;
            ((Writer) (obj1)).flush();
            CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close user metadata file.");
            return null;
            Object obj2;
            obj2;
            obj1 = null;
_L4:
            obj = obj1;
            gya.a().c("CrashlyticsCore", "Error serializing user metadata.", ((Throwable) (obj2)));
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

        public final Object call()
        {
            return a();
        }

            
            {
                b = aly.this;
                a = s;
                super();
            }
    }


    // Unreferenced inner class aly$3

/* anonymous class */
    final class _cls3
        implements Callable
    {

        private Map a;
        private aly b;

        private Void a()
        {
            Object obj;
            Object obj1;
            Object obj3;
            obj = null;
            String s = aly.c(b);
            obj3 = new amk(aly.d(b));
            obj1 = a;
            obj3 = ((amk) (obj3)).d(s);
            String s1;
            s1 = amk.a(((Map) (obj1)));
            obj1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(((File) (obj3))), amk.a));
            obj = obj1;
            ((Writer) (obj1)).write(s1);
            obj = obj1;
            ((Writer) (obj1)).flush();
            CommonUtils.a(((java.io.Closeable) (obj1)), "Failed to close key/value metadata file.");
            return null;
            Object obj2;
            obj2;
            obj1 = null;
_L4:
            obj = obj1;
            gya.a().c("CrashlyticsCore", "Error serializing key/value metadata.", ((Throwable) (obj2)));
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

        public final Object call()
        {
            return a();
        }

            
            {
                b = aly.this;
                a = map;
                super();
            }
    }


    // Unreferenced inner class aly$4

/* anonymous class */
    final class _cls4
        implements Callable
    {

        private aly a;

        public final Object call()
        {
            aly.e(a);
            return null;
        }

            
            {
                a = aly.this;
                super();
            }
    }


    // Unreferenced inner class aly$5

/* anonymous class */
    final class _cls5
        implements Callable
    {

        private aly a;

        public final Object call()
        {
            if (!aly.a(a).get())
            {
                gya.a().a("CrashlyticsCore", "Finalizing previously open sessions.");
                alu alu1 = aly.f(a);
                anl anl = null;
                if (alu1.h != null)
                {
                    anl = alu1.h.d();
                }
                if (anl != null)
                {
                    aly.a(a, anl);
                }
                aly.g(a);
                gya.a().a("CrashlyticsCore", "Closed all previously open sessions");
                return Boolean.valueOf(true);
            } else
            {
                gya.a().a("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
                return Boolean.valueOf(false);
            }
        }

            
            {
                a = aly.this;
                super();
            }
    }


    // Unreferenced inner class aly$6

/* anonymous class */
    final class _cls6
        implements Runnable
    {

        private aly a;

        public final void run()
        {
            aly aly1 = a;
            File afile[] = aly.a(a, alt.a);
            File file = new File(aly1.d.g(), "invalidClsFiles");
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
                gya.a().a("CrashlyticsCore", (new StringBuilder("Found invalid session part file: ")).append(obj).toString());
                obj = aly.a(((File) (obj)));
                FilenameFilter filenamefilter = new FilenameFilter(((String) (obj))) {

                    private String a;

                    public final boolean accept(File file, String s)
                    {
                        return s.startsWith(a);
                    }

            
            {
                a = s;
                super();
            }
                };
                gya.a().a("CrashlyticsCore", (new StringBuilder("Deleting all part files for invalid session: ")).append(((String) (obj))).toString());
                File afile1[] = aly1.a(filenamefilter);
                int j2 = afile1.length;
                for (int l1 = 0; l1 < j2; l1++)
                {
                    File file1 = afile1[l1];
                    gya.a().a("CrashlyticsCore", (new StringBuilder("Deleting session file: ")).append(file1).toString());
                    file1.delete();
                }

            }

        }

            
            {
                a = aly.this;
                super();
            }
    }

}
