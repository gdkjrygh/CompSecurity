// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import b.a.a.a.a.b.l;
import b.a.a.a.a.b.r;
import b.a.a.a.a.b.x;
import b.a.a.a.a.g.p;
import b.a.a.a.f;
import b.a.a.a.q;
import com.a.a.c.a.d;
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

// Referenced classes of package com.a.a:
//            aa, ag, ah, ai, 
//            h, au, aj, ak, 
//            f, an, bn, d, 
//            aw, at, bp, ao, 
//            c, am, af, t, 
//            ae, ab, ac, ad, 
//            al

final class z
    implements Thread.UncaughtExceptionHandler
{

    static final FilenameFilter a = new aa();
    static final Comparator b = new ag();
    static final Comparator c = new ah();
    static final FilenameFilter d = new ai();
    private static final Pattern e = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map f = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final Thread.UncaughtExceptionHandler i;
    private final File j;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final BroadcastReceiver l = new ak(this);
    private final BroadcastReceiver m = new aj(this);
    private final t n;
    private final x o;
    private boolean p;
    private final h q;
    private final au r;
    private final bn s;

    z(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, t t1, x x1, bn bn1, h h1)
    {
        i = uncaughtexceptionhandler;
        n = t1;
        o = x1;
        q = h1;
        s = bn1;
        j = h1.q();
        r = new au(h1.w(), j);
        b.a.a.a.f.c().a("Fabric", "Checking for previous crash marker.");
        uncaughtexceptionhandler = new File(q.q(), "crash_marker");
        if (uncaughtexceptionhandler.exists())
        {
            uncaughtexceptionhandler.delete();
        }
        uncaughtexceptionhandler = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        t1 = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        x1 = h1.w();
        x1.registerReceiver(m, uncaughtexceptionhandler);
        x1.registerReceiver(l, t1);
        h.set(true);
    }

    private static String a(File file)
    {
        return file.getName().substring(0, 35);
    }

    static AtomicBoolean a(z z1)
    {
        return z1.k;
    }

    private static void a(com.a.a.f f1, File file)
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
        b.a.a.a.a.b.l.a(file, "Failed to close file input stream.");
        f1.a(abyte0);
        return;
        f1;
        file = null;
_L6:
        b.a.a.a.a.b.l.a(file, "Failed to close file input stream.");
        throw f1;
_L2:
        b.a.a.a.f.c().c("Fabric", (new StringBuilder("Tried to include a file that doesn't exist: ")).append(file.getName()).toString(), null);
        return;
        f1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(com.a.a.f f1, String s1)
    {
        int i1 = 0;
        while (i1 < 4) 
        {
            String s2 = (new String[] {
                "SessionUser", "SessionApp", "SessionOS", "SessionDevice"
            })[i1];
            File afile[] = a(((FilenameFilter) (new an((new StringBuilder()).append(s1).append(s2).toString()))));
            if (afile.length == 0)
            {
                b.a.a.a.f.c().c("Fabric", (new StringBuilder("Can't find ")).append(s2).append(" data for session ID ").append(s1).toString(), null);
            } else
            {
                b.a.a.a.f.c().a("Fabric", (new StringBuilder("Collecting ")).append(s2).append(" data for session ID ").append(s1).toString());
                a(f1, afile[0]);
            }
            i1++;
        }
    }

    private void a(com.a.a.f f1, Date date, Thread thread, Throwable throwable, String s1)
    {
        float f2;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        LinkedList linkedlist;
        StackTraceElement astacktraceelement[];
        Thread athread[];
        Context context;
        int j1;
        int k1;
        long l1;
        long l2;
        long l3;
        long l4;
        boolean flag;
        context = q.w();
        l1 = date.getTime() / 1000L;
        f2 = b.a.a.a.a.b.l.c(context);
        j1 = b.a.a.a.a.b.l.a(context, p);
        flag = b.a.a.a.a.b.l.d(context);
        k1 = context.getResources().getConfiguration().orientation;
        l2 = b.a.a.a.a.b.l.b();
        l3 = b.a.a.a.a.b.l.b(context);
        l4 = b.a.a.a.a.b.l.b(Environment.getDataDirectory().getPath());
        runningappprocessinfo = b.a.a.a.a.b.l.a(context.getPackageName(), context);
        linkedlist = new LinkedList();
        astacktraceelement = throwable.getStackTrace();
        date = Thread.getAllStackTraces();
        athread = new Thread[date.size()];
        date = date.entrySet().iterator();
        for (int i1 = 0; date.hasNext(); i1++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)date.next();
            athread[i1] = (Thread)entry.getKey();
            linkedlist.add(entry.getValue());
        }

        if (b.a.a.a.a.b.l.a(context, "com.crashlytics.CollectCustomKeys", true)) goto _L2; else goto _L1
_L1:
        date = new TreeMap();
_L4:
        s.a(f1, l1, thread, throwable, s1, athread, f2, j1, flag, k1, l2 - l3, l4, runningappprocessinfo, linkedlist, astacktraceelement, r, date);
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

    private static void a(com.a.a.f f1, File afile[], String s1)
    {
        Arrays.sort(afile, l.a);
        int j1 = afile.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            File file = afile[i1];
            try
            {
                b.a.a.a.f.c().a("Fabric", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
                    s1, file.getName()
                }));
                a(f1, file);
            }
            catch (Exception exception)
            {
                b.a.a.a.f.c().c("Fabric", "Error writting non-fatal to session.", exception);
            }
            i1++;
        }
    }

    static void a(z z1, d d1)
    {
        Object obj = null;
        String s1 = z1.h();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        com.a.a.h.a(s1);
        z1 = new com.a.a.d(z1.j, (new StringBuilder()).append(s1).append("SessionCrash").toString());
        Object obj1;
        try
        {
            obj = com.a.a.f.a(z1);
        }
        catch (Exception exception1)
        {
            obj = z1;
            d1 = null;
            z1 = exception1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = z1;
            d1 = null;
            z1 = exception;
        }
        aw.a(d1, ((com.a.a.f) (obj)));
_L4:
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        b.a.a.a.a.b.l.a(z1, "Failed to close fatal exception file output stream.");
        return;
_L2:
        b.a.a.a.f.c().c("Fabric", "Tried to write a native crash while no session was open.", null);
        z1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        z1;
        obj = null;
        d1 = null;
_L8:
        b.a.a.a.f.c().c("Fabric", "An error occurred in the native crash logger", z1);
        at.a(z1, ((java.io.OutputStream) (obj)));
        b.a.a.a.a.b.l.a(d1, "Failed to flush to session begin file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
        return;
        z1;
        obj = null;
        d1 = null;
_L6:
        b.a.a.a.a.b.l.a(d1, "Failed to flush to session begin file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
        throw z1;
        obj1;
        z z2 = z1;
        d1 = ((d) (obj));
        z1 = ((z) (obj1));
        obj = z2;
        continue; /* Loop/switch isn't completed */
        z1;
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        z z3 = z1;
        d1 = ((d) (obj));
        z1 = ((z) (obj1));
        obj = z3;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void a(z z1, Date date, Thread thread, Throwable throwable)
    {
        com.a.a.f f1;
        com.a.a.d d1;
        com.a.a.f f2;
        Object obj1;
        Object obj2;
        f2 = null;
        f1 = null;
        obj2 = null;
        obj1 = null;
        d1 = null;
        Object obj;
        (new File(z1.j, "crash_marker")).createNewFile();
        obj = z1.h();
        if (obj == null) goto _L2; else goto _L1
_L1:
        com.a.a.h.a(((String) (obj)));
        obj = new com.a.a.d(z1.j, (new StringBuilder()).append(((String) (obj))).append("SessionCrash").toString());
        f1 = obj2;
        d1 = ((com.a.a.d) (obj));
        f2 = ((com.a.a.f) (obj1));
        obj1 = com.a.a.f.a(((java.io.OutputStream) (obj)));
        f1 = ((com.a.a.f) (obj1));
        d1 = ((com.a.a.d) (obj));
        f2 = ((com.a.a.f) (obj1));
        z1.a(((com.a.a.f) (obj1)), date, thread, throwable, "crash");
_L3:
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
_L4:
        z1.j();
        z1.i();
        bp.a(z1.j, a, 4, c);
        if (!z1.q.r())
        {
            z1.l();
        }
        return;
_L2:
        b.a.a.a.f.c().c("Fabric", "Tried to write a fatal exception while no session was open.", null);
        obj = null;
        obj1 = d1;
          goto _L3
        date;
        obj = null;
_L7:
        f1 = f2;
        d1 = ((com.a.a.d) (obj));
        b.a.a.a.f.c().c("Fabric", "An error occurred in the fatal exception logger", date);
        f1 = f2;
        d1 = ((com.a.a.d) (obj));
        at.a(date, ((java.io.OutputStream) (obj)));
        b.a.a.a.a.b.l.a(f2, "Failed to flush to session begin file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
          goto _L4
        z1;
        d1 = null;
_L6:
        b.a.a.a.a.b.l.a(f1, "Failed to flush to session begin file.");
        b.a.a.a.a.b.l.a(d1, "Failed to close fatal exception file output stream.");
        throw z1;
        z1;
        if (true) goto _L6; else goto _L5
_L5:
        date;
          goto _L7
    }

    private void a(String s1)
    {
        s1 = a(((FilenameFilter) (new ao(s1))));
        int j1 = s1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            s1[i1].delete();
        }

    }

    static boolean a(z z1, boolean flag)
    {
        z1.p = flag;
        return flag;
    }

    static File[] a(z z1, FilenameFilter filenamefilter)
    {
        return z1.a(filenamefilter);
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

    static void b(z z1)
    {
        z1.i();
    }

    static h c(z z1)
    {
        return z1.q;
    }

    static void d(z z1)
    {
        z1.j();
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
        File afile[] = a(new an("BeginSession"));
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
        obj7 = (new c(o)).toString();
        b.a.a.a.f.c().a("Fabric", (new StringBuilder("Opening an new session with ID ")).append(((String) (obj7))).toString());
        obj = null;
        obj1 = null;
        obj5 = null;
        obj2 = null;
        Object obj3 = new com.a.a.d(j, (new StringBuilder()).append(((String) (obj7))).append("BeginSession").toString());
        obj1 = obj3;
        obj2 = obj5;
        obj5 = com.a.a.f.a(((java.io.OutputStream) (obj3)));
        obj = obj5;
        obj1 = obj3;
        obj2 = obj5;
        bn.a(((com.a.a.f) (obj5)), ((String) (obj7)), String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
            "2.2.4.42"
        }), ((Date) (obj6)).getTime() / 1000L);
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj5)), "Failed to flush to session begin file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj3)), "Failed to close begin session file.");
        obj3 = null;
        obj = null;
        obj6 = null;
        obj5 = null;
        obj1 = null;
        obj2 = new com.a.a.d(j, (new StringBuilder()).append(((String) (obj7))).append("SessionApp").toString());
        obj = obj6;
        obj1 = obj5;
        obj3 = com.a.a.f.a(((java.io.OutputStream) (obj2)));
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
        int i1 = b.a.a.a.a.b.r.a(q.i()).a();
        obj = obj3;
        obj1 = obj3;
        s.a(((com.a.a.f) (obj3)), ((String) (obj5)), ((String) (obj6)), s1, s2, i1);
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj3)), "Failed to flush to session app file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        obj2 = null;
        obj6 = null;
        obj1 = null;
        obj5 = null;
        obj = null;
        obj3 = new com.a.a.d(j, (new StringBuilder()).append(((String) (obj7))).append("SessionOS").toString());
        obj = obj6;
        obj1 = obj3;
        obj2 = obj5;
        obj5 = com.a.a.f.a(((java.io.OutputStream) (obj3)));
        obj = obj5;
        obj1 = obj3;
        obj2 = obj5;
        bn.a(((com.a.a.f) (obj5)), b.a.a.a.a.b.l.g(q.w()));
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj5)), "Failed to flush to session OS file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj3)), "Failed to close session OS file.");
        obj3 = null;
        obj = null;
        obj6 = null;
        obj5 = null;
        obj1 = null;
        obj2 = new com.a.a.d(j, (new StringBuilder()).append(((String) (obj7))).append("SessionDevice").toString());
        obj = obj6;
        obj1 = obj5;
        obj3 = com.a.a.f.a(((java.io.OutputStream) (obj2)));
        obj = obj3;
        obj1 = obj3;
        obj5 = q.w();
        obj = obj3;
        obj1 = obj3;
        obj7 = new StatFs(Environment.getDataDirectory().getPath());
        obj = obj3;
        obj1 = obj3;
        obj6 = o.f();
        obj = obj3;
        obj1 = obj3;
        i1 = b.a.a.a.a.b.l.a();
        obj = obj3;
        obj1 = obj3;
        int j1 = Runtime.getRuntime().availableProcessors();
        obj = obj3;
        obj1 = obj3;
        long l1 = b.a.a.a.a.b.l.b();
        obj = obj3;
        obj1 = obj3;
        long l2 = ((StatFs) (obj7)).getBlockCount();
        obj = obj3;
        obj1 = obj3;
        long l3 = ((StatFs) (obj7)).getBlockSize();
        obj = obj3;
        obj1 = obj3;
        boolean flag = b.a.a.a.a.b.l.f(((Context) (obj5)));
        obj = obj3;
        obj1 = obj3;
        obj7 = o.g();
        obj = obj3;
        obj1 = obj3;
        int k1 = b.a.a.a.a.b.l.h(((Context) (obj5)));
        obj = obj3;
        obj1 = obj3;
        bn.a(((com.a.a.f) (obj3)), ((String) (obj6)), i1, Build.MODEL, j1, l1, l2 * l3, flag, ((Map) (obj7)), k1, Build.MANUFACTURER, Build.PRODUCT);
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj3)), "Failed to flush session device info.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close session device file.");
        return;
        Exception exception;
        exception;
        obj3 = null;
