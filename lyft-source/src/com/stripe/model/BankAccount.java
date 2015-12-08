// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            ExternalAccount, DeletedBankAccount, DeletedExternalAccount

public class BankAccount extends ExternalAccount
{

    String bankName;
    String country;
    String currency;
    Boolean defaultForCurrency;
    String fingerprint;
    String last4;
    String status;
    Boolean validated;

    public BankAccount()
    {
    }

    public DeletedBankAccount delete()
    {
        return delete((RequestOptions)null);
    }

    public DeletedBankAccount delete(RequestOptions requestoptions)
    {
        return (DeletedBankAccount)request(com.stripe.net.APIResource.RequestMethod.DELETE, getInstanceURL(), null, com/stripe/model/DeletedBankAccount, requestoptions);
    }

    public volatile DeletedExternalAccount delete()
    {
        return delete();
    }

    public volatile DeletedExternalAccount delete(RequestOptions requestoptions)
    {
        return delete(requestoptions);
    }

    public String getBankName()
    {
        return bankName;
    }

    public String getCountry()
    {
        return country;
    }

    public String getCurrency()
    {
        return currency;
    }

    public Boolean getDefaultForCurrency()
    {
        return defaultForCurrency;
    }

    public String getFingerprint()
    {
        return fingerprint;
    }

    public String getLast4()
    {
        return last4;
    }

    public String getStatus()
    {
        return status;
    }

    public Boolean getValidated()
    {
        return validated;
    }

    public void setBankName(String s)
    {
        bankName = s;
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setDefaultForCurrency(Boolean boolean1)
    {
        defaultForCurrency = boolean1;
    }

    public void setFingerprint(String s)
    {
        fingerprint = s;
    }

    public void setLast4(String s)
    {
        last4 = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setValidated(Boolean boolean1)
    {
        validated = boolean1;
    }

    public BankAccount update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public BankAccount update(Map map, RequestOptions requestoptions)
    {
        return (BankAccount)request(com.stripe.net.APIResource.RequestMethod.POST, getInstanceURL(), map, com/stripe/model/BankAccount, requestoptions);
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
