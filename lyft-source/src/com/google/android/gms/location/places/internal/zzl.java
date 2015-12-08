// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceLikelihoodEntity, PlaceImpl

public class zzl
    implements android.os.Parcelable.Creator
{

    public zzl()
    {
    }

    static void a(PlaceLikelihoodEntity placelikelihoodentity, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, placelikelihoodentity.b, i, false);
        zzb.a(parcel, 1000, placelikelihoodentity.a);
        zzb.a(parcel, 2, placelikelihoodentity.c);
        zzb.a(parcel, j);
    }

    public PlaceLikelihoodEntity a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        PlaceImpl placeimpl = null;
        float f = 0.0F;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = zza.a(parcel);
                switch (zza.a(k))
                {
                default:
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    placeimpl = (PlaceImpl)zza.a(parcel, k, PlaceImpl.CREATOR);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    f = zza.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlaceLikelihoodEntity(i, placeimpl, f);
            }
        } while (true);
    }

    public PlaceLikelihoodEntity[] a(int i)
    {
        return new PlaceLikelihoodEntity[i];
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
