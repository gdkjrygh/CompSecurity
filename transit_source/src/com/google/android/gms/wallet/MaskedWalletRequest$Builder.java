// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;


// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWalletRequest, Cart

public final class <init>
{

    final MaskedWalletRequest ui;

    public MaskedWalletRequest build()
    {
        return ui;
    }

    public ui setCart(Cart cart)
    {
        ui.tO = cart;
        return this;
    }

    public ui setCurrencyCode(String s)
    {
        ui.tE = s;
        return this;
    }

    public ui setEstimatedTotalPrice(String s)
    {
        ui.ue = s;
        return this;
    }

    public ui setIsBillingAgreement(boolean flag)
    {
        ui.uh = flag;
        return this;
    }

    public ui setMerchantName(String s)
    {
        ui.uf = s;
        return this;
    }

    public ui setMerchantTransactionId(String s)
    {
        ui.tI = s;
        return this;
    }

    public ui setPhoneNumberRequired(boolean flag)
    {
        ui.ub = flag;
        return this;
    }

    public ui setShippingAddressRequired(boolean flag)
    {
        ui.uc = flag;
        return this;
    }

    public ui setShouldRetrieveWalletObjects(boolean flag)
    {
        ui.ug = flag;
        return this;
    }

    public ui setUseMinimalBillingAddress(boolean flag)
    {
        ui.ud = flag;
        return this;
    }

    private (MaskedWalletRequest maskedwalletrequest)
    {
        ui = maskedwalletrequest;
        super();
    }

    ui(MaskedWalletRequest maskedwalletrequest, ui ui1)
    {
        this(maskedwalletrequest);
    }
}
