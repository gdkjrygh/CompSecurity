// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothGattService;
import com.fitbit.util.b.a;
import com.fitbit.util.g.b;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            t, z, g, l

public class s
{

    private static final String a = "FitbitGattService";
    public static final int b;
    public static final int c;
    protected Object d;
    protected BluetoothGattService e;

    public s(BluetoothGattService bluetoothgattservice)
    {
        e = bluetoothgattservice;
    }

    s(Object obj)
    {
        d = obj;
    }

    s(UUID uuid, int i)
    {
        if (com.fitbit.util.b.a.a(18))
        {
            e = new BluetoothGattService(uuid, i);
            return;
        } else
        {
            d = com.fitbit.bluetooth.broadcom.gatt.z.a(uuid, i);
            return;
        }
    }

    public BluetoothGattService a()
    {
        return e;
    }

    public g a(UUID uuid)
    {
        Object obj = null;
        if (e == null) goto _L2; else goto _L1
_L1:
        if (e.getCharacteristic(uuid) == null) goto _L4; else goto _L3
_L3:
        uuid = new g(e.getCharacteristic(uuid));
_L6:
        return uuid;
_L4:
        com.fitbit.e.a.a("FitbitGattService", "getCharacteristic: characteristic is null %s!", new Object[] {
            uuid
        });
        return null;
_L2:
        com.fitbit.util.g.b.b b1 = com.fitbit.util.g.b.a(d, t.d, new Object[] {
            uuid
        });
        uuid = obj;
        if (b1.c != null)
        {
            return (g)com.fitbit.bluetooth.broadcom.gatt.l.a().a(com/fitbit/bluetooth/broadcom/gatt/g, b1.c);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public UUID b()
    {
        if (e != null)
        {
            return e.getUuid();
        }
        com.fitbit.util.g.b.b b1 = com.fitbit.util.g.b.a(d, t.c, new Object[0]);
        if (b1.c == null)
        {
            return null;
        } else
        {
            return (UUID)b1.c;
        }
    }

    public int c()
    {
        return 0;
    }

    public List d()
    {
        return null;
    }

    public List e()
    {
        return null;
    }

    static 
    {
        b = com.fitbit.bluetooth.broadcom.gatt.t.a;
        c = com.fitbit.bluetooth.broadcom.gatt.t.b;
    }
}
