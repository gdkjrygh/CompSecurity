// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsResultCreator, LocationSettingsStates

public final class LocationSettingsResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new LocationSettingsResultCreator();
    final LocationSettingsStates mStates;
    final Status mStatus;
    final int mVersionCode;

    LocationSettingsResult(int i, Status status, LocationSettingsStates locationsettingsstates)
    {
        mVersionCode = i;
        mStatus = status;
        mStates = locationsettingsstates;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        LocationSettingsResultCreator.writeToParcel(this, parcel, i);
    }

}
