// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class TurnBasedAutoMatchingCriteria extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public TurnBasedAutoMatchingCriteria()
    {
    }

    public TurnBasedAutoMatchingCriteria(Long long1, Integer integer, Integer integer1)
    {
        if (long1 != null)
        {
            setLong("exclusiveBitmask", long1.longValue());
        }
        if (integer != null)
        {
            setInteger("maxAutoMatchingPlayers", integer.intValue());
        }
        if (integer1 != null)
        {
            setInteger("minAutoMatchingPlayers", integer1.intValue());
        }
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final Integer getMaxAutoMatchingPlayers()
    {
        return (Integer)super.mValues.get("maxAutoMatchingPlayers");
    }

    public final Integer getMinAutoMatchingPlayers()
    {
        return (Integer)super.mValues.get("minAutoMatchingPlayers");
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("exclusiveBitmask", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("exclusiveBitmask"));
        sFields.put("maxAutoMatchingPlayers", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("maxAutoMatchingPlayers"));
        sFields.put("minAutoMatchingPlayers", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("minAutoMatchingPlayers"));
    }
}
