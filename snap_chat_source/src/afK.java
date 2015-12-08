// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.UUID;

public final class afK
    implements Thread.UncaughtExceptionHandler
{

    afJ a;
    private boolean b;
    private Thread.UncaughtExceptionHandler c;

    public afK(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, afJ afj, boolean flag)
    {
        b = false;
        c = uncaughtexceptionhandler;
        b = flag;
        a = afj;
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

    public static void a(String s, afJ afj)
    {
        Date date = new Date();
        String s1;
        try
        {
            s1 = UUID.randomUUID().toString();
            BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter((new StringBuilder()).append(afH.a).append("/").append(s1).append(".stacktrace").toString()));
            bufferedwriter.write((new StringBuilder("Package: ")).append(afH.d).append("\n").toString());
            bufferedwriter.write((new StringBuilder("Version Code: ")).append(afH.b).append("\n").toString());
            bufferedwriter.write((new StringBuilder("Version Name: ")).append(afH.c).append("\n").toString());
            bufferedwriter.write((new StringBuilder("Android: ")).append(afH.e).append("\n").toString());
            bufferedwriter.write((new StringBuilder("Manufacturer: ")).append(afH.g).append("\n").toString());
            bufferedwriter.write((new StringBuilder("Model: ")).append(afH.f).append("\n").toString());
            if (afH.h != null)
            {
                bufferedwriter.write((new StringBuilder("CrashReporter Key: ")).append(afH.h).append("\n").toString());
            }
            bufferedwriter.write((new StringBuilder("Date: ")).append(date).append("\n").toString());
            bufferedwriter.write("\n");
            bufferedwriter.write(s);
            bufferedwriter.flush();
            bufferedwriter.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        if (afj == null)
        {
            break MISSING_BLOCK_LABEL_400;
        }
        a(a(afj.c()), (new StringBuilder()).append(s1).append(".user").toString());
        a(a(afj.d()), (new StringBuilder()).append(s1).append(".contact").toString());
        a(afj.b(), (new StringBuilder()).append(s1).append(".description").toString());
    }

    private static void a(String s, String s1)
    {
        try
        {
            s1 = (new StringBuilder()).append(afH.a).append("/").append(s1).toString();
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

    public static void a(Throwable throwable, afJ afj)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        a(stringwriter.toString(), afj);
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        if (afH.a == null)
        {
            c.uncaughtException(thread, throwable);
            return;
        }
        a(throwable, a);
        if (!b)
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
