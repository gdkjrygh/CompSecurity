// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.services.now.model:
//            Card

public final class ListCardsResponse extends GenericJson
{

    private List cards;
    private String nextPageToken;

    public ListCardsResponse()
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

    public ListCardsResponse clone()
    {
        return (ListCardsResponse)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public List getCards()
    {
        return cards;
    }

    public String getNextPageToken()
    {
        return nextPageToken;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public ListCardsResponse set(String s, Object obj)
    {
        return (ListCardsResponse)super.set(s, obj);
    }

    public ListCardsResponse setCards(List list)
    {
        cards = list;
        return this;
    }

    public ListCardsResponse setNextPageToken(String s)
    {
        nextPageToken = s;
        return this;
    }

    static 
    {
        Data.nullOf(com/google/api/services/now/model/Card);
    }
}
