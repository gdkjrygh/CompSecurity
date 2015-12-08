// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.n;
import b.a.a.a.a.b.t;
import b.a.a.a.a.g.p;
import b.a.a.a.d;
import b.a.a.a.o;
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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.a.a.c:
//            y, ae, af, ag, 
//            g, ar, ah, ai, 
//            f, ay, d, at, 
//            aq, ba, c, ad, 
//            r, ak, al, ac, 
//            z, aa, ab, aj

final class x
    implements Thread.UncaughtExceptionHandler
{
    private static final class a
        implements FilenameFilter
    {

        public final boolean accept(File file, String s1)
        {
            return !x.a.accept(file, s1) && x.f().matcher(s1).matches();
        }

        private a()
        {
        }

        a(byte byte0)
        {
            this();
        }
    }

    static final class b
        implements FilenameFilter
    {

        private final String a;

        public final boolean accept(File file, String s1)
        {
            return s1.contains(a) && !s1.endsWith(".cls_temp");
        }

        public b(String s1)
        {
            a = s1;
        }
    }

    static final class c
        implements FilenameFilter
    {

        private final String a;

        public final boolean accept(File file, String s1)
        {
            while (s1.equals((new StringBuilder()).append(a).append(".cls").toString()) || !s1.contains(a) || s1.endsWith(".cls_temp")) 
            {
                return false;
            }
            return true;
        }

        public c(String s1)
        {
            a = s1;
        }
    }


    static final FilenameFilter a = new y();
    static final Comparator b = new ae();
    static final Comparator c = new af();
    static final FilenameFilter d = new ag();
    private static final Pattern e = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map f = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final Thread.UncaughtExceptionHandler i;
    private final File j;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final BroadcastReceiver l = new ai(this);
    private final BroadcastReceiver m = new ah(this);
    private final r n;
    private final t o;
    private boolean p;
    private final g q;
    private final ar r;
    private final ay s;

    x(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, r r1, t t1, ay ay1, g g1)
    {
        i = uncaughtexceptionhandler;
        n = r1;
        o = t1;
        q = g1;
        s = ay1;
        j = g1.q();
        r = new ar(g1.v(), j);
        b.a.a.a.d.c();
        uncaughtexceptionhandler = new File(q.q(), "crash_marker");
        if (uncaughtexceptionhandler.exists())
        {
            uncaughtexceptionhandler.delete();
        }
        uncaughtexceptionhandler = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        r1 = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        t1 = g1.v();
        t1.registerReceiver(m, uncaughtexceptionhandler);
        t1.registerReceiver(l, r1);
        h.set(true);
    }

    private static String a(File file)
    {
        return file.getName().substring(0, 35);
    }

    static AtomicBoolean a(x x1)
    {
        return x1.k;
    }

    private static void a(f f1, File file)
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
        b.a.a.a.a.b.j.a(file, "Failed to close file input stream.");
        f1.a(abyte0);
        return;
        f1;
        file = null;
_L6:
        b.a.a.a.a.b.j.a(file, "Failed to close file input stream.");
        throw f1;
_L2:
        b.a.a.a.d.c().b("Fabric", (new StringBuilder("Tried to include a file that doesn't exist: ")).append(file.getName()).toString(), null);
        return;
        f1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(f f1, String s1)
    {
        int i1 = 0;
        while (i1 < 4) 
        {
            String s2 = (new String[] {
                "SessionUser", "SessionApp", "SessionOS", "SessionDevice"
            })[i1];
            File afile[] = a(((FilenameFilter) (new b((new StringBuilder()).append(s1).append(s2).toString()))));
            if (afile.length == 0)
            {
                b.a.a.a.d.c().b("Fabric", (new StringBuilder("Can't find ")).append(s2).append(" data for session ID ").append(s1).toString(), null);
            } else
            {
                b.a.a.a.d.c();
                (new StringBuilder("Collecting ")).append(s2).append(" data for session ID ").append(s1);
                a(f1, afile[0]);
            }
            i1++;
        }
    }

    private void a(f f1, Date date, Thread thread, Throwable throwable, String s1, boolean flag)
    {
        float f2;
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
        context = q.v();
        l1 = date.getTime() / 1000L;
        f2 = b.a.a.a.a.b.j.c(context);
        j1 = b.a.a.a.a.b.j.a(context, p);
        flag1 = b.a.a.a.a.b.j.d(context);
        k1 = context.getResources().getConfiguration().orientation;
        l2 = b.a.a.a.a.b.j.b();
        l3 = b.a.a.a.a.b.j.b(context);
        l4 = b.a.a.a.a.b.j.b(Environment.getDataDirectory().getPath());
        runningappprocessinfo = b.a.a.a.a.b.j.a(context.getPackageName(), context);
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
        if (b.a.a.a.a.b.j.a(context, "com.crashlytics.CollectCustomKeys", true)) goto _L2; else goto _L1
_L1:
        date = new TreeMap();
_L4:
        s.a(f1, l1, thread, throwable, s1, athread, f2, j1, flag1, k1, l2 - l3, l4, runningappprocessinfo, linkedlist, astacktraceelement, r, date);
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

    private static void a(f f1, File afile[], String s1)
    {
        Arrays.sort(afile, j.a);
        int j1 = afile.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            File file = afile[i1];
            try
            {
                b.a.a.a.d.c();
                String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
                    s1, file.getName()
                });
                a(f1, file);
            }
            catch (Exception exception)
            {
                b.a.a.a.d.c().b("Fabric", "Error writting non-fatal to session.", exception);
            }
            i1++;
        }
    }

    static void a(x x1, com.a.a.c.a.a.d d1)
    {
        Object obj = null;
        String s1 = x1.h();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        com.a.a.c.g.d(s1);
        x1 = new com.a.a.c.d(x1.j, (new StringBuilder()).append(s1).append("SessionCrash").toString());
        Object obj1;
        try
        {
            obj = com.a.a.c.f.a(x1);
        }
        catch (Exception exception1)
        {
            obj = x1;
            d1 = null;
            x1 = exception1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = x1;
            d1 = null;
            x1 = exception;
        }
        at.a(d1, ((f) (obj)));
_L4:
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        b.a.a.a.a.b.j.a(x1, "Failed to close fatal exception file output stream.");
        return;
_L2:
        b.a.a.a.d.c().b("Fabric", "Tried to write a native crash while no session was open.", null);
        x1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        x1;
        obj = null;
        d1 = null;
_L8:
        b.a.a.a.d.c().b("Fabric", "An error occurred in the native crash logger", x1);
        aq.a(x1, ((java.io.OutputStream) (obj)));
        b.a.a.a.a.b.j.a(d1, "Failed to flush to session begin file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
        return;
        x1;
        obj = null;
        d1 = null;
_L6:
        b.a.a.a.a.b.j.a(d1, "Failed to flush to session begin file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
        throw x1;
        obj1;
        x x2 = x1;
        d1 = ((com.a.a.c.a.a.d) (obj));
        x1 = ((x) (obj1));
        obj = x2;
        continue; /* Loop/switch isn't completed */
        x1;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        x x3 = x1;
        d1 = ((com.a.a.c.a.a.d) (obj));
        x1 = ((x) (obj1));
        obj = x3;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void a(x x1, Date date, Thread thread, Throwable throwable)
    {
        f f1;
        com.a.a.c.d d1;
        f f2;
        Object obj1;
        Object obj2;
        f2 = null;
        f1 = null;
        obj2 = null;
        obj1 = null;
        d1 = null;
        Object obj;
        (new File(x1.j, "crash_marker")).createNewFile();
        obj = x1.h();
        if (obj == null) goto _L2; else goto _L1
_L1:
        com.a.a.c.g.d(((String) (obj)));
        obj = new com.a.a.c.d(x1.j, (new StringBuilder()).append(((String) (obj))).append("SessionCrash").toString());
        f1 = obj2;
        d1 = ((com.a.a.c.d) (obj));
        f2 = ((f) (obj1));
        obj1 = com.a.a.c.f.a(((java.io.OutputStream) (obj)));
        f1 = ((f) (obj1));
        d1 = ((com.a.a.c.d) (obj));
        f2 = ((f) (obj1));
        x1.a(((f) (obj1)), date, thread, throwable, "crash", true);
_L3:
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
_L4:
        x1.j();
        x1.i();
        ba.a(x1.j, a, 4, c);
        if (!x1.q.r())
        {
            x1.l();
        }
        return;
_L2:
        b.a.a.a.d.c().b("Fabric", "Tried to write a fatal exception while no session was open.", null);
        obj = null;
        obj1 = d1;
          goto _L3
        date;
        obj = null;
_L7:
        f1 = f2;
        d1 = ((com.a.a.c.d) (obj));
        b.a.a.a.d.c().b("Fabric", "An error occurred in the fatal exception logger", date);
        f1 = f2;
        d1 = ((com.a.a.c.d) (obj));
        aq.a(date, ((java.io.OutputStream) (obj)));
        b.a.a.a.a.b.j.a(f2, "Failed to flush to session begin file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
          goto _L4
        x1;
        d1 = null;
_L6:
        b.a.a.a.a.b.j.a(f1, "Failed to flush to session begin file.");
        b.a.a.a.a.b.j.a(d1, "Failed to close fatal exception file output stream.");
        throw x1;
        x1;
        if (true) goto _L6; else goto _L5
_L5:
        date;
          goto _L7
    }

    private void a(String s1)
    {
        s1 = a(((FilenameFilter) (new c(s1))));
        int j1 = s1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            s1[i1].delete();
        }

    }

    private void a(String s1, int i1)
    {
        ba.a(j, new b((new StringBuilder()).append(s1).append("SessionEvent").toString()), i1, c);
    }

    static boolean a(x x1, boolean flag)
    {
        x1.p = flag;
        return flag;
    }

    static File[] a(x x1, FilenameFilter filenamefilter)
    {
        return x1.a(filenamefilter);
    }

    private File[] a(FilenameFilter filenamefilter)
    {
        File afile[] = j.listFiles(filenamefilter);
        filenamefilter = afile;
        if (afile == null)
        {
            filenamefilter = new File[0];
        }
        return filenamefilter;
    }

    static ar b(x x1)
    {
        return x1.r;
    }

    static void b(x x1, Date date, Thread thread, Throwable throwable)
    {
        f f1;
        f f2;
        f f3;
        Object obj1;
        String s1;
        f1 = null;
        obj1 = null;
        f3 = null;
        f2 = null;
        s1 = x1.h();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        com.a.a.c.g.c(s1);
        Object obj;
        b.a.a.a.d.c();
        (new StringBuilder("Crashlytics is logging non-fatal exception \"")).append(throwable).append("\" from thread ").append(thread.getName());
        obj = b.a.a.a.a.b.j.a(x1.g.getAndIncrement());
        obj = (new StringBuilder()).append(s1).append("SessionEvent").append(((String) (obj))).toString();
        obj = new com.a.a.c.d(x1.j, ((String) (obj)));
        f1 = obj1;
        f2 = f3;
        f3 = com.a.a.c.f.a(((java.io.OutputStream) (obj)));
        f1 = f3;
        f2 = f3;
        x1.a(f3, date, thread, throwable, "error", false);
        b.a.a.a.a.b.j.a(f3, "Failed to flush to non-fatal file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj)), "Failed to close non-fatal file output stream.");
        break MISSING_BLOCK_LABEL_167;
        thread;
        date = null;
_L6:
        b.a.a.a.d.c().b("Fabric", "An error occurred in the non-fatal exception logger", thread);
        aq.a(thread, date);
        b.a.a.a.a.b.j.a(f2, "Failed to flush to non-fatal file.");
        b.a.a.a.a.b.j.a(date, "Failed to close non-fatal file output stream.");
          goto _L3
        x1;
        date = null;
_L5:
        b.a.a.a.a.b.j.a(f1, "Failed to flush to non-fatal file.");
        b.a.a.a.a.b.j.a(date, "Failed to close non-fatal file output stream.");
        throw x1;
_L3:
        try
        {
            x1.a(s1, 64);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (x x1)
        {
            b.a.a.a.d.c().b("Fabric", "An error occurred when trimming non-fatal files.", x1);
        }
        return;
_L2:
        b.a.a.a.d.c().b("Fabric", "Tried to write a non-fatal exception while no session was open.", null);
        return;
        x1;
        date = ((Date) (obj));
        continue; /* Loop/switch isn't completed */
        x1;
        f1 = f2;
        if (true) goto _L5; else goto _L4
_L4:
        thread;
        date = ((Date) (obj));
          goto _L6
    }

    static void c(x x1)
    {
        x1.i();
    }

    static g d(x x1)
    {
        return x1.q;
    }

    static void e(x x1)
    {
        x1.j();
    }

    static Pattern f()
    {
        return e;
    }

    static Map g()
    {
        return f;
    }

    private String h()
    {
        File afile[] = a(new b("BeginSession"));
        Arrays.sort(afile, b);
        if (afile.length > 0)
        {
            return a(afile[0]);
        } else
        {
            return null;
        }
    }

    private void i()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj5;
        Object obj6;
        Object obj7;
        obj6 = new Date();
        obj7 = (new com.a.a.c.c(o)).toString();
        b.a.a.a.d.c();
        obj = null;
        obj1 = null;
        obj5 = null;
        obj2 = null;
        Object obj3 = new com.a.a.c.d(j, (new StringBuilder()).append(((String) (obj7))).append("BeginSession").toString());
        obj1 = obj3;
        obj2 = obj5;
        obj5 = com.a.a.c.f.a(((java.io.OutputStream) (obj3)));
        obj = obj5;
        obj1 = obj3;
        obj2 = obj5;
        ay.a(((f) (obj5)), ((String) (obj7)), String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
            "2.3.2.56"
        }), ((Date) (obj6)).getTime() / 1000L);
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj5)), "Failed to flush to session begin file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj3)), "Failed to close begin session file.");
        obj3 = null;
        obj = null;
        obj6 = null;
        obj5 = null;
        obj1 = null;
        obj2 = new com.a.a.c.d(j, (new StringBuilder()).append(((String) (obj7))).append("SessionApp").toString());
        obj = obj6;
        obj1 = obj5;
        obj3 = com.a.a.c.f.a(((java.io.OutputStream) (obj2)));
        obj = obj3;
        obj1 = obj3;
        obj5 = q.h();
        obj = obj3;
        obj1 = obj3;
        obj6 = q.k();
        obj = obj3;
        obj1 = obj3;
        String s1 = q.j();
        obj = obj3;
        obj1 = obj3;
        String s2 = o.b();
        obj = obj3;
        obj1 = obj3;
        int i1 = b.a.a.a.a.b.n.a(q.i()).a();
        obj = obj3;
        obj1 = obj3;
        s.a(((f) (obj3)), ((String) (obj5)), ((String) (obj6)), s1, s2, i1);
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj3)), "Failed to flush to session app file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        obj2 = null;
        obj6 = null;
        obj1 = null;
        obj5 = null;
        obj = null;
        obj3 = new com.a.a.c.d(j, (new StringBuilder()).append(((String) (obj7))).append("SessionOS").toString());
        obj = obj6;
        obj1 = obj3;
        obj2 = obj5;
        obj5 = com.a.a.c.f.a(((java.io.OutputStream) (obj3)));
        obj = obj5;
        obj1 = obj3;
        obj2 = obj5;
        ay.a(((f) (obj5)), b.a.a.a.a.b.j.h(q.v()));
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj5)), "Failed to flush to session OS file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj3)), "Failed to close session OS file.");
        obj3 = null;
        obj = null;
        obj6 = null;
        obj5 = null;
        obj1 = null;
        obj2 = new com.a.a.c.d(j, (new StringBuilder()).append(((String) (obj7))).append("SessionDevice").toString());
        obj = obj6;
        obj1 = obj5;
        obj3 = com.a.a.c.f.a(((java.io.OutputStream) (obj2)));
        obj = obj3;
        obj1 = obj3;
        obj5 = q.v();
        obj = obj3;
        obj1 = obj3;
        obj7 = new StatFs(Environment.getDataDirectory().getPath());
        obj = obj3;
        obj1 = obj3;
        obj6 = o.f();
        obj = obj3;
        obj1 = obj3;
        i1 = b.a.a.a.a.b.j.a();
        obj = obj3;
        obj1 = obj3;
        int j1 = Runtime.getRuntime().availableProcessors();
        obj = obj3;
        obj1 = obj3;
        long l1 = b.a.a.a.a.b.j.b();
        obj = obj3;
        obj1 = obj3;
        long l2 = ((StatFs) (obj7)).getBlockCount();
        obj = obj3;
        obj1 = obj3;
        long l3 = ((StatFs) (obj7)).getBlockSize();
        obj = obj3;
        obj1 = obj3;
        boolean flag = b.a.a.a.a.b.j.g(((Context) (obj5)));
        obj = obj3;
        obj1 = obj3;
        obj7 = o.g();
        obj = obj3;
        obj1 = obj3;
        int k1 = b.a.a.a.a.b.j.i(((Context) (obj5)));
        obj = obj3;
        obj1 = obj3;
        ay.a(((f) (obj3)), ((String) (obj6)), i1, Build.MODEL, j1, l1, l2 * l3, flag, ((Map) (obj7)), k1, Build.MANUFACTURER, Build.PRODUCT);
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj3)), "Failed to flush session device info.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj2)), "Failed to close session device file.");
        return;
        Exception exception;
        exception;
        obj3 = null;
