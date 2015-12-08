// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;

public final class fns extends fni
{

    private BroadcastReceiver b;
    private Context c;
    private final fni d;
    private final fni e;
    private ConnectivityManager f;

    public fns(fnj fnj1, fni fni1, fni fni2)
    {
        super("Wifi");
        c = fnj1.a;
        d = fni1;
        e = fni2;
        f = (ConnectivityManager)c.getSystemService("connectivity");
        b = new BroadcastReceiver() {

            private fns a;

            public final void onReceive(Context context, Intent intent)
            {
                fns.a(a);
            }

            
            {
                a = fns.this;
                super();
            }
        };
        c.registerReceiver(b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        fnj1 = new fnl() {

            private fns a;

            public final void a()
            {
                fns.a(a);
            }

            public final void b()
            {
                fns.a(a);
            }

            
            {
                a = fns.this;
                super();
            }
        };
        e.a(fnj1);
        d.a(fnj1);
        (new Handler()).post(new Runnable() {

            private fns a;

            public final void run()
            {
                fns.a(a);
            }

            
            {
                a = fns.this;
                super();
            }
        });
    }

    static void a(fns fns1)
    {
        boolean flag = true;
        NetworkInfo networkinfo = fns1.f.getActiveNetworkInfo();
        if (networkinfo == null || !networkinfo.isConnected())
        {
            flag = false;
        } else
        if (networkinfo.getType() != 1)
        {
            flag = false;
        }
        if (flag && (fns1.d.a || fns1.e.a))
        {
            fns1.J_();
            return;
        } else
        {
            fns1.c();
            return;
        }
    }

    public final void a()
    {
        c.unregisterReceiver(b);
    }
}
