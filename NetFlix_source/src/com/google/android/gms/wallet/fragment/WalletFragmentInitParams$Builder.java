// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import com.google.android.gms.internal.fq;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentInitParams

public final class <init>
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

    public acQ setAccountName(String s)
    {
        WalletFragmentInitParams.a(acQ, s);
        return this;
    }

    public acQ setMaskedWallet(MaskedWallet maskedwallet)
    {
        WalletFragmentInitParams.a(acQ, maskedwallet);
        return this;
    }

    public acQ setMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        WalletFragmentInitParams.a(acQ, maskedwalletrequest);
        return this;
    }

    public acQ setMaskedWalletRequestCode(int i)
    {
        WalletFragmentInitParams.a(acQ, i);
        return this;
    }

    private (WalletFragmentInitParams walletfragmentinitparams)
    {
        acQ = walletfragmentinitparams;
        super();
    }

    acQ(WalletFragmentInitParams walletfragmentinitparams, acQ acq)
    {
        this(walletfragmentinitparams);
    }
}
