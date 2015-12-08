// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.social;


public class CheerBadgeRelation
{

    private String badgeEncodedId;
    private Long id;
    private String userEncodedId;

    public CheerBadgeRelation()
    {
    }

    public CheerBadgeRelation(Long long1)
    {
        id = long1;
    }

    public CheerBadgeRelation(Long long1, String s, String s1)
    {
        id = long1;
        badgeEncodedId = s;
        userEncodedId = s1;
    }

    public String getBadgeEncodedId()
    {
        return badgeEncodedId;
    }

    public Long getId()
    {
        return id;
    }

    public String getUserEncodedId()
    {
        return userEncodedId;
    }

    public void setBadgeEncodedId(String s)
    {
        badgeEncodedId = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setUserEncodedId(String s)
    {
        userEncodedId = s;
    }
}