_L16:
        obj = obj2;
        obj1 = obj3;
        aq.a(exception, ((java.io.OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw exception;
        obj3;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L14:
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj2)), "Failed to close begin session file.");
        throw obj;
        obj2;
        obj = obj3;
_L12:
        aq.a(((Throwable) (obj2)), ((java.io.OutputStream) (obj)));
        throw obj2;
        obj3;
        obj2 = obj;
        obj = obj1;
        obj1 = obj3;
_L10:
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj)), "Failed to flush to session app file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        throw obj1;
        exception;
        obj3 = null;
        obj2 = obj;
_L8:
        obj = obj2;
        obj1 = obj3;
        aq.a(exception, ((java.io.OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw exception;
        obj3;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L6:
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj1)), "Failed to flush to session OS file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj2)), "Failed to close session OS file.");
        throw obj;
        obj2;
        obj = obj3;
_L4:
        aq.a(((Throwable) (obj2)), ((java.io.OutputStream) (obj)));
        throw obj2;
        Object obj4;
        obj4;
        obj2 = obj;
        obj = obj1;
        obj1 = obj4;
_L2:
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj)), "Failed to flush session device info.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj2)), "Failed to close session device file.");
        throw obj1;
        obj1;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj4;
        obj = obj2;
        obj2 = obj4;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
        if (true) goto _L8; else goto _L7