_L16:
        obj = obj2;
        obj1 = obj3;
        at.a(exception, ((java.io.OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw exception;
        obj3;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L14:
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close begin session file.");
        throw obj;
        obj2;
        obj = obj3;
_L12:
        at.a(((Throwable) (obj2)), ((java.io.OutputStream) (obj)));
        throw obj2;
        obj3;
        obj2 = obj;
        obj = obj1;
        obj1 = obj3;
_L10:
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj)), "Failed to flush to session app file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        throw obj1;
        exception;
        obj3 = null;
        obj2 = obj;
_L8:
        obj = obj2;
        obj1 = obj3;
        at.a(exception, ((java.io.OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw exception;
        obj3;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L6:
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj1)), "Failed to flush to session OS file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close session OS file.");
        throw obj;
        obj2;
        obj = obj3;
_L4:
        at.a(((Throwable) (obj2)), ((java.io.OutputStream) (obj)));
        throw obj2;
        Object obj4;
        obj4;
        obj2 = obj;
        obj = obj1;
        obj1 = obj4;
_L2:
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj)), "Failed to flush session device info.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close session device file.");
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
        Object obj3;
        HashSet hashset = new HashSet();
        File afile[] = k();
        Arrays.sort(afile, b);
        int l1 = Math.min(8, afile.length);
        for (int i1 = 0; i1 < l1; i1++)
        {
            hashset.add(a(afile[i1]));
        }

        afile = a(new am((byte)0));
        l1 = afile.length;
        for (int j1 = 0; j1 < l1; j1++)
        {
            File file = afile[j1];
            String s1 = file.getName();
            Matcher matcher = e.matcher(s1);
            matcher.matches();
            if (!hashset.contains(matcher.group(1)))
            {
                b.a.a.a.f.c().a("Fabric", (new StringBuilder("Trimming open session file: ")).append(s1).toString());
                file.delete();
            }
        }

        obj3 = h();
        if (obj3 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        Object obj7;
        obj = null;
        obj1 = null;
        obj7 = null;
        obj2 = null;
        obj3 = new com.a.a.d(j, (new StringBuilder()).append(((String) (obj3))).append("SessionUser").toString());
        obj1 = obj3;
        obj2 = obj7;
        obj7 = com.a.a.f.a(((java.io.OutputStream) (obj3)));
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        Object obj8 = q.m();
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        String s2 = q.o();
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        String s3 = q.n();
        if (obj8 != null || s2 != null || s3 != null) goto _L4; else goto _L3
_L3:
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj7)), "Failed to flush session user file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj3)), "Failed to close session user file.");
_L13:
        obj = com.a.a.h.s();
        if (obj == null) goto _L6; else goto _L5
