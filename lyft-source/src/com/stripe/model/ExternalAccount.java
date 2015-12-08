// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            DeletedExternalAccount, Customer, Account

public class ExternalAccount extends APIResource
{

    String account;
    String customer;
    String id;
    String object;

    public ExternalAccount()
    {
    }

    public DeletedExternalAccount delete()
    {
        return delete(null);
    }

    public DeletedExternalAccount delete(RequestOptions requestoptions)
    {
        return (DeletedExternalAccount)request(com.stripe.net.APIResource.RequestMethod.DELETE, getInstanceURL(), null, com/stripe/model/DeletedExternalAccount, requestoptions);
    }

    public String getAccount()
    {
        return account;
    }

    public String getCustomer()
    {
        return customer;
    }

    public String getId()
    {
        return id;
    }

    public String getInstanceURL()
    {
        if (getCustomer() != null)
        {
            return String.format("%s/%s/sources/%s", new Object[] {
                classURL(com/stripe/model/Customer), getCustomer(), getId()
            });
        }
        if (getAccount() != null)
        {
            return String.format("%s/%s/external_accounts/%s", new Object[] {
                classURL(com/stripe/model/Account), getAccount(), getId()
            });
        } else
        {
            return null;
        }
    }

    public String getObject()
    {
        return object;
    }

    public void setAccount(String s)
    {
        account = s;
    }

    public void setCustomer(String s)
    {
        customer = s;
    }

    public ExternalAccount update(Map map)
    {
        return update(map, null);
    }

    public ExternalAccount update(Map map, RequestOptions requestoptions)
    {
        return (ExternalAccount)request(com.stripe.net.APIResource.RequestMethod.POST, getInstanceURL(), map, com/stripe/model/ExternalAccount, requestoptions);
    }
}
