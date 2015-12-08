// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.braintreepayments.api.models:
//            Card, Metadata, PaymentMethodOptions, PaymentMethod

public class CardBuilder
    implements PaymentMethod.Builder
{

    private Card a;
    private Card.BillingAddress b;
    private String c;
    private String d;

    public CardBuilder()
    {
        b = null;
        c = "custom";
        d = "form";
        a = new Card();
        a.f(d);
    }

    private Card.BillingAddress a()
    {
        if (b == null)
        {
            b = new Card.BillingAddress();
            a.a(b);
        }
        return b;
    }

    public final CardBuilder a(String s)
    {
        a.c(s);
        return this;
    }

    public final CardBuilder b(String s)
    {
        a.d(s);
        return this;
    }

    public volatile PaymentMethod build()
    {
        return a;
    }

    public final CardBuilder c(String s)
    {
        a.a(s);
        return this;
    }

    public final CardBuilder d(String s)
    {
        a.b(s);
        return this;
    }

    public final CardBuilder e(String s)
    {
        a().a(s);
        return this;
    }

    public final CardBuilder f(String s)
    {
        a().b(s);
        return this;
    }

    public PaymentMethod fromJson(String s)
    {
        return Card.e(s);
    }

    public final CardBuilder g(String s)
    {
        a().c(s);
        return this;
    }

    public String getApiPath()
    {
        return "credit_cards";
    }

    public String getApiResource()
    {
        return "creditCards";
    }

    public final CardBuilder h(String s)
    {
        a().d(s);
        return this;
    }

    public final CardBuilder i(String s)
    {
        a().e(s);
        return this;
    }

    public volatile PaymentMethod.Builder integration(String s)
    {
        c = s;
        return this;
    }

    public final CardBuilder j(String s)
    {
        a().f(s);
        return this;
    }

    public final CardBuilder k(String s)
    {
        c = s;
        return this;
    }

    public PaymentMethod.Builder source(String s)
    {
        d = s;
        a.f(d);
        return this;
    }

    public Map toJson()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("creditCard", a);
        hashmap.put("_meta", new Metadata(c, d));
        return hashmap;
    }

    public String toJsonString()
    {
        return (new Gson()).toJson(toJson());
    }

    public PaymentMethod.Builder validate(boolean flag)
    {
        PaymentMethodOptions paymentmethodoptions = new PaymentMethodOptions();
        paymentmethodoptions.a(flag);
        a.a(paymentmethodoptions);
        return this;
    }
}
