// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.fitbit.bluetooth.a.a;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.galileo.a.f;
import com.fitbit.util.p;
import com.fitbit.util.threading.c;
import com.fitbit.util.z;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.fitbit.bluetooth:
//            j, Manufacturer, q

class u extends j
{
    static class a extends q
    {

        a()
        {
            a(new _cls1(this));
        }
    }


    private static final String f = "SamsungBluetoothAdapter";
    private static final int g = 1;
    c e;
    private Method h;
    private Method i;

    public u()
    {
        e = new c(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a) {

            final u a;

            public void a(Intent intent)
            {
                com.fitbit.e.a.a("SamsungBluetoothAdapter", "onReceiveBroadcast = %s", new Object[] {
                    intent
                });
                Object obj = intent.getAction();
                com.fitbit.e.a.a("SamsungBluetoothAdapter", "Processing action: %s", new Object[] {
                    obj
                });
                if ("android.bluetooth.device.action.FOUND".equals(obj))
                {
                    BluetoothDevice bluetoothdevice = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    obj = new Intent("com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.ACTION_DEVICE_FOUND");
                    ((Intent) (obj)).putExtra("android.bluetooth.device.extra.DEVICE", bluetoothdevice);
                    ((Intent) (obj)).putExtra("android.bluetooth.device.extra.RSSI", intent.getShortExtra("android.bluetooth.device.extra.RSSI", (short)0));
                    intent = intent.getByteArrayExtra("com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.EXTRA_SERVICE_DATA");
                    if (intent != null)
                    {
                        ((Intent) (obj)).putExtra("com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.EXTRA_SERVICE_DATA", intent);
                    }
                    z.a(((Intent) (obj)));
                } else
                if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(obj))
                {
                    z.a(new Intent("com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.ACTION_DISCOVERY_FINISHED"));
                    a.e.e();
                    return;
                }
            }

            
            {
                a = u.this;
                super(threadname);
            }
        };
        f();
    }

    private void f()
    {
        try
        {
            h = android/bluetooth/BluetoothAdapter.getMethod("startLeDiscovery", new Class[0]);
            i = android/bluetooth/BluetoothDevice.getMethod("getDeviceType", new Class[0]);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private static void g()
    {
        Set set;
        Object obj;
        obj = p.b(DeviceFeature.WIRELESS_SYNC);
        set = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        obj = ((List) (obj)).iterator();
_L2:
        Device device;
        Iterator iterator;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_92;
        }
        device = (Device)((Iterator) (obj)).next();
        iterator = set.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        BluetoothDevice bluetoothdevice = (BluetoothDevice)iterator.next();
        if (!com.fitbit.galileo.a.f.a(com.fitbit.galileo.a.f.a(bluetoothdevice), device.d())) goto _L4; else goto _L3
_L3:
        com.fitbit.bluetooth.a.a.b(bluetoothdevice);
    }

    public Manufacturer a()
    {
        return com.fitbit.bluetooth.Manufacturer.c;
    }

    public boolean a(BluetoothDevice bluetoothdevice, Bundle bundle)
    {
        if (i == null)
        {
            return false;
        }
        int k;
        try
        {
            bluetoothdevice = (Integer)i.invoke(bluetoothdevice, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (BluetoothDevice bluetoothdevice)
        {
            bluetoothdevice.printStackTrace();
            return false;
        }
        if (bluetoothdevice == null)
        {
            return false;
        }
        k = bluetoothdevice.intValue();
        return k == 1;
    }

    public boolean b()
    {
        com.fitbit.e.a.a("SamsungBluetoothAdapter", "Start discovery.", new Object[0]);
        if (h == null)
        {
            return false;
        }
        try
        {
            g();
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.bluetooth.device.action.FOUND");
            intentfilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            e.b(intentfilter);
            h.invoke(a, new Object[0]);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean c()
    {
        e.e();
        a.cancelDiscovery();
        return true;
    }

    // Unreferenced inner class com/fitbit/bluetooth/u$a$1

/* anonymous class */
    class a._cls1
        implements q.a
    {

        final a a;

        public boolean a()
            throws Throwable
        {
            Class.forName("com.samsung.bluetoothle.BluetoothLEClientProfile");
            android/bluetooth/BluetoothAdapter.getMethod("startLeDiscovery", new Class[0]);
            android/bluetooth/BluetoothDevice.getMethod("getDeviceType", new Class[0]);
            return true;
        }

            
            {
                a = a1;
                super();
            }
    }

}
