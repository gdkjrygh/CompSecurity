// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            MetadataStore, ExternalAccountCollection, LegalEntity

public class Account extends APIResource
    implements MetadataStore
{

    String businessLogo;
    String businessName;
    String businessUrl;
    Boolean chargesEnabled;
    String country;
    List currenciesSupported;
    String defaultCurrency;
    Boolean detailsSubmitted;
    String displayName;
    String email;
    ExternalAccountCollection externalAccounts;
    String id;
    Keys keys;
    LegalEntity legalEntity;
    Boolean managed;
    Map metadata;
    String statementDescriptor;
    String supportEmail;
    String supportPhone;
    String supportUrl;
    String timezone;
    Boolean transfersEnabled;
    Verification verification;

    public Account()
    {
    }

    public static Account create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public static Account create(Map map, RequestOptions requestoptions)
    {
        return (Account)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Account), map, com/stripe/model/Account, requestoptions);
    }

    public static Account retrieve()
    {
        return retrieve((RequestOptions)null);
    }

    public static Account retrieve(RequestOptions requestoptions)
    {
        return (Account)request(com.stripe.net.APIResource.RequestMethod.GET, singleClassURL(com/stripe/model/Account), null, com/stripe/model/Account, requestoptions);
    }

    public static Account retrieve(String s)
    {
        if (s == null || s.startsWith("sk_"))
        {
            return retrieve(RequestOptions.builder().setApiKey(s).build());
        } else
        {
            return retrieve(s, (RequestOptions)null);
        }
    }

    public static Account retrieve(String s, RequestOptions requestoptions)
    {
        return (Account)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Account, s), null, com/stripe/model/Account, requestoptions);
    }

    public String getBusinessLogo()
    {
        return businessLogo;
    }

    public String getBusinessName()
    {
        return businessName;
    }

    public String getBusinessUrl()
    {
        return businessUrl;
    }

    public Boolean getChargesEnabled()
    {
        return chargesEnabled;
    }

    public String getCountry()
    {
        return country;
    }

    public List getCurrenciesSupported()
    {
        return currenciesSupported;
    }

    public String getDefaultCurrency()
    {
        return defaultCurrency;
    }

    public Boolean getDetailsSubmitted()
    {
        return detailsSubmitted;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public String getEmail()
    {
        return email;
    }

    public ExternalAccountCollection getExternalAccounts()
    {
        return externalAccounts;
    }

    public String getId()
    {
        return id;
    }

    public Keys getKeys()
    {
        return keys;
    }

    public LegalEntity getLegalEntity()
    {
        return legalEntity;
    }

    public Boolean getManaged()
    {
        return managed;
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public String getStatementDescriptor()
    {
        return statementDescriptor;
    }

    public String getSupportEmail()
    {
        return supportEmail;
    }

    public String getSupportPhone()
    {
        return supportPhone;
    }

    public String getSupportUrl()
    {
        return supportUrl;
    }

    public String getTimezone()
    {
        return timezone;
    }

    public Boolean getTransfersEnabled()
    {
        return transfersEnabled;
    }

    public Verification getVerification()
    {
        return verification;
    }

    public Account update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public Account update(Map map, RequestOptions requestoptions)
    {
        return (Account)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/Account, id), map, com/stripe/model/Account, requestoptions);
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
