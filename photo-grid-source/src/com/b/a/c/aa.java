// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.b.l;
import a.a.a.a.a.b.r;
import a.a.a.a.a.b.x;
import a.a.a.a.a.g.p;
import a.a.a.a.f;
import a.a.a.a.s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.b.a.c.a.a.d;
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

// Referenced classes of package com.b.a.c:
//            ab, ah, ai, aj, 
//            h, aw, ak, al, 
//            d, f, ay, az, 
//            au, bx, ao, bu, 
//            ap, an, bw, c, 
//            ag, u, af, ac, 
//            ad, ae, am

final class aa
    implements Thread.UncaughtExceptionHandler
{

    static final FilenameFilter a = new ab();
    static final Comparator b = new ah();
    static final Comparator c = new ai();
    static final FilenameFilter d = new aj();
    private static final Pattern e = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map f = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final Thread.UncaughtExceptionHandler i;
    private final File j;
    private final AtomicBoolean k = new AtomicBoolean(false);
    private final BroadcastReceiver l = new al(this);
    private final BroadcastReceiver m = new ak(this);
    private final u n;
    private final x o;
    private boolean p;
    private final h q;
    private final aw r;
    private final bu s;

    aa(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, u u1, x x1, bu bu1, h h1)
    {
        i = uncaughtexceptionhandler;
        n = u1;
        o = x1;
        q = h1;
        s = bu1;
        j = h1.q();
        r = new aw(h1.v(), j);
        a.a.a.a.f.d();
        uncaughtexceptionhandler = new File(q.q(), "crash_marker");
        if (uncaughtexceptionhandler.exists())
        {
            uncaughtexceptionhandler.delete();
        }
        uncaughtexceptionhandler = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        u1 = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        x1 = h1.v();
        x1.registerReceiver(m, uncaughtexceptionhandler);
        x1.registerReceiver(l, u1);
        h.set(true);
    }

    private static String a(File file)
    {
        return file.getName().substring(0, 35);
    }

    static AtomicBoolean a(aa aa1)
    {
        return aa1.k;
    }

    static void a(aa aa1, d d1)
    {
        com.b.a.c.f f1 = null;
        File afile[];
        afile = aa1.h();
        Arrays.sort(afile, b);
        if (afile.length <= 1) goto _L2; else goto _L1
_L1:
        String s1 = a(afile[1]);
_L12:
        if (s1 == null) goto _L4; else goto _L3
_L3:
        com.b.a.c.d d2;
        com.b.a.c.h.a(s1);
        d2 = new com.b.a.c.d(aa1.j, (new StringBuilder()).append(s1).append("SessionCrash").toString());
        Map map;
        try
        {
            f1 = com.b.a.c.f.a(d2);
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            d1 = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            d1 = null;
        }
        map = (new ay(aa1.j)).b(s1);
        az.a(d1, new aw(aa1.q.v(), aa1.j, s1), map, f1);
_L6:
        a.a.a.a.a.b.l.a(f1, "Failed to flush to session begin file.");
        a.a.a.a.a.b.l.a(d2, "Failed to close fatal exception file output stream.");
        return;
_L2:
        s1 = null;
        continue; /* Loop/switch isn't completed */
_L4:
        a.a.a.a.f.d().b("CrashlyticsCore", "Tried to write a native crash while no session was open.", null);
        d2 = null;
        if (true) goto _L6; else goto _L5
_L5:
        aa1;
        d2 = null;
        d1 = null;
_L10:
        a.a.a.a.f.d().b("CrashlyticsCore", "An error occurred in the native crash logger", aa1);
        au.a(aa1, d2);
        a.a.a.a.a.b.l.a(d1, "Failed to flush to session begin file.");
        a.a.a.a.a.b.l.a(d2, "Failed to close fatal exception file output stream.");
        return;
        aa1;
        d2 = null;
        d1 = null;
_L8:
        a.a.a.a.a.b.l.a(d1, "Failed to flush to session begin file.");
        a.a.a.a.a.b.l.a(d2, "Failed to close fatal exception file output stream.");
        throw aa1;
        aa1;
        d1 = f1;
        continue; /* Loop/switch isn't completed */
        aa1;
        if (true) goto _L8; else goto _L7
_L7:
        aa1;
        d1 = f1;
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L12; else goto _L11
_L11:
    }

    static void a(aa aa1, Date date, Thread thread, Throwable throwable)
    {
        com.b.a.c.d d2;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        obj1 = null;
        obj2 = null;
        obj4 = null;
        obj3 = null;
        d2 = null;
        File afile[];
        (new File(aa1.j, "crash_marker")).createNewFile();
        afile = aa1.h();
        Arrays.sort(afile, b);
        if (afile.length <= 0) goto _L2; else goto _L1
_L1:
        Object obj = a(afile[0]);
_L5:
        if (obj == null) goto _L4; else goto _L3
_L3:
        com.b.a.c.d d1;
        com.b.a.c.h.a(((String) (obj)));
        d1 = new com.b.a.c.d(aa1.j, (new StringBuilder()).append(((String) (obj))).append("SessionCrash").toString());
        obj = obj4;
        d2 = d1;
        obj1 = obj3;
        obj2 = com.b.a.c.f.a(d1);
        obj = obj2;
        d2 = d1;
        obj1 = obj2;
        aa1.a(((com.b.a.c.f) (obj2)), date, thread, throwable, "crash");
_L6:
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj2)), "Failed to flush to session begin file.");
        a.a.a.a.a.b.l.a(d1, "Failed to close fatal exception file output stream.");
