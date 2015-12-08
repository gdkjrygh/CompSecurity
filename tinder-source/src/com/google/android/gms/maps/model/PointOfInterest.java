// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            i, LatLng

public final class PointOfInterest
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    final int a;
    public final LatLng b;
    public final String c;
    public final String d;

    PointOfInterest(int j, LatLng latlng, String s, String s1)
    {
        a = j;
        b = latlng;
        c = s;
        d = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
