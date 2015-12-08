// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            StripeCollectionAPIResource, Subscription

public class CustomerSubscriptionCollection extends StripeCollectionAPIResource
{

    public CustomerSubscriptionCollection()
    {
    }

    public CustomerSubscriptionCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public CustomerSubscriptionCollection all(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (CustomerSubscriptionCollection)request(com.stripe.net.APIResource.RequestMethod.GET, s, map, com/stripe/model/CustomerSubscriptionCollection, requestoptions);
    }

    public CustomerSubscriptionCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public Subscription create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public Subscription create(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (Subscription)request(com.stripe.net.APIResource.RequestMethod.POST, s, map, com/stripe/model/Subscription, requestoptions);
    }

    public Subscription create(Map map, String s)
    {
        return create(map, RequestOptions.builder().setApiKey(s).build());
    }

    public Subscription retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public Subscription retrieve(String s, RequestOptions requestoptions)
    {
        s = String.format("%s%s/%s", new Object[] {
            Stripe.getApiBase(), getURL(), s
        });
        return (Subscription)request(com.stripe.net.APIResource.RequestMethod.GET, s, null, com/stripe/model/Subscription, requestoptions);
    }

    public Subscription retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }
}
