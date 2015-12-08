// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            a

public final class WalletFragmentInitParams
    implements SafeParcelable
{
    public final class Builder
    {

        final WalletFragmentInitParams awv;

        public WalletFragmentInitParams build()
        {
            boolean flag1 = true;
            boolean flag;
            if (WalletFragmentInitParams.a(awv) != null && WalletFragmentInitParams.b(awv) == null || WalletFragmentInitParams.a(awv) == null && WalletFragmentInitParams.b(awv) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Exactly one of MaskedWallet or MaskedWalletRequest is required");
            if (WalletFragmentInitParams.c(awv) >= 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            jx.a(flag, "masked wallet request code is required and must be non-negative");
            return awv;
        }

        public Builder setAccountName(String s)
        {
            WalletFragmentInitParams.a(awv, s);
            return this;
        }

        public Builder setMaskedWallet(MaskedWallet maskedwallet)
        {
            WalletFragmentInitParams.a(awv, maskedwallet);
            return this;
        }

        public Builder setMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
        {
            WalletFragmentInitParams.a(awv, maskedwalletrequest);
            return this;
        }

        public Builder setMaskedWalletRequestCode(int i)
        {
            WalletFragmentInitParams.a(awv, i);
            return this;
        }

        private Builder()
        {
            awv = WalletFragmentInitParams.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    final int CK;
    private String DZ;
    private MaskedWalletRequest awg;
    private MaskedWallet awh;
    private int awu;

    private WalletFragmentInitParams()
    {
        CK = 1;
        awu = -1;
    }

    WalletFragmentInitParams(int i, String s, MaskedWalletRequest maskedwalletrequest, int j, MaskedWallet maskedwallet)
    {
        CK = i;
        DZ = s;
        awg = maskedwalletrequest;
        awu = j;
        awh = maskedwallet;
    }

    static int a(WalletFragmentInitParams walletfragmentinitparams, int i)
    {
        walletfragmentinitparams.awu = i;
        return i;
    }

    static MaskedWallet a(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.awh;
    }

    static MaskedWallet a(WalletFragmentInitParams walletfragmentinitparams, MaskedWallet maskedwallet)
    {
        walletfragmentinitparams.awh = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(WalletFragmentInitParams walletfragmentinitparams, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragmentinitparams.awg = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static String a(WalletFragmentInitParams walletfragmentinitparams, String s)
    {
        walletfragmentinitparams.DZ = s;
        return s;
    }

    static MaskedWalletRequest b(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.awg;
    }

    static int c(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.awu;
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
        return DZ;
    }

    public MaskedWallet getMaskedWallet()
    {
        return awh;
    }

    public MaskedWalletRequest getMaskedWalletRequest()
    {
        return awg;
    }

    public int getMaskedWalletRequestCode()
    {
        return awu;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.fragment.a.a(this, parcel, i);
    }

}
