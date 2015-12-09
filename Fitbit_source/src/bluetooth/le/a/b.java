// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.a;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fitbit.f.a;

public abstract class b extends BluetoothGattCallback
    implements android.os.Handler.Callback
{
    public static class a
    {

        public final BluetoothGatt a;
        public final Object b;
        public final int c;

        public boolean a()
        {
            return c == 0;
        }

        public a(BluetoothGatt bluetoothgatt, Object obj)
        {
            this(bluetoothgatt, obj, 0);
        }

        public a(BluetoothGatt bluetoothgatt, Object obj, int i1)
        {
            a = bluetoothgatt;
            b = obj;
            c = i1;
        }
    }


    private static final String a = "HandlerBasedGattCallback";
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    private static final int g = 4;
    private static final int h = 5;
    private static final int i = 6;
    private static final int j = 7;
    private static final int k = 8;
    private static final int l = 9;
    protected final Handler b;

    public b()
    {
        this(Looper.myLooper());
    }

    public b(Looper looper)
    {
        b = new Handler(looper, this);
    }

    public void a(BluetoothGatt bluetoothgatt, int i1)
    {
    }

    public void a(a a1)
    {
    }

    public void a_(BluetoothGatt bluetoothgatt)
    {
    }

    public void b(BluetoothGatt bluetoothgatt)
    {
    }

    public abstract void b(BluetoothGatt bluetoothgatt, int i1);

    public void b(a a1)
    {
    }

    public abstract void c(BluetoothGatt bluetoothgatt, int i1);

    public void c(a a1)
    {
    }

    public abstract void d(BluetoothGatt bluetoothgatt, int i1);

    public void d(a a1)
    {
    }

    public void e(a a1)
    {
    }

    public void f(a a1)
    {
    }

    public void g(a a1)
    {
    }

    public boolean handleMessage(Message message)
    {
        com.fitbit.f.a.c("HandlerBasedGattCallback", (new StringBuilder()).append("handleMessage: ").append(message.what).toString());
        message.what;
        JVM INSTR tableswitch 0 9: default 84
    //                   0 86
    //                   1 99
    //                   2 113
    //                   3 155
    //                   4 127
    //                   5 141
    //                   6 198
    //                   7 230
    //                   8 262
    //                   9 301;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        return false;
_L2:
        a((a)message.obj);
_L13:
        return true;
_L3:
        b((a)message.obj);
        continue; /* Loop/switch isn't completed */
_L4:
        c((a)message.obj);
        continue; /* Loop/switch isn't completed */
_L6:
        d((a)message.obj);
        continue; /* Loop/switch isn't completed */
_L7:
        e((a)message.obj);
        continue; /* Loop/switch isn't completed */
_L5:
        if (message.arg1 == 0)
        {
            a((BluetoothGatt)message.obj, message.arg2);
        } else
        {
            b((BluetoothGatt)message.obj, message.arg1);
        }
        continue; /* Loop/switch isn't completed */
_L8:
        f(new a((BluetoothGatt)message.obj, Integer.valueOf(message.arg2), message.arg1));
        continue; /* Loop/switch isn't completed */
_L9:
        g(new a((BluetoothGatt)message.obj, Integer.valueOf(message.arg2), message.arg1));
        continue; /* Loop/switch isn't completed */
_L10:
        if (message.arg1 == 0)
        {
            a_((BluetoothGatt)message.obj);
        } else
        {
            c((BluetoothGatt)message.obj, message.arg1);
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (message.arg1 == 0)
        {
            b((BluetoothGatt)message.obj);
        } else
        {
            d((BluetoothGatt)message.obj, message.arg1);
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

    public final void onCharacteristicChanged(BluetoothGatt bluetoothgatt, BluetoothGattCharacteristic bluetoothgattcharacteristic)
    {
        com.fitbit.f.a.c("HandlerBasedGattCallback", "onCharacteristicChanged.");
        b.sendMessage(b.obtainMessage(0, 0, 0, new a(bluetoothgatt, new bluetooth.le.external.a(bluetoothgattcharacteristic.getUuid(), bluetoothgattcharacteristic.getValue()))));
    }

    public final void onCharacteristicRead(BluetoothGatt bluetoothgatt, BluetoothGattCharacteristic bluetoothgattcharacteristic, int i1)
    {
        com.fitbit.f.a.c("HandlerBasedGattCallback", (new StringBuilder()).append("onCharacteristicRead status: ").append(i1).toString());
        b.sendMessage(b.obtainMessage(1, i1, 0, new a(bluetoothgatt, new bluetooth.le.external.a(bluetoothgattcharacteristic.getUuid(), bluetoothgattcharacteristic.getValue()), i1)));
    }

    public final void onCharacteristicWrite(BluetoothGatt bluetoothgatt, BluetoothGattCharacteristic bluetoothgattcharacteristic, int i1)
    {
        com.fitbit.f.a.c("HandlerBasedGattCallback", (new StringBuilder()).append("onCharacteristicWrite status: ").append(i1).toString());
        b.sendMessage(b.obtainMessage(2, i1, 0, new a(bluetoothgatt, new bluetooth.le.external.a(bluetoothgattcharacteristic.getUuid(), bluetoothgattcharacteristic.getValue()), i1)));
    }

    public final void onConnectionStateChange(BluetoothGatt bluetoothgatt, int i1, int j1)
    {
        com.fitbit.f.a.c("HandlerBasedGattCallback", (new StringBuilder()).append("onConnectionStateChange status: ").append(i1).append(" state: ").append(j1).toString());
        b.sendMessage(b.obtainMessage(3, i1, j1, bluetoothgatt));
    }

    public final void onDescriptorRead(BluetoothGatt bluetoothgatt, BluetoothGattDescriptor bluetoothgattdescriptor, int i1)
    {
        com.fitbit.f.a.c("HandlerBasedGattCallback", (new StringBuilder()).append("onDescriptorRead status: ").append(i1).toString());
        Object obj = null;
        java.util.UUID uuid = obj;
        if (bluetoothgattdescriptor.getCharacteristic() != null)
        {
            uuid = obj;
            if (bluetoothgattdescriptor.getCharacteristic().getService() != null)
            {
                uuid = bluetoothgattdescriptor.getCharacteristic().getService().getUuid();
            }
        }
        b.sendMessage(b.obtainMessage(4, i1, 0, new a(bluetoothgatt, new bluetooth.le.external.b(bluetoothgattdescriptor.getUuid(), uuid, bluetoothgattdescriptor.getValue()), i1)));
    }

    public final void onDescriptorWrite(BluetoothGatt bluetoothgatt, BluetoothGattDescriptor bluetoothgattdescriptor, int i1)
    {
        com.fitbit.f.a.c("HandlerBasedGattCallback", (new StringBuilder()).append("onDescriptorWrite status: ").append(i1).toString());
        Object obj = null;
        java.util.UUID uuid = obj;
        if (bluetoothgattdescriptor.getCharacteristic() != null)
        {
            uuid = obj;
            if (bluetoothgattdescriptor.getCharacteristic().getService() != null)
            {
                uuid = bluetoothgattdescriptor.getCharacteristic().getService().getUuid();
            }
        }
        b.sendMessage(b.obtainMessage(5, i1, 0, new a(bluetoothgatt, new bluetooth.le.external.b(bluetoothgattdescriptor.getUuid(), uuid, bluetoothgattdescriptor.getValue()), i1)));
    }

    public final void onMtuChanged(BluetoothGatt bluetoothgatt, int i1, int j1)
    {
        com.fitbit.f.a.c("HandlerBasedGattCallback", (new StringBuilder()).append("onMtuChanged status: ").append(j1).toString());
        b.sendMessage(b.obtainMessage(6, j1, i1, bluetoothgatt));
    }

    public final void onReadRemoteRssi(BluetoothGatt bluetoothgatt, int i1, int j1)
    {
        com.fitbit.f.a.c("HandlerBasedGattCallback", (new StringBuilder()).append("onReadRemoteRssi status: ").append(j1).toString());
        b.sendMessage(b.obtainMessage(7, j1, i1, bluetoothgatt));
    }

    public final void onReliableWriteCompleted(BluetoothGatt bluetoothgatt, int i1)
    {
        com.fitbit.f.a.c("HandlerBasedGattCallback", (new StringBuilder()).append("onReliableWriteCompleted status: ").append(i1).toString());
        b.sendMessage(b.obtainMessage(8, i1, 0, bluetoothgatt));
    }

    public final void onServicesDiscovered(BluetoothGatt bluetoothgatt, int i1)
    {
        com.fitbit.f.a.c("HandlerBasedGattCallback", (new StringBuilder()).append("onServicesDiscovered status: ").append(i1).toString());
        b.sendMessage(b.obtainMessage(9, i1, 0, bluetoothgatt));
    }
}
