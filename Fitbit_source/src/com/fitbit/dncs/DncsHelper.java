// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.fitbit.bluetooth.Manufacturer;
import com.fitbit.bluetooth.k;
import com.fitbit.bluetooth.n;
import com.fitbit.dncs.domain.TrackerBondState;
import com.fitbit.galileo.a.f;
import com.fitbit.savedstate.g;
import com.fitbit.util.b.a;
import java.util.Iterator;
import java.util.Set;

public class DncsHelper
{
    public static final class AndroidBondStatus extends Enum
    {

        public static final AndroidBondStatus a;
        public static final AndroidBondStatus b;
        public static final AndroidBondStatus c;
        private static final AndroidBondStatus d[];

        public static AndroidBondStatus valueOf(String s)
        {
            return (AndroidBondStatus)Enum.valueOf(com/fitbit/dncs/DncsHelper$AndroidBondStatus, s);
        }

        public static AndroidBondStatus[] values()
        {
            return (AndroidBondStatus[])d.clone();
        }

        static 
        {
            a = new AndroidBondStatus("UNKNOWN", 0);
            b = new AndroidBondStatus("BONDED", 1);
            c = new AndroidBondStatus("NOT_BONDED", 2);
            d = (new AndroidBondStatus[] {
                a, b, c
            });
        }

        private AndroidBondStatus(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class BondMethod extends Enum
    {

        public static final BondMethod a;
        public static final BondMethod b;
        public static final BondMethod c;
        private static final BondMethod d[];

        public static BondMethod valueOf(String s)
        {
            return (BondMethod)Enum.valueOf(com/fitbit/dncs/DncsHelper$BondMethod, s);
        }

        public static BondMethod[] values()
        {
            return (BondMethod[])d.clone();
        }

        static 
        {
            a = new BondMethod("CREATE_BOND", 0);
            b = new BondMethod("READ_SECURE_CHARACTERISTIC", 1);
            c = new BondMethod("UNSUPPORTED", 2);
            d = (new BondMethod[] {
                a, b, c
            });
        }

        private BondMethod(String s, int i)
        {
            super(s, i);
        }
    }


    public DncsHelper()
    {
    }

    public static TrackerBondState a(String s)
    {
        return g.a(s);
    }

    public static boolean a()
    {
        return n.a().a() == Manufacturer.e && com.fitbit.util.b.a.a(18);
    }

    public static boolean a(BluetoothDevice bluetoothdevice)
    {
        return c(bluetoothdevice) && e(bluetoothdevice);
    }

    public static BondMethod b()
    {
        if (com.fitbit.util.b.a.a(19))
        {
            return com.fitbit.dncs.BondMethod.a;
        }
        if (com.fitbit.util.b.a.b(18))
        {
            return BondMethod.b;
        } else
        {
            return BondMethod.c;
        }
    }

    public static TrackerBondState b(BluetoothDevice bluetoothdevice)
    {
        if (bluetoothdevice != null)
        {
            return a(f.a(bluetoothdevice));
        } else
        {
            return null;
        }
    }

    public static boolean b(String s)
    {
        return a(s) == TrackerBondState.b;
    }

    public static AndroidBondStatus c(String s)
    {
label0:
        {
            if (!com.fitbit.bluetooth.g.g())
            {
                return com.fitbit.dncs.AndroidBondStatus.a;
            }
            Object obj = BluetoothAdapter.getDefaultAdapter();
            if (obj == null || s == null)
            {
                break label0;
            }
            obj = ((BluetoothAdapter) (obj)).getBondedDevices().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!f.a(s, f.a((BluetoothDevice)((Iterator) (obj)).next())));
            return AndroidBondStatus.b;
        }
        return AndroidBondStatus.c;
    }

    public static boolean c(BluetoothDevice bluetoothdevice)
    {
        if (bluetoothdevice != null)
        {
            return b(f.a(bluetoothdevice));
        } else
        {
            return false;
        }
    }

    public static AndroidBondStatus d(BluetoothDevice bluetoothdevice)
    {
        return c(f.a(bluetoothdevice));
    }

    public static boolean d(String s)
    {
        return c(s) == AndroidBondStatus.b;
    }

    public static boolean e(BluetoothDevice bluetoothdevice)
    {
        return d(bluetoothdevice) == AndroidBondStatus.b;
    }
}
