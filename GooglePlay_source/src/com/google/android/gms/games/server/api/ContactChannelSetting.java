// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class ContactChannelSetting extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public ContactChannelSetting()
    {
    }

    public ContactChannelSetting(String s, Boolean boolean1)
    {
        if (s != null)
        {
            setString("channelType", s);
        }
        if (boolean1 != null)
        {
            setBoolean("isEnabled", boolean1.booleanValue());
        }
    }

    public final String getChannelType()
    {
        return (String)super.mValues.get("channelType");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("channelType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("channelType"));
        sFields.put("isEnabled", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("isEnabled"));
    }
}
