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
//            GamesAchievementIncrement, GamesAchievementSetStepsAtLeast

public final class AchievementUpdateRequest extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes;

    public AchievementUpdateRequest()
    {
        mConcreteTypes = new HashMap();
    }

    public AchievementUpdateRequest(String s, GamesAchievementIncrement gamesachievementincrement, GamesAchievementSetStepsAtLeast gamesachievementsetstepsatleast, String s1, String s2)
    {
        mConcreteTypes = new HashMap();
        if (s != null)
        {
            setString("achievementId", s);
        }
        if (gamesachievementincrement != null)
        {
            addConcreteType("incrementPayload", gamesachievementincrement);
        }
        if (gamesachievementsetstepsatleast != null)
        {
            addConcreteType("setStepsAtLeastPayload", gamesachievementsetstepsatleast);
        }
        setString("signature", s1);
        setString("updateType", s2);
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final GamesAchievementIncrement getIncrementPayload()
    {
        return (GamesAchievementIncrement)mConcreteTypes.get("incrementPayload");
    }

    public final GamesAchievementSetStepsAtLeast getSetStepsAtLeastPayload()
    {
        return (GamesAchievementSetStepsAtLeast)mConcreteTypes.get("setStepsAtLeastPayload");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("achievementId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("achievementId"));
        sFields.put("incrementPayload", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("incrementPayload", com/google/android/gms/games/server/api/GamesAchievementIncrement));
        sFields.put("setStepsAtLeastPayload", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("setStepsAtLeastPayload", com/google/android/gms/games/server/api/GamesAchievementSetStepsAtLeast));
        sFields.put("signature", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("signature"));
        sFields.put("updateType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("updateType"));
    }
}
