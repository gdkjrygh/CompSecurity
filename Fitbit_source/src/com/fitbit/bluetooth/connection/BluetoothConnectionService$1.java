// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            BluetoothConnectionService, d, BluetoothConnectionServiceStatus

class a extends c
{

    final BluetoothConnectionService a;

    public void a(Intent intent)
    {
        if (com.fitbit.bluetooth.connection.BluetoothConnectionService.a(a))
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Unable to process broadcast %s. Service is stopping", new Object[] {
                intent.getAction()
            });
        } else
        {
            if ("com.fitbit.bluetooth.connection.ConnectionStateContext.ACTION_CONNECTION_OPENED".equals(intent.getAction()))
            {
                com.fitbit.bluetooth.connection.BluetoothConnectionService.a(a, intent);
                return;
            }
            if ("com.fitbit.bluetooth.connection.ConnectionStateContext.ACTION_CONNECTION_CLOSED".equals(intent.getAction()))
            {
                BluetoothConnectionService.b(a, intent);
                return;
            }
            if ("com.fitbit.bluetooth.dncs.ACTION_DEVICE_SUBSCRIBED".equals(intent.getAction()))
            {
                BluetoothConnectionService.b(a).a(BluetoothConnectionService.b(a).b().i().d(true).a());
                return;
            }
            if ("com.fitbit.bluetooth.dncs.ACTION_DEVICE_DISCONNECTED".equals(intent.getAction()))
            {
                BluetoothConnectionService.b(a).a(BluetoothConnectionService.b(a).b().i().d(false).a());
                return;
            }
        }
    }

    tus.a(BluetoothConnectionService bluetoothconnectionservice, com.fitbit.util.threading.e e)
    {
        a = bluetoothconnectionservice;
        super(e);
    }
}
