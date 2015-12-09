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
//            TurnBasedMatch

public final class TurnBasedMatchRematch extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public TurnBasedMatchRematch()
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

    public final TurnBasedMatch getPreviousMatch()
    {
        return (TurnBasedMatch)mConcreteTypes.get("previousMatch");
    }

    public final TurnBasedMatch getRematch()
    {
        return (TurnBasedMatch)mConcreteTypes.get("rematch");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("previousMatch", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("previousMatch", com/google/android/gms/games/server/api/TurnBasedMatch));
        sFields.put("rematch", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("rematch", com/google/android/gms/games/server/api/TurnBasedMatch));
    }
}
