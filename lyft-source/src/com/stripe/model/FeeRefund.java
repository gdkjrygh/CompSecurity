// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            MetadataStore, ApplicationFee

public class FeeRefund extends APIResource
    implements MetadataStore
{

    Integer amount;
    String balanceTransaction;
    Long created;
    String currency;
    String fee;
    String id;
    Map metadata;

    public FeeRefund()
    {
    }

    public Integer getAmount()
    {
        return amount;
    }

    public String getBalanceTransaction()
    {
        return balanceTransaction;
    }

    public Long getCreated()
    {
        return created;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getFee()
    {
        return fee;
    }

    public String getId()
    {
        return id;
    }

    public String getInstanceURL()
    {
        if (fee != null)
        {
            return String.format("%s/%s/refunds/%s", new Object[] {
                classURL(com/stripe/model/ApplicationFee), fee, getId()
            });
        } else
        {
            return null;
        }
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setBalanceTransaction(String s)
    {
        balanceTransaction = s;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setFee(String s)
    {
        fee = s;
    }

    public void setMetadata(Map map)
    {
        metadata = map;
    }

    public FeeRefund update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public FeeRefund update(Map map, RequestOptions requestoptions)
    {
        return (FeeRefund)request(com.stripe.net.APIResource.RequestMethod.POST, getInstanceURL(), map, com/stripe/model/FeeRefund, requestoptions);
    }

    public FeeRefund update(Map map, String s)
    {
        return update(map, RequestOptions.builder().setApiKey(s).build());
    }

    public volatile MetadataStore update(Map map)
    {
        return update(map);
    }

    public volatile MetadataStore update(Map map, RequestOptions requestoptions)
    {
        return update(map, requestoptions);
    }
}
