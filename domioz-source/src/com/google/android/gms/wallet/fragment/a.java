// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentInitParams

public final class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(WalletFragmentInitParams walletfragmentinitparams, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, walletfragmentinitparams.a);
        c.a(parcel, 2, walletfragmentinitparams.a());
        c.a(parcel, 3, walletfragmentinitparams.b(), i);
        c.a(parcel, 4, walletfragmentinitparams.c());
        c.a(parcel, 5, walletfragmentinitparams.d(), i);
        c.a(parcel, j);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        MaskedWallet maskedwallet = null;
        int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
        int j = 0;
        int i = -1;
        MaskedWalletRequest maskedwalletrequest = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 3: // '\003'
                    maskedwalletrequest = (MaskedWalletRequest)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, MaskedWalletRequest.CREATOR);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 5: // '\005'
                    maskedwallet = (MaskedWallet)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, MaskedWallet.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new b((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new WalletFragmentInitParams(j, s, maskedwalletrequest, i, maskedwallet);
            }
        } while (true);
    }

    public final Object[] newArray(int i)
    {
        return new WalletFragmentInitParams[i];
    }
}