_L7:
        aa1.a(false);
        aa1.g();
        bx.a(aa1.j, a, 4, c);
        if (!aa1.q.r())
        {
            aa1.i();
        }
        return;
_L2:
        obj = null;
          goto _L5
_L4:
        a.a.a.a.f.d().b("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", null);
        d1 = null;
        obj2 = d2;
          goto _L6
        date;
        d1 = null;
_L10:
        obj = obj1;
        d2 = d1;
        a.a.a.a.f.d().b("CrashlyticsCore", "An error occurred in the fatal exception logger", date);
        obj = obj1;
        d2 = d1;
        au.a(date, d1);
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        a.a.a.a.a.b.l.a(d1, "Failed to close fatal exception file output stream.");
          goto _L7
        aa1;
        d2 = null;
        obj = obj2;
_L9:
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        a.a.a.a.a.b.l.a(d2, "Failed to close fatal exception file output stream.");
        throw aa1;
        aa1;
        if (true) goto _L9; else goto _L8
_L8:
        date;
          goto _L10
    }

    private static void a(com.b.a.c.f f1, File file)
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
        a.a.a.a.a.b.l.a(file, "Failed to close file input stream.");
        f1.a(abyte0);
        return;
        f1;
        file = null;
_L6:
        a.a.a.a.a.b.l.a(file, "Failed to close file input stream.");
        throw f1;
