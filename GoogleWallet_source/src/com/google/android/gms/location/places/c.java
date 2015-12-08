// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places:
//            NearbyAlertRequest, PlaceFilter

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(NearbyAlertRequest nearbyalertrequest, Parcel parcel, int i)
    {
        int j = b.bU(parcel);
        b.c(parcel, 1, nearbyalertrequest.getTransitionTypes());
        b.c(parcel, 1000, nearbyalertrequest.getVersionCode());
        b.c(parcel, 2, nearbyalertrequest.getLoiteringTimeMillis());
        b.a(parcel, 3, nearbyalertrequest.getFilter(), i, false);
        b.J(parcel, j);
    }

    public static NearbyAlertRequest fM(Parcel parcel)
    {
        int j = 0;
        int l = com.google.android.gms.common.internal.safeparcel.a.bT(parcel);
        int k = -1;
        PlaceFilter placefilter = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.bS(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.dk(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    placefilter = (PlaceFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, PlaceFilter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new NearbyAlertRequest(i, j, k, placefilter);
            }
        } while (true);
    }

    private static NearbyAlertRequest[] _mthif(int i)
    {
        return new NearbyAlertRequest[i];
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return fM(parcel);
    }

    public final Object[] newArray(int i)
    {
        return _mthif(i);
    }
}
