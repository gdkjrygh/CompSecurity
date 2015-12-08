// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.os.Process;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.UUID;

// Referenced classes of package net.hockeyapp.android:
//            a, c

public class d
    implements Thread.UncaughtExceptionHandler
{

    private boolean a;
    private c b;
    private Thread.UncaughtExceptionHandler c;

    public d(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, c c1, boolean flag)
    {
        a = false;
        c = uncaughtexceptionhandler;
        a = flag;
        b = c1;
    }

    private static String a(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.length() > 255)
            {
                s1 = s.substring(0, 255);
            }
        }
        return s1;
    }

    private static void a(String s, String s1)
    {
        try
        {
            s1 = (new StringBuilder()).append(a.a).append("/").append(s1).toString();
            if (s.trim().length() > 0)
            {
                s1 = new BufferedWriter(new FileWriter(s1));
                s1.write(s);
                s1.flush();
                s1.close();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public static void a(Throwable throwable, c c1)
    {
        Date date = new Date();
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        Object obj;
        try
        {
            throwable = UUID.randomUUID().toString();
            obj = (new StringBuilder()).append(a.a).append("/").append(throwable).append(".stacktrace").toString();
            Log.d("HockeyApp", (new StringBuilder()).append("Writing unhandled exception to: ").append(((String) (obj))).toString());
            obj = new BufferedWriter(new FileWriter(((String) (obj))));
            ((BufferedWriter) (obj)).write((new StringBuilder()).append("Package: ").append(a.d).append("\n").toString());
            ((BufferedWriter) (obj)).write((new StringBuilder()).append("Version Code: ").append(a.b).append("\n").toString());
            ((BufferedWriter) (obj)).write((new StringBuilder()).append("Version Name: ").append(a.c).append("\n").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            Log.e("HockeyApp", "Error saving exception stacktrace!\n", throwable);
            return;
        }
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        if (!c1.c())
        {
            break MISSING_BLOCK_LABEL_308;
        }
        ((BufferedWriter) (obj)).write((new StringBuilder()).append("Android: ").append(a.e).append("\n").toString());
        ((BufferedWriter) (obj)).write((new StringBuilder()).append("Manufacturer: ").append(a.g).append("\n").toString());
        ((BufferedWriter) (obj)).write((new StringBuilder()).append("Model: ").append(a.f).append("\n").toString());
        if (a.h == null)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        if (!c1.d())
        {
            break MISSING_BLOCK_LABEL_356;
        }
        ((BufferedWriter) (obj)).write((new StringBuilder()).append("CrashReporter Key: ").append(a.h).append("\n").toString());
        ((BufferedWriter) (obj)).write((new StringBuilder()).append("Date: ").append(date).append("\n").toString());
        ((BufferedWriter) (obj)).write("\n");
        ((BufferedWriter) (obj)).write(stringwriter.toString());
        ((BufferedWriter) (obj)).flush();
        ((BufferedWriter) (obj)).close();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_499;
        }
        a(a(c1.f()), (new StringBuilder()).append(throwable).append(".user").toString());
        a(a(c1.e()), (new StringBuilder()).append(throwable).append(".contact").toString());
        a(c1.a(), (new StringBuilder()).append(throwable).append(".description").toString());
    }

    public void a(c c1)
    {
        b = c1;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        if (a.a == null)
        {
            c.uncaughtException(thread, throwable);
            return;
        }
        a(throwable, b);
        if (!a)
        {
            c.uncaughtException(thread, throwable);
            return;
        } else
        {
            Process.killProcess(Process.myPid());
            System.exit(10);
            return;
        }
    }
}
