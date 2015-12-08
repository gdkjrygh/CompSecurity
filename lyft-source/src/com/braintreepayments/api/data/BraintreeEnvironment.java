// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.data;


public final class BraintreeEnvironment extends Enum
{

    private static final BraintreeEnvironment $VALUES[];
    private static final String BRAINTREE_MERCHANT_ID = "600000";
    public static final BraintreeEnvironment PRODUCTION;
    public static final BraintreeEnvironment QA;
    public static final BraintreeEnvironment SANDBOX;
    private final String mUrl;

    private BraintreeEnvironment(String s, int i, String s1)
    {
        super(s, i);
        mUrl = s1;
    }

    public static BraintreeEnvironment valueOf(String s)
    {
        return (BraintreeEnvironment)Enum.valueOf(com/braintreepayments/api/data/BraintreeEnvironment, s);
    }

    public static BraintreeEnvironment[] values()
    {
        return (BraintreeEnvironment[])$VALUES.clone();
    }

    public String getCollectorUrl()
    {
        return mUrl;
    }

    public String getMerchantId()
    {
        return "600000";
    }

    static 
    {
        QA = new BraintreeEnvironment("QA", 0, "https://assets.qa.braintreegateway.com/data/logo.htm");
        SANDBOX = new BraintreeEnvironment("SANDBOX", 1, "https://assets.braintreegateway.com/sandbox/data/logo.htm");
        PRODUCTION = new BraintreeEnvironment("PRODUCTION", 2, "https://assets.braintreegateway.com/data/logo.htm");
        $VALUES = (new BraintreeEnvironment[] {
            QA, SANDBOX, PRODUCTION
        });
    }
}
