// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            zzh, LocationSettingsStates

public final class LocationSettingsResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    private final int a;
    private final Status b;
    private final LocationSettingsStates c;

    LocationSettingsResult(int i, Status status, LocationSettingsStates locationsettingsstates)
    {
        a = i;
        b = status;
        c = locationsettingsstates;
    }

    public LocationSettingsResult(Status status)
    {
        this(1, status, null);
    }

    public Status a()
    {
        return b;
    }

    public int b()
    {
        return a;
    }

    public LocationSettingsStates c()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.a(this, parcel, i);
    }

}
