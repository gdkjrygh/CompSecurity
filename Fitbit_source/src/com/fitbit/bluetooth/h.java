// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import com.fitbit.bluetooth.broadcom.gatt.ab;
import com.fitbit.e.a;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.bluetooth:
//            j, Manufacturer, q

public class h extends j
    implements com.fitbit.bluetooth.broadcom.gatt.ab.a
{
    static class a extends q
    {

        a()
        {
            a(new _cls1(this));
        }
    }


    private static final String e = "BroadcomBluetoothAdapter";
    private ab f;

    public h()
    {
    }

    public Manufacturer a()
    {
        return Manufacturer.d;
    }

    public void a(BluetoothDevice bluetoothdevice, int i, byte abyte0[])
    {
        Intent intent = new Intent("com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.ACTION_DEVICE_FOUND");
        intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothdevice);
        intent.putExtra("android.bluetooth.device.extra.RSSI", i);
        intent.putExtra("com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.EXTRA_SERVICE_DATA", abyte0);
        z.a(intent);
    }

    public boolean a(BluetoothDevice bluetoothdevice, Bundle bundle)
    {
        return true;
    }

    public boolean b()
    {
        com.fitbit.e.a.a("BroadcomBluetoothAdapter", "startScan()", new Object[0]);
        if (f == null)
        {
            f = new ab(this);
        }
        return f.h();
    }

    public boolean c()
    {
        boolean flag = false;
        com.fitbit.e.a.a("BroadcomBluetoothAdapter", "stopScan()", new Object[0]);
        if (f != null)
        {
            f.i();
            f = null;
            z.a(new Intent("com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.ACTION_DISCOVERY_FINISHED"));
            flag = true;
        }
        return flag;
    }

    public volatile boolean d()
    {
        return super.d();
    }

    public volatile boolean e()
    {
        return super.e();
    }

    // Unreferenced inner class com/fitbit/bluetooth/h$a$1

/* anonymous class */
    class a._cls1
        implements q.a
    {

        final a a;

        public boolean a()
            throws Throwable
        {
            Class.forName("com.broadcom.bt.gatt.BluetoothGatt");
            Class.forName("com.broadcom.bt.gatt.BluetoothGattAdapter");
            Class.forName("com.broadcom.bt.gatt.BluetoothGattCallback");
            return true;
        }

            
            {
                a = a1;
                super();
            }
    }

}
