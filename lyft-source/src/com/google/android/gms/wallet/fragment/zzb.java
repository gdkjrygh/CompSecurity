// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentOptions, WalletFragmentStyle

public class zzb
    implements android.os.Parcelable.Creator
{

    public zzb()
    {
    }

    static void a(WalletFragmentOptions walletfragmentoptions, Parcel parcel, int i)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zzb.a(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 1, walletfragmentoptions.a);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 2, walletfragmentoptions.a());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 3, walletfragmentoptions.b());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 4, walletfragmentoptions.c(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, 5, walletfragmentoptions.d());
        com.google.android.gms.common.internal.safeparcel.zzb.a(parcel, j);
    }

    public WalletFragmentOptions a(Parcel parcel)
    {
        int i = 1;
        int j = 0;
        int i1 = zza.b(parcel);
        WalletFragmentStyle walletfragmentstyle = null;
        int k = 1;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = zza.a(parcel);
                switch (zza.a(j1))
                {
                default:
                    zza.b(parcel, j1);
                    break;

                case 1: // '\001'
                    l = zza.f(parcel, j1);
                    break;

                case 2: // '\002'
                    k = zza.f(parcel, j1);
                    break;

                case 3: // '\003'
                    j = zza.f(parcel, j1);
                    break;

                case 4: // '\004'
                    walletfragmentstyle = (WalletFragmentStyle)zza.a(parcel, j1, WalletFragmentStyle.CREATOR);
                    break;

                case 5: // '\005'
                    i = zza.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            } else
            {
                return new WalletFragmentOptions(l, k, j, walletfragmentstyle, i);
            }
        } while (true);
    }

    public WalletFragmentOptions[] a(int i)
    {
        return new WalletFragmentOptions[i];
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
