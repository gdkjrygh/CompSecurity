// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class bmq extends BroadcastReceiver
{

    private static String d = bmq.getName();
    final bnf a;
    boolean b;
    boolean c;

    bmq(bnf bnf1)
    {
        btl.a(bnf1);
        a = bnf1;
    }

    final void a()
    {
        a.a();
        a.c();
    }

    public final void b()
    {
        if (!b)
        {
            return;
        }
        a.a().b("Unregistering connectivity change receiver");
        b = false;
        c = false;
        Context context = a.a;
        try
        {
            context.unregisterReceiver(this);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            a.a().e("Failed to unregister the network broadcast receiver", illegalargumentexception);
        }
    }

    public final void c()
    {
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            return;
        } else
        {
            Context context = a.a;
            Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
            intent.addCategory(context.getPackageName());
            intent.putExtra(d, true);
            context.sendOrderedBroadcast(intent, null);
            return;
        }
    }

    final boolean d()
    {
        Object obj = (ConnectivityManager)a.a.getSystemService("connectivity");
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

    public void onReceive(Context context, Intent intent)
    {
        a();
        context = intent.getAction();
        a.a().a("NetworkBroadcastReceiver received action", context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            boolean flag = d();
            if (c != flag)
            {
                c = flag;
                context = a.c();
                context.a("Network connectivity status changed", Boolean.valueOf(flag));
                ((bnc) (context)).f.b().a(new bnb._cls2(context));
            }
        } else
        if ("com.google.analytics.RADIO_POWERED".equals(context))
        {
            if (!intent.hasExtra(d))
            {
                context = a.c();
                context.b("Radio powered up");
                context.b();
                return;
            }
        } else
        {
            a.a().d("NetworkBroadcastReceiver received unknown action", context);
            return;
        }
    }

}
