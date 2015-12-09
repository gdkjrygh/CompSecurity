// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            LeaderboardEntry

public final class LeaderboardScores extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();
    private final HashMap mConcreteTypes = new HashMap();

    public LeaderboardScores()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getItems()
    {
        return (ArrayList)mConcreteTypeArrays.get("items");
    }

    public final String getNextPageToken()
    {
        return (String)super.mValues.get("nextPageToken");
    }

    public final LeaderboardEntry getPlayerScore()
    {
        return (LeaderboardEntry)mConcreteTypes.get("playerScore");
    }

    public final String getPrevPageToken()
    {
        return (String)super.mValues.get("prevPageToken");
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("items", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("items", com/google/android/gms/games/server/api/LeaderboardEntry));
        sFields.put("nextPageToken", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("nextPageToken"));
        sFields.put("numScores", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("numScores"));
        sFields.put("playerScore", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("playerScore", com/google/android/gms/games/server/api/LeaderboardEntry));
        sFields.put("prevPageToken", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("prevPageToken"));
    }
}
