// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import com.fitbit.e.a;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            BluetoothConnectionService, g

class a
    implements Runnable
{

    final BluetoothConnectionService a;

    public void run()
    {
        com.fitbit.e.a.a("BluetoothConnectionService", "Connection timeout fired!", new Object[0]);
        BluetoothConnectionService.f(a);
        if (BluetoothConnectionService.c(a) != null)
        {
            BluetoothConnectionService.c(a).h();
        }
    }

    (BluetoothConnectionService bluetoothconnectionservice)
    {
        a = bluetoothconnectionservice;
        super();
    }
}
