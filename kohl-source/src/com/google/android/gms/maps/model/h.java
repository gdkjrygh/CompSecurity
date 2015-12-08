// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolylineOptions

public class h
{

    static void a(PolylineOptions polylineoptions, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, polylineoptions.getVersionCode());
        b.b(parcel, 2, polylineoptions.getPoints(), false);
        b.a(parcel, 3, polylineoptions.getWidth());
        b.c(parcel, 4, polylineoptions.getColor());
        b.a(parcel, 5, polylineoptions.getZIndex());
        b.a(parcel, 6, polylineoptions.isVisible());
        b.a(parcel, 7, polylineoptions.isGeodesic());
        b.G(parcel, i);
    }
}
