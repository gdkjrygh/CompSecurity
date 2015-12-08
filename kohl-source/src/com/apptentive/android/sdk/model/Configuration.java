// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.apptentive.android.sdk.GlobalInfo;
import com.apptentive.android.sdk.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class Configuration extends JSONObject
{

    private static final String KEY_APP_DISPLAY_NAME = "app_display_name";
    private static final String KEY_CONFIGURATION_CACHE_EXPIRATION_MILLIS = "configuration_cache_expiration_millis";
    private static final String KEY_HIDE_BRANDING = "hide_branding";
    private static final String KEY_MESSAGE_CENTER = "message_center";
    private static final String KEY_MESSAGE_CENTER_BG_POLL = "bg_poll";
    private static final String KEY_MESSAGE_CENTER_EMAIL_REQUIRED = "email_required";
    private static final String KEY_MESSAGE_CENTER_ENABLED = "message_center_enabled";
    private static final String KEY_MESSAGE_CENTER_FG_POLL = "fg_poll";
    private static final String KEY_MESSAGE_CENTER_TITLE = "title";
    private static final String KEY_METRICS_ENABLED = "metrics_enabled";

    public Configuration()
    {
    }

    public Configuration(String s)
        throws JSONException
    {
        super(s);
    }

    private JSONObject getMessageCenter()
    {
        JSONObject jsonobject;
        if (isNull("message_center"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        jsonobject = getJSONObject("message_center");
        return jsonobject;
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public static Configuration load(Context context)
    {
        return load(context.getSharedPreferences("APPTENTIVE", 0));
    }

    public static Configuration load(SharedPreferences sharedpreferences)
    {
        sharedpreferences = sharedpreferences.getString("appConfiguration.json", null);
        if (sharedpreferences == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        sharedpreferences = new Configuration(sharedpreferences);
        return sharedpreferences;
        sharedpreferences;
        Log.e("Error loading Configuration from SharedPreferences.", sharedpreferences, new Object[0]);
        return new Configuration();
    }

    public String getAppDisplayName()
    {
        String s;
        if (isNull("app_display_name"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        s = getString("app_display_name");
        return s;
        JSONException jsonexception;
        jsonexception;
        return GlobalInfo.appDisplayName;
    }

    public long getConfigurationCacheExpirationMillis()
    {
        long l;
        if (isNull("configuration_cache_expiration_millis"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        l = getLong("configuration_cache_expiration_millis");
        return l;
        JSONException jsonexception;
        jsonexception;
        return 0L;
    }

    public int getMessageCenterBgPoll()
    {
        JSONObject jsonobject = getMessageCenter();
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        int i;
        if (jsonobject.isNull("bg_poll"))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        i = jsonobject.getInt("bg_poll");
        return i;
        JSONException jsonexception;
        jsonexception;
        return 60;
    }

    public int getMessageCenterFgPoll()
    {
        JSONObject jsonobject = getMessageCenter();
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        int i;
        if (jsonobject.isNull("fg_poll"))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        i = jsonobject.getInt("fg_poll");
        return i;
        JSONException jsonexception;
        jsonexception;
        return 15;
    }

    public String getMessageCenterTitle()
    {
        Object obj = getMessageCenter();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        if (((JSONObject) (obj)).isNull("title"))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        obj = ((JSONObject) (obj)).getString("title");
        return ((String) (obj));
        JSONException jsonexception;
        jsonexception;
        return null;
    }

    public boolean isHideBranding(Context context)
    {
        boolean flag;
        if (isNull("hide_branding"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        flag = getBoolean("hide_branding");
        return flag;
        JSONException jsonexception;
        jsonexception;
        boolean flag1;
        try
        {
            flag1 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("apptentive_initially_hide_branding", false);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("Unexpected error while reading %s manifest setting.", context, new Object[] {
                "apptentive_initially_hide_branding"
            });
            return false;
        }
        return flag1;
    }

    public boolean isMessageCenterEmailRequired(Context context)
    {
        JSONObject jsonobject = getMessageCenter();
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        boolean flag;
        if (jsonobject.isNull("email_required"))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        flag = jsonobject.getBoolean("email_required");
        return flag;
        JSONException jsonexception;
        jsonexception;
        boolean flag1;
        try
        {
            flag1 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("apptentive_email_required", false);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("Unexpected error while reading %s manifest setting.", context, new Object[] {
                "apptentive_email_required"
            });
            return false;
        }
        return flag1;
    }

    public boolean isMessageCenterEnabled(Context context)
    {
        boolean flag;
        if (isNull("message_center_enabled"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        flag = getBoolean("message_center_enabled");
        return flag;
        JSONException jsonexception;
        jsonexception;
        boolean flag1;
        try
        {
            flag1 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("apptentive_message_center_enabled", true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("Unexpected error while reading default %s manifest setting.", context, new Object[] {
                "apptentive_message_center_enabled"
            });
            return true;
        }
        return flag1;
    }

    public boolean isMetricsEnabled()
    {
        boolean flag;
        if (isNull("metrics_enabled"))
        {
            break MISSING_BLOCK_LABEL_19;
        }
        flag = getBoolean("metrics_enabled");
        return flag;
        JSONException jsonexception;
        jsonexception;
        return true;
    }

    public void save(Context context)
    {
        context.getSharedPreferences("APPTENTIVE", 0).edit().putString("appConfiguration.json", toString()).commit();
    }

    public void setConfigurationCacheExpirationMillis(long l)
    {
        try
        {
            put("configuration_cache_expiration_millis", l);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.w("Error adding %s to Configuration.", new Object[] {
                "configuration_cache_expiration_millis"
            });
        }
    }
}
