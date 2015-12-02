// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.common.process.ProcessName;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.nobreak:
//            CatchMeIfYouCan, NobreakUtils, ResetHandler

public class DefaultCatchMeIfYouCan
    implements CatchMeIfYouCan
{

    static final ProcessProfile a = new ProcessProfile("default", 3, 0x1d4c0L);
    private static final String c = com/facebook/nobreak/CatchMeIfYouCan.getSimpleName();
    final ProcessProfile b;
    private final Application d;
    private final ProcessName e;
    private final String f;
    private final String g;
    private final String h;
    private int i;
    private long j;
    private boolean k;
    private boolean l;
    private PendingIntent m;
    private ResetHandler n;
    private final Thread.UncaughtExceptionHandler o = Thread.getDefaultUncaughtExceptionHandler();

    DefaultCatchMeIfYouCan(Application application, ProcessProfile aprocessprofile[])
    {
        d = application;
        e = a(application);
        f = application.getDir("cmiyc", 0).getAbsolutePath();
        g = a(f, e);
        h = b(f, e);
        (new StringBuilder("Process (")).append(e.f()).append(") ca: '").append(g).append("'");
        (new StringBuilder("Process (")).append(e.f()).append(") fc: '").append(h).append("'");
        b = a(e, aprocessprofile);
        (new StringBuilder("Process (")).append(e.f()).append(") cp: '").append(b).append("'");
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static ProcessName a(Context context)
    {
        int i1 = Process.myPid();
        context = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        if (context == null)
        {
            return ProcessName.a;
        }
        context = context.iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)context.next();
            if (runningappprocessinfo.pid != i1)
            {
                continue;
            }
            if (runningappprocessinfo.processName != null)
            {
                return ProcessName.a(runningappprocessinfo.processName);
            }
            break;
        } while (true);
        try
        {
            context = new FileInputStream("/proc/self/cmdline");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w(c, (new StringBuilder("Did not find process name for process with pid = ")).append(i1).toString());
            return ProcessName.a(null);
        }
        context = a(((FileInputStream) (context)));
        if (context != null)
        {
            return ProcessName.a(context.trim());
        } else
        {
            Log.w(c, (new StringBuilder("Did not find process name for process with pid = ")).append(i1).toString());
            return ProcessName.a;
        }
    }

    private static ProcessProfile a(ProcessName processname, ProcessProfile aprocessprofile[])
    {
        if (!processname.a() && aprocessprofile != null)
        {
            for (int i1 = 0; i1 < aprocessprofile.length; i1++)
            {
                if (aprocessprofile[i1].a.equals(processname.c()))
                {
                    return aprocessprofile[i1];
                }
            }

        }
        return a;
    }

    private static String a(FileInputStream fileinputstream)
    {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(fileinputstream));
        fileinputstream = bufferedreader;
        String s = bufferedreader.readLine();
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (FileInputStream fileinputstream)
        {
            Log.w(c, "IOException on close", fileinputstream);
            return s;
        }
        return s;
        IOException ioexception;
        ioexception;
        bufferedreader = null;
_L4:
        fileinputstream = bufferedreader;
        Log.w(c, "IOException on readLine", ioexception);
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (FileInputStream fileinputstream)
        {
            Log.w(c, "IOException on close", fileinputstream);
            return null;
        }
        return null;
        Exception exception;
        exception;
        fileinputstream = null;
