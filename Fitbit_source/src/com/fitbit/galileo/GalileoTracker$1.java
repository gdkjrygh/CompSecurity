// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.ParcelUuid;

// Referenced classes of package com.fitbit.galileo:
//            GalileoTracker, GalileoTrackerType

static final class e
    implements android.os.r
{

    public GalileoTracker a(Parcel parcel)
    {
        GalileoTracker galileotracker = new GalileoTracker((BluetoothDevice)parcel.readParcelable(android/bluetooth/BluetoothDevice.getClassLoader()));
        galileotracker.a(parcel.readInt());
        galileotracker.a(parcel.createByteArray());
        galileotracker.a((ParcelUuid)parcel.readParcelable(android/os/ParcelUuid.getClassLoader()));
        int i = parcel.readInt();
        GalileoTracker.a(galileotracker, GalileoTrackerType.values()[i]);
        return galileotracker;
    }

    public GalileoTracker[] a(int i)
    {
        return new GalileoTracker[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    e()
    {
    }
}
