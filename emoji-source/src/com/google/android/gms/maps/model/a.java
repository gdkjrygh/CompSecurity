// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition

public class a
{

    static void a(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, cameraposition.getVersionCode());
        b.a(parcel, 2, cameraposition.target, i, false);
        b.a(parcel, 3, cameraposition.zoom);
        b.a(parcel, 4, cameraposition.tilt);
        b.a(parcel, 5, cameraposition.bearing);
        b.G(parcel, j);
    }
}
