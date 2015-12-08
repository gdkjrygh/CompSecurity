// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.analytics;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.util.Log;
import com.adobe.mobile.Analytics;
import com.adobe.mobile.Config;
import com.analytics.utils.AnalyticsUtils;
import com.analytics.utils.GetMappingData;
import com.analytics.utils.enums.TimedActions;
import com.analytics.utils.values.AnalyticsConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AnalyticsMain
{

    private final Context mContext;
    private GetMappingData mGetMappingData;
    private int mInteractionNumber;

    public AnalyticsMain(Context context, boolean flag)
    {
        mContext = context;
        mGetMappingData = new GetMappingData(mContext);
        if (flag)
        {
            Config.setContext(mContext);
            Config.setDebugLogging(Boolean.valueOf(true));
        }
    }

    private void logOmniture(HashMap hashmap)
    {
        Iterator iterator = hashmap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (s != null && hashmap.get(s) != null)
            {
                Log.d("Omniture", (new StringBuilder()).append(s.toString()).append(" - ").append(hashmap.get(s).toString()).toString());
            }
        } while (true);
    }

    public HashMap getCommanVariablesMap()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("user.session", (new StringBuilder()).append(AnalyticsUtils.getDeviceID(mContext)).append("|").append(AnalyticsUtils.getDateTime()).toString());
        hashmap.put("app.deviceId", AnalyticsUtils.getDeviceID(mContext));
        mInteractionNumber = mInteractionNumber + 1;
        hashmap.put("app.interactionNumber", String.valueOf(mInteractionNumber));
        hashmap.put("app.platform", "android4x");
        hashmap.put("app.channel", "app");
        hashmap.put("app.date", AnalyticsUtils.getDate());
        hashmap.put("app.timePart", (new StringBuilder()).append(AnalyticsUtils.getDay()).append("|").append(AnalyticsUtils.getTimeToNearestTime().toLowerCase()).toString());
        return hashmap;
    }

    public int getInteractionNumber()
    {
        return mInteractionNumber;
    }

    public void pauseCollectingLifeCycleData()
    {
        if (AnalyticsConstants.ENABLE_EXTRA_FEATURES_LIFECYCLE_MATRIX.booleanValue())
        {
            Config.pauseCollectingLifecycleData();
        }
    }

    public void resetInteractionNumber()
    {
        mInteractionNumber = 0;
    }

    public void sendAnalytics(HashMap hashmap)
    {
        Object obj = new HashMap(getCommanVariablesMap());
        if (hashmap != null)
        {
            ((HashMap) (obj)).putAll(hashmap);
        }
        HashMap hashmap1 = new HashMap();
        for (obj = ((HashMap) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); ((Iterator) (obj)).remove())
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (entry.getValue() != null && !entry.getValue().equals("null"))
            {
                hashmap1.put((String)entry.getKey(), entry.getValue().toString().toLowerCase());
            }
        }

        logOmniture(hashmap1);
        if (hashmap1.get("trackState") != null)
        {
            hashmap.put("trackState", hashmap1.get("trackState").toString());
            hashmap1.remove("trackState");
            Analytics.trackState((String)hashmap.get("trackState"), hashmap1);
            return;
        }
        if (hashmap1.get("trackAction") != null)
        {
            hashmap.put("trackAction", hashmap1.get("trackAction").toString());
            hashmap1.remove("trackAction");
            Analytics.trackAction((String)hashmap.get("trackAction"), hashmap1);
            return;
        } else
        {
            Log.e("Omniture", "Value missing for TrackAction/TrackState, can not send analytics data");
            return;
        }
    }

    public void sendLocation(Location location)
    {
        if (!AnalyticsConstants.ENABLE_EXTRA_FEATURES_LOCATION.booleanValue() || location == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        Log.d("Omniture Location", (new StringBuilder()).append("Latitude :").append(location.getLatitude()).append(" Longitude :").append(location.getLongitude()).toString());
        Analytics.trackLocation(location, null);
        return;
        location;
        location.printStackTrace();
        return;
    }

    public void sendTimedActionEnd(TimedActions timedactions)
    {
        if (AnalyticsConstants.ENABLE_EXTRA_FEATURES_TIMED_ACTIONS.booleanValue())
        {
            Analytics.trackTimedActionEnd(timedactions.toString(), null);
        }
    }

    public void sendTimedActionStart(TimedActions timedactions)
    {
        if (AnalyticsConstants.ENABLE_EXTRA_FEATURES_TIMED_ACTIONS.booleanValue())
        {
            Analytics.trackTimedActionStart(timedactions.toString(), null);
        }
    }

    public void startCollectingLifeCycleData(Activity activity)
    {
        if (AnalyticsConstants.ENABLE_EXTRA_FEATURES_LIFECYCLE_MATRIX.booleanValue())
        {
            Config.collectLifecycleData(activity);
        }
    }
}
