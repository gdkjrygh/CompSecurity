// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            StripeCollectionAPIResource

public class InvoiceLineItemCollection extends StripeCollectionAPIResource
{

    public InvoiceLineItemCollection()
    {
    }

    public InvoiceLineItemCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public InvoiceLineItemCollection all(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s%s", new Object[] {
            Stripe.getApiBase(), getURL()
        });
        return (InvoiceLineItemCollection)request(com.stripe.net.APIResource.RequestMethod.GET, s, map, com/stripe/model/InvoiceLineItemCollection, requestoptions);
    }

    public InvoiceLineItemCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }
}
