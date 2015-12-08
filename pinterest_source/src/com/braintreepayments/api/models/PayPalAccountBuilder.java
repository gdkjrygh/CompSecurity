// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.braintreepayments.api.models:
//            PayPalAccount, Metadata, PaymentMethodOptions, PaymentMethod

public class PayPalAccountBuilder
    implements PaymentMethod.Builder
{

    private String a;
    private String b;
    private String c;
    private PaymentMethodOptions d;
    private String e;
    private String f;

    public PayPalAccountBuilder()
    {
        e = "custom";
    }

    private PayPalAccount a()
    {
        PayPalAccount paypalaccount = new PayPalAccount();
        paypalaccount.b(b);
        paypalaccount.c(c);
        paypalaccount.a(d);
        paypalaccount.f(f);
        return paypalaccount;
    }

    public final PayPalAccountBuilder a(String s)
    {
        a = s;
        return this;
    }

    public final PayPalAccountBuilder b(String s)
    {
        b = s;
        return this;
    }

    public PaymentMethod build()
    {
        return a();
    }

    public final PayPalAccountBuilder c(String s)
    {
        c = s;
        return this;
    }

    public final PayPalAccountBuilder d(String s)
    {
        f = s;
        return this;
    }

    public PaymentMethod fromJson(String s)
    {
        s = PayPalAccount.d(s);
        s.a(a);
        return s;
    }

    public String getApiPath()
    {
        return "paypal_accounts";
    }

    public String getApiResource()
    {
        return "paypalAccounts";
    }

    public volatile PaymentMethod.Builder integration(String s)
    {
        e = s;
        return this;
    }

    public volatile PaymentMethod.Builder source(String s)
    {
        f = s;
        return this;
    }

    public Map toJson()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("paypalAccount", a());
        hashmap.put("_meta", new Metadata(e, f));
        return hashmap;
    }

    public String toJsonString()
    {
        return (new Gson()).toJson(toJson());
    }

    public PaymentMethod.Builder validate(boolean flag)
    {
        d = new PaymentMethodOptions();
        d.a(flag);
        return this;
    }
}
