// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            MetadataStore, Charge

public class Refund extends APIResource
    implements MetadataStore
{

    Integer amount;
    String balanceTransaction;
    String charge;
    Long created;
    String currency;
    String id;
    Map metadata;

    public Refund()
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

    public String getCharge()
    {
        return charge;
    }

    public Long getCreated()
    {
        return created;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getId()
    {
        return id;
    }

    public String getInstanceURL()
    {
        if (charge != null)
        {
            return String.format("%s/%s/refunds/%s", new Object[] {
                classURL(com/stripe/model/Charge), charge, getId()
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

    public void setCharge(String s)
    {
        charge = s;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setMetadata(Map map)
    {
        metadata = map;
    }

    public volatile MetadataStore update(Map map)
    {
        return update(map);
    }

    public volatile MetadataStore update(Map map, RequestOptions requestoptions)
    {
        return update(map, requestoptions);
    }

    public Refund update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public Refund update(Map map, RequestOptions requestoptions)
    {
        return (Refund)request(com.stripe.net.APIResource.RequestMethod.POST, getInstanceURL(), map, com/stripe/model/Refund, requestoptions);
    }

    public Refund update(Map map, String s)
    {
        return update(map, RequestOptions.builder().setApiKey(s).build());
    }
}
