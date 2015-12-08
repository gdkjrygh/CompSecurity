// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model:
//            StreetViewPanoramaLink

public class zzj
    implements android.os.Parcelable.Creator
{

    public zzj()
    {
    }

    static void a(StreetViewPanoramaLink streetviewpanoramalink, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, streetviewpanoramalink.a());
        zzb.a(parcel, 2, streetviewpanoramalink.a, false);
        zzb.a(parcel, 3, streetviewpanoramalink.b);
        zzb.a(parcel, i);
    }

    public StreetViewPanoramaLink a(Parcel parcel)
    {
        int j = zza.b(parcel);
        int i = 0;
        String s = null;
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
                    s = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    f = zza.j(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaLink(i, s, f);
            }
        } while (true);
    }

    public StreetViewPanoramaLink[] a(int i)
    {
        return new StreetViewPanoramaLink[i];
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
