// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.jsonstore.api;

import com.worklight.jsonstore.database.QueryPartOperation;

public class JSONStoreQueryPartItem
{

    private boolean isKeySpecial;
    private String key;
    private QueryPartOperation operation;
    private Object val;

    JSONStoreQueryPartItem(String s, boolean flag, QueryPartOperation querypartoperation, Object obj)
        throws IllegalArgumentException
    {
        if (s == null || s.isEmpty())
        {
            throw new IllegalArgumentException("key parameter cannot be null or empty");
        }
        if (obj == null)
        {
            throw new IllegalArgumentException("value parameter cannot be null");
        }
        QueryPartOperation querypartoperation1 = querypartoperation;
        if (querypartoperation == null)
        {
            querypartoperation1 = QueryPartOperation.FUZZY_EQUALS;
        }
        key = s;
        isKeySpecial = flag;
        operation = querypartoperation1;
        val = obj;
    }

    public String getKey()
    {
        return key;
    }

    public QueryPartOperation getOperation()
    {
        return operation;
    }

    public Object getValue()
    {
        return val;
    }

    public boolean isKeySpecial()
    {
        return isKeySpecial;
    }
}
