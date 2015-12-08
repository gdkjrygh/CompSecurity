// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.bluetooth.broadcom.a.a;
import com.fitbit.bluetooth.connection.a.c;
import com.fitbit.bluetooth.galileo.GalileoProfile;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            o, j

public class g extends c
{

    private static final String c = "ConnectionState.DisconnectingClientProfile";
    private final com.fitbit.util.threading.c d;

    public g(com.fitbit.bluetooth.connection.g g1)
    {
        super(g1);
        d = new com.fitbit.util.threading.c(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a) {

            final g a;

            public void a(Intent intent)
            {
                if ("com.fitbit.bluetooth.galileo.ACTION_PROFILE_DISCONNECTED".equals(intent.getAction()))
                {
                    com.fitbit.bluetooth.broadcom.a.a.g.a(a);
                }
            }

            
            {
                a = g.this;
                super(threadname);
            }
        };
    }

    static void a(g g1)
    {
        g1.g();
    }

    private void f()
    {
        d.a(new IntentFilter("com.fitbit.bluetooth.galileo.ACTION_PROFILE_DISCONNECTED"));
        if (a.a().disconnectProfile())
        {
            a(a.i.a());
            return;
        } else
        {
            com.fitbit.e.a.a("ConnectionState.DisconnectingClientProfile", "Unable to disconnect client profile.", new Object[0]);
            g();
            return;
        }
    }

    private void g()
    {
        if (a.k())
        {
            a.a(new o(a));
            a.j();
            return;
        } else
        {
            a.a(new j(a));
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
        return "ConnectionState.DisconnectingClientProfile";
    }

    protected void y_()
    {
        p();
        d.d();
    }

    protected void z_()
    {
        a.a().makeCleanupAfterUnconfirmedDisconnect();
        g();
    }
}
