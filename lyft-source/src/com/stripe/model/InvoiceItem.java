// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            MetadataStore, InvoiceItemCollection, DeletedInvoiceItem

public class InvoiceItem extends APIResource
    implements MetadataStore
{

    Integer amount;
    String currency;
    String customer;
    Long date;
    String description;
    String id;
    String invoice;
    Boolean livemode;
    Map metadata;
    String subscription;

    public InvoiceItem()
    {
    }

    public static InvoiceItemCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static InvoiceItemCollection all(Map map, RequestOptions requestoptions)
    {
        return (InvoiceItemCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/InvoiceItem), map, com/stripe/model/InvoiceItemCollection, requestoptions);
    }

    public static InvoiceItemCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static InvoiceItem create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public static InvoiceItem create(Map map, RequestOptions requestoptions)
    {
        return (InvoiceItem)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/InvoiceItem), map, com/stripe/model/InvoiceItem, requestoptions);
    }

    public static InvoiceItem create(Map map, String s)
    {
        return create(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static InvoiceItem retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static InvoiceItem retrieve(String s, RequestOptions requestoptions)
    {
        return (InvoiceItem)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/InvoiceItem, s), null, com/stripe/model/InvoiceItem, requestoptions);
    }

    public static InvoiceItem retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public DeletedInvoiceItem delete()
    {
        return delete((RequestOptions)null);
    }

    public DeletedInvoiceItem delete(RequestOptions requestoptions)
    {
        return (DeletedInvoiceItem)request(com.stripe.net.APIResource.RequestMethod.DELETE, instanceURL(com/stripe/model/InvoiceItem, id), null, com/stripe/model/DeletedInvoiceItem, requestoptions);
    }

    public DeletedInvoiceItem delete(String s)
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

    public String getCustomer()
    {
        return customer;
    }

    public Long getDate()
    {
        return date;
    }

    public String getDescription()
    {
        return description;
    }

    public String getId()
    {
        return id;
    }

    public String getInvoice()
    {
        return invoice;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public String getSubscription()
    {
        return subscription;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setCustomer(String s)
    {
        customer = s;
    }

    public void setDate(Long long1)
    {
        date = long1;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setInvoice(String s)
    {
        invoice = s;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setMetadata(Map map)
    {
        metadata = map;
    }

    public void setSubscription(String s)
    {
        subscription = s;
    }

    public InvoiceItem update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public InvoiceItem update(Map map, RequestOptions requestoptions)
    {
        return (InvoiceItem)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/InvoiceItem, id), map, com/stripe/model/InvoiceItem, requestoptions);
    }

    public InvoiceItem update(Map map, String s)
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
