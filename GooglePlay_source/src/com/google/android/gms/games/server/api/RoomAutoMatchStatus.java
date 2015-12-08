// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class RoomAutoMatchStatus extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public RoomAutoMatchStatus()
    {
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final Integer getWaitEstimateSeconds()
    {
        return (Integer)super.mValues.get("waitEstimateSeconds");
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("waitEstimateSeconds", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("waitEstimateSeconds"));
    }
}
