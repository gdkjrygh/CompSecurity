// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import com.braintreepayments.api.Utils;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.braintreepayments.api.models:
//            Card, Metadata, PaymentMethodOptions, PaymentMethod

public class CardBuilder
    implements PaymentMethod.Builder
{

    private Card.BillingAddress mBillingAddress;
    private Card mCard;
    private String mIntegration;
    private String mSource;

    public CardBuilder()
    {
        mBillingAddress = null;
        mIntegration = "custom";
        mSource = "form";
        mCard = new Card();
        mCard.setSource(mSource);
    }

    private Card.BillingAddress getBillingAddress()
    {
        if (mBillingAddress == null)
        {
            mBillingAddress = new Card.BillingAddress();
            mCard.setBillingAddress(mBillingAddress);
        }
        return mBillingAddress;
    }

    public Card build()
    {
        return mCard;
    }

    public volatile PaymentMethod build()
    {
        return build();
    }

    public CardBuilder cardNumber(String s)
    {
        mCard.setCardNumber(s);
        return this;
    }

    public CardBuilder countryName(String s)
    {
        getBillingAddress().setCountryName(s);
        return this;
    }

    public CardBuilder cvv(String s)
    {
        mCard.setCvv(s);
        return this;
    }

    public CardBuilder expirationDate(String s)
    {
        mCard.setExpirationDate(s);
        return this;
    }

    public CardBuilder expirationMonth(String s)
    {
        mCard.setExpirationMonth(s);
        return this;
    }

    public CardBuilder expirationYear(String s)
    {
        mCard.setExpirationYear(s);
        return this;
    }

    public CardBuilder firstName(String s)
    {
        getBillingAddress().setFirstName(s);
        return this;
    }

    public Card fromJson(String s)
    {
        return Card.fromJson(s);
    }

    public volatile PaymentMethod fromJson(String s)
    {
        return fromJson(s);
    }

    public String getApiPath()
    {
        return "credit_cards";
    }

    public String getApiResource()
    {
        return "creditCards";
    }

    public CardBuilder integration(String s)
    {
        mIntegration = s;
        return this;
    }

    public volatile PaymentMethod.Builder integration(String s)
    {
        return integration(s);
    }

    public CardBuilder lastName(String s)
    {
        getBillingAddress().setLastName(s);
        return this;
    }

    public CardBuilder locality(String s)
    {
        getBillingAddress().setLocality(s);
        return this;
    }

    public CardBuilder postalCode(String s)
    {
        getBillingAddress().setPostalCode(s);
        return this;
    }

    public CardBuilder region(String s)
    {
        getBillingAddress().setRegion(s);
        return this;
    }

    public CardBuilder source(String s)
    {
        mSource = s;
        mCard.setSource(mSource);
        return this;
    }

    public volatile PaymentMethod.Builder source(String s)
    {
        return source(s);
    }

    public CardBuilder streetAddress(String s)
    {
        getBillingAddress().setStreetAddress(s);
        return this;
    }

    public Map toJson()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("creditCard", build());
        hashmap.put("_meta", new Metadata(mIntegration, mSource));
        return hashmap;
    }

    public String toJsonString()
    {
        return Utils.getGson().a(toJson());
    }

    public CardBuilder validate(boolean flag)
    {
        PaymentMethodOptions paymentmethodoptions = new PaymentMethodOptions();
        paymentmethodoptions.setValidate(flag);
        mCard.setOptions(paymentmethodoptions);
        return this;
    }

    public volatile PaymentMethod.Builder validate(boolean flag)
    {
        return validate(flag);
    }
}
