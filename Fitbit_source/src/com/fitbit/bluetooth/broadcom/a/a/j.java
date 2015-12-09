// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.a.a;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.ParcelUuid;
import bluetooth.le.BluetoothLeScanCallbacks;
import bluetooth.le.b;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.bluetooth.connection.a.a;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.util.threading.FitbitHandlerThread;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fitbit.bluetooth.broadcom.a.a:
//            o, c

class j extends a
    implements BluetoothLeScanCallbacks, com.fitbit.bluetooth.a.a
{

    private static final String c = "ConnectionState.Discovering";
    private final com.fitbit.bluetooth.a d;
    private final b e;
    private volatile boolean f;
    private boolean g;
    private long h;

    public j(g g1)
    {
        super(g1);
        h = 12000L;
        if (com.fitbit.util.b.a.a(18))
        {
            d = null;
            g1 = FitbitHandlerThread.b(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a);
            e = bluetooth.le.b.a(FitBitApplication.a().getApplicationContext(), this, g1.getLooper());
            return;
        } else
        {
            d = new com.fitbit.bluetooth.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a);
            e = null;
            return;
        }
    }

    private void e()
    {
        if (!n() && (a.k() || !f))
        {
            a.a(new o(a));
            a.j();
        }
    }

    public void A_()
    {
        g = true;
    }

    public void B_()
    {
        com.fitbit.e.a.a("ConnectionState.Discovering", "onScanEnded", new Object[0]);
        g = false;
        e();
    }

    public void C_()
    {
        e();
    }

    protected void a()
    {
        com.fitbit.e.a.a("ConnectionState.Discovering", "Start scan.", new Object[0]);
        if (e != null)
        {
            bluetooth.le.external.ScanFilter scanfilter = (new bluetooth.le.external.ScanFilter.a()).a(new ParcelUuid(GalileoProfile.l), new ParcelUuid(GalileoProfile.m)).b(a.l().getAddress()).a();
            e.a(Collections.singletonList(scanfilter), (new bluetooth.le.external.ScanSettings.a()).a(1).b(h).a());
        } else
        if (!d.a(this))
        {
            a.a(new o(a));
            a.j();
            return;
        }
    }

    public void a(bluetooth.le.BluetoothLeScanCallbacks.ScanError scanerror)
    {
    }

    public void a(List list)
    {
        while (a.k() || list.isEmpty()) 
        {
            return;
        }
        com.fitbit.e.a.a("ConnectionState.Discovering", "Device found", new Object[0]);
        f = true;
        g = false;
        a.a(new c(a));
        a.i();
        try
        {
            e.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            FitBitApplication.a().c().a(0x7f11000b).b("google_bt_crash");
        }
        com.fitbit.e.a.e("ConnectionState.Discovering", "stopScan failed!", list, new Object[0]);
    }

    public boolean a(BluetoothDevice bluetoothdevice, int i, byte abyte0[])
    {
        if (a.k())
        {
            return true;
        }
        if (bluetoothdevice.equals(a.l()))
        {
            com.fitbit.e.a.a("ConnectionState.Discovering", "Device found: %s", new Object[] {
                bluetoothdevice
            });
            f = true;
            a.a(new c(a));
            a.i();
            return true;
        } else
        {
            return false;
        }
    }

    protected void b()
    {
        if (!g)
        {
            return;
        }
        com.fitbit.e.a.a("ConnectionState.Discovering", "Stop scan.", new Object[0]);
        g = false;
        if (e != null)
        {
            e.a();
        } else
        {
            d.a();
        }
        e();
    }

    public String c()
    {
        return "ConnectionState.Discovering";
    }

    protected void y_()
    {
        b();
    }
}
