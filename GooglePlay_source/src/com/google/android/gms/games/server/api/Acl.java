// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class Acl extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;

    public Acl()
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
        treemap.put("acl", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("pacl"));
        sFields.put("specifiedByUser", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("specified_by_user"));
    }
}
