// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWallet, Address, InstrumentInfo, LoyaltyWalletObject, 
//            OfferWalletObject

public final class <init>
{

    final MaskedWallet ato;

    public MaskedWallet build()
    {
        return ato;
    }

    public ato setBillingAddress(Address address)
    {
        ato.asF = address;
        return this;
    }

    public ddress setBuyerBillingAddress(UserAddress useraddress)
    {
        ato.asI = useraddress;
        return this;
    }

    public ddress setBuyerShippingAddress(UserAddress useraddress)
    {
        ato.asJ = useraddress;
        return this;
    }

    public ato setEmail(String s)
    {
        ato.asE = s;
        return this;
    }

    public ato setGoogleTransactionId(String s)
    {
        ato.asB = s;
        return this;
    }

    public ato setInstrumentInfos(InstrumentInfo ainstrumentinfo[])
    {
        ato.asK = ainstrumentinfo;
        return this;
    }

    public ato setLoyaltyWalletObjects(LoyaltyWalletObject aloyaltywalletobject[])
    {
        ato.atm = aloyaltywalletobject;
        return this;
    }

    public ato setMerchantTransactionId(String s)
    {
        ato.asC = s;
        return this;
    }

    public ato setOfferWalletObjects(OfferWalletObject aofferwalletobject[])
    {
        ato.atn = aofferwalletobject;
        return this;
    }

    public ato setPaymentDescriptions(String as[])
    {
        ato.asH = as;
        return this;
    }

    public ato setShippingAddress(Address address)
    {
        ato.asG = address;
        return this;
    }

    private ddress(MaskedWallet maskedwallet)
    {
        ato = maskedwallet;
        super();
    }

    ato(MaskedWallet maskedwallet, ato ato1)
    {
        this(maskedwallet);
    }
}
