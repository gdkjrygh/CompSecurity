// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.content.Context;
import android.content.pm.PackageManager;
import com.fitbit.FitBitApplication;
import com.fitbit.util.b.a;

// Referenced classes of package com.fitbit.bluetooth:
//            q, p

static class _cls2 extends q
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

    _cls2.a()
    {
        a(new q.a() {

            final p.a a;

            public boolean a()
                throws Throwable
            {
                return FitBitApplication.a().getPackageManager().hasSystemFeature(com.fitbit.bluetooth.p.a.a());
            }

            
            {
                a = p.a.this;
                super();
            }
        });
        a(new q.a() {

            final p.a a;

            public boolean a()
                throws Throwable
            {
                Class.forName("android.bluetooth.BluetoothGatt");
                Class.forName("android.bluetooth.BluetoothGattCallback");
                return true;
            }

            
            {
                a = p.a.this;
                super();
            }
        });
    }
}
