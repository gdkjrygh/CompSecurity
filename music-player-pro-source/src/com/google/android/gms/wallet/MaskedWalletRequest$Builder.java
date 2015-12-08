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

    final MaskedWalletRequest avK;

    public fication addAllowedCountrySpecificationForShipping(CountrySpecification countryspecification)
    {
        if (avK.avJ == null)
        {
            avK.avJ = new ArrayList();
        }
        avK.avJ.add(countryspecification);
        return this;
    }

    public avK addAllowedCountrySpecificationsForShipping(Collection collection)
    {
        if (collection != null)
        {
            if (avK.avJ == null)
            {
                avK.avJ = new ArrayList();
            }
            avK.avJ.addAll(collection);
        }
        return this;
    }

    public MaskedWalletRequest build()
    {
        return avK;
    }

    public avK setAllowDebitCard(boolean flag)
    {
        avK.avI = flag;
        return this;
    }

    public avK setAllowPrepaidCard(boolean flag)
    {
        avK.avH = flag;
        return this;
    }

    public avK setCart(Cart cart)
    {
        avK.auV = cart;
        return this;
    }

    public avK setCurrencyCode(String s)
    {
        avK.auG = s;
        return this;
    }

    public avK setEstimatedTotalPrice(String s)
    {
        avK.avC = s;
        return this;
    }

    public avK setIsBillingAgreement(boolean flag)
    {
        avK.avF = flag;
        return this;
    }

    public avK setMerchantName(String s)
    {
        avK.avD = s;
        return this;
    }

    public avK setMerchantTransactionId(String s)
    {
        avK.auM = s;
        return this;
    }

    public avK setPhoneNumberRequired(boolean flag)
    {
        avK.avz = flag;
        return this;
    }

    public avK setShippingAddressRequired(boolean flag)
    {
        avK.avA = flag;
        return this;
    }

    public avK setShouldRetrieveWalletObjects(boolean flag)
    {
        avK.avE = flag;
        return this;
    }

    public avK setUseMinimalBillingAddress(boolean flag)
    {
        avK.avB = flag;
        return this;
    }

    private fication(MaskedWalletRequest maskedwalletrequest)
    {
        avK = maskedwalletrequest;
        super();
    }

    avK(MaskedWalletRequest maskedwalletrequest, avK avk)
    {
        this(maskedwalletrequest);
    }
}
