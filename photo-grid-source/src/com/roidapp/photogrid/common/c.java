// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import com.roidapp.baselib.c.n;
import com.roidapp.photogrid.MainPage;
import java.util.TimeZone;

// Referenced classes of package com.roidapp.photogrid.common:
//            d, p, b

public final class c
{

    private static boolean a = false;

    public static void a(Activity activity, String s)
    {
        try
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
            builder.setTitle(0x7f070267);
            builder.setView(LayoutInflater.from(activity).inflate(0x7f030009, null));
            builder.setPositiveButton(0x7f070266, new d(activity, s));
            builder.create();
            builder.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            activity.printStackTrace();
        }
    }

    static void a(Context context, String s, String s1)
    {
        String s2 = n.d(context);
        StringBuffer stringbuffer = new StringBuffer();
        if (!s1.equals(""))
        {
            stringbuffer.append(s1).append("\n\n");
        }
        stringbuffer.append((new StringBuilder("App v")).append(s2).append(",Model ").append(Build.MODEL).append(",OS v").append(android.os.Build.VERSION.RELEASE).append(", ").append(TimeZone.getDefault().getDisplayName(false, 0)).toString());
        stringbuffer.append((new StringBuilder(", Available Capacity: ")).append(p.a(context)).toString()).append("\n");
        stringbuffer.append(s);
        stringbuffer.append("\n");
        stringbuffer.append(b.a());
        s = new Intent("android.intent.action.SEND");
        s.setType("text/plain");
        s.putExtra("android.intent.extra.EMAIL", new String[] {
            "RoidApp@gmail.com"
        });
        s.putExtra("android.intent.extra.SUBJECT", (new StringBuilder("PhotoGrid Crash Log V")).append(s2).toString());
        s.putExtra("android.intent.extra.TEXT", stringbuffer.toString());
        if (n.a(context, "com.google.android.gm"))
        {
            s.setPackage("com.google.android.gm");
        }
        s.setFlags(0x10000000);
        a = true;
        context.startActivity(s);
    }

    public static void a(Handler handler, Throwable throwable)
    {
        if (handler != null)
        {
            Message message = Message.obtain();
            message.what = 123;
            StringBuffer stringbuffer = new StringBuffer();
            a(stringbuffer, throwable.getStackTrace(), ((StackTraceElement []) (null)));
            a(stringbuffer, throwable.getCause(), throwable);
            message.obj = (new StringBuilder()).append(stringbuffer.toString()).toString();
            handler.sendMessage(message);
        }
    }

    public static void a(String s, Activity activity)
    {
        if (!activity.isFinishing())
        {
            a = true;
        }
        b.a((new StringBuilder("GoHome/")).append(s).toString());
        if (a)
        {
            activity.startActivity(new Intent(activity, com/roidapp/photogrid/MainPage));
            activity.finish();
            a = false;
        }
    }

    private static void a(StringBuffer stringbuffer, Throwable throwable, Throwable throwable1)
    {
        Object obj;
        for (; throwable != null; throwable = ((Throwable) (obj)))
        {
            stringbuffer.append("Caused by:");
            stringbuffer.append(throwable.getClass().getName());
            obj = (new StringBuilder()).append(throwable.getMessage()).toString();
            if (obj != null && !((String) (obj)).equals(""))
            {
                stringbuffer.append(":").append(((String) (obj)));
            }
            stringbuffer.append("\n");
            a(stringbuffer, throwable.getStackTrace(), throwable1.getStackTrace());
            obj = throwable.getCause();
            throwable1 = throwable;
        }

    }

    private static void a(StringBuffer stringbuffer, StackTraceElement astacktraceelement[], StackTraceElement astacktraceelement1[])
    {
        boolean flag = false;
        if (astacktraceelement1 != null)
        {
            int j = astacktraceelement1.length;
            int k = astacktraceelement.length;
            int i = 0;
            do
            {
                int l = k - 1;
                k = ((flag) ? 1 : 0);
                if (l < 0)
                {
                    break;
                }
                int i1 = j - 1;
                k = ((flag) ? 1 : 0);
                if (i1 < 0)
                {
                    break;
                }
                k = l;
                j = i1;
                if (astacktraceelement[l].equals(astacktraceelement1[i1]))
                {
                    i++;
                    k = l;
                    j = i1;
                }
            } while (true);
            while (k < astacktraceelement.length - i) 
            {
                StringBuilder stringbuilder = (new StringBuilder("at ")).append(astacktraceelement[k].getClassName()).append(".").append(astacktraceelement[k].getMethodName()).append("(").append(astacktraceelement[k].getFileName());
                if (astacktraceelement[k].getLineNumber() > 0)
                {
                    astacktraceelement1 = (new StringBuilder(":")).append(astacktraceelement[k].getLineNumber()).toString();
                } else
                {
                    astacktraceelement1 = "";
                }
                stringbuffer.append(stringbuilder.append(astacktraceelement1).append(")\n").toString());
                k++;
            }
            stringbuffer.append("\t... ").append(Integer.toString(i)).append(" more\n");
        }
    }

}
