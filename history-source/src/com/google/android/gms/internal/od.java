// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.internal:
//            oc, oa

public class od
    implements android.os.Parcelable.Creator
{

    public od()
    {
    }

    static void a(oc oc1, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.a(parcel, 1, oc1.getName(), false);
        b.c(parcel, 1000, oc1.CK);
        b.a(parcel, 2, oc1.nx(), i, false);
        b.a(parcel, 3, oc1.getAddress(), false);
        b.c(parcel, 4, oc1.ny(), false);
        b.a(parcel, 5, oc1.getPhoneNumber(), false);
        b.a(parcel, 6, oc1.nz(), false);
        b.H(parcel, j);
    }

    public oc cU(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
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
                int k = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(k))
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, oa.CREATOR);
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
                return new oc(i, s3, latlng, s2, arraylist, s1, s);
            }
        } while (true);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return cU(parcel);
    }

    public oc[] eQ(int i)
    {
        return new oc[i];
    }

    public Object[] newArray(int i)
    {
        return eQ(i);
    }
}
