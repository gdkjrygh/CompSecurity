// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaCamera

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void a(StreetViewPanoramaCamera streetviewpanoramacamera, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, streetviewpanoramacamera.a());
        zzb.a(parcel, 2, streetviewpanoramacamera.a);
        zzb.a(parcel, 3, streetviewpanoramacamera.b);
        zzb.a(parcel, 4, streetviewpanoramacamera.c);
        zzb.a(parcel, i);
    }

    public StreetViewPanoramaCamera a(Parcel parcel)
    {
        float f2 = 0.0F;
        int j = zza.b(parcel);
        float f = 0.0F;
        int i = 0;
        float f1 = 0.0F;
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
                    f = zza.j(parcel, k);
                    break;

                case 3: // '\003'
                    f1 = zza.j(parcel, k);
                    break;

                case 4: // '\004'
                    f2 = zza.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaCamera(i, f, f1, f2);
            }
        } while (true);
    }

    public StreetViewPanoramaCamera[] a(int i)
    {
        return new StreetViewPanoramaCamera[i];
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
