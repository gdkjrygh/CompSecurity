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

public class LocationSettingsResult
    implements Result, SafeParcelable
{

    public static final LocationSettingsResultCreator CREATOR = new LocationSettingsResultCreator();
    private final int zzFG;
    private final Status zzHb;
    private final LocationSettingsStates zzamp;

    LocationSettingsResult(int i, Status status, LocationSettingsStates locationsettingsstates)
    {
        zzFG = i;
        zzHb = status;
        zzamp = locationsettingsstates;
    }

    public int describeContents()
    {
        return 0;
    }

    public LocationSettingsStates getLocationSettingsStates()
    {
        return zzamp;
    }

    public Status getStatus()
    {
        return zzHb;
    }

    public int getVersionCode()
    {
        return zzFG;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationSettingsResultCreator.zza(this, parcel, i);
    }

}
