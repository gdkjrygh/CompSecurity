// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolygonOptions

public class g
{

    static void a(PolygonOptions polygonoptions, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.c(parcel, 1, polygonoptions.getVersionCode());
        b.b(parcel, 2, polygonoptions.getPoints(), false);
        b.c(parcel, 3, polygonoptions.iF(), false);
        b.a(parcel, 4, polygonoptions.getStrokeWidth());
        b.c(parcel, 5, polygonoptions.getStrokeColor());
        b.c(parcel, 6, polygonoptions.getFillColor());
        b.a(parcel, 7, polygonoptions.getZIndex());
        b.a(parcel, 8, polygonoptions.isVisible());
        b.a(parcel, 9, polygonoptions.isGeodesic());
        b.F(parcel, i);
    }
}
