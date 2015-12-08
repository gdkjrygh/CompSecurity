// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            BluetoothConnectionService, e

class a
    implements Runnable
{

    final Intent a;
    final BluetoothConnectionService b;

    public void run()
    {
        if (a != null)
        {
            String s = a.getAction();
            android.os.ParcelUuid parceluuid = e.b(a.getExtras());
            if (com.fitbit.bluetooth.connection.BluetoothConnectionService.a(b))
            {
                com.fitbit.e.a.a("BluetoothConnectionService", "Unable to process action. Service is stopping. Restarting...", new Object[0]);
                b.startService(a);
            } else
            {
                boolean flag;
                if ("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_CONNECT".equals(s))
                {
                    flag = BluetoothConnectionService.c(b, a);
                } else
                if ("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECT".equals(s))
                {
                    flag = BluetoothConnectionService.d(b, a);
                } else
                if ("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_EXECUTE_COMMAND".equals(s))
                {
                    flag = BluetoothConnectionService.e(b, a);
                } else
                if ("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_EXECUTE_CANCEL".equals(s))
                {
                    flag = b.a(a);
                } else
                {
                    flag = false;
                }
                if (parceluuid != null)
                {
                    Intent intent = new Intent("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_STARTED");
                    intent.putExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_SUCCESS", flag);
                    intent.putExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_ACTION_UUID", parceluuid);
                    z.a(intent);
                }
                if (!flag)
                {
                    com.fitbit.e.a.a("BluetoothConnectionService", "Unable to process action: %s", new Object[] {
                        s
                    });
                    if (BluetoothConnectionService.c(b) == null && BluetoothConnectionService.d(b) == null)
                    {
                        BluetoothConnectionService.e(b);
                        return;
                    }
                }
            }
        }
    }

    (BluetoothConnectionService bluetoothconnectionservice, Intent intent)
    {
        b = bluetoothconnectionservice;
        a = intent;
        super();
    }
}
