// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.Manufacturer;
import com.fitbit.bluetooth.k;
import com.fitbit.bluetooth.n;
import com.fitbit.util.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            n, i, s, l, 
//            g, e, j

public final class b
{

    public static final String a = "bluetooth_error";
    public static final String b = "state_change_error";
    public static final String c = "service_discovery_error";
    public static final String d = "characteristic_write_error";
    public static final String e = "characteristic_read_error";
    public static final String f = "descriptor_write_error";
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    private static final String q = "FitbitGatt";
    protected Object p;
    private BluetoothGatt r;
    private Object s;

    b(BluetoothProfile bluetoothprofile)
    {
        if (com.fitbit.util.b.a.a(18))
        {
            r = (BluetoothGatt)bluetoothprofile;
            s = FitBitApplication.a().getSystemService("bluetooth");
            return;
        } else
        {
            p = bluetoothprofile;
            return;
        }
    }

    public static b a(BluetoothDevice bluetoothdevice, boolean flag, i i1)
    {
        if (com.fitbit.util.b.a.a(18))
        {
            com.fitbit.e.a.d("FitbitGatt", "connectGatt.", new Object[0]);
            bluetoothdevice = bluetoothdevice.connectGatt(FitBitApplication.a().getApplicationContext(), flag, i1.c_);
            if (bluetoothdevice != null)
            {
                return new b(bluetoothdevice);
            }
        }
        return null;
    }

