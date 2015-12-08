// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import org.json.JSONObject;

// Referenced classes of package io.fabric.sdk.android.services.settings:
//            SettingsJsonTransform, AppSettingsData, AppIconSettingsData, FeaturesSettingsData, 
//            AnalyticsSettingsData, SessionSettingsData, PromptSettingsData, BetaSettingsData, 
//            SettingsJsonConstants, SettingsData

class DefaultSettingsJsonTransform
    implements SettingsJsonTransform
{

    DefaultSettingsJsonTransform()
    {
    }

    private long a(CurrentTimeProvider currenttimeprovider, long l, JSONObject jsonobject)
    {
        if (jsonobject.has("expires_at"))
        {
            return jsonobject.getLong("expires_at");
        } else
        {
            return currenttimeprovider.a() + 1000L * l;
        }
    }

    private AppSettingsData b(JSONObject jsonobject)
    {
        String s = jsonobject.getString("identifier");
        String s1 = jsonobject.getString("status");
        String s2 = jsonobject.getString("url");
        String s3 = jsonobject.getString("reports_url");
        boolean flag = jsonobject.optBoolean("update_required", false);
        Object obj = null;
        AppIconSettingsData appiconsettingsdata = obj;
        if (jsonobject.has("icon"))
        {
            appiconsettingsdata = obj;
            if (jsonobject.getJSONObject("icon").has("hash"))
            {
                appiconsettingsdata = c(jsonobject.getJSONObject("icon"));
            }
        }
        return new AppSettingsData(s, s1, s2, s3, flag, appiconsettingsdata);
    }

    private AppIconSettingsData c(JSONObject jsonobject)
    {
        return new AppIconSettingsData(jsonobject.getString("hash"), jsonobject.getInt("width"), jsonobject.getInt("height"));
    }

    private FeaturesSettingsData d(JSONObject jsonobject)
    {
        return new FeaturesSettingsData(jsonobject.optBoolean("prompt_enabled", false), jsonobject.optBoolean("collect_logged_exceptions", true), jsonobject.optBoolean("collect_reports", true), jsonobject.optBoolean("collect_analytics", false));
    }

    private AnalyticsSettingsData e(JSONObject jsonobject)
    {
        return new AnalyticsSettingsData(jsonobject.optString("url", "https://e.crashlytics.com/spi/v2/events"), jsonobject.optInt("flush_interval_secs", 600), jsonobject.optInt("max_byte_size_per_file", 8000), jsonobject.optInt("max_file_count_per_send", 1), jsonobject.optInt("max_pending_send_file_count", 100), jsonobject.optBoolean("track_custom_events", true));
    }

    private SessionSettingsData f(JSONObject jsonobject)
    {
        return new SessionSettingsData(jsonobject.optInt("log_buffer_size", 64000), jsonobject.optInt("max_chained_exception_depth", 8), jsonobject.optInt("max_custom_exception_events", 64), jsonobject.optInt("max_custom_key_value_pairs", 64), jsonobject.optInt("identifier_mask", 255), jsonobject.optBoolean("send_session_without_crash", false));
    }

    private PromptSettingsData g(JSONObject jsonobject)
    {
        return new PromptSettingsData(jsonobject.optString("title", "Send Crash Report?"), jsonobject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jsonobject.optString("send_button_title", "Send"), jsonobject.optBoolean("show_cancel_button", true), jsonobject.optString("cancel_button_title", "Don't Send"), jsonobject.optBoolean("show_always_send_button", true), jsonobject.optString("always_send_button_title", "Always Send"));
    }

    private BetaSettingsData h(JSONObject jsonobject)
    {
        return new BetaSettingsData(jsonobject.optString("update_endpoint", SettingsJsonConstants.a), jsonobject.optInt("update_suspend_duration", 3600));
    }

    public SettingsData a(CurrentTimeProvider currenttimeprovider, JSONObject jsonobject)
    {
        int i = jsonobject.optInt("settings_version", 0);
        int j = jsonobject.optInt("cache_duration", 3600);
        AppSettingsData appsettingsdata = b(jsonobject.getJSONObject("app"));
        SessionSettingsData sessionsettingsdata = f(jsonobject.getJSONObject("session"));
        PromptSettingsData promptsettingsdata = g(jsonobject.getJSONObject("prompt"));
        FeaturesSettingsData featuressettingsdata = d(jsonobject.getJSONObject("features"));
        AnalyticsSettingsData analyticssettingsdata = e(jsonobject.getJSONObject("analytics"));
        BetaSettingsData betasettingsdata = h(jsonobject.getJSONObject("beta"));
        return new SettingsData(a(currenttimeprovider, j, jsonobject), appsettingsdata, sessionsettingsdata, promptsettingsdata, featuressettingsdata, analyticssettingsdata, betasettingsdata, i, j);
    }

    public JSONObject a(JSONObject jsonobject)
    {
        jsonobject = new JSONObject(jsonobject.toString());
        jsonobject.getJSONObject("features").remove("collect_analytics");
        jsonobject.remove("analytics");
        return jsonobject;
    }
}
