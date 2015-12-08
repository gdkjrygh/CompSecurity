// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            FullWalletRequest, Cart

public final class <init>
{

    final FullWalletRequest auW;

    public FullWalletRequest build()
    {
        return auW;
    }

    public auW setCart(Cart cart)
    {
        auW.auV = cart;
        return this;
    }

    public auW setGoogleTransactionId(String s)
    {
        auW.auL = s;
        return this;
    }

    public auW setMerchantTransactionId(String s)
    {
        auW.auM = s;
        return this;
    }

    private (FullWalletRequest fullwalletrequest)
    {
        auW = fullwalletrequest;
        super();
    }

    auW(FullWalletRequest fullwalletrequest, auW auw)
    {
        this(fullwalletrequest);
    }
}
