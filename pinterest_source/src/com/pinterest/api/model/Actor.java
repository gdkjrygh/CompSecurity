// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import java.util.Date;

// Referenced classes of package com.pinterest.api.model:
//            Model

public class Actor extends Model
{

    private Date cacheExpirationDate;
    private Long id;
    private Integer type;
    private String uid;

    public Actor()
    {
    }

    public Actor(Long long1)
    {
        id = long1;
    }

    public Actor(Long long1, String s, Date date, Integer integer)
    {
        id = long1;
        uid = s;
        cacheExpirationDate = date;
        type = integer;
    }

    public Date getCacheExpirationDate()
    {
        return cacheExpirationDate;
    }

    public Long getId()
    {
        return id;
    }

    public Integer getType()
    {
        return type;
    }

    public String getUid()
    {
        return uid;
    }

    public void setCacheExpirationDate(Date date)
    {
        cacheExpirationDate = date;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setType(Integer integer)
    {
        type = integer;
    }

    public void setUid(String s)
    {
        uid = s;
    }
}
