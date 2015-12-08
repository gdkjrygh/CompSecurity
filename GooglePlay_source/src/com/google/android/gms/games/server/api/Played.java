// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class Played extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public Played()
    {
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final Long getTimeMillis()
    {
        return (Long)super.mValues.get("timeMillis");
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("applicationIconUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("applicationIconUrl"));
        sFields.put("applicationId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("applicationId"));
        sFields.put("autoMatched", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("autoMatched"));
        sFields.put("timeMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("timeMillis"));
    }
}
