// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothDevice;
import bluetooth.le.external.b;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            i, g, j

public class ab extends i
{
    public static interface a
    {

        public abstract void a(BluetoothDevice bluetoothdevice, int j, byte abyte0[]);
    }


    private static final String d = "FitbitScanProfile";
    private final a e;

    public ab(a a1)
    {
        e = a1;
    }

    protected void a()
    {
        com.fitbit.e.a.a("FitbitScanProfile", "Application registered", new Object[0]);
        com.fitbit.e.a.a("FitbitScanProfile", "Start scan", new Object[0]);
        e();
    }

    protected void a(BluetoothDevice bluetoothdevice)
    {
    }

    protected void a(BluetoothDevice bluetoothdevice, int j, byte abyte0[])
    {
        if (e != null)
        {
            e.a(bluetoothdevice, j, abyte0);
        }
    }

    protected void a(bluetooth.le.external.a a1)
    {
    }

    protected void a(bluetooth.le.external.a a1, int j)
    {
    }

    protected void a(b b1, int j)
    {
    }

    protected void a(g g)
    {
    }

    protected void a(g g, int j)
    {
    }

    protected void a(j j, int k)
    {
    }

    protected void b()
    {
        com.fitbit.e.a.a("FitbitScanProfile", "Application unregistered", new Object[0]);
        com.fitbit.e.a.a("FitbitScanProfile", "Disconencting profile...", new Object[0]);
        disconnectProfile();
    }

    protected void b(BluetoothDevice bluetoothdevice)
    {
    }

    protected void b(bluetooth.le.external.a a1, int j)
    {
    }

    protected void b(g g, int j)
    {
    }

    protected void c()
    {
        com.fitbit.e.a.a("FitbitScanProfile", "Profile connected", new Object[0]);
        com.fitbit.e.a.a("FitbitScanProfile", "Registering application...", new Object[0]);
        registerApplication();
    }

    protected void c(BluetoothDevice bluetoothdevice)
    {
    }

    protected void d()
    {
        com.fitbit.e.a.a("FitbitScanProfile", "Profile disconnected", new Object[0]);
    }

    public boolean h()
    {
        com.fitbit.e.a.a("FitbitScanProfile", "Connecting profile...", new Object[0]);
        return connectProfile();
    }

    public boolean i()
    {
        com.fitbit.e.a.a("FitbitScanProfile", "Stop scan", new Object[0]);
        f();
        com.fitbit.e.a.a("FitbitScanProfile", "Unregistering application...", new Object[0]);
        if (!unregisterApplication())
        {
            com.fitbit.e.a.a("FitbitScanProfile", "Unable to unregister application", new Object[0]);
            com.fitbit.e.a.a("FitbitScanProfile", "Disconencting profile...", new Object[0]);
            disconnectProfile();
        }
        return true;
    }
}
