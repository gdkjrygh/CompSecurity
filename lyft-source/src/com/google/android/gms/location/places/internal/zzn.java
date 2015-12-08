// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlaceLocalization

public class zzn
    implements android.os.Parcelable.Creator
{

    public zzn()
    {
    }

    static void a(PlaceLocalization placelocalization, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, placelocalization.b, false);
        zzb.a(parcel, 1000, placelocalization.a);
        zzb.a(parcel, 2, placelocalization.c, false);
        zzb.a(parcel, 3, placelocalization.d, false);
        zzb.a(parcel, 4, placelocalization.e, false);
        zzb.b(parcel, 5, placelocalization.f, false);
        zzb.a(parcel, i);
    }

    public PlaceLocalization a(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = zza.b(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    s3 = zza.m(parcel, k);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    s = zza.m(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist = zza.A(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlaceLocalization(i, s3, s2, s1, s, arraylist);
            }
        } while (true);
    }

    public PlaceLocalization[] a(int i)
    {
        return new PlaceLocalization[i];
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
