// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            StripeCollectionAPIResource, Card

public class CustomerCardCollection extends StripeCollectionAPIResource
{

    public CustomerCardCollection()
    {
    }

    public CustomerCardCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public CustomerCardCollection all(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (CustomerCardCollection)request(com.stripe.net.APIResource.RequestMethod.GET, s, map, com/stripe/model/CustomerCardCollection, requestoptions);
    }

    public CustomerCardCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public Card create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public Card create(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (Card)request(com.stripe.net.APIResource.RequestMethod.POST, s, map, com/stripe/model/Card, requestoptions);
    }

    public Card create(Map map, String s)
    {
        return create(map, RequestOptions.builder().setApiKey(s).build());
    }

    public Card retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public Card retrieve(String s, RequestOptions requestoptions)
    {
        s = String.format("%s%s/%s", new Object[] {
            Stripe.getApiBase(), getURL(), s
        });
        return (Card)request(com.stripe.net.APIResource.RequestMethod.GET, s, null, com/stripe/model/Card, requestoptions);
    }

    public Card retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }
}
