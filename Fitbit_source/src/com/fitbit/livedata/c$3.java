// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;

import android.content.Intent;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.livedata:
//            c, a, LiveDataState, d

class g.c extends c
{

    final com.fitbit.livedata.c a;

    protected void a(Intent intent)
    {
        if (!"com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.ACTION_STATUS_CHANGED".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        BluetoothConnectionServiceStatus bluetoothconnectionservicestatus;
        bluetoothconnectionservicestatus = (BluetoothConnectionServiceStatus)intent.getParcelableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_OLD_STATUS");
        intent = (BluetoothConnectionServiceStatus)intent.getParcelableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatusController.EXTRA_NEW_STATUS");
        if (!com.fitbit.livedata.c.a(a).b().a()) goto _L4; else goto _L3
_L3:
        if (intent.c()) goto _L6; else goto _L5
_L5:
        com.fitbit.e.a.a("BluetoothLiveDataManager", "Device is disconnected. Scheduling retry...", new Object[0]);
        com.fitbit.livedata.c.a(a).b(true);
        c.b(a).c();
_L4:
        if (!e.a(bluetoothconnectionservicestatus) && e.a(intent))
        {
            com.fitbit.e.a.a("BluetoothLiveDataManager", "Device connected. Registering...", new Object[0]);
            com.fitbit.livedata.c.a(a).a(false, intent);
        }
_L2:
        return;
_L6:
        if (intent.c() && !intent.e() && com.fitbit.livedata.c.a(a).b().a())
        {
            com.fitbit.e.a.a("BluetoothLiveDataManager", "Device is connected but LiveData notifications are not enabled. Authenticating tracker...", new Object[0]);
            if (!a.a(true))
            {
                com.fitbit.livedata.c.a(a).b(false);
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    nection.e(com.fitbit.livedata.c c1)
    {
        a = c1;
        super();
    }
}
