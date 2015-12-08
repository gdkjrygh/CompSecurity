// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            NearbyAlertRequest, PlaceFilter, NearbyAlertFilter

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void a(NearbyAlertRequest nearbyalertrequest, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, nearbyalertrequest.b());
        zzb.a(parcel, 1000, nearbyalertrequest.a());
        zzb.a(parcel, 2, nearbyalertrequest.c());
        zzb.a(parcel, 3, nearbyalertrequest.d(), i, false);
        zzb.a(parcel, 4, nearbyalertrequest.e(), i, false);
        zzb.a(parcel, j);
    }

    public NearbyAlertRequest a(Parcel parcel)
    {
        NearbyAlertFilter nearbyalertfilter = null;
        int j = 0;
        int l = zza.b(parcel);
        int i = -1;
        PlaceFilter placefilter = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = zza.a(parcel);
                switch (zza.a(i1))
                {
                default:
                    zza.b(parcel, i1);
                    break;

                case 1: // '\001'
                    j = zza.f(parcel, i1);
                    break;

                case 1000: 
                    k = zza.f(parcel, i1);
                    break;

                case 2: // '\002'
                    i = zza.f(parcel, i1);
                    break;

                case 3: // '\003'
                    placefilter = (PlaceFilter)zza.a(parcel, i1, PlaceFilter.CREATOR);
                    break;

                case 4: // '\004'
                    nearbyalertfilter = (NearbyAlertFilter)zza.a(parcel, i1, NearbyAlertFilter.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new NearbyAlertRequest(k, j, i, placefilter, nearbyalertfilter);
            }
        } while (true);
    }

    public NearbyAlertRequest[] a(int i)
    {
        return new NearbyAlertRequest[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
