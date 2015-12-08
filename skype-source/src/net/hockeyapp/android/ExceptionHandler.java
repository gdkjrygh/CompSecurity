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
//            Constants, CrashManagerListener

public class ExceptionHandler
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler defaultExceptionHandler;
    private boolean ignoreDefaultHandler;
    private CrashManagerListener listener;

    public ExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashManagerListener crashmanagerlistener, boolean flag)
    {
        ignoreDefaultHandler = false;
        defaultExceptionHandler = uncaughtexceptionhandler;
        ignoreDefaultHandler = flag;
        listener = crashmanagerlistener;
    }

    private static String limitedString(String s)
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

    private void writeValueToFile(String s, String s1)
    {
        try
        {
            s1 = (new StringBuilder()).append(Constants.FILES_PATH).append("/").append(s1).toString();
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

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Date date = new Date();
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        if (listener.onCrashesFound() != CrashManagerListener.CrashHandlingPolicy.DO_NOTHING)
        {
            try
            {
                String s = UUID.randomUUID().toString();
                Object obj = (new StringBuilder()).append(Constants.FILES_PATH).append("/").append(s).append(".stacktrace").toString();
                String s1 = Constants.TAG;
                obj = new BufferedWriter(new FileWriter(((String) (obj))));
                ((BufferedWriter) (obj)).write((new StringBuilder("Package: ")).append(Constants.APP_PACKAGE).append("\n").toString());
                ((BufferedWriter) (obj)).write((new StringBuilder("Version: ")).append(Constants.APP_VERSION).append("\n").toString());
                ((BufferedWriter) (obj)).write((new StringBuilder("Android: ")).append(Constants.ANDROID_VERSION).append("\n").toString());
                ((BufferedWriter) (obj)).write((new StringBuilder("Manufacturer: ")).append(Constants.PHONE_MANUFACTURER).append("\n").toString());
                ((BufferedWriter) (obj)).write((new StringBuilder("Model: ")).append(Constants.PHONE_MODEL).append("\n").toString());
                ((BufferedWriter) (obj)).write((new StringBuilder("Date: ")).append(date).append("\n").toString());
                ((BufferedWriter) (obj)).write("\n");
                ((BufferedWriter) (obj)).write(stringwriter.toString());
                ((BufferedWriter) (obj)).flush();
                ((BufferedWriter) (obj)).close();
                if (listener != null)
                {
                    writeValueToFile(limitedString(listener.getUserID()), (new StringBuilder()).append(s).append(".user").toString());
                    writeValueToFile(limitedString(listener.getContact()), (new StringBuilder()).append(s).append(".contact").toString());
                    writeValueToFile(listener.getDescription(), (new StringBuilder()).append(s).append(".description").toString());
                }
            }
            catch (Exception exception)
            {
                Log.e(Constants.TAG, "Error saving exception stacktrace!\n", exception);
            }
        }
        if (!ignoreDefaultHandler)
        {
            defaultExceptionHandler.uncaughtException(thread, throwable);
            return;
        } else
        {
            Process.killProcess(Process.myPid());
            System.exit(10);
            return;
        }
    }
}
