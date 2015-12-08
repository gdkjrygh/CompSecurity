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

    final MaskedWallet avy;

    public MaskedWallet build()
    {
        return avy;
    }

    public avy setBillingAddress(Address address)
    {
        avy.auP = address;
        return this;
    }

    public ddress setBuyerBillingAddress(UserAddress useraddress)
    {
        avy.auS = useraddress;
        return this;
    }

    public ddress setBuyerShippingAddress(UserAddress useraddress)
    {
        avy.auT = useraddress;
        return this;
    }

    public avy setEmail(String s)
    {
        avy.auO = s;
        return this;
    }

    public avy setGoogleTransactionId(String s)
    {
        avy.auL = s;
        return this;
    }

    public avy setInstrumentInfos(InstrumentInfo ainstrumentinfo[])
    {
        avy.auU = ainstrumentinfo;
        return this;
    }

    public avy setLoyaltyWalletObjects(LoyaltyWalletObject aloyaltywalletobject[])
    {
        avy.avw = aloyaltywalletobject;
        return this;
    }

    public avy setMerchantTransactionId(String s)
    {
        avy.auM = s;
        return this;
    }

    public avy setOfferWalletObjects(OfferWalletObject aofferwalletobject[])
    {
        avy.avx = aofferwalletobject;
        return this;
    }

    public avy setPaymentDescriptions(String as[])
    {
        avy.auR = as;
        return this;
    }

    public avy setShippingAddress(Address address)
    {
        avy.auQ = address;
        return this;
    }

    private ddress(MaskedWallet maskedwallet)
    {
        avy = maskedwallet;
        super();
    }

    avy(MaskedWallet maskedwallet, avy avy1)
    {
        this(maskedwallet);
    }
}
