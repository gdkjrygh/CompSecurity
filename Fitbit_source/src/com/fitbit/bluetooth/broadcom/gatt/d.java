// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.gatt;

import android.bluetooth.BluetoothProfile;
import android.content.Context;
import com.fitbit.util.g.a;
import com.fitbit.util.g.b;
import java.lang.reflect.Method;

final class d extends a
{

    static int a = 7;
    static int b = 8;
    static Method c;
    static Method d;

    d()
    {
    }

    public void a(Class class1)
        throws Throwable
    {
        a = ((Integer)com.fitbit.util.g.b.a(class1, "GATT")).intValue();
        b = ((Integer)com.fitbit.util.g.b.a(class1, "GATT_SERVER")).intValue();
        c = class1.getMethod("getProfileProxy", new Class[] {
            android/content/Context, android/bluetooth/BluetoothProfile$ServiceListener, Integer.TYPE
        });
        d = class1.getMethod("closeProfileProxy", new Class[] {
            Integer.TYPE, android/bluetooth/BluetoothProfile
        });
    }

}