    public s a(BluetoothDevice bluetoothdevice, UUID uuid)
    {
        Object obj = null;
        if (r == null) goto _L2; else goto _L1
_L1:
        if (r.getService(uuid) == null) goto _L4; else goto _L3
_L3:
        bluetoothdevice = new s(r.getService(uuid));
_L6:
        return bluetoothdevice;
_L4:
        com.fitbit.e.a.a("FitbitGatt", "Can't find service %s.", new Object[] {
            uuid
        });
        return null;
_L2:
        uuid = com.fitbit.util.g.b.a(p, n.q, new Object[] {
            bluetoothdevice, uuid
        });
        bluetoothdevice = obj;
        if (((com.fitbit.util.g.b) (uuid)).c != null)
        {
            return (s)com.fitbit.bluetooth.broadcom.gatt.l.a().a(com/fitbit/bluetooth/broadcom/gatt/s, ((com.fitbit.util.g.b) (uuid)).c);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a()
    {
        if (com.fitbit.bluetooth.n.a().a() != Manufacturer.e)
        {
            com.fitbit.util.g.b.a(p, com.fitbit.bluetooth.broadcom.gatt.n.k, new Object[0]);
        }
    }

    public void a(BluetoothDevice bluetoothdevice)
    {
        com.fitbit.e.a.a("FitbitGatt", "cancelConnection", new Object[0]);
        if (r != null)
        {
            r.disconnect();
            return;
        } else
        {
            com.fitbit.util.g.b.a(p, com.fitbit.bluetooth.broadcom.gatt.n.n, new Object[] {
                bluetoothdevice
            });
            return;
        }
    }

    public boolean a(BluetoothDevice bluetoothdevice, boolean flag)
    {
        boolean flag1 = false;
        com.fitbit.e.a.a("FitbitGatt", "connect.", new Object[0]);
        if (r != null)
        {
            flag = r.connect();
        } else
        {
            bluetoothdevice = com.fitbit.util.g.b.a(p, n.l, new Object[] {
                bluetoothdevice, Boolean.valueOf(flag)
            });
            flag = flag1;
            if (((com.fitbit.util.g.b) (bluetoothdevice)).c != null)
            {
                return ((Boolean)((com.fitbit.util.g.b) (bluetoothdevice)).c).booleanValue();
            }
        }
        return flag;
    }

    public boolean a(g g1)
    {
        boolean flag = false;
        if (r == null) goto _L2; else goto _L1
_L1:
        if (g1.a() == null) goto _L4; else goto _L3
_L3:
        flag = r.writeCharacteristic(g1.a());
_L6:
        return flag;
_L4:
        com.fitbit.e.a.a("FitbitGatt", "writeCharacteristic: characteristic is null!", new Object[0]);
        return false;
_L2:
        g1 = com.fitbit.util.g.b.a(p, n.w, new Object[] {
            g1.C
        });
        if (((com.fitbit.util.g.b) (g1)).c != null)
        {
            return ((Boolean)((com.fitbit.util.g.b) (g1)).c).booleanValue();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean a(g g1, boolean flag)
    {
        boolean flag1 = false;
        if (r == null) goto _L2; else goto _L1
_L1:
        if (g1.a() == null) goto _L4; else goto _L3
_L3:
        flag = r.setCharacteristicNotification(g1.a(), flag);
_L6:
        return flag;
_L4:
        com.fitbit.e.a.a("FitbitGatt", "setCharacteristicNotification: characteristic is null!", new Object[0]);
        return false;
_L2:
        g1 = com.fitbit.util.g.b.a(p, n.t, new Object[] {
            g1.C, Boolean.valueOf(flag)
        });
        flag = flag1;
        if (((com.fitbit.util.g.b) (g1)).c != null)
        {
            return ((Boolean)((com.fitbit.util.g.b) (g1)).c).booleanValue();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean a(i i1)
    {
        boolean flag = false;
        if (com.fitbit.bluetooth.n.a().a() == Manufacturer.e)
        {
            flag = true;
        } else
        {
            i1 = com.fitbit.util.g.b.a(p, n.j, new Object[] {
                i1.d_.a
            });
            if (((com.fitbit.util.g.b) (i1)).c != null)
            {
                return ((Boolean)((com.fitbit.util.g.b) (i1)).c).booleanValue();
            }
        }
        return flag;
    }

    public boolean a(j j1)
    {
        boolean flag = false;
        if (r == null) goto _L2; else goto _L1
_L1:
        if (j1.a() == null) goto _L4; else goto _L3
_L3:
        flag = r.writeDescriptor(j1.a());
_L6:
        return flag;
_L4:
        com.fitbit.e.a.a("FitbitGatt", "writeDescriptor: descriptor is null!", new Object[0]);
        return false;
_L2:
        j1 = com.fitbit.util.g.b.a(p, n.v, new Object[] {
            j1.m
        });
        if (((com.fitbit.util.g.b) (j1)).c != null)
        {
            return ((Boolean)((com.fitbit.util.g.b) (j1)).c).booleanValue();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int b(BluetoothDevice bluetoothdevice)
    {
        if (s != null)
        {
            return ((BluetoothManager)s).getConnectionState(bluetoothdevice, 7);
        }
        bluetoothdevice = com.fitbit.util.g.b.a(p, n.o, new Object[] {
            bluetoothdevice
        });
        if (((com.fitbit.util.g.b) (bluetoothdevice)).c == null)
        {
            return -1;
        } else
        {
            return ((Integer)((com.fitbit.util.g.b) (bluetoothdevice)).c).intValue();
        }
    }

    public void b()
    {
        if (r != null)
        {
            r.close();
        }
    }

    public boolean b(g g1)
    {
        boolean flag = false;
        if (r == null) goto _L2; else goto _L1
_L1:
        if (g1.a() == null) goto _L4; else goto _L3
_L3:
        flag = r.readCharacteristic(g1.a());
_L6:
        return flag;
_L4:
        com.fitbit.e.a.a("FitbitGatt", "readCharacteristic: characteristic is null!", new Object[0]);
        return false;
_L2:
        g1 = com.fitbit.util.g.b.a(p, n.u, new Object[] {
            g1.C
        });
        if (((com.fitbit.util.g.b) (g1)).c != null)
        {
            return ((Boolean)((com.fitbit.util.g.b) (g1)).c).booleanValue();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public BluetoothDevice c()
    {
        if (r != null)
        {
            return r.getDevice();
        }
        com.fitbit.util.g.b b1 = com.fitbit.util.g.b.a(p, n.A, new Object[0]);
        if (b1.c == null)
        {
            return null;
        } else
        {
            return (BluetoothDevice)b1.c;
        }
    }

    public boolean c(BluetoothDevice bluetoothdevice)
    {
        boolean flag = false;
        if (r != null)
        {
            flag = r.discoverServices();
        } else
        {
            bluetoothdevice = com.fitbit.util.g.b.a(p, n.p, new Object[] {
                bluetoothdevice
            });
            if (((com.fitbit.util.g.b) (bluetoothdevice)).c != null)
            {
                return ((Boolean)((com.fitbit.util.g.b) (bluetoothdevice)).c).booleanValue();
            }
        }
        return flag;
    }

    public List d(BluetoothDevice bluetoothdevice)
    {
        Object obj = null;
        ArrayList arraylist = new ArrayList();
        if (r != null)
        {
            List list = r.getServices();
            bluetoothdevice = ((BluetoothDevice) (obj));
            obj = list;
        } else
        {
            bluetoothdevice = com.fitbit.util.g.b.a(p, n.r, new Object[] {
                bluetoothdevice
            });
            obj = null;
        }
        if (obj != null && !((List) (obj)).isEmpty())
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new s((BluetoothGattService)((Iterator) (obj)).next()))) { }
        }
        if (bluetoothdevice != null && ((com.fitbit.util.g.b) (bluetoothdevice)).b && ((com.fitbit.util.g.b) (bluetoothdevice)).c != null)
        {
            Object obj1;
            for (bluetoothdevice = ((List)((com.fitbit.util.g.b) (bluetoothdevice)).c).iterator(); bluetoothdevice.hasNext(); arraylist.add(com.fitbit.bluetooth.broadcom.gatt.l.a().a(com/fitbit/bluetooth/broadcom/gatt/s, obj1)))
            {
                obj1 = bluetoothdevice.next();
            }

        }
        return arraylist;
    }

    static 
    {
        g = com.fitbit.bluetooth.broadcom.gatt.n.a;
        h = n.b;
        i = n.c;
        j = n.d;
        k = n.e;
        l = n.f;
        m = n.g;
        n = n.h;
        o = n.i;
    }
}
