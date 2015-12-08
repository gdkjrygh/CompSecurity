// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            MetadataStore, ChargeCollection, Dispute, ChargeRefundCollection, 
//            Card, FraudDetails, ShippingDetails, ExternalAccount

public class Charge extends APIResource
    implements MetadataStore
{

    public static final String FRAUD_DETAILS = "fraud_details";
    Integer amount;
    Integer amountRefunded;
    String balanceTransaction;
    Boolean captured;
    Card card;
    Long created;
    String currency;
    String customer;
    String description;
    Dispute dispute;
    Boolean disputed;
    String failureCode;
    String failureMessage;
    FraudDetails fraudDetails;
    String id;
    String invoice;
    Boolean livemode;
    Map metadata;
    Boolean paid;
    String receiptEmail;
    String receiptNumber;
    Boolean refunded;
    ChargeRefundCollection refunds;
    ShippingDetails shipping;
    ExternalAccount source;
    String statementDescription;
    String statementDescriptor;
    String status;

    public Charge()
    {
    }

    public static ChargeCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static ChargeCollection all(Map map, RequestOptions requestoptions)
    {
        return (ChargeCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Charge), map, com/stripe/model/ChargeCollection, requestoptions);
    }

    public static ChargeCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Charge create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public static Charge create(Map map, RequestOptions requestoptions)
    {
        return (Charge)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Charge), map, com/stripe/model/Charge, requestoptions);
    }

    public static Charge create(Map map, String s)
    {
        return create(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Charge retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static Charge retrieve(String s, RequestOptions requestoptions)
    {
        return (Charge)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Charge, s), null, com/stripe/model/Charge, requestoptions);
    }

    public static Charge retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public Charge capture()
    {
        return capture(null, (RequestOptions)null);
    }

    public Charge capture(RequestOptions requestoptions)
    {
        return capture(null, requestoptions);
    }

    public Charge capture(String s)
    {
        return capture(RequestOptions.builder().setApiKey(s).build());
    }

    public Charge capture(Map map)
    {
        return capture(map, (RequestOptions)null);
    }

    public Charge capture(Map map, RequestOptions requestoptions)
    {
        return (Charge)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/capture", new Object[] {
            instanceURL(com/stripe/model/Charge, getId())
        }), map, com/stripe/model/Charge, requestoptions);
    }

    public Charge capture(Map map, String s)
    {
        return capture(map, RequestOptions.builder().setApiKey(s).build());
    }

    public Dispute closeDispute()
    {
        return closeDispute((RequestOptions)null);
    }

    public Dispute closeDispute(RequestOptions requestoptions)
    {
        return (Dispute)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/dispute/close", new Object[] {
            instanceURL(com/stripe/model/Charge, getId())
        }), null, com/stripe/model/Dispute, requestoptions);
    }

    public Dispute closeDispute(String s)
    {
        return closeDispute(RequestOptions.builder().setApiKey(s).build());
    }

    public Integer getAmount()
    {
        return amount;
    }

    public Integer getAmountRefunded()
    {
        return amountRefunded;
    }

    public String getBalanceTransaction()
    {
        return balanceTransaction;
    }

    public Boolean getCaptured()
    {
        return captured;
    }

    public Card getCard()
    {
        return card;
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

    public String getDescription()
    {
        return description;
    }

    public Dispute getDispute()
    {
        return dispute;
    }

    public Boolean getDisputed()
    {
        return disputed;
    }

    public String getFailureCode()
    {
        return failureCode;
    }

    public String getFailureMessage()
    {
        return failureMessage;
    }

    public FraudDetails getFraudDetails()
    {
        return fraudDetails;
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

    public Boolean getPaid()
    {
        return paid;
    }

    public String getReceiptEmail()
    {
        return receiptEmail;
    }

    public String getReceiptNumber()
    {
        return receiptNumber;
    }

    public Boolean getRefunded()
    {
        return refunded;
    }

    public ChargeRefundCollection getRefunds()
    {
        if (refunds != null && refunds.getURL() == null)
        {
            refunds.setURL(String.format("/v1/charges/%s/refunds", new Object[] {
                getId()
            }));
        }
        return refunds;
    }

    public ShippingDetails getShipping()
    {
        return shipping;
    }

    public ExternalAccount getSource()
    {
        return source;
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

    public Charge markFraudulent(RequestOptions requestoptions)
    {
        return update(Collections.singletonMap("fraud_details", Collections.singletonMap("user_report", "fraudulent")), requestoptions);
    }

    public Charge markSafe(RequestOptions requestoptions)
    {
        return update(Collections.singletonMap("fraud_details", Collections.singletonMap("user_report", "safe")), requestoptions);
    }

    public Charge refund()
    {
        return refund(null, (RequestOptions)null);
    }

    public Charge refund(RequestOptions requestoptions)
    {
        return refund(null, requestoptions);
    }

    public Charge refund(String s)
    {
        return refund(RequestOptions.builder().setApiKey(s).build());
    }

    public Charge refund(Map map)
    {
        return refund(map, (RequestOptions)null);
    }

    public Charge refund(Map map, RequestOptions requestoptions)
    {
        return (Charge)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/refund", new Object[] {
            instanceURL(com/stripe/model/Charge, getId())
        }), map, com/stripe/model/Charge, requestoptions);
    }

    public Charge refund(Map map, String s)
    {
        return refund(map, RequestOptions.builder().setApiKey(s).build());
    }

    public void setAmount(Integer integer)
    {
        amount = integer;
    }

    public void setAmountRefunded(Integer integer)
    {
        amountRefunded = integer;
    }

    public void setBalanceTransaction(String s)
    {
        balanceTransaction = s;
    }

    public void setCaptured(Boolean boolean1)
    {
        captured = boolean1;
    }

    public void setCard(Card card1)
    {
        card = card1;
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

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDispute(Dispute dispute1)
    {
        dispute = dispute1;
    }

    public void setDisputed(Boolean boolean1)
    {
        disputed = boolean1;
    }

    public void setFailureCode(String s)
    {
        failureCode = s;
    }

    public void setFailureMessage(String s)
    {
        failureMessage = s;
    }

    public void setFraudDetails(FraudDetails frauddetails)
    {
        fraudDetails = frauddetails;
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

    public void setPaid(Boolean boolean1)
    {
        paid = boolean1;
    }

    public void setReceiptEmail(String s)
    {
        receiptEmail = s;
    }

    public void setReceiptNumber(String s)
    {
        receiptNumber = s;
    }

    public void setRefunded(Boolean boolean1)
    {
        refunded = boolean1;
    }

    public void setShipping(ShippingDetails shippingdetails)
    {
        shipping = shippingdetails;
    }

    public void setSource(ExternalAccount externalaccount)
    {
        source = externalaccount;
    }

    public void setStatementDescription(String s)
    {
        statementDescription = s;
    }

    public void setStatementDescriptor(String s)
    {
        statementDescriptor = s;
    }

    public Charge update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public Charge update(Map map, RequestOptions requestoptions)
    {
        return (Charge)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/Charge, id), map, com/stripe/model/Charge, requestoptions);
    }

    public Charge update(Map map, String s)
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

    public Dispute updateDispute(Map map)
    {
        return updateDispute(map, (RequestOptions)null);
    }

    public Dispute updateDispute(Map map, RequestOptions requestoptions)
    {
        return (Dispute)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/dispute", new Object[] {
            instanceURL(com/stripe/model/Charge, id)
        }), map, com/stripe/model/Dispute, requestoptions);
    }

    public Dispute updateDispute(Map map, String s)
    {
        return updateDispute(map, RequestOptions.builder().setApiKey(s).build());
    }
}
