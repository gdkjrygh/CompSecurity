// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location:
//            LocationResult

public final class n
    implements android.os.Parcelable.Creator
{

    public n()
    {
    }

    static void a(LocationResult locationresult, Parcel parcel)
    {
        int i = b.a(parcel);
        b.c(parcel, 1, locationresult.a());
        b.a(parcel, 1000, locationresult.b());
        b.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        Object obj = com.google.android.gms.location.LocationResult.a;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    obj = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, Location.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LocationResult(i, ((java.util.List) (obj)));
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new LocationResult[i];
    }
}
