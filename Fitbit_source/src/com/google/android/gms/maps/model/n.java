// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            CameraPosition

public class n
{

    static void a(CameraPosition cameraposition, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, cameraposition.a());
        b.a(parcel, 2, cameraposition.a, i, false);
        b.a(parcel, 3, cameraposition.b);
        b.a(parcel, 4, cameraposition.c);
        b.a(parcel, 5, cameraposition.d);
        b.a(parcel, j);
    }
}
