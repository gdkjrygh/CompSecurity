// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.games.server.converter.CapabilityConverter;
import com.google.android.gms.games.server.converter.ParticipantStatusConverter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            AnonymousPlayer, RoomClientAddress, Player

public final class RoomParticipant extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public RoomParticipant()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final AnonymousPlayer getAutoMatchedPlayer()
    {
        return (AnonymousPlayer)mConcreteTypes.get("autoMatchedPlayer");
    }

    public final RoomClientAddress getClientAddress()
    {
        return (RoomClientAddress)mConcreteTypes.get("clientAddress");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final String getId()
    {
        return (String)super.mValues.get("external_participant_id");
    }

    public final Player getPlayer()
    {
        return (Player)mConcreteTypes.get("player");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    public final Boolean isConnected()
    {
        return (Boolean)super.mValues.get("connected");
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("autoMatchedPlayer", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("autoMatchedPlayer", com/google/android/gms/games/server/api/AnonymousPlayer));
        sFields.put("capabilities", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("capabilities", com/google/android/gms/games/server/converter/CapabilityConverter, true));
        sFields.put("clientAddress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("clientAddress", com/google/android/gms/games/server/api/RoomClientAddress));
        sFields.put("connected", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("connected"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_participant_id"));
        sFields.put("player", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("player", com/google/android/gms/games/server/api/Player));
        sFields.put("status", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("player_status", com/google/android/gms/games/server/converter/ParticipantStatusConverter, false));
    }
}
