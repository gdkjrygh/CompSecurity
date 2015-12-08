// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.metric;

import android.content.Context;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.Configuration;
import com.apptentive.android.sdk.model.Event;
import com.apptentive.android.sdk.model.EventManager;
import com.apptentive.android.sdk.util.Util;
import java.util.Map;
import org.json.JSONObject;

public class MetricModule
{

    private static final String KEY_EXCEPTION = "exception";

    public MetricModule()
    {
    }

    public static void sendError(Context context, Throwable throwable, String s, String s1)
    {
        com.apptentive.android.sdk.model.Event.EventLabel eventlabel = com.apptentive.android.sdk.model.Event.EventLabel.error;
        JSONObject jsonobject;
        JSONObject jsonobject1;
        try
        {
            jsonobject = new JSONObject();
            jsonobject.put("thread", Thread.currentThread().getName());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("Error creating Error Metric. Nothing we can do but log this.", context, new Object[0]);
            return;
        }
        if (throwable == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        jsonobject1 = new JSONObject();
        jsonobject1.put("message", throwable.getMessage());
        jsonobject1.put("stackTrace", Util.stackTraceAsString(throwable));
        jsonobject.put("exception", jsonobject1);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        jsonobject.put("description", s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        jsonobject.put("extraData", s1);
        if (Configuration.load(context).isMetricsEnabled())
        {
            Log.v("Sending Error Metric: %s, data: %s", new Object[] {
                eventlabel.getLabelName(), jsonobject.toString()
            });
            EventManager.sendEvent(context, new Event(eventlabel.getLabelName(), jsonobject));
        }
        return;
    }

    public static void sendMetric(Context context, com.apptentive.android.sdk.model.Event.EventLabel eventlabel)
    {
        sendMetric(context, eventlabel, null);
    }

    public static void sendMetric(Context context, com.apptentive.android.sdk.model.Event.EventLabel eventlabel, String s)
    {
        sendMetric(context, eventlabel, s, null);
    }

    public static void sendMetric(Context context, com.apptentive.android.sdk.model.Event.EventLabel eventlabel, String s, Map map)
    {
        if (Configuration.load(context).isMetricsEnabled())
        {
            String s2 = eventlabel.getLabelName();
            String s1;
            if (map != null)
            {
                s1 = map.toString();
            } else
            {
                s1 = "null";
            }
            Log.v("Sending Metric: %s, trigger: %s, data: %s", new Object[] {
                s2, s, s1
            });
            eventlabel = new Event(eventlabel.getLabelName(), s);
            eventlabel.putData(map);
            EventManager.sendEvent(context, eventlabel);
        }
    }
}
