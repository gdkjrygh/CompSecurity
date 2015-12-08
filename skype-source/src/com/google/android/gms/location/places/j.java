// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.location.places:
//            NearbyAlertRequest, PlaceFilter, NearbyAlertFilter

public final class j
    implements android.os.Parcelable.Creator
{

    public j()
    {
    }

    static void a(NearbyAlertRequest nearbyalertrequest, Parcel parcel, int i)
    {
        int k = b.a(parcel);
        b.a(parcel, 1, nearbyalertrequest.b());
        b.a(parcel, 1000, nearbyalertrequest.a());
        b.a(parcel, 2, nearbyalertrequest.c());
        b.a(parcel, 3, nearbyalertrequest.d(), i);
        b.a(parcel, 4, nearbyalertrequest.e(), i);
        b.a(parcel, 5, nearbyalertrequest.f());
        b.a(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        NearbyAlertFilter nearbyalertfilter = null;
        boolean flag = false;
        int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int i = -1;
        PlaceFilter placefilter = null;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 3: // '\003'
                    placefilter = (PlaceFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, PlaceFilter.CREATOR);
                    break;

                case 4: // '\004'
                    nearbyalertfilter = (NearbyAlertFilter)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, NearbyAlertFilter.CREATOR);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new NearbyAlertRequest(l, k, i, placefilter, nearbyalertfilter, flag);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new NearbyAlertRequest[i];
    }
}
