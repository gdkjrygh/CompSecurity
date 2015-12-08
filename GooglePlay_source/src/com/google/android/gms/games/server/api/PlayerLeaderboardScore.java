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
//            LeaderboardScoreRank

public final class PlayerLeaderboardScore extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public PlayerLeaderboardScore()
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

    public final LeaderboardScoreRank getPublicRank()
    {
        return (LeaderboardScoreRank)mConcreteTypes.get("publicRank");
    }

    public final LeaderboardScoreRank getSocialRank()
    {
        return (LeaderboardScoreRank)mConcreteTypes.get("socialRank");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("publicRank", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("publicRank", com/google/android/gms/games/server/api/LeaderboardScoreRank));
        sFields.put("scoreString", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("display_score"));
        sFields.put("scoreTag", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("score_tag"));
        sFields.put("scoreValue", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("raw_score"));
        sFields.put("socialRank", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("socialRank", com/google/android/gms/games/server/api/LeaderboardScoreRank));
        sFields.put("writeTimestamp", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("achieved_timestamp"));
    }
}
