// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.ads.internal:
//            InterstitialAdParameterParcel

public final class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(InterstitialAdParameterParcel interstitialadparameterparcel, Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.a(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, 1, interstitialadparameterparcel.a);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 2, interstitialadparameterparcel.b);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 3, interstitialadparameterparcel.c);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 4, interstitialadparameterparcel.d);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 5, interstitialadparameterparcel.e);
        com.google.android.gms.common.internal.safeparcel.a.a(parcel, 6, interstitialadparameterparcel.f);
        com.google.android.gms.common.internal.safeparcel.a.b(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int j = zza.a(parcel);
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
                    zza.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = zza.e(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = zza.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = zza.c(parcel, k);
                    break;

                case 4: // '\004'
                    s = zza.l(parcel, k);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, k);
                    break;

                case 6: // '\006'
                    f = zza.i(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new InterstitialAdParameterParcel(i, flag2, flag1, s, flag, f);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new InterstitialAdParameterParcel[i];
    }
}
