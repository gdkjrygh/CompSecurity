// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.content.Context;
import android.content.pm.PackageManager;
import com.fitbit.FitBitApplication;

// Referenced classes of package com.fitbit.bluetooth:
//            h, Manufacturer, q

public class p extends h
{
    static class a extends q
    {

        private static final String a;

        static String a()
        {
            return a;
        }

        static 
        {
            String s;
            if (com.fitbit.util.b.a.a(18))
            {
                s = "android.hardware.bluetooth_le";
            } else
            {
                s = "jp.gr.java_conf.ble_profile.api.gatt";
            }
            a = s;
        }

        a()
        {
            a(new _cls1(this));
            a(new _cls2(this));
        }
    }


    public p()
    {
    }

    public Manufacturer a()
    {
        return Manufacturer.e;
    }

    // Unreferenced inner class com/fitbit/bluetooth/p$a$1

/* anonymous class */
    class a._cls1
        implements q.a
    {

        final a a;

        public boolean a()
            throws Throwable
        {
            return FitBitApplication.a().getPackageManager().hasSystemFeature(a.a());
        }

            
            {
                a = a1;
                super();
            }
    }


    // Unreferenced inner class com/fitbit/bluetooth/p$a$2

/* anonymous class */
    class a._cls2
        implements q.a
    {

        final a a;

        public boolean a()
            throws Throwable
        {
            Class.forName("android.bluetooth.BluetoothGatt");
            Class.forName("android.bluetooth.BluetoothGattCallback");
            return true;
        }

            
            {
                a = a1;
                super();
            }
    }

}
