// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class StatsResponse extends FastContentValuesJsonResponse
{

    public static final TreeMap sFields;

    public StatsResponse()
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
        treemap.put("avg_session_length_minutes", com.google.android.gms.common.server.response.FastJsonResponse.Field.forFloat("ave_session_length_minutes"));
        sFields.put("churn_probability", com.google.android.gms.common.server.response.FastJsonResponse.Field.forFloat("churn_probability"));
        sFields.put("days_since_last_played", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("days_since_last_played"));
        sFields.put("num_purchases", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("num_purchases"));
        sFields.put("num_sessions", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("num_sessions"));
        sFields.put("num_sessions_percentile", com.google.android.gms.common.server.response.FastJsonResponse.Field.forFloat("num_sessions_percentile"));
        sFields.put("spend_percentile", com.google.android.gms.common.server.response.FastJsonResponse.Field.forFloat("spend_percentile"));
    }
}
