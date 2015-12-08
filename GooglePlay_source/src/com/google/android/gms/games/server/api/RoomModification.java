// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class RoomModification extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public RoomModification()
    {
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final Long getModifiedTimestampMillis()
    {
        return (Long)super.mValues.get("modifiedTimestampMillis");
    }

    public final String getParticipantId()
    {
        return (String)super.mValues.get("participantId");
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("modifiedTimestampMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("modifiedTimestampMillis"));
        sFields.put("participantId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("participantId"));
    }
}
