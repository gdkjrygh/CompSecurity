// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            ApplicationExplanation, Application, MarketApplication, Snapshot

public final class FirstPartyApplication extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public FirstPartyApplication()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final ApplicationExplanation getExplanation()
    {
        return (ApplicationExplanation)mConcreteTypes.get("explanation");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final Application getGamesData()
    {
        return (Application)mConcreteTypes.get("gamesData");
    }

    public final MarketApplication getMarketData()
    {
        return (MarketApplication)mConcreteTypes.get("marketData");
    }

    public final Snapshot getSnapshot()
    {
        return (Snapshot)mConcreteTypes.get("snapshot");
    }

    public final Integer getUnlockedAchievementCount()
    {
        return (Integer)super.mValues.get("unlockedAchievementCount");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("explanation", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("explanation", com/google/android/gms/games/server/api/ApplicationExplanation));
        sFields.put("formattedLastPlayedTime", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("formattedLastPlayedTime"));
        sFields.put("gamesData", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("gamesData", com/google/android/gms/games/server/api/Application));
        sFields.put("lastPlayedTimeMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("lastPlayedTimeMillis"));
        sFields.put("marketData", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("marketData", com/google/android/gms/games/server/api/MarketApplication));
        sFields.put("snapshot", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("snapshot", com/google/android/gms/games/server/api/Snapshot));
        sFields.put("unlockedAchievementCount", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("unlockedAchievementCount"));
    }
}
