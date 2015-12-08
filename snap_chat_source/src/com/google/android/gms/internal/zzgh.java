// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzca, zzbx, zzgi, 
//            zzab, zzhy, zzhg, zzho

public class zzgh
    implements Thread.UncaughtExceptionHandler
{

    private Context mContext;
    private Thread.UncaughtExceptionHandler zzwb;
    private Thread.UncaughtExceptionHandler zzwc;
    private zzhy zzwd;

    public zzgh(Context context, zzhy zzhy1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Thread.UncaughtExceptionHandler uncaughtexceptionhandler1)
    {
        zzwb = uncaughtexceptionhandler;
        zzwc = uncaughtexceptionhandler1;
        mContext = context;
        zzwd = zzhy1;
    }

    public static zzgh zza(Context context, Thread thread, zzhy zzhy1)
    {
        if (context == null || thread == null || zzhy1 == null)
        {
            return null;
        }
        if (!zzn(context))
        {
            return null;
        }
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = thread.getUncaughtExceptionHandler();
        context = new zzgh(context, zzhy1, uncaughtexceptionhandler, Thread.getDefaultUncaughtExceptionHandler());
        if (uncaughtexceptionhandler == null || !(uncaughtexceptionhandler instanceof zzgh))
        {
            try
            {
                thread.setUncaughtExceptionHandler(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                zzhx.zzc("Fail to set UncaughtExceptionHandler.", context);
                return null;
            }
            return context;
        } else
        {
            return (zzgh)uncaughtexceptionhandler;
        }
    }

    private Throwable zzd(Throwable throwable)
    {
        if (((Boolean)zzca.zzqp.get()).booleanValue())
        {
            return throwable;
        }
        LinkedList linkedlist = new LinkedList();
        for (; throwable != null; throwable = throwable.getCause())
        {
            linkedlist.push(throwable);
        }

        throwable = null;
        do
        {
            if (linkedlist.isEmpty())
            {
                break;
            }
            Throwable throwable1 = (Throwable)linkedlist.pop();
            StackTraceElement astacktraceelement[] = throwable1.getStackTrace();
            ArrayList arraylist = new ArrayList();
            arraylist.add(new StackTraceElement(throwable1.getClass().getName(), "<filtered>", "<filtered>", 1));
            int j = astacktraceelement.length;
            int i = 0;
            boolean flag = false;
            while (i < j) 
            {
                StackTraceElement stacktraceelement = astacktraceelement[i];
                if (zzO(stacktraceelement.getClassName()))
                {
                    arraylist.add(stacktraceelement);
                    flag = true;
                } else
                if (zzP(stacktraceelement.getClassName()))
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

    private static boolean zzn(Context context)
    {
        return ((Boolean)zzca.zzqo.get()).booleanValue();
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        if (!zza(throwable)) goto _L2; else goto _L1
_L1:
        zzb(throwable);
        if (Looper.getMainLooper().getThread() == thread) goto _L2; else goto _L3
_L3:
        return;
_L2:
        if (zzwb != null)
        {
            zzwb.uncaughtException(thread, throwable);
            return;
        }
        if (zzwc != null)
        {
            zzwc.uncaughtException(thread, throwable);
            return;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    protected boolean zzO(String s)
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
            flag = Class.forName(s).isAnnotationPresent(com/google/android/gms/internal/zzgi);
        }
        catch (Exception exception)
        {
            zzhx.zza((new StringBuilder("Fail to check class type for class ")).append(s).toString(), exception);
            return false;
        }
        return flag;
    }

    protected boolean zzP(String s)
    {
        while (TextUtils.isEmpty(s) || !s.startsWith("android.") && !s.startsWith("java.")) 
        {
            return false;
        }
        return true;
    }

    protected boolean zza(Throwable throwable)
    {
        boolean flag2 = true;
        if (throwable == null)
        {
            flag2 = false;
        } else
        {
            boolean flag = false;
            boolean flag1 = false;
            for (; throwable != null; throwable = throwable.getCause())
            {
                StackTraceElement astacktraceelement[] = throwable.getStackTrace();
                int j = astacktraceelement.length;
                for (int i = 0; i < j; i++)
                {
                    StackTraceElement stacktraceelement = astacktraceelement[i];
                    if (zzO(stacktraceelement.getClassName()))
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
                return false;
            }
        }
        return flag2;
    }

    public void zzb(Throwable throwable)
    {
        if (zzn(mContext))
        {
            if ((throwable = zzd(throwable)) != null)
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(zzc(throwable));
                zzab.zzaM().zza(mContext, zzwd.zzzH, arraylist, zzab.zzaP().zzej());
                return;
            }
        }
    }

    protected String zzc(Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        return (new android.net.Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", android.os.Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(android.os.Build.VERSION.SDK_INT)).appendQueryParameter("device", zzab.zzaM().zzev()).appendQueryParameter("js", zzwd.zzzH).appendQueryParameter("appid", mContext.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", stringwriter.toString()).appendQueryParameter("eids", TextUtils.join(",", zzca.zzcb())).toString();
    }
}
