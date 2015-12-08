// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.BroadcastReceiver;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
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
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android:
//            F, O, P, Q, 
//            k, ag, ah, Crashlytics, 
//            I, aB, CrashlyticsListener, R, 
//            S, p, QueueFile, H, 
//            M, n, X, Y, 
//            N, IdManager, l, B, 
//            W, ax, J, G, 
//            V, L, U, K, 
//            T

final class E
    implements Thread.UncaughtExceptionHandler
{

    static final FilenameFilter a = new F();
    private static Comparator b = new O();
    private static Comparator c = new P();
    private static final Pattern d = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map e = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private static final k f = com.crashlytics.android.k.a("0");
    private final AtomicInteger g;
    private final AtomicBoolean h;
    private final int i;
    private final Thread.UncaughtExceptionHandler j;
    private final File k;
    private final AtomicBoolean l;
    private final String m;
    private final BroadcastReceiver n;
    private final BroadcastReceiver o;
    private final k p;
    private final k q;
    private final ExecutorService r;
    private android.app.ActivityManager.RunningAppProcessInfo s;
    private QueueFile t;
    private boolean u;
    private Thread v[];
    private List w;
    private StackTraceElement x[];

    public E(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashlyticsListener crashlyticslistener, String s1)
    {
        ExecutorService executorservice = Executors.newSingleThreadExecutor(new ag("Crashlytics Exception Handler", new AtomicLong(1L)));
        TimeUnit timeunit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new ah("Crashlytics Exception Handler", executorservice, 2L, timeunit), (new StringBuilder("Crashlytics Shutdown Hook for ")).append("Crashlytics Exception Handler").toString()));
        this(uncaughtexceptionhandler, crashlyticslistener, executorservice, s1);
    }

    private E(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashlyticsListener crashlyticslistener, ExecutorService executorservice, String s1)
    {
        g = new AtomicInteger(0);
        h = new AtomicBoolean(false);
        j = uncaughtexceptionhandler;
        r = executorservice;
        l = new AtomicBoolean(false);
        k = Crashlytics.j();
        m = String.format("Crashlytics Android SDK/%s", new Object[] {
            Crashlytics.getCrashlyticsVersion()
        });
        a(new I(this));
        i = 8;
        aB.c("Checking for previous crash marker.");
        uncaughtexceptionhandler = new File(Crashlytics.j(), "crash_marker");
        if (uncaughtexceptionhandler.exists())
        {
            uncaughtexceptionhandler.delete();
            if (crashlyticslistener != null)
            {
                try
                {
                    crashlyticslistener.crashlyticsDidDetectCrashDuringPreviousExecution();
                }
                // Misplaced declaration of an exception variable
                catch (Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
                {
                    aB.a("Exception thrown by CrashlyticsListener while notifying of previous crash.", uncaughtexceptionhandler);
                }
            }
        }
        p = com.crashlytics.android.k.a(Crashlytics.e());
        if (s1 == null)
        {
            uncaughtexceptionhandler = null;
        } else
        {
            uncaughtexceptionhandler = com.crashlytics.android.k.a(s1.replace("-", ""));
        }
        q = uncaughtexceptionhandler;
        o = new R(this);
        uncaughtexceptionhandler = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        n = new S(this);
        crashlyticslistener = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        Crashlytics.d().registerReceiver(o, uncaughtexceptionhandler);
        Crashlytics.d().registerReceiver(n, crashlyticslistener);
        h.set(true);
    }

    private static int a(float f1, int i1, boolean flag, int j1, long l1, long l2)
    {
        return com.crashlytics.android.p.b(1, f1) + 0 + com.crashlytics.android.p.f(2, i1) + com.crashlytics.android.p.b(3, flag) + com.crashlytics.android.p.d(4, j1) + com.crashlytics.android.p.b(5, l1) + com.crashlytics.android.p.b(6, l2);
    }

    private int a(int i1, k k1, k k2, int j1, long l1, long l2, boolean flag, Map map, int i2, k k3, k k4)
    {
        int j2 = com.crashlytics.android.p.b(1, k1);
        int i3 = com.crashlytics.android.p.e(3, i1);
        if (k2 == null)
        {
            i1 = 0;
        } else
        {
            i1 = com.crashlytics.android.p.b(4, k2);
        }
        i1 = i1 + (i3 + (j2 + 0)) + com.crashlytics.android.p.d(5, j1) + com.crashlytics.android.p.b(6, l1) + com.crashlytics.android.p.b(7, l2) + com.crashlytics.android.p.b(10, flag);
        if (map != null)
        {
            k1 = map.entrySet().iterator();
            do
            {
                j1 = i1;
                if (!k1.hasNext())
                {
                    break;
                }
                k2 = (java.util.Map.Entry)k1.next();
                j1 = a((IdManager.DeviceIdentifierType)k2.getKey(), (String)k2.getValue());
                i1 = j1 + (com.crashlytics.android.p.a(11) + com.crashlytics.android.p.c(j1)) + i1;
            } while (true);
        } else
        {
            j1 = i1;
        }
        j2 = com.crashlytics.android.p.d(12, i2);
        if (k3 == null)
        {
            i1 = 0;
        } else
        {
            i1 = com.crashlytics.android.p.b(13, k3);
        }
        if (k4 == null)
        {
            i2 = 0;
        } else
        {
            i2 = com.crashlytics.android.p.b(14, k4);
        }
        return i2 + (j1 + j2 + i1);
    }

    private static int a(IdManager.DeviceIdentifierType deviceidentifiertype, String s1)
    {
        return com.crashlytics.android.p.e(1, deviceidentifiertype.protobufIndex) + com.crashlytics.android.p.b(2, com.crashlytics.android.k.a(s1));
    }

    private static int a(StackTraceElement stacktraceelement, boolean flag)
    {
        int i1;
        int j1;
        if (stacktraceelement.isNativeMethod())
        {
            i1 = com.crashlytics.android.p.b(1, Math.max(stacktraceelement.getLineNumber(), 0)) + 0;
        } else
        {
            i1 = com.crashlytics.android.p.b(1, 0L) + 0;
        }
        j1 = i1 + com.crashlytics.android.p.b(2, com.crashlytics.android.k.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        i1 = j1;
        if (stacktraceelement.getFileName() != null)
        {
            i1 = j1 + com.crashlytics.android.p.b(3, com.crashlytics.android.k.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            i1 += com.crashlytics.android.p.b(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            j1 = 2;
        } else
        {
            j1 = 0;
        }
        return com.crashlytics.android.p.d(5, j1) + i1;
    }

    private static int a(String s1, String s2)
    {
        int i1 = com.crashlytics.android.p.b(1, com.crashlytics.android.k.a(s1));
        s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        return i1 + com.crashlytics.android.p.b(2, com.crashlytics.android.k.a(s1));
    }

    private int a(Thread thread, Throwable throwable, Map map)
    {
        int i1 = b(thread, throwable);
        i1 = i1 + (com.crashlytics.android.p.a(1) + com.crashlytics.android.p.c(i1)) + 0;
        int j1;
        if (map != null)
        {
            thread = map.entrySet().iterator();
            do
            {
                j1 = i1;
                if (!thread.hasNext())
                {
                    break;
                }
                throwable = (java.util.Map.Entry)thread.next();
                j1 = a((String)throwable.getKey(), (String)throwable.getValue());
                i1 = j1 + (com.crashlytics.android.p.a(2) + com.crashlytics.android.p.c(j1)) + i1;
            } while (true);
        } else
        {
            j1 = i1;
        }
        i1 = j1;
        if (s != null)
        {
            boolean flag;
            if (s.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i1 = j1 + com.crashlytics.android.p.b(3, flag);
        }
        return com.crashlytics.android.p.d(4, Crashlytics.d().getResources().getConfiguration().orientation) + i1;
    }

    private int a(Thread thread, StackTraceElement astacktraceelement[], int i1, boolean flag)
    {
        int j1 = com.crashlytics.android.p.b(1, com.crashlytics.android.k.a(thread.getName()));
        j1 = com.crashlytics.android.p.d(2, i1) + (j1 + 0);
        int k1 = astacktraceelement.length;
        for (i1 = 0; i1 < k1; i1++)
        {
            int l1 = a(astacktraceelement[i1], flag);
            j1 += l1 + (com.crashlytics.android.p.a(3) + com.crashlytics.android.p.c(l1));
        }

        return j1;
    }

    private int a(Throwable throwable, int i1)
    {
        int j1;
        int k1;
label0:
        {
            boolean flag = false;
            k1 = com.crashlytics.android.p.b(1, com.crashlytics.android.k.a(throwable.getClass().getName())) + 0;
            Object obj = throwable.getLocalizedMessage();
            j1 = k1;
            if (obj != null)
            {
                j1 = k1 + com.crashlytics.android.p.b(3, com.crashlytics.android.k.a(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int l1 = astacktraceelement.length;
            for (k1 = 0; k1 < l1;)
            {
                int i2 = a(astacktraceelement[k1], true);
                int j2 = com.crashlytics.android.p.a(4);
                int k2 = com.crashlytics.android.p.c(i2);
                k1++;
                j1 = i2 + (j2 + k2) + j1;
            }

            astacktraceelement = throwable.getCause();
            k1 = j1;
            if (astacktraceelement != null)
            {
                k1 = ((flag) ? 1 : 0);
                throwable = astacktraceelement;
                if (i1 >= 8)
                {
                    break label0;
                }
                i1 = a(((Throwable) (astacktraceelement)), i1 + 1);
                k1 = j1 + (i1 + (com.crashlytics.android.p.a(6) + com.crashlytics.android.p.c(i1)));
            }
            return k1;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            k1++;
        }
        return j1 + com.crashlytics.android.p.d(7, k1);
    }

    private k a(QueueFile queuefile)
    {
        if (queuefile == null)
        {
            return null;
        }
        int ai[] = new int[1];
        ai[0] = 0;
        byte abyte0[] = new byte[queuefile.a()];
        try
        {
            queuefile.a(new H(this, abyte0, ai));
        }
        // Misplaced declaration of an exception variable
        catch (QueueFile queuefile)
        {
            aB.a("A problem occurred while reading the Crashlytics log file.", queuefile);
        }
        return com.crashlytics.android.k.a(abyte0, 0, ai[0]);
    }

    private Object a(Callable callable)
    {
        try
        {
            callable = ((Callable) (r.submit(callable).get()));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            aB.c("Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            aB.a("Failed to execute task.", callable);
            return null;
        }
        return callable;
    }

    private static String a(File file)
    {
        return file.getName().substring(0, 35);
    }

    private Future a(Runnable runnable)
    {
        try
        {
            runnable = r.submit(new M(this, runnable));
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            aB.c("Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return runnable;
    }

    static AtomicBoolean a(E e1)
    {
        return e1.l;
    }

    static void a(E e1, Date date, Thread thread, Throwable throwable)
        throws Exception
    {
        n n1;
        p p1;
        Object obj1;
        Object obj2;
        p1 = null;
        date = null;
        obj2 = null;
        obj1 = null;
        n1 = null;
        Object obj;
        (new File(e1.k, "crash_marker")).createNewFile();
        obj = e1.j();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = new n(e1.k, (new StringBuilder()).append(((String) (obj))).append("SessionCrash").toString());
        date = obj2;
        n1 = ((n) (obj));
        p1 = ((p) (obj1));
        obj1 = com.crashlytics.android.p.a(((OutputStream) (obj)));
        date = ((Date) (obj1));
        n1 = ((n) (obj));
        p1 = ((p) (obj1));
        e1.a(((p) (obj1)), thread, throwable, "crash", true);
_L3:
        aB.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        aB.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
_L4:
        e1.i();
        e1.h();
        aB.a(e1.k, a, 4, c);
        if (!Crashlytics.getInstance().m())
        {
            e1.l();
        }
        return;
_L2:
        aB.a("Tried to write a fatal exception while no session was open.", null);
        obj = null;
        obj1 = n1;
          goto _L3
        thread;
        obj = null;
_L7:
        date = p1;
        n1 = ((n) (obj));
        aB.a("An error occurred in the fatal exception logger", thread);
        date = p1;
        n1 = ((n) (obj));
        e1.a(((Throwable) (thread)), ((OutputStream) (obj)));
        aB.a(p1, "Failed to flush to session begin file.");
        aB.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
          goto _L4
        e1;
        n1 = null;
_L6:
        aB.a(date, "Failed to flush to session begin file.");
        aB.a(n1, "Failed to close fatal exception file output stream.");
        throw e1;
        e1;
        if (true) goto _L6; else goto _L5
_L5:
        thread;
          goto _L7
    }

    static void a(QueueFile queuefile, int i1, long l1, String s1)
    {
        if (queuefile != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (s1 == null)
        {
            s1 = "null";
        }
        String s2 = s1;
        try
        {
            if (s1.length() > 16384)
            {
                s2 = (new StringBuilder("...")).append(s1.substring(s1.length() - 16384)).toString();
            }
            queuefile.a(String.format("%d %s%n", new Object[] {
                Long.valueOf(l1), s2.replaceAll("\r", " ").replaceAll("\n", " ")
            }).getBytes("UTF-8"));
            while (!queuefile.b() && queuefile.a() > 0x10000) 
            {
                queuefile.c();
            }
        }
        // Misplaced declaration of an exception variable
        catch (QueueFile queuefile)
        {
            aB.a("There was a problem writing to the Crashlytics log.", queuefile);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static void a(n n1)
    {
        if (n1 == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        n1.a();
        return;
        n1;
        aB.a("Error closing session file stream in the presence of an exception", n1);
        return;
    }

    private void a(p p1, int i1, StackTraceElement stacktraceelement, boolean flag)
        throws Exception
    {
        byte byte0 = 4;
        p1.g(i1, 2);
        p1.b(a(stacktraceelement, flag));
        if (stacktraceelement.isNativeMethod())
        {
            p1.a(1, Math.max(stacktraceelement.getLineNumber(), 0));
        } else
        {
            p1.a(1, 0L);
        }
        p1.a(2, com.crashlytics.android.k.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        if (stacktraceelement.getFileName() != null)
        {
            p1.a(3, com.crashlytics.android.k.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            p1.a(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        p1.a(5, i1);
    }

    private static void a(p p1, File file)
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
        aB.a(file, "Failed to close file input stream.");
        p1.a(abyte0);
        return;
        p1;
        file = null;
_L6:
        aB.a(file, "Failed to close file input stream.");
        throw p1;
_L2:
        aB.a((new StringBuilder("Tried to include a file that doesn't exist: ")).append(file.getName()).toString(), null);
        return;
        p1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(p p1, String s1)
        throws IOException
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
            File afile[] = a(((FilenameFilter) (new X((new StringBuilder()).append(s1).append(s2).toString()))));
            if (afile.length == 0)
            {
                aB.a((new StringBuilder("Can't find ")).append(s2).append(" data for session ID ").append(s1).toString(), null);
            } else
            {
                aB.c((new StringBuilder("Collecting ")).append(s2).append(" data for session ID ").append(s1).toString());
                a(p1, afile[0]);
            }
            i1++;
        }
    }

    private void a(p p1, Thread thread, Throwable throwable)
        throws Exception
    {
        p1.g(1, 2);
        p1.b(b(thread, throwable));
        a(p1, thread, x, 4, true);
        int j1 = v.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            a(p1, v[i1], (StackTraceElement[])w.get(i1), 0, false);
        }

        a(p1, throwable, 1, 2);
        p1.g(3, 2);
        p1.b(p());
        p1.a(1, f);
        p1.a(2, f);
        p1.a(3, 0L);
        p1.g(4, 2);
        p1.b(o());
        p1.a(1, 0L);
        p1.a(2, 0L);
        p1.a(3, p);
        if (q != null)
        {
            p1.a(4, q);
        }
    }

    private void a(p p1, Thread thread, Throwable throwable, String s1, boolean flag)
        throws Exception
    {
        long l3 = (new Date()).getTime() / 1000L;
        float f1 = aB.b(Crashlytics.d());
        int i2 = aB.a(u);
        boolean flag1 = aB.c(Crashlytics.d());
        int j2 = Crashlytics.d().getResources().getConfiguration().orientation;
        long l4 = aB.a(Crashlytics.d());
        long l5 = aB.b(Environment.getDataDirectory().getPath());
        s = aB.a(Crashlytics.e(), Crashlytics.d());
        w = new LinkedList();
        x = throwable.getStackTrace();
        if (flag)
        {
            Object obj = Thread.getAllStackTraces();
            v = new Thread[((Map) (obj)).size()];
            obj = ((Map) (obj)).entrySet().iterator();
            for (int i1 = 0; ((Iterator) (obj)).hasNext(); i1++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                v[i1] = (Thread)entry.getKey();
                w.add(entry.getValue());
            }

        } else
        {
            v = new Thread[0];
        }
        k k1 = a(t);
        if (k1 == null)
        {
            aB.c("No log data to include with this event.");
        }
        aB.a(t, "There was a problem closing the Crashlytics log file.");
        t = null;
        Object obj1;
        int j1;
        int l1;
        int k2;
        int l2;
        int i3;
        int j3;
        if (!aB.a(Crashlytics.d(), "com.crashlytics.CollectCustomKeys", true))
        {
            obj1 = new TreeMap();
        } else
        {
            obj1 = Crashlytics.getInstance().a();
            if (obj1 != null && ((Map) (obj1)).size() > 1)
            {
                obj1 = new TreeMap(((Map) (obj1)));
            }
        }
        p1.g(10, 2);
        j1 = com.crashlytics.android.p.b(1, l3);
        l1 = com.crashlytics.android.p.b(2, com.crashlytics.android.k.a(s1));
        k2 = a(thread, throwable, ((Map) (obj1)));
        l2 = com.crashlytics.android.p.a(3);
        i3 = com.crashlytics.android.p.c(k2);
        j3 = a(f1, i2, flag1, j2, l4, l5);
        l1 = j1 + 0 + l1 + (k2 + (l2 + i3)) + (j3 + (com.crashlytics.android.p.a(5) + com.crashlytics.android.p.c(j3)));
        j1 = l1;
        if (k1 != null)
        {
            j1 = com.crashlytics.android.p.b(1, k1);
            j1 = l1 + (j1 + (com.crashlytics.android.p.a(6) + com.crashlytics.android.p.c(j1)));
        }
        p1.b(j1);
        p1.a(1, l3);
        p1.a(2, com.crashlytics.android.k.a(s1));
        p1.g(3, 2);
        p1.b(a(thread, throwable, ((Map) (obj1))));
        a(p1, thread, throwable);
        if (obj1 != null && !((Map) (obj1)).isEmpty())
        {
            a(p1, ((Map) (obj1)));
        }
        if (s != null)
        {
            if (s.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p1.a(3, flag);
        }
        p1.a(4, Crashlytics.d().getResources().getConfiguration().orientation);
        p1.g(5, 2);
        p1.b(a(f1, i2, flag1, j2, l4, l5));
        p1.a(1, f1);
        p1.c(2, i2);
        p1.a(3, flag1);
        p1.a(4, j2);
        p1.a(5, l4);
        p1.a(6, l5);
        if (k1 != null)
        {
            p1.g(6, 2);
            p1.b(com.crashlytics.android.p.b(1, k1));
            p1.a(1, k1);
        }
    }

    private void a(p p1, Thread thread, StackTraceElement astacktraceelement[], int i1, boolean flag)
        throws Exception
    {
        p1.g(1, 2);
        p1.b(a(thread, astacktraceelement, i1, flag));
        p1.a(1, com.crashlytics.android.k.a(thread.getName()));
        p1.a(2, i1);
        int j1 = astacktraceelement.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            a(p1, 3, astacktraceelement[i1], flag);
        }

    }

    private void a(p p1, Throwable throwable, int i1, int j1)
        throws Exception
    {
label0:
        {
            boolean flag = false;
            p1.g(j1, 2);
            p1.b(a(throwable, 1));
            p1.a(1, com.crashlytics.android.k.a(throwable.getClass().getName()));
            Object obj = throwable.getLocalizedMessage();
            if (obj != null)
            {
                p1.a(3, com.crashlytics.android.k.a(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int k1 = astacktraceelement.length;
            for (j1 = 0; j1 < k1; j1++)
            {
                a(p1, 4, astacktraceelement[j1], true);
            }

            astacktraceelement = throwable.getCause();
            if (astacktraceelement != null)
            {
                j1 = ((flag) ? 1 : 0);
                throwable = astacktraceelement;
                if (i1 >= 8)
                {
                    break label0;
                }
                a(p1, ((Throwable) (astacktraceelement)), i1 + 1, 6);
            }
            return;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            j1++;
        }
        p1.a(7, j1);
    }

    private void a(p p1, Map map)
        throws Exception
    {
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); p1.a(2, com.crashlytics.android.k.a(map)))
        {
            map = (java.util.Map.Entry)iterator.next();
            p1.g(2, 2);
            p1.b(a((String)map.getKey(), (String)map.getValue()));
            p1.a(1, com.crashlytics.android.k.a((String)map.getKey()));
            String s1 = (String)map.getValue();
            map = s1;
            if (s1 == null)
            {
                map = "";
            }
        }

    }

    private void a(p p1, File afile[], String s1)
    {
        Arrays.sort(afile, aB.a);
        int j1 = afile.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            File file = afile[i1];
            try
            {
                aB.c(String.format("Found Non Fatal for session ID %s in %s ", new Object[] {
                    s1, file.getName()
                }));
                a(p1, file);
            }
            catch (Exception exception)
            {
                aB.a("Error writting non-fatal to session.", exception);
            }
            i1++;
        }
    }

    private void a(String s1)
    {
        s1 = a(((FilenameFilter) (new Y(s1))));
        int j1 = s1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            s1[i1].delete();
        }

    }

    private void a(String s1, int i1)
    {
        aB.a(k, new X((new StringBuilder()).append(s1).append("SessionEvent").toString()), i1, c);
    }

    private void a(Throwable throwable, OutputStream outputstream)
    {
        if (outputstream == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        PrintWriter printwriter = new PrintWriter(outputstream);
        outputstream = printwriter;
        a(throwable, ((Writer) (printwriter)));
        aB.a(printwriter, "Failed to close stack trace writer.");
        return;
        Exception exception;
        exception;
        throwable = null;
_L4:
        outputstream = throwable;
        aB.a("Failed to create PrintWriter", exception);
        aB.a(throwable, "Failed to close stack trace writer.");
        return;
        throwable;
        outputstream = null;
_L2:
        aB.a(outputstream, "Failed to close stack trace writer.");
        throw throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        throwable = printwriter;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void a(Throwable throwable, Writer writer)
    {
        Throwable throwable1;
        int i1;
        i1 = 1;
        throwable1 = throwable;
_L5:
        if (throwable1 == null) goto _L2; else goto _L1
_L1:
        throwable = throwable1.getLocalizedMessage();
        break MISSING_BLOCK_LABEL_14;
_L6:
        String s1;
        writer.write((new StringBuilder()).append(s1).append(throwable1.getClass().getName()).append(": ").append(throwable).append("\n").toString());
        throwable = throwable1.getStackTrace();
        j1 = throwable.length;
        i1 = 0;
_L4:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = throwable[i1];
        writer.write((new StringBuilder("\tat ")).append(s1.toString()).append("\n").toString());
        i1++;
        if (true) goto _L4; else goto _L3
        int j1;
        if (throwable == null)
        {
            throwable = null;
            break MISSING_BLOCK_LABEL_164;
        }
        try
        {
            throwable = throwable.replaceAll("(\r\n|\n|\f)", " ");
            break MISSING_BLOCK_LABEL_164;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            aB.a("Could not write stack trace", throwable);
        }
          goto _L2
_L3:
        throwable1 = throwable1.getCause();
        i1 = 0;
          goto _L5
_L2:
        return;
        if (throwable == null)
        {
            throwable = "";
        }
        if (i1 != 0)
        {
            s1 = "";
        } else
        {
            s1 = "Caused by: ";
        }
          goto _L6
    }

    static boolean a(E e1, boolean flag)
    {
        e1.u = flag;
        return flag;
    }

    static File[] a(E e1, FilenameFilter filenamefilter)
    {
        return e1.a(filenamefilter);
    }

    private File[] a(FilenameFilter filenamefilter)
    {
        File afile[] = k.listFiles(filenamefilter);
        filenamefilter = afile;
        if (afile == null)
        {
            filenamefilter = new File[0];
        }
        return filenamefilter;
    }

    private int b(Thread thread, Throwable throwable)
    {
        int i1 = a(thread, x, 4, true);
        int l1 = com.crashlytics.android.p.a(1);
        int i2 = com.crashlytics.android.p.c(i1);
        int k1 = v.length;
        int j1 = 0;
        i1 = i1 + (l1 + i2) + 0;
        for (; j1 < k1; j1++)
        {
            l1 = a(v[j1], (StackTraceElement[])w.get(j1), 0, false);
            i1 += l1 + (com.crashlytics.android.p.a(1) + com.crashlytics.android.p.c(l1));
        }

        j1 = a(throwable, 1);
        k1 = com.crashlytics.android.p.a(2);
        l1 = com.crashlytics.android.p.c(j1);
        i2 = p();
        int j2 = com.crashlytics.android.p.a(3);
        int k2 = com.crashlytics.android.p.c(i2);
        int l2 = o();
        return j1 + (k1 + l1) + i1 + (i2 + (j2 + k2)) + (l2 + (com.crashlytics.android.p.a(3) + com.crashlytics.android.p.c(l2)));
    }

    private static k b(String s1)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return com.crashlytics.android.k.a(s1);
        }
    }

    private Future b(Callable callable)
    {
        try
        {
            callable = r.submit(new N(this, callable));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            aB.c("Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return callable;
    }

    static void b(E e1)
        throws Exception
    {
        e1.i();
    }

    static void b(E e1, Date date, Thread thread, Throwable throwable)
    {
        p p1;
        p p2;
        Object obj1;
        String s1;
        date = null;
        obj1 = null;
        p2 = null;
        p1 = null;
        s1 = e1.j();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        aB.c((new StringBuilder("Crashlytics is logging non-fatal exception \"")).append(throwable).append("\" from thread ").append(thread.getName()).toString());
        obj = aB.b(e1.g.getAndIncrement());
        obj = (new StringBuilder()).append(s1).append("SessionEvent").append(((String) (obj))).toString();
        obj = new n(e1.k, ((String) (obj)));
        date = obj1;
        p1 = p2;
        p2 = com.crashlytics.android.p.a(((OutputStream) (obj)));
        date = p2;
        p1 = p2;
        e1.a(p2, thread, throwable, "error", false);
        aB.a(p2, "Failed to flush to non-fatal file.");
        aB.a(((java.io.Closeable) (obj)), "Failed to close non-fatal file output stream.");
        break MISSING_BLOCK_LABEL_159;
        thread;
        date = null;
_L6:
        aB.a("An error occurred in the non-fatal exception logger", thread);
        e1.a(thread, date);
        aB.a(p1, "Failed to flush to non-fatal file.");
        aB.a(date, "Failed to close non-fatal file output stream.");
          goto _L3
        e1;
        thread = null;
_L5:
        aB.a(date, "Failed to flush to non-fatal file.");
        aB.a(thread, "Failed to close non-fatal file output stream.");
        throw e1;
_L3:
        try
        {
            e1.a(s1, 64);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (E e1)
        {
            aB.a("An error occurred when trimming non-fatal files.", e1);
        }
        return;
_L2:
        aB.a("Tried to write a non-fatal exception while no session was open.", null);
        return;
        e1;
        thread = ((Thread) (obj));
        continue; /* Loop/switch isn't completed */
        e1;
        thread = date;
        date = p1;
        if (true) goto _L5; else goto _L4
_L4:
        thread;
        date = ((Date) (obj));
          goto _L6
    }

    static void c(E e1)
        throws Exception
    {
        e1.h();
    }

    private void c(String s1)
        throws Exception
    {
        String s2;
        Object obj1;
        obj1 = null;
        s2 = null;
        Object obj = new n(Crashlytics.j(), (new StringBuilder()).append(s1).append("SessionDevice").toString());
        s1 = com.crashlytics.android.p.a(((OutputStream) (obj)));
        s2 = s1;
        Object obj2;
        obj2 = new StatFs(Environment.getDataDirectory().getPath());
        s1 = aB.b().toUpperCase();
        if (!s1.startsWith("ARMV7")) goto _L2; else goto _L1
_L1:
        byte byte0 = 6;
_L4:
        int j1;
        k k1 = b(Build.MODEL);
        s1 = b(Build.MANUFACTURER);
        obj1 = b(Build.PRODUCT);
        int i1 = Runtime.getRuntime().availableProcessors();
        long l1 = aB.c();
        long l2 = (long)((StatFs) (obj2)).getBlockCount() * (long)((StatFs) (obj2)).getBlockSize();
        boolean flag = aB.d();
        Object obj3 = Crashlytics.getInstance().c();
        obj2 = com.crashlytics.android.k.a(((IdManager) (obj3)).e());
        obj3 = ((IdManager) (obj3)).f();
        j1 = aB.f();
        s2.g(9, 2);
        s2.b(a(byte0, ((k) (obj2)), k1, i1, l1, l2, flag, ((Map) (obj3)), j1, s1, ((k) (obj1))));
        s2.a(1, ((k) (obj2)));
        s2.b(3, byte0);
        s2.a(4, k1);
        s2.a(5, i1);
        s2.a(6, l1);
        s2.a(7, l2);
        s2.a(10, flag);
        java.util.Map.Entry entry;
        for (Iterator iterator = ((Map) (obj3)).entrySet().iterator(); iterator.hasNext(); s2.a(2, com.crashlytics.android.k.a((String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
            s2.g(11, 2);
            s2.b(a((IdManager.DeviceIdentifierType)entry.getKey(), (String)entry.getValue()));
            s2.b(1, ((IdManager.DeviceIdentifierType)entry.getKey()).protobufIndex);
        }

          goto _L3
        obj1;
        s1 = ((String) (obj));
        obj = obj1;
_L6:
        a(((Throwable) (obj)), s1);
        throw obj;
        obj1;
        obj = s1;
        s1 = ((String) (obj1));
_L5:
        aB.a(s2, "Failed to flush session device info.");
        aB.a(((java.io.Closeable) (obj)), "Failed to close session device file.");
        throw s1;
_L2:
        if (!s1.startsWith("ARMV6"))
        {
            break MISSING_BLOCK_LABEL_416;
        }
        byte0 = 5;
          goto _L4
        if (!s1.startsWith("ARMV"))
        {
            break MISSING_BLOCK_LABEL_433;
        }
        byte0 = 7;
          goto _L4
        aB.c((new StringBuilder("Unexpected non-ARM architecture type: ")).append(s1).toString());
        byte0 = 7;
          goto _L4
_L3:
        s2.a(12, j1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        s2.a(13, s1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        s2.a(14, ((k) (obj1)));
        aB.a(s2, "Failed to flush session device info.");
        aB.a(((java.io.Closeable) (obj)), "Failed to close session device file.");
        return;
        s1;
        s2 = null;
        obj = null;
          goto _L5
        s1;
        s2 = null;
          goto _L5
        s1;
          goto _L5
        obj;
        s1 = ((String) (obj1));
          goto _L6
        Exception exception;
        exception;
        s1 = ((String) (obj));
        obj = exception;
          goto _L6
    }

    static QueueFile d(E e1)
    {
        return e1.t;
    }

    static Pattern e()
    {
        return d;
    }

    static boolean e(E e1)
    {
        return e1.g();
    }

    static Map f()
    {
        return e;
    }

    private boolean g()
    {
        if (!aB.a(Crashlytics.d(), "com.crashlytics.CollectCustomLogs", true))
        {
            aB.c("Preferences requested not to collect custom logs. Aborting log file creation.");
            return false;
        }
        aB.a(t, (new StringBuilder("Could not close log file: ")).append(t).toString());
        File file;
        String s1 = (new StringBuilder("crashlytics-userlog-")).append(UUID.randomUUID().toString()).append(".temp").toString();
        file = new File(Crashlytics.d().getFilesDir(), s1);
        t = new QueueFile(file);
        file.delete();
        return true;
        Exception exception;
        exception;
        file = null;
_L2:
        aB.a((new StringBuilder("Could not create log file: ")).append(file).toString(), exception);
        return false;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void h()
        throws Exception
    {
        Object obj;
        Object obj1;
        Object obj2;
        p p1;
        String s1;
        Object obj4;
        obj4 = new Date();
        s1 = (new l()).toString();
        aB.c((new StringBuilder("Opening an new session with ID ")).append(s1).toString());
        obj = null;
        obj1 = null;
        p1 = null;
        obj2 = null;
        Object obj3 = new n(Crashlytics.j(), (new StringBuilder()).append(s1).append("BeginSession").toString());
        obj1 = obj3;
        obj2 = p1;
        p1 = com.crashlytics.android.p.a(((OutputStream) (obj3)));
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(1, com.crashlytics.android.k.a(m));
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(2, com.crashlytics.android.k.a(s1));
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(3, ((Date) (obj4)).getTime() / 1000L);
        aB.a(p1, "Failed to flush to session begin file.");
        aB.a(((java.io.Closeable) (obj3)), "Failed to close begin session file.");
        obj = null;
        obj1 = null;
        p1 = null;
        obj2 = null;
        obj3 = new n(Crashlytics.j(), (new StringBuilder()).append(s1).append("SessionApp").toString());
        obj1 = obj3;
        obj2 = p1;
        p1 = com.crashlytics.android.p.a(((OutputStream) (obj3)));
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        k k1 = com.crashlytics.android.k.a(Crashlytics.e());
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        k k2 = com.crashlytics.android.k.a(Crashlytics.h());
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        k k3 = com.crashlytics.android.k.a(Crashlytics.g());
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        k k4 = com.crashlytics.android.k.a(Crashlytics.k());
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        k k5 = com.crashlytics.android.k.a(Crashlytics.d().getPackageCodePath());
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        obj4 = com.crashlytics.android.k.a(Crashlytics.getInstance().c().b());
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        int i1 = B.a(Crashlytics.f()).a();
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.g(7, 2);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        int j1 = com.crashlytics.android.p.b(1, k1);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        int l1 = com.crashlytics.android.p.b(2, k2);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        int i2 = com.crashlytics.android.p.b(3, k3);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        int j2 = m();
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        int l2 = com.crashlytics.android.p.a(4);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        int i3 = com.crashlytics.android.p.c(j2);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        int j3 = n();
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.b(j1 + 0 + l1 + i2 + (j2 + (l2 + i3)) + (j3 + (com.crashlytics.android.p.a(5) + com.crashlytics.android.p.c(j3))) + com.crashlytics.android.p.b(6, ((k) (obj4))) + com.crashlytics.android.p.e(10, i1));
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(1, k1);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(2, k2);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(3, k3);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.g(4, 2);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.b(m());
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(1, k4);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        j1 = Process.myPid();
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(2, j1);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(3, k5);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        Object aobj[] = aB.a(j1);
        if (aobj == null)
        {
            break MISSING_BLOCK_LABEL_791;
        }
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        if (aobj.length <= 1)
        {
            break MISSING_BLOCK_LABEL_791;
        }
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(4, com.crashlytics.android.k.a((String)aobj[1]));
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(5, ((Integer)aobj[0]).intValue());
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.g(5, 2);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.b(n());
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(1, Crashlytics.i());
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(6, ((k) (obj4)));
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.b(10, i1);
        aB.a(p1, "Failed to flush to session app file.");
        aB.a(((java.io.Closeable) (obj3)), "Failed to close session app file.");
        obj = null;
        obj1 = null;
        p1 = null;
        obj2 = null;
        obj3 = new n(Crashlytics.j(), (new StringBuilder()).append(s1).append("SessionOS").toString());
        obj1 = obj3;
        obj2 = p1;
        p1 = com.crashlytics.android.p.a(((OutputStream) (obj3)));
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        obj4 = com.crashlytics.android.k.a(android.os.Build.VERSION.RELEASE);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        aobj = com.crashlytics.android.k.a(android.os.Build.VERSION.CODENAME);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        boolean flag = aB.e();
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.g(8, 2);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.b(com.crashlytics.android.p.e(1, 3) + 0 + com.crashlytics.android.p.b(2, ((k) (obj4))) + com.crashlytics.android.p.b(3, ((k) (aobj))) + com.crashlytics.android.p.b(4, flag));
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.b(1, 3);
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(2, ((k) (obj4)));
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(3, ((k) (aobj)));
        obj = p1;
        obj1 = obj3;
        obj2 = p1;
        p1.a(4, flag);
        aB.a(p1, "Failed to flush to session OS file.");
        aB.a(((java.io.Closeable) (obj3)), "Failed to close session OS file.");
        c(s1);
        return;
        Exception exception1;
        exception1;
        obj3 = null;
_L12:
        obj = obj2;
        obj1 = obj3;
        a(exception1, ((OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw exception1;
        obj3;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L10:
        aB.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        aB.a(((java.io.Closeable) (obj2)), "Failed to close begin session file.");
        throw obj;
        exception1;
        obj3 = null;
_L8:
        obj = obj2;
        obj1 = obj3;
        a(exception1, ((OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw exception1;
        obj3;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L6:
        aB.a(((java.io.Flushable) (obj1)), "Failed to flush to session app file.");
        aB.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        throw obj;
        exception1;
        obj3 = null;
_L4:
        obj = obj2;
        obj1 = obj3;
        a(exception1, ((OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw exception1;
        Exception exception;
        exception;
        obj2 = obj1;
        obj1 = obj;
        obj = exception;
_L2:
        aB.a(((java.io.Flushable) (obj1)), "Failed to flush to session OS file.");
        aB.a(((java.io.Closeable) (obj2)), "Failed to close session OS file.");
        throw obj;
        obj;
        obj2 = null;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        obj2 = null;
        if (true) goto _L6; else goto _L5
_L5:
        exception1;
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        obj2 = null;
        if (true) goto _L10; else goto _L9
_L9:
        exception1;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void i()
        throws Exception
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

        afile = a(new W());
        l1 = afile.length;
        for (int j1 = 0; j1 < l1; j1++)
        {
            File file = afile[j1];
            String s1 = file.getName();
            Matcher matcher = d.matcher(s1);
            matcher.matches();
            if (!hashset.contains(matcher.group(1)))
            {
                aB.c((new StringBuilder("Trimming open session file: ")).append(s1).toString());
                file.delete();
            }
        }

        obj3 = j();
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
        obj3 = new n(k, (new StringBuilder()).append(((String) (obj3))).append("SessionUser").toString());
        obj1 = obj3;
        obj2 = obj7;
        obj7 = com.crashlytics.android.p.a(((OutputStream) (obj3)));
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        Object obj9 = Crashlytics.getInstance().p();
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        String s3 = Crashlytics.getInstance().r();
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        String s2 = Crashlytics.getInstance().q();
        if (obj9 != null || s3 != null || s2 != null) goto _L4; else goto _L3
_L3:
        aB.a(((java.io.Flushable) (obj7)), "Failed to flush session user file.");
        aB.a(((java.io.Closeable) (obj3)), "Failed to close session user file.");
_L16:
        obj = Crashlytics.getInstance().t();
        if (obj == null) goto _L6; else goto _L5
_L5:
        File afile1[];
        int i2;
        i2 = ((ax) (obj)).c();
        aB.c("Closing all open sessions.");
        afile1 = k();
        if (afile1 == null || afile1.length <= 0) goto _L8; else goto _L7
_L7:
        int k1;
        int j2;
        j2 = afile1.length;
        k1 = 0;
_L12:
        if (k1 >= j2) goto _L8; else goto _L9
_L9:
        Exception exception1;
        Object obj10 = afile1[k1];
        obj9 = a(((File) (obj10)));
        aB.c((new StringBuilder("Closing session: ")).append(((String) (obj9))).toString());
        aB.c((new StringBuilder("Collecting session parts for ID ")).append(((String) (obj9))).toString());
        obj7 = a(new X((new StringBuilder()).append(((String) (obj9))).append("SessionCrash").toString()));
        Exception exception;
        Object obj8;
        boolean flag;
        boolean flag1;
        if (obj7 != null && obj7.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aB.c(String.format("Session %s has fatal exception: %s", new Object[] {
            obj9, Boolean.valueOf(flag)
        }));
        obj3 = a(new X((new StringBuilder()).append(((String) (obj9))).append("SessionEvent").toString()));
        if (obj3 != null && obj3.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        aB.c(String.format("Session %s has non-fatal exceptions: %s", new Object[] {
            obj9, Boolean.valueOf(flag1)
        }));
        if (!flag && !flag1) goto _L11; else goto _L10
_L10:
        obj2 = null;
        obj1 = null;
        obj = new n(k, ((String) (obj9)));
        obj1 = obj2;
        obj2 = com.crashlytics.android.p.a(((OutputStream) (obj)));
        obj1 = obj2;
        aB.c((new StringBuilder("Collecting SessionStart data for session ID ")).append(((String) (obj9))).toString());
        obj1 = obj2;
        a(((p) (obj2)), ((File) (obj10)));
        obj1 = obj2;
        ((p) (obj2)).a(4, (new Date()).getTime() / 1000L);
        obj1 = obj2;
        ((p) (obj2)).a(5, flag);
        obj1 = obj2;
        a(((p) (obj2)), ((String) (obj9)));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_773;
        }
        obj1 = obj2;
        if (obj3.length <= i2)
        {
            break MISSING_BLOCK_LABEL_762;
        }
        obj1 = obj2;
        aB.c(String.format("Trimming down to %d logged exceptions.", new Object[] {
            Integer.valueOf(i2)
        }));
        obj1 = obj2;
        a(((String) (obj9)), i2);
        obj1 = obj2;
        obj3 = a(new X((new StringBuilder()).append(((String) (obj9))).append("SessionEvent").toString()));
        obj1 = obj2;
        a(((p) (obj2)), ((File []) (obj3)), ((String) (obj9)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_788;
        }
        obj1 = obj2;
        a(((p) (obj2)), obj7[0]);
        obj1 = obj2;
        ((p) (obj2)).a(11, 1);
        obj1 = obj2;
        ((p) (obj2)).b(12, 3);
        aB.a(((java.io.Flushable) (obj2)), "Error flushing session file stream");
        aB.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
_L18:
        aB.c((new StringBuilder("Removing session part files for ID ")).append(((String) (obj9))).toString());
        a(((String) (obj9)));
        k1++;
          goto _L12
_L4:
        obj8 = obj9;
        if (obj9 == null)
        {
            obj8 = "";
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        obj10 = com.crashlytics.android.k.a(((String) (obj8)));
        if (s3 != null) goto _L14; else goto _L13
_L13:
        obj8 = null;
          goto _L15
_L17:
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        i2 = com.crashlytics.android.p.b(1, ((k) (obj10))) + 0;
        k1 = i2;
        if (obj8 == null)
        {
            break MISSING_BLOCK_LABEL_945;
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        k1 = i2 + com.crashlytics.android.p.b(2, ((k) (obj8)));
        i2 = k1;
        if (obj9 == null)
        {
            break MISSING_BLOCK_LABEL_974;
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        i2 = k1 + com.crashlytics.android.p.b(3, ((k) (obj9)));
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((p) (obj7)).g(6, 2);
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((p) (obj7)).b(i2);
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((p) (obj7)).a(1, ((k) (obj10)));
        if (obj8 == null)
        {
            break MISSING_BLOCK_LABEL_1046;
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((p) (obj7)).a(2, ((k) (obj8)));
        if (obj9 == null)
        {
            break MISSING_BLOCK_LABEL_1068;
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((p) (obj7)).a(3, ((k) (obj9)));
        aB.a(((java.io.Flushable) (obj7)), "Failed to flush session user file.");
        aB.a(((java.io.Closeable) (obj3)), "Failed to close session user file.");
          goto _L16
_L14:
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        obj8 = com.crashlytics.android.k.a(s3);
          goto _L15
_L24:
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        obj9 = com.crashlytics.android.k.a(s2);
          goto _L17
        exception1;
        obj3 = null;
_L22:
        obj = obj2;
        obj1 = obj3;
        a(exception1, ((OutputStream) (obj3)));
        obj = obj2;
        obj1 = obj3;
        throw exception1;
        exception;
        obj2 = obj1;
        obj1 = obj;
        obj = exception;
_L21:
        aB.a(((java.io.Flushable) (obj1)), "Failed to flush session user file.");
        aB.a(((java.io.Closeable) (obj2)), "Failed to close session user file.");
        throw obj;
        obj2;
        obj = null;
        obj1 = null;
_L20:
        aB.a((new StringBuilder("Failed to write session file for session ID: ")).append(((String) (obj9))).toString(), ((Throwable) (obj2)));
        a(((Throwable) (obj2)), ((OutputStream) (obj1)));
        aB.a(((java.io.Flushable) (obj)), "Error flushing session file stream");
        a(((n) (obj1)));
          goto _L18
        obj2;
        obj = null;
_L19:
        aB.a(((java.io.Flushable) (obj1)), "Error flushing session file stream");
        aB.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
        throw obj2;
_L11:
        aB.c((new StringBuilder("No events present for session ID ")).append(((String) (obj9))).toString());
          goto _L18
_L6:
        aB.c("No session begin files found.");
_L8:
        return;
_L2:
        aB.c("Unable to close session. Settings are not loaded.");
        return;
        obj2;
          goto _L19
        obj2;
        Object obj4 = obj1;
        obj1 = obj;
        obj = obj4;
          goto _L19
        obj2;
        Object obj5 = null;
        obj1 = obj;
        obj = obj5;
          goto _L20
        exception1;
        obj1 = obj2;
        Object obj6 = obj;
        obj2 = exception1;
        obj = obj1;
        obj1 = obj6;
          goto _L20
        obj;
        obj2 = null;
          goto _L21
        exception1;
          goto _L22
_L15:
        if (s2 != null) goto _L24; else goto _L23
_L23:
        obj9 = null;
          goto _L17
    }

    private String j()
    {
        File afile[] = a(new X("BeginSession"));
        Arrays.sort(afile, b);
        if (afile.length > 0)
        {
            return a(afile[0]);
        } else
        {
            return null;
        }
    }

    private File[] k()
    {
        return a(new X("BeginSession"));
    }

    private void l()
    {
        File afile[] = a(a);
        int j1 = afile.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            File file = afile[i1];
            aB.c("Attempting to send crash report at time of crash...");
            (new Thread(new J(this, file), "Crashlytics Report Uploader")).start();
        }

    }

    private static int m()
    {
        int k1 = com.crashlytics.android.p.b(1, com.crashlytics.android.k.a(Crashlytics.k()));
        int i1 = Process.myPid();
        int l1 = com.crashlytics.android.p.d(2, i1);
        k1 = com.crashlytics.android.p.b(3, com.crashlytics.android.k.a(Crashlytics.d().getPackageCodePath())) + (k1 + 0 + l1);
        Object aobj[] = aB.a(i1);
        if (aobj != null && aobj.length > 1)
        {
            int j1 = com.crashlytics.android.p.b(4, com.crashlytics.android.k.a((String)aobj[1]));
            return com.crashlytics.android.p.d(5, ((Integer)aobj[0]).intValue()) + (k1 + j1);
        } else
        {
            return k1;
        }
    }

    private static int n()
    {
        return com.crashlytics.android.p.b(1, com.crashlytics.android.k.a(Crashlytics.i())) + 0;
    }

    private int o()
    {
        int j1 = com.crashlytics.android.p.b(1, 0L) + 0 + com.crashlytics.android.p.b(2, 0L) + com.crashlytics.android.p.b(3, p);
        int i1 = j1;
        if (q != null)
        {
            i1 = j1 + com.crashlytics.android.p.b(4, q);
        }
        return i1;
    }

    private static int p()
    {
        return com.crashlytics.android.p.b(1, f) + 0 + com.crashlytics.android.p.b(2, f) + com.crashlytics.android.p.b(3, 0L);
    }

    final void a(long l1, String s1)
    {
        b(new G(this, l1, s1));
    }

    final void a(Thread thread, Throwable throwable)
    {
        a(((Runnable) (new V(this, new Date(), thread, throwable))));
    }

    final void a(File afile[])
    {
        File file = new File(Crashlytics.j(), "invalidClsFiles");
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
        int j2 = afile.length;
        for (int j1 = 0; j1 < j2; j1++)
        {
            Object obj = afile[j1];
            aB.c((new StringBuilder("Found invalid session part file: ")).append(obj).toString());
            obj = a(((File) (obj)));
            L l1 = new L(this, ((String) (obj)));
            aB.c((new StringBuilder("Deleting all part files for invalid session: ")).append(((String) (obj))).toString());
            File afile1[] = a(((FilenameFilter) (l1)));
            int k2 = afile1.length;
            for (int i2 = 0; i2 < k2; i2++)
            {
                File file1 = afile1[i2];
                aB.c((new StringBuilder("Deleting session file: ")).append(file1).toString());
                file1.delete();
            }

        }

    }

    final boolean a()
    {
        return l.get();
    }

    final void b()
        throws Exception
    {
        a(new U(this));
    }

    final boolean c()
    {
        return k().length > 0;
    }

    final void d()
    {
        a(new K(this));
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        l.set(true);
        aB.c((new StringBuilder("Crashlytics is handling uncaught exception \"")).append(throwable).append("\" from thread ").append(thread.getName()).toString());
        if (!h.getAndSet(true))
        {
            aB.c("Unregistering power receivers.");
            Crashlytics.d().unregisterReceiver(o);
            Crashlytics.d().unregisterReceiver(n);
        }
        a(new T(this, new Date(), thread, throwable));
        aB.c("Crashlytics completed exception processing. Invoking default exception handler.");
        j.uncaughtException(thread, throwable);
        l.set(false);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        aB.a("An error occurred in the uncaught exception handler", ((Throwable) (obj)));
        aB.c("Crashlytics completed exception processing. Invoking default exception handler.");
        j.uncaughtException(thread, throwable);
        l.set(false);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        throw thread;
        obj;
        aB.c("Crashlytics completed exception processing. Invoking default exception handler.");
        j.uncaughtException(thread, throwable);
        l.set(false);
        throw obj;
    }

    static 
    {
        new Q();
    }
}