_L5:
        int i2;
        i2 = ((p) (obj)).c;
        b.a.a.a.f.c().a("Fabric", "Closing all open sessions.");
        obj8 = k();
        if (obj8 == null || obj8.length <= 0) goto _L8; else goto _L7
_L7:
        int k1;
        int j2;
        j2 = obj8.length;
        k1 = 0;
_L12:
        if (k1 >= j2) goto _L8; else goto _L9
_L9:
        Exception exception1;
        s3 = obj8[k1];
        s2 = a(s3);
        b.a.a.a.f.c().a("Fabric", (new StringBuilder("Closing session: ")).append(s2).toString());
        b.a.a.a.f.c().a("Fabric", (new StringBuilder("Collecting session parts for ID ")).append(s2).toString());
        obj7 = a(new an((new StringBuilder()).append(s2).append("SessionCrash").toString()));
        Exception exception;
        boolean flag;
        boolean flag1;
        if (obj7 != null && obj7.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a.a.a.f.c().a("Fabric", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
            s2, Boolean.valueOf(flag)
        }));
        obj3 = a(new an((new StringBuilder()).append(s2).append("SessionEvent").toString()));
        if (obj3 != null && obj3.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b.a.a.a.f.c().a("Fabric", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
            s2, Boolean.valueOf(flag1)
        }));
        if (!flag && !flag1) goto _L11; else goto _L10