_L2:
        a.a.a.a.f.d().b("CrashlyticsCore", (new StringBuilder("Tried to include a file that doesn't exist: ")).append(file.getName()).toString(), null);
        return;
        f1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(com.b.a.c.f f1, String s1)
    {
        int i1 = 0;
        while (i1 < 4) 
        {
            String s2 = (new String[] {
                "SessionUser", "SessionApp", "SessionOS", "SessionDevice"
            })[i1];
            File afile[] = a(((FilenameFilter) (new ao((new StringBuilder()).append(s1).append(s2).toString()))));
            if (afile.length == 0)
            {
                a.a.a.a.f.d().b("CrashlyticsCore", (new StringBuilder("Can't find ")).append(s2).append(" data for session ID ").append(s1).toString(), null);
            } else
            {
                a.a.a.a.f.d();
                (new StringBuilder("Collecting ")).append(s2).append(" data for session ID ").append(s1);
                a(f1, afile[0]);
            }
            i1++;
        }
    }

    private void a(com.b.a.c.f f1, Date date, Thread thread, Throwable throwable, String s1)
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
        context = q.v();
        l1 = date.getTime() / 1000L;
        f2 = a.a.a.a.a.b.l.c(context);
        j1 = a.a.a.a.a.b.l.a(context, p);
        flag = a.a.a.a.a.b.l.d(context);
        k1 = context.getResources().getConfiguration().orientation;
        l2 = a.a.a.a.a.b.l.b();
        l3 = a.a.a.a.a.b.l.b(context);
        l4 = a.a.a.a.a.b.l.b(Environment.getDataDirectory().getPath());
        runningappprocessinfo = a.a.a.a.a.b.l.a(context.getPackageName(), context);
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

        if (a.a.a.a.a.b.l.a(context, "com.crashlytics.CollectCustomKeys", true)) goto _L2; else goto _L1
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

    private static void a(com.b.a.c.f f1, File afile[], String s1)
    {
        Arrays.sort(afile, l.a);
        int j1 = afile.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            File file = afile[i1];
            try
            {
                a.a.a.a.f.d();
                String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
                    s1, file.getName()
                });
                a(f1, file);
            }
            catch (Exception exception)
            {
                a.a.a.a.f.d().b("CrashlyticsCore", "Error writting non-fatal to session.", exception);
            }
            i1++;
        }
    }

    private void a(String s1)
    {
        s1 = a(((FilenameFilter) (new ap(s1))));
        int j1 = s1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            s1[i1].delete();
        }

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
        afile = h();
        Arrays.sort(afile, b);
        i2 = Math.min(i1 + 8, afile.length);
        for (int j1 = 0; j1 < i2; j1++)
        {
            hashset.add(a(afile[j1]));
        }

        r.a(hashset);
        afile = a(((FilenameFilter) (new an((byte)0))));
        i2 = afile.length;
        for (int k1 = 0; k1 < i2; k1++)
        {
            File file = afile[k1];
            Object obj3 = file.getName();
            obj3 = e.matcher(((CharSequence) (obj3)));
            ((Matcher) (obj3)).matches();
            if (!hashset.contains(((Matcher) (obj3)).group(1)))
            {
                a.a.a.a.f.d();
                file.delete();
            }
        }

        afile1 = h();
        Arrays.sort(afile1, b);
        if (afile1.length <= i1) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        Object obj2;
        Object obj7;
        Object obj8;
        obj8 = a(afile1[i1]);
        obj = null;
        obj1 = null;
        obj7 = null;
        obj2 = null;
        java.io.Closeable closeable = new com.b.a.c.d(j, (new StringBuilder()).append(((String) (obj8))).append("SessionUser").toString());
        obj1 = closeable;
        obj2 = obj7;
        obj7 = com.b.a.c.f.a(closeable);
        obj = obj7;
        obj1 = closeable;
        obj2 = obj7;
        if (!k.get()) goto _L4; else goto _L3
_L3:
        obj = obj7;
        obj1 = closeable;
        obj2 = obj7;
        obj8 = new bw(q.m(), q.o(), q.n());
_L14:
        obj = obj7;
        obj1 = closeable;
        obj2 = obj7;
        if (((bw) (obj8)).b != null)
        {
            break MISSING_BLOCK_LABEL_1250;
        }
        obj = obj7;
        obj1 = closeable;
        obj2 = obj7;
        if (((bw) (obj8)).c != null)
        {
            break MISSING_BLOCK_LABEL_1250;
        }
        obj = obj7;
        obj1 = closeable;
        obj2 = obj7;
        String s1 = ((bw) (obj8)).d;
        int l1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_1250;
        }
        l1 = 1;
_L21:
        if (l1 == 0) goto _L6; else goto _L5
_L5:
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj7)), "Failed to flush session user file.");
        a.a.a.a.a.b.l.a(closeable, "Failed to close session user file.");
_L15:
        obj = com.b.a.c.h.s();
        if (obj == null) goto _L8; else goto _L7
_L7:
        l1 = ((p) (obj)).c;
        a.a.a.a.f.d();
_L13:
        if (i1 >= afile1.length) goto _L10; else goto _L9
_L9:
        Exception exception1;
        File file1 = afile1[i1];
        obj8 = a(file1);
        a.a.a.a.f.d();
        a.a.a.a.f.d();
        obj7 = a(((FilenameFilter) (new ao((new StringBuilder()).append(((String) (obj8))).append("SessionCrash").toString()))));
        Exception exception;
        boolean flag1;
        if (obj7 != null && obj7.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.a.a.a.f.d();
        String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
            obj8, Boolean.valueOf(flag)
        });
        closeable = a(((FilenameFilter) (new ao((new StringBuilder()).append(((String) (obj8))).append("SessionEvent").toString()))));
        if (closeable != null && closeable.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a.a.a.a.f.d();
        String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
            obj8, Boolean.valueOf(flag1)
        });
        if (!flag && !flag1) goto _L12; else goto _L11
