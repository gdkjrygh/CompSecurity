// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.bluetooth.BluetoothErrorsHandler;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            b, h, a

public class k extends b
{

    private static final String c = "ConnectionState.DiscoveringServices";
    private final c d;

    public k(g g1)
    {
        super(g1);
        d = new c(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a) {

            final k a;

            public void a(Intent intent)
            {
                if ("com.fitbit.bluetooth.galileo.ACTION_SERVICES_DISCOVERED".equals(intent.getAction()))
                {
                    com.fitbit.bluetooth.broadcom.a.a.k.a(a);
                }
            }

            
            {
                a = k.this;
                super(threadname);
            }
        };
    }

    static void a(k k1)
    {
        k1.t();
    }

    private void s()
    {
        d.a(new IntentFilter("com.fitbit.bluetooth.galileo.ACTION_SERVICES_DISCOVERED"));
        if (a.a().discoverServices(a.l()))
        {
            r();
            return;
        } else
        {
            com.fitbit.e.a.a("ConnectionState.DiscoveringServices", "Unable to discover services.", new Object[0]);
            z_();
            return;
        }
    }

    private void t()
    {
        if (!a.k())
        {
            if (u())
            {
                BluetoothErrorsHandler.a().a(com.fitbit.bluetooth.BluetoothErrorsHandler.BluetoothError.c, a.l());
                a.a(new h(a));
                a.j();
                return;
            } else
            {
                a.a(new com.fitbit.bluetooth.broadcom.a.a.a(a));
                a.i();
                return;
            }
        } else
        {
            a.a(new h(a));
            a.j();
            return;
        }
    }

    private boolean u()
    {
        boolean flag = com.fitbit.bluetooth.galileo.c.a(a.l());
        boolean flag1 = a.a().hasLiveDataService(a.l());
        com.fitbit.e.a.a("ConnectionState.DiscoveringServices", "deviceHasLiveDataInTheory = %s, deviceHasLiveDataOnPractice = %s", new Object[] {
            Boolean.valueOf(flag), Boolean.valueOf(flag1)
        });
        return flag && !flag1;
    }

    protected void a()
    {
        super.a();
        s();
    }

    public String c()
    {
        return "ConnectionState.DiscoveringServices";
    }

    protected void d()
    {
        a.a(new h(a));
        if (!a.k() && h())
        {
            a.i();
            return;
        } else
        {
            a.j();
            return;
        }
    }

    protected com.fitbit.bluetooth.connection.f.a e()
    {
        return com.fitbit.bluetooth.broadcom.a.a.f;
    }

    protected void f()
    {
        s();
    }

    protected void g()
    {
        a.a(new h(a));
        a.j();
    }

    protected void y_()
    {
        super.y_();
        d.d();
        p();
    }
}
