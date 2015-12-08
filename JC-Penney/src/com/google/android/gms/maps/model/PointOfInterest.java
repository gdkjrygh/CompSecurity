// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            p, LatLng

public final class PointOfInterest
    implements SafeParcelable
{

    public static final p CREATOR = new p();
    public final LatLng a;
    public final String b;
    public final String c;
    private final int d;

    PointOfInterest(int i, LatLng latlng, String s, String s1)
    {
        d = i;
        a = latlng;
        b = s;
        c = s1;
    }

    int a()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel, i);
    }

}
