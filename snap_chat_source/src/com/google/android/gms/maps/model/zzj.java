// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public class zzj
{

    static void zza(LatLng latlng, Parcel parcel, int i)
    {
        i = zzb.zzK(parcel);
        zzb.zzc(parcel, 1, latlng.getVersionCode());
        zzb.zza(parcel, 2, latlng.latitude);
        zzb.zza(parcel, 3, latlng.longitude);
        zzb.zzH(parcel, i);
    }
}