_L10:
        obj2 = null;
        obj1 = null;
        obj = new com.a.a.d(j, s2);
        obj1 = obj2;
        obj2 = com.a.a.f.a(((java.io.OutputStream) (obj)));
        obj1 = obj2;
        b.a.a.a.f.c().a("Fabric", (new StringBuilder("Collecting SessionStart data for session ID ")).append(s2).toString());
        obj1 = obj2;
        a(((com.a.a.f) (obj2)), s3);
        obj1 = obj2;
        ((com.a.a.f) (obj2)).a(4, (new Date()).getTime() / 1000L);
        obj1 = obj2;
        ((com.a.a.f) (obj2)).a(5, flag);
        obj1 = obj2;
        a(((com.a.a.f) (obj2)), s2);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_869;
        }
        obj1 = obj2;
        if (obj3.length <= i2)
        {
            break MISSING_BLOCK_LABEL_859;
        }
        obj1 = obj2;
        b.a.a.a.f.c().a("Fabric", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
            Integer.valueOf(i2)
        }));
        obj1 = obj2;
        bp.a(j, new an((new StringBuilder()).append(s2).append("SessionEvent").toString()), i2, c);
        obj1 = obj2;
        obj3 = a(new an((new StringBuilder()).append(s2).append("SessionEvent").toString()));
        obj1 = obj2;
        a(((com.a.a.f) (obj2)), ((File []) (obj3)), s2);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_884;
        }
        obj1 = obj2;
        a(((com.a.a.f) (obj2)), obj7[0]);
        obj1 = obj2;
        ((com.a.a.f) (obj2)).a(11, 1);
        obj1 = obj2;
        ((com.a.a.f) (obj2)).b(12, 3);
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj2)), "Error flushing session file stream");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
_L14:
        b.a.a.a.f.c().a("Fabric", (new StringBuilder("Removing session part files for ID ")).append(s2).toString());
        a(s2);
        k1++;
          goto _L12
