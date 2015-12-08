// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsResult, LocationSettingsStates

public class LocationSettingsResultCreator
    implements android.os.Parcelable.Creator
{

    public LocationSettingsResultCreator()
    {
    }

    static void zza(LocationSettingsResult locationsettingsresult, Parcel parcel, int i)
    {
        int j = zzb.zzK(parcel);
        zzb.zza(parcel, 1, locationsettingsresult.getStatus(), i, false);
        zzb.zzc(parcel, 1000, locationsettingsresult.getVersionCode());
        zzb.zza(parcel, 2, locationsettingsresult.getLocationSettingsStates(), i, false);
        zzb.zzH(parcel, j);
    }

    public LocationSettingsResult createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzJ(parcel);
        Status status = null;
        int i = 0;
        LocationSettingsStates locationsettingsstates = null;
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
                    status = (Status)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Status.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    locationsettingsstates = (LocationSettingsStates)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LocationSettingsStates.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationSettingsResult(i, status, locationsettingsstates);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public LocationSettingsResult[] newArray(int i)
    {
        return new LocationSettingsResult[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }
}
