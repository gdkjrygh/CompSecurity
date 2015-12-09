// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.bluetooth.broadcom.a.a;
import com.fitbit.bluetooth.connection.a.c;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            g

public class n extends c
{

    private static final String c = "ConnectionState.UnregisteringClientApplication";
    private final com.fitbit.util.threading.c d;

    public n(g g1)
    {
        super(g1);
        d = new com.fitbit.util.threading.c(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a) {

            final n a;

            public void a(Intent intent)
            {
                if ("com.fitbit.bluetooth.galileo.ACTION_APP_UNREGISTERED".equals(intent.getAction()))
                {
                    com.fitbit.bluetooth.broadcom.a.a.n.a(a);
                }
            }

            
            {
                a = n.this;
                super(threadname);
            }
        };
    }

    static void a(n n1)
    {
        n1.g();
    }

    private void f()
    {
        d.a(new IntentFilter("com.fitbit.bluetooth.galileo.ACTION_APP_UNREGISTERED"));
        if (a.a().unregisterApplication())
        {
            a(a.d.a());
            return;
        } else
        {
            com.fitbit.e.a.a("ConnectionState.UnregisteringClientApplication", "Unable to unregister client application.", new Object[0]);
            g();
            return;
        }
    }

    private void g()
    {
        a.a(new com.fitbit.bluetooth.broadcom.a.a.g(a));
        if (a.k())
        {
            a.j();
            return;
        } else
        {
            a.i();
            return;
        }
    }

    protected void a()
    {
        f();
    }

    protected void b()
    {
        f();
    }

    public String c()
    {
        return "ConnectionState.UnregisteringClientApplication";
    }

    protected void y_()
    {
        p();
        d.d();
    }

    protected void z_()
    {
        g();
    }
}
