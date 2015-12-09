// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public class v
{

    static void a(LatLng latlng, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, latlng.a());
        b.a(parcel, 2, latlng.a);
        b.a(parcel, 3, latlng.b);
        b.a(parcel, i);
    }
}
