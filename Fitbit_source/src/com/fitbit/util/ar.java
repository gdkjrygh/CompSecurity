// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

public class ar extends c
{
    public static interface a
    {

        public abstract void j();

        public abstract void l_();
    }


    private static final String a = "NetworkStateReceiver";
    private final a b;
    private Boolean c;

    public ar(a a1)
    {
        b = a1;
    }

    public static boolean c(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    private void d(Context context)
    {
label0:
        {
            boolean flag = c(context);
            if (c == null || c.booleanValue() != flag)
            {
                c = Boolean.valueOf(flag);
                if (flag)
                {
                    context = "connected";
                } else
                {
                    context = "disconnected";
                }
                com.fitbit.e.a.a("NetworkStateReceiver", "Connection state changed: %s", new Object[] {
                    context
                });
                if (!flag)
                {
                    break label0;
                }
                b.l_();
            }
            return;
        }
        b.j();
    }

    private void e(Context context)
    {
        boolean flag = c(context);
        if (c == null || c.booleanValue() != flag)
        {
            c = Boolean.valueOf(flag);
        }
    }

    public void a(Context context)
    {
        a(context, false);
    }

    public void a(Context context, boolean flag)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        b(intentfilter);
        if (!flag)
        {
            d(context);
            return;
        } else
        {
            e(context);
            return;
        }
    }

    public void a(Intent intent)
    {
        d(FitBitApplication.a());
    }

    public boolean a()
    {
        return c != null && c.booleanValue();
    }

    public void b(Context context)
    {
        e();
        c = null;
    }
}
