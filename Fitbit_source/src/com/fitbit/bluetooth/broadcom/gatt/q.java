// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import bluetooth.le.a.c;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.bluetooth.Manufacturer;
import com.fitbit.bluetooth.broadcom.b.f;
import com.fitbit.bluetooth.g;
import com.fitbit.bluetooth.k;
import com.fitbit.bluetooth.n;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.bluetooth.broadcom.gatt:
//            m, c, g, j

public abstract class q extends m
{
    private class a extends c
    {

        final q b;

        public void a(int i, BluetoothGattService bluetoothgattservice)
        {
            com.fitbit.e.a.a("FitbitGattServerProfile", "onServiceAdded: status = %s, service = %s", new Object[] {
                com.fitbit.bluetooth.broadcom.a.a(i), bluetoothgattservice
            });
        }

        public void a(BluetoothDevice bluetoothdevice, int i, int l)
        {
            com.fitbit.e.a.a("FitbitGattServerProfile", "Connection state changed. Status: %s. New state: %s", new Object[] {
                com.fitbit.bluetooth.broadcom.a.a(i), com.fitbit.bluetooth.broadcom.a.b(l)
            });
            switch (l)
            {
            case 1: // '\001'
            default:
                return;

            case 2: // '\002'
                b.a(bluetoothdevice);
                return;

            case 0: // '\0'
                b.b(bluetoothdevice);
                return;
            }
        }

        public void a(BluetoothDevice bluetoothdevice, int i, BluetoothGattCharacteristic bluetoothgattcharacteristic, boolean flag, boolean flag1, int l, byte abyte0[])
        {
            com.fitbit.e.a.a("FitbitGattServerProfile", "onCharacteristicWriteRequest: requestId = %s, characteristic = %s, preparedWrite = %s, responseNeeded = %s, offset = %s, value = %s", new Object[] {
                Integer.valueOf(i), bluetoothgattcharacteristic, Boolean.valueOf(flag), Boolean.valueOf(flag1), Integer.valueOf(l), com.fitbit.galileo.a.c.a(abyte0)
            });
            b.a(bluetoothdevice, i, new com.fitbit.bluetooth.broadcom.gatt.g(bluetoothgattcharacteristic), flag, flag1, l, abyte0);
        }

        public void a(BluetoothDevice bluetoothdevice, int i, BluetoothGattDescriptor bluetoothgattdescriptor, boolean flag, boolean flag1, int l, byte abyte0[])
        {
            com.fitbit.e.a.a("FitbitGattServerProfile", "onDescriptorWriteRequest: requestId = %s, descriptor = %s, preparedWrite = %s, responseNeeded = %s, offset = %s, value = %s", new Object[] {
                Integer.valueOf(i), bluetoothgattdescriptor, Boolean.valueOf(flag), Boolean.valueOf(flag1), Integer.valueOf(l), com.fitbit.galileo.a.c.a(abyte0)
            });
            b.a(bluetoothdevice, i, new j(bluetoothgattdescriptor), flag, flag1, l, abyte0);
        }

        private a()
        {
            b = q.this;
            super();
        }

    }


    private static final String b = "FitbitGattServerProfile";
    protected BluetoothGattServer a_;

    public q()
    {
    }

    protected final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("FitbitGattServerProfile", "onProfileDisonnected.", new Object[0]);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void a(int i, BluetoothProfile bluetoothprofile)
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("FitbitGattServerProfile", "onProfileConnected.", new Object[0]);
        this;
        JVM INSTR monitorexit ;
        return;
        bluetoothprofile;
        throw bluetoothprofile;
    }

    protected abstract void a(BluetoothDevice bluetoothdevice, int i, com.fitbit.bluetooth.broadcom.gatt.g g1, boolean flag, boolean flag1, int j, byte abyte0[]);

    protected abstract void a(BluetoothDevice bluetoothdevice, int i, j j, boolean flag, boolean flag1, int l, byte abyte0[]);

    public final boolean cancelConnection(BluetoothDevice bluetoothdevice)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("FitbitGattServerProfile", "Disconnecting from the device: %s", new Object[] {
            bluetoothdevice
        });
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("FitbitGattServerProfile", "Unable to disconnect: Bluetooth is turned off.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (a_ != null && bluetoothdevice != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        com.fitbit.e.a.a("FitbitGattServerProfile", "Unable to disconnect: bluetoothGatt or device is null", new Object[0]);
        continue; /* Loop/switch isn't completed */
        bluetoothdevice;
        throw bluetoothdevice;
        a_.cancelConnection(bluetoothdevice);
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean connect(BluetoothDevice bluetoothdevice)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("FitbitGattServerProfile", "Connecting to the device: %s", new Object[] {
            bluetoothdevice
        });
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("FitbitGattServerProfile", "Unable to connect: Bluetooth is turned off.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (a_ != null && bluetoothdevice != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        com.fitbit.e.a.a("FitbitGattServerProfile", "Unable to connect: bluetoothGatt or device is null", new Object[0]);
        continue; /* Loop/switch isn't completed */
        bluetoothdevice;
        throw bluetoothdevice;
        if (!a_.connect(bluetoothdevice, false))
        {
            com.fitbit.e.a.a("FitbitGattServerProfile", "Unable to connect.", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean disconnectProfile()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("FitbitGattServerProfile", "Disconnecting profile...", new Object[0]);
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("FitbitGattServerProfile", "Unable to disconnect profile: Bluetooth is turned off.", new Object[0]);
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (a_ == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        com.fitbit.e.a.a("FitbitGattServerProfile", "Clear services and close.", new Object[0]);
        a_.clearServices();
        a_.close();
_L4:
        onServiceDisconnected(c.b);
        flag = true;
          goto _L3
        Object obj;
        obj;
        FitBitApplication.a().c().a(0x7f11000b).b("google_bt_crash");
        com.fitbit.e.a.e("FitbitGattServerProfile", "BluetoothGattServer.close() failed!", ((Throwable) (obj)), new Object[0]);
          goto _L4
        obj;
        throw obj;
        com.fitbit.e.a.a("FitbitGattServerProfile", "bluetoothGattServer is null!", new Object[0]);
          goto _L4
    }

    public volatile void onServiceConnected(int i, BluetoothProfile bluetoothprofile)
    {
        super.onServiceConnected(i, bluetoothprofile);
    }

    public volatile void onServiceDisconnected(int i)
    {
        super.onServiceDisconnected(i);
    }

    public final boolean registerApplication()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("FitbitGattServerProfile", "Registering application. Manufacturer(%s)", new Object[] {
            n.a().a()
        });
        if (g.g()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("FitbitGattServerProfile", "Unable to register application: Bluetooth is turned off.", new Object[0]);
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (n.a().a() == Manufacturer.e && a_ == null)
        {
            a_ = ((BluetoothManager)FitBitApplication.a().getSystemService("bluetooth")).openGattServer(FitBitApplication.a().getApplicationContext(), new a());
            if (a_ != null)
            {
                a_.addService((new f()).a());
            }
        }
        if (a_ != null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        com.fitbit.e.a.a("FitbitGattServerProfile", "Unable to register application: bluetoothGattServer is null.", new Object[0]);
        flag = false;
        continue; /* Loop/switch isn't completed */
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
