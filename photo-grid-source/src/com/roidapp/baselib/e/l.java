// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.e;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.roidapp.baselib.h;

// Referenced classes of package com.roidapp.baselib.e:
//            m, o, n, q, 
//            p

public final class l
{

    private static boolean a = false;

    public static void a()
    {
        if (android.os.Build.VERSION.SDK_INT <= 8)
        {
            System.setProperty("http.keepAlive", "false");
        }
    }

    public static void a(Context context)
    {
        if (a)
        {
            return;
        } else
        {
            a = true;
            m m1 = new m();
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
            builder.setOnKeyListener(null);
            builder.setTitle(context.getString(h.b)).setMessage(context.getString(h.e)).setPositiveButton(context.getString(h.f), new o(context)).setNegativeButton(context.getString(h.a), new n());
            context = builder.create();
            context.setOnDismissListener(m1);
            context.show();
            return;
        }
    }

    public static void a(Context context, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        a(context, onclicklistener, ((android.content.DialogInterface.OnKeyListener) (null)));
    }

    public static void a(Context context, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1)
    {
        a(context, onclicklistener, onclicklistener1, null);
    }

    public static void a(Context context, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnClickListener onclicklistener1, android.content.DialogInterface.OnKeyListener onkeylistener)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setOnKeyListener(onkeylistener);
        builder.setTitle(context.getString(h.b)).setMessage(context.getString(h.e)).setPositiveButton(context.getString(h.f), onclicklistener).setNegativeButton(context.getString(h.a), onclicklistener1).show();
    }

    public static void a(Context context, android.content.DialogInterface.OnClickListener onclicklistener, android.content.DialogInterface.OnKeyListener onkeylistener)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setOnKeyListener(onkeylistener);
        builder.setTitle(context.getString(h.b)).setMessage(context.getString(h.e)).setPositiveButton(context.getString(h.f), new q(context)).setNegativeButton(context.getString(h.a), new p(onclicklistener)).show();
    }

    static boolean b()
    {
        a = false;
        return false;
    }

    public static boolean b(Context context)
    {
        if (context == null)
        {
            return false;
        }
        Context context1 = context;
        if (context instanceof Activity)
        {
            context1 = context.getApplicationContext();
        }
        context = (ConnectivityManager)context1.getSystemService("connectivity");
        if (context == null)
        {
            return false;
        }
        context = context.getAllNetworkInfo();
        if (context != null)
        {
            int j = context.length;
            for (int i = 0; i < j; i++)
            {
                if (context[i].getState() == android.net.NetworkInfo.State.CONNECTED)
                {
                    return true;
                }
            }

        }
        return false;
    }

    public static boolean c(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.getType() == 1;
    }

    public static void d(Context context)
    {
        CookieSyncManager.createInstance(context);
        CookieManager.getInstance().removeAllCookie();
    }

}
