// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class zzb
{

    static void zza(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.zzK(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, googlemapoptions.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, googlemapoptions.zzqh());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, googlemapoptions.zzqi());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 4, googlemapoptions.getMapType());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 5, googlemapoptions.getCamera(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 6, googlemapoptions.zzqj());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 7, googlemapoptions.zzqk());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 8, googlemapoptions.zzql());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 9, googlemapoptions.zzqm());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 10, googlemapoptions.zzqn());
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 11, googlemapoptions.zzqo());
        com.google.android.gms.common.internal.safeparcel.zzb.zzH(parcel, j);
    }
}
