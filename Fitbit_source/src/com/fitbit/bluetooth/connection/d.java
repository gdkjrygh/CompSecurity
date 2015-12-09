// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            BluetoothConnectionServiceStatus

public class d
{

    public static final String a = "com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED";
    public static final String b = "com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_OLD_STATUS";
    public static final String c = "com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_NEW_STATUS";
    private static final String d = "BluetoothConnectionServiceStatusController";
    private static d e;
    private final Object f = new Object();
    private BluetoothConnectionServiceStatus g;

    private d()
    {
        g = new BluetoothConnectionServiceStatus();
    }

    public static d a()
    {
        com/fitbit/bluetooth/connection/d;
        JVM INSTR monitorenter ;
        d d1;
        if (e == null)
        {
            e = new d();
        }
        d1 = e;
        com/fitbit/bluetooth/connection/d;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    void a(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        a(bluetoothconnectionservicestatus, null);
    }

    void a(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus, Intent intent)
    {
        boolean flag = true;
        Object obj = null;
        BluetoothConnectionServiceStatus bluetoothconnectionservicestatus1;
        Object obj1;
        if (bluetoothconnectionservicestatus == null)
        {
            bluetoothconnectionservicestatus1 = new BluetoothConnectionServiceStatus();
        } else
        {
            bluetoothconnectionservicestatus1 = bluetoothconnectionservicestatus;
        }
        obj1 = f;
        obj1;
        JVM INSTR monitorenter ;
        if (g.equals(bluetoothconnectionservicestatus1)) goto _L2; else goto _L1
_L1:
        obj = g;
        g = bluetoothconnectionservicestatus1;
        com.fitbit.e.a.a("BluetoothConnectionServiceStatusController", "Bluetooth connection status changed: %s", new Object[] {
            bluetoothconnectionservicestatus
        });
        bluetoothconnectionservicestatus = ((BluetoothConnectionServiceStatus) (obj));
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj = new Intent("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED");
        if (bluetoothconnectionservicestatus == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ((Intent) (obj)).putExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_OLD_STATUS", bluetoothconnectionservicestatus);
        if (bluetoothconnectionservicestatus1 == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        ((Intent) (obj)).putExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_NEW_STATUS", bluetoothconnectionservicestatus1);
        z.a(((Intent) (obj)));
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        z.a(intent);
        obj1;
        JVM INSTR monitorexit ;
        return;
        bluetoothconnectionservicestatus;
        obj1;
        JVM INSTR monitorexit ;
        throw bluetoothconnectionservicestatus;
_L2:
        flag = false;
        bluetoothconnectionservicestatus = ((BluetoothConnectionServiceStatus) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public BluetoothConnectionServiceStatus b()
    {
        BluetoothConnectionServiceStatus bluetoothconnectionservicestatus;
        synchronized (f)
        {
            bluetoothconnectionservicestatus = g;
        }
        return bluetoothconnectionservicestatus;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
