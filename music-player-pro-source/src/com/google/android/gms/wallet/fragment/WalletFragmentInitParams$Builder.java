// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.fragment;

import com.google.android.gms.internal.jx;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            WalletFragmentInitParams

public final class <init>
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

    public awv setAccountName(String s)
    {
        WalletFragmentInitParams.a(awv, s);
        return this;
    }

    public awv setMaskedWallet(MaskedWallet maskedwallet)
    {
        WalletFragmentInitParams.a(awv, maskedwallet);
        return this;
    }

    public awv setMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
    {
        WalletFragmentInitParams.a(awv, maskedwalletrequest);
        return this;
    }

    public awv setMaskedWalletRequestCode(int i)
    {
        WalletFragmentInitParams.a(awv, i);
        return this;
    }

    private (WalletFragmentInitParams walletfragmentinitparams)
    {
        awv = walletfragmentinitparams;
        super();
    }

    awv(WalletFragmentInitParams walletfragmentinitparams, awv awv1)
    {
        this(walletfragmentinitparams);
    }
}
