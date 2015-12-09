// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.bluetooth:
//            BluetoothErrorsHandler, e, n, k

class a extends c
{

    final BluetoothErrorsHandler a;

    public void a(Intent intent)
    {
label0:
        {
            if ("com.fitbit.bluetooth.BluetoothUtils.ACTION_BLUETOOTH_RESET_RESPONSE".equals(intent.getAction()))
            {
                if (!intent.getBooleanExtra("com.fitbit.bluetooth.BluetoothUtils.EXTRA_BLUETOOTH_RESET_RESPONSE", false))
                {
                    break label0;
                }
                com.fitbit.e.a.a("BluetoothErrorsHandler", "Processing positive response", new Object[0]);
                com.fitbit.bluetooth.BluetoothErrorsHandler.a(a).c();
                if (!com.fitbit.bluetooth.n.a().d())
                {
                    com.fitbit.e.a.a("BluetoothErrorsHandler", "Unable to disable Bluetooth.", new Object[0]);
                    com.fitbit.bluetooth.BluetoothErrorsHandler.a(a).d();
                    BluetoothErrorsHandler.b(a);
                }
            }
            return;
        }
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Processing negative response", new Object[0]);
        BluetoothErrorsHandler.b(a);
    }

    (BluetoothErrorsHandler bluetootherrorshandler)
    {
        a = bluetootherrorshandler;
        super();
    }
}
