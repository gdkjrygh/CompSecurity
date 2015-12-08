// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            MetadataStore, TransferCollection, TransferReversalCollection, TransferTransactionCollection, 
//            BankAccount, Summary

public class Transfer extends APIResource
    implements MetadataStore
{

    BankAccount account;
    Integer amount;
    String balanceTransaction;
    String currency;
    Long date;
    String description;
    String id;
    Boolean livemode;
    Map metadata;
    List otherTransfers;
    String recipient;
    TransferReversalCollection reversals;
    String statementDescription;
    String statementDescriptor;
    String status;
    Summary summary;

    public Transfer()
    {
    }

    public static TransferCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static TransferCollection all(Map map, RequestOptions requestoptions)
    {
        return (TransferCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Transfer), map, com/stripe/model/TransferCollection, requestoptions);
    }

    public static TransferCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Transfer create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public static Transfer create(Map map, RequestOptions requestoptions)
    {
        return (Transfer)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Transfer), map, com/stripe/model/Transfer, requestoptions);
    }

    public static Transfer create(Map map, String s)
    {
        return create(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Transfer retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static Transfer retrieve(String s, RequestOptions requestoptions)
    {
        return (Transfer)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Transfer, s), null, com/stripe/model/Transfer, requestoptions);
    }

    public static Transfer retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public Transfer cancel()
    {
        return cancel((RequestOptions)null);
    }

    public Transfer cancel(RequestOptions requestoptions)
    {
        return (Transfer)request(com.stripe.net.APIResource.RequestMethod.POST, (new StringBuilder()).append(instanceURL(com/stripe/model/Transfer, id)).append("/cancel").toString(), null, com/stripe/model/Transfer, requestoptions);
    }

    public Transfer cancel(String s)
    {
        return cancel(RequestOptions.builder().setApiKey(s).build());
    }

    public BankAccount getAccount()
    {
        return account;
    }

    public Integer getAmount()
    {
        return amount;
    }

    public String getBalanceTransaction()
    {
        return balanceTransaction;
    }

    public String getCurrency()
    {
        return currency;
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

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public List getOtherTransfers()
    {
        return otherTransfers;
    }

    public String getRecipient()
    {
        return recipient;
    }

    public TransferReversalCollection getReversals()
    {
        if (reversals.getURL() == null)
        {
            reversals.setURL(String.format("/v1/transfers/%s/reversals", new Object[] {
                getId()
            }));
        }
        return reversals;
    }

    public String getStatementDescription()
    {
        return statementDescription;
    }

    public String getStatementDescriptor()
    {
        return statementDescriptor;
    }

    public String getStatus()
    {
        return status;
    }

    public Summary getSummary()
    {
        return summary;
    }

    public void setAccount(BankAccount bankaccount)
    {
        account = bankaccount;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setBalanceTransaction(String s)
    {
        balanceTransaction = s;
    }

    public void setCurrency(String s)
    {
        currency = s;
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

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setMetadata(Map map)
    {
        metadata = map;
    }

    public void setOtherTransfers(List list)
    {
        otherTransfers = list;
    }

    public void setRecipient(String s)
    {
        recipient = s;
    }

    public void setStatementDescription(String s)
    {
        statementDescription = s;
    }

    public void setStatementDescriptor(String s)
    {
        statementDescriptor = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setSummary(Summary summary1)
    {
        summary = summary1;
    }

    public TransferTransactionCollection transactions(Map map)
    {
        return transactions(map, (RequestOptions)null);
    }

    public TransferTransactionCollection transactions(Map map, RequestOptions requestoptions)
    {
        return (TransferTransactionCollection)request(com.stripe.net.APIResource.RequestMethod.GET, String.format("%s/transactions", new Object[] {
            instanceURL(com/stripe/model/Transfer, getId())
        }), map, com/stripe/model/TransferTransactionCollection, requestoptions);
    }

    public TransferTransactionCollection transactions(Map map, String s)
    {
        return transactions(map, RequestOptions.builder().setApiKey(s).build());
    }

    public volatile MetadataStore update(Map map)
    {
        return update(map);
    }

    public volatile MetadataStore update(Map map, RequestOptions requestoptions)
    {
        return update(map, requestoptions);
    }

    public Transfer update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public Transfer update(Map map, RequestOptions requestoptions)
    {
        return (Transfer)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/Transfer, id), map, com/stripe/model/Transfer, requestoptions);
    }

    public Transfer update(Map map, String s)
    {
        return update(map, RequestOptions.builder().setApiKey(s).build());
    }
}
