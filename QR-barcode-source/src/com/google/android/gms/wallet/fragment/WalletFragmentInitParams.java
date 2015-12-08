// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            a

public final class WalletFragmentInitParams
    implements SafeParcelable
{
    public final class Builder
    {

        final WalletFragmentInitParams aul;

        public WalletFragmentInitParams build()
        {
            boolean flag1 = true;
            boolean flag;
            if (WalletFragmentInitParams.a(aul) != null && WalletFragmentInitParams.b(aul) == null || WalletFragmentInitParams.a(aul) == null && WalletFragmentInitParams.b(aul) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Exactly one of MaskedWallet or MaskedWalletRequest is required");
            if (WalletFragmentInitParams.c(aul) >= 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            o.a(flag, "masked wallet request code is required and must be non-negative");
            return aul;
        }

        public Builder setAccountName(String s)
        {
            WalletFragmentInitParams.a(aul, s);
            return this;
        }

        public Builder setMaskedWallet(MaskedWallet maskedwallet)
        {
            WalletFragmentInitParams.a(aul, maskedwallet);
            return this;
        }

        public Builder setMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
        {
            WalletFragmentInitParams.a(aul, maskedwalletrequest);
            return this;
        }

        public Builder setMaskedWalletRequestCode(int i)
        {
            WalletFragmentInitParams.a(aul, i);
            return this;
        }

        private Builder()
        {
            aul = WalletFragmentInitParams.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int BR;
    private String Dd;
    private MaskedWalletRequest atW;
    private MaskedWallet atX;
    private int auk;

    private WalletFragmentInitParams()
    {
        BR = 1;
        auk = -1;
    }

    WalletFragmentInitParams(int i, String s, MaskedWalletRequest maskedwalletrequest, int j, MaskedWallet maskedwallet)
    {
        BR = i;
        Dd = s;
        atW = maskedwalletrequest;
        auk = j;
        atX = maskedwallet;
    }

    static int a(WalletFragmentInitParams walletfragmentinitparams, int i)
    {
        walletfragmentinitparams.auk = i;
        return i;
    }

    static MaskedWallet a(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.atX;
    }

    static MaskedWallet a(WalletFragmentInitParams walletfragmentinitparams, MaskedWallet maskedwallet)
    {
        walletfragmentinitparams.atX = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(WalletFragmentInitParams walletfragmentinitparams, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragmentinitparams.atW = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static String a(WalletFragmentInitParams walletfragmentinitparams, String s)
    {
        walletfragmentinitparams.Dd = s;
        return s;
    }

    static MaskedWalletRequest b(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.atW;
    }

    static int c(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.auk;
    }

    public static Builder newBuilder()
    {
        WalletFragmentInitParams walletfragmentinitparams = new WalletFragmentInitParams();
        walletfragmentinitparams.getClass();
        return walletfragmentinitparams. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return Dd;
    }

    public MaskedWallet getMaskedWallet()
    {
        return atX;
    }

    public MaskedWalletRequest getMaskedWalletRequest()
    {
        return atW;
    }

    public int getMaskedWalletRequestCode()
    {
        return auk;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.fragment.a.a(this, parcel, i);
    }

}
