// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.y;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            s, g, o

class h extends BroadcastReceiver
{

    static final String a = com/google/android/gms/analytics/internal/h.getName();
    private final s b;
    private boolean c;
    private boolean d;

    h(s s1)
    {
        y.a(s1);
        b = s1;
    }

    private void e()
    {
        b.e();
        b.h();
    }

    private boolean f()
    {
        Object obj = (ConnectivityManager)b.a().getSystemService("connectivity");
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
        e();
        if (c)
        {
            return;
        } else
        {
            Context context = b.a();
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentfilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentfilter.addCategory(context.getPackageName());
            context.registerReceiver(this, intentfilter);
            d = f();
            b.e().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(d));
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
        b.e().c("Unregistering connectivity change receiver");
        c = false;
        d = false;
        Context context = b.a();
        try
        {
            context.unregisterReceiver(this);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            b.e().e("Failed to unregister the network broadcast receiver", illegalargumentexception);
        }
    }

    public final void c()
    {
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            return;
        } else
        {
            Context context = b.a();
            Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
            intent.addCategory(context.getPackageName());
            intent.putExtra(a, true);
            context.sendOrderedBroadcast(intent, null);
            return;
        }
    }

    public final boolean d()
    {
        if (!c)
        {
            b.e().f("Connectivity unknown. Receiver not registered");
        }
        return d;
    }

    public void onReceive(Context context, Intent intent)
    {
        e();
        context = intent.getAction();
        b.e().a("NetworkBroadcastReceiver received action", context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag = f();
            if (d != flag)
            {
                d = flag;
                b.h().a(flag);
            }
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context))
        {
            if (!intent.hasExtra(a))
            {
                context = b.h();
                context.c("Radio powered up");
                context.d();
                return;
            }
        } else
        {
            b.e().d("NetworkBroadcastReceiver received unknown action", context);
            return;
        }
    }

}
