// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, Cart

public final class <init>
{

    final FullWalletRequest asM;

    public FullWalletRequest build()
    {
        return asM;
    }

    public asM setCart(Cart cart)
    {
        asM.asL = cart;
        return this;
    }

    public asM setGoogleTransactionId(String s)
    {
        asM.asB = s;
        return this;
    }

    public asM setMerchantTransactionId(String s)
    {
        asM.asC = s;
        return this;
    }

    private (FullWalletRequest fullwalletrequest)
    {
        asM = fullwalletrequest;
        super();
    }

    asM(FullWalletRequest fullwalletrequest, asM asm)
    {
        this(fullwalletrequest);
    }
}
