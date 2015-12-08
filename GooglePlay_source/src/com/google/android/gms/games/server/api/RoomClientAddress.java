// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class RoomClientAddress extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public RoomClientAddress()
    {
    }

    public RoomClientAddress(String s)
    {
        if (s != null)
        {
            setString("xmppAddress", s);
        }
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final String getXmppAddress()
    {
        return (String)super.mValues.get("xmppAddress");
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("xmppAddress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("xmppAddress"));
    }
}
