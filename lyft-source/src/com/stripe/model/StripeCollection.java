// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import java.util.List;

// Referenced classes of package com.stripe.model:
//            StripeObject

public abstract class StripeCollection extends StripeObject
{

    Integer count;
    List data;
    Boolean hasMore;
    Integer totalCount;
    String url;

    public StripeCollection()
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

    public String getUrl()
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

    public void setUrl(String s)
    {
        url = s;
    }
}
