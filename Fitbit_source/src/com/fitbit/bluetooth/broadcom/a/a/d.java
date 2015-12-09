// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.bluetooth.connection.a.b;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            k, h

public class d extends b
{

    private static final String c = "ConnectionState.ConnectingDevice";

    public d(g g1)
    {
        super(g1);
    }

    private void h()
    {
        if (!a.k())
        {
            a.a(new k(a));
            a.i();
            return;
        } else
        {
            a.a(new h(a));
            a.j();
            return;
        }
    }

    protected void a()
    {
        super.a();
        if (a.a().connect(a.l()))
        {
            a(e().a());
            return;
        } else
        {
            com.fitbit.e.a.a("ConnectionState.ConnectingDevice", "Unable to connect.", new Object[0]);
            z_();
            return;
        }
    }

    protected void a(Intent intent)
    {
        BluetoothDevice bluetoothdevice = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (a.l().equals(bluetoothdevice) && "com.fitbit.bluetooth.galileo.ACTION_DEVICE_CONNECTED".equals(intent.getAction()))
        {
            h();
        }
    }

    public String c()
    {
        return "ConnectionState.ConnectingDevice";
    }

    protected com.fitbit.bluetooth.connection.f.a e()
    {
        return com.fitbit.bluetooth.broadcom.a.a.e;
    }

    protected void f()
    {
        a.a(new h(a));
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
        a.a(new h(a));
        a.j();
    }

    protected IntentFilter j()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.bluetooth.galileo.ACTION_DEVICE_CONNECTED");
        return intentfilter;
    }

    protected void y_()
    {
        super.y_();
        p();
    }
}
