// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import com.fitbit.bluetooth.Manufacturer;
import com.fitbit.bluetooth.broadcom.gatt.a.g;
import com.fitbit.bluetooth.k;
import com.fitbit.bluetooth.n;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            aa, c

abstract class m
    implements android.bluetooth.BluetoothProfile.ServiceListener
{

    private static final String a = "FitbitGattProfile";
    private BluetoothProfile b;

    m()
    {
    }

    protected abstract void a();

    protected abstract void a(int i);

    protected abstract void a(int i, BluetoothProfile bluetoothprofile);

    protected abstract void a(BluetoothDevice bluetoothdevice);

    protected abstract void b();

    protected abstract void b(BluetoothDevice bluetoothdevice);

    protected boolean b(int i)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("FitbitGattProfile", "Connecting to the Bluetooth Profile...", new Object[0]);
        if (com.fitbit.bluetooth.g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("FitbitGattProfile", "Unable to connect to the Bluetooth Profile: Bluetooth is turned off.", new Object[0]);
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        com.fitbit.e.a.a("FitbitGattProfile", "Unable to connect to the Bluetooth Profile: previous connection is in progress.", new Object[0]);
          goto _L3
        Exception exception;
        exception;
        throw exception;
        flag = com.fitbit.bluetooth.broadcom.gatt.c.a(i, this);
          goto _L3
    }

    protected boolean c(int i)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("FitbitGattProfile", "Disconnecting from the Bluetooth Profile...", new Object[0]);
        if (com.fitbit.bluetooth.g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("FitbitGattProfile", "Unable to disconnect from the Bluetooth Profile: Bluetooth is turned off.", new Object[0]);
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (b != null || n.a().a() == Manufacturer.e)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        com.fitbit.e.a.a("FitbitGattProfile", "Unable to disconnect from the Bluetooth Profile: no current connection.", new Object[0]);
          goto _L3
        Exception exception;
        exception;
        throw exception;
        flag = com.fitbit.bluetooth.broadcom.gatt.c.a(i, b, this);
          goto _L3
    }

    protected void g()
    {
        com.fitbit.e.a.a("FitbitGattProfile", "dropClientProfile", new Object[0]);
        b = null;
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothprofile)
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("FitbitGattProfile", "Bluetooth Profile (%s) is connected.", new Object[] {
            Integer.valueOf(i)
        });
        b = bluetoothprofile;
        a(i, bluetoothprofile);
        this;
        JVM INSTR monitorexit ;
        return;
        bluetoothprofile;
        throw bluetoothprofile;
    }

    public void onServiceDisconnected(int i)
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("FitbitGattProfile", "Bluetooth Profile (%s) is disconnected.", new Object[] {
            Integer.valueOf(i)
        });
        a(i);
        b = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        (new aa()).a(com.fitbit.bluetooth.broadcom.gatt.a.g.a());
    }
}
