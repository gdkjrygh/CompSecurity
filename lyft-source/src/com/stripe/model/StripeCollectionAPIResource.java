// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import java.util.List;

public abstract class StripeCollectionAPIResource extends APIResource
{

    Integer count;
    List data;
    Boolean hasMore;
    Integer totalCount;
    String url;

    public StripeCollectionAPIResource()
    {
    }

    public Integer getCount()
    {
        return count;
    }

    public List getData()
    {
        return data;
    }

    public Boolean getHasMore()
    {
        return hasMore;
    }

    public Integer getTotalCount()
    {
        return totalCount;
    }

    public String getURL()
    {
        return url;
    }

    public void setCount(Integer integer)
    {
        count = integer;
    }

    public void setData(List list)
    {
        data = list;
    }

    public void setHasMore(Boolean boolean1)
    {
        hasMore = boolean1;
    }

    public void setTotalCount(Integer integer)
    {
        totalCount = integer;
    }

    public void setURL(String s)
    {
        url = s;
    }
}
