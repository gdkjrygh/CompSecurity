// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;
import java.util.Set;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            BluetoothConnectionController, BluetoothConnectionServiceStatus, e

class a extends c
{

    final BluetoothConnectionController a;

    public void a(Intent intent)
    {
        if ("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED".equals(intent.getAction()) && !com.fitbit.bluetooth.connection.e.a((BluetoothConnectionServiceStatus)intent.getParcelableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_NEW_STATUS")))
        {
            synchronized (com.fitbit.bluetooth.connection.BluetoothConnectionController.a(a))
            {
                if (BluetoothConnectionController.b(a).size() > 0)
                {
                    BluetoothConnectionController.b(a).clear();
                    com.fitbit.e.a.a("BluetoothConnectionController", "Clear all. Count = 0", new Object[0]);
                }
            }
            return;
        } else
        {
            return;
        }
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (BluetoothConnectionController bluetoothconnectioncontroller)
    {
        a = bluetoothconnectioncontroller;
        super();
    }
}
