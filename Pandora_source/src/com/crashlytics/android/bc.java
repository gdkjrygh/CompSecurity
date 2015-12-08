// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.crashlytics.android.internal.aq;
import com.crashlytics.android.internal.ba;
import com.crashlytics.android.internal.bg;
import com.crashlytics.android.internal.bh;
import com.crashlytics.android.internal.bn;
import com.crashlytics.android.internal.bo;
import com.crashlytics.android.internal.bp;
import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.ck;
import com.crashlytics.android.internal.cm;
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
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android:
//            bd, k, m, n, 
//            am, d, e, o, 
//            p, aq, be, j, 
//            ao, R, ak, w, 
//            l, an, v, g, 
//            t, i, s, bf, 
//            a, b, c, h, 
//            q

final class bc
    implements Thread.UncaughtExceptionHandler
{

    static final FilenameFilter a = new bd();
    private static Comparator b = new k();
    private static Comparator c = new m();
    private static final Pattern d = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map e = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    private static final am f = am.a("0");
    private final AtomicInteger g;
    private final AtomicBoolean h;
    private final int i;
    private final Thread.UncaughtExceptionHandler j;
    private final File k;
    private final File l;
    private final AtomicBoolean m;
    private final String n;
    private final BroadcastReceiver o;
    private final BroadcastReceiver p;
    private final am q;
    private final am r;
    private final ExecutorService s;
    private android.app.ActivityManager.RunningAppProcessInfo t;
    private bp u;
    private boolean v;
    private Thread w[];
    private List x;
    private StackTraceElement y[];

    public bc(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, e e1, String s1)
    {
        this(uncaughtexceptionhandler, e1, bg.a("Crashlytics Exception Handler"), s1);
    }

    private bc(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, e e1, ExecutorService executorservice, String s1)
    {
        g = new AtomicInteger(0);
        h = new AtomicBoolean(false);
        j = uncaughtexceptionhandler;
        s = executorservice;
        m = new AtomicBoolean(false);
        k = cm.a().i();
        l = new File(k, "initialization_marker");
        n = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
            com.crashlytics.android.d.a().f()
        });
        i = 8;
        cm.a().b().a("Crashlytics", "Checking for previous crash marker.");
        uncaughtexceptionhandler = new File(cm.a().i(), "crash_marker");
        if (uncaughtexceptionhandler.exists())
        {
            uncaughtexceptionhandler.delete();
            if (e1 != null)
            {
                try
                {
                    e1.a();
                }
                // Misplaced declaration of an exception variable
                catch (Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
                {
                    cm.a().b().a("Crashlytics", "Exception thrown by CrashlyticsListener while notifying of previous crash.", uncaughtexceptionhandler);
                }
            }
        }
        q = am.a(com.crashlytics.android.d.g());
        if (s1 == null)
        {
            uncaughtexceptionhandler = null;
        } else
        {
            uncaughtexceptionhandler = am.a(s1.replace("-", ""));
        }
        r = uncaughtexceptionhandler;
        p = new o(this);
        uncaughtexceptionhandler = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        o = new p(this);
        e1 = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        com.crashlytics.android.d.a().w().registerReceiver(p, uncaughtexceptionhandler);
        com.crashlytics.android.d.a().w().registerReceiver(o, e1);
        h.set(true);
    }

    private static int a(float f1, int i1, boolean flag, int j1, long l1, long l2)
    {
        return aq.b(1, f1) + 0 + aq.f(2, i1) + aq.b(3, flag) + aq.d(4, j1) + aq.b(5, l1) + aq.b(6, l2);
    }

    private int a(int i1, am am1, am am2, int j1, long l1, long l2, boolean flag, Map map, int k1, am am3, am am4)
    {
        int i2 = aq.b(1, am1);
        int j2 = aq.e(3, i1);
        if (am2 == null)
        {
            i1 = 0;
        } else
        {
            i1 = aq.b(4, am2);
        }
        i1 = i1 + (j2 + (i2 + 0)) + aq.d(5, j1) + aq.b(6, l1) + aq.b(7, l2) + aq.b(10, flag);
        if (map != null)
        {
            am1 = map.entrySet().iterator();
            do
            {
                j1 = i1;
                if (!am1.hasNext())
                {
                    break;
                }
                am2 = (java.util.Map.Entry)am1.next();
                j1 = a((bo)am2.getKey(), (String)am2.getValue());
                i1 = j1 + (aq.a(11) + aq.c(j1)) + i1;
            } while (true);
        } else
        {
            j1 = i1;
        }
        i2 = aq.d(12, k1);
        if (am3 == null)
        {
            i1 = 0;
        } else
        {
            i1 = aq.b(13, am3);
        }
        if (am4 == null)
        {
            k1 = 0;
        } else
        {
            k1 = aq.b(14, am4);
        }
        return k1 + (j1 + i2 + i1);
    }

    private static int a(bo bo1, String s1)
    {
        return aq.e(1, bo1.f) + aq.b(2, am.a(s1));
    }

    private static int a(StackTraceElement stacktraceelement, boolean flag)
    {
        int i1;
        int j1;
        if (stacktraceelement.isNativeMethod())
        {
            i1 = aq.b(1, Math.max(stacktraceelement.getLineNumber(), 0)) + 0;
        } else
        {
            i1 = aq.b(1, 0L) + 0;
        }
        j1 = i1 + aq.b(2, am.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        i1 = j1;
        if (stacktraceelement.getFileName() != null)
        {
            i1 = j1 + aq.b(3, am.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            i1 += aq.b(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            j1 = 2;
        } else
        {
            j1 = 0;
        }
        return aq.d(5, j1) + i1;
    }

    private static int a(String s1, String s2)
    {
        int i1 = aq.b(1, am.a(s1));
        s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        return i1 + aq.b(2, am.a(s1));
    }

    private int a(Thread thread, Throwable throwable, Map map)
    {
        int i1 = b(thread, throwable);
        i1 = i1 + (aq.a(1) + aq.c(i1)) + 0;
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
                i1 = j1 + (aq.a(2) + aq.c(j1)) + i1;
            } while (true);
        } else
        {
            j1 = i1;
        }
        i1 = j1;
        if (t != null)
        {
            boolean flag;
            if (t.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i1 = j1 + aq.b(3, flag);
        }
        return aq.d(4, com.crashlytics.android.d.a().w().getResources().getConfiguration().orientation) + i1;
    }

    private int a(Thread thread, StackTraceElement astacktraceelement[], int i1, boolean flag)
    {
        int j1 = aq.b(1, am.a(thread.getName()));
        j1 = aq.d(2, i1) + j1;
        int k1 = astacktraceelement.length;
        for (i1 = 0; i1 < k1; i1++)
        {
            int l1 = a(astacktraceelement[i1], flag);
            j1 += l1 + (aq.a(3) + aq.c(l1));
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
            k1 = aq.b(1, am.a(throwable.getClass().getName())) + 0;
            Object obj = throwable.getLocalizedMessage();
            j1 = k1;
            if (obj != null)
            {
                j1 = k1 + aq.b(3, am.a(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int l1 = astacktraceelement.length;
            for (k1 = 0; k1 < l1;)
            {
                int i2 = a(astacktraceelement[k1], true);
                int j2 = aq.a(4);
                int k2 = aq.c(i2);
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
                k1 = j1 + (i1 + (aq.a(6) + aq.c(i1)));
            }
            return k1;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            k1++;
        }
        return j1 + aq.d(7, k1);
    }

    private am a(bp bp1)
    {
        if (bp1 == null)
        {
            return null;
        }
        int ai[] = new int[1];
        ai[0] = 0;
        byte abyte0[] = new byte[bp1.a()];
        try
        {
            bp1.a(new be(this, abyte0, ai));
        }
        // Misplaced declaration of an exception variable
        catch (bp bp1)
        {
            cm.a().b().a("Crashlytics", "A problem occurred while reading the Crashlytics log file.", bp1);
        }
        return am.a(abyte0, 0, ai[0]);
    }

    private Object a(Callable callable)
    {
        try
        {
            callable = ((Callable) (s.submit(callable).get()));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            cm.a().b().a("Crashlytics", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            cm.a().b().a("Crashlytics", "Failed to execute task.", callable);
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
            runnable = s.submit(new j(this, runnable));
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            cm.a().b().a("Crashlytics", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return runnable;
    }

    static AtomicBoolean a(bc bc1)
    {
        return bc1.m;
    }

    private static void a(ao ao1)
    {
        if (ao1 == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        ao1.a();
        return;
        ao1;
        cm.a().b().a("Crashlytics", "Error closing session file stream in the presence of an exception", ao1);
        return;
    }

    private void a(com.crashlytics.android.aq aq1, int i1, StackTraceElement stacktraceelement, boolean flag)
        throws Exception
    {
        byte byte0 = 4;
        aq1.g(i1, 2);
        aq1.b(a(stacktraceelement, flag));
        if (stacktraceelement.isNativeMethod())
        {
            aq1.a(1, Math.max(stacktraceelement.getLineNumber(), 0));
        } else
        {
            aq1.a(1, 0L);
        }
        aq1.a(2, am.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        if (stacktraceelement.getFileName() != null)
        {
            aq1.a(3, am.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            aq1.a(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            i1 = byte0;
        } else
        {
            i1 = 0;
        }
        aq1.a(5, i1);
    }

    private static void a(com.crashlytics.android.aq aq1, File file)
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
        ba.a(file, "Failed to close file input stream.");
        aq1.a(abyte0);
        return;
        aq1;
        file = null;
_L6:
        ba.a(file, "Failed to close file input stream.");
        throw aq1;
_L2:
        cm.a().b().a("Crashlytics", (new StringBuilder("Tried to include a file that doesn't exist: ")).append(file.getName()).toString(), null);
        return;
        aq1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a(com.crashlytics.android.aq aq1, String s1)
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
            File afile[] = a(((FilenameFilter) (new R((new StringBuilder()).append(s1).append(s2).toString()))));
            if (afile.length == 0)
            {
                cm.a().b().a("Crashlytics", (new StringBuilder("Can't find ")).append(s2).append(" data for session ID ").append(s1).toString(), null);
            } else
            {
                cm.a().b().a("Crashlytics", (new StringBuilder("Collecting ")).append(s2).append(" data for session ID ").append(s1).toString());
                a(aq1, afile[0]);
            }
            i1++;
        }
    }

    private void a(com.crashlytics.android.aq aq1, Thread thread, Throwable throwable)
        throws Exception
    {
        aq1.g(1, 2);
        aq1.b(b(thread, throwable));
        a(aq1, thread, y, 4, true);
        int j1 = w.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            a(aq1, w[i1], (StackTraceElement[])x.get(i1), 0, false);
        }

        a(aq1, throwable, 1, 2);
        aq1.g(3, 2);
        aq1.b(r());
        aq1.a(1, f);
        aq1.a(2, f);
        aq1.a(3, 0L);
        aq1.g(4, 2);
        aq1.b(q());
        aq1.a(1, 0L);
        aq1.a(2, 0L);
        aq1.a(3, q);
        if (r != null)
        {
            aq1.a(4, r);
        }
    }

    private void a(com.crashlytics.android.aq aq1, Thread thread, StackTraceElement astacktraceelement[], int i1, boolean flag)
        throws Exception
    {
        aq1.g(1, 2);
        aq1.b(a(thread, astacktraceelement, i1, flag));
        aq1.a(1, am.a(thread.getName()));
        aq1.a(2, i1);
        int j1 = astacktraceelement.length;
        for (i1 = 0; i1 < j1; i1++)
        {
            a(aq1, 3, astacktraceelement[i1], flag);
        }

    }

    private void a(com.crashlytics.android.aq aq1, Throwable throwable, int i1, int j1)
        throws Exception
    {
label0:
        {
            boolean flag = false;
            aq1.g(j1, 2);
            aq1.b(a(throwable, 1));
            aq1.a(1, am.a(throwable.getClass().getName()));
            Object obj = throwable.getLocalizedMessage();
            if (obj != null)
            {
                aq1.a(3, am.a(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int k1 = astacktraceelement.length;
            for (j1 = 0; j1 < k1; j1++)
            {
                a(aq1, 4, astacktraceelement[j1], true);
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
                a(aq1, ((Throwable) (astacktraceelement)), i1 + 1, 6);
            }
            return;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            j1++;
        }
        aq1.a(7, j1);
    }

    private void a(com.crashlytics.android.aq aq1, Map map)
        throws Exception
    {
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); aq1.a(2, am.a(map)))
        {
            map = (java.util.Map.Entry)iterator.next();
            aq1.g(2, 2);
            aq1.b(a((String)map.getKey(), (String)map.getValue()));
            aq1.a(1, am.a((String)map.getKey()));
            String s1 = (String)map.getValue();
            map = s1;
            if (s1 == null)
            {
                map = "";
            }
        }

    }

    private void a(com.crashlytics.android.aq aq1, File afile[], String s1)
    {
        Arrays.sort(afile, ba.a);
        int j1 = afile.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            File file = afile[i1];
            try
            {
                cm.a().b().a("Crashlytics", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
                    s1, file.getName()
                }));
                a(aq1, file);
            }
            catch (Exception exception)
            {
                cm.a().b().a("Crashlytics", "Error writting non-fatal to session.", exception);
            }
            i1++;
        }
    }

    static void a(bc bc1, Date date, Thread thread, Throwable throwable)
        throws Exception
    {
        com.crashlytics.android.aq aq1;
        ao ao1;
        com.crashlytics.android.aq aq2;
        Object obj1;
        Object obj2;
        aq2 = null;
        aq1 = null;
        obj2 = null;
        obj1 = null;
        ao1 = null;
        Object obj;
        (new File(bc1.k, "crash_marker")).createNewFile();
        obj = bc1.m();
        if (obj == null) goto _L2; else goto _L1
_L1:
        com.crashlytics.android.d.b(((String) (obj)));
        obj = new ao(bc1.k, (new StringBuilder()).append(((String) (obj))).append("SessionCrash").toString());
        aq1 = obj2;
        ao1 = ((ao) (obj));
        aq2 = ((com.crashlytics.android.aq) (obj1));
        obj1 = aq.a(((OutputStream) (obj)));
        aq1 = ((com.crashlytics.android.aq) (obj1));
        ao1 = ((ao) (obj));
        aq2 = ((com.crashlytics.android.aq) (obj1));
        bc1.a(date, ((com.crashlytics.android.aq) (obj1)), thread, throwable, "crash", true);
_L3:
        ba.a(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        ba.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
_L4:
        bc1.l();
        bc1.k();
        ak.a(bc1.k, a, 4, c);
        if (!com.crashlytics.android.d.a().m())
        {
            bc1.o();
        }
        return;
_L2:
        cm.a().b().a("Crashlytics", "Tried to write a fatal exception while no session was open.", null);
        obj = null;
        obj1 = ao1;
          goto _L3
        date;
        obj = null;
_L7:
        aq1 = aq2;
        ao1 = ((ao) (obj));
        cm.a().b().a("Crashlytics", "An error occurred in the fatal exception logger", date);
        aq1 = aq2;
        ao1 = ((ao) (obj));
        bc1.a(((Throwable) (date)), ((OutputStream) (obj)));
        ba.a(aq2, "Failed to flush to session begin file.");
        ba.a(((java.io.Closeable) (obj)), "Failed to close fatal exception file output stream.");
          goto _L4
        bc1;
        ao1 = null;
_L6:
        ba.a(aq1, "Failed to flush to session begin file.");
        ba.a(ao1, "Failed to close fatal exception file output stream.");
        throw bc1;
        bc1;
        if (true) goto _L6; else goto _L5
_L5:
        date;
          goto _L7
    }

    private void a(String s1)
    {
        s1 = a(((FilenameFilter) (new w(s1))));
        int j1 = s1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            s1[i1].delete();
        }

    }

    private void a(String s1, int i1)
    {
        ak.a(k, new R((new StringBuilder()).append(s1).append("SessionEvent").toString()), i1, c);
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
        ba.a(printwriter, "Failed to close stack trace writer.");
        return;
        Exception exception;
        exception;
        throwable = null;
_L4:
        outputstream = throwable;
        cm.a().b().a("Crashlytics", "Failed to create PrintWriter", exception);
        ba.a(throwable, "Failed to close stack trace writer.");
        return;
        throwable;
        outputstream = null;
_L2:
        ba.a(outputstream, "Failed to close stack trace writer.");
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
            break MISSING_BLOCK_LABEL_174;
        }
        try
        {
            throwable = throwable.replaceAll("(\r\n|\n|\f)", " ");
            break MISSING_BLOCK_LABEL_174;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            cm.a().b().a("Crashlytics", "Could not write stack trace", throwable);
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

    private void a(Date date, com.crashlytics.android.aq aq1, Thread thread, Throwable throwable, String s1, boolean flag)
        throws Exception
    {
        long l3 = date.getTime() / 1000L;
        float f1 = ba.b(com.crashlytics.android.d.a().w());
        int l1 = ba.a(v);
        boolean flag1 = ba.c(com.crashlytics.android.d.a().w());
        int i2 = com.crashlytics.android.d.a().w().getResources().getConfiguration().orientation;
        long l4 = ba.c() - ba.a(com.crashlytics.android.d.a().w());
        long l5 = ba.b(Environment.getDataDirectory().getPath());
        t = ba.a(com.crashlytics.android.d.g(), com.crashlytics.android.d.a().w());
        x = new LinkedList();
        y = throwable.getStackTrace();
        if (flag)
        {
            date = Thread.getAllStackTraces();
            w = new Thread[date.size()];
            date = date.entrySet().iterator();
            for (int i1 = 0; date.hasNext(); i1++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)date.next();
                w[i1] = (Thread)entry.getKey();
                x.add(entry.getValue());
            }

        } else
        {
            w = new Thread[0];
        }
        am am1 = a(u);
        if (am1 == null)
        {
            cm.a().b().a("Crashlytics", "No log data to include with this event.");
        }
        ba.a(u, "There was a problem closing the Crashlytics log file.");
        u = null;
        int j1;
        int k1;
        int j2;
        int k2;
        int l2;
        int i3;
        if (!ba.a(com.crashlytics.android.d.a().w(), "com.crashlytics.CollectCustomKeys", true))
        {
            date = new TreeMap();
        } else
        {
            date = com.crashlytics.android.d.a().b();
            if (date != null && date.size() > 1)
            {
                date = new TreeMap(date);
            }
        }
        aq1.g(10, 2);
        j1 = aq.b(1, l3);
        k1 = aq.b(2, am.a(s1));
        j2 = a(thread, throwable, ((Map) (date)));
        k2 = aq.a(3);
        l2 = aq.c(j2);
        i3 = a(f1, l1, flag1, i2, l4, l5);
        k1 = j1 + 0 + k1 + (j2 + (k2 + l2)) + (i3 + (aq.a(5) + aq.c(i3)));
        j1 = k1;
        if (am1 != null)
        {
            j1 = aq.b(1, am1);
            j1 = k1 + (j1 + (aq.a(6) + aq.c(j1)));
        }
        aq1.b(j1);
        aq1.a(1, l3);
        aq1.a(2, am.a(s1));
        aq1.g(3, 2);
        aq1.b(a(thread, throwable, ((Map) (date))));
        a(aq1, thread, throwable);
        if (date != null && !date.isEmpty())
        {
            a(aq1, ((Map) (date)));
        }
        if (t != null)
        {
            if (t.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aq1.a(3, flag);
        }
        aq1.a(4, com.crashlytics.android.d.a().w().getResources().getConfiguration().orientation);
        aq1.g(5, 2);
        aq1.b(a(f1, l1, flag1, i2, l4, l5));
        aq1.a(1, f1);
        aq1.c(2, l1);
        aq1.a(3, flag1);
        aq1.a(4, i2);
        aq1.a(5, l4);
        aq1.a(6, l5);
        if (am1 != null)
        {
            aq1.g(6, 2);
            aq1.b(aq.b(1, am1));
            aq1.a(1, am1);
        }
    }

    static boolean a(bc bc1, boolean flag)
    {
        bc1.v = flag;
        return flag;
    }

    static File[] a(bc bc1, FilenameFilter filenamefilter)
    {
        return bc1.a(filenamefilter);
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
        int i1 = a(thread, y, 4, true);
        int l1 = aq.a(1);
        int i2 = aq.c(i1);
        int k1 = w.length;
        int j1 = 0;
        i1 = i1 + (l1 + i2) + 0;
        for (; j1 < k1; j1++)
        {
            l1 = a(w[j1], (StackTraceElement[])x.get(j1), 0, false);
            i1 += l1 + (aq.a(1) + aq.c(l1));
        }

        j1 = a(throwable, 1);
        k1 = aq.a(2);
        l1 = aq.c(j1);
        i2 = r();
        int j2 = aq.a(3);
        int k2 = aq.c(i2);
        int l2 = q();
        return j1 + (k1 + l1) + i1 + (i2 + (j2 + k2)) + (l2 + (aq.a(3) + aq.c(l2)));
    }

    private static am b(String s1)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return am.a(s1);
        }
    }

    private Future b(Callable callable)
    {
        try
        {
            callable = s.submit(new l(this, callable));
        }
        // Misplaced declaration of an exception variable
        catch (Callable callable)
        {
            cm.a().b().a("Crashlytics", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
        return callable;
    }

    static void b(bc bc1)
        throws Exception
    {
        bc1.l();
    }

    static void b(bc bc1, Date date, Thread thread, Throwable throwable)
    {
        com.crashlytics.android.aq aq1;
        com.crashlytics.android.aq aq2;
        com.crashlytics.android.aq aq3;
        Object obj1;
        String s1;
        aq1 = null;
        obj1 = null;
        aq3 = null;
        aq2 = null;
        s1 = bc1.m();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        com.crashlytics.android.d.a(s1);
        Object obj;
        cm.a().b().a("Crashlytics", (new StringBuilder("Crashlytics is logging non-fatal exception \"")).append(throwable).append("\" from thread ").append(thread.getName()).toString());
        obj = ba.a(bc1.g.getAndIncrement());
        obj = (new StringBuilder()).append(s1).append("SessionEvent").append(((String) (obj))).toString();
        obj = new ao(bc1.k, ((String) (obj)));
        aq1 = obj1;
        aq2 = aq3;
        aq3 = aq.a(((OutputStream) (obj)));
        aq1 = aq3;
        aq2 = aq3;
        bc1.a(date, aq3, thread, throwable, "error", false);
        ba.a(aq3, "Failed to flush to non-fatal file.");
        ba.a(((java.io.Closeable) (obj)), "Failed to close non-fatal file output stream.");
        break MISSING_BLOCK_LABEL_178;
        thread;
        date = null;
_L6:
        cm.a().b().a("Crashlytics", "An error occurred in the non-fatal exception logger", thread);
        bc1.a(thread, date);
        ba.a(aq2, "Failed to flush to non-fatal file.");
        ba.a(date, "Failed to close non-fatal file output stream.");
          goto _L3
        bc1;
        date = null;
_L5:
        ba.a(aq1, "Failed to flush to non-fatal file.");
        ba.a(date, "Failed to close non-fatal file output stream.");
        throw bc1;
_L3:
        try
        {
            bc1.a(s1, 64);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bc bc1)
        {
            cm.a().b().a("Crashlytics", "An error occurred when trimming non-fatal files.", bc1);
        }
        return;
_L2:
        cm.a().b().a("Crashlytics", "Tried to write a non-fatal exception while no session was open.", null);
        return;
        bc1;
        date = ((Date) (obj));
        continue; /* Loop/switch isn't completed */
        bc1;
        aq1 = aq2;
        if (true) goto _L5; else goto _L4
_L4:
        thread;
        date = ((Date) (obj));
          goto _L6
    }

    static void c(bc bc1)
        throws Exception
    {
        bc1.k();
    }

    private void c(String s1)
        throws Exception
    {
        Object obj;
        Object obj1 = null;
        String s2 = null;
        Object obj2;
        Object obj3;
        Object obj4;
        int i1;
        int j1;
        int k1;
        long l1;
        long l2;
        boolean flag;
        try
        {
            obj = new ao(cm.a().i(), (new StringBuilder()).append(s1).append("SessionDevice").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            s1 = ((String) (obj1));
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            s2 = null;
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        s1 = aq.a(((OutputStream) (obj)));
        s2 = s1;
        obj3 = new StatFs(Environment.getDataDirectory().getPath());
        i1 = ba.b();
        obj2 = b(Build.MODEL);
        s1 = b(Build.MANUFACTURER);
        obj1 = b(Build.PRODUCT);
        j1 = Runtime.getRuntime().availableProcessors();
        l1 = ba.c();
        l2 = (long)((StatFs) (obj3)).getBlockCount() * (long)((StatFs) (obj3)).getBlockSize();
        flag = ba.d();
        obj4 = com.crashlytics.android.d.a().d();
        obj3 = am.a(((bn) (obj4)).e());
        obj4 = ((bn) (obj4)).f();
        k1 = ba.f();
        s2.g(9, 2);
        s2.b(a(i1, ((am) (obj3)), ((am) (obj2)), j1, l1, l2, flag, ((Map) (obj4)), k1, s1, ((am) (obj1))));
        s2.a(1, ((am) (obj3)));
        s2.b(3, i1);
        s2.a(4, ((am) (obj2)));
        s2.a(5, j1);
        s2.a(6, l1);
        s2.a(7, l2);
        s2.a(10, flag);
        for (obj2 = ((Map) (obj4)).entrySet().iterator(); ((Iterator) (obj2)).hasNext(); s2.a(2, am.a((String)((java.util.Map.Entry) (obj3)).getValue())))
        {
            obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
            s2.g(11, 2);
            s2.b(a((bo)((java.util.Map.Entry) (obj3)).getKey(), (String)((java.util.Map.Entry) (obj3)).getValue()));
            s2.b(1, ((bo)((java.util.Map.Entry) (obj3)).getKey()).f);
        }

          goto _L1
        obj1;
        s1 = ((String) (obj));
        obj = obj1;
_L5:
        a(((Throwable) (obj)), s1);
        throw obj;
        obj1;
        obj = s1;
        s1 = ((String) (obj1));
_L3:
        ba.a(s2, "Failed to flush session device info.");
        ba.a(((java.io.Closeable) (obj)), "Failed to close session device file.");
        throw s1;
_L1:
        s2.a(12, k1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_406;
        }
        s2.a(13, s1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        s2.a(14, ((am) (obj1)));
        ba.a(s2, "Failed to flush session device info.");
        ba.a(((java.io.Closeable) (obj)), "Failed to close session device file.");
        return;
        s1;
        s2 = null;
        continue; /* Loop/switch isn't completed */
        s1;
        if (true) goto _L3; else goto _L2
_L2:
        break MISSING_BLOCK_LABEL_39;
        Exception exception;
        exception;
        s1 = ((String) (obj));
        obj = exception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static File d(bc bc1)
    {
        return bc1.l;
    }

    static Pattern i()
    {
        return d;
    }

    static Map j()
    {
        return e;
    }

    private void k()
        throws Exception
    {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj5;
        am am1;
        am am2;
        Object obj6;
        String s1;
        Object obj7;
        obj2 = null;
        obj3 = null;
        am1 = null;
        obj6 = null;
        obj5 = null;
        am2 = null;
        obj = null;
        obj7 = new Date();
        s1 = (new an(com.crashlytics.android.d.a().d())).toString();
        cm.a().b().a("Crashlytics", (new StringBuilder("Opening an new session with ID ")).append(s1).toString());
        Object obj1 = new ao(cm.a().i(), (new StringBuilder()).append(s1).append("BeginSession").toString());
        Exception exception;
        Exception exception1;
        am am3;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        boolean flag;
        try
        {
            obj = aq.a(((OutputStream) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            continue; /* Loop/switch isn't completed */
        }
_L9:
        ((com.crashlytics.android.aq) (obj)).a(1, am.a(n));
        ((com.crashlytics.android.aq) (obj)).a(2, am.a(s1));
        ((com.crashlytics.android.aq) (obj)).a(3, ((Date) (obj7)).getTime() / 1000L);
        ba.a(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        ba.a(((java.io.Closeable) (obj1)), "Failed to close begin session file.");
        obj2 = new ao(cm.a().i(), (new StringBuilder()).append(s1).append("SessionApp").toString());
        try
        {
            obj1 = aq.a(((OutputStream) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj = obj2;
            obj2 = obj3;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = null;
        }
        obj = am.a(com.crashlytics.android.d.g());
        obj3 = am.a(com.crashlytics.android.d.j());
        obj7 = am.a(com.crashlytics.android.d.i());
        am.a(com.crashlytics.android.d.k());
        am.a(com.crashlytics.android.d.a().w().getPackageCodePath());
        am3 = am.a(com.crashlytics.android.d.a().d().b());
        i1 = bh.a(com.crashlytics.android.d.h()).a();
        ((com.crashlytics.android.aq) (obj1)).g(7, 2);
        j1 = aq.b(1, ((am) (obj)));
        k1 = aq.b(2, ((am) (obj3)));
        l1 = aq.b(3, ((am) (obj7)));
        i2 = p();
        ((com.crashlytics.android.aq) (obj1)).b(j1 + 0 + k1 + l1 + (i2 + (aq.a(5) + aq.c(i2))) + aq.b(6, am3) + aq.e(10, i1));
        ((com.crashlytics.android.aq) (obj1)).a(1, ((am) (obj)));
        ((com.crashlytics.android.aq) (obj1)).a(2, ((am) (obj3)));
        ((com.crashlytics.android.aq) (obj1)).a(3, ((am) (obj7)));
        ((com.crashlytics.android.aq) (obj1)).g(5, 2);
        ((com.crashlytics.android.aq) (obj1)).b(p());
        ((com.crashlytics.android.aq) (obj1)).a(1, ck.a(com.crashlytics.android.d.a().w(), false));
        ((com.crashlytics.android.aq) (obj1)).a(6, am3);
        ((com.crashlytics.android.aq) (obj1)).b(10, i1);
        ba.a(((java.io.Flushable) (obj1)), "Failed to flush to session app file.");
        ba.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        obj3 = new ao(cm.a().i(), (new StringBuilder()).append(s1).append("SessionOS").toString());
        obj1 = obj3;
        obj = obj6;
        obj2 = am2;
        obj5 = aq.a(((OutputStream) (obj3)));
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        am1 = am.a(android.os.Build.VERSION.RELEASE);
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        am2 = am.a(android.os.Build.VERSION.CODENAME);
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        flag = ba.e();
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        ((com.crashlytics.android.aq) (obj5)).g(8, 2);
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        ((com.crashlytics.android.aq) (obj5)).b(aq.e(1, 3) + 0 + aq.b(2, am1) + aq.b(3, am2) + aq.b(4, flag));
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        ((com.crashlytics.android.aq) (obj5)).b(1, 3);
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        ((com.crashlytics.android.aq) (obj5)).a(2, am1);
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        ((com.crashlytics.android.aq) (obj5)).a(3, am2);
        obj1 = obj3;
        obj = obj5;
        obj2 = obj5;
        ((com.crashlytics.android.aq) (obj5)).a(4, flag);
        ba.a(((java.io.Flushable) (obj5)), "Failed to flush to session OS file.");
        ba.a(((java.io.Closeable) (obj3)), "Failed to close session OS file.");
        c(s1);
        return;
        obj2;
        obj3 = null;
        obj1 = obj;
        obj = obj3;
_L12:
        a(((Throwable) (obj2)), ((OutputStream) (obj1)));
        throw obj2;
        obj3;
        obj2 = obj;
        obj = obj3;
_L10:
        ba.a(((java.io.Flushable) (obj2)), "Failed to flush to session begin file.");
        ba.a(((java.io.Closeable) (obj1)), "Failed to close begin session file.");
        throw obj;
        obj1;
        obj = null;
        obj2 = obj3;
_L8:
        a(((Throwable) (obj1)), ((OutputStream) (obj)));
        throw obj1;
        obj3;
        obj1 = obj2;
        obj2 = obj;
        obj = obj3;
_L6:
        ba.a(((java.io.Flushable) (obj1)), "Failed to flush to session app file.");
        ba.a(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        throw obj;
        obj5;
        obj3 = null;
        obj2 = am1;
_L4:
        obj1 = obj3;
        obj = obj2;
        a(((Throwable) (obj5)), ((OutputStream) (obj3)));
        obj1 = obj3;
        obj = obj2;
        throw obj5;
        obj3;
        obj2 = obj;
        obj = obj3;
_L2:
        ba.a(((java.io.Flushable) (obj2)), "Failed to flush to session OS file.");
        ba.a(((java.io.Closeable) (obj1)), "Failed to close session OS file.");
        throw obj;
        obj;
        obj1 = null;
        obj2 = obj5;
        if (true) goto _L2; else goto _L1
_L1:
        obj5;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        obj1 = null;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        exception1;
        Object obj4 = obj1;
        obj = obj2;
        obj1 = exception1;
        obj2 = obj4;
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        obj1 = null;
        continue; /* Loop/switch isn't completed */
        exception;
        obj2 = obj;
        obj = exception;
        if (true) goto _L10; else goto _L9
        obj2;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void l()
        throws Exception
    {
        Object obj3;
        HashSet hashset = new HashSet();
        File afile[] = n();
        Arrays.sort(afile, b);
        int l1 = Math.min(8, afile.length);
        for (int i1 = 0; i1 < l1; i1++)
        {
            hashset.add(a(afile[i1]));
        }

        afile = a(new v((byte)0));
        l1 = afile.length;
        for (int j1 = 0; j1 < l1; j1++)
        {
            File file = afile[j1];
            String s1 = file.getName();
            Matcher matcher = d.matcher(s1);
            matcher.matches();
            if (!hashset.contains(matcher.group(1)))
            {
                cm.a().b().a("Crashlytics", (new StringBuilder("Trimming open session file: ")).append(s1).toString());
                file.delete();
            }
        }

        obj3 = m();
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
        obj3 = new ao(k, (new StringBuilder()).append(((String) (obj3))).append("SessionUser").toString());
        obj1 = obj3;
        obj2 = obj7;
        obj7 = aq.a(((OutputStream) (obj3)));
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        Object obj9 = com.crashlytics.android.d.a().p();
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        String s3 = com.crashlytics.android.d.a().r();
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        String s2 = com.crashlytics.android.d.a().q();
        if (obj9 != null || s3 != null || s2 != null) goto _L4; else goto _L3
_L3:
        ba.a(((java.io.Flushable) (obj7)), "Failed to flush session user file.");
        ba.a(((java.io.Closeable) (obj3)), "Failed to close session user file.");
_L16:
        obj = com.crashlytics.android.d.a().u();
        if (obj == null) goto _L6; else goto _L5
_L5:
        File afile1[];
        int i2;
        i2 = ((aq) (obj)).a;
        cm.a().b().a("Crashlytics", "Closing all open sessions.");
        afile1 = n();
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
        cm.a().b().a("Crashlytics", (new StringBuilder("Closing session: ")).append(((String) (obj9))).toString());
        cm.a().b().a("Crashlytics", (new StringBuilder("Collecting session parts for ID ")).append(((String) (obj9))).toString());
        obj7 = a(new R((new StringBuilder()).append(((String) (obj9))).append("SessionCrash").toString()));
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
        cm.a().b().a("Crashlytics", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
            obj9, Boolean.valueOf(flag)
        }));
        obj3 = a(new R((new StringBuilder()).append(((String) (obj9))).append("SessionEvent").toString()));
        if (obj3 != null && obj3.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        cm.a().b().a("Crashlytics", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
            obj9, Boolean.valueOf(flag1)
        }));
        if (!flag && !flag1) goto _L11; else goto _L10
_L10:
        obj2 = null;
        obj1 = null;
        obj = new ao(k, ((String) (obj9)));
        obj1 = obj2;
        obj2 = aq.a(((OutputStream) (obj)));
        obj1 = obj2;
        cm.a().b().a("Crashlytics", (new StringBuilder("Collecting SessionStart data for session ID ")).append(((String) (obj9))).toString());
        obj1 = obj2;
        a(((com.crashlytics.android.aq) (obj2)), ((File) (obj10)));
        obj1 = obj2;
        ((com.crashlytics.android.aq) (obj2)).a(4, (new Date()).getTime() / 1000L);
        obj1 = obj2;
        ((com.crashlytics.android.aq) (obj2)).a(5, flag);
        obj1 = obj2;
        a(((com.crashlytics.android.aq) (obj2)), ((String) (obj9)));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_863;
        }
        obj1 = obj2;
        if (obj3.length <= i2)
        {
            break MISSING_BLOCK_LABEL_852;
        }
        obj1 = obj2;
        cm.a().b().a("Crashlytics", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
            Integer.valueOf(i2)
        }));
        obj1 = obj2;
        a(((String) (obj9)), i2);
        obj1 = obj2;
        obj3 = a(new R((new StringBuilder()).append(((String) (obj9))).append("SessionEvent").toString()));
        obj1 = obj2;
        a(((com.crashlytics.android.aq) (obj2)), ((File []) (obj3)), ((String) (obj9)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_878;
        }
        obj1 = obj2;
        a(((com.crashlytics.android.aq) (obj2)), obj7[0]);
        obj1 = obj2;
        ((com.crashlytics.android.aq) (obj2)).a(11, 1);
        obj1 = obj2;
        ((com.crashlytics.android.aq) (obj2)).b(12, 3);
        ba.a(((java.io.Flushable) (obj2)), "Error flushing session file stream");
        ba.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
_L18:
        cm.a().b().a("Crashlytics", (new StringBuilder("Removing session part files for ID ")).append(((String) (obj9))).toString());
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
        obj10 = am.a(((String) (obj8)));
        if (s3 != null) goto _L14; else goto _L13
_L13:
        obj8 = null;
          goto _L15
_L17:
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        i2 = aq.b(1, ((am) (obj10))) + 0;
        k1 = i2;
        if (obj8 == null)
        {
            break MISSING_BLOCK_LABEL_1045;
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        k1 = i2 + aq.b(2, ((am) (obj8)));
        i2 = k1;
        if (obj9 == null)
        {
            break MISSING_BLOCK_LABEL_1074;
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        i2 = k1 + aq.b(3, ((am) (obj9)));
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((com.crashlytics.android.aq) (obj7)).g(6, 2);
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((com.crashlytics.android.aq) (obj7)).b(i2);
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((com.crashlytics.android.aq) (obj7)).a(1, ((am) (obj10)));
        if (obj8 == null)
        {
            break MISSING_BLOCK_LABEL_1146;
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((com.crashlytics.android.aq) (obj7)).a(2, ((am) (obj8)));
        if (obj9 == null)
        {
            break MISSING_BLOCK_LABEL_1168;
        }
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        ((com.crashlytics.android.aq) (obj7)).a(3, ((am) (obj9)));
        ba.a(((java.io.Flushable) (obj7)), "Failed to flush session user file.");
        ba.a(((java.io.Closeable) (obj3)), "Failed to close session user file.");
          goto _L16
_L14:
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        obj8 = am.a(s3);
          goto _L15
_L24:
        obj = obj7;
        obj1 = obj3;
        obj2 = obj7;
        obj9 = am.a(s2);
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
        ba.a(((java.io.Flushable) (obj1)), "Failed to flush session user file.");
        ba.a(((java.io.Closeable) (obj2)), "Failed to close session user file.");
        throw obj;
        obj2;
        obj = null;
        obj1 = null;
_L20:
        cm.a().b().a("Crashlytics", (new StringBuilder("Failed to write session file for session ID: ")).append(((String) (obj9))).toString(), ((Throwable) (obj2)));
        a(((Throwable) (obj2)), ((OutputStream) (obj1)));
        ba.a(((java.io.Flushable) (obj)), "Error flushing session file stream");
        a(((ao) (obj1)));
          goto _L18
        obj2;
        obj = null;
_L19:
        ba.a(((java.io.Flushable) (obj1)), "Error flushing session file stream");
        ba.a(((java.io.Closeable) (obj)), "Failed to close CLS file");
        throw obj2;
_L11:
        cm.a().b().a("Crashlytics", (new StringBuilder("No events present for session ID ")).append(((String) (obj9))).toString());
          goto _L18
_L6:
        cm.a().b().a("Crashlytics", "No session begin files found.");
_L8:
        return;
_L2:
        cm.a().b().a("Crashlytics", "Unable to close session. Settings are not loaded.");
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

    private String m()
    {
        File afile[] = a(new R("BeginSession"));
        Arrays.sort(afile, b);
        if (afile.length > 0)
        {
            return a(afile[0]);
        } else
        {
            return null;
        }
    }

    private File[] n()
    {
        return a(new R("BeginSession"));
    }

    private void o()
    {
        File afile[] = a(a);
        int j1 = afile.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            File file = afile[i1];
            cm.a().b().a("Crashlytics", "Attempting to send crash report at time of crash...");
            (new Thread(new g(this, file), "Crashlytics Report Uploader")).start();
        }

    }

    private static int p()
    {
        return aq.b(1, am.a(ck.a(com.crashlytics.android.d.a().w(), cm.a().g()))) + 0;
    }

    private int q()
    {
        int j1 = aq.b(1, 0L) + 0 + aq.b(2, 0L) + aq.b(3, q);
        int i1 = j1;
        if (r != null)
        {
            i1 = j1 + aq.b(4, r);
        }
        return i1;
    }

    private static int r()
    {
        return aq.b(1, f) + 0 + aq.b(2, f) + aq.b(3, 0L);
    }

    final void a(Thread thread, Throwable throwable)
    {
        a(((Runnable) (new t(this, new Date(), thread, throwable))));
    }

    final void a(File afile[])
    {
        File file = new File(cm.a().i(), "invalidClsFiles");
        if (file.exists())
        {
            if (file.isDirectory())
            {
                File afile2[] = file.listFiles();
                int l1 = afile2.length;
                for (int j1 = 0; j1 < l1; j1++)
                {
                    afile2[j1].delete();
                }

            }
            file.delete();
        }
        int j2 = afile.length;
        for (int k1 = 0; k1 < j2; k1++)
        {
            Object obj = afile[k1];
            cm.a().b().a("Crashlytics", (new StringBuilder("Found invalid session part file: ")).append(obj).toString());
            obj = a(((File) (obj)));
            i i1 = new i(this, ((String) (obj)));
            cm.a().b().a("Crashlytics", (new StringBuilder("Deleting all part files for invalid session: ")).append(((String) (obj))).toString());
            File afile1[] = a(((FilenameFilter) (i1)));
            int k2 = afile1.length;
            for (int i2 = 0; i2 < k2; i2++)
            {
                File file1 = afile1[i2];
                cm.a().b().a("Crashlytics", (new StringBuilder("Deleting session file: ")).append(file1).toString());
                file1.delete();
            }

        }

    }

    final boolean a()
    {
        return m.get();
    }

    final boolean b()
    {
        return ((Boolean)a(new s(this))).booleanValue();
    }

    final void c()
    {
        b(new bf(this));
    }

    final void d()
    {
        b(new a(this));
    }

    final void e()
    {
        b(new b(this));
    }

    final boolean f()
    {
        return ((Boolean)a(new c(this))).booleanValue();
    }

    final boolean g()
    {
        return n().length > 0;
    }

    final void h()
    {
        a(new h(this));
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        m.set(true);
        cm.a().b().a("Crashlytics", (new StringBuilder("Crashlytics is handling uncaught exception \"")).append(throwable).append("\" from thread ").append(thread.getName()).toString());
        if (!h.getAndSet(true))
        {
            cm.a().b().a("Crashlytics", "Unregistering power receivers.");
            com.crashlytics.android.d.a().w().unregisterReceiver(p);
            com.crashlytics.android.d.a().w().unregisterReceiver(o);
        }
        a(new q(this, new Date(), thread, throwable));
        cm.a().b().a("Crashlytics", "Crashlytics completed exception processing. Invoking default exception handler.");
        j.uncaughtException(thread, throwable);
        m.set(false);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        cm.a().b().a("Crashlytics", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
        cm.a().b().a("Crashlytics", "Crashlytics completed exception processing. Invoking default exception handler.");
        j.uncaughtException(thread, throwable);
        m.set(false);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        throw thread;
        obj;
        cm.a().b().a("Crashlytics", "Crashlytics completed exception processing. Invoking default exception handler.");
        j.uncaughtException(thread, throwable);
        m.set(false);
        throw obj;
    }

    static 
    {
        new n();
    }
}
