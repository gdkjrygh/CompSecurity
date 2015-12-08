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
//            gb, gs, ez, gt, 
//            gj

public class ey
    implements Thread.UncaughtExceptionHandler
{

    private Context mContext;
    private Thread.UncaughtExceptionHandler sR;
    private Thread.UncaughtExceptionHandler sS;
    private gt sT;

    public ey(Context context, gt gt1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Thread.UncaughtExceptionHandler uncaughtexceptionhandler1)
    {
        sR = uncaughtexceptionhandler;
        sS = uncaughtexceptionhandler1;
        mContext = context;
        sT = gt1;
    }

    public static ey a(Context context, Thread thread, gt gt1)
    {
        if (context == null || thread == null || gt1 == null)
        {
            return null;
        }
        gb.bD();
        if (!k(context))
        {
            return null;
        }
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = thread.getUncaughtExceptionHandler();
        context = new ey(context, gt1, uncaughtexceptionhandler, Thread.getDefaultUncaughtExceptionHandler());
        if (uncaughtexceptionhandler == null || !(uncaughtexceptionhandler instanceof ey))
        {
            try
            {
                thread.setUncaughtExceptionHandler(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                gs.c("Fail to set UncaughtExceptionHandler.", context);
                return null;
            }
            return context;
        } else
        {
            return (ey)uncaughtexceptionhandler;
        }
    }

    private String cw()
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
        Object obj = gb.bD();
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
        for (context = gb.bD(); context == null || !context.getBoolean("gads:sdk_crash_report_enabled", false);)
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
            flag = Class.forName(s).isAnnotationPresent(com/google/android/gms/internal/ez);
        }
        catch (Exception exception)
        {
            gs.a((new StringBuilder()).append("Fail to check class type for class ").append(s).toString(), exception);
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
                gj.a(mContext, sT.wD, arraylist, gb.de());
                return;
            }
        }
    }

    protected String c(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        return (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", android.os.Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(android.os.Build.VERSION.SDK_INT)).appendQueryParameter("device", cw()).appendQueryParameter("js", sT.wD).appendQueryParameter("appid", mContext.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", stringwriter.toString()).toString();
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
        if (sR != null)
        {
            sR.uncaughtException(thread, throwable);
            return;
        }
        if (sS != null)
        {
            sS.uncaughtException(thread, throwable);
            return;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }
}
