// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            BalanceTransactionCollection

public class BalanceTransaction extends APIResource
{

    Integer amount;
    Long availableOn;
    Long created;
    String currency;
    String description;
    Integer fee;
    List feeDetails;
    String id;
    Integer net;
    String source;
    String status;
    String type;

    public BalanceTransaction()
    {
    }

    public static BalanceTransactionCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static BalanceTransactionCollection all(Map map, RequestOptions requestoptions)
    {
        String s = String.format("%s/%s", new Object[] {
            Stripe.getApiBase(), "v1/balance/history"
        });
        return (BalanceTransactionCollection)request(com.stripe.net.APIResource.RequestMethod.GET, s, map, com/stripe/model/BalanceTransactionCollection, requestoptions);
    }

    public static BalanceTransactionCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static BalanceTransaction retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static BalanceTransaction retrieve(String s, RequestOptions requestoptions)
    {
        s = String.format("%s/%s/%s", new Object[] {
            Stripe.getApiBase(), "v1/balance/history", s
        });
        return (BalanceTransaction)request(com.stripe.net.APIResource.RequestMethod.GET, s, null, com/stripe/model/BalanceTransaction, requestoptions);
    }

    public static BalanceTransaction retrieve(String s, String s1)
    {
        String.format("%s/%s/%s", new Object[] {
            Stripe.getApiBase(), "v1/balance/history", s
        });
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public Integer getAmount()
    {
        return amount;
    }

    public Long getAvailableOn()
    {
        return availableOn;
    }

    public Long getCreated()
    {
        return created;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getDescription()
    {
        return description;
    }

    public Integer getFee()
    {
        return fee;
    }

    public List getFeeDetails()
    {
        return feeDetails;
    }

    public String getId()
    {
        return id;
    }

    public Integer getNet()
    {
        return net;
    }

    public String getSource()
    {
        return source;
    }

    public String getStatus()
    {
        return status;
    }

    public String getType()
    {
        return type;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setAvailableOn(Long long1)
    {
        availableOn = long1;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setFee(Integer integer)
    {
        fee = integer;
    }

    public void setFeeDetails(List list)
    {
        feeDetails = list;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setNet(Integer integer)
    {
        net = integer;
    }

    public void setSource(String s)
    {
        source = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
