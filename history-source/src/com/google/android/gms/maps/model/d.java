// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            CircleOptions

public class d
{

    static void a(CircleOptions circleoptions, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, circleoptions.getVersionCode());
        b.a(parcel, 2, circleoptions.getCenter(), i, false);
        b.a(parcel, 3, circleoptions.getRadius());
        b.a(parcel, 4, circleoptions.getStrokeWidth());
        b.c(parcel, 5, circleoptions.getStrokeColor());
        b.c(parcel, 6, circleoptions.getFillColor());
        b.a(parcel, 7, circleoptions.getZIndex());
        b.a(parcel, 8, circleoptions.isVisible());
        b.H(parcel, j);
    }
}
