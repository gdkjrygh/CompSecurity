// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class EventPeriodRange extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public EventPeriodRange()
    {
    }

    public EventPeriodRange(Long long1, Long long2)
    {
        if (long1 != null)
        {
            setLong("periodEndMillis", long1.longValue());
        }
        if (long2 != null)
        {
            setLong("periodStartMillis", long2.longValue());
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
        treemap.put("periodEndMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("periodEndMillis"));
        sFields.put("periodStartMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("periodStartMillis"));
    }
}
