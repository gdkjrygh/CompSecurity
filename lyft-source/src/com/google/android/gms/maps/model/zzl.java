// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaOrientation

public class zzl
    implements android.os.Parcelable.Creator
{

    public zzl()
    {
    }

    static void a(StreetViewPanoramaOrientation streetviewpanoramaorientation, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, streetviewpanoramaorientation.a());
        zzb.a(parcel, 2, streetviewpanoramaorientation.a);
        zzb.a(parcel, 3, streetviewpanoramaorientation.b);
        zzb.a(parcel, i);
    }

    public StreetViewPanoramaOrientation a(Parcel parcel)
    {
        float f1 = 0.0F;
        int j = zza.b(parcel);
        int i = 0;
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
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    f = zza.j(parcel, k);
                    break;

                case 3: // '\003'
                    f1 = zza.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOrientation(i, f, f1);
            }
        } while (true);
    }

    public StreetViewPanoramaOrientation[] a(int i)
    {
        return new StreetViewPanoramaOrientation[i];
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
