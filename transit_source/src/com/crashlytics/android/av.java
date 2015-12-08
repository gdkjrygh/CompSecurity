// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android:
//            c, i, ax, am, 
//            au, ac

class av
{

    av()
    {
    }

    public au a(ac ac1, JSONObject jsonobject)
        throws JSONException
    {
        JSONObject jsonobject1 = jsonobject.getJSONObject("app");
        Object obj2 = jsonobject1.getString("identifier");
        String s = jsonobject1.getString("status");
        String s1 = jsonobject1.getString("url");
        String s2 = jsonobject1.getString("reports_url");
        boolean flag = jsonobject1.optBoolean("update_required", false);
        Object obj1 = null;
        Object obj = obj1;
        if (jsonobject1.has("icon"))
        {
            obj = obj1;
            if (jsonobject1.getJSONObject("icon").has("hash"))
            {
                obj = jsonobject1.getJSONObject("icon");
                obj = new c(((JSONObject) (obj)).getString("hash"), ((JSONObject) (obj)).getInt("width"), ((JSONObject) (obj)).getInt("height"));
            }
        }
        obj = new i(((String) (obj2)), s, s1, s2, flag, ((c) (obj)));
        obj1 = jsonobject.getJSONObject("settings");
        obj1 = new ax(((JSONObject) (obj1)).optBoolean("collect_reports", true), ((JSONObject) (obj1)).optInt("cache_duration", 3600), ((JSONObject) (obj1)).optInt("log_buffer_size", 64000), ((JSONObject) (obj1)).optInt("max_chained_exception_depth", 8), ((JSONObject) (obj1)).optInt("max_custom_exception_events", 64), ((JSONObject) (obj1)).optInt("max_custom_key_value_pairs", 64), ((JSONObject) (obj1)).optInt("identifier_mask", 255), ((JSONObject) (obj1)).optBoolean("send_session_without_crash", false));
        obj2 = jsonobject.getJSONObject("prompt");
        obj2 = new am(((JSONObject) (obj2)).getBoolean("enabled"), ((JSONObject) (obj2)).optString("title", "Send Crash Report?"), ((JSONObject) (obj2)).optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), ((JSONObject) (obj2)).optString("send_button_title", "Send"), ((JSONObject) (obj2)).optBoolean("show_cancel_button", true), ((JSONObject) (obj2)).optString("cancel_button_title", "Don't Send"), ((JSONObject) (obj2)).optBoolean("show_always_send_button", true), ((JSONObject) (obj2)).optString("always_send_button_title", "Always Send"));
        long l = ((ax) (obj1)).b();
        if (jsonobject.has("expires_at"))
        {
            l = jsonobject.getLong("expires_at");
        } else
        {
            l = ac1.a() + l * 1000L;
        }
        return new au(l, ((i) (obj)), ((ax) (obj1)), ((am) (obj2)));
    }
}
