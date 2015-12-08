// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            MetadataStore, InvoiceCollection, Discount, InvoiceLineItemCollection

public class Invoice extends APIResource
    implements MetadataStore
{

    Integer amountDue;
    Long applicationFee;
    Integer attemptCount;
    Boolean attempted;
    String charge;
    Boolean closed;
    Long created;
    String currency;
    String customer;
    Long date;
    String description;
    Discount discount;
    Integer endingBalance;
    Boolean forgiven;
    String id;
    InvoiceLineItemCollection lines;
    Boolean livemode;
    Map metadata;
    Long nextPaymentAttempt;
    Boolean paid;
    Long periodEnd;
    Long periodStart;
    Integer startingBalance;
    String statementDescriptor;
    String subscription;
    Integer subtotal;
    Integer tax;
    Double taxPercent;
    Integer total;

    public Invoice()
    {
    }

    public static InvoiceCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static InvoiceCollection all(Map map, RequestOptions requestoptions)
    {
        return (InvoiceCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Invoice), map, com/stripe/model/InvoiceCollection, requestoptions);
    }

    public static InvoiceCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Invoice create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public static Invoice create(Map map, RequestOptions requestoptions)
    {
        return (Invoice)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Invoice), map, com/stripe/model/Invoice, requestoptions);
    }

    public static Invoice create(Map map, String s)
    {
        return create(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Invoice retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static Invoice retrieve(String s, RequestOptions requestoptions)
    {
        return (Invoice)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Invoice, s), null, com/stripe/model/Invoice, requestoptions);
    }

    public static Invoice retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public static Invoice upcoming(Map map)
    {
        return upcoming(map, (RequestOptions)null);
    }

    public static Invoice upcoming(Map map, RequestOptions requestoptions)
    {
        return (Invoice)request(com.stripe.net.APIResource.RequestMethod.GET, String.format("%s/upcoming", new Object[] {
            classURL(com/stripe/model/Invoice)
        }), map, com/stripe/model/Invoice, requestoptions);
    }

    public static Invoice upcoming(Map map, String s)
    {
        return upcoming(map, RequestOptions.builder().setApiKey(s).build());
    }

    public Integer getAmountDue()
    {
        return amountDue;
    }

    public Long getApplicationFee()
    {
        return applicationFee;
    }

    public Integer getAttemptCount()
    {
        return attemptCount;
    }

    public Boolean getAttempted()
    {
        return attempted;
    }

    public String getCharge()
    {
        return charge;
    }

    public Boolean getClosed()
    {
        return closed;
    }

    public Long getCreated()
    {
        return created;
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

    public Discount getDiscount()
    {
        return discount;
    }

    public Integer getEndingBalance()
    {
        return endingBalance;
    }

    public Boolean getForgiven()
    {
        return forgiven;
    }

    public String getId()
    {
        return id;
    }

    public InvoiceLineItemCollection getLines()
    {
        return lines;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public Long getNextPaymentAttempt()
    {
        return nextPaymentAttempt;
    }

    public Boolean getPaid()
    {
        return paid;
    }

    public Long getPeriodEnd()
    {
        return periodEnd;
    }

    public Long getPeriodStart()
    {
        return periodStart;
    }

    public Integer getStartingBalance()
    {
        return startingBalance;
    }

    public String getStatementDescriptor()
    {
        return statementDescriptor;
    }

    public String getSubscription()
    {
        return subscription;
    }

    public Integer getSubtotal()
    {
        return subtotal;
    }

    public Integer getTax()
    {
        return tax;
    }

    public Double getTaxPercent()
    {
        return taxPercent;
    }

    public Integer getTotal()
    {
        return total;
    }

    public Invoice pay()
    {
        return pay((RequestOptions)null);
    }

    public Invoice pay(RequestOptions requestoptions)
    {
        return (Invoice)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/pay", new Object[] {
            instanceURL(com/stripe/model/Invoice, getId())
        }), null, com/stripe/model/Invoice, requestoptions);
    }

    public Invoice pay(String s)
    {
        return pay(RequestOptions.builder().setApiKey(s).build());
    }

    public void setAmountDue(Integer integer)
    {
        amountDue = integer;
    }

    public void setApplicationFee(Long long1)
    {
        applicationFee = long1;
    }

    public void setAttemptCount(Integer integer)
    {
        attemptCount = integer;
    }

    public void setAttempted(Boolean boolean1)
    {
        attempted = boolean1;
    }

    public void setCharge(String s)
    {
        charge = s;
    }

    public void setClosed(Boolean boolean1)
    {
        closed = boolean1;
    }

    public void setCreated(Long long1)
    {
        created = long1;
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

    public void setDiscount(Discount discount1)
    {
        discount = discount1;
    }

    public void setEndingBalance(Integer integer)
    {
        endingBalance = integer;
    }

    public void setForgiven(Boolean boolean1)
    {
        forgiven = boolean1;
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

    public void setNextPaymentAttempt(Long long1)
    {
        nextPaymentAttempt = long1;
    }

    public void setPaid(Boolean boolean1)
    {
        paid = boolean1;
    }

    public void setPeriodEnd(Long long1)
    {
        periodEnd = long1;
    }

    public void setPeriodStart(Long long1)
    {
        periodStart = long1;
    }

    public void setStartingBalance(Integer integer)
    {
        startingBalance = integer;
    }

    public void setStatementDescriptor(String s)
    {
        statementDescriptor = s;
    }

    public void setSubscription(String s)
    {
        subscription = s;
    }

    public void setSubtotal(Integer integer)
    {
        subtotal = integer;
    }

    public void setTax(Integer integer)
    {
        tax = integer;
    }

    public void setTaxPercent(Double double1)
    {
        taxPercent = double1;
    }

    public void setTotal(Integer integer)
    {
        total = integer;
    }

    public Invoice update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public Invoice update(Map map, RequestOptions requestoptions)
    {
        return (Invoice)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/Invoice, id), map, com/stripe/model/Invoice, requestoptions);
    }

    public Invoice update(Map map, String s)
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
