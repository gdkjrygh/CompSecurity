// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public final class SendRequest extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public SendRequest()
    {
    }

    public SendRequest(String s, Integer integer, String s1, ArrayList arraylist, Long long1, String s2)
    {
        if (s != null)
        {
            setString("applicationId", s);
        }
        if (integer != null)
        {
            setInteger("expirationDurationDays", integer.intValue());
        }
        if (s1 != null)
        {
            setString("payload", s1);
        }
        if (arraylist != null)
        {
            setStrings("recipientPlayerIds", arraylist);
        }
        if (long1 != null)
        {
            setLong("requestId", long1.longValue());
        }
        if (s2 != null)
        {
            setString("requestType", s2);
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
        treemap.put("applicationId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("applicationId"));
        sFields.put("expirationDurationDays", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("expirationDurationDays"));
        sFields.put("payload", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("payload"));
        sFields.put("recipientPlayerIds", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("recipientPlayerIds"));
        sFields.put("requestDefinitionId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("requestDefinitionId"));
        sFields.put("requestId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("requestId"));
        sFields.put("requestType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("requestType"));
    }
}
