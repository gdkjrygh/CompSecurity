// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.JsonUtils;
import com.netflix.mediaclient.util.PreferenceUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class NotificationUserSettings
{

    static final int NOTIFICATION_SOUND_PREFERENCE_DISABLED = 2;
    static final int NOTIFICATION_SOUND_PREFERENCE_ENABLED = 1;
    static final int NOTIFICATION_SOUND_PREFERENCE_NOT_SAVED = 0;
    private static String PARAM_CURRENT_USER_ID = "currentUserId";
    private static String PARAM_OLD_APP_VERSION = "oldAppVersion";
    private static String PARAM_OPT_IN = "optIn";
    private static String PARAM_OPT_IN_DISPLAYED = "optInDisplayed";
    private static String PARAM_SOUND_ENABLED = "soundEnabled";
    private static String PARAM_TIMESTAMP = "ts";
    private static String PARAM_USER_ID = "userId";
    private static final String TAG = "nf_push";
    public boolean current;
    public String currentProfileUserId;
    public int oldAppVersion;
    public boolean optInDisplayed;
    public boolean optedIn;
    public int soundEnabled;
    public long timestamp;
    public String userId;

    NotificationUserSettings()
    {
        oldAppVersion = 0x80000000;
        soundEnabled = 0;
    }

    static NotificationUserSettings getCurrent(Map map)
    {
        for (map = map.values().iterator(); map.hasNext();)
        {
            NotificationUserSettings notificationusersettings = (NotificationUserSettings)map.next();
            if (notificationusersettings.current)
            {
                return notificationusersettings;
            }
        }

        return null;
    }

    static NotificationUserSettings load(JSONObject jsonobject)
        throws JSONException
    {
        NotificationUserSettings notificationusersettings = new NotificationUserSettings();
        notificationusersettings.userId = jsonobject.getString(PARAM_USER_ID);
        notificationusersettings.optedIn = jsonobject.getBoolean(PARAM_OPT_IN);
        notificationusersettings.soundEnabled = jsonobject.getInt(PARAM_SOUND_ENABLED);
        notificationusersettings.oldAppVersion = jsonobject.getInt(PARAM_OLD_APP_VERSION);
        notificationusersettings.timestamp = JsonUtils.getLong(jsonobject, PARAM_TIMESTAMP, 0L);
        if (jsonobject.has(PARAM_OPT_IN_DISPLAYED))
        {
            notificationusersettings.optInDisplayed = jsonobject.getBoolean(PARAM_OPT_IN_DISPLAYED);
        } else
        {
            notificationusersettings.optInDisplayed = true;
        }
        notificationusersettings.currentProfileUserId = jsonobject.getString(PARAM_CURRENT_USER_ID);
        if (Log.isLoggable("nf_push", 3))
        {
            Log.d("nf_push", (new StringBuilder()).append("Loaded ").append(notificationusersettings).toString());
        }
        return notificationusersettings;
    }

    static Map loadSettings(Context context)
    {
        Log.d("nf_push", "load Notification settings start...");
        context = PreferenceUtils.getStringPref(context, "notification_settings", null);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        return new HashMap();
        HashMap hashmap;
        context = new JSONArray(context);
        hashmap = new HashMap(context.length());
        int i = 0;
_L2:
        if (i >= context.length())
        {
            break; /* Loop/switch isn't completed */
        }
        NotificationUserSettings notificationusersettings = load(context.getJSONObject(i));
        if (Log.isLoggable("nf_push", 3))
        {
            Log.d("nf_push", (new StringBuilder()).append("User setttings found: ").append(notificationusersettings).toString());
        }
        hashmap.put(notificationusersettings.userId, notificationusersettings);
        i++;
        if (true) goto _L2; else goto _L1
        context;
_L4:
        Log.e("nf_push", "Failed to load settings", context);
        return new HashMap();
_L1:
        Log.d("nf_push", "load Notification settings end.");
        return hashmap;
        context;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void saveSettings(Context context, Map map)
    {
        JSONArray jsonarray;
        try
        {
            jsonarray = new JSONArray();
            for (map = map.values().iterator(); map.hasNext(); jsonarray.put(((NotificationUserSettings)map.next()).toJson())) { }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nf_push", "Failed to save settings", context);
            return;
        }
        map = jsonarray.toString();
        if (Log.isLoggable("nf_push", 3))
        {
            Log.d("nf_push", (new StringBuilder()).append("Saving ").append(map).toString());
        }
        PreferenceUtils.putStringPref(context, "notification_settings", map);
        return;
    }

    private JSONObject toJson()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put(PARAM_USER_ID, userId);
        jsonobject.put(PARAM_OLD_APP_VERSION, oldAppVersion);
        jsonobject.put(PARAM_OPT_IN, optedIn);
        jsonobject.put(PARAM_SOUND_ENABLED, soundEnabled);
        jsonobject.put(PARAM_OPT_IN_DISPLAYED, optInDisplayed);
        if (timestamp <= 0L)
        {
            timestamp = System.currentTimeMillis();
        }
        jsonobject.put(PARAM_TIMESTAMP, timestamp);
        jsonobject.put(PARAM_CURRENT_USER_ID, currentProfileUserId);
        return jsonobject;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof NotificationUserSettings))
        {
            return false;
        }
        obj = (NotificationUserSettings)obj;
        if (userId != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((NotificationUserSettings) (obj)).userId == null) goto _L1; else goto _L3
_L3:
        return false;
        if (userId.equals(((NotificationUserSettings) (obj)).userId)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int i;
        if (userId == null)
        {
            i = 0;
        } else
        {
            i = userId.hashCode();
        }
        return i + 31;
    }

    public String toString()
    {
        return (new StringBuilder()).append("NotificationUserSettings [userId=").append(userId).append(", current=").append(current).append(", optedIn=").append(optedIn).append(", optInDisplayed=").append(optInDisplayed).append(", oldAppVersion=").append(oldAppVersion).append(", soundEnabled=").append(soundEnabled).append(", timestamp=").append(timestamp).append(", currentUserId=").append(currentProfileUserId).append("]").toString();
    }

}
