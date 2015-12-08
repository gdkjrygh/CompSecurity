// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.IBluetoothGattProfile;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.ParcelUuid;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;
import com.fitbit.util.z;
import java.lang.reflect.Method;

// Referenced classes of package com.fitbit.bluetooth:
//            j, Manufacturer, q

class r extends j
{
    static class a extends q
    {

        a()
        {
            a(new _cls1(this));
            a(new _cls2(this));
        }
    }


    private static final String f = "MotorolaBluetoothAdapter";
    private static final String g = "LE";
    c e;
    private Method h;

    public r()
    {
        e = new c(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a) {

            final r a;

            public void a(Intent intent)
            {
                com.fitbit.e.a.a("MotorolaBluetoothAdapter", "onReceiveBroadcast = %s", new Object[] {
                    intent
                });
                Object obj = intent.getAction();
                com.fitbit.e.a.a("MotorolaBluetoothAdapter", "Processing action: %s", new Object[] {
                    obj
                });
                if ("android.bluetooth.device.action.FOUND".equals(obj))
                {
                    intent = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    obj = new Intent("com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.ACTION_DEVICE_FOUND");
                    ((Intent) (obj)).putExtra("android.bluetooth.device.extra.DEVICE", intent);
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
                a = r.this;
                super(threadname);
            }
        };
        try
        {
            h = android/bluetooth/BluetoothDevice.getMethod("getBluetoothDeviceType", new Class[0]);
            return;
        }
        catch (Exception exception)
        {
            com.fitbit.e.a.f("MotorolaBluetoothAdapter", "Unable to enable notifications", exception, new Object[0]);
        }
    }

    public Manufacturer a()
    {
        return Manufacturer.b;
    }

    public boolean a(BluetoothDevice bluetoothdevice, Bundle bundle)
    {
        boolean flag = false;
        if (h != null)
        {
            try
            {
                flag = "LE".equals(h.invoke(bluetoothdevice, new Object[0]));
            }
            // Misplaced declaration of an exception variable
            catch (BluetoothDevice bluetoothdevice)
            {
                com.fitbit.e.a.f("MotorolaBluetoothAdapter", "Unable to invoke method on BluetoothDevice", bluetoothdevice, new Object[0]);
                return false;
            }
        }
        return flag;
    }

    public boolean b()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.bluetooth.device.action.FOUND");
        intentfilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        e.b(intentfilter);
        return a.startDiscovery();
    }

    public boolean c()
    {
        e.e();
        return a.cancelDiscovery();
    }

    // Unreferenced inner class com/fitbit/bluetooth/r$a$1

/* anonymous class */
    class a._cls1
        implements q.a
    {

        final a a;

        public boolean a()
            throws Throwable
        {
            Class.forName("android.bluetooth.BluetoothGattService");
            return true;
        }

            
            {
                a = a1;
                super();
            }
    }


    // Unreferenced inner class com/fitbit/bluetooth/r$a$2

/* anonymous class */
    class a._cls2
        implements q.a
    {

        final a a;

        public boolean a()
            throws Throwable
        {
            Class class1 = Class.forName("android.bluetooth.BluetoothGattService");
            class1.getConstructor(new Class[] {
                android/bluetooth/BluetoothDevice, android/os/ParcelUuid, java/lang/String, android/bluetooth/IBluetoothGattProfile
            });
            class1.getMethod("getCharacteristics", new Class[0]);
            class1.getMethod("getCharacteristicUuid", new Class[] {
                java/lang/String
            });
            class1.getMethod("registerWatcher", new Class[0]);
            class1.getMethod("deregisterWatcher", new Class[0]);
            class1.getMethod("setCharacteristicClientConf", new Class[] {
                java/lang/String, Integer.TYPE
            });
            class1.getMethod("close", new Class[0]);
            class1.getMethod("writeCharacteristicRaw", new Class[] {
                java/lang/String, [B, Boolean.TYPE
            });
            android/bluetooth/BluetoothDevice.getMethod("getGattServices", new Class[0]);
            return true;
        }

            
            {
                a = a1;
                super();
            }
    }

}
