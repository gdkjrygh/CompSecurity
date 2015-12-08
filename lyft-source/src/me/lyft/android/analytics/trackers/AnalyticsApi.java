// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import android.content.Context;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import java.util.Map;
import org.json.JSONObject;

public class AnalyticsApi
{

    private final MixpanelAPI mixpanelAPI;

    AnalyticsApi(Context context, String s)
    {
        mixpanelAPI = MixpanelAPI.a(context, s);
    }

    void flush()
    {
        mixpanelAPI.a();
    }

    void setEndpointHost(String s)
    {
        mixpanelAPI.a(s);
    }

    void track(String s, Map map)
    {
        map = new JSONObject(map);
        mixpanelAPI.a(s, map);
    }
}
