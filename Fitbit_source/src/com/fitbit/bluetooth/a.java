// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.util.threading.c;
import com.fitbit.util.threading.d;

// Referenced classes of package com.fitbit.bluetooth:
//            n, k

public class com.fitbit.bluetooth.a
{
    public static interface a
    {

        public abstract void C_();

        public abstract boolean a(BluetoothDevice bluetoothdevice, int j, byte abyte0[]);
    }

    private class b extends c
    {

        final com.fitbit.bluetooth.a a;

        public void a(Intent intent)
        {
            Object obj = intent.getAction();
            if (!"com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.ACTION_DEVICE_FOUND".equals(obj)) goto _L2; else goto _L1
_L1:
            byte abyte0[];
            int j;
            obj = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            j = intent.getIntExtra("android.bluetooth.device.extra.RSSI", 0);
            abyte0 = intent.getByteArrayExtra("com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.EXTRA_SERVICE_DATA");
            intent = intent.getExtras();
            if (com.fitbit.bluetooth.a.a(a) == null || !com.fitbit.bluetooth.a.b(a).a(((BluetoothDevice) (obj)), intent)) goto _L4; else goto _L3
_L3:
            if (com.fitbit.bluetooth.a.a(a).a(((BluetoothDevice) (obj)), j, abyte0))
            {
                com.fitbit.bluetooth.a.a(a, com.fitbit.bluetooth.a.c(a));
                if (com.fitbit.bluetooth.a.a(a) != null)
                {
                    com.fitbit.bluetooth.a.a(a).C_();
                    com.fitbit.bluetooth.a.a(a, null);
                }
            }
_L6:
            return;
_L4:
            com.fitbit.e.a.a("BluetoothDeviceScanner", "Unable to deliver scan result: no callback provided.", new Object[0]);
            return;
_L2:
            if ("com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.ACTION_DISCOVERY_FINISHED".equals(obj))
            {
                com.fitbit.bluetooth.a.a(a, false);
                if (com.fitbit.bluetooth.a.a(a) != null)
                {
                    com.fitbit.bluetooth.a.a(a).C_();
                    com.fitbit.bluetooth.a.a(a, null);
                    return;
                } else
                {
                    com.fitbit.e.a.a("BluetoothDeviceScanner", "Unable to deliver scan finished result: no callback provided.", new Object[0]);
                    return;
                }
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        public b(com.fitbit.util.threading.FitbitHandlerThread.ThreadName threadname)
        {
            a = com.fitbit.bluetooth.a.this;
            super(threadname);
        }
    }


    public static final long a = 12000L;
    private static final String b = "BluetoothDeviceScanner";
    private final k c;
    private final c d;
    private final com.fitbit.util.threading.FitbitHandlerThread.ThreadName e;
    private final long f;
    private a g;
    private d h;
    private boolean i;

    public com.fitbit.bluetooth.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName threadname)
    {
        this(threadname, 12000L);
    }

    public com.fitbit.bluetooth.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName threadname, long l)
    {
        long l1;
label0:
        {
            super();
            c = n.a();
            e = threadname;
            d = new b(threadname);
            if (l > 0L)
            {
                l1 = l;
                if (l <= 12000L)
                {
                    break label0;
                }
            }
            l1 = 12000L;
        }
        f = l1;
    }

    static a a(com.fitbit.bluetooth.a a1)
    {
        return a1.g;
    }

    static a a(com.fitbit.bluetooth.a a1, a a2)
    {
        a1.g = a2;
        return a2;
    }

    static void a(com.fitbit.bluetooth.a a1, boolean flag)
    {
        a1.a(flag);
    }

    private void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("BluetoothDeviceScanner", "Stop", new Object[0]);
        c();
        if (!i) goto _L2; else goto _L1
_L1:
        i = false;
        d.d();
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        com.fitbit.e.a.a("BluetoothDeviceScanner", "Stopping the adapter.", new Object[0]);
        c.c();
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.fitbit.e.a.a("BluetoothDeviceScanner", "Unable to unregister receiver: receiver is not registered.", new Object[0]);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    static k b(com.fitbit.bluetooth.a a1)
    {
        return a1.c;
    }

    private void b()
    {
        c();
        h = new d(e);
        h.a(new Runnable() {

            final com.fitbit.bluetooth.a a;

            public void run()
            {
                a.a();
            }

            
            {
                a = com.fitbit.bluetooth.a.this;
                super();
            }
        }, f);
    }

    private void c()
    {
        if (h != null)
        {
            h.a();
        }
        h = null;
    }

    static boolean c(com.fitbit.bluetooth.a a1)
    {
        return a1.i;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("BluetoothDeviceScanner", "Stop scan.", new Object[0]);
        a(true);
        if (g != null)
        {
            g.C_();
            g = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean a(a a1)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("BluetoothDeviceScanner", "Start scan.", new Object[0]);
        g = a1;
        if (i) goto _L2; else goto _L1
_L1:
        a1 = new IntentFilter();
        a1.addAction("com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.ACTION_DEVICE_FOUND");
        a1.addAction("com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.ACTION_DISCOVERY_FINISHED");
        d.a(a1);
        if (!c.b()) goto _L4; else goto _L3
_L3:
        b();
        i = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        com.fitbit.e.a.a("BluetoothDeviceScanner", "The adapter did not start discovering. Abort scan.", new Object[0]);
        i = false;
        d.d();
        flag = false;
        continue; /* Loop/switch isn't completed */
_L2:
        com.fitbit.e.a.a("BluetoothDeviceScanner", "Scan is already in progress.", new Object[0]);
        if (true) goto _L6; else goto _L5
_L5:
        a1;
        throw a1;
    }
}
