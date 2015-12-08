// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentInitParams

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(WalletFragmentInitParams walletfragmentinitparams, Parcel parcel, int i)
    {
        int j = b.H(parcel);
        b.c(parcel, 1, walletfragmentinitparams.CK);
        b.a(parcel, 2, walletfragmentinitparams.getAccountName(), false);
        b.a(parcel, 3, walletfragmentinitparams.getMaskedWalletRequest(), i, false);
        b.c(parcel, 4, walletfragmentinitparams.getMaskedWalletRequestCode());
        b.a(parcel, 5, walletfragmentinitparams.getMaskedWallet(), i, false);
        b.H(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return dZ(parcel);
    }

    public WalletFragmentInitParams dZ(Parcel parcel)
    {
        MaskedWallet maskedwallet = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.G(parcel);
        int j = 0;
        int i = -1;
        MaskedWalletRequest maskedwalletrequest = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.F(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.aH(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.o(parcel, l);
                    break;

                case 3: // '\003'
                    maskedwalletrequest = (MaskedWalletRequest)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, MaskedWalletRequest.CREATOR);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, l);
                    break;

                case 5: // '\005'
                    maskedwallet = (MaskedWallet)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, MaskedWallet.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.a((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            } else
            {
                return new WalletFragmentInitParams(j, s, maskedwalletrequest, i, maskedwallet);
            }
        } while (true);
    }

    public WalletFragmentInitParams[] gh(int i)
    {
        return new WalletFragmentInitParams[i];
    }

    public Object[] newArray(int i)
    {
        return gh(i);
    }
}
