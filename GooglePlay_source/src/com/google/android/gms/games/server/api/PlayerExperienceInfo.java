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
//            PlayerLevel

public final class PlayerExperienceInfo extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public PlayerExperienceInfo()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final PlayerLevel getCurrentLevel()
    {
        return (PlayerLevel)mConcreteTypes.get("currentLevel");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final PlayerLevel getNextLevel()
    {
        return (PlayerLevel)mConcreteTypes.get("nextLevel");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("currentExperiencePoints", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("currentExperiencePoints"));
        sFields.put("currentLevel", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("currentLevel", com/google/android/gms/games/server/api/PlayerLevel));
        sFields.put("lastLevelUpTimestampMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("lastLevelUpTimestampMillis"));
        sFields.put("nextLevel", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("nextLevel", com/google/android/gms/games/server/api/PlayerLevel));
    }
}
