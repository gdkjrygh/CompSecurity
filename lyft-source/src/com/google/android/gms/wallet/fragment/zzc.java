// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentStyle

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void a(WalletFragmentStyle walletfragmentstyle, Parcel parcel, int i)
    {
        i = zzb.a(parcel);
        zzb.a(parcel, 1, walletfragmentstyle.a);
        zzb.a(parcel, 2, walletfragmentstyle.b, false);
        zzb.a(parcel, 3, walletfragmentstyle.c);
        zzb.a(parcel, i);
    }

    public WalletFragmentStyle a(Parcel parcel)
    {
        int j = 0;
        int k = zza.b(parcel);
        android.os.Bundle bundle = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = zza.a(parcel);
                switch (zza.a(l))
                {
                default:
                    zza.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = zza.f(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = zza.o(parcel, l);
                    break;

                case 3: // '\003'
                    j = zza.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new WalletFragmentStyle(i, bundle, j);
            }
        } while (true);
    }

    public WalletFragmentStyle[] a(int i)
    {
        return new WalletFragmentStyle[i];
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
