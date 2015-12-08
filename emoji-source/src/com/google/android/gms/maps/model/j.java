// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            TileOverlayOptions

public class j
{

    static void a(TileOverlayOptions tileoverlayoptions, Parcel parcel, int i)
    {
        i = b.C(parcel);
        b.c(parcel, 1, tileoverlayoptions.getVersionCode());
        b.a(parcel, 2, tileoverlayoptions.jQ(), false);
        b.a(parcel, 3, tileoverlayoptions.isVisible());
        b.a(parcel, 4, tileoverlayoptions.getZIndex());
        b.G(parcel, i);
    }
}
