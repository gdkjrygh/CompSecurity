// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ki;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.data:
//            c

public class BleDevice
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int BR;
    private final List SA;
    private final List SB;
    private final String Sz;
    private final String mName;

    BleDevice(int i, String s, String s1, List list, List list1)
    {
        BR = i;
        Sz = s;
        mName = s1;
        SA = Collections.unmodifiableList(list);
        SB = Collections.unmodifiableList(list1);
    }

    private boolean a(BleDevice bledevice)
    {
        return mName.equals(bledevice.mName) && Sz.equals(bledevice.Sz) && ki.a(bledevice.SA, SA) && ki.a(SB, bledevice.SB);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof BleDevice) && a((BleDevice)obj);
    }

    public String getAddress()
    {
        return Sz;
    }

    public List getDataTypes()
    {
        return SB;
    }

    public String getName()
    {
        return mName;
    }

    public List getSupportedProfiles()
    {
        return SA;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            mName, Sz, SA, SB
        });
    }

    public String toString()
    {
        return n.h(this).a("name", mName).a("address", Sz).a("dataTypes", SB).a("supportedProfiles", SA).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
