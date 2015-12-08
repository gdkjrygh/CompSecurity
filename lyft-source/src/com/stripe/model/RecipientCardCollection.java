// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            StripeCollectionAPIResource, Card

public class RecipientCardCollection extends StripeCollectionAPIResource
{

    public RecipientCardCollection()
    {
    }

    public RecipientCardCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public RecipientCardCollection all(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (RecipientCardCollection)request(com.stripe.net.APIResource.RequestMethod.GET, s, map, com/stripe/model/RecipientCardCollection, requestoptions);
    }

    public RecipientCardCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public RecipientCardCollection create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public RecipientCardCollection create(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (RecipientCardCollection)request(com.stripe.net.APIResource.RequestMethod.POST, s, map, com/stripe/model/RecipientCardCollection, requestoptions);
    }

    public RecipientCardCollection create(Map map, String s)
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
