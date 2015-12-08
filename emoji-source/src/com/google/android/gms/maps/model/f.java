// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            MarkerOptions

public class f
{

    static void a(MarkerOptions markeroptions, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, markeroptions.getVersionCode());
        b.a(parcel, 2, markeroptions.getPosition(), i, false);
        b.a(parcel, 3, markeroptions.getTitle(), false);
        b.a(parcel, 4, markeroptions.getSnippet(), false);
        b.a(parcel, 5, markeroptions.jO(), false);
        b.a(parcel, 6, markeroptions.getAnchorU());
        b.a(parcel, 7, markeroptions.getAnchorV());
        b.a(parcel, 8, markeroptions.isDraggable());
        b.a(parcel, 9, markeroptions.isVisible());
        b.G(parcel, j);
    }
}
