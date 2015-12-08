// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            AutocompleteFilter

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(AutocompleteFilter autocompletefilter, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, autocompletefilter.a());
        zzb.a(parcel, 1000, autocompletefilter.a);
        zzb.a(parcel, 2, autocompletefilter.c, false);
        zzb.a(parcel, i);
    }

    public AutocompleteFilter a(Parcel parcel)
    {
        boolean flag = false;
        int j = zza.b(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
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
                    flag = zza.c(parcel, k);
                    break;

                case 1000: 
                    i = zza.f(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist = zza.z(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new AutocompleteFilter(i, flag, arraylist);
            }
        } while (true);
    }

    public AutocompleteFilter[] a(int i)
    {
        return new AutocompleteFilter[i];
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