_L7:
        obj1;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L10; else goto _L9
_L9:
        obj4;
        obj = obj2;
        obj2 = obj4;
        if (true) goto _L12; else goto _L11
_L11:
        obj;
        obj2 = null;
        if (true) goto _L14; else goto _L13
_L13:
        exception;
        if (true) goto _L16; else goto _L15
_L15:
    }

    private void j()
    {
        Object obj4;
        HashSet hashset = new HashSet();
        File afile[] = k();
        Arrays.sort(afile, b);
        int l1 = Math.min(8, afile.length);
        for (int i1 = 0; i1 < l1; i1++)
        {
            hashset.add(a(afile[i1]));
        }

        afile = a(new a((byte)0));
        l1 = afile.length;
        for (int j1 = 0; j1 < l1; j1++)
        {
            File file = afile[j1];
            Object obj3 = file.getName();
            obj3 = e.matcher(((CharSequence) (obj3)));
            ((Matcher) (obj3)).matches();
            if (!hashset.contains(((Matcher) (obj3)).group(1)))
            {
                b.a.a.a.d.c();
                file.delete();
            }
        }

        obj4 = h();
        if (obj4 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        Object obj8;
        obj = null;
        obj1 = null;
        obj8 = null;
        obj2 = null;
        obj4 = new com.a.a.c.d(j, (new StringBuilder()).append(((String) (obj4))).append("SessionUser").toString());
        obj1 = obj4;
        obj2 = obj8;
        obj8 = com.a.a.c.f.a(((java.io.OutputStream) (obj4)));
        obj = obj8;
        obj1 = obj4;
        obj2 = obj8;
        Object obj9 = q.m();
        obj = obj8;
        obj1 = obj4;
        obj2 = obj8;
        String s1 = q.o();
        obj = obj8;
        obj1 = obj4;
        obj2 = obj8;
        String s2 = q.n();
        if (obj9 != null || s1 != null || s2 != null) goto _L4; else goto _L3
_L3:
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj8)), "Failed to flush session user file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj4)), "Failed to close session user file.");
_L13:
        obj = com.a.a.c.g.s();
        if (obj == null) goto _L6; else goto _L5
