// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            MetadataStore, PlanCollection, DeletedPlan

public class Plan extends APIResource
    implements MetadataStore
{

    Integer amount;
    String currency;
    String id;
    String interval;
    Integer intervalCount;
    Boolean livemode;
    Map metadata;
    String name;
    String statementDescription;
    String statementDescriptor;
    Integer trialPeriodDays;

    public Plan()
    {
    }

    public static PlanCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static PlanCollection all(Map map, RequestOptions requestoptions)
    {
        return (PlanCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Plan), map, com/stripe/model/PlanCollection, requestoptions);
    }

    public static PlanCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Plan create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public static Plan create(Map map, RequestOptions requestoptions)
    {
        return (Plan)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Plan), map, com/stripe/model/Plan, requestoptions);
    }

    public static Plan create(Map map, String s)
    {
        return create(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Plan retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static Plan retrieve(String s, RequestOptions requestoptions)
    {
        return (Plan)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Plan, s), null, com/stripe/model/Plan, requestoptions);
    }

    public static Plan retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public DeletedPlan delete()
    {
        return delete((RequestOptions)null);
    }

    public DeletedPlan delete(RequestOptions requestoptions)
    {
        return (DeletedPlan)request(com.stripe.net.APIResource.RequestMethod.DELETE, instanceURL(com/stripe/model/Plan, id), null, com/stripe/model/DeletedPlan, requestoptions);
    }

    public DeletedPlan delete(String s)
    {
        return delete(RequestOptions.builder().setApiKey(s).build());
    }

    public Integer getAmount()
    {
        return amount;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getId()
    {
        return id;
    }

    public String getInterval()
    {
        return interval;
    }

    public Integer getIntervalCount()
    {
        return intervalCount;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public String getName()
    {
        return name;
    }

    public String getStatementDescription()
    {
        return statementDescription;
    }

    public String getStatementDescriptor()
    {
        return statementDescriptor;
    }

    public Integer getTrialPeriodDays()
    {
        return trialPeriodDays;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setInterval(String s)
    {
        interval = s;
    }

    public void setIntervalCount(Integer integer)
    {
        intervalCount = integer;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setMetadata(Map map)
    {
        metadata = map;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setStatementDescription(String s)
    {
        statementDescription = s;
    }

    public void setStatementDescriptor(String s)
    {
        statementDescriptor = s;
    }

    public void setTrialPeriodDays(Integer integer)
    {
        trialPeriodDays = integer;
    }

    public volatile MetadataStore update(Map map)
    {
        return update(map);
    }

    public volatile MetadataStore update(Map map, RequestOptions requestoptions)
    {
        return update(map, requestoptions);
    }

    public Plan update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public Plan update(Map map, RequestOptions requestoptions)
    {
        return (Plan)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/Plan, id), map, com/stripe/model/Plan, requestoptions);
    }

    public Plan update(Map map, String s)
    {
        return update(map, RequestOptions.builder().setApiKey(s).build());
    }
}
