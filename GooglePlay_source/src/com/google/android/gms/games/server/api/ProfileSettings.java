// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import android.content.ContentValues;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import java.util.Map;
import java.util.TreeMap;

public final class ProfileSettings extends FastContentValuesJsonResponse
{

    private static final TreeMap sFields;

    public ProfileSettings()
    {
    }

    public ProfileSettings(Boolean boolean1, Boolean boolean2)
    {
        setBoolean("profile_visibility_explicitly_set", boolean1.booleanValue());
        setBoolean("profile_visible", boolean2.booleanValue());
    }

    public final Map getFieldMappings()
    {
        return sFields;
    }

    public final Boolean isProfileVisible()
    {
        return (Boolean)super.mValues.get("profile_visible");
    }

    static 
    {
        TreeMap treemap = new TreeMap();
        sFields = treemap;
        treemap.put("profileVisibilityWasChosenByPlayer", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("profile_visibility_explicitly_set"));
        sFields.put("profileVisible", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBoolean("profile_visible"));
    }
}
