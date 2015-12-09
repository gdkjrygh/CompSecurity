// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;


// Referenced classes of package com.fitbit.bluetooth:
//            h, Manufacturer, q

public class v extends h
{
    static class a extends q
    {

        a()
        {
            a(new _cls1(this));
        }
    }


    public v()
    {
    }

    public Manufacturer a()
    {
        return Manufacturer.f;
    }

    // Unreferenced inner class com/fitbit/bluetooth/v$a$1

/* anonymous class */
    class a._cls1
        implements q.a
    {

        final a a;

        public boolean a()
            throws Throwable
        {
            Class.forName("com.samsung.android.sdk.bt.gatt.BluetoothGatt");
            Class.forName("com.samsung.android.sdk.bt.gatt.BluetoothGattAdapter");
            Class.forName("com.samsung.android.sdk.bt.gatt.BluetoothGattCallback");
            return true;
        }

            
            {
                a = a1;
                super();
            }
    }

}
