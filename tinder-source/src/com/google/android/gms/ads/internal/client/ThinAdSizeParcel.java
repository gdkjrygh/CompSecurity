// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel

public class ThinAdSizeParcel extends AdSizeParcel
{

    public void writeToParcel(Parcel parcel, int i)
    {
        i = a.a(parcel, 20293);
        a.b(parcel, 1, a);
        a.a(parcel, 2, b);
        a.b(parcel, 3, c);
        a.b(parcel, 6, f);
        a.b(parcel, i);
    }
}
