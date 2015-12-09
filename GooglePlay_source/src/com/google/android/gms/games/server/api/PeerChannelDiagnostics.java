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
//            AggregateStats

public final class PeerChannelDiagnostics extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes;

    public PeerChannelDiagnostics()
    {
        mConcreteTypes = new HashMap();
    }

    public PeerChannelDiagnostics(AggregateStats aggregatestats, AggregateStats aggregatestats1, Integer integer, Integer integer1, Integer integer2, Integer integer3, AggregateStats aggregatestats2)
    {
        mConcreteTypes = new HashMap();
        if (aggregatestats != null)
        {
            addConcreteType("bytesReceived", aggregatestats);
        }
        if (aggregatestats1 != null)
        {
            addConcreteType("bytesSent", aggregatestats1);
        }
        if (integer != null)
        {
            setInteger("numMessagesLost", integer.intValue());
        }
        if (integer1 != null)
        {
            setInteger("numMessagesReceived", integer1.intValue());
        }
        if (integer2 != null)
        {
            setInteger("numMessagesSent", integer2.intValue());
        }
        if (integer3 != null)
        {
            setInteger("numSendFailures", integer3.intValue());
        }
        if (aggregatestats2 != null)
        {
            addConcreteType("roundtripLatencyMillis", aggregatestats2);
        }
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final AggregateStats getBytesReceived()
    {
        return (AggregateStats)mConcreteTypes.get("bytesReceived");
    }

    public final AggregateStats getBytesSent()
    {
        return (AggregateStats)mConcreteTypes.get("bytesSent");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final AggregateStats getRoundtripLatencyMillis()
    {
        return (AggregateStats)mConcreteTypes.get("roundtripLatencyMillis");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("bytesReceived", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("bytesReceived", com/google/android/gms/games/server/api/AggregateStats));
        sFields.put("bytesSent", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("bytesSent", com/google/android/gms/games/server/api/AggregateStats));
        sFields.put("numMessagesLost", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("numMessagesLost"));
        sFields.put("numMessagesReceived", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("numMessagesReceived"));
        sFields.put("numMessagesSent", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("numMessagesSent"));
        sFields.put("numSendFailures", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("numSendFailures"));
        sFields.put("roundtripLatencyMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("roundtripLatencyMillis", com/google/android/gms/games/server/api/AggregateStats));
    }
}