_L11:
        obj2 = null;
        obj1 = null;
        obj = new com.b.a.c.d(j, ((String) (obj8)));
        obj1 = obj2;
        obj2 = com.b.a.c.f.a(((java.io.OutputStream) (obj)));
        obj1 = obj2;
        a.a.a.a.f.d();
        obj1 = obj2;
        a(((com.b.a.c.f) (obj2)), file1);
        obj1 = obj2;
        ((com.b.a.c.f) (obj2)).a(4, (new Date()).getTime() / 1000L);
        obj1 = obj2;
        ((com.b.a.c.f) (obj2)).a(5, flag);
        obj1 = obj2;
        a(((com.b.a.c.f) (obj2)), ((String) (obj8)));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_849;
        }
        obj1 = obj2;
        if (closeable.length <= l1)
        {
            break MISSING_BLOCK_LABEL_837;
        }
        obj1 = obj2;
        a.a.a.a.f.d();
        obj1 = obj2;
        String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
            Integer.valueOf(l1)
        });
        obj1 = obj2;
        bx.a(j, new ao((new StringBuilder()).append(((String) (obj8))).append("SessionEvent").toString()), l1, c);
        obj1 = obj2;
        closeable = a(((FilenameFilter) (new ao((new StringBuilder()).append(((String) (obj8))).append("SessionEvent").toString()))));
        obj1 = obj2;
        a(((com.b.a.c.f) (obj2)), ((File []) (closeable)), ((String) (obj8)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_865;
        }
        obj1 = obj2;
        a(((com.b.a.c.f) (obj2)), obj7[0]);
        obj1 = obj2;
        ((com.b.a.c.f) (obj2)).a(11, 1);
        obj1 = obj2;
        ((com.b.a.c.f) (obj2)).b(12, 3);
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj2)), "Error flushing session file stream");
        a.a.a.a.a.b.l.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
_L16:
        a.a.a.a.f.d();
        a(((String) (obj8)));
        i1++;
          goto _L13
_L4:
        obj = obj7;
        obj1 = closeable;
        obj2 = obj7;
        obj8 = (new ay(j)).a(((String) (obj8)));
          goto _L14
_L6:
        obj = obj7;
        obj1 = closeable;
        obj2 = obj7;
        bu.a(((com.b.a.c.f) (obj7)), ((bw) (obj8)).b, ((bw) (obj8)).c, ((bw) (obj8)).d);
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj7)), "Failed to flush session user file.");
        a.a.a.a.a.b.l.a(closeable, "Failed to close session user file.");
          goto _L15
        exception1;
        closeable = null;
_L20:
        obj = obj2;
        obj1 = closeable;
        au.a(exception1, closeable);
        obj = obj2;
        obj1 = closeable;
        throw exception1;
        exception;
        obj2 = obj1;
        obj1 = obj;
        obj = exception;
_L19:
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj1)), "Failed to flush session user file.");
        a.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close session user file.");
        throw obj;
        obj2;
        obj = null;
        obj1 = null;
_L18:
        a.a.a.a.f.d().b("CrashlyticsCore", (new StringBuilder("Failed to write session file for session ID: ")).append(((String) (obj8))).toString(), ((Throwable) (obj2)));
        au.a(((Throwable) (obj2)), ((java.io.OutputStream) (obj1)));
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj)), "Error flushing session file stream");
        if (obj1 != null)
        {
            try
            {
                ((com.b.a.c.d) (obj1)).a();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a.a.a.a.f.d().b("CrashlyticsCore", "Error closing session file stream in the presence of an exception", ((Throwable) (obj)));
            }
        }
          goto _L16
        obj2;
        obj = null;
_L17:
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj1)), "Error flushing session file stream");
        a.a.a.a.a.b.l.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
        throw obj2;
_L12:
        a.a.a.a.f.d();
          goto _L16
_L8:
        a.a.a.a.f.d();
_L10:
        return;
