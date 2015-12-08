// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.bluetooth.BluetoothAdapter;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.bluetooth:
//            l, k, Manufacturer

public final class n
{

    private static final String a = "FitbitBluetoothManager";
    private static final k b;

    public n()
    {
    }

    public static k a()
    {
        return b;
    }

    public static boolean b()
    {
        return BluetoothAdapter.getDefaultAdapter() != null;
    }

    public static boolean c()
    {
        return b() && l.b(b.a());
    }

    public static String d()
    {
        return b.a().a();
    }

    static 
    {
        Manufacturer manufacturer = com.fitbit.bluetooth.l.a();
        com.fitbit.e.a.a("FitbitBluetoothManager", "Bluetooth manufacturer: %s", new Object[] {
            manufacturer
        });
        b = com.fitbit.bluetooth.l.a(manufacturer);
    }
}
