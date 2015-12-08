// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import jyw;
import lir;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsStates

public final class LocationSettingsResult
    implements SafeParcelable, jyw
{

    public static final android.os.Parcelable.Creator CREATOR = new lir();
    public final int a;
    public final LocationSettingsStates b;
    private final Status c;

    public LocationSettingsResult(int i, Status status, LocationSettingsStates locationsettingsstates)
    {
        a = i;
        c = status;
        b = locationsettingsstates;
    }

    public final Status a_()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        lir.a(this, parcel, i);
    }

}
