// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package com.bumptech.glide.manager:
//            c

class e
    implements c
{

    private final Context a;
    private final c.a b;
    private boolean c;
    private boolean d;
    private final BroadcastReceiver e = new BroadcastReceiver() {

        final e a;

        public void onReceive(Context context1, Intent intent)
        {
            boolean flag = e.a(a);
            e.a(a, e.a(a, context1));
            if (flag != e.a(a))
            {
                e.b(a).a(e.a(a));
            }
        }

            
            {
                a = e.this;
                super();
            }
    };

    public e(Context context, c.a a1)
    {
        a = context.getApplicationContext();
        b = a1;
    }

    private void a()
    {
        if (d)
        {
            return;
        } else
        {
            c = a(a);
            a.registerReceiver(e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            d = true;
            return;
        }
    }

    private boolean a(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    static boolean a(e e1)
    {
        return e1.c;
    }

    static boolean a(e e1, Context context)
    {
        return e1.a(context);
    }

    static boolean a(e e1, boolean flag)
    {
        e1.c = flag;
        return flag;
    }

    static c.a b(e e1)
    {
        return e1.b;
    }

    private void b()
    {
        if (!d)
        {
            return;
        } else
        {
            a.unregisterReceiver(e);
            d = false;
            return;
        }
    }

    public void d()
    {
        a();
    }

    public void e()
    {
        b();
    }

    public void f()
    {
    }
}
