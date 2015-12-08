// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;

public final class jqa
    implements android.os.Parcelable.Creator
{

    public jqa()
    {
    }

    public static void a(InterstitialAdParameterParcel interstitialadparameterparcel, Parcel parcel)
    {
        int i = b.q(parcel, 20293);
        b.c(parcel, 1, interstitialadparameterparcel.a);
        b.a(parcel, 2, interstitialadparameterparcel.b);
        b.a(parcel, 3, interstitialadparameterparcel.c);
        b.r(parcel, i);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        boolean flag1 = false;
        int j = b.b(parcel);
        boolean flag = false;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    b.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = b.e(parcel, k);
                    break;

                case 2: // '\002'
                    flag = b.c(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = b.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new ao((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new InterstitialAdParameterParcel(i, flag, flag1);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new InterstitialAdParameterParcel[i];
    }
}
