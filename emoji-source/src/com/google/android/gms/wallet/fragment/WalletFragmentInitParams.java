// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hm;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            a

public final class WalletFragmentInitParams
    implements SafeParcelable
{
    public final class Builder
    {

        final WalletFragmentInitParams akB;

        public WalletFragmentInitParams build()
        {
            boolean flag1 = true;
            boolean flag;
            if (WalletFragmentInitParams.a(akB) != null && WalletFragmentInitParams.b(akB) == null || WalletFragmentInitParams.a(akB) == null && WalletFragmentInitParams.b(akB) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hm.a(flag, "Exactly one of MaskedWallet or MaskedWalletRequest is required");
            if (WalletFragmentInitParams.c(akB) >= 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            hm.a(flag, "masked wallet request code is required and must be non-negative");
            return akB;
        }

        public Builder setAccountName(String s)
        {
            WalletFragmentInitParams.a(akB, s);
            return this;
        }

        public Builder setMaskedWallet(MaskedWallet maskedwallet)
        {
            WalletFragmentInitParams.a(akB, maskedwallet);
            return this;
        }

        public Builder setMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
        {
            WalletFragmentInitParams.a(akB, maskedwalletrequest);
            return this;
        }

        public Builder setMaskedWalletRequestCode(int i)
        {
            WalletFragmentInitParams.a(akB, i);
            return this;
        }

        private Builder()
        {
            akB = WalletFragmentInitParams.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    private int akA;
    private MaskedWalletRequest akm;
    private MaskedWallet akn;
    final int xM;
    private String yQ;

    private WalletFragmentInitParams()
    {
        xM = 1;
        akA = -1;
    }

    WalletFragmentInitParams(int i, String s, MaskedWalletRequest maskedwalletrequest, int j, MaskedWallet maskedwallet)
    {
        xM = i;
        yQ = s;
        akm = maskedwalletrequest;
        akA = j;
        akn = maskedwallet;
    }

    static int a(WalletFragmentInitParams walletfragmentinitparams, int i)
    {
        walletfragmentinitparams.akA = i;
        return i;
    }

    static MaskedWallet a(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.akn;
    }

    static MaskedWallet a(WalletFragmentInitParams walletfragmentinitparams, MaskedWallet maskedwallet)
    {
        walletfragmentinitparams.akn = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest a(WalletFragmentInitParams walletfragmentinitparams, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragmentinitparams.akm = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static String a(WalletFragmentInitParams walletfragmentinitparams, String s)
    {
        walletfragmentinitparams.yQ = s;
        return s;
    }

    static MaskedWalletRequest b(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.akm;
    }

    static int c(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.akA;
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
        return yQ;
    }

    public MaskedWallet getMaskedWallet()
    {
        return akn;
    }

    public MaskedWalletRequest getMaskedWalletRequest()
    {
        return akm;
    }

    public int getMaskedWalletRequestCode()
    {
        return akA;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.fragment.a.a(this, parcel, i);
    }

}
