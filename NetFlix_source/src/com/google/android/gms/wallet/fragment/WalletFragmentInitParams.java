// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fq;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            a

public final class WalletFragmentInitParams
    implements SafeParcelable
{
    public final class Builder
    {

        final WalletFragmentInitParams acQ;

        public WalletFragmentInitParams build()
        {
            boolean flag1 = true;
            boolean flag;
            if (WalletFragmentInitParams.a(acQ) != null && WalletFragmentInitParams.b(acQ) == null || WalletFragmentInitParams.a(acQ) == null && WalletFragmentInitParams.b(acQ) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fq.a(flag, "Exactly one of MaskedWallet or MaskedWalletRequest is required");
            if (WalletFragmentInitParams.c(acQ) >= 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            fq.a(flag, "masked wallet request code is required and must be non-negative");
            return acQ;
        }

        public Builder setAccountName(String s)
        {
            WalletFragmentInitParams.a(acQ, s);
            return this;
        }

        public Builder setMaskedWallet(MaskedWallet maskedwallet)
        {
            WalletFragmentInitParams.a(acQ, maskedwallet);
            return this;
        }

        public Builder setMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
        {
            WalletFragmentInitParams.a(acQ, maskedwalletrequest);
            return this;
        }

        public Builder setMaskedWalletRequestCode(int i)
        {
            WalletFragmentInitParams.a(acQ, i);
            return this;
        }

        private Builder()
        {
            acQ = WalletFragmentInitParams.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    private MaskedWalletRequest acB;
    private int acO;
    private MaskedWallet acP;
    private String wG;
    final int xH;

    private WalletFragmentInitParams()
    {
        xH = 1;
        acO = -1;
    }

    WalletFragmentInitParams(int i, String s, MaskedWalletRequest maskedwalletrequest, int j, MaskedWallet maskedwallet)
    {
        xH = i;
        wG = s;
        acB = maskedwalletrequest;
        acO = j;
        acP = maskedwallet;
    }

    static int a(WalletFragmentInitParams walletfragmentinitparams, int i)
    {
        walletfragmentinitparams.acO = i;
        return i;
    }

    static MaskedWallet a(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.acP;
    }

    static MaskedWallet a(WalletFragmentInitParams walletfragmentinitparams, MaskedWallet maskedwallet)
    {
        walletfragmentinitparams.acP = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(WalletFragmentInitParams walletfragmentinitparams, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragmentinitparams.acB = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static String a(WalletFragmentInitParams walletfragmentinitparams, String s)
    {
        walletfragmentinitparams.wG = s;
        return s;
    }

    static MaskedWalletRequest b(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.acB;
    }

    static int c(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.acO;
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
        return wG;
    }

    public MaskedWallet getMaskedWallet()
    {
        return acP;
    }

    public MaskedWalletRequest getMaskedWalletRequest()
    {
        return acB;
    }

    public int getMaskedWalletRequestCode()
    {
        return acO;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.fragment.a.a(this, parcel, i);
    }

}
