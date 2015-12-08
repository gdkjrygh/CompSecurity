// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentStyle

public class c
    implements android.os.Parcelable.Creator
{

    public c()
    {
    }

    static void a(WalletFragmentStyle walletfragmentstyle, Parcel parcel, int i)
    {
        i = b.p(parcel);
        b.c(parcel, 1, walletfragmentstyle.xH);
        b.a(parcel, 2, walletfragmentstyle.acT, false);
        b.c(parcel, 3, walletfragmentstyle.acU);
        b.F(parcel, i);
    }

    public WalletFragmentStyle bp(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.a.o(parcel);
        android.os.Bundle bundle = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.n(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.R(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.p(parcel, l);
                    break;

                case 3: // '\003'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new WalletFragmentStyle(i, bundle, j);
            }
        } while (true);
    }

    public WalletFragmentStyle[] cC(int i)
    {
        return new WalletFragmentStyle[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return bp(parcel);
    }

    public Object[] newArray(int i)
    {
        return cC(i);
    }
}
