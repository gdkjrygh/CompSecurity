// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            PointOfInterestCreator, LatLng

public final class PointOfInterest
    implements SafeParcelable
{

    public static final PointOfInterestCreator CREATOR = new PointOfInterestCreator();
    public final LatLng latLng;
    final int mVersionCode;
    public final String name;
    public final String placeId;

    PointOfInterest(int i, LatLng latlng, String s, String s1)
    {
        mVersionCode = i;
        latLng = latlng;
        placeId = s;
        name = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        PointOfInterestCreator.writeToParcel(this, parcel, i);
    }

}
