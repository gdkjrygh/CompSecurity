// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.galileo;

import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.a.f;
import com.fitbit.util.p;
import java.util.Comparator;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.galileo:
//            GalileoProfile

public class c
{

    public static final Comparator a = new _cls1();
    public static final Comparator b = new _cls2();

    public c()
    {
    }

    public static String a(byte abyte0[])
    {
        com.fitbit.galileo.ota.GalileoOtaMessages.e e = new com.fitbit.galileo.ota.GalileoOtaMessages.e(abyte0);
        if (abyte0.length >= 22)
        {
            abyte0 = new StringBuilder();
            byte abyte1[] = e.d.b.b;
            for (int i = 0; i < 5; i++)
            {
                abyte0.append(String.format("%02x", new Object[] {
                    Byte.valueOf(abyte1[i])
                }));
            }

            abyte0.append(String.format("%02x", new Object[] {
                Byte.valueOf(e.d.c)
            }));
            return abyte0.toString();
        } else
        {
            return null;
        }
    }

    public static boolean a(BluetoothDevice bluetoothdevice)
    {
        if (bluetoothdevice == null) goto _L2; else goto _L1
_L1:
        GalileoTrackerType galileotrackertype = GalileoTrackerType.a(bluetoothdevice);
    /* anonymous class not found */
    class _anm3 {}

        _cls3.a[galileotrackertype.ordinal()];
        JVM INSTR tableswitch 1 7: default 60
    //                   1 60
    //                   2 60
    //                   3 60
    //                   4 60
    //                   5 62
    //                   6 86
    //                   7 86;
           goto _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L5
_L3:
        return true;
_L4:
        if ((bluetoothdevice = p.c(f.a(bluetoothdevice))) == null || !bluetoothdevice.a(DeviceFeature.LIVE_DATA))
        {
            return false;
        }
          goto _L3
_L5:
        return false;
_L2:
        return false;
    }

    public static boolean a(BluetoothDevice bluetoothdevice, UUID uuid)
    {
        if (!GalileoProfile.l.equals(uuid))
        {
            if (TextUtils.isEmpty(bluetoothdevice = f.b(bluetoothdevice)) || !UUID.fromString(String.format("adab%s-6e7d-4601-bda2-bffaa68956ba", new Object[] {
    bluetoothdevice
})).equals(uuid))
            {
                return false;
            }
        }
        return true;
    }


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
