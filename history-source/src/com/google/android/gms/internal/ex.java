// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal:
//            ga, gr, ey, gs, 
//            gi

public class ex
    implements Thread.UncaughtExceptionHandler
{

    private Context mContext;
    private Thread.UncaughtExceptionHandler tf;
    private Thread.UncaughtExceptionHandler tg;
    private gs th;

    public ex(Context context, gs gs1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Thread.UncaughtExceptionHandler uncaughtexceptionhandler1)
    {
        tf = uncaughtexceptionhandler;
        tg = uncaughtexceptionhandler1;
        mContext = context;
        th = gs1;
    }

    public static ex a(Context context, Thread thread, gs gs1)
    {
        if (context == null || thread == null || gs1 == null)
        {
            return null;
        }
        ga.bN();
        if (!k(context))
        {
            return null;
        }
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = thread.getUncaughtExceptionHandler();
        context = new ex(context, gs1, uncaughtexceptionhandler, Thread.getDefaultUncaughtExceptionHandler());
        if (uncaughtexceptionhandler == null || !(uncaughtexceptionhandler instanceof ex))
        {
            try
            {
                thread.setUncaughtExceptionHandler(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                gr.c("Fail to set UncaughtExceptionHandler.", context);
                return null;
            }
            return context;
        } else
        {
            return (ex)uncaughtexceptionhandler;
        }
    }

    private String cD()
    {
        String s = Build.MANUFACTURER;
        String s1 = Build.MODEL;
        if (s1.startsWith(s))
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s).append(" ").append(s1).toString();
        }
    }

    private Throwable d(Throwable throwable)
    {
        Object obj = ga.bN();
        if (obj != null && ((Bundle) (obj)).getBoolean("gads:sdk_crash_report_full_stacktrace", false))
        {
            return throwable;
        }
        obj = new LinkedList();
        for (; throwable != null; throwable = throwable.getCause())
        {
            ((LinkedList) (obj)).push(throwable);
        }

        throwable = null;
        do
        {
            if (((LinkedList) (obj)).isEmpty())
            {
                break;
            }
            Throwable throwable1 = (Throwable)((LinkedList) (obj)).pop();
            StackTraceElement astacktraceelement[] = throwable1.getStackTrace();
            ArrayList arraylist = new ArrayList();
            arraylist.add(new StackTraceElement(throwable1.getClass().getName(), "<filtered>", "<filtered>", 1));
            int j = astacktraceelement.length;
            int i = 0;
            boolean flag = false;
            while (i < j) 
            {
                StackTraceElement stacktraceelement = astacktraceelement[i];
                if (G(stacktraceelement.getClassName()))
                {
                    arraylist.add(stacktraceelement);
                    flag = true;
                } else
                if (H(stacktraceelement.getClassName()))
                {
                    arraylist.add(stacktraceelement);
                } else
                {
                    arraylist.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                }
                i++;
            }
            if (flag)
            {
                if (throwable == null)
                {
                    throwable = new Throwable(throwable1.getMessage());
                } else
                {
                    throwable = new Throwable(throwable1.getMessage(), throwable);
                }
                throwable.setStackTrace((StackTraceElement[])arraylist.toArray(new StackTraceElement[0]));
            }
        } while (true);
        return throwable;
    }

    private static boolean k(Context context)
    {
        for (context = ga.bN(); context == null || !context.getBoolean("gads:sdk_crash_report_enabled", false);)
        {
            return false;
        }

        return true;
    }

    protected boolean G(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        if (s.startsWith("com.google.android.gms.ads"))
        {
            return true;
        }
        if (s.startsWith("com.google.ads"))
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = Class.forName(s).isAnnotationPresent(com/google/android/gms/internal/ey);
        }
        catch (Exception exception)
        {
            gr.a((new StringBuilder()).append("Fail to check class type for class ").append(s).toString(), exception);
            return false;
        }
        return flag;
    }

    protected boolean H(String s)
    {
        while (TextUtils.isEmpty(s) || !s.startsWith("android.") && !s.startsWith("java.")) 
        {
            return false;
        }
        return true;
    }

    protected boolean a(Throwable throwable)
    {
        boolean flag2 = true;
        if (throwable == null)
        {
            return false;
        }
        boolean flag = false;
        boolean flag1 = false;
        for (; throwable != null; throwable = throwable.getCause())
        {
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int j = astacktraceelement.length;
            for (int i = 0; i < j; i++)
            {
                StackTraceElement stacktraceelement = astacktraceelement[i];
                if (G(stacktraceelement.getClassName()))
                {
                    flag1 = true;
                }
                if (getClass().getName().equals(stacktraceelement.getClassName()))
                {
                    flag = true;
                }
            }

        }

        if (!flag1 || flag)
        {
            flag2 = false;
        }
        return flag2;
    }

    public void b(Throwable throwable)
    {
        if (k(mContext))
        {
            if ((throwable = d(throwable)) != null)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(c(throwable));
                gi.a(mContext, th.wS, arraylist, ga.dn());
                return;
            }
        }
    }

    protected String c(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        return (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", android.os.Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(android.os.Build.VERSION.SDK_INT)).appendQueryParameter("device", cD()).appendQueryParameter("js", th.wS).appendQueryParameter("appid", mContext.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", stringwriter.toString()).toString();
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        if (!a(throwable)) goto _L2; else goto _L1
_L1:
        b(throwable);
        if (Looper.getMainLooper().getThread() == thread) goto _L2; else goto _L3
_L3:
        return;
_L2:
        if (tf != null)
        {
            tf.uncaughtException(thread, throwable);
            return;
        }
        if (tg != null)
        {
            tg.uncaughtException(thread, throwable);
            return;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }
}
