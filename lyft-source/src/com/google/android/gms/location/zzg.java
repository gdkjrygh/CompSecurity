// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsRequest, LocationRequest

public class zzg
    implements android.os.Parcelable.Creator
{

    public zzg()
    {
    }

    static void a(LocationSettingsRequest locationsettingsrequest, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.c(parcel, 1, locationsettingsrequest.b(), false);
        zzb.a(parcel, 1000, locationsettingsrequest.a());
        zzb.a(parcel, 2, locationsettingsrequest.c());
        zzb.a(parcel, 3, locationsettingsrequest.d());
        zzb.a(parcel, 4, locationsettingsrequest.e());
        zzb.a(parcel, i);
    }

    public LocationSettingsRequest a(Parcel parcel)
    {
        boolean flag = false;
        int j = zza.b(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    arraylist = zza.c(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = zza.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = zza.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag = zza.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LocationSettingsRequest(i, arraylist, flag2, flag1, flag);
            }
        } while (true);
    }

    public LocationSettingsRequest[] a(int i)
    {
        return new LocationSettingsRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
