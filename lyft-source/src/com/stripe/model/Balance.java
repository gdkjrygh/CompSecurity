// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.List;

public class Balance extends APIResource
{

    List available;
    Boolean livemode;
    List pending;

    public Balance()
    {
    }

    public static Balance retrieve()
    {
        return retrieve((RequestOptions)null);
    }

    public static Balance retrieve(RequestOptions requestoptions)
    {
        return (Balance)request(com.stripe.net.APIResource.RequestMethod.GET, singleClassURL(com/stripe/model/Balance), null, com/stripe/model/Balance, requestoptions);
    }

    public static Balance retrieve(String s)
    {
        return retrieve(RequestOptions.builder().setApiKey(s).build());
    }

    public List getAvailable()
    {
        return available;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public List getPending()
    {
        return pending;
    }
}