_L2:
        a.a.a.a.f.d();
        return;
        obj2;
          goto _L17
        obj2;
        Object obj4 = obj1;
        obj1 = obj;
        obj = obj4;
          goto _L17
        obj2;
        Object obj5 = null;
        obj1 = obj;
        obj = obj5;
          goto _L18
        exception1;
        obj1 = obj2;
        Object obj6 = obj;
        obj2 = exception1;
        obj = obj1;
        obj1 = obj6;
          goto _L18
        obj;
        obj2 = null;
          goto _L19
        exception1;
          goto _L20
        l1 = 0;
          goto _L21
    }

    static boolean a(aa aa1, boolean flag)
    {
        aa1.p = flag;
        return flag;
    }

    static File[] a(aa aa1, FilenameFilter filenamefilter)
    {
        return aa1.a(filenamefilter);
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

    static void b(aa aa1)
    {
        aa1.g();
    }

    static h c(aa aa1)
    {
        return aa1.q;
    }

    static void d(aa aa1)
    {
        aa1.a(true);
    }

    static Pattern e()
    {
        return e;
    }

    static Map f()
    {
        return f;
    }

    private void g()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj5;
        Object obj6;
        String s1;
        obj6 = new Date();
        s1 = (new c(o)).toString();
        a.a.a.a.f.d();
        obj = null;
        obj1 = null;
        obj5 = null;
        obj2 = null;
        Object obj3 = new com.b.a.c.d(j, (new StringBuilder()).append(s1).append("BeginSession").toString());
        obj1 = obj3;
        obj2 = obj5;
        obj5 = com.b.a.c.f.a(((java.io.OutputStream) (obj3)));
        obj = obj5;
        obj1 = obj3;
        obj2 = obj5;
        bu.a(((com.b.a.c.f) (obj5)), s1, String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
            "2.3.5.79"
        }), ((Date) (obj6)).getTime() / 1000L);
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj5)), "Failed to flush to session begin file.");
        a.a.a.a.a.b.l.a(((java.io.Closeable) (obj3)), "Failed to close begin session file.");
        obj3 = null;
        obj = null;
        obj6 = null;
        obj5 = null;
        obj1 = null;
        obj2 = new com.b.a.c.d(j, (new StringBuilder()).append(s1).append("SessionApp").toString());
        obj = obj6;
        obj1 = obj5;
        obj3 = com.b.a.c.f.a(((java.io.OutputStream) (obj2)));
        obj = obj3;
        obj1 = obj3;
        obj5 = q.h();
        obj = obj3;
        obj1 = obj3;
        obj6 = q.k();
        obj = obj3;
        obj1 = obj3;
        Object obj7 = q.j();
        obj = obj3;
        obj1 = obj3;
        String s2 = o.b();
        obj = obj3;
        obj1 = obj3;
        int i1 = a.a.a.a.a.b.r.a(q.i()).a();
        obj = obj3;
        obj1 = obj3;
        s.a(((com.b.a.c.f) (obj3)), ((String) (obj5)), ((String) (obj6)), ((String) (obj7)), s2, i1);
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj3)), "Failed to flush to session app file.");
        a.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        obj2 = null;
        obj6 = null;
        obj1 = null;
        obj5 = null;
        obj = null;
        obj3 = new com.b.a.c.d(j, (new StringBuilder()).append(s1).append("SessionOS").toString());
        obj = obj6;
        obj1 = obj3;
        obj2 = obj5;
        obj5 = com.b.a.c.f.a(((java.io.OutputStream) (obj3)));
        obj = obj5;
        obj1 = obj3;
        obj2 = obj5;
        bu.a(((com.b.a.c.f) (obj5)), a.a.a.a.a.b.l.g(q.v()));
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj5)), "Failed to flush to session OS file.");
        a.a.a.a.a.b.l.a(((java.io.Closeable) (obj3)), "Failed to close session OS file.");
        obj3 = null;
        obj = null;
        obj6 = null;
        obj5 = null;
        obj1 = null;
        obj2 = new com.b.a.c.d(j, (new StringBuilder()).append(s1).append("SessionDevice").toString());
        obj = obj6;
        obj1 = obj5;
        obj3 = com.b.a.c.f.a(((java.io.OutputStream) (obj2)));
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
        i1 = a.a.a.a.a.b.l.a();
        obj = obj3;
        obj1 = obj3;
        int j1 = Runtime.getRuntime().availableProcessors();
        obj = obj3;
        obj1 = obj3;
        long l1 = a.a.a.a.a.b.l.b();
        obj = obj3;
        obj1 = obj3;
        long l2 = ((StatFs) (obj7)).getBlockCount();
        obj = obj3;
        obj1 = obj3;
        long l3 = ((StatFs) (obj7)).getBlockSize();
        obj = obj3;
        obj1 = obj3;
        boolean flag = a.a.a.a.a.b.l.f(((Context) (obj5)));
        obj = obj3;
        obj1 = obj3;
        obj7 = o.g();
        obj = obj3;
        obj1 = obj3;
        int k1 = a.a.a.a.a.b.l.h(((Context) (obj5)));
        obj = obj3;
        obj1 = obj3;
        bu.a(((com.b.a.c.f) (obj3)), ((String) (obj6)), i1, Build.MODEL, j1, l1, l2 * l3, flag, ((Map) (obj7)), k1, Build.MANUFACTURER, Build.PRODUCT);
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj3)), "Failed to flush session device info.");
        a.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close session device file.");
        r.a(s1);
        return;
        Exception exception;
        exception;
        obj3 = null;
