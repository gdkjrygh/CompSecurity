// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            ExternalAccount, DeletedAlipayAccount, DeletedExternalAccount

public class AlipayAccount extends ExternalAccount
{

    Long created;
    String fingerprint;
    Map metadata;
    Integer paymentAmount;
    String paymentCurrency;
    Boolean reusable;
    String status;
    Boolean used;
    String username;

    public AlipayAccount()
    {
    }

    public DeletedAlipayAccount delete()
    {
        return delete((RequestOptions)null);
    }

    public DeletedAlipayAccount delete(RequestOptions requestoptions)
    {
        return (DeletedAlipayAccount)request(com.stripe.net.APIResource.RequestMethod.DELETE, getInstanceURL(), null, com/stripe/model/DeletedAlipayAccount, requestoptions);
    }

    public volatile DeletedExternalAccount delete()
    {
        return delete();
    }

    public volatile DeletedExternalAccount delete(RequestOptions requestoptions)
    {
        return delete(requestoptions);
    }

    public Long getCreated()
    {
        return created;
    }

    public String getFingerprint()
    {
        return fingerprint;
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public Integer getPaymentAmount()
    {
        return paymentAmount;
    }

    public String getPaymentCurrency()
    {
        return paymentCurrency;
    }

    public Boolean getReusable()
    {
        return reusable;
    }

    public String getStatus()
    {
        return status;
    }

    public Boolean getUsed()
    {
        return used;
    }

    public String getUsername()
    {
        return username;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setFingerprint(String s)
    {
        fingerprint = s;
    }

    public void setMetadata(Map map)
    {
        metadata = map;
    }

    public void setPaymentAmount(Integer integer)
    {
        paymentAmount = integer;
    }

    public void setPaymentCurrency(String s)
    {
        paymentCurrency = s;
    }

    public void setReusable(Boolean boolean1)
    {
        reusable = boolean1;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setUsed(Boolean boolean1)
    {
        used = boolean1;
    }

    public void setUsername(String s)
    {
        username = s;
    }

    public AlipayAccount update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public AlipayAccount update(Map map, RequestOptions requestoptions)
    {
        return (AlipayAccount)request(com.stripe.net.APIResource.RequestMethod.POST, getInstanceURL(), map, com/stripe/model/AlipayAccount, requestoptions);
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
