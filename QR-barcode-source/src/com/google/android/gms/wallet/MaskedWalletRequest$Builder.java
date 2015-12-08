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

    final MaskedWalletRequest atA;

    public fication addAllowedCountrySpecificationForShipping(CountrySpecification countryspecification)
    {
        if (atA.atz == null)
        {
            atA.atz = new ArrayList();
        }
        atA.atz.add(countryspecification);
        return this;
    }

    public atA addAllowedCountrySpecificationsForShipping(Collection collection)
    {
        if (collection != null)
        {
            if (atA.atz == null)
            {
                atA.atz = new ArrayList();
            }
            atA.atz.addAll(collection);
        }
        return this;
    }

    public MaskedWalletRequest build()
    {
        return atA;
    }

    public atA setAllowDebitCard(boolean flag)
    {
        atA.aty = flag;
        return this;
    }

    public atA setAllowPrepaidCard(boolean flag)
    {
        atA.atx = flag;
        return this;
    }

    public atA setCart(Cart cart)
    {
        atA.asL = cart;
        return this;
    }

    public atA setCurrencyCode(String s)
    {
        atA.asw = s;
        return this;
    }

    public atA setEstimatedTotalPrice(String s)
    {
        atA.ats = s;
        return this;
    }

    public atA setIsBillingAgreement(boolean flag)
    {
        atA.atv = flag;
        return this;
    }

    public atA setMerchantName(String s)
    {
        atA.att = s;
        return this;
    }

    public atA setMerchantTransactionId(String s)
    {
        atA.asC = s;
        return this;
    }

    public atA setPhoneNumberRequired(boolean flag)
    {
        atA.atp = flag;
        return this;
    }

    public atA setShippingAddressRequired(boolean flag)
    {
        atA.atq = flag;
        return this;
    }

    public atA setShouldRetrieveWalletObjects(boolean flag)
    {
        atA.atu = flag;
        return this;
    }

    public atA setUseMinimalBillingAddress(boolean flag)
    {
        atA.atr = flag;
        return this;
    }

    private fication(MaskedWalletRequest maskedwalletrequest)
    {
        atA = maskedwalletrequest;
        super();
    }

    atA(MaskedWalletRequest maskedwalletrequest, atA ata)
    {
        this(maskedwalletrequest);
    }
}
