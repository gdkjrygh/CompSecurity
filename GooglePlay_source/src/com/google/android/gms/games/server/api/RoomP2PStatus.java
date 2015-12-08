// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class RoomP2PStatus extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public RoomP2PStatus()
    {
    }

    public RoomP2PStatus(Integer integer, String s, String s1, String s2, Integer integer1)
    {
        if (integer != null)
        {
            setInteger("connectionSetupLatencyMillis", integer.intValue());
        }
        if (s != null)
        {
            setString("error", s);
        }
        if (s1 != null)
        {
            setString("participantId", s1);
        }
        if (s2 != null)
        {
            setString("status", s2);
        }
        if (integer1 != null)
        {
            setInteger("unreliableRoundtripLatencyMillis", integer1.intValue());
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
        treemap.put("connectionSetupLatencyMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("connectionSetupLatencyMillis"));
        sFields.put("error", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("error"));
        sFields.put("error_reason", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("error_reason"));
        sFields.put("participantId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("participantId"));
        sFields.put("status", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("status"));
        sFields.put("unreliableRoundtripLatencyMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("unreliableRoundtripLatencyMillis"));
    }
}
