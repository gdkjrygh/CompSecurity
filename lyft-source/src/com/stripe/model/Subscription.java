// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            MetadataStore, Discount, Customer, Plan

public class Subscription extends APIResource
    implements MetadataStore
{

    Double applicationFeePercent;
    Boolean cancelAtPeriodEnd;
    Long canceledAt;
    Long currentPeriodEnd;
    Long currentPeriodStart;
    String customer;
    Discount discount;
    Long endedAt;
    String id;
    Map metadata;
    Plan plan;
    Integer quantity;
    Long start;
    String status;
    Double taxPercent;
    Long trialEnd;
    Long trialStart;

    public Subscription()
    {
    }

    public Subscription cancel(Map map)
    {
        return cancel(map, (RequestOptions)null);
    }

    public Subscription cancel(Map map, RequestOptions requestoptions)
    {
        return (Subscription)request(com.stripe.net.APIResource.RequestMethod.DELETE, getInstanceURL(), map, com/stripe/model/Subscription, requestoptions);
    }

    public Subscription cancel(Map map, String s)
    {
        return cancel(map, RequestOptions.builder().setApiKey(s).build());
    }

    public void deleteDiscount()
    {
        deleteDiscount((RequestOptions)null);
    }

    public void deleteDiscount(RequestOptions requestoptions)
    {
        request(com.stripe.net.APIResource.RequestMethod.DELETE, String.format("%s/discount", new Object[] {
            getInstanceURL()
        }), null, com/stripe/model/Discount, requestoptions);
    }

    public void deleteDiscount(String s)
    {
        RequestOptions requestoptions = null;
        if (s != null)
        {
            requestoptions = RequestOptions.builder().setApiKey(s).build();
        }
        deleteDiscount(requestoptions);
    }

    public Double getApplicationFeePercent()
    {
        return applicationFeePercent;
    }

    public Boolean getCancelAtPeriodEnd()
    {
        return cancelAtPeriodEnd;
    }

    public Long getCanceledAt()
    {
        return canceledAt;
    }

    public Long getCurrentPeriodEnd()
    {
        return currentPeriodEnd;
    }

    public Long getCurrentPeriodStart()
    {
        return currentPeriodStart;
    }

    public String getCustomer()
    {
        return customer;
    }

    public Discount getDiscount()
    {
        return discount;
    }

    public Long getEndedAt()
    {
        return endedAt;
    }

    public String getId()
    {
        return id;
    }

    public String getInstanceURL()
    {
        return String.format("%s/%s/subscriptions/%s", new Object[] {
            classURL(com/stripe/model/Customer), getCustomer(), getId()
        });
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public Plan getPlan()
    {
        return plan;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public Long getStart()
    {
        return start;
    }

    public String getStatus()
    {
        return status;
    }

    public Double getTaxPercent()
    {
        return taxPercent;
    }

    public Long getTrialEnd()
    {
        return trialEnd;
    }

    public Long getTrialStart()
    {
        return trialStart;
    }

    public void setApplicationFeePercent(Double double1)
    {
        applicationFeePercent = double1;
    }

    public void setCancelAtPeriodEnd(Boolean boolean1)
    {
        cancelAtPeriodEnd = boolean1;
    }

    public void setCanceledAt(Long long1)
    {
        canceledAt = long1;
    }

    public void setCurrentPeriodEnd(Long long1)
    {
        currentPeriodEnd = long1;
    }

    public void setCurrentPeriodStart(Long long1)
    {
        currentPeriodStart = long1;
    }

    public void setCustomer(String s)
    {
        customer = s;
    }

    public void setDiscount(Discount discount1)
    {
        discount = discount1;
    }

    public void setEndedAt(Long long1)
    {
        endedAt = long1;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setMetadata(Map map)
    {
        metadata = map;
    }

    public void setPlan(Plan plan1)
    {
        plan = plan1;
    }

    public void setQuantity(Integer integer)
    {
        quantity = integer;
    }

    public void setStart(Long long1)
    {
        start = long1;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setTaxPercent(Double double1)
    {
        taxPercent = double1;
    }

    public void setTrialEnd(Long long1)
    {
        trialEnd = long1;
    }

    public void setTrialStart(Long long1)
    {
        trialStart = long1;
    }

    public volatile MetadataStore update(Map map)
    {
        return update(map);
    }

    public volatile MetadataStore update(Map map, RequestOptions requestoptions)
    {
        return update(map, requestoptions);
    }

    public Subscription update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public Subscription update(Map map, RequestOptions requestoptions)
    {
        return (Subscription)request(com.stripe.net.APIResource.RequestMethod.POST, getInstanceURL(), map, com/stripe/model/Subscription, requestoptions);
    }

    public Subscription update(Map map, String s)
    {
        return update(map, RequestOptions.builder().setApiKey(s).build());
    }
}
