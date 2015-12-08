// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            MetadataStore, CustomerCollection, Subscription, Card, 
//            DeletedCustomer, Discount, CustomerCardCollection, NextRecurringCharge, 
//            ExternalAccountCollection, CustomerSubscriptionCollection

public class Customer extends APIResource
    implements MetadataStore
{

    Integer accountBalance;
    CustomerCardCollection cards;
    Long created;
    String currency;
    String defaultCard;
    String defaultSource;
    Boolean deleted;
    Boolean delinquent;
    String description;
    Discount discount;
    String email;
    String id;
    Boolean livemode;
    Map metadata;
    NextRecurringCharge nextRecurringCharge;
    ExternalAccountCollection sources;
    Subscription subscription;
    CustomerSubscriptionCollection subscriptions;
    Long trialEnd;

    public Customer()
    {
    }

    public static CustomerCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static CustomerCollection all(Map map, RequestOptions requestoptions)
    {
        return (CustomerCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Customer), map, com/stripe/model/CustomerCollection, requestoptions);
    }

    public static CustomerCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Customer create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public static Customer create(Map map, RequestOptions requestoptions)
    {
        return (Customer)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Customer), map, com/stripe/model/Customer, requestoptions);
    }

    public static Customer create(Map map, String s)
    {
        return create(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Customer retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static Customer retrieve(String s, RequestOptions requestoptions)
    {
        return (Customer)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Customer, s), null, com/stripe/model/Customer, requestoptions);
    }

    public static Customer retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public Subscription cancelSubscription()
    {
        return cancelSubscription(null, (RequestOptions)null);
    }

    public Subscription cancelSubscription(RequestOptions requestoptions)
    {
        return cancelSubscription(null, requestoptions);
    }

    public Subscription cancelSubscription(String s)
    {
        return cancelSubscription(RequestOptions.builder().setApiKey(s).build());
    }

    public Subscription cancelSubscription(Map map)
    {
        return cancelSubscription(map, (RequestOptions)null);
    }

    public Subscription cancelSubscription(Map map, RequestOptions requestoptions)
    {
        return (Subscription)request(com.stripe.net.APIResource.RequestMethod.DELETE, String.format("%s/subscription", new Object[] {
            instanceURL(com/stripe/model/Customer, id)
        }), map, com/stripe/model/Subscription, requestoptions);
    }

    public Subscription cancelSubscription(Map map, String s)
    {
        return cancelSubscription(map, RequestOptions.builder().setApiKey(s).build());
    }

    public Card createCard(String s)
    {
        return createCard(s, (RequestOptions)null);
    }

    public Card createCard(String s, RequestOptions requestoptions)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("card", s);
        return createCard(((Map) (hashmap)), requestoptions);
    }

    public Card createCard(String s, String s1)
    {
        return createCard(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public Card createCard(Map map)
    {
        return createCard(map, (RequestOptions)null);
    }

    public Card createCard(Map map, RequestOptions requestoptions)
    {
        return (Card)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/cards", new Object[] {
            instanceURL(com/stripe/model/Customer, id)
        }), map, com/stripe/model/Card, requestoptions);
    }

    public Card createCard(Map map, String s)
    {
        return createCard(map, RequestOptions.builder().setApiKey(s).build());
    }

    public Subscription createSubscription(Map map)
    {
        return createSubscription(map, (RequestOptions)null);
    }

    public Subscription createSubscription(Map map, RequestOptions requestoptions)
    {
        return (Subscription)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/subscriptions", new Object[] {
            instanceURL(com/stripe/model/Customer, id)
        }), map, com/stripe/model/Subscription, requestoptions);
    }

    public Subscription createSubscription(Map map, String s)
    {
        return createSubscription(map, RequestOptions.builder().setApiKey(s).build());
    }

    public DeletedCustomer delete()
    {
        return delete((RequestOptions)null);
    }

    public DeletedCustomer delete(RequestOptions requestoptions)
    {
        return (DeletedCustomer)request(com.stripe.net.APIResource.RequestMethod.DELETE, instanceURL(com/stripe/model/Customer, id), null, com/stripe/model/DeletedCustomer, requestoptions);
    }

    public DeletedCustomer delete(String s)
    {
        return delete(RequestOptions.builder().setApiKey(s).build());
    }

    public void deleteDiscount()
    {
        deleteDiscount((RequestOptions)null);
    }

    public void deleteDiscount(RequestOptions requestoptions)
    {
        request(com.stripe.net.APIResource.RequestMethod.DELETE, String.format("%s/discount", new Object[] {
            instanceURL(com/stripe/model/Customer, id)
        }), null, com/stripe/model/Discount, requestoptions);
    }

    public void deleteDiscount(String s)
    {
        deleteDiscount(RequestOptions.builder().setApiKey(s).build());
    }

    public Integer getAccountBalance()
    {
        return accountBalance;
    }

    public CustomerCardCollection getCards()
    {
        return cards;
    }

    public Long getCreated()
    {
        return created;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getDefaultCard()
    {
        return defaultCard;
    }

    public String getDefaultSource()
    {
        return defaultSource;
    }

    public Boolean getDeleted()
    {
        return deleted;
    }

    public Boolean getDelinquent()
    {
        return delinquent;
    }

    public String getDescription()
    {
        return description;
    }

    public Discount getDiscount()
    {
        return discount;
    }

    public String getEmail()
    {
        return email;
    }

    public String getId()
    {
        return id;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public NextRecurringCharge getNextRecurringCharge()
    {
        return nextRecurringCharge;
    }

    public ExternalAccountCollection getSources()
    {
        return sources;
    }

    public Subscription getSubscription()
    {
        return subscription;
    }

    public CustomerSubscriptionCollection getSubscriptions()
    {
        return subscriptions;
    }

    public Long getTrialEnd()
    {
        return trialEnd;
    }

    public void setAccountBalance(Integer integer)
    {
        accountBalance = integer;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setDefaultCard(String s)
    {
        defaultCard = s;
    }

    public void setDefaultSource(String s)
    {
        defaultSource = s;
    }

    public void setDelinquent(Boolean boolean1)
    {
        delinquent = boolean1;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDiscount(Discount discount1)
    {
        discount = discount1;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setMetadata(Map map)
    {
        metadata = map;
    }

    public void setNextRecurringCharge(NextRecurringCharge nextrecurringcharge)
    {
        nextRecurringCharge = nextrecurringcharge;
    }

    public void setSources(ExternalAccountCollection externalaccountcollection)
    {
        sources = externalaccountcollection;
    }

    public void setSubscription(Subscription subscription1)
    {
        subscription = subscription1;
    }

    public void setTrialEnd(Long long1)
    {
        trialEnd = long1;
    }

    public Customer update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public Customer update(Map map, RequestOptions requestoptions)
    {
        return (Customer)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/Customer, id), map, com/stripe/model/Customer, requestoptions);
    }

    public Customer update(Map map, String s)
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

    public Subscription updateSubscription(Map map)
    {
        return updateSubscription(map, (RequestOptions)null);
    }

    public Subscription updateSubscription(Map map, RequestOptions requestoptions)
    {
        return (Subscription)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/subscription", new Object[] {
            instanceURL(com/stripe/model/Customer, id)
        }), map, com/stripe/model/Subscription, requestoptions);
    }

    public Subscription updateSubscription(Map map, String s)
    {
        return updateSubscription(map, RequestOptions.builder().setApiKey(s).build());
    }
}
