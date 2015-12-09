// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.games.server.converter.RequestStatusConverter;
import com.google.android.gms.games.server.converter.RequestTypeConverter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.games.server.api:
//            InboundRequestInfo, OutboundRequestInfo

public final class Request extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;
    private final HashMap mConcreteTypes = new HashMap();

    public Request()
    {
    }

    public final void addConcreteType(String s, FastJsonResponse fastjsonresponse)
    {
        mConcreteTypes.put(s, fastjsonresponse);
    }

    public final String getApplicationId()
    {
        return (String)super.mValues.get("external_game_id");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final String getId()
    {
        return (String)super.mValues.get("external_request_id");
    }

    public final InboundRequestInfo getInboundRequestInfo()
    {
        return (InboundRequestInfo)mConcreteTypes.get("inboundRequestInfo");
    }

    public final OutboundRequestInfo getOutboundRequestInfo()
    {
        return (OutboundRequestInfo)mConcreteTypes.get("outboundRequestInfo");
    }

    public final Integer getStatus()
    {
        return (Integer)super.mValues.get("status");
    }

    protected final boolean isConcreteTypeFieldSet(String s)
    {
        return mConcreteTypes.containsKey(s);
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("applicationId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_game_id"));
        sFields.put("creationTimestampMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("creation_timestamp"));
        sFields.put("expiresAfterTimestampMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forLong("expiration_timestamp"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("external_request_id"));
        sFields.put("inboundRequestInfo", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("inboundRequestInfo", com/google/android/gms/games/server/api/InboundRequestInfo));
        sFields.put("outboundRequestInfo", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("outboundRequestInfo", com/google/android/gms/games/server/api/OutboundRequestInfo));
        sFields.put("payload", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBase64UrlSafe("data"));
        sFields.put("status", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("status", com/google/android/gms/games/server/converter/RequestStatusConverter, false));
        sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("type", com/google/android/gms/games/server/converter/RequestTypeConverter, false));
    }
}
