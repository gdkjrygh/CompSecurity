// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    public static LatLng a(Parcel parcel)
    {
        double d = 0.0D;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        double d1 = 0.0D;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    d1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;

                case 3: // '\003'
                    d = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new LatLng(j, d1, d);
            }
        } while (true);
    }

    static void a(LatLng latlng, Parcel parcel)
    {
        int j = b.a(parcel);
        b.a(parcel, 1, latlng.a());
        b.a(parcel, 2, latlng.a);
        b.a(parcel, 3, latlng.b);
        b.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int j)
    {
        return new LatLng[j];
    }
}
