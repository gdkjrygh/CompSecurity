// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.model:
//            l, LatLng

public final class PointOfInterest
    implements c
{

    public static final l CREATOR = new l();
    final int a;
    public final LatLng b;
    public final String c;
    public final String d;

    PointOfInterest(int i, LatLng latlng, String s, String s1)
    {
        a = i;
        b = latlng;
        c = s;
        d = s1;
    }

    public PointOfInterest(LatLng latlng, String s, String s1)
    {
        this(1, latlng, s, s1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
