// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.messages.devices:
//            NearbyDeviceFilterCreator

public class NearbyDeviceFilter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new NearbyDeviceFilterCreator();
    final byte mIdPrefix[];
    final int mIdPrefixType;
    final boolean mShouldMatchUrls;
    final int mVersionCode;

    NearbyDeviceFilter(int i, int j, byte abyte0[], boolean flag)
    {
        mVersionCode = i;
        mIdPrefixType = j;
        mIdPrefix = abyte0;
        mShouldMatchUrls = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        NearbyDeviceFilterCreator.writeToParcel$1746553a(this, parcel);
    }

}
