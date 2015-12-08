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
import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            ab, j, t

class k extends BroadcastReceiver
{

    static final String a = com/google/android/gms/analytics/internal/k.getName();
    private final ab b;
    private boolean c;
    private boolean d;

    k(ab ab1)
    {
        u.a(ab1);
        b = ab1;
    }

    private void g()
    {
        i();
        j();
    }

    private Context h()
    {
        return b.b();
    }

    private j i()
    {
        return b.f();
    }

    private t j()
    {
        return b.i();
    }

    public void a()
    {
        g();
        if (c)
        {
            return;
        } else
        {
            Context context = h();
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentfilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentfilter.addCategory(context.getPackageName());
            context.registerReceiver(this, intentfilter);
            d = f();
            b.f().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(d));
            c = true;
            return;
        }
    }

    public void b()
    {
        if (!d())
        {
            return;
        }
        b.f().b("Unregistering connectivity change receiver");
        c = false;
        d = false;
        Context context = h();
        try
        {
            context.unregisterReceiver(this);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            i().e("Failed to unregister the network broadcast receiver", illegalargumentexception);
        }
    }

    public void c()
    {
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            return;
        } else
        {
            Context context = h();
            Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
            intent.addCategory(context.getPackageName());
            intent.putExtra(a, true);
            context.sendOrderedBroadcast(intent, null);
            return;
        }
    }

    public boolean d()
    {
        return c;
    }

    public boolean e()
    {
        if (!c)
        {
            b.f().e("Connectivity unknown. Receiver not registered");
        }
        return d;
    }

    protected boolean f()
    {
        Object obj = (ConnectivityManager)h().getSystemService("connectivity");
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
            break MISSING_BLOCK_LABEL_33;
        }
        flag = ((NetworkInfo) (obj)).isConnected();
        if (flag)
        {
            return true;
        }
        return false;
    }

    public void onReceive(Context context, Intent intent)
    {
        g();
        context = intent.getAction();
        b.f().a("NetworkBroadcastReceiver received action", context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag = f();
            if (d != flag)
            {
                d = flag;
                j().a(flag);
            }
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context))
        {
            if (!intent.hasExtra(a))
            {
                j().e();
                return;
            }
        } else
        {
            b.f().d("NetworkBroadcastReceiver received unknown action", context);
            return;
        }
    }

}
