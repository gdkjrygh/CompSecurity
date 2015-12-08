// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, Cart

public final class <init>
{

    final FullWalletRequest abs;

    public FullWalletRequest build()
    {
        return abs;
    }

    public abs setCart(Cart cart)
    {
        abs.abr = cart;
        return this;
    }

    public abs setGoogleTransactionId(String s)
    {
        abs.abh = s;
        return this;
    }

    public abs setMerchantTransactionId(String s)
    {
        abs.abi = s;
        return this;
    }

    private (FullWalletRequest fullwalletrequest)
    {
        abs = fullwalletrequest;
        super();
    }

    abs(FullWalletRequest fullwalletrequest, abs abs1)
    {
        this(fullwalletrequest);
    }
}
