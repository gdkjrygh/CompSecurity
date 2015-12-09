// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.wallet:
//            MaskedWalletRequest, Cart

public final class <init>
{

    final MaskedWalletRequest acg;

    public fication addAllowedCountrySpecificationForShipping(CountrySpecification countryspecification)
    {
        if (acg.acf == null)
        {
            acg.acf = new ArrayList();
        }
        acg.acf.add(countryspecification);
        return this;
    }

    public acg addAllowedCountrySpecificationsForShipping(Collection collection)
    {
        if (collection != null)
        {
            if (acg.acf == null)
            {
                acg.acf = new ArrayList();
            }
            acg.acf.addAll(collection);
        }
        return this;
    }

    public MaskedWalletRequest build()
    {
        return acg;
    }

    public acg setAllowDebitCard(boolean flag)
    {
        acg.ace = flag;
        return this;
    }

    public acg setAllowPrepaidCard(boolean flag)
    {
        acg.acd = flag;
        return this;
    }

    public acg setCart(Cart cart)
    {
        acg.abr = cart;
        return this;
    }

    public acg setCurrencyCode(String s)
    {
        acg.abd = s;
        return this;
    }

    public acg setEstimatedTotalPrice(String s)
    {
        acg.abY = s;
        return this;
    }

    public acg setIsBillingAgreement(boolean flag)
    {
        acg.acb = flag;
        return this;
    }

    public acg setMerchantName(String s)
    {
        acg.abZ = s;
        return this;
    }

    public acg setMerchantTransactionId(String s)
    {
        acg.abi = s;
        return this;
    }

    public acg setPhoneNumberRequired(boolean flag)
    {
        acg.abV = flag;
        return this;
    }

    public acg setShippingAddressRequired(boolean flag)
    {
        acg.abW = flag;
        return this;
    }

    public acg setShouldRetrieveWalletObjects(boolean flag)
    {
        acg.aca = flag;
        return this;
    }

    public acg setUseMinimalBillingAddress(boolean flag)
    {
        acg.abX = flag;
        return this;
    }

    private fication(MaskedWalletRequest maskedwalletrequest)
    {
        acg = maskedwalletrequest;
        super();
    }

    acg(MaskedWalletRequest maskedwalletrequest, acg acg1)
    {
        this(maskedwalletrequest);
    }
}
