// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            q, LocationSettingsStates

public final class LocationSettingsResult
    implements f, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new q();
    final int a;
    public final Status b;
    final LocationSettingsStates c;

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

    public final Status a()
    {
        return b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        q.a(this, parcel, i);
    }

}
