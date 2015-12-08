// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import com.braintreepayments.api.Utils;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.braintreepayments.api.models:
//            PayPalAccount, Metadata, PaymentMethodOptions, PaymentMethod

public class PayPalAccountBuilder
    implements PaymentMethod.Builder
{

    private String authorizationCode;
    private String correlationId;
    private String email;
    private String mIntegration;
    private String mSource;
    private PaymentMethodOptions options;

    public PayPalAccountBuilder()
    {
        mIntegration = "custom";
    }

    public PayPalAccountBuilder authorizationCode(String s)
    {
        authorizationCode = s;
        return this;
    }

    public PayPalAccount build()
    {
        PayPalAccount paypalaccount = new PayPalAccount();
        paypalaccount.setConsentCode(authorizationCode);
        paypalaccount.setCorrelationId(correlationId);
        paypalaccount.setOptions(options);
        paypalaccount.setSource(mSource);
        return paypalaccount;
    }

    public volatile PaymentMethod build()
    {
        return build();
    }

    public PayPalAccountBuilder correlationId(String s)
    {
        correlationId = s;
        return this;
    }

    public PayPalAccountBuilder email(String s)
    {
        email = s;
        return this;
    }

    public PayPalAccount fromJson(String s)
    {
        s = PayPalAccount.fromJson(s);
        s.setEmail(email);
        return s;
    }

    public volatile PaymentMethod fromJson(String s)
    {
        return fromJson(s);
    }

    public String getApiPath()
    {
        return "paypal_accounts";
    }

    public String getApiResource()
    {
        return "paypalAccounts";
    }

    public PayPalAccountBuilder integration(String s)
    {
        mIntegration = s;
        return this;
    }

    public volatile PaymentMethod.Builder integration(String s)
    {
        return integration(s);
    }

    public PayPalAccountBuilder source(String s)
    {
        mSource = s;
        return this;
    }

    public volatile PaymentMethod.Builder source(String s)
    {
        return source(s);
    }

    public Map toJson()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("paypalAccount", build());
        hashmap.put("_meta", new Metadata(mIntegration, mSource));
        return hashmap;
    }

    public String toJsonString()
    {
        return Utils.getGson().a(toJson());
    }

    public PayPalAccountBuilder validate(boolean flag)
    {
        options = new PaymentMethodOptions();
        options.setValidate(flag);
        return this;
    }

    public volatile PaymentMethod.Builder validate(boolean flag)
    {
        return validate(flag);
    }
}
