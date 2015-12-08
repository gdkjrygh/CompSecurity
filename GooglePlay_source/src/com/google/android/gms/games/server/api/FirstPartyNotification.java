// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.games.server.converter.NotificationAlertLevelConverter;
import java.util.Map;
import java.util.TreeMap;

public final class FirstPartyNotification extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;

    public FirstPartyNotification()
    {
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final String getId()
    {
        return (String)super.mValues.get("notification_id");
    }

    public final Integer getType()
    {
        return (Integer)super.mValues.get("alert_level");
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("coalescedText", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("coalesced_text"));
        sFields.put("id", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("notification_id"));
        sFields.put("text", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("text"));
        sFields.put("ticker", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("ticker"));
        sFields.put("title", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("title"));
        sFields.put("type", com.google.android.gms.common.server.response.FastJsonResponse.Field.withConverter("alert_level", com/google/android/gms/games/server/converter/NotificationAlertLevelConverter, false));
    }
}
