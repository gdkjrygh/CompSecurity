// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

public final class kwm
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler a;
    private Thread.UncaughtExceptionHandler b;
    private Context c;
    private VersionInfoParcel d;

    public kwm(Context context, VersionInfoParcel versioninfoparcel, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Thread.UncaughtExceptionHandler uncaughtexceptionhandler1)
    {
        a = null;
        b = null;
        c = context;
        d = versioninfoparcel;
    }

    private static boolean a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        if (s.startsWith("com.google.android.gms.ads.ads"))
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
            flag = Class.forName(s).isAnnotationPresent(kwn);
        }
        catch (Exception exception)
        {
            (new StringBuilder("Fail to check class type for class ")).append(s).toString();
            b.p(3);
            return false;
        }
        return flag;
    }

    public final void a(Throwable throwable, boolean flag)
    {
        ktd ktd = ktk.a;
        if (((Boolean)jqc.i().a(ktd)).booleanValue()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ktd ktd1 = ktk.b;
        if (!((Boolean)jqc.i().a(ktd1)).booleanValue())
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
            jqc.c();
            arraylist.add(throwable.appendQueryParameter("device", kwz.b()).appendQueryParameter("js", d.b).appendQueryParameter("appid", c.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", stringwriter.toString()).appendQueryParameter("eids", TextUtils.join(",", ktk.a())).appendQueryParameter("trapped", String.valueOf(flag)).toString());
            jqc.c();
            kwz.a(c, d.b, arraylist, jqc.f().b());
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
