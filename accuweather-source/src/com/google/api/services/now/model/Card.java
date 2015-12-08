// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

// Referenced classes of package com.google.api.services.now.model:
//            CardContent, CardContexts

public final class Card extends GenericJson
{

    private String cardId;
    private CardContent content;
    private CardContexts contexts;

    public Card()
    {
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public Card clone()
    {
        return (Card)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public String getCardId()
    {
        return cardId;
    }

    public CardContent getContent()
    {
        return content;
    }

    public CardContexts getContexts()
    {
        return contexts;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public Card set(String s, Object obj)
    {
        return (Card)super.set(s, obj);
    }

    public Card setCardId(String s)
    {
        cardId = s;
        return this;
    }

    public Card setContent(CardContent cardcontent)
    {
        content = cardcontent;
        return this;
    }

    public Card setContexts(CardContexts cardcontexts)
    {
        contexts = cardcontexts;
        return this;
    }
}
