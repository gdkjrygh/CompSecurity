// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;


public class TimeZone
{

    private Integer entityStatus;
    private Long id;
    private String name;
    private Long offset;
    private Long serverId;
    private String timeZoneId;

    public TimeZone()
    {
    }

    public TimeZone(Long long1)
    {
        id = long1;
    }

    public TimeZone(Long long1, Long long2, String s, String s1, Long long3, Integer integer)
    {
        id = long1;
        serverId = long2;
        timeZoneId = s;
        name = s1;
        offset = long3;
        entityStatus = integer;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public Long getOffset()
    {
        return offset;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public String getTimeZoneId()
    {
        return timeZoneId;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setOffset(Long long1)
    {
        offset = long1;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setTimeZoneId(String s)
    {
        timeZoneId = s;
    }
}
