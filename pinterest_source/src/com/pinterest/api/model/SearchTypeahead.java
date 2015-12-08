// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import java.util.Date;

// Referenced classes of package com.pinterest.api.model:
//            Model

public class SearchTypeahead extends Model
{

    private Date cacheExpirationDate;
    private Long id;
    private String query;
    private Float score;

    public SearchTypeahead()
    {
    }

    public SearchTypeahead(Long long1, String s)
    {
        id = long1;
        query = s;
    }

    public SearchTypeahead(Long long1, Date date, String s, Float float1)
    {
        id = long1;
        cacheExpirationDate = date;
        query = s;
        score = float1;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public Long getId()
    {
        return id;
    }

    public String getQuery()
    {
        return query;
    }

    public Float getScore()
    {
        return score;
    }

    public String getUid()
    {
        return null;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setQuery(String s)
    {
        query = s;
    }

    public void setScore(Float float1)
    {
        score = float1;
    }
}
