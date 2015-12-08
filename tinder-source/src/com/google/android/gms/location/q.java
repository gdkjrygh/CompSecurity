// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsResult, LocationSettingsStates

public final class q
    implements android.os.Parcelable.Creator
{

    public q()
    {
    }

    static void a(LocationSettingsResult locationsettingsresult, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, locationsettingsresult.b, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, locationsettingsresult.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, locationsettingsresult.c, i);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = zza.a(parcel);
        Status status = null;
        int i = 0;
        LocationSettingsStates locationsettingsstates = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    status = (Status)zza.a(parcel, k, Status.CREATOR);
                    break;

                case 1000: 
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    locationsettingsstates = (LocationSettingsStates)zza.a(parcel, k, LocationSettingsStates.CREATOR);
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

    public final Object[] newArray(int i)
    {
        return new LocationSettingsResult[i];
    }
}