_L4:
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        bn.a(((com.a.a.f) (obj7)), ((String) (obj8)), s2, s3);
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj7)), "Failed to flush session user file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj3)), "Failed to close session user file.");
          goto _L13
        exception1;
        obj3 = null;
_L18:
        obj = obj2;
        obj1 = obj3;
        at.a(exception1, ((java.io.OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw exception1;
        exception;
        obj2 = obj1;
        obj1 = obj;
        obj = exception;
_L17:
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj1)), "Failed to flush session user file.");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close session user file.");
        throw obj;
        obj2;
        obj = null;
        obj1 = null;
_L16:
        b.a.a.a.f.c().c("Fabric", (new StringBuilder("Failed to write session file for session ID: ")).append(s2).toString(), ((Throwable) (obj2)));
        at.a(((Throwable) (obj2)), ((java.io.OutputStream) (obj1)));
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj)), "Error flushing session file stream");
        if (obj1 != null)
        {
            try
            {
                ((com.a.a.d) (obj1)).a();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                b.a.a.a.f.c().c("Fabric", "Error closing session file stream in the presence of an exception", ((Throwable) (obj)));
            }
        }
          goto _L14
        obj2;
        obj = null;
_L15:
        b.a.a.a.a.b.l.a(((java.io.Flushable) (obj1)), "Error flushing session file stream");
        b.a.a.a.a.b.l.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
        throw obj2;
