// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal:
//            ay, ax, zzgk, gm, 
//            gd

public final class fl
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler a;
    private Thread.UncaughtExceptionHandler b;
    private Context c;
    private VersionInfoParcel d;

    public fl(Context context, VersionInfoParcel versioninfoparcel, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Thread.UncaughtExceptionHandler uncaughtexceptionhandler1)
    {
        a = uncaughtexceptionhandler;
        b = uncaughtexceptionhandler1;
        c = context;
        d = versioninfoparcel;
    }

    public static fl a(Context context, Thread thread, VersionInfoParcel versioninfoparcel)
    {
        if (context == null || thread == null || versioninfoparcel == null)
        {
            return null;
        }
        if (!a())
        {
            return null;
        }
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = thread.getUncaughtExceptionHandler();
        context = new fl(context, versioninfoparcel, uncaughtexceptionhandler, Thread.getDefaultUncaughtExceptionHandler());
        if (uncaughtexceptionhandler == null || !(uncaughtexceptionhandler instanceof fl))
        {
            try
            {
                thread.setUncaughtExceptionHandler(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                if (com.google.android.gms.ads.internal.util.client.b.a(4))
                {
                    Log.i("Ads", "Fail to set UncaughtExceptionHandler.", context);
                }
                return null;
            }
            return context;
        } else
        {
            return (fl)uncaughtexceptionhandler;
        }
    }

    private static boolean a()
    {
        au au = ay.g;
        return ((Boolean)p.n().a(au)).booleanValue();
    }

    private static boolean a(String s)
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
            flag = Class.forName(s).isAnnotationPresent(com/google/android/gms/internal/zzgk);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.b.a(3);
            return false;
        }
        return flag;
    }

    public final void a(Throwable throwable, boolean flag)
    {
        if (a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        au au = ay.h;
        if (!((Boolean)p.n().a(au)).booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        if (throwable != null)
        {
            ArrayList arraylist = new ArrayList();
            StringWriter stringwriter = new StringWriter();
            throwable.printStackTrace(new PrintWriter(stringwriter));
            throwable = (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", android.os.Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(android.os.Build.VERSION.SDK_INT));
            p.e();
            arraylist.add(throwable.appendQueryParameter("device", gm.c()).appendQueryParameter("js", d.b).appendQueryParameter("appid", c.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", stringwriter.toString()).appendQueryParameter("eids", TextUtils.join(",", ay.a())).appendQueryParameter("trapped", String.valueOf(flag)).toString());
            p.e();
            gm.a(c, d.b, arraylist, p.h().g());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        LinkedList linkedlist = new LinkedList();
        for (; throwable != null; throwable = throwable.getCause())
        {
            linkedlist.push(throwable);
        }

        throwable = null;
        while (!linkedlist.isEmpty()) 
        {
            Throwable throwable1 = (Throwable)linkedlist.pop();
            StackTraceElement astacktraceelement[] = throwable1.getStackTrace();
            ArrayList arraylist1 = new ArrayList();
            arraylist1.add(new StackTraceElement(throwable1.getClass().getName(), "<filtered>", "<filtered>", 1));
            int j = astacktraceelement.length;
            int i = 0;
            boolean flag1 = false;
            while (i < j) 
            {
                StackTraceElement stacktraceelement = astacktraceelement[i];
                if (a(stacktraceelement.getClassName()))
                {
                    flag1 = true;
                    arraylist1.add(stacktraceelement);
                } else
                {
                    String s = stacktraceelement.getClassName();
                    boolean flag2;
                    if (!TextUtils.isEmpty(s) && (s.startsWith("android.") || s.startsWith("java.")))
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    if (flag2)
                    {
                        arraylist1.add(stacktraceelement);
                    } else
                    {
                        arraylist1.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
                i++;
            }
            if (flag1)
            {
                if (throwable == null)
                {
                    throwable = new Throwable(throwable1.getMessage());
                } else
                {
                    throwable = new Throwable(throwable1.getMessage(), throwable);
                }
                throwable.setStackTrace((StackTraceElement[])arraylist1.toArray(new StackTraceElement[0]));
            }
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        if (throwable == null) goto _L2; else goto _L1
_L1:
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = false;
        for (Throwable throwable1 = throwable; throwable1 != null; throwable1 = throwable1.getCause())
        {
            StackTraceElement astacktraceelement[] = throwable1.getStackTrace();
            int j = astacktraceelement.length;
            for (int i = 0; i < j; i++)
            {
                StackTraceElement stacktraceelement = astacktraceelement[i];
                if (a(stacktraceelement.getClassName()))
                {
                    flag2 = true;
                }
                if (getClass().getName().equals(stacktraceelement.getClassName()))
                {
                    flag1 = true;
                }
            }

        }

        if (!flag2 || flag1) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L11:
        if (!flag) goto _L5; else goto _L4
_L4:
        if (Looper.getMainLooper().getThread() == thread) goto _L7; else goto _L6
_L6:
        a(throwable, true);
_L9:
        return;
_L2:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L7:
        a(throwable, false);
_L5:
        if (a != null)
        {
            a.uncaughtException(thread, throwable);
            return;
        }
        if (b == null) goto _L9; else goto _L8
_L8:
        b.uncaughtException(thread, throwable);
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }
}
