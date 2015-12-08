// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            AutocompletePredictionEntity

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void a(AutocompletePredictionEntity autocompletepredictionentity, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, autocompletepredictionentity.b, false);
        zzb.a(parcel, 1000, autocompletepredictionentity.a);
        zzb.a(parcel, 2, autocompletepredictionentity.c, false);
        zzb.a(parcel, 3, autocompletepredictionentity.d, false);
        zzb.c(parcel, 4, autocompletepredictionentity.e, false);
        zzb.a(parcel, 5, autocompletepredictionentity.f);
        zzb.a(parcel, i);
    }

    public AutocompletePredictionEntity a(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int k = com.google.android.gms.common.internal.safeparcel.zza.b(parcel);
        java.util.ArrayList arraylist1 = null;
        String s = null;
        String s1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.zza.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.m(parcel, l);
                    break;

                case 3: // '\003'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.z(parcel, l);
                    break;

                case 4: // '\004'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.c(parcel, l, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;

                case 5: // '\005'
                    i = com.google.android.gms.common.internal.safeparcel.zza.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new AutocompletePredictionEntity(j, s1, s, arraylist1, arraylist, i);
            }
        } while (true);
    }

    public AutocompletePredictionEntity[] a(int i)
    {
        return new AutocompletePredictionEntity[i];
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
