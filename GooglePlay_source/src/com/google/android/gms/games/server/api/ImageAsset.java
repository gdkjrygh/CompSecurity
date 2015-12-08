// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class ImageAsset extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public ImageAsset()
    {
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final String getName()
    {
        return (String)super.mValues.get("name");
    }

    public final String getUrl()
    {
        return (String)super.mValues.get("url");
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("height", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("height"));
        sFields.put("name", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("name"));
        sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url"));
        sFields.put("width", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("width"));
    }
}
