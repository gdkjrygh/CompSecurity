// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.bluetooth.connection.a.d;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            d, n

public class l extends d
{

    private static final String c = "ConnectionState.RegisteringClientApplication";
    private final c d;

    public l(g g1)
    {
        super(g1);
        d = new c(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a) {

            final l a;

            public void a(Intent intent)
            {
                if ("com.fitbit.bluetooth.galileo.ACTION_APP_REGISTERED".equals(intent.getAction()))
                {
                    com.fitbit.bluetooth.broadcom.a.a.l.a(a);
                }
            }

            
            {
                a = l.this;
                super(threadname);
            }
        };
    }

    static void a(l l1)
    {
        l1.h();
    }

    private void h()
    {
        if (!a.k())
        {
            a.a(new com.fitbit.bluetooth.broadcom.a.a.d(a));
            a.i();
            return;
        } else
        {
            a.a(new n(a));
            a.j();
            return;
        }
    }

    protected void a()
    {
        d.a(new IntentFilter("com.fitbit.bluetooth.galileo.ACTION_APP_REGISTERED"));
        if (a.a().registerApplication())
        {
            r();
            return;
        } else
        {
            com.fitbit.e.a.a("ConnectionState.RegisteringClientApplication", "Unable to register client application.", new Object[0]);
            z_();
            return;
        }
    }

    protected void b()
    {
    }

    protected String c()
    {
        return "ConnectionState.RegisteringClientApplication";
    }

    protected com.fitbit.bluetooth.connection.f.a e()
    {
        return com.fitbit.bluetooth.broadcom.a.a.d;
    }

    protected void f()
    {
        a.a(new n(a));
        if (!a.k())
        {
            a.i();
            return;
        } else
        {
            a.j();
            return;
        }
    }

    protected void g()
    {
        a.a(new n(a));
        a.j();
    }

    protected void y_()
    {
        p();
        d.d();
    }
}
