// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.model:
//            CircleOptions

public class b
{

    static void a(CircleOptions circleoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.C(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, circleoptions.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, circleoptions.getCenter(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, circleoptions.getRadius());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, circleoptions.getStrokeWidth());
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 5, circleoptions.getStrokeColor());
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 6, circleoptions.getFillColor());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, circleoptions.getZIndex());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, circleoptions.isVisible());
        com.google.android.gms.common.internal.safeparcel.b.G(parcel, j);
    }
}
