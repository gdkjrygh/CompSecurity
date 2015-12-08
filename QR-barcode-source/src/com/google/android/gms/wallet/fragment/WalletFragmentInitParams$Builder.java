// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import com.google.android.gms.common.internal.o;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentInitParams

public final class <init>
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

    public aul setAccountName(String s)
    {
        WalletFragmentInitParams.a(aul, s);
        return this;
    }

    public aul setMaskedWallet(MaskedWallet maskedwallet)
    {
        WalletFragmentInitParams.a(aul, maskedwallet);
        return this;
    }

    public aul setMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        WalletFragmentInitParams.a(aul, maskedwalletrequest);
        return this;
    }

    public aul setMaskedWalletRequestCode(int i)
    {
        WalletFragmentInitParams.a(aul, i);
        return this;
    }

    private (WalletFragmentInitParams walletfragmentinitparams)
    {
        aul = walletfragmentinitparams;
        super();
    }

    aul(WalletFragmentInitParams walletfragmentinitparams, aul aul1)
    {
        this(walletfragmentinitparams);
    }
}
