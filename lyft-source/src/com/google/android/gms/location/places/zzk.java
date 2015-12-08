// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceReport

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void a(PlaceReport placereport, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, placereport.a);
        zzb.a(parcel, 2, placereport.a(), false);
        zzb.a(parcel, 3, placereport.b(), false);
        zzb.a(parcel, 4, placereport.c(), false);
        zzb.a(parcel, i);
    }

    public PlaceReport a(Parcel parcel)
    {
        String s2 = null;
        int j = zza.b(parcel);
        int i = 0;
        String s1 = null;
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
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    s = zza.m(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = zza.m(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = zza.m(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlaceReport(i, s, s1, s2);
            }
        } while (true);
    }

    public PlaceReport[] a(int i)
    {
        return new PlaceReport[i];
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
