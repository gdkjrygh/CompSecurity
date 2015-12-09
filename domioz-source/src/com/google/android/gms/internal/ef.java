// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal:
//            eg, fj, ar, ak, 
//            a, zzhy, ek, es

public final class ef
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler a;
    private Thread.UncaughtExceptionHandler b;
    private Context c;
    private zzhy d;

    public ef(Context context, zzhy zzhy1)
    {
        a = null;
        b = null;
        c = context;
        d = zzhy1;
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
            flag = Class.forName(s).isAnnotationPresent(com/google/android/gms/internal/eg);
        }
        catch (Exception exception)
        {
            fj.a((new StringBuilder("Fail to check class type for class ")).append(s).toString(), exception);
            return false;
        }
        return flag;
    }

    public final void a(Throwable throwable)
    {
        if (((Boolean)ar.e.c()).booleanValue()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!((Boolean)ar.f.c()).booleanValue()) goto _L4; else goto _L3
_L3:
        if (throwable != null)
        {
            Object obj = new ArrayList();
            Object obj1 = new StringWriter();
            throwable.printStackTrace(new PrintWriter(((java.io.Writer) (obj1))));
            Object obj2 = (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", android.os.Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(android.os.Build.VERSION.SDK_INT));
            com.google.android.gms.internal.a.c();
            Object obj3 = Build.MANUFACTURER;
            throwable = Build.MODEL;
            StackTraceElement stacktraceelement;
            String s;
            int i;
            boolean flag;
            boolean flag1;
            int j;
            if (!throwable.startsWith(((String) (obj3))))
            {
                throwable = (new StringBuilder()).append(((String) (obj3))).append(" ").append(throwable).toString();
            }
            ((ArrayList) (obj)).add(((android.net.Uri.Builder) (obj2)).appendQueryParameter("device", throwable).appendQueryParameter("js", d.b).appendQueryParameter("appid", c.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", ((StringWriter) (obj1)).toString()).appendQueryParameter("eids", TextUtils.join(",", ar.a())).toString());
            com.google.android.gms.internal.a.c();
            es.a(c, d.b, ((java.util.List) (obj)), com.google.android.gms.internal.a.f().a());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        obj = new LinkedList();
        for (; throwable != null; throwable = throwable.getCause())
        {
            ((LinkedList) (obj)).push(throwable);
        }

        throwable = null;
        while (!((LinkedList) (obj)).isEmpty()) 
        {
            obj2 = (Throwable)((LinkedList) (obj)).pop();
            obj3 = ((Throwable) (obj2)).getStackTrace();
            obj1 = new ArrayList();
            ((ArrayList) (obj1)).add(new StackTraceElement(obj2.getClass().getName(), "<filtered>", "<filtered>", 1));
            j = obj3.length;
            i = 0;
            flag = false;
            while (i < j) 
            {
                stacktraceelement = obj3[i];
                if (a(stacktraceelement.getClassName()))
                {
                    ((ArrayList) (obj1)).add(stacktraceelement);
                    flag = true;
                } else
                {
                    s = stacktraceelement.getClassName();
                    if (!TextUtils.isEmpty(s) && (s.startsWith("android.") || s.startsWith("java.")))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1)
                    {
                        ((ArrayList) (obj1)).add(stacktraceelement);
                    } else
                    {
                        ((ArrayList) (obj1)).add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
                i++;
            }
            if (flag)
            {
                if (throwable == null)
                {
                    throwable = new Throwable(((Throwable) (obj2)).getMessage());
                } else
                {
                    throwable = new Throwable(((Throwable) (obj2)).getMessage(), throwable);
                }
                throwable.setStackTrace((StackTraceElement[])((ArrayList) (obj1)).toArray(new StackTraceElement[0]));
            }
        }
          goto _L3
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        boolean flag3 = true;
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
        boolean flag = flag3;
_L9:
        if (!flag) goto _L5; else goto _L4
_L4:
        a(throwable);
        if (Looper.getMainLooper().getThread() == thread) goto _L5; else goto _L6
_L6:
        return;
_L2:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L5:
        if (a != null)
        {
            a.uncaughtException(thread, throwable);
            return;
        }
        if (b == null) goto _L6; else goto _L7
_L7:
        b.uncaughtException(thread, throwable);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
