// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import com.google.android.gms.internal.hn;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentInitParams

public final class <init>
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

    public aky setAccountName(String s)
    {
        WalletFragmentInitParams.a(aky, s);
        return this;
    }

    public aky setMaskedWallet(MaskedWallet maskedwallet)
    {
        WalletFragmentInitParams.a(aky, maskedwallet);
        return this;
    }

    public aky setMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        WalletFragmentInitParams.a(aky, maskedwalletrequest);
        return this;
    }

    public aky setMaskedWalletRequestCode(int i)
    {
        WalletFragmentInitParams.a(aky, i);
        return this;
    }

    private (WalletFragmentInitParams walletfragmentinitparams)
    {
        aky = walletfragmentinitparams;
        super();
    }

    aky(WalletFragmentInitParams walletfragmentinitparams, aky aky1)
    {
        this(walletfragmentinitparams);
    }
}
