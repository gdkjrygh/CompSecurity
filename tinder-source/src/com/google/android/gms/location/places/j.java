// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

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
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, nearbyalertrequest.b);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1000, nearbyalertrequest.a);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 2, nearbyalertrequest.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, com.google.android.gms.location.places.NearbyAlertRequest.a(), i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, nearbyalertrequest.d, i);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, nearbyalertrequest.e);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 6, nearbyalertrequest.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        NearbyAlertFilter nearbyalertfilter = null;
        int i = 0;
        int j1 = zza.a(parcel);
        int k = -1;
        boolean flag = false;
        PlaceFilter placefilter = null;
        int l = 0;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    zza.b(parcel, k1);
                    break;

                case 1: // '\001'
                    l = zza.e(parcel, k1);
                    break;

                case 1000: 
                    i1 = zza.e(parcel, k1);
                    break;

                case 2: // '\002'
                    k = zza.e(parcel, k1);
                    break;

                case 3: // '\003'
                    placefilter = (PlaceFilter)zza.a(parcel, k1, PlaceFilter.CREATOR);
                    break;

                case 4: // '\004'
                    nearbyalertfilter = (NearbyAlertFilter)zza.a(parcel, k1, NearbyAlertFilter.CREATOR);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, k1);
                    break;

                case 6: // '\006'
                    i = zza.e(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new NearbyAlertRequest(i1, l, k, placefilter, nearbyalertfilter, flag, i);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new NearbyAlertRequest[i];
    }
}
