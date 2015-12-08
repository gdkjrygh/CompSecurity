// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class NetworkDiagnostics extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public NetworkDiagnostics()
    {
    }

    public NetworkDiagnostics(Integer integer, Integer integer1, String s, String s1, Integer integer2)
    {
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
        if (integer2 != null)
        {
            setInteger("registrationLatencyMillis", integer2.intValue());
        }
    }

    public final Map getFieldMappings()
    {
        return sFields;
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
        sFields.put("registrationLatencyMillis", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("registrationLatencyMillis"));
    }
}
