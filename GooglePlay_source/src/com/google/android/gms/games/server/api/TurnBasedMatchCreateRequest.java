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
//            TurnBasedAutoMatchingCriteria

public final class TurnBasedMatchCreateRequest extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes;

    public TurnBasedMatchCreateRequest()
    {
        mConcreteTypes = new HashMap();
    }

    public TurnBasedMatchCreateRequest(TurnBasedAutoMatchingCriteria turnbasedautomatchingcriteria, ArrayList arraylist, Long long1, Integer integer)
    {
        mConcreteTypes = new HashMap();
        if (turnbasedautomatchingcriteria != null)
        {
            addConcreteType("autoMatchingCriteria", turnbasedautomatchingcriteria);
        }
        if (arraylist != null)
        {
            setStrings("invitedPlayerIds", arraylist);
        }
        if (long1 != null)
        {
            setLong("requestId", long1.longValue());
        }
        if (integer != null)
        {
            setInteger("variant", integer.intValue());
        }
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final TurnBasedAutoMatchingCriteria getAutoMatchingCriteria()
    {
        return (TurnBasedAutoMatchingCriteria)mConcreteTypes.get("autoMatchingCriteria");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("autoMatchingCriteria", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("autoMatchingCriteria", com/google/android/gms/games/server/api/TurnBasedAutoMatchingCriteria));
        sFields.put("invitedPlayerIds", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("invitedPlayerIds"));
        sFields.put("requestId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("requestId"));
        sFields.put("variant", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("variant"));
    }
}
