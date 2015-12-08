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

    final MaskedWallet ajB;

    public MaskedWallet build()
    {
        return ajB;
    }

    public ajB setBillingAddress(Address address)
    {
        ajB.aiR = address;
        return this;
    }

    public ddress setBuyerBillingAddress(UserAddress useraddress)
    {
        ajB.aiU = useraddress;
        return this;
    }

    public ddress setBuyerShippingAddress(UserAddress useraddress)
    {
        ajB.aiV = useraddress;
        return this;
    }

    public ajB setEmail(String s)
    {
        ajB.aiQ = s;
        return this;
    }

    public ajB setGoogleTransactionId(String s)
    {
        ajB.aiN = s;
        return this;
    }

    public ajB setInstrumentInfos(InstrumentInfo ainstrumentinfo[])
    {
        ajB.aiW = ainstrumentinfo;
        return this;
    }

    public ajB setLoyaltyWalletObjects(LoyaltyWalletObject aloyaltywalletobject[])
    {
        ajB.ajz = aloyaltywalletobject;
        return this;
    }

    public ajB setMerchantTransactionId(String s)
    {
        ajB.aiO = s;
        return this;
    }

    public ajB setOfferWalletObjects(OfferWalletObject aofferwalletobject[])
    {
        ajB.ajA = aofferwalletobject;
        return this;
    }

    public ajB setPaymentDescriptions(String as[])
    {
        ajB.aiT = as;
        return this;
    }

    public ajB setShippingAddress(Address address)
    {
        ajB.aiS = address;
        return this;
    }

    private ddress(MaskedWallet maskedwallet)
    {
        ajB = maskedwallet;
        super();
    }

    ajB(MaskedWallet maskedwallet, ajB ajb)
    {
        this(maskedwallet);
    }
}
