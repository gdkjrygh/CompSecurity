// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import brp;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel

public class ThinAdSizeParcel extends AdSizeParcel
{

    public ThinAdSizeParcel(AdSizeParcel adsizeparcel)
    {
        super(adsizeparcel.a, adsizeparcel.b, adsizeparcel.c, adsizeparcel.d, adsizeparcel.e, adsizeparcel.f, adsizeparcel.g, adsizeparcel.h, adsizeparcel.i, adsizeparcel.j);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = brp.a(parcel, 20293);
        brp.b(parcel, 1, a);
        brp.a(parcel, 2, b);
        brp.b(parcel, 3, c);
        brp.b(parcel, 6, f);
        brp.b(parcel, i);
    }
}
