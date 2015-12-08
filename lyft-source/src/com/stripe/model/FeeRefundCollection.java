// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            StripeCollectionAPIResource, FeeRefund

public class FeeRefundCollection extends StripeCollectionAPIResource
{

    public FeeRefundCollection()
    {
    }

    public FeeRefundCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public FeeRefundCollection all(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (FeeRefundCollection)request(com.stripe.net.APIResource.RequestMethod.GET, s, map, com/stripe/model/FeeRefundCollection, requestoptions);
    }

    public FeeRefundCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public FeeRefund create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public FeeRefund create(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (FeeRefund)request(com.stripe.net.APIResource.RequestMethod.POST, s, map, com/stripe/model/FeeRefund, requestoptions);
    }

    public FeeRefund create(Map map, String s)
    {
        return create(map, RequestOptions.builder().setApiKey(s).build());
    }

    public FeeRefund retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public FeeRefund retrieve(String s, RequestOptions requestoptions)
    {
        s = String.format("%s%s/%s", new Object[] {
            Stripe.getApiBase(), getURL(), s
        });
        return (FeeRefund)request(com.stripe.net.APIResource.RequestMethod.GET, s, null, com/stripe/model/FeeRefund, requestoptions);
    }

    public FeeRefund retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }
}
