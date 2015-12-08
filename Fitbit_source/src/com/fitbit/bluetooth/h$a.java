// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;


// Referenced classes of package com.fitbit.bluetooth:
//            q, h

static class _cls1 extends q
{

    _cls1.a()
    {
        a(new q.a() {

            final h.a a;

            public boolean a()
                throws Throwable
            {
                Class.forName("com.broadcom.bt.gatt.BluetoothGatt");
                Class.forName("com.broadcom.bt.gatt.BluetoothGattAdapter");
                Class.forName("com.broadcom.bt.gatt.BluetoothGattCallback");
                return true;
            }

            
            {
                a = h.a.this;
                super();
            }
        });
    }
}
