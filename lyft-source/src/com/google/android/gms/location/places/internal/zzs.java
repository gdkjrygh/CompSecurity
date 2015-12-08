// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams

public class zzs
    implements android.os.Parcelable.Creator
{

    public zzs()
    {
    }

    static void a(PlacesParams placesparams, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, placesparams.c, false);
        zzb.a(parcel, 1000, placesparams.b);
        zzb.a(parcel, 2, placesparams.d, false);
        zzb.a(parcel, 3, placesparams.e, false);
        zzb.a(parcel, 4, placesparams.f, false);
        zzb.a(parcel, 5, placesparams.g, false);
        zzb.a(parcel, 6, placesparams.h);
        zzb.a(parcel, i);
    }

    public PlacesParams a(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = zza.b(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        int j = 0;
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

                case 1: // '\001'
                    s4 = zza.m(parcel, l);
                    break;

                case 1000: 
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    s3 = zza.m(parcel, l);
                    break;

                case 3: // '\003'
                    s2 = zza.m(parcel, l);
                    break;

                case 4: // '\004'
                    s1 = zza.m(parcel, l);
                    break;

                case 5: // '\005'
                    s = zza.m(parcel, l);
                    break;

                case 6: // '\006'
                    i = zza.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PlacesParams(j, s4, s3, s2, s1, s, i);
            }
        } while (true);
    }

    public PlacesParams[] a(int i)
    {
        return new PlacesParams[i];
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
