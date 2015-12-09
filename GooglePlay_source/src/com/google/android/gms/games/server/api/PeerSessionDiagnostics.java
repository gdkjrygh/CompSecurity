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
//            PeerChannelDiagnostics

public final class PeerSessionDiagnostics extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes;

    public PeerSessionDiagnostics()
    {
        mConcreteTypes = new HashMap();
    }

    public PeerSessionDiagnostics(Long long1, String s, PeerChannelDiagnostics peerchanneldiagnostics, PeerChannelDiagnostics peerchanneldiagnostics1)
    {
        mConcreteTypes = new HashMap();
        if (long1 != null)
        {
            setLong("connectedTimestampMillis", long1.longValue());
        }
        if (s != null)
        {
            setString("participantId", s);
        }
        if (peerchanneldiagnostics != null)
        {
            addConcreteType("reliableChannel", peerchanneldiagnostics);
        }
        if (peerchanneldiagnostics1 != null)
        {
            addConcreteType("unreliableChannel", peerchanneldiagnostics1);
        }
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final PeerChannelDiagnostics getReliableChannel()
    {
        return (PeerChannelDiagnostics)mConcreteTypes.get("reliableChannel");
    }

    public final PeerChannelDiagnostics getUnreliableChannel()
    {
        return (PeerChannelDiagnostics)mConcreteTypes.get("unreliableChannel");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("connectedTimestampMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("connectedTimestampMillis"));
        sFields.put("participantId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("participantId"));
        sFields.put("reliableChannel", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("reliableChannel", com/google/android/gms/games/server/api/PeerChannelDiagnostics));
        sFields.put("unreliableChannel", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("unreliableChannel", com/google/android/gms/games/server/api/PeerChannelDiagnostics));
    }
}
