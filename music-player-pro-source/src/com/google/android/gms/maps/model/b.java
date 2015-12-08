// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition

public class b
{

    static void a(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.H(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, cameraposition.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, cameraposition.target, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, cameraposition.zoom);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, cameraposition.tilt);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, cameraposition.bearing);
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, j);
    }
}
