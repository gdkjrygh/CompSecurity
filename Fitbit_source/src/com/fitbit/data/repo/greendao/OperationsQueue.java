// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;


public class OperationsQueue
{

    private Boolean error;
    private Long foreignId;
    private Long id;
    private String tableName;
    private Integer type;

    public OperationsQueue()
    {
    }

    public OperationsQueue(Long long1)
    {
        id = long1;
    }

    public OperationsQueue(Long long1, Long long2, String s, Integer integer, Boolean boolean1)
    {
        id = long1;
        foreignId = long2;
        tableName = s;
        type = integer;
        error = boolean1;
    }

    public Boolean getError()
    {
        return error;
    }

    public Long getForeignId()
    {
        return foreignId;
    }

    public Long getId()
    {
        return id;
    }

    public String getTableName()
    {
        return tableName;
    }

    public Integer getType()
    {
        return type;
    }

    public void setError(Boolean boolean1)
    {
        error = boolean1;
    }

    public void setForeignId(Long long1)
    {
        foreignId = long1;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setTableName(String s)
    {
        tableName = s;
    }

    public void setType(Integer integer)
    {
        type = integer;
    }
}
