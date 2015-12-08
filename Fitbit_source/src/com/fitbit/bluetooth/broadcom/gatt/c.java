// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothProfile;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.Manufacturer;
import com.fitbit.bluetooth.k;
import com.fitbit.bluetooth.n;
import com.fitbit.e.a;
import com.fitbit.util.g.b;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            d

final class c
{

    static final int a;
    static final int b;

    c()
    {
    }

    public static boolean a(int i, android.bluetooth.BluetoothProfile.ServiceListener servicelistener)
    {
        boolean flag = false;
        if (n.a().a() == Manufacturer.e && servicelistener != null)
        {
            servicelistener.onServiceConnected(i, null);
            flag = true;
        } else
        {
            servicelistener = com.fitbit.util.g.b.a(d.c, new Object[] {
                FitBitApplication.a(), servicelistener, Integer.valueOf(i)
            });
            if (((com.fitbit.util.g.b.b) (servicelistener)).c != null)
            {
                return ((Boolean)((com.fitbit.util.g.b.b) (servicelistener)).c).booleanValue();
            }
        }
        return flag;
    }

    public static boolean a(int i, BluetoothProfile bluetoothprofile, android.bluetooth.BluetoothProfile.ServiceListener servicelistener)
    {
        com.fitbit.e.a.a(com/fitbit/bluetooth/broadcom/gatt/c.getSimpleName(), "closeProfileProxy", new Object[0]);
        if (n.a().a() == Manufacturer.e && servicelistener != null)
        {
            servicelistener.onServiceDisconnected(i);
            return true;
        } else
        {
            return com.fitbit.util.g.b.a(d.d, new Object[] {
                Integer.valueOf(i), bluetoothprofile
            }).b;
        }
    }

    static 
    {
        a = com.fitbit.bluetooth.broadcom.gatt.d.a;
        b = com.fitbit.bluetooth.broadcom.gatt.d.b;
    }
}
