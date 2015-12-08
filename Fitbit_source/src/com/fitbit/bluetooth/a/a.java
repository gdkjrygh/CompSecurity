// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.a;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.bluetooth.galileo.c;
import com.fitbit.util.g.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.a:
//            b

public class a
{

    private static final String a = "CommonBluetoothUtils";

    public a()
    {
    }

    public static boolean a(BluetoothDevice bluetoothdevice)
    {
        com.fitbit.e.a.a("CommonBluetoothUtils", "createBond(device = %s)", new Object[] {
            bluetoothdevice
        });
        bluetoothdevice = com.fitbit.util.g.b.a(bluetoothdevice, b.a, new Object[0]);
        if (bluetoothdevice == null)
        {
            return true;
        } else
        {
            return ((Boolean)((com.fitbit.util.g.b.b) (bluetoothdevice)).c).booleanValue();
        }
    }

    public static boolean b(BluetoothDevice bluetoothdevice)
    {
        com.fitbit.e.a.a("CommonBluetoothUtils", "removeBond(device = %s)", new Object[] {
            bluetoothdevice
        });
        bluetoothdevice = com.fitbit.util.g.b.a(bluetoothdevice, com.fitbit.bluetooth.a.b.b, new Object[0]);
        if (bluetoothdevice == null)
        {
            return true;
        } else
        {
            return ((Boolean)((com.fitbit.util.g.b.b) (bluetoothdevice)).c).booleanValue();
        }
    }

    public static List c(BluetoothDevice bluetoothdevice)
    {
        int i = 0;
        com.fitbit.util.g.b.b b1 = com.fitbit.util.g.b.a(bluetoothdevice, com.fitbit.bluetooth.a.b.c, new Object[0]);
        if (b1 != null && b1.b && b1.c != null)
        {
            bluetoothdevice = new ArrayList(((ParcelUuid[])b1.c).length);
            ParcelUuid aparceluuid[] = (ParcelUuid[])b1.c;
            for (int j = aparceluuid.length; i < j; i++)
            {
                bluetoothdevice.add(aparceluuid[i].getUuid());
            }

            return bluetoothdevice;
        } else
        {
            return Collections.emptyList();
        }
    }

    public static UUID d(BluetoothDevice bluetoothdevice)
    {
        UUID uuid = GalileoProfile.l;
        for (Iterator iterator = c(bluetoothdevice).iterator(); iterator.hasNext();)
        {
            UUID uuid1 = (UUID)iterator.next();
            if (com.fitbit.bluetooth.galileo.c.a(bluetoothdevice, uuid1))
            {
                return uuid1;
            }
        }

        return uuid;
    }

    static 
    {
        (new com.fitbit.bluetooth.a.b()).b(android/bluetooth/BluetoothDevice);
    }
}
