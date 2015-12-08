// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class EventUpdateRequest extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public EventUpdateRequest()
    {
    }

    public EventUpdateRequest(String s, Long long1)
    {
        if (s != null)
        {
            setString("definitionId", s);
        }
        if (long1 != null)
        {
            setLong("updateCount", long1.longValue());
        }
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("definitionId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("definitionId"));
        sFields.put("updateCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("updateCount"));
    }
}
