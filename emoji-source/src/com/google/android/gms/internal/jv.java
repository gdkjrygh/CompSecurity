// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.internal:
//            ju, js

public class jv
    implements android.os.Parcelable.Creator
{

    public jv()
    {
    }

    static void a(ju ju1, Parcel parcel, int i)
    {
        int j = b.C(parcel);
        b.a(parcel, 1, ju1.getName(), false);
        b.c(parcel, 1000, ju1.xM);
        b.a(parcel, 2, ju1.jk(), i, false);
        b.a(parcel, 3, ju1.getAddress(), false);
        b.b(parcel, 4, ju1.jl(), false);
        b.a(parcel, 5, ju1.getPhoneNumber(), false);
        b.a(parcel, 6, ju1.jm(), false);
        b.G(parcel, j);
    }

    public ju bz(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.B(parcel);
        int i = 0;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        String s2 = null;
        LatLng latlng = null;
        String s3 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.A(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.ar(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, js.CREATOR);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ju(i, s3, latlng, s2, arraylist, s1, s);
            }
        } while (true);
    }

    public ju[] cU(int i)
    {
        return new ju[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bz(parcel);
    }

    public Object[] newArray(int i)
    {
        return cU(i);
    }
}
