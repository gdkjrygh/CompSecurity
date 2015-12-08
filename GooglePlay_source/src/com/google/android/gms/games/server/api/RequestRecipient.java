// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.games.server.converter.RequestRecipientStatusConverter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            Player

public final class RequestRecipient extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public RequestRecipient()
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

    public final Player getRecipientPlayer()
    {
        return (Player)mConcreteTypes.get("recipientPlayer");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("recipientPlayer", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("recipientPlayer", com/google/android/gms/games/server/api/Player));
        sFields.put("status", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("recipient_status", com/google/android/gms/games/server/converter/RequestRecipientStatusConverter, false));
    }
}
