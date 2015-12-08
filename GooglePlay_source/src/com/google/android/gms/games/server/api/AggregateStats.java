// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class AggregateStats extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public AggregateStats()
    {
    }

    public AggregateStats(Long long1, Long long2, Long long3, Long long4)
    {
        if (long1 != null)
        {
            setLong("count", long1.longValue());
        }
        if (long2 != null)
        {
            setLong("max", long2.longValue());
        }
        if (long3 != null)
        {
            setLong("min", long3.longValue());
        }
        if (long4 != null)
        {
            setLong("sum", long4.longValue());
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
        treemap.put("count", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("count"));
        sFields.put("max", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("max"));
        sFields.put("min", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("min"));
        sFields.put("sum", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("sum"));
    }
}
