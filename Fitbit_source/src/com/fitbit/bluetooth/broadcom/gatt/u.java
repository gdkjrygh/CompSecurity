// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothGattCharacteristic;
import com.fitbit.util.g.b;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            g, j, v

public class u extends g
{

    public u(UUID uuid, int i, int k)
    {
        super(uuid, i, k);
    }

    public void a(j j1)
    {
        if (D != null && j1.a() != null)
        {
            D.addDescriptor(j1.a());
            return;
        } else
        {
            b.a(C, com.fitbit.bluetooth.broadcom.gatt.v.b, new Object[] {
                j1.m
            });
            return;
        }
    }
}
