// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;

// Referenced classes of package com.fitbit.bluetooth:
//            Manufacturer

public interface k
{

    public static final String b = "com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.ACTION_DEVICE_FOUND";
    public static final String c = "com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.ACTION_DISCOVERY_FINISHED";
    public static final String d = "com.fitbit.bluetooth.adapter.FitbitBluetoothAdapter.EXTRA_SERVICE_DATA";

    public abstract Manufacturer a();

    public abstract boolean a(BluetoothDevice bluetoothdevice, Bundle bundle);

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();
}
