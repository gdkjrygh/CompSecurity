// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsStatesCreator

public final class LocationSettingsStates
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new LocationSettingsStatesCreator();
    final boolean mBlePresent;
    final boolean mBleUsable;
    final boolean mGpsPresent;
    final boolean mGpsUsable;
    final boolean mNlpPresent;
    final boolean mNlpUsable;
    final int mVersionCode;

    LocationSettingsStates(int i, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5)
    {
        mVersionCode = i;
        mGpsUsable = flag;
        mNlpUsable = flag1;
        mBleUsable = flag2;
        mGpsPresent = flag3;
        mNlpPresent = flag4;
        mBlePresent = flag5;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LocationSettingsStatesCreator.writeToParcel$511ad450(this, parcel);
    }

}
