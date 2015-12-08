// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class b
{

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.H(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, googlemapoptions.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, googlemapoptions.nD());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, googlemapoptions.nE());
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 4, googlemapoptions.getMapType());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, googlemapoptions.getCamera(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, googlemapoptions.nF());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, googlemapoptions.nG());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, googlemapoptions.nH());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, googlemapoptions.nI());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, googlemapoptions.nJ());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, googlemapoptions.nK());
        com.google.android.gms.common.internal.safeparcel.b.H(parcel, j);
    }
}
