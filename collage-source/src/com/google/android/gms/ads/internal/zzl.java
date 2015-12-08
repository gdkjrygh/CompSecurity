// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.ads.internal:
//            InterstitialAdParameterParcel

public class zzl
    implements android.os.Parcelable.Creator
{

    public zzl()
    {
    }

    static void zza(InterstitialAdParameterParcel interstitialadparameterparcel, Parcel parcel, int i)
    {
        i = b.a(parcel);
        b.a(parcel, 1, interstitialadparameterparcel.versionCode);
        b.a(parcel, 2, interstitialadparameterparcel.zzpk);
        b.a(parcel, 3, interstitialadparameterparcel.zzpl);
        b.a(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zza(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzf(i);
    }

    public InterstitialAdParameterParcel zza(Parcel parcel)
    {
        boolean flag1 = false;
        int j = a.b(parcel);
        boolean flag = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = a.a(parcel);
                switch (a.a(k))
                {
                default:
                    a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = a.d(parcel, k);
                    break;

                case 2: // '\002'
                    flag = a.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new InterstitialAdParameterParcel(i, flag, flag1);
            }
        } while (true);
    }

    public InterstitialAdParameterParcel[] zzf(int i)
    {
        return new InterstitialAdParameterParcel[i];
    }
}
