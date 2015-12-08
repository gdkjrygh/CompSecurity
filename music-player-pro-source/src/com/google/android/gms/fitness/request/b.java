// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;

// Referenced classes of package com.google.android.gms.fitness.request:
//            c

public class b
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int CK;
    private final String VF;
    private final BleDevice VG;

    b(int i, String s, BleDevice bledevice)
    {
        CK = i;
        VF = s;
        VG = bledevice;
    }

    public b(BleDevice bledevice)
    {
        this(2, bledevice.getAddress(), bledevice);
    }

    public b(String s)
    {
        this(2, s, null);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDeviceAddress()
    {
        return VF;
    }

    int getVersionCode()
    {
        return CK;
    }

    public BleDevice jQ()
    {
        return VG;
    }

    public String toString()
    {
        return String.format("ClaimBleDeviceRequest{%s %s}", new Object[] {
            VF, VG
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
