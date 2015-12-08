// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.content.Context;
import com.netflix.mediaclient.util.PreferenceUtils;

public final class CastConfiguration
{

    private static final String PREFERENCE_CURRENT_CAST_APPID = "preference_key_CURRENT_cast_application_id";
    private static final String PREFERENCE_NEW_CAST_APPID = "preference_key_new_cast_application_id";

    public CastConfiguration()
    {
    }

    public static String getCastApplicationId(Context context)
    {
        return PreferenceUtils.getStringPref(context, "preference_key_CURRENT_cast_application_id", null);
    }

    public static String getNewCastApplicationId(Context context)
    {
        return PreferenceUtils.getStringPref(context, "preference_key_new_cast_application_id", null);
    }

    public static void setCastApplicationId(Context context, String s)
    {
        PreferenceUtils.putStringPref(context, "preference_key_CURRENT_cast_application_id", s);
    }

    public static void setNewCastApplicationId(Context context, String s)
    {
        PreferenceUtils.putStringPref(context, "preference_key_new_cast_application_id", s);
    }
}
