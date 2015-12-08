// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.location.places:
//            UserAddedPlace, PlaceType

public final class k
    implements android.os.Parcelable.Creator
{

    public k()
    {
    }

    static void a(UserAddedPlace useraddedplace, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.a(parcel, 1, useraddedplace.getName(), false);
        b.c(parcel, 1000, useraddedplace.mVersionCode);
        b.a(parcel, 2, useraddedplace.getLatLng(), i, false);
        b.a(parcel, 3, useraddedplace.getAddress(), false);
        b.d(parcel, 4, useraddedplace.getTypes(), false);
        b.a(parcel, 5, useraddedplace.getPhoneNumber(), false);
        b.a(parcel, 6, useraddedplace.getWebsiteUri(), false);
        b.J(parcel, j);
    }

    private static UserAddedPlace fT(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
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
                int l = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, PlaceType.CREATOR);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UserAddedPlace(i, s3, latlng, s2, arraylist, s1, s);
            }
        } while (true);
    }

    private static UserAddedPlace[] io(int i)
    {
        return new UserAddedPlace[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fT(parcel);
    }

    public final Object[] newArray(int i)
    {
        return io(i);
    }
}
