// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public final class m
    implements android.os.Parcelable.Creator
{

    public m()
    {
    }

    public static LatLng a(Parcel parcel)
    {
        double d = 0.0D;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = 0;
        double d1 = 0.0D;
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
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    d1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 3: // '\003'
                    d = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LatLng(i, d1, d);
            }
        } while (true);
    }

    static void a(LatLng latlng, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, latlng.a());
        c.a(parcel, 2, latlng.a);
        c.a(parcel, 3, latlng.b);
        c.a(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new LatLng[i];
    }
}
