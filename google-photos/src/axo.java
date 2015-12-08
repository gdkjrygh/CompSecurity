// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class axo
    implements ds
{

    final axm a;
    boolean b;
    private final Context c;
    private boolean d;
    private final BroadcastReceiver e = new axp(this);

    public axo(Context context, axm axm)
    {
        c = context.getApplicationContext();
        a = axm;
    }

    static boolean a(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    public final void c_()
    {
        if (!d)
        {
            b = a(c);
            c.registerReceiver(e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            d = true;
        }
    }

    public final void d_()
    {
        if (d)
        {
            c.unregisterReceiver(e);
            d = false;
        }
    }

    public final void j_()
    {
    }
}
