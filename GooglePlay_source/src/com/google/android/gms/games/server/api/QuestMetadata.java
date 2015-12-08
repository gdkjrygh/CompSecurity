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
//            Quest

public final class QuestMetadata extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public QuestMetadata()
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

    public final Quest getQuest()
    {
        return (Quest)mConcreteTypes.get("quest");
    }

    public final String getType()
    {
        return (String)super.mValues.get("type");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("expiredApplicationId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("expiredApplicationId"));
        sFields.put("quest", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("quest", com/google/android/gms/games/server/api/Quest));
        sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("type"));
    }
}
