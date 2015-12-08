// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.fitbit.util.b.a;
import com.fitbit.util.g.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            h, v, j, l, 
//            s

public class g
{

    public static final int A;
    public static final int B;
    private static final String a = "FitbitGattCharacteristic";
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final int s;
    public static final int t;
    public static final int u;
    public static final int v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int z;
    protected Object C;
    protected BluetoothGattCharacteristic D;

    g(BluetoothGattCharacteristic bluetoothgattcharacteristic)
    {
        D = bluetoothgattcharacteristic;
    }

    g(Object obj)
    {
        C = obj;
    }

    g(UUID uuid, int i1, int j1)
    {
        if (com.fitbit.util.b.a.a(18))
        {
            D = new BluetoothGattCharacteristic(uuid, i1, j1);
            return;
        } else
        {
            C = com.fitbit.bluetooth.broadcom.gatt.v.a(uuid, i1, j1);
            return;
        }
    }

    public BluetoothGattCharacteristic a()
    {
        return D;
    }

    public j a(UUID uuid)
    {
        Object obj = null;
        if (D == null) goto _L2; else goto _L1
_L1:
        if (D.getDescriptor(uuid) == null) goto _L4; else goto _L3
_L3:
        uuid = new j(D.getDescriptor(uuid));
_L6:
        return uuid;
_L4:
        com.fitbit.e.a.a("FitbitGattCharacteristic", "getDescriptor: descriptor is null %s!", new Object[] {
            uuid
        });
        return null;
_L2:
        Object obj1 = com.fitbit.util.g.b.a(C, h.B, new Object[] {
            uuid
        }).c;
        uuid = obj;
        if (obj1 != null)
        {
            return (j)com.fitbit.bluetooth.broadcom.gatt.l.a().a(com/fitbit/bluetooth/broadcom/gatt/j, obj1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(int i1)
    {
        if (D != null)
        {
            D.setWriteType(i1);
            return;
        } else
        {
            com.fitbit.util.g.b.a(C, h.C, new Object[] {
                Integer.valueOf(i1)
            });
            return;
        }
    }

    public s b()
    {
        s s1 = null;
        if (D == null) goto _L2; else goto _L1
_L1:
        if (D.getService() == null) goto _L4; else goto _L3
_L3:
        s1 = new s(D.getService());
_L6:
        return s1;
_L4:
        com.fitbit.e.a.a("FitbitGattCharacteristic", "Can't find service for characteristic %s!", new Object[] {
            D.getUuid()
        });
        return null;
_L2:
        Object obj = com.fitbit.util.g.b.a(C, h.E, new Object[0]).c;
        if (obj != null)
        {
            return (s)com.fitbit.bluetooth.broadcom.gatt.l.a().a(com/fitbit/bluetooth/broadcom/gatt/s, obj);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean b(byte abyte0[])
    {
        boolean flag = false;
        if (D != null)
        {
            flag = D.setValue(abyte0);
        } else
        {
            abyte0 = com.fitbit.util.g.b.a(C, h.C, new Object[] {
                abyte0
            });
            if (((com.fitbit.util.g.b.b) (abyte0)).c != null)
            {
                return ((Boolean)((com.fitbit.util.g.b.b) (abyte0)).c).booleanValue();
            }
        }
        return flag;
    }

    public UUID c()
    {
        if (D != null)
        {
            return D.getUuid();
        }
        com.fitbit.util.g.b.b b1 = com.fitbit.util.g.b.a(C, h.F, new Object[0]);
        if (b1.c == null)
        {
            return null;
        } else
        {
            return (UUID)b1.c;
        }
    }

    public int d()
    {
        int i1 = 0;
        if (D != null)
        {
            i1 = D.getProperties();
        } else
        {
            com.fitbit.util.g.b.b b1 = com.fitbit.util.g.b.a(C, h.G, new Object[0]);
            if (b1.c != null)
            {
                return ((Integer)b1.c).intValue();
            }
        }
        return i1;
    }

    public int e()
    {
        int i1 = 0;
        if (D != null)
        {
            i1 = D.getPermissions();
        } else
        {
            com.fitbit.util.g.b.b b1 = com.fitbit.util.g.b.a(C, h.H, new Object[0]);
            if (b1.c != null)
            {
                return ((Integer)b1.c).intValue();
            }
        }
        return i1;
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof g)) 
        {
            return false;
        }
        g g1 = (g)obj;
        if (C != null)
        {
            return C.equals(g1.C);
        }
        if (D != null)
        {
            return D.equals(g1.D);
        } else
        {
            return super.equals(obj);
        }
    }

    public int f()
    {
        int i1 = 0;
        if (D != null)
        {
            i1 = D.getWriteType();
        } else
        {
            com.fitbit.util.g.b.b b1 = com.fitbit.util.g.b.a(C, h.I, new Object[0]);
            if (b1.c != null)
            {
                return ((Integer)b1.c).intValue();
            }
        }
        return i1;
    }

    public List g()
    {
        Object obj = null;
        ArrayList arraylist = new ArrayList();
        Object obj1;
        if (D != null)
        {
            obj1 = D.getDescriptors();
        } else
        {
            obj = com.fitbit.util.g.b.a(C, h.K, new Object[0]);
            obj1 = null;
        }
        if (obj1 != null && !((List) (obj1)).isEmpty())
        {
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); arraylist.add(new j((BluetoothGattDescriptor)((Iterator) (obj1)).next()))) { }
        }
        if (obj != null && ((com.fitbit.util.g.b.b) (obj)).b && ((com.fitbit.util.g.b.b) (obj)).c != null)
        {
            Object obj2;
            for (obj = ((List)((com.fitbit.util.g.b.b) (obj)).c).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(com.fitbit.bluetooth.broadcom.gatt.l.a().a(com/fitbit/bluetooth/broadcom/gatt/j, obj2)))
            {
                obj2 = ((Iterator) (obj)).next();
            }

        }
        return arraylist;
    }

    public byte[] h()
    {
        if (D != null)
        {
            return D.getValue();
        } else
        {
            return (byte[])com.fitbit.util.g.b.a(C, h.D, new Object[0]).c;
        }
    }

    public int hashCode()
    {
        if (C != null)
        {
            return C.hashCode();
        }
        if (D != null)
        {
            return D.hashCode();
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
        b = com.fitbit.bluetooth.broadcom.gatt.h.a;
        c = com.fitbit.bluetooth.broadcom.gatt.h.b;
        d = h.c;
        e = h.d;
        f = h.e;
        g = h.f;
        h = h.g;
        i = h.h;
        j = h.i;
        k = h.j;
        l = h.k;
        m = h.l;
        n = h.m;
        o = h.n;
        p = h.o;
        q = h.p;
        r = h.q;
        s = h.r;
        t = h.s;
        u = h.t;
        v = h.u;
        w = h.v;
        x = h.w;
        y = h.x;
        z = h.y;
        A = h.z;
        B = h.A;
    }
}