_L2:
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (FileInputStream fileinputstream)
        {
            Log.w(c, "IOException on close", fileinputstream);
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static String a(String s)
    {
        int i1 = 0;
        StringBuilder stringbuilder;
        int j1;
        try
        {
            s = MessageDigest.getInstance("SHA-1").digest(s.getBytes("UTF-8"));
            stringbuilder = new StringBuilder();
            j1 = s.length;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w(c, "Did not find support for SHA-1 algorithm", s);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.w(c, "Did not find support for UTF-8 encoding", s);
            return null;
        }
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append(String.format(null, "%02X", new Object[] {
            Byte.valueOf(s[i1])
        }));
        i1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_29;
_L1:
        s = stringbuilder.toString();
        return s;
    }

    private static String a(String s, ProcessName processname)
    {
        return (new StringBuilder()).append(s).append("/").append(c(processname)).append("01").toString();
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        File file = new File(g);
        if (file.exists())
        {
            file.delete();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(int i1, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        String s = (new StringBuilder()).append(i1).append(" ").append(l1).append(" \n").toString();
        BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(new FileOutputStream(g));
        bufferedoutputstream.write(s.getBytes());
        bufferedoutputstream.close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.w(c, "IOException", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    private void a(Throwable throwable)
    {
        Log.e(c, (new StringBuilder("Uncaught exception in '")).append(e.f()).append("':").toString());
        throwable = NobreakUtils.a(throwable).split("\n");
        int j1 = throwable.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s = throwable[i1];
            Log.e(c, s);
        }

    }

    private static String b(String s, ProcessName processname)
    {
        return (new StringBuilder()).append(s).append("/").append(c(processname)).append("02").toString();
    }

    private void b()
    {
        if (b.e && m != null)
        {
            AlarmManager alarmmanager = (AlarmManager)d.getSystemService("alarm");
            long l1 = System.currentTimeMillis() + 500L;
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                alarmmanager.set(1, l1, m);
            } else
            {
                alarmmanager.setExact(1, l1, m);
            }
            Log.e(c, (new StringBuilder("Process (")).append(e.f()).append(") is restarting...").toString());
            d();
        }
    }

    private static void b(Context context)
    {
        new DependencyHelper((byte)0);
        DependencyHelper.a(context);
    }

    private static long c()
    {
        return SystemClock.uptimeMillis();
    }

    private static String c(ProcessName processname)
    {
        if (processname.a())
        {
            return a("undefined");
        } else
        {
            return a(processname.b());
        }
    }

    private static void d()
    {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        (new FileOutputStream(h)).close();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.w(c, "IOException", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = k;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        k = true;
        Object obj = new FileInputStream(g);
        l = true;
        i = b.b;
        j = c();
        obj = a(((FileInputStream) (obj)));
        if (obj == null) goto _L1; else goto _L3
_L3:
        String as[];
        int i1;
        as = ((String) (obj)).split(" ");
        i1 = as.length;
        if (i1 < 2) goto _L1; else goto _L4
_L4:
        i = Integer.parseInt(as[0]);
        j = Long.parseLong(as[1]);
          goto _L1
        Object obj1;
        obj1;
        i = b.b;
        j = c();
          goto _L1
        obj1;
        throw obj1;
        obj1;
        (new StringBuilder("File '")).append(g).append("' was not found");
        a(0, 0L);
          goto _L1
    }

    public final void a(Intent intent)
    {
        if (intent == null)
        {
            m = null;
            return;
        }
        if (m != null)
        {
            Log.w(c, "Overriding previous request to setRestartIntent()");
        }
        m = PendingIntent.getActivity(d, 0, intent, 0x50000000);
    }

    public final void a(ResetHandler resethandler)
    {
        n = resethandler;
    }

    public final boolean a(ProcessName processname)
    {
        return (new File(b(f, processname))).exists();
    }

    public final void b(ProcessName processname)
    {
        (new File(b(f, processname))).delete();
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        long l1;
        l1 = c();
        f();
        a(throwable);
        if (l1 - j <= b.c) goto _L2; else goto _L1
_L1:
        a(1, l1);
        b();
_L8:
        if (!b.d) goto _L4; else goto _L3
_L3:
        Log.e(c, (new StringBuilder("Process (")).append(e.f()).append(") is exiting...").toString());
        d();
_L6:
        return;
_L2:
        int i1 = i + 1;
        i = i1;
        if (i1 >= b.b)
        {
            a();
            e();
            if (b.f)
            {
                b(d);
            }
            if (n != null)
            {
                n.a();
            }
        } else
        {
            a(i, l1);
            b();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (o == null) goto _L6; else goto _L5
_L5:
        o.uncaughtException(thread, throwable);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }


    private class ProcessProfile
    {

        public final String a;
        public final int b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public String toString()
        {
            return (new StringBuilder("('")).append(a).append("', ").append(b).append(", ").append(c).append(", silent [").append(d).append("], restart [").append(e).append("], logout [").append(f).append("])").toString();
        }

        public ProcessProfile(String s, int i1, long l1)
        {
            this(s, i1, l1, true, false, false);
        }

        public ProcessProfile(String s, int i1, long l1, boolean flag, boolean flag1, boolean flag2)
        {
            a = s;
            b = i1;
            c = l1;
            d = flag;
            e = flag1;
            f = flag2;
        }
    }


    private class DependencyHelper
    {

        public static void a(Context context)
        {
            SecureContextHelper securecontexthelper = (SecureContextHelper)DefaultSecureContextHelper.a(FbInjector.a(context));
            ComponentName componentname = new ComponentName(context.getPackageName(), "com.facebook.katana.LogoutActivity");
            securecontexthelper.a((new Intent()).setComponent(componentname).addFlags(0x4000000).addFlags(0x10000000), context);
        }

        private DependencyHelper()
        {
        }

        DependencyHelper(byte byte0)
        {
            this();
        }
    }

}