_L5:
        int i2;
        i2 = ((p) (obj)).c;
        b.a.a.a.d.c();
        obj9 = k();
        if (obj9 == null || obj9.length <= 0) goto _L8; else goto _L7
_L7:
        int k1;
        int j2;
        j2 = obj9.length;
        k1 = 0;
_L12:
        if (k1 >= j2) goto _L8; else goto _L9
_L9:
        Exception exception1;
        s2 = obj9[k1];
        s1 = a(s2);
        b.a.a.a.d.c();
        b.a.a.a.d.c();
        obj8 = a(new b((new StringBuilder()).append(s1).append("SessionCrash").toString()));
        Exception exception;
        boolean flag;
        boolean flag1;
        if (obj8 != null && obj8.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a.a.a.d.c();
        String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
            s1, Boolean.valueOf(flag)
        });
        obj4 = a(new b((new StringBuilder()).append(s1).append("SessionEvent").toString()));
        if (obj4 != null && obj4.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b.a.a.a.d.c();
        String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
            s1, Boolean.valueOf(flag1)
        });
        if (!flag && !flag1) goto _L11; else goto _L10
_L10:
        obj2 = null;
        obj1 = null;
        obj = new com.a.a.c.d(j, s1);
        obj1 = obj2;
        obj2 = com.a.a.c.f.a(((java.io.OutputStream) (obj)));
        obj1 = obj2;
        b.a.a.a.d.c();
        obj1 = obj2;
        a(((f) (obj2)), s2);
        obj1 = obj2;
        ((f) (obj2)).a(4, (new Date()).getTime() / 1000L);
        obj1 = obj2;
        ((f) (obj2)).a(5, flag);
        obj1 = obj2;
        a(((f) (obj2)), s1);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_719;
        }
        obj1 = obj2;
        if (obj4.length <= i2)
        {
            break MISSING_BLOCK_LABEL_709;
        }
        obj1 = obj2;
        b.a.a.a.d.c();
        obj1 = obj2;
        String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
            Integer.valueOf(i2)
        });
        obj1 = obj2;
        a(s1, i2);
        obj1 = obj2;
        obj4 = a(new b((new StringBuilder()).append(s1).append("SessionEvent").toString()));
        obj1 = obj2;
        a(((f) (obj2)), ((File []) (obj4)), s1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_734;
        }
        obj1 = obj2;
        a(((f) (obj2)), obj8[0]);
        obj1 = obj2;
        ((f) (obj2)).a(11, 1);
        obj1 = obj2;
        ((f) (obj2)).b(12, 3);
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj2)), "Error flushing session file stream");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
_L14:
        b.a.a.a.d.c();
        a(s1);
        k1++;
          goto _L12
