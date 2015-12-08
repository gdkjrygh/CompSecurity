// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, Cart

public final class <init>
{

    final FullWalletRequest tP;

    public FullWalletRequest build()
    {
        return tP;
    }

    public tP setCart(Cart cart)
    {
        tP.tO = cart;
        return this;
    }

    public tP setGoogleTransactionId(String s)
    {
        tP.tH = s;
        return this;
    }

    public tP setMerchantTransactionId(String s)
    {
        tP.tI = s;
        return this;
    }

    private (FullWalletRequest fullwalletrequest)
    {
        tP = fullwalletrequest;
        super();
    }

    tP(FullWalletRequest fullwalletrequest, tP tp)
    {
        this(fullwalletrequest);
    }
}
