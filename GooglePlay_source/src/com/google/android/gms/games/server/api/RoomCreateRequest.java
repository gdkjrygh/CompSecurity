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
//            RoomAutoMatchingCriteria, RoomClientAddress, NetworkDiagnostics

public final class RoomCreateRequest extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes;

    public RoomCreateRequest()
    {
        mConcreteTypes = new HashMap();
    }

    public RoomCreateRequest(RoomAutoMatchingCriteria roomautomatchingcriteria, ArrayList arraylist, RoomClientAddress roomclientaddress, ArrayList arraylist1, NetworkDiagnostics networkdiagnostics, Long long1, Integer integer)
    {
        mConcreteTypes = new HashMap();
        if (roomautomatchingcriteria != null)
        {
            addConcreteType("autoMatchingCriteria", roomautomatchingcriteria);
        }
        if (arraylist != null)
        {
            setStrings("capabilities", arraylist);
        }
        if (roomclientaddress != null)
        {
            addConcreteType("clientAddress", roomclientaddress);
        }
        if (arraylist1 != null)
        {
            setStrings("invitedPlayerIds", arraylist1);
        }
        if (networkdiagnostics != null)
        {
            addConcreteType("networkDiagnostics", networkdiagnostics);
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

    public final RoomAutoMatchingCriteria getAutoMatchingCriteria()
    {
        return (RoomAutoMatchingCriteria)mConcreteTypes.get("autoMatchingCriteria");
    }

    public final RoomClientAddress getClientAddress()
    {
        return (RoomClientAddress)mConcreteTypes.get("clientAddress");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final NetworkDiagnostics getNetworkDiagnostics()
    {
        return (NetworkDiagnostics)mConcreteTypes.get("networkDiagnostics");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("autoMatchingCriteria", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("autoMatchingCriteria", com/google/android/gms/games/server/api/RoomAutoMatchingCriteria));
        sFields.put("capabilities", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("capabilities"));
        sFields.put("clientAddress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("clientAddress", com/google/android/gms/games/server/api/RoomClientAddress));
        sFields.put("invitedPlayerIds", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("invitedPlayerIds"));
        sFields.put("networkDiagnostics", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("networkDiagnostics", com/google/android/gms/games/server/api/NetworkDiagnostics));
        sFields.put("requestId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("requestId"));
        sFields.put("variant", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("variant"));
    }
}
