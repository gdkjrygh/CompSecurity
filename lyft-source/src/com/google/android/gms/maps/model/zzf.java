// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            MarkerOptions, LatLng

public class zzf
    implements android.os.Parcelable.Creator
{

    public zzf()
    {
    }

    static void a(MarkerOptions markeroptions, Parcel parcel, int i)
    {
        int j = zzb.a(parcel);
        zzb.a(parcel, 1, markeroptions.a());
        zzb.a(parcel, 2, markeroptions.c(), i, false);
        zzb.a(parcel, 3, markeroptions.d(), false);
        zzb.a(parcel, 4, markeroptions.e(), false);
        zzb.a(parcel, 5, markeroptions.b(), false);
        zzb.a(parcel, 6, markeroptions.f());
        zzb.a(parcel, 7, markeroptions.g());
        zzb.a(parcel, 8, markeroptions.h());
        zzb.a(parcel, 9, markeroptions.i());
        zzb.a(parcel, 10, markeroptions.j());
        zzb.a(parcel, 11, markeroptions.k());
        zzb.a(parcel, 12, markeroptions.l());
        zzb.a(parcel, 13, markeroptions.m());
        zzb.a(parcel, 14, markeroptions.n());
        zzb.a(parcel, j);
    }

    public MarkerOptions a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        LatLng latlng = null;
        String s1 = null;
        String s = null;
        android.os.IBinder ibinder = null;
        float f5 = 0.0F;
        float f4 = 0.0F;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        float f3 = 0.0F;
        float f2 = 0.5F;
        float f1 = 0.0F;
        float f = 1.0F;
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
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)zza.a(parcel, k, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    s1 = zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    s = zza.m(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder = zza.n(parcel, k);
                    break;

                case 6: // '\006'
                    f5 = zza.j(parcel, k);
                    break;

                case 7: // '\007'
                    f4 = zza.j(parcel, k);
                    break;

                case 8: // '\b'
                    flag2 = zza.c(parcel, k);
                    break;

                case 9: // '\t'
                    flag1 = zza.c(parcel, k);
                    break;

                case 10: // '\n'
                    flag = zza.c(parcel, k);
                    break;

                case 11: // '\013'
                    f3 = zza.j(parcel, k);
                    break;

                case 12: // '\f'
                    f2 = zza.j(parcel, k);
                    break;

                case 13: // '\r'
                    f1 = zza.j(parcel, k);
                    break;

                case 14: // '\016'
                    f = zza.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new MarkerOptions(i, latlng, s1, s, ibinder, f5, f4, flag2, flag1, flag, f3, f2, f1, f);
            }
        } while (true);
    }

    public MarkerOptions[] a(int i)
    {
        return new MarkerOptions[i];
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
