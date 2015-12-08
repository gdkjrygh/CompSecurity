// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.games.server.converter.PlayerImageUrlConverter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public final class AnonymousPlayer extends FastMapJsonResponse
{

    private static final TreeMap sFields;

    public AnonymousPlayer()
    {
    }

    public final String getAvatarImageUrl()
    {
        return (String)super.mValues.get("avatarImageUrl");
    }

    public final String getDisplayName()
    {
        return (String)super.mValues.get("displayName");
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("avatarImageUrl", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("avatarImageUrl", com/google/android/gms/games/server/converter/PlayerImageUrlConverter, false));
        sFields.put("displayName", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("displayName"));
    }
}
