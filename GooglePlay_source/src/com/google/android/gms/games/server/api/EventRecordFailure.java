// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class EventRecordFailure extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public EventRecordFailure()
    {
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("eventId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("eventId"));
        sFields.put("failureCause", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("failureCause"));
    }
}