_L4:
        obj = obj8;
        obj1 = obj4;
        obj2 = obj8;
        ay.a(((f) (obj8)), ((String) (obj9)), s1, s2);
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj8)), "Failed to flush session user file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj4)), "Failed to close session user file.");
          goto _L13
        exception1;
        obj4 = null;
_L18:
        obj = obj2;
        obj1 = obj4;
        aq.a(exception1, ((java.io.OutputStream) (obj4)));
        obj = obj2;
        obj1 = obj4;
        throw exception1;
        exception;
        obj2 = obj1;
        obj1 = obj;
        obj = exception;
_L17:
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj1)), "Failed to flush session user file.");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj2)), "Failed to close session user file.");
        throw obj;
        obj2;
        obj = null;
        obj1 = null;
_L16:
        b.a.a.a.d.c().b("Fabric", (new StringBuilder("Failed to write session file for session ID: ")).append(s1).toString(), ((Throwable) (obj2)));
        aq.a(((Throwable) (obj2)), ((java.io.OutputStream) (obj1)));
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj)), "Error flushing session file stream");
        if (obj1 != null)
        {
            try
            {
                ((com.a.a.c.d) (obj1)).a();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                b.a.a.a.d.c().b("Fabric", "Error closing session file stream in the presence of an exception", ((Throwable) (obj)));
            }
        }
          goto _L14
        obj2;
        obj = null;
