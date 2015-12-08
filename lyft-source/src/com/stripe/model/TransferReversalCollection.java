// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            StripeCollectionAPIResource, Reversal

public class TransferReversalCollection extends StripeCollectionAPIResource
{

    public TransferReversalCollection()
    {
    }

    public TransferReversalCollection all(Map map)
    {
        return all(map, null);
    }

    public TransferReversalCollection all(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (TransferReversalCollection)request(com.stripe.net.APIResource.RequestMethod.GET, s, map, com/stripe/model/TransferReversalCollection, requestoptions);
    }

    public Reversal create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public Reversal create(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (Reversal)request(com.stripe.net.APIResource.RequestMethod.POST, s, map, com/stripe/model/Reversal, requestoptions);
    }

    public Reversal retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public Reversal retrieve(String s, RequestOptions requestoptions)
    {
        s = String.format("%s%s/%s", new Object[] {
            Stripe.getApiBase(), getURL(), s
        });
        return (Reversal)request(com.stripe.net.APIResource.RequestMethod.GET, s, null, com/stripe/model/Reversal, requestoptions);
    }

    public Reversal retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }
}
