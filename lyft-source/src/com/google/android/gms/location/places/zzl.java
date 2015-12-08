// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceRequest, PlaceFilter

public class zzl
    implements android.os.Parcelable.Creator
{

    public zzl()
    {
    }

    static void a(PlaceRequest placerequest, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1000, placerequest.b);
        zzb.a(parcel, 2, placerequest.a(), i, false);
        zzb.a(parcel, 3, placerequest.b());
        zzb.a(parcel, 4, placerequest.c());
        zzb.a(parcel, 5, placerequest.d());
        zzb.a(parcel, j);
    }

    public PlaceRequest a(Parcel parcel)
    {
        int k = zza.b(parcel);
        int j = 0;
        PlaceFilter placefilter = null;
        long l2 = PlaceRequest.a;
        int i = 102;
        long l1 = 0x7fffffffffffffffL;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1000: 
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    placefilter = (PlaceFilter)zza.a(parcel, l, PlaceFilter.CREATOR);
                    break;

                case 3: // '\003'
                    l2 = zza.h(parcel, l);
                    break;

                case 4: // '\004'
                    i = zza.f(parcel, l);
                    break;

                case 5: // '\005'
                    l1 = zza.h(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PlaceRequest(j, placefilter, l2, i, l1);
            }
        } while (true);
    }

    public PlaceRequest[] a(int i)
    {
        return new PlaceRequest[i];
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
