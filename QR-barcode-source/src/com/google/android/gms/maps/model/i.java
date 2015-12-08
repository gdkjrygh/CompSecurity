// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            LatLng

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(LatLng latlng, Parcel parcel, int j)
    {
        j = b.D(parcel);
        b.c(parcel, 1, latlng.getVersionCode());
        b.a(parcel, 2, latlng.latitude);
        b.a(parcel, 3, latlng.longitude);
        b.H(parcel, j);
    }

    public LatLng cM(Parcel parcel)
    {
        double d = 0.0D;
        int k = com.google.android.gms.common.internal.safeparcel.a.C(parcel);
        int j = 0;
        double d1 = 0.0D;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aD(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    d1 = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;

                case 3: // '\003'
                    d = com.google.android.gms.common.internal.safeparcel.a.m(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new LatLng(j, d1, d);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cM(parcel);
    }

    public LatLng[] eC(int j)
    {
        return new LatLng[j];
    }

    public Object[] newArray(int j)
    {
        return eC(j);
    }
}
