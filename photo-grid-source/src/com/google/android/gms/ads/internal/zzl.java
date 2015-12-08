// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.ads.internal:
//            InterstitialAdParameterParcel

public class zzl
    implements android.os.Parcelable.Creator
{

    public zzl()
    {
    }

    static void a(InterstitialAdParameterParcel interstitialadparameterparcel, Parcel parcel)
    {
        int i = c.a(parcel);
        c.a(parcel, 1, interstitialadparameterparcel.versionCode);
        c.a(parcel, 2, interstitialadparameterparcel.zzpt);
        c.a(parcel, 3, interstitialadparameterparcel.zzpu);
        c.a(parcel, 4, interstitialadparameterparcel.zzpv, false);
        c.a(parcel, 5, interstitialadparameterparcel.zzpw);
        c.a(parcel, 6, interstitialadparameterparcel.zzpx);
        c.a(parcel, i);
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
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        String s = null;
        float f = 0.0F;
        boolean flag1 = false;
        boolean flag2 = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.d(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.a.j(parcel, k);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;

                case 6: // '\006'
                    f = com.google.android.gms.common.internal.safeparcel.a.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new InterstitialAdParameterParcel(i, flag2, flag1, s, flag, f);
            }
        } while (true);
    }

    public InterstitialAdParameterParcel[] zzf(int i)
    {
        return new InterstitialAdParameterParcel[i];
    }
}
