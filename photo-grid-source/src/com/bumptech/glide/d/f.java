// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package com.bumptech.glide.d:
//            c, g, d

final class f
    implements c
{

    private final Context a;
    private final d b;
    private boolean c;
    private boolean d;
    private final BroadcastReceiver e = new g(this);

    public f(Context context, d d1)
    {
        a = context.getApplicationContext();
        b = d1;
    }

    static boolean a(Context context)
    {
        return b(context);
    }

    static boolean a(f f1)
    {
        return f1.c;
    }

    static boolean a(f f1, boolean flag)
    {
        f1.c = flag;
        return flag;
    }

    static d b(f f1)
    {
        return f1.b;
    }

    private static boolean b(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    public final void b()
    {
        if (!d)
        {
            c = b(a);
            a.registerReceiver(e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            d = true;
        }
    }

    public final void c()
    {
        if (d)
        {
            a.unregisterReceiver(e);
            d = false;
        }
    }

    public final void d_()
    {
    }
}
