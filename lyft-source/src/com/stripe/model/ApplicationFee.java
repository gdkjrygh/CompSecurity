// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            ApplicationFeeCollection, FeeRefundCollection

public class ApplicationFee extends APIResource
{

    Integer amount;
    Integer amountRefunded;
    String application;
    String balanceTransaction;
    String charge;
    Long created;
    String currency;
    String id;
    Boolean livemode;
    Boolean refunded;
    FeeRefundCollection refunds;
    String user;

    public ApplicationFee()
    {
    }

    public static ApplicationFeeCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static ApplicationFeeCollection all(Map map, RequestOptions requestoptions)
    {
        return (ApplicationFeeCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/ApplicationFee), map, com/stripe/model/ApplicationFeeCollection, requestoptions);
    }

    public static ApplicationFeeCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static ApplicationFee retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static ApplicationFee retrieve(String s, RequestOptions requestoptions)
    {
        return (ApplicationFee)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/ApplicationFee, s), null, com/stripe/model/ApplicationFee, requestoptions);
    }

    public static ApplicationFee retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public Integer getAmount()
    {
        return amount;
    }

    public Integer getAmountRefunded()
    {
        return amountRefunded;
    }

    public String getApplication()
    {
        return application;
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

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Boolean getRefunded()
    {
        return refunded;
    }

    public FeeRefundCollection getRefunds()
    {
        if (refunds.getURL() == null)
        {
            refunds.setURL(String.format("/v1/application_fees/%s/refunds", new Object[] {
                getId()
            }));
        }
        return refunds;
    }

    public String getUser()
    {
        return user;
    }

    public ApplicationFee refund()
    {
        return refund(null, (RequestOptions)null);
    }

    public ApplicationFee refund(RequestOptions requestoptions)
    {
        return refund(null, requestoptions);
    }

    public ApplicationFee refund(String s)
    {
        return refund(RequestOptions.builder().setApiKey(s).build());
    }

    public ApplicationFee refund(Map map)
    {
        return refund(map, (RequestOptions)null);
    }

    public ApplicationFee refund(Map map, RequestOptions requestoptions)
    {
        return (ApplicationFee)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/refund", new Object[] {
            instanceURL(com/stripe/model/ApplicationFee, getId())
        }), map, com/stripe/model/ApplicationFee, requestoptions);
    }

    public ApplicationFee refund(Map map, String s)
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

    public void setApplication(String s)
    {
        application = s;
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

    public void setId(String s)
    {
        id = s;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setRefunded(Boolean boolean1)
    {
        refunded = boolean1;
    }

    public void setUser(String s)
    {
        user = s;
    }
}
