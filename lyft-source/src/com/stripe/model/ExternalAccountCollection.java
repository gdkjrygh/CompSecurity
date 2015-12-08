// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            StripeCollectionAPIResource, ExternalAccount

public class ExternalAccountCollection extends StripeCollectionAPIResource
{

    public ExternalAccountCollection()
    {
    }

    public ExternalAccountCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public ExternalAccountCollection all(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (ExternalAccountCollection)request(com.stripe.net.APIResource.RequestMethod.GET, s, map, com/stripe/model/ExternalAccountCollection, requestoptions);
    }

    public ExternalAccount create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public ExternalAccount create(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (ExternalAccount)request(com.stripe.net.APIResource.RequestMethod.POST, s, map, com/stripe/model/ExternalAccount, requestoptions);
    }

    public ExternalAccount retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public ExternalAccount retrieve(String s, RequestOptions requestoptions)
    {
        s = String.format("%s%s/%s", new Object[] {
            Stripe.getApiBase(), getURL(), s
        });
        return (ExternalAccount)request(com.stripe.net.APIResource.RequestMethod.GET, s, null, com/stripe/model/ExternalAccount, requestoptions);
    }
}
