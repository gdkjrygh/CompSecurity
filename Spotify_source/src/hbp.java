// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONObject;

final class hbp
    implements hca
{

    hbp()
    {
    }

    public final hbz a(gzc gzc1, JSONObject jsonobject)
    {
        jsonobject.optInt("settings_version", 0);
        int i = jsonobject.optInt("cache_duration", 3600);
        Object obj3 = jsonobject.getJSONObject("app");
        ((JSONObject) (obj3)).getString("identifier");
        Object obj = ((JSONObject) (obj3)).getString("status");
        Object obj1 = ((JSONObject) (obj3)).getString("url");
        Object obj2 = ((JSONObject) (obj3)).getString("reports_url");
        boolean flag = ((JSONObject) (obj3)).optBoolean("update_required", false);
        if (((JSONObject) (obj3)).has("icon") && ((JSONObject) (obj3)).getJSONObject("icon").has("hash"))
        {
            obj3 = ((JSONObject) (obj3)).getJSONObject("icon");
            ((JSONObject) (obj3)).getString("hash");
            ((JSONObject) (obj3)).getInt("width");
            ((JSONObject) (obj3)).getInt("height");
            new hbh();
        }
        obj = new hbj(((String) (obj)), ((String) (obj1)), ((String) (obj2)), flag);
        obj1 = jsonobject.getJSONObject("session");
        ((JSONObject) (obj1)).optInt("log_buffer_size", 64000);
        ((JSONObject) (obj1)).optInt("max_chained_exception_depth", 8);
        int j = ((JSONObject) (obj1)).optInt("max_custom_exception_events", 64);
        ((JSONObject) (obj1)).optInt("max_custom_key_value_pairs", 64);
        ((JSONObject) (obj1)).optInt("identifier_mask", 255);
        ((JSONObject) (obj1)).optBoolean("send_session_without_crash", false);
        obj1 = new hbu(j);
        obj2 = jsonobject.getJSONObject("prompt");
        obj2 = new hbt(((JSONObject) (obj2)).optString("title", "Send Crash Report?"), ((JSONObject) (obj2)).optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), ((JSONObject) (obj2)).optString("send_button_title", "Send"), ((JSONObject) (obj2)).optBoolean("show_cancel_button", true), ((JSONObject) (obj2)).optString("cancel_button_title", "Don't Send"), ((JSONObject) (obj2)).optBoolean("show_always_send_button", true), ((JSONObject) (obj2)).optString("always_send_button_title", "Always Send"));
        obj3 = jsonobject.getJSONObject("features");
        flag = ((JSONObject) (obj3)).optBoolean("prompt_enabled", false);
        ((JSONObject) (obj3)).optBoolean("collect_logged_exceptions", true);
        obj3 = new hbr(flag, ((JSONObject) (obj3)).optBoolean("collect_reports", true), ((JSONObject) (obj3)).optBoolean("collect_analytics", false));
        Object obj4 = jsonobject.getJSONObject("analytics");
        Object obj5 = ((JSONObject) (obj4)).optString("url", "https://e.crashlytics.com/spi/v2/events");
        j = ((JSONObject) (obj4)).optInt("flush_interval_secs", 600);
        int k = ((JSONObject) (obj4)).optInt("max_byte_size_per_file", 8000);
        ((JSONObject) (obj4)).optInt("max_file_count_per_send", 1);
        obj4 = new hbg(((String) (obj5)), j, k, ((JSONObject) (obj4)).optInt("max_pending_send_file_count", 100), ((JSONObject) (obj4)).optBoolean("track_custom_events", true), ((JSONObject) (obj4)).optBoolean("track_predefined_events", true), ((JSONObject) (obj4)).optInt("sampling_rate", 1));
        obj5 = jsonobject.getJSONObject("beta");
        obj5 = new hbk(((JSONObject) (obj5)).optString("update_endpoint", null), ((JSONObject) (obj5)).optInt("update_suspend_duration", 3600));
        long l = i;
        if (jsonobject.has("expires_at"))
        {
            l = jsonobject.getLong("expires_at");
        } else
        {
            l = gzc1.a() + l * 1000L;
        }
        return new hbz(l, ((hbj) (obj)), ((hbu) (obj1)), ((hbt) (obj2)), ((hbr) (obj3)), ((hbg) (obj4)), ((hbk) (obj5)));
    }
}
