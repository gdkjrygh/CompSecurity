// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hn;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            a

public final class WalletFragmentInitParams
    implements SafeParcelable
{
    public final class Builder
    {

        final WalletFragmentInitParams aky;

        public WalletFragmentInitParams build()
        {
            boolean flag1 = true;
            boolean flag;
            if (WalletFragmentInitParams.a(aky) != null && WalletFragmentInitParams.b(aky) == null || WalletFragmentInitParams.a(aky) == null && WalletFragmentInitParams.b(aky) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hn.a(flag, "Exactly one of MaskedWallet or MaskedWalletRequest is required");
            if (WalletFragmentInitParams.c(aky) >= 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            hn.a(flag, "masked wallet request code is required and must be non-negative");
            return aky;
        }

        public Builder setAccountName(String s)
        {
            WalletFragmentInitParams.a(aky, s);
            return this;
        }

        public Builder setMaskedWallet(MaskedWallet maskedwallet)
        {
            WalletFragmentInitParams.a(aky, maskedwallet);
            return this;
        }

        public Builder setMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
        {
            WalletFragmentInitParams.a(aky, maskedwalletrequest);
            return this;
        }

        public Builder setMaskedWalletRequestCode(int i)
        {
            WalletFragmentInitParams.a(aky, i);
            return this;
        }

        private Builder()
        {
            aky = WalletFragmentInitParams.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    private MaskedWalletRequest akj;
    private MaskedWallet akk;
    private int akx;
    final int xJ;
    private String yN;

    private WalletFragmentInitParams()
    {
        xJ = 1;
        akx = -1;
    }

    WalletFragmentInitParams(int i, String s, MaskedWalletRequest maskedwalletrequest, int j, MaskedWallet maskedwallet)
    {
        xJ = i;
        yN = s;
        akj = maskedwalletrequest;
        akx = j;
        akk = maskedwallet;
    }

    static int a(WalletFragmentInitParams walletfragmentinitparams, int i)
    {
        walletfragmentinitparams.akx = i;
        return i;
    }

    static MaskedWallet a(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.akk;
    }

    static MaskedWallet a(WalletFragmentInitParams walletfragmentinitparams, MaskedWallet maskedwallet)
    {
        walletfragmentinitparams.akk = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(WalletFragmentInitParams walletfragmentinitparams, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragmentinitparams.akj = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static String a(WalletFragmentInitParams walletfragmentinitparams, String s)
    {
        walletfragmentinitparams.yN = s;
        return s;
    }

    static MaskedWalletRequest b(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.akj;
    }

    static int c(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.akx;
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
        return yN;
    }

    public MaskedWallet getMaskedWallet()
    {
        return akk;
    }

    public MaskedWalletRequest getMaskedWalletRequest()
    {
        return akj;
    }

    public int getMaskedWalletRequestCode()
    {
        return akx;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.fragment.a.a(this, parcel, i);
    }

}
