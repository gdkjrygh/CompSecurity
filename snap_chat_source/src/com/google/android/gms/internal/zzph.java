// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//            zzpg, zzox

public class zzph
    implements android.os.Parcelable.Creator
{

    public zzph()
    {
    }

    static void zza(zzpg zzpg1, Parcel parcel, int i)
    {
        int j = zzb.zzK(parcel);
        zzb.zza(parcel, 1, zzpg1.zzabx, i, false);
        zzb.zzc(parcel, 1000, zzpg1.getVersionCode());
        zzb.zza(parcel, 2, zzpg1.zzanh);
        zzb.zza(parcel, 3, zzpg1.zzani);
        zzb.zza(parcel, 4, zzpg1.zzanj);
        zzb.zzc(parcel, 5, zzpg1.zzank, false);
        zzb.zza(parcel, 6, zzpg1.mTag, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdv(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfu(i);
    }

    public zzpg zzdv(Parcel parcel)
    {
        String s = null;
        boolean flag = true;
        boolean flag2 = false;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        Object obj = zzpg.zzang;
        boolean flag1 = true;
        LocationRequest locationrequest = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzI(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.zzaP(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    locationrequest = (LocationRequest)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 5: // '\005'
                    obj = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, zzox.CREATOR);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new zzpg(i, locationrequest, flag2, flag1, flag, ((java.util.List) (obj)), s);
            }
        } while (true);
    }

    public zzpg[] zzfu(int i)
    {
        return new zzpg[i];
    }
}
