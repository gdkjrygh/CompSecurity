// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsStates

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void zza(LocationSettingsStates locationsettingsstates, Parcel parcel, int i)
    {
        i = zzb.zzK(parcel);
        zzb.zza(parcel, 1, locationsettingsstates.isGpsUsable());
        zzb.zzc(parcel, 1000, locationsettingsstates.getVersionCode());
        zzb.zza(parcel, 2, locationsettingsstates.isNetworkLocationUsable());
        zzb.zza(parcel, 3, locationsettingsstates.isBleUsable());
        zzb.zza(parcel, 4, locationsettingsstates.isGpsPresent());
        zzb.zza(parcel, 5, locationsettingsstates.isNetworkLocationPresent());
        zzb.zza(parcel, 6, locationsettingsstates.isBlePresent());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzds(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfo(i);
    }

    public LocationSettingsStates zzds(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
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
                    flag5 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    flag4 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 3: // '\003'
                    flag3 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 4: // '\004'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 5: // '\005'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 6: // '\006'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationSettingsStates(i, flag5, flag4, flag3, flag2, flag1, flag);
            }
        } while (true);
    }

    public LocationSettingsStates[] zzfo(int i)
    {
        return new LocationSettingsStates[i];
    }
}
