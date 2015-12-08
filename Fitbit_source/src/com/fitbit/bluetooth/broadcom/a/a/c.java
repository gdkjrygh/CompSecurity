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

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            l, g

public class c extends d
{

    private static final String c = "ConnectionState.ConnectingClientProfile";
    private final com.fitbit.util.threading.c d;

    public c(g g1)
    {
        super(g1);
        d = new com.fitbit.util.threading.c(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a) {

            final c a;

            public void a(Intent intent)
            {
                if ("com.fitbit.bluetooth.galileo.ACTION_PROFILE_CONNECTED".equals(intent.getAction()))
                {
                    com.fitbit.bluetooth.broadcom.a.a.c.a(a);
                }
            }

            
            {
                a = c.this;
                super(threadname);
            }
        };
    }

    static void a(c c1)
    {
        c1.h();
    }

    private void h()
    {
        if (!a.k())
        {
            a.a(new l(a));
            a.i();
            return;
        } else
        {
            a.a(new com.fitbit.bluetooth.broadcom.a.a.g(a));
            a.j();
            return;
        }
    }

    protected void a()
    {
        d.a(new IntentFilter("com.fitbit.bluetooth.galileo.ACTION_PROFILE_CONNECTED"));
        if (a.a().connectProfile())
        {
            r();
            return;
        } else
        {
            com.fitbit.e.a.a("ConnectionState.ConnectingClientProfile", "Unable to connect client profile.", new Object[0]);
            z_();
            return;
        }
    }

    protected void b()
    {
    }

    protected String c()
    {
        return "ConnectionState.ConnectingClientProfile";
    }

    protected com.fitbit.bluetooth.connection.f.a e()
    {
        return com.fitbit.bluetooth.broadcom.a.a.c;
    }

    protected void f()
    {
        a.a(new com.fitbit.bluetooth.broadcom.a.a.g(a));
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
        a.a(new com.fitbit.bluetooth.broadcom.a.a.g(a));
        a.j();
    }

    protected void y_()
    {
        p();
        d.d();
    }
}
