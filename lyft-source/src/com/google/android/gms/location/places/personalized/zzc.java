// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            PlaceAlias

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(PlaceAlias placealias, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, placealias.a(), false);
        zzb.a(parcel, 1000, placealias.c);
        zzb.a(parcel, i);
    }

    public PlaceAlias a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        String s = null;
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
                    s = zza.m(parcel, k);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlaceAlias(i, s);
            }
        } while (true);
    }

    public PlaceAlias[] a(int i)
    {
        return new PlaceAlias[i];
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
