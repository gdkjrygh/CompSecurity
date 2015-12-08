// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.internal:
//            ak, al, aq, ap, 
//            ao, aj, aw, bg

public class ax
{

    ax()
    {
    }

    public aw a(bg bg1, JSONObject jsonobject)
        throws JSONException
    {
        int i = jsonobject.optInt("settings_version", 0);
        int j = jsonobject.optInt("cache_duration", 3600);
        JSONObject jsonobject1 = jsonobject.getJSONObject("app");
        Object obj2 = jsonobject1.getString("identifier");
        Object obj3 = jsonobject1.getString("status");
        Object obj4 = jsonobject1.getString("url");
        String s = jsonobject1.getString("reports_url");
        boolean flag = jsonobject1.optBoolean("update_required", false);
        Object obj1 = null;
        Object obj = obj1;
        if (jsonobject1.has("icon"))
        {
            obj = obj1;
            if (jsonobject1.getJSONObject("icon").has("hash"))
            {
                obj = jsonobject1.getJSONObject("icon");
                obj = new ak(((JSONObject) (obj)).getString("hash"), ((JSONObject) (obj)).getInt("width"), ((JSONObject) (obj)).getInt("height"));
            }
        }
        obj = new al(((String) (obj2)), ((String) (obj3)), ((String) (obj4)), s, flag, ((ak) (obj)));
        obj1 = jsonobject.getJSONObject("session");
        obj1 = new aq(((JSONObject) (obj1)).optInt("log_buffer_size", 64000), ((JSONObject) (obj1)).optInt("max_chained_exception_depth", 8), ((JSONObject) (obj1)).optInt("max_custom_exception_events", 64), ((JSONObject) (obj1)).optInt("max_custom_key_value_pairs", 64), ((JSONObject) (obj1)).optInt("identifier_mask", 255), ((JSONObject) (obj1)).optBoolean("send_session_without_crash", false));
        obj2 = jsonobject.getJSONObject("prompt");
        obj2 = new ap(((JSONObject) (obj2)).optString("title", "Send Crash Report?"), ((JSONObject) (obj2)).optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), ((JSONObject) (obj2)).optString("send_button_title", "Send"), ((JSONObject) (obj2)).optBoolean("show_cancel_button", true), ((JSONObject) (obj2)).optString("cancel_button_title", "Don't Send"), ((JSONObject) (obj2)).optBoolean("show_always_send_button", true), ((JSONObject) (obj2)).optString("always_send_button_title", "Always Send"));
        obj3 = jsonobject.getJSONObject("features");
        obj3 = new ao(((JSONObject) (obj3)).optBoolean("prompt_enabled", false), ((JSONObject) (obj3)).optBoolean("collect_logged_exceptions", true), ((JSONObject) (obj3)).optBoolean("collect_reports", true), ((JSONObject) (obj3)).optBoolean("collect_analytics", false));
        obj4 = jsonobject.getJSONObject("analytics");
        obj4 = new aj(((JSONObject) (obj4)).optString("url", "https://e.crashlytics.com/spi/v2/events"), ((JSONObject) (obj4)).optInt("flush_interval_secs", 600), ((JSONObject) (obj4)).optInt("max_byte_size_per_file", 8000), ((JSONObject) (obj4)).optInt("max_file_count_per_send", 1), ((JSONObject) (obj4)).optInt("max_pending_send_file_count", 100));
        long l = j;
        if (jsonobject.has("expires_at"))
        {
            l = jsonobject.getLong("expires_at");
        } else
        {
            l = bg1.a() + l * 1000L;
        }
        return new aw(l, ((al) (obj)), ((aq) (obj1)), ((ap) (obj2)), ((ao) (obj3)), ((aj) (obj4)), i, j);
    }

    public JSONObject a(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = new JSONObject(jsonobject.toString());
        jsonobject.getJSONObject("features").remove("collect_analytics");
        jsonobject.remove("analytics");
        return jsonobject;
    }
}
