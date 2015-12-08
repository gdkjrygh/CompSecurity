// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            PlayerLevel

public final class MetagameConfig extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays = new HashMap();

    public MetagameConfig()
    {
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final Integer getCurrentVersion()
    {
        return (Integer)super.mValues.get("currentVersion");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getPlayerLevels()
    {
        return (ArrayList)mConcreteTypeArrays.get("playerLevels");
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("currentVersion", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("currentVersion"));
        sFields.put("playerLevels", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("playerLevels", com/google/android/gms/games/server/api/PlayerLevel));
    }
}
