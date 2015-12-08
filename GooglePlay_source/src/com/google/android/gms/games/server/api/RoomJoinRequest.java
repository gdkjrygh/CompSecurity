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
//            RoomClientAddress, NetworkDiagnostics

public final class RoomJoinRequest extends FastMapJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes;

    public RoomJoinRequest()
    {
        mConcreteTypes = new HashMap();
    }

    public RoomJoinRequest(ArrayList arraylist, RoomClientAddress roomclientaddress, NetworkDiagnostics networkdiagnostics)
    {
        mConcreteTypes = new HashMap();
        if (arraylist != null)
        {
            setStrings("capabilities", arraylist);
        }
        addConcreteType("clientAddress", roomclientaddress);
        if (networkdiagnostics != null)
        {
            addConcreteType("networkDiagnostics", networkdiagnostics);
        }
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
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
        treemap.put("capabilities", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("capabilities"));
        sFields.put("clientAddress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("clientAddress", com/google/android/gms/games/server/api/RoomClientAddress));
        sFields.put("networkDiagnostics", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("networkDiagnostics", com/google/android/gms/games/server/api/NetworkDiagnostics));
    }
}
