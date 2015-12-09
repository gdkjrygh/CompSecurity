// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class n
{

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, googlemapoptions.a());
        b.a(parcel, 2, googlemapoptions.b());
        b.a(parcel, 3, googlemapoptions.c());
        b.a(parcel, 4, googlemapoptions.n());
        b.a(parcel, 5, googlemapoptions.o(), i, false);
        b.a(parcel, 6, googlemapoptions.d());
        b.a(parcel, 7, googlemapoptions.e());
        b.a(parcel, 8, googlemapoptions.f());
        b.a(parcel, 9, googlemapoptions.g());
        b.a(parcel, 10, googlemapoptions.h());
        b.a(parcel, 11, googlemapoptions.i());
        b.a(parcel, j);
    }
}
