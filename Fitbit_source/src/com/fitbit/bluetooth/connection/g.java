// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.bluetooth.BluetoothDevice;
import com.fitbit.bluetooth.b.b;
import com.fitbit.bluetooth.connection.a.a;
import com.fitbit.bluetooth.galileo.GalileoProfile;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            f

public interface g
{

    public static final String a = "com.fitbit.bluetooth.connection.ConnectionStateContext.ACTION_CONNECTION_OPENED";
    public static final String b = "com.fitbit.bluetooth.connection.ConnectionStateContext.ACTION_CONNECTION_CLOSED";

    public abstract GalileoProfile a();

    public abstract void a(a a1);

    public abstract b b();

    public abstract boolean g();

    public abstract boolean h();

    public abstract void i();

    public abstract void j();

    public abstract boolean k();

    public abstract BluetoothDevice l();

    public abstract a m();

    public abstract f n();
}
