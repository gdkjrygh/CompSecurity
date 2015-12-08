// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class jsp extends BroadcastReceiver
{

    static final String a = jsp.getName();
    final jrk b;
    boolean c;
    boolean d;

    jsp(jrk jrk1)
    {
        b.d(jrk1);
        b = jrk1;
    }

    private void c()
    {
        b.a();
        b.c();
    }

    private boolean d()
    {
        Object obj = (ConnectivityManager)b.a.getSystemService("connectivity");
        boolean flag;
        try
        {
            obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        }
        catch (SecurityException securityexception)
        {
            return false;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        flag = ((NetworkInfo) (obj)).isConnected();
        if (flag)
        {
            return true;
        }
        return false;
    }

    public final void a()
    {
        c();
        if (c)
        {
            return;
        } else
        {
            Context context = b.a;
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentfilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentfilter.addCategory(context.getPackageName());
            context.registerReceiver(this, intentfilter);
            d = d();
            b.a().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(d));
            c = true;
            return;
        }
    }

    public final void b()
    {
        if (!c)
        {
            return;
        }
        b.a().b("Unregistering connectivity change receiver");
        c = false;
        d = false;
        Context context = b.a;
        try
        {
            context.unregisterReceiver(this);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            b.a().e("Failed to unregister the network broadcast receiver", illegalargumentexception);
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        c();
        context = intent.getAction();
        b.a().a("NetworkBroadcastReceiver received action", context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag = d();
            if (d != flag)
            {
                d = flag;
                b.c().a(flag);
            }
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context))
        {
            if (!intent.hasExtra(a))
            {
                b.c().c();
                return;
            }
        } else
        {
            b.a().d("NetworkBroadcastReceiver received unknown action", context);
            return;
        }
    }

}
