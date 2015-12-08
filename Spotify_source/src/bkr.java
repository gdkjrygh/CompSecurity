// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class bkr
    implements android.os.Parcelable.Creator
{

    public bkr()
    {
    }

    public static void a(InterstitialAdParameterParcel interstitialadparameterparcel, Parcel parcel)
    {
        int i = brp.a(parcel, 20293);
        brp.b(parcel, 1, interstitialadparameterparcel.a);
        brp.a(parcel, 2, interstitialadparameterparcel.b);
        brp.a(parcel, 3, interstitialadparameterparcel.c);
        brp.a(parcel, 4, interstitialadparameterparcel.d);
        brp.a(parcel, 5, interstitialadparameterparcel.e);
        brp.a(parcel, 6, interstitialadparameterparcel.f);
        brp.b(parcel, i);
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
                    s = zza.h(parcel, k);
                    break;

                case 5: // '\005'
                    flag = zza.c(parcel, k);
                    break;

                case 6: // '\006'
                    f = zza.g(parcel, k);
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
