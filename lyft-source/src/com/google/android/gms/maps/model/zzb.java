// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.maps.model:
//            CircleOptions, LatLng

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(CircleOptions circleoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, circleoptions.a());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, circleoptions.b(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, circleoptions.c());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 4, circleoptions.d());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 5, circleoptions.e());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 6, circleoptions.f());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 7, circleoptions.g());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 8, circleoptions.h());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, j);
    }

    public CircleOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = zza.b(parcel);
        LatLng latlng = null;
        double d = 0.0D;
        int i = 0;
        int j = 0;
        float f1 = 0.0F;
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
                    k = zza.f(parcel, i1);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)zza.a(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    d = zza.k(parcel, i1);
                    break;

                case 4: // '\004'
                    f1 = zza.j(parcel, i1);
                    break;

                case 5: // '\005'
                    j = zza.f(parcel, i1);
                    break;

                case 6: // '\006'
                    i = zza.f(parcel, i1);
                    break;

                case 7: // '\007'
                    f = zza.j(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = zza.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            } else
            {
                return new CircleOptions(k, latlng, d, f1, j, i, f, flag);
            }
        } while (true);
    }

    public CircleOptions[] a(int i)
    {
        return new CircleOptions[i];
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
