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
//            PeerSessionDiagnostics

public final class RoomLeaveDiagnostics extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypeArrays;

    public RoomLeaveDiagnostics()
    {
        mConcreteTypeArrays = new HashMap();
    }

    public RoomLeaveDiagnostics(Integer integer, Integer integer1, String s, String s1, ArrayList arraylist, Boolean boolean1)
    {
        mConcreteTypeArrays = new HashMap();
        if (integer != null)
        {
            setInteger("androidNetworkSubtype", integer.intValue());
        }
        if (integer1 != null)
        {
            setInteger("androidNetworkType", integer1.intValue());
        }
        if (s != null)
        {
            setString("networkOperatorCode", s);
        }
        if (s1 != null)
        {
            setString("networkOperatorName", s1);
        }
        addConcreteTypeArray("peerSession", arraylist);
        if (boolean1 != null)
        {
            setBoolean("socketsUsed", boolean1.booleanValue());
        }
    }

    public final void addConcreteTypeArray(String s, ArrayList arraylist)
    {
        mConcreteTypeArrays.put(s, arraylist);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final ArrayList getPeerSession()
    {
        return (ArrayList)mConcreteTypeArrays.get("peerSession");
    }

    protected final boolean isConcreteTypeArrayFieldSet(String s)
    {
        return mConcreteTypeArrays.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("androidNetworkSubtype", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("androidNetworkSubtype"));
        sFields.put("androidNetworkType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("androidNetworkType"));
        sFields.put("iosNetworkType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("iosNetworkType"));
        sFields.put("networkOperatorCode", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("networkOperatorCode"));
        sFields.put("networkOperatorName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("networkOperatorName"));
        sFields.put("peerSession", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("peerSession", com/google/android/gms/games/server/api/PeerSessionDiagnostics));
        sFields.put("socketsUsed", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("socketsUsed"));
    }
}
