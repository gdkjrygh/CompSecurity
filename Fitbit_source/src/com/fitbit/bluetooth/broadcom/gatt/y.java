// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothGattService;
import com.fitbit.util.g.b;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            s, g, z

public class y extends s
{

    public y(UUID uuid, int i)
    {
        super(uuid, i);
    }

    public boolean a(g g1)
    {
        boolean flag = false;
        if (e != null && g1.a() != null)
        {
            flag = e.addCharacteristic(g1.a());
        } else
        {
            g1 = b.a(d, z.c, new Object[] {
                g1.C
            });
            if (((com.fitbit.util.g.b.b) (g1)).c != null)
            {
                return ((Boolean)((com.fitbit.util.g.b.b) (g1)).c).booleanValue();
            }
        }
        return flag;
    }

    public boolean a(s s1)
    {
        boolean flag = false;
        if (e != null && s1.a() != null)
        {
            flag = e.addService(s1.a());
        } else
        {
            s1 = b.a(d, com.fitbit.bluetooth.broadcom.gatt.z.b, new Object[] {
                s1.d
            });
            if (((com.fitbit.util.g.b.b) (s1)).c != null)
            {
                return ((Boolean)((com.fitbit.util.g.b.b) (s1)).c).booleanValue();
            }
        }
        return flag;
    }
}
