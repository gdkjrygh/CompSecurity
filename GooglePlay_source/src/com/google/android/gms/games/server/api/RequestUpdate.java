// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class RequestUpdate extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public RequestUpdate()
    {
    }

    public RequestUpdate(String s, Long long1, String s1)
    {
        if (s != null)
        {
            setString("id", s);
        }
        if (long1 != null)
        {
            setLong("updateId", long1.longValue());
        }
        setString("updateType", s1);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final String getId()
    {
        return (String)super.mValues.get("id");
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("id"));
        sFields.put("updateId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("updateId"));
        sFields.put("updateType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("updateType"));
    }
}