_L15:
        b.a.a.a.a.b.j.a(((java.io.Flushable) (obj1)), "Error flushing session file stream");
        b.a.a.a.a.b.j.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
        throw obj2;
_L11:
        b.a.a.a.d.c();
          goto _L14
_L6:
        b.a.a.a.d.c();
_L8:
        return;
_L2:
        b.a.a.a.d.c();
        return;
        obj2;
          goto _L15
        obj2;
        Object obj5 = obj1;
        obj1 = obj;
        obj = obj5;
          goto _L15
        obj2;
        Object obj6 = null;
        obj1 = obj;
        obj = obj6;
          goto _L16
        exception1;
        obj1 = obj2;
        Object obj7 = obj;
        obj2 = exception1;
        obj = obj1;
        obj1 = obj7;
          goto _L16
        obj;
        obj2 = null;
          goto _L17
        exception1;
          goto _L18
    }

    private File[] k()
    {
        return a(new b("BeginSession"));
    }

    private void l()
    {
        File afile[] = a(a);
        int j1 = afile.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            File file = afile[i1];
            n.a(new ad(this, file));
        }

    }

    final void a(long l1, String s1)
    {
        n.b(new ak(this, l1, s1));
    }

    final void a(Thread thread, Throwable throwable)
    {
        Date date = new Date();
        n.a(new al(this, date, thread, throwable));
    }

    final void a(File afile[])
    {
        File file = new File(q.q(), "invalidClsFiles");
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
            b.a.a.a.d.c();
            (new StringBuilder("Found invalid session part file: ")).append(obj);
            obj = new ac(this, a(((File) (obj))));
            b.a.a.a.d.c();
            File afile1[] = a(((FilenameFilter) (obj)));
            int j2 = afile1.length;
            for (int l1 = 0; l1 < j2; l1++)
            {
                File file1 = afile1[l1];
                b.a.a.a.d.c();
                (new StringBuilder("Deleting session file: ")).append(file1);
                file1.delete();
            }

        }

    }

    final boolean a()
    {
        return k.get();
    }

    final void b()
    {
        n.b(new z(this));
    }

    final boolean c()
    {
        return k().length > 0;
    }

    final boolean d()
    {
        return ((Boolean)n.a(new aa(this))).booleanValue();
    }

    final void e()
    {
        n.a(new ab(this));
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        k.set(true);
        b.a.a.a.d.c();
        (new StringBuilder("Crashlytics is handling uncaught exception \"")).append(throwable).append("\" from thread ").append(thread.getName());
        if (!h.getAndSet(true))
        {
            b.a.a.a.d.c();
            Context context = q.v();
            context.unregisterReceiver(m);
            context.unregisterReceiver(l);
        }
        Date date = new Date();
        n.a(new aj(this, date, thread, throwable));
        b.a.a.a.d.c();
        i.uncaughtException(thread, throwable);
        k.set(false);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        b.a.a.a.d.c().b("Fabric", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
        b.a.a.a.d.c();
        i.uncaughtException(thread, throwable);
        k.set(false);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        throw thread;
        obj;
        b.a.a.a.d.c();
        i.uncaughtException(thread, throwable);
        k.set(false);
        throw obj;
    }

}
