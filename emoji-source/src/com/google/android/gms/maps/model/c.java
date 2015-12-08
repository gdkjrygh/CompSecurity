// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            GroundOverlayOptions

public class c
{

    static void a(GroundOverlayOptions groundoverlayoptions, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, groundoverlayoptions.getVersionCode());
        b.a(parcel, 2, groundoverlayoptions.jN(), false);
        b.a(parcel, 3, groundoverlayoptions.getLocation(), i, false);
        b.a(parcel, 4, groundoverlayoptions.getWidth());
        b.a(parcel, 5, groundoverlayoptions.getHeight());
        b.a(parcel, 6, groundoverlayoptions.getBounds(), i, false);
        b.a(parcel, 7, groundoverlayoptions.getBearing());
        b.a(parcel, 8, groundoverlayoptions.getZIndex());
        b.a(parcel, 9, groundoverlayoptions.isVisible());
        b.a(parcel, 10, groundoverlayoptions.getTransparency());
        b.a(parcel, 11, groundoverlayoptions.getAnchorU());
        b.a(parcel, 12, groundoverlayoptions.getAnchorV());
        b.G(parcel, j);
    }
}
