// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsStates

public final class r
    implements android.os.Parcelable.Creator
{

    public r()
    {
    }

    static void a(LocationSettingsStates locationsettingsstates, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 1, locationsettingsstates.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, locationsettingsstates.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, locationsettingsstates.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, locationsettingsstates.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, locationsettingsstates.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, locationsettingsstates.f);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, locationsettingsstates.g);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 7, locationsettingsstates.h);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = zza.a(parcel);
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
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    flag6 = zza.c(parcel, k);
                    break;

                case 1000: 
                    i = zza.e(parcel, k);
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
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationSettingsStates(i, flag6, flag5, flag4, flag3, flag2, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LocationSettingsStates[i];
    }
}
