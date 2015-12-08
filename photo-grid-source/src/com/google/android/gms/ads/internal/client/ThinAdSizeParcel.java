// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel

public class ThinAdSizeParcel extends AdSizeParcel
{

    public ThinAdSizeParcel(AdSizeParcel adsizeparcel)
    {
        super(adsizeparcel.versionCode, adsizeparcel.zzte, adsizeparcel.height, adsizeparcel.heightPixels, adsizeparcel.zztf, adsizeparcel.width, adsizeparcel.widthPixels, adsizeparcel.zztg, adsizeparcel.zzth, adsizeparcel.zzti);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        i = c.a(parcel);
        c.a(parcel, 1, versionCode);
        c.a(parcel, 2, zzte, false);
        c.a(parcel, 3, height);
        c.a(parcel, 6, width);
        c.a(parcel, i);
    }
}
