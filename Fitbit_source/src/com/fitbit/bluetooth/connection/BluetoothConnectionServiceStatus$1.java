// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import com.fitbit.bluetooth.AirlinkSession;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            BluetoothConnectionServiceStatus

static final class 
    implements android.os.ctionServiceStatus._cls1
{

    public BluetoothConnectionServiceStatus a(Parcel parcel)
    {
        BluetoothDevice bluetoothdevice = (BluetoothDevice)parcel.readParcelable(android/bluetooth/BluetoothDevice.getClassLoader());
        AirlinkSession airlinksession = (AirlinkSession)parcel.readParcelable(com/fitbit/bluetooth/AirlinkSession.getClassLoader());
        return new BluetoothConnectionServiceStatus(parcel.readInt(), bluetoothdevice, airlinksession);
    }

    public BluetoothConnectionServiceStatus[] a(int i)
    {
        return new BluetoothConnectionServiceStatus[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
