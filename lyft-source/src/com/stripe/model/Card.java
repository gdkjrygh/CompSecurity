// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            ExternalAccount, MetadataStore, DeletedCard, Recipient, 
//            DeletedExternalAccount

public class Card extends ExternalAccount
    implements MetadataStore
{

    String addressCity;
    String addressCountry;
    String addressLine1;
    String addressLine1Check;
    String addressLine2;
    String addressState;
    String addressZip;
    String addressZipCheck;
    String brand;
    String country;
    String cvcCheck;
    String dynamicLast4;
    Integer expMonth;
    Integer expYear;
    String fingerprint;
    String funding;
    String last4;
    Map metadata;
    String name;
    String recipient;
    String status;
    String type;

    public Card()
    {
    }

    public DeletedCard delete()
    {
        return delete((RequestOptions)null);
    }

    public DeletedCard delete(RequestOptions requestoptions)
    {
        return (DeletedCard)request(com.stripe.net.APIResource.RequestMethod.DELETE, getInstanceURL(), null, com/stripe/model/DeletedCard, requestoptions);
    }

    public DeletedCard delete(String s)
    {
        return delete(RequestOptions.builder().setApiKey(s).build());
    }

    public volatile DeletedExternalAccount delete()
    {
        return delete();
    }

    public volatile DeletedExternalAccount delete(RequestOptions requestoptions)
    {
        return delete(requestoptions);
    }

    public String getAddressCity()
    {
        return addressCity;
    }

    public String getAddressCountry()
    {
        return addressCountry;
    }

    public String getAddressLine1()
    {
        return addressLine1;
    }

    public String getAddressLine1Check()
    {
        return addressLine1Check;
    }

    public String getAddressLine2()
    {
        return addressLine2;
    }

    public String getAddressState()
    {
        return addressState;
    }

    public String getAddressZip()
    {
        return addressZip;
    }

    public String getAddressZipCheck()
    {
        return addressZipCheck;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getCountry()
    {
        return country;
    }

    public String getCvcCheck()
    {
        return cvcCheck;
    }

    public String getDynamicLast4()
    {
        return dynamicLast4;
    }

    public Integer getExpMonth()
    {
        return expMonth;
    }

    public Integer getExpYear()
    {
        return expYear;
    }

    public String getFingerprint()
    {
        return fingerprint;
    }

    public String getFunding()
    {
        return funding;
    }

    public String getInstanceURL()
    {
        String s = super.getInstanceURL();
        if (s != null)
        {
            return s;
        }
        if (getRecipient() != null)
        {
            return String.format("%s/%s/cards/%s", new Object[] {
                classURL(com/stripe/model/Recipient), getRecipient(), getId()
            });
        } else
        {
            return null;
        }
    }

    public String getLast4()
    {
        return last4;
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public String getName()
    {
        return name;
    }

    public String getRecipient()
    {
        return recipient;
    }

    public String getStatus()
    {
        return status;
    }

    public String getType()
    {
        return type;
    }

    public void setAddressCity(String s)
    {
        addressCity = s;
    }

    public void setAddressCountry(String s)
    {
        addressCountry = s;
    }

    public void setAddressLine1(String s)
    {
        addressLine1 = s;
    }

    public void setAddressLine1Check(String s)
    {
        addressLine1Check = s;
    }

    public void setAddressLine2(String s)
    {
        addressLine2 = s;
    }

    public void setAddressState(String s)
    {
        addressState = s;
    }

    public void setAddressZip(String s)
    {
        addressZip = s;
    }

    public void setAddressZipCheck(String s)
    {
        addressZipCheck = s;
    }

    public void setBrand(String s)
    {
        brand = s;
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setCvcCheck(String s)
    {
        cvcCheck = s;
    }

    public void setDynamicLast4(String s)
    {
        dynamicLast4 = s;
    }

    public void setExpMonth(Integer integer)
    {
        expMonth = integer;
    }

    public void setExpYear(Integer integer)
    {
        expYear = integer;
    }

    public void setFingerprint(String s)
    {
        fingerprint = s;
    }

    public void setFunding(String s)
    {
        funding = s;
    }

    public void setLast4(String s)
    {
        last4 = s;
    }

    public void setMetadata(Map map)
    {
        metadata = map;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setRecipient(String s)
    {
        recipient = s;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public Card update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public Card update(Map map, RequestOptions requestoptions)
    {
        return (Card)request(com.stripe.net.APIResource.RequestMethod.POST, getInstanceURL(), map, com/stripe/model/Card, requestoptions);
    }

    public Card update(Map map, String s)
    {
        return update(map, RequestOptions.builder().setApiKey(s).build());
    }

    public volatile ExternalAccount update(Map map)
    {
        return update(map);
    }

    public volatile ExternalAccount update(Map map, RequestOptions requestoptions)
    {
        return update(map, requestoptions);
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
