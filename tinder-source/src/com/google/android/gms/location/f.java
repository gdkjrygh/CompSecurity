// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.location:
//            LocationAvailability

public final class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    public static LocationAvailability a(Parcel parcel)
    {
        int i = 1;
        int i1 = zza.a(parcel);
        int l = 0;
        int k = 1000;
        long l1 = 0L;
        int j = 1;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    j = zza.e(parcel, j1);
                    break;

                case 1000: 
                    l = zza.e(parcel, j1);
                    break;

                case 2: // '\002'
                    i = zza.e(parcel, j1);
                    break;

                case 3: // '\003'
                    l1 = zza.f(parcel, j1);
                    break;

                case 4: // '\004'
                    k = zza.e(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new LocationAvailability(l, k, j, i, l1);
            }
        } while (true);
    }

    static void a(LocationAvailability locationavailability, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, locationavailability.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, locationavailability.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, locationavailability.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, locationavailability.d);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 4, locationavailability.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LocationAvailability[i];
    }
}