_L11:
        b.a.a.a.f.c().a("Fabric", (new StringBuilder("No events present for session ID ")).append(s2).toString());
          goto _L14
_L6:
        b.a.a.a.f.c().a("Fabric", "Unable to close session. Settings are not loaded.");
_L8:
        return;
_L2:
        b.a.a.a.f.c().a("Fabric", "No open sessions exist.");
        return;
        obj2;
          goto _L15
        obj2;
        Object obj4 = obj1;
        obj1 = obj;
        obj = obj4;
          goto _L15
        obj2;
        Object obj5 = null;
        obj1 = obj;
        obj = obj5;
          goto _L16
        exception1;
        obj1 = obj2;
        Object obj6 = obj;
        obj2 = exception1;
        obj = obj1;
        obj1 = obj6;
          goto _L16
        obj;
        obj2 = null;
          goto _L17
        exception1;
          goto _L18
    }

    private File[] k()
    {
        return a(new an("BeginSession"));
    }

    private void l()
    {
        File afile[] = a(a);
        int j1 = afile.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            File file = afile[i1];
            n.a(new af(this, file));
        }

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
            b.a.a.a.f.c().a("Fabric", (new StringBuilder("Found invalid session part file: ")).append(obj).toString());
            obj = a(((File) (obj)));
            ae ae1 = new ae(this, ((String) (obj)));
            b.a.a.a.f.c().a("Fabric", (new StringBuilder("Deleting all part files for invalid session: ")).append(((String) (obj))).toString());
            File afile1[] = a(((FilenameFilter) (ae1)));
            int j2 = afile1.length;
            for (int l1 = 0; l1 < j2; l1++)
            {
                File file1 = afile1[l1];
                b.a.a.a.f.c().a("Fabric", (new StringBuilder("Deleting session file: ")).append(file1).toString());
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
        n.b(new ab(this));
    }

    final boolean c()
    {
        return k().length > 0;
    }

    final boolean d()
    {
        return ((Boolean)n.a(new ac(this))).booleanValue();
    }

    final void e()
    {
        n.a(new ad(this));
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        k.set(true);
        b.a.a.a.f.c().a("Fabric", (new StringBuilder("Crashlytics is handling uncaught exception \"")).append(throwable).append("\" from thread ").append(thread.getName()).toString());
        if (!h.getAndSet(true))
        {
            b.a.a.a.f.c().a("Fabric", "Unregistering power receivers.");
            Context context = q.w();
            context.unregisterReceiver(m);
            context.unregisterReceiver(l);
        }
        Date date = new Date();
        n.a(new al(this, date, thread, throwable));
        b.a.a.a.f.c().a("Fabric", "Crashlytics completed exception processing. Invoking default exception handler.");
        i.uncaughtException(thread, throwable);
        k.set(false);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        b.a.a.a.f.c().c("Fabric", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
        b.a.a.a.f.c().a("Fabric", "Crashlytics completed exception processing. Invoking default exception handler.");
        i.uncaughtException(thread, throwable);
        k.set(false);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        throw thread;
        obj;
        b.a.a.a.f.c().a("Fabric", "Crashlytics completed exception processing. Invoking default exception handler.");
        i.uncaughtException(thread, throwable);
        k.set(false);
        throw obj;
    }

}
