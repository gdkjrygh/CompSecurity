// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            ExternalAccount, BitcoinReceiverCollection, DeletedBitcoinReceiver, BitcoinTransactionCollection, 
//            DeletedExternalAccount

public class BitcoinReceiver extends ExternalAccount
{

    Boolean active;
    Integer amount;
    Integer amountReceived;
    Integer bitcoinAmount;
    Integer bitcoinAmountReceived;
    String bitcoinUri;
    Long created;
    String currency;
    String description;
    String email;
    Boolean filled;
    String inboundAddress;
    Map metadata;
    String payment;
    String refundAddress;
    Boolean rejectTransactions;
    String status;
    BitcoinTransactionCollection transactions;

    public BitcoinReceiver()
    {
    }

    public static BitcoinReceiverCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static BitcoinReceiverCollection all(Map map, RequestOptions requestoptions)
    {
        return (BitcoinReceiverCollection)request(com.stripe.net.APIResource.RequestMethod.GET, String.format("%s/%s", new Object[] {
            Stripe.getApiBase(), "v1/bitcoin/receivers"
        }), map, com/stripe/model/BitcoinReceiverCollection, requestoptions);
    }

    public static BitcoinReceiver create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public static BitcoinReceiver create(Map map, RequestOptions requestoptions)
    {
        return (BitcoinReceiver)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/%s", new Object[] {
            Stripe.getApiBase(), "v1/bitcoin/receivers"
        }), map, com/stripe/model/BitcoinReceiver, requestoptions);
    }

    public static BitcoinReceiver retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static BitcoinReceiver retrieve(String s, RequestOptions requestoptions)
    {
        return (BitcoinReceiver)request(com.stripe.net.APIResource.RequestMethod.GET, String.format("%s/%s/%s", new Object[] {
            Stripe.getApiBase(), "v1/bitcoin/receivers", s
        }), null, com/stripe/model/BitcoinReceiver, requestoptions);
    }

    public DeletedBitcoinReceiver delete()
    {
        return delete((RequestOptions)null);
    }

    public DeletedBitcoinReceiver delete(RequestOptions requestoptions)
    {
        return (DeletedBitcoinReceiver)request(com.stripe.net.APIResource.RequestMethod.DELETE, getInstanceURL(), null, com/stripe/model/DeletedBitcoinReceiver, requestoptions);
    }

    public volatile DeletedExternalAccount delete()
    {
        return delete();
    }

    public volatile DeletedExternalAccount delete(RequestOptions requestoptions)
    {
        return delete(requestoptions);
    }

    public Boolean getActive()
    {
        return active;
    }

    public Integer getAmount()
    {
        return amount;
    }

    public Integer getAmountReceived()
    {
        return amountReceived;
    }

    public Integer getBitcoinAmount()
    {
        return bitcoinAmount;
    }

    public Integer getBitcoinAmountReceived()
    {
        return bitcoinAmountReceived;
    }

    public String getBitcoinUri()
    {
        return bitcoinUri;
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

    public String getEmail()
    {
        return email;
    }

    public Boolean getFilled()
    {
        return filled;
    }

    public String getInboundAddress()
    {
        return inboundAddress;
    }

    public String getInstanceURL()
    {
        String s1 = super.getInstanceURL();
        String s = s1;
        if (s1 == null)
        {
            s = String.format("%s/%s/%s", new Object[] {
                Stripe.getApiBase(), "v1/bitcoin/receivers", getId()
            });
        }
        return s;
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public String getPayment()
    {
        return payment;
    }

    public String getRefundAddress()
    {
        return refundAddress;
    }

    public Boolean getRejectTransactions()
    {
        return rejectTransactions;
    }

    public String getStatus()
    {
        return status;
    }

    public BitcoinTransactionCollection getTransactions()
    {
        return transactions;
    }

    public void setActive(Boolean boolean1)
    {
        active = boolean1;
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setAmountReceived(Integer integer)
    {
        amountReceived = integer;
    }

    public void setBitcoinAmount(Integer integer)
    {
        bitcoinAmount = integer;
    }

    public void setBitcoinAmountReceived(Integer integer)
    {
        bitcoinAmountReceived = integer;
    }

    public void setBitcoinUri(String s)
    {
        bitcoinUri = s;
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

    public void setEmail(String s)
    {
        email = s;
    }

    public void setFilled(Boolean boolean1)
    {
        filled = boolean1;
    }

    public void setInboundAddress(String s)
    {
        inboundAddress = s;
    }

    public void setMetadata(Map map)
    {
        metadata = map;
    }

    public void setPayment(String s)
    {
        payment = s;
    }

    public void setRefundAddress(String s)
    {
        refundAddress = s;
    }

    public void setRejectTransactions(Boolean boolean1)
    {
        rejectTransactions = boolean1;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setTransactions(BitcoinTransactionCollection bitcointransactioncollection)
    {
        transactions = bitcointransactioncollection;
    }

    public BitcoinReceiver update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public BitcoinReceiver update(Map map, RequestOptions requestoptions)
    {
        return (BitcoinReceiver)request(com.stripe.net.APIResource.RequestMethod.POST, getInstanceURL(), map, com/stripe/model/BitcoinReceiver, requestoptions);
    }

    public volatile ExternalAccount update(Map map)
    {
        return update(map);
    }

    public volatile ExternalAccount update(Map map, RequestOptions requestoptions)
    {
        return update(map, requestoptions);
    }
}
