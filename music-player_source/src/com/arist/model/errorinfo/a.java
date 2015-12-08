// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.errorinfo;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.util.Log;
import com.arist.activity.MyApplication;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.arist.model.errorinfo:
//            b

public final class a
    implements Thread.UncaughtExceptionHandler
{

    private static a b = new a();
    private Thread.UncaughtExceptionHandler a;
    private Context c;
    private DateFormat d;

    private a()
    {
        d = new SimpleDateFormat("MMddHHmmss");
    }

    public static a a()
    {
        return b;
    }

    private String a(Throwable throwable)
    {
        StringBuffer stringbuffer = new StringBuffer();
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        Object obj;
        do
        {
            throwable.printStackTrace(printwriter);
            obj = throwable.getCause();
            throwable = ((Throwable) (obj));
        } while (obj != null);
        printwriter.close();
        throwable = stringwriter.toString();
        obj = new b();
        ((b) (obj)).c(throwable);
        ((b) (obj)).a(Build.MODEL);
        ((b) (obj)).b(d.format(new Date()));
        long l = System.currentTimeMillis();
        throwable = d.format(new Date());
        throwable = (new StringBuilder("crash-")).append(throwable).append("-").append(l).append(".txt").toString();
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            ((b) (obj)).d((new StringBuilder(String.valueOf(com.arist.c.a.K))).append(throwable).toString());
        }
        obj = com.arist.model.errorinfo.b.a(((b) (obj)));
        stringbuffer.append(((String) (obj)));
        try
        {
            if (Environment.getExternalStorageState().equals("mounted"))
            {
                String s = com.arist.c.a.K;
                File file = new File(s);
                if (!file.exists())
                {
                    file.mkdirs();
                }
                throwable = new FileOutputStream((new StringBuilder(String.valueOf(s))).append(throwable).toString());
                throwable.write(stringbuffer.toString().getBytes());
                throwable.close();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            return null;
        }
        return ((String) (obj));
    }

    public final void a(Context context)
    {
        c = context;
        a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        if (MyApplication.a != null)
        {
            Log.i("CrashHandler", "\u91CA\u653EMediaPlayer");
            MyApplication.a.release();
            MyApplication.a = null;
        }
        boolean flag;
        if (throwable == null)
        {
            flag = false;
        } else
        {
            a(throwable);
            flag = true;
        }
        if (!flag && a != null)
        {
            a.uncaughtException(thread, throwable);
            return;
        }
        try
        {
            Thread.sleep(3000L);
        }
        // Misplaced declaration of an exception variable
        catch (Thread thread) { }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

}
