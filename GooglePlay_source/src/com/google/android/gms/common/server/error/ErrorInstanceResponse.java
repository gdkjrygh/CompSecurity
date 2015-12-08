// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.error;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;

public class ErrorInstanceResponse extends FastMapJsonResponse
{

    private static final HashMap sFields;

    public ErrorInstanceResponse()
    {
    }

    public final volatile Map getFieldMappings()
    {
        return sFields;
    }

    public final String getReason()
    {
        return (String)super.mValues.get("reason");
    }

    static 
    {
        HashMap hashmap = new HashMap();
        sFields = hashmap;
        hashmap.put("domain", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("domain"));
        sFields.put("reason", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("reason"));
        sFields.put("message", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("message"));
        sFields.put("locationType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("locationType"));
        sFields.put("location", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("location"));
    }
}
