// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsStates

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void a(LocationSettingsStates locationsettingsstates, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, locationsettingsstates.b());
        zzb.a(parcel, 1000, locationsettingsstates.a());
        zzb.a(parcel, 2, locationsettingsstates.d());
        zzb.a(parcel, 3, locationsettingsstates.f());
        zzb.a(parcel, 4, locationsettingsstates.c());
        zzb.a(parcel, 5, locationsettingsstates.e());
        zzb.a(parcel, 6, locationsettingsstates.g());
        zzb.a(parcel, 7, locationsettingsstates.h());
        zzb.a(parcel, i);
    }

    public LocationSettingsStates a(Parcel parcel)
    {
        boolean flag = false;
        int j = zza.b(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;
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
                    flag6 = zza.c(parcel, k);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    flag5 = zza.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag4 = zza.c(parcel, k);
                    break;

                case 4: // '\004'
                    flag3 = zza.c(parcel, k);
                    break;

                case 5: // '\005'
                    flag2 = zza.c(parcel, k);
                    break;

                case 6: // '\006'
                    flag1 = zza.c(parcel, k);
                    break;

                case 7: // '\007'
                    flag = zza.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new LocationSettingsStates(i, flag6, flag5, flag4, flag3, flag2, flag1, flag);
            }
        } while (true);
    }

    public LocationSettingsStates[] a(int i)
    {
        return new LocationSettingsStates[i];
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
