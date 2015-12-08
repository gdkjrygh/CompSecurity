// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.TrackerGoalType;
import com.fitbit.data.domain.device.TrackerHeartRateTrackingType;
import com.fitbit.data.domain.device.TrackerOption;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.a;
import com.fitbit.data.domain.device.d;
import com.fitbit.data.domain.device.e;
import com.fitbit.data.repo.n;
import com.fitbit.util.bo;
import com.fitbit.util.t;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fitbit.data.bl:
//            dw, aq, ai, bs

public class dr extends dw
{

    public dr(bs bs)
    {
        super(bs);
    }

    static void a(dr dr1, Map map, TrackerSettings trackersettings)
    {
        dr1.a(map, trackersettings);
    }

    private void a(Map map, TrackerSettings trackersettings)
    {
        a(map, trackersettings, TrackerOption.DISPLAY_CALORIES, "displayCaloriesBurned");
        a(map, trackersettings, TrackerOption.DISPLAY_CHATTER, "displayChatter");
        a(map, trackersettings, TrackerOption.DISPLAY_ACTIVE_MINUTES, "displayActiveMinutes");
        a(map, trackersettings, TrackerOption.DISPLAY_CLOCK, "displayClock");
        a(map, trackersettings, TrackerOption.DISPLAY_DISTANCE, "displayDistance");
        a(map, trackersettings, TrackerOption.DISPLAY_ELEVATION, "displayElevation");
        a(map, trackersettings, TrackerOption.DISPLAY_EMOTE, "displayEmote");
        a(map, trackersettings, TrackerOption.DISPLAY_STEPS, "displaySteps");
        a(map, trackersettings, TrackerOption.DISPLAY_GREETING, "displayGreeting");
        map.put("greeting", String.valueOf(trackersettings.a(TrackerOption.GREETING).c()));
        map.put("onDominantHand", String.valueOf(trackersettings.a(TrackerOption.ON_DOMINANT_HAND).c()));
        map.put("enableAncs", String.valueOf(trackersettings.a(TrackerOption.ENABLE_ANCS).c()));
        map.put("enableSleepAnnotations", String.valueOf(trackersettings.a(TrackerOption.ENABLE_SLEEP_ANNOTATIONS).c()));
        map.put("primaryGoal", ((TrackerGoalType)trackersettings.a(TrackerOption.PRIMARY_GOAL).c()).getName());
        map.put("screenOrder", bo.a((List)trackersettings.a(TrackerOption.SCREEN_ORDER).c()));
        map.put("tapGesture", ((d)trackersettings.a(TrackerOption.TAP_GESTURE).c()).a());
        trackersettings = trackersettings.a(TrackerOption.CLOCK_FACE);
        if (trackersettings != null)
        {
            map.put("clockFace", t.a(((a)trackersettings.c()).b()));
        }
    }

    private void a(Map map, TrackerSettings trackersettings, TrackerOption trackeroption, String s)
    {
        if (map != null && trackersettings != null && trackeroption != null && s != null)
        {
            trackersettings = trackersettings.a(trackeroption);
            if (trackersettings != null)
            {
                map.put(s, String.valueOf(trackersettings.c()));
            }
        }
    }

    static void b(dr dr1, Map map, TrackerSettings trackersettings)
    {
        dr1.b(map, trackersettings);
    }

    private void b(Map map, TrackerSettings trackersettings)
    {
        map.put("onDominantHand", String.valueOf(trackersettings.a(TrackerOption.ON_DOMINANT_HAND).c()));
        map.put("enableSleepAnnotations", String.valueOf(trackersettings.a(TrackerOption.ENABLE_SLEEP_ANNOTATIONS).c()));
        map.put("enableAncs", String.valueOf(trackersettings.a(TrackerOption.ENABLE_ANCS).c()));
        map.put("primaryGoal", ((TrackerGoalType)trackersettings.a(TrackerOption.PRIMARY_GOAL).c()).getName());
        map.put("heartRateTracking", ((TrackerHeartRateTrackingType)trackersettings.a(TrackerOption.HEART_RATE_TRACKING).c()).getName());
        map.put("exercises", bo.b((List)trackersettings.a(TrackerOption.EXERCISES).c()));
        e e1 = trackersettings.a(TrackerOption.CLOCK_FACE);
        if (e1 != null)
        {
            map.put("clockFace", t.a(((a)e1.c()).b()));
        }
        trackersettings = trackersettings.a(TrackerOption.AUTO_LAP);
        if (trackersettings != null)
        {
            map.put("autoLapInterval", trackersettings.c());
        }
    }

    static void c(dr dr1, Map map, TrackerSettings trackersettings)
    {
        dr1.c(map, trackersettings);
    }

    private void c(Map map, TrackerSettings trackersettings)
    {
        a(map, trackersettings, TrackerOption.DISPLAY_CALORIES, "displayCaloriesBurned");
        a(map, trackersettings, TrackerOption.DISPLAY_CHATTER, "displayChatter");
        a(map, trackersettings, TrackerOption.DISPLAY_HEART_RATE, "displayHeartRate");
        a(map, trackersettings, TrackerOption.DISPLAY_CLOCK, "displayClock");
        a(map, trackersettings, TrackerOption.DISPLAY_DISTANCE, "displayDistance");
        a(map, trackersettings, TrackerOption.DISPLAY_ELEVATION, "displayElevation");
        a(map, trackersettings, TrackerOption.DISPLAY_EMOTE, "displayEmote");
        a(map, trackersettings, TrackerOption.DISPLAY_STEPS, "displaySteps");
        a(map, trackersettings, TrackerOption.DISPLAY_GREETING, "displayGreeting");
        a(map, trackersettings, TrackerOption.DISPLAY_ACTIVE_MINUTES, "displayActiveMinutes");
        map.put("greeting", trackersettings.a(TrackerOption.GREETING).c().toString());
        map.put("onDominantHand", String.valueOf(trackersettings.a(TrackerOption.ON_DOMINANT_HAND).c()));
        map.put("enableAncs", String.valueOf(trackersettings.a(TrackerOption.ENABLE_ANCS).c()));
        map.put("enableSleepAnnotations", String.valueOf(trackersettings.a(TrackerOption.ENABLE_SLEEP_ANNOTATIONS).c()));
        map.put("primaryGoal", ((TrackerGoalType)trackersettings.a(TrackerOption.PRIMARY_GOAL).c()).getName());
        map.put("heartRateTracking", ((TrackerHeartRateTrackingType)trackersettings.a(TrackerOption.HEART_RATE_TRACKING).c()).getName());
        map.put("screenOrder", bo.a((List)trackersettings.a(TrackerOption.SCREEN_ORDER).c()));
        map.put("tapGesture", ((d)trackersettings.a(TrackerOption.TAP_GESTURE).c()).a());
        trackersettings = trackersettings.a(TrackerOption.CLOCK_FACE);
        if (trackersettings != null)
        {
            map.put("clockFace", t.a(((a)trackersettings.c()).b()));
        }
    }

    public com.fitbit.data.bl.a.a[] a(ai ai1)
        throws ServerCommunicationException
    {
        n n1 = com.fitbit.data.bl.aq.a().t();
        ai1 = ai1.a(n1.getName());
        boolean flag;
        if (ai1 == null || ai1.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(((Map) (ai1)), ((com.fitbit.data.repo.ao) (n1)), ((dw.a) (new _cls1())));
        return a(flag, new com.fitbit.data.bl.a.a[0]);
    }

    /* member class not found */
    class _cls1 {}

}
