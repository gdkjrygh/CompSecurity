// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            Player

public final class LeaderboardEntry extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public LeaderboardEntry()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final Player getPlayer()
    {
        return (Player)mConcreteTypes.get("player");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("formattedScore", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("display_score"));
        sFields.put("formattedScoreRank", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("display_rank"));
        sFields.put("player", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("player", com/google/android/gms/games/server/api/Player));
        sFields.put("scoreRank", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("rank"));
        sFields.put("scoreTag", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("score_tag"));
        sFields.put("scoreValue", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("raw_score"));
        sFields.put("writeTimestampMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("achieved_timestamp"));
    }
}
