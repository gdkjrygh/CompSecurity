// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public final class b
{

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.b.bU(parcel);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 1, googlemapoptions.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, googlemapoptions.pR());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, googlemapoptions.pS());
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 4, googlemapoptions.getMapType());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, googlemapoptions.getCamera(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, googlemapoptions.pT());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, googlemapoptions.pU());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, googlemapoptions.pV());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, googlemapoptions.pW());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, googlemapoptions.pX());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, googlemapoptions.pY());
        com.google.android.gms.common.internal.safeparcel.b.J(parcel, j);
    }
}
