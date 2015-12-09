// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class ScoreSubmission extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public ScoreSubmission()
    {
    }

    public ScoreSubmission(String s, Long long1, String s1, String s2)
    {
        if (s != null)
        {
            setString("leaderboardId", s);
        }
        if (long1 != null)
        {
            setLong("score", long1.longValue());
        }
        if (s1 != null)
        {
            setString("scoreTag", s1);
        }
        if (s2 != null)
        {
            setString("signature", s2);
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
        treemap.put("leaderboardId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("leaderboardId"));
        sFields.put("score", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("score"));
        sFields.put("scoreTag", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("scoreTag"));
        sFields.put("signature", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("signature"));
    }
}
