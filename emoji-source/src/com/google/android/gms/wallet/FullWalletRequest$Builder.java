// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, Cart

public final class <init>
{

    final FullWalletRequest ajb;

    public FullWalletRequest build()
    {
        return ajb;
    }

    public ajb setCart(Cart cart)
    {
        ajb.aja = cart;
        return this;
    }

    public ajb setGoogleTransactionId(String s)
    {
        ajb.aiQ = s;
        return this;
    }

    public ajb setMerchantTransactionId(String s)
    {
        ajb.aiR = s;
        return this;
    }

    private (FullWalletRequest fullwalletrequest)
    {
        ajb = fullwalletrequest;
        super();
    }

    ajb(FullWalletRequest fullwalletrequest, ajb ajb1)
    {
        this(fullwalletrequest);
    }
}
