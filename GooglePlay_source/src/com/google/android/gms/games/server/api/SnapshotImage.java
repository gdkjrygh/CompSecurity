// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class SnapshotImage extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public SnapshotImage()
    {
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("height", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("height"));
        sFields.put("mime_type", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("mime_type"));
        sFields.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("url"));
        sFields.put("width", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("width"));
    }
}
