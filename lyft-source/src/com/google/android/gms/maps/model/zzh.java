// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolylineOptions, LatLng

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void a(PolylineOptions polylineoptions, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, polylineoptions.a());
        zzb.c(parcel, 2, polylineoptions.b(), false);
        zzb.a(parcel, 3, polylineoptions.c());
        zzb.a(parcel, 4, polylineoptions.d());
        zzb.a(parcel, 5, polylineoptions.e());
        zzb.a(parcel, 6, polylineoptions.f());
        zzb.a(parcel, 7, polylineoptions.g());
        zzb.a(parcel, i);
    }

    public PolylineOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int k = zza.b(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        int i = 0;
        float f1 = 0.0F;
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
                    j = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    arraylist = zza.c(parcel, l, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f1 = zza.j(parcel, l);
                    break;

                case 4: // '\004'
                    i = zza.f(parcel, l);
                    break;

                case 5: // '\005'
                    f = zza.j(parcel, l);
                    break;

                case 6: // '\006'
                    flag1 = zza.c(parcel, l);
                    break;

                case 7: // '\007'
                    flag = zza.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new PolylineOptions(j, arraylist, f1, i, f, flag1, flag);
            }
        } while (true);
    }

    public PolylineOptions[] a(int i)
    {
        return new PolylineOptions[i];
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
