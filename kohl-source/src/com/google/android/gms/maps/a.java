// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class a
{

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.c(parcel, 1, googlemapoptions.getVersionCode());
        b.a(parcel, 2, googlemapoptions.jl());
        b.a(parcel, 3, googlemapoptions.jm());
        b.c(parcel, 4, googlemapoptions.getMapType());
        b.a(parcel, 5, googlemapoptions.getCamera(), i, false);
        b.a(parcel, 6, googlemapoptions.jn());
        b.a(parcel, 7, googlemapoptions.jo());
        b.a(parcel, 8, googlemapoptions.jp());
        b.a(parcel, 9, googlemapoptions.jq());
        b.a(parcel, 10, googlemapoptions.jr());
        b.a(parcel, 11, googlemapoptions.js());
        b.G(parcel, j);
    }
}
