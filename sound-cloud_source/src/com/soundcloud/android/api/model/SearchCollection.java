// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.optional.Optional;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SearchCollection
    implements Iterable
{

    public static final String NEXT_LINK_REL = "next";
    private List collection;
    private Map links;
    private Urn queryUrn;

    public SearchCollection()
    {
        collection = Collections.emptyList();
        links = Collections.emptyMap();
    }

    public SearchCollection(List list)
    {
        collection = Collections.emptyList();
        links = Collections.emptyMap();
        collection = list;
    }

    public List getCollection()
    {
        return collection;
    }

    public Map getLinks()
    {
        return links;
    }

    public Optional getNextLink()
    {
        return Optional.fromNullable(links.get("next"));
    }

    public Optional getQueryUrn()
    {
        return Optional.fromNullable(queryUrn);
    }

    public Iterator iterator()
    {
        return collection.iterator();
    }

    public void setCollection(List list)
    {
        collection = list;
    }

    public void setLinks(Map map)
    {
        links = map;
    }

    public void setQueryUrn(String s)
    {
        queryUrn = new Urn(s);
    }
}
