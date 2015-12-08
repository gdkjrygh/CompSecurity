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

    final MaskedWalletRequest ajN;

    public fication addAllowedCountrySpecificationForShipping(CountrySpecification countryspecification)
    {
        if (ajN.ajM == null)
        {
            ajN.ajM = new ArrayList();
        }
        ajN.ajM.add(countryspecification);
        return this;
    }

    public ajN addAllowedCountrySpecificationsForShipping(Collection collection)
    {
        if (collection != null)
        {
            if (ajN.ajM == null)
            {
                ajN.ajM = new ArrayList();
            }
            ajN.ajM.addAll(collection);
        }
        return this;
    }

    public MaskedWalletRequest build()
    {
        return ajN;
    }

    public ajN setAllowDebitCard(boolean flag)
    {
        ajN.ajL = flag;
        return this;
    }

    public ajN setAllowPrepaidCard(boolean flag)
    {
        ajN.ajK = flag;
        return this;
    }

    public ajN setCart(Cart cart)
    {
        ajN.aiX = cart;
        return this;
    }

    public ajN setCurrencyCode(String s)
    {
        ajN.aiI = s;
        return this;
    }

    public ajN setEstimatedTotalPrice(String s)
    {
        ajN.ajF = s;
        return this;
    }

    public ajN setIsBillingAgreement(boolean flag)
    {
        ajN.ajI = flag;
        return this;
    }

    public ajN setMerchantName(String s)
    {
        ajN.ajG = s;
        return this;
    }

    public ajN setMerchantTransactionId(String s)
    {
        ajN.aiO = s;
        return this;
    }

    public ajN setPhoneNumberRequired(boolean flag)
    {
        ajN.ajC = flag;
        return this;
    }

    public ajN setShippingAddressRequired(boolean flag)
    {
        ajN.ajD = flag;
        return this;
    }

    public ajN setShouldRetrieveWalletObjects(boolean flag)
    {
        ajN.ajH = flag;
        return this;
    }

    public ajN setUseMinimalBillingAddress(boolean flag)
    {
        ajN.ajE = flag;
        return this;
    }

    private fication(MaskedWalletRequest maskedwalletrequest)
    {
        ajN = maskedwalletrequest;
        super();
    }

    ajN(MaskedWalletRequest maskedwalletrequest, ajN ajn)
    {
        this(maskedwalletrequest);
    }
}
