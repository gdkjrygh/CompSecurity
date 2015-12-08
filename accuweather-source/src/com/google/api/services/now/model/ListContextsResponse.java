// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.services.now.model:
//            Context

public final class ListContextsResponse extends GenericJson
{

    private List contexts;
    private String nextPageToken;

    public ListContextsResponse()
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

    public ListContextsResponse clone()
    {
        return (ListContextsResponse)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public List getContexts()
    {
        return contexts;
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

    public ListContextsResponse set(String s, Object obj)
    {
        return (ListContextsResponse)super.set(s, obj);
    }

    public ListContextsResponse setContexts(List list)
    {
        contexts = list;
        return this;
    }

    public ListContextsResponse setNextPageToken(String s)
    {
        nextPageToken = s;
        return this;
    }

    static 
    {
        Data.nullOf(com/google/api/services/now/model/Context);
    }
}
