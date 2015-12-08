// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            MetadataStore, RecipientCollection, Card, DeletedRecipient, 
//            BankAccount, RecipientCardCollection

public class Recipient extends APIResource
    implements MetadataStore
{

    BankAccount activeAccount;
    RecipientCardCollection cards;
    Long created;
    String defaultCard;
    Boolean deleted;
    String description;
    String email;
    String id;
    Boolean livemode;
    Map metadata;
    String name;
    String type;
    Boolean verified;

    public Recipient()
    {
    }

    public static RecipientCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static RecipientCollection all(Map map, RequestOptions requestoptions)
    {
        return (RecipientCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Recipient), map, com/stripe/model/RecipientCollection, requestoptions);
    }

    public static RecipientCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Recipient create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public static Recipient create(Map map, RequestOptions requestoptions)
    {
        return (Recipient)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Recipient), map, com/stripe/model/Recipient, requestoptions);
    }

    public static Recipient create(Map map, String s)
    {
        return create(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Recipient retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static Recipient retrieve(String s, RequestOptions requestoptions)
    {
        return (Recipient)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Recipient, s), null, com/stripe/model/Recipient, requestoptions);
    }

    public static Recipient retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public Card createCard(String s)
    {
        return createCard(s, (RequestOptions)null);
    }

    public Card createCard(String s, RequestOptions requestoptions)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("card", s);
        return createCard(((Map) (hashmap)), requestoptions);
    }

    public Card createCard(String s, String s1)
    {
        return createCard(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public Card createCard(Map map)
    {
        return createCard(map, (RequestOptions)null);
    }

    public Card createCard(Map map, RequestOptions requestoptions)
    {
        return (Card)request(com.stripe.net.APIResource.RequestMethod.POST, String.format("%s/cards", new Object[] {
            instanceURL(com/stripe/model/Recipient, id)
        }), map, com/stripe/model/Card, requestoptions);
    }

    public Card createCard(Map map, String s)
    {
        return createCard(map, RequestOptions.builder().setApiKey(s).build());
    }

    public DeletedRecipient delete()
    {
        return delete((RequestOptions)null);
    }

    public DeletedRecipient delete(RequestOptions requestoptions)
    {
        return (DeletedRecipient)request(com.stripe.net.APIResource.RequestMethod.DELETE, instanceURL(com/stripe/model/Recipient, id), null, com/stripe/model/DeletedRecipient, requestoptions);
    }

    public DeletedRecipient delete(String s)
    {
        return delete(RequestOptions.builder().setApiKey(s).build());
    }

    public BankAccount getActiveAccount()
    {
        return activeAccount;
    }

    public RecipientCardCollection getCards()
    {
        return cards;
    }

    public Long getCreated()
    {
        return created;
    }

    public String getDefaultCard()
    {
        return defaultCard;
    }

    public Boolean getDeleted()
    {
        return deleted;
    }

    public String getDescription()
    {
        return description;
    }

    public String getEmail()
    {
        return email;
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

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public Boolean getVerified()
    {
        return verified;
    }

    public void setActiveAccount(BankAccount bankaccount)
    {
        activeAccount = bankaccount;
    }

    public void setCreated(Long long1)
    {
        created = long1;
    }

    public void setDefaultCard(String s)
    {
        defaultCard = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setEmail(String s)
    {
        email = s;
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

    public void setName(String s)
    {
        name = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setVerified(Boolean boolean1)
    {
        verified = boolean1;
    }

    public volatile MetadataStore update(Map map)
    {
        return update(map);
    }

    public volatile MetadataStore update(Map map, RequestOptions requestoptions)
    {
        return update(map, requestoptions);
    }

    public Recipient update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public Recipient update(Map map, RequestOptions requestoptions)
    {
        return (Recipient)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/Recipient, id), map, com/stripe/model/Recipient, requestoptions);
    }

    public Recipient update(Map map, String s)
    {
        return update(map, RequestOptions.builder().setApiKey(s).build());
    }
}
