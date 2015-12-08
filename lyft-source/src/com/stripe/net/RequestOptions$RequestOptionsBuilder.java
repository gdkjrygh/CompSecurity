// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.net;

import com.stripe.Stripe;

// Referenced classes of package com.stripe.net:
//            RequestOptions

public final class stripeVersion
{

    private String apiKey;
    private String idempotencyKey;
    private String stripeAccount;
    private String stripeVersion;

    public RequestOptions build()
    {
        return new RequestOptions(RequestOptions.access$000(apiKey), RequestOptions.access$100(stripeVersion), RequestOptions.access$200(idempotencyKey), RequestOptions.access$300(stripeAccount), null);
    }

    public stripeAccount clearApiKey()
    {
        apiKey = null;
        return this;
    }

    public apiKey clearIdempotencyKey()
    {
        idempotencyKey = null;
        return this;
    }

    public idempotencyKey clearStripeAccount()
    {
        return setStripeAccount(null);
    }

    public setStripeAccount clearStripeVersion()
    {
        stripeVersion = null;
        return this;
    }

    public String getApiKey()
    {
        return apiKey;
    }

    public String getIdempotencyKey()
    {
        return idempotencyKey;
    }

    public String getStripeAccount()
    {
        return stripeAccount;
    }

    public stripeAccount setApiKey(String s)
    {
        apiKey = RequestOptions.access$000(s);
        return this;
    }

    public apiKey setIdempotencyKey(String s)
    {
        idempotencyKey = s;
        return this;
    }

    public idempotencyKey setStripeAccount(String s)
    {
        stripeAccount = s;
        return this;
    }

    public stripeAccount setStripeVersion(String s)
    {
        stripeVersion = RequestOptions.access$100(s);
        return this;
    }

    public _cls9()
    {
        apiKey = Stripe.apiKey;
        stripeVersion = Stripe.apiVersion;
    }
}
