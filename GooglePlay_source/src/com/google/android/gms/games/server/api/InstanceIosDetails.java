// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class InstanceIosDetails extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public InstanceIosDetails()
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
        treemap.put("bundleIdentifier", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("bundleIdentifier"));
        sFields.put("itunesAppId", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("itunesAppId"));
        sFields.put("preferredForIpad", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("preferredForIpad"));
        sFields.put("preferredForIphone", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("preferredForIphone"));
        sFields.put("supportIpad", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("supportIpad"));
        sFields.put("supportIphone", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("supportIphone"));
    }
}
