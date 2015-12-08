// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothGattDescriptor;
import com.fitbit.util.b.a;
import com.fitbit.util.g.b;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            k, x, g, l

public class j
{

    public static final byte a[];
    public static final byte b[];
    public static final byte c[];
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final UUID l = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    private static final String o = "FitbitGattDescriptor";
    protected Object m;
    protected BluetoothGattDescriptor n;

    j(BluetoothGattDescriptor bluetoothgattdescriptor)
    {
        n = bluetoothgattdescriptor;
    }

    j(Object obj)
    {
        m = obj;
    }

    j(UUID uuid, int i1)
    {
        if (com.fitbit.util.b.a.a(18))
        {
            n = new BluetoothGattDescriptor(uuid, i1);
            return;
        } else
        {
            m = com.fitbit.bluetooth.broadcom.gatt.x.a(uuid, i1);
            return;
        }
    }

    public BluetoothGattDescriptor a()
    {
        return n;
    }

    public boolean a(byte abyte0[])
    {
        boolean flag = false;
        if (n != null)
        {
            flag = n.setValue(abyte0);
        } else
        {
            abyte0 = com.fitbit.util.g.b.a(m, k.m, new Object[] {
                abyte0
            });
            if (((com.fitbit.util.g.b.b) (abyte0)).c != null)
            {
                return ((Boolean)((com.fitbit.util.g.b.b) (abyte0)).c).booleanValue();
            }
        }
        return flag;
    }

    public byte[] b()
    {
        if (n != null)
        {
            return n.getValue();
        } else
        {
            return (byte[])com.fitbit.util.g.b.a(m, k.l, new Object[0]).c;
        }
    }

    public UUID c()
    {
        if (n != null)
        {
            return n.getUuid();
        }
        com.fitbit.util.g.b.b b1 = com.fitbit.util.g.b.a(m, k.o, new Object[0]);
        if (b1.c == null)
        {
            return null;
        } else
        {
            return (UUID)b1.c;
        }
    }

    public g d()
    {
        Object obj = null;
        if (n == null) goto _L2; else goto _L1
_L1:
        if (n.getCharacteristic() == null) goto _L4; else goto _L3
_L3:
        g g1 = new g(n.getCharacteristic());
_L6:
        return g1;
_L4:
        com.fitbit.e.a.a("FitbitGattDescriptor", "getCharacteristic: characteristic is null!", new Object[0]);
        return null;
_L2:
        com.fitbit.util.g.b.b b1 = com.fitbit.util.g.b.a(m, k.n, new Object[0]);
        g1 = obj;
        if (b1.b)
        {
            g1 = obj;
            if (b1.c != null)
            {
                return (g)com.fitbit.bluetooth.broadcom.gatt.l.a().a(com/fitbit/bluetooth/broadcom/gatt/g, b1.c);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int e()
    {
        int i1 = 0;
        if (n != null)
        {
            i1 = n.getPermissions();
        } else
        {
            com.fitbit.util.g.b.b b1 = com.fitbit.util.g.b.a(m, k.p, new Object[0]);
            if (b1.c != null)
            {
                return ((Integer)b1.c).intValue();
            }
        }
        return i1;
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof j)) 
        {
            return false;
        }
        j j1 = (j)obj;
        if (m != null)
        {
            return m.equals(j1.m);
        }
        if (n != null)
        {
            return n.equals(j1.n);
        } else
        {
            return super.equals(obj);
        }
    }

    public int hashCode()
    {
        if (m != null)
        {
            return m.hashCode();
        }
        if (n != null)
        {
            return n.hashCode();
        } else
        {
            return super.hashCode();
        }
    }

    public String toString()
    {
        return c().toString();
    }

    static 
    {
        a = com.fitbit.bluetooth.broadcom.gatt.k.a;
        b = com.fitbit.bluetooth.broadcom.gatt.k.b;
        c = k.c;
        d = k.d;
        e = k.e;
        f = k.f;
        g = k.g;
        h = k.h;
        i = k.i;
        j = k.j;
        k = k.k;
    }
}
