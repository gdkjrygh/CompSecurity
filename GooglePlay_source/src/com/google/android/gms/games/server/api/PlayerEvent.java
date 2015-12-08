// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class PlayerEvent extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;

    public PlayerEvent()
    {
    }

    public PlayerEvent(String s, Long long1)
    {
        setString("external_event_id", s);
        if (long1 != null)
        {
            setLong("value", long1.longValue());
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
        treemap.put("definitionId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_event_id"));
        sFields.put("numEvents", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("value"));
    }
}
