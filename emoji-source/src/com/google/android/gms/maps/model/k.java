// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            VisibleRegion

public class k
{

    static void a(VisibleRegion visibleregion, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, visibleregion.getVersionCode());
        b.a(parcel, 2, visibleregion.nearLeft, i, false);
        b.a(parcel, 3, visibleregion.nearRight, i, false);
        b.a(parcel, 4, visibleregion.farLeft, i, false);
        b.a(parcel, 5, visibleregion.farRight, i, false);
        b.a(parcel, 6, visibleregion.latLngBounds, i, false);
        b.G(parcel, j);
    }
}