_L16:
        obj = obj2;
        obj1 = obj3;
        au.a(exception, ((java.io.OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw exception;
        obj3;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L14:
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        a.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close begin session file.");
        throw obj;
        obj2;
        obj = obj3;
_L12:
        au.a(((Throwable) (obj2)), ((java.io.OutputStream) (obj)));
        throw obj2;
        obj3;
        obj2 = obj;
        obj = obj1;
        obj1 = obj3;
_L10:
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj)), "Failed to flush to session app file.");
        a.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        throw obj1;
        exception;
        obj3 = null;
        obj2 = obj;
_L8:
        obj = obj2;
        obj1 = obj3;
        au.a(exception, ((java.io.OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw exception;
        obj3;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L6:
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj1)), "Failed to flush to session OS file.");
        a.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close session OS file.");
        throw obj;
        obj2;
        obj = obj3;
_L4:
        au.a(((Throwable) (obj2)), ((java.io.OutputStream) (obj)));
        throw obj2;
        Object obj4;
        obj4;
        obj2 = obj;
        obj = obj1;
        obj1 = obj4;
_L2:
        a.a.a.a.a.b.l.a(((java.io.Flushable) (obj)), "Failed to flush session device info.");
        a.a.a.a.a.b.l.a(((java.io.Closeable) (obj2)), "Failed to close session device file.");
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

    private File[] h()
    {
        return a(new ao("BeginSession"));
    }

    private void i()
    {
        File afile[] = a(a);
        int j1 = afile.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            File file = afile[i1];
            n.a(new ag(this, file));
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
            a.a.a.a.f.d();
            (new StringBuilder("Found invalid session part file: ")).append(obj);
            obj = new af(this, a(((File) (obj))));
            a.a.a.a.f.d();
            File afile1[] = a(((FilenameFilter) (obj)));
            int j2 = afile1.length;
            for (int l1 = 0; l1 < j2; l1++)
            {
                File file1 = afile1[l1];
                a.a.a.a.f.d();
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
        n.b(new ac(this));
    }

    final boolean c()
    {
        return ((Boolean)n.a(new ad(this))).booleanValue();
    }

    final void d()
    {
        n.a(new ae(this));
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        k.set(true);
        a.a.a.a.f.d();
        (new StringBuilder("Crashlytics is handling uncaught exception \"")).append(throwable).append("\" from thread ").append(thread.getName());
        if (!h.getAndSet(true))
        {
            a.a.a.a.f.d();
            Context context = q.v();
            context.unregisterReceiver(m);
            context.unregisterReceiver(l);
        }
        Date date = new Date();
        n.a(new am(this, date, thread, throwable));
        a.a.a.a.f.d();
        i.uncaughtException(thread, throwable);
        k.set(false);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        a.a.a.a.f.d().b("CrashlyticsCore", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
        a.a.a.a.f.d();
        i.uncaughtException(thread, throwable);
        k.set(false);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        throw thread;
        obj;
        a.a.a.a.f.d();
        i.uncaughtException(thread, throwable);
        k.set(false);
        throw obj;
    }

}
