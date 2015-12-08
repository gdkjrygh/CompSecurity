// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsRequest, LocationRequest

public final class p
    implements android.os.Parcelable.Creator
{

    public p()
    {
    }

    static void a(LocationSettingsRequest locationsettingsrequest, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.c(parcel, 1, Collections.unmodifiableList(locationsettingsrequest.b));
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, locationsettingsrequest.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, locationsettingsrequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, locationsettingsrequest.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, locationsettingsrequest.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = zza.a(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        boolean flag2 = false;
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
                    arraylist = zza.c(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = zza.e(parcel, k);
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
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationSettingsRequest(i, arraylist, flag2, flag1, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LocationSettingsRequest[i];
    }
}
