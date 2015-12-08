// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;


public class SyncJob
{

    private Integer action;
    private String groupUid;
    private Long id;
    private String key;
    private Integer type;
    private String uid;

    public SyncJob()
    {
    }

    public SyncJob(Long long1)
    {
        id = long1;
    }

    public SyncJob(Long long1, String s, Integer integer, Integer integer1, String s1, String s2)
    {
        id = long1;
        key = s;
        type = integer;
        action = integer1;
        uid = s1;
        groupUid = s2;
    }

    public Integer getAction()
    {
        return action;
    }

    public String getGroupUid()
    {
        return groupUid;
    }

    public Long getId()
    {
        return id;
    }

    public String getKey()
    {
        return key;
    }

    public Integer getType()
    {
        return type;
    }

    public String getUid()
    {
        return uid;
    }

    public void setAction(Integer integer)
    {
        action = integer;
    }

    public void setGroupUid(String s)
    {
        groupUid = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setKey(String s)
    {
        key = s;
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
