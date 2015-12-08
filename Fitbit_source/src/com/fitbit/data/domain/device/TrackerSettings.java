// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import com.fitbit.d.b;
import com.fitbit.data.domain.Entity;
import com.fitbit.util.bo;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.device:
//            TrackerOption, e, TrackerScreen, TrackerGoalType, 
//            TrackerHeartRateTrackingType, d, f, a

public class TrackerSettings extends Entity
    implements b
{

    private final EnumSet dirty = EnumSet.noneOf(com/fitbit/data/domain/device/TrackerOption);
    private final Map settings = new HashMap();

    public TrackerSettings()
    {
    }

    public e a(TrackerOption trackeroption)
    {
        return (e)settings.get(trackeroption);
    }

    public void a()
    {
        dirty.clear();
        Iterator iterator = settings.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (entry.getValue() != null)
            {
                ((e)entry.getValue()).b();
            }
        } while (true);
    }

    public void a(TrackerOption trackeroption, e e1)
    {
        Object obj = settings.get(trackeroption);
        settings.put(trackeroption, e1);
        if (obj != e1 || obj != null && !obj.equals(e1))
        {
            dirty.add(trackeroption);
        }
    }

    public void a(TrackerScreen trackerscreen, boolean flag)
    {
        e e1;
label0:
        {
            if (trackerscreen != null)
            {
                trackerscreen = trackerscreen.getOption();
                if (trackerscreen != null)
                {
                    e1 = a(((TrackerOption) (trackerscreen)));
                    if (e1 != null)
                    {
                        break label0;
                    }
                    a(((TrackerOption) (trackerscreen)), new e(Boolean.valueOf(flag)));
                }
            }
            return;
        }
        e1.a(Boolean.valueOf(flag));
    }

    public boolean a(TrackerScreen trackerscreen)
    {
        if (trackerscreen != null)
        {
            trackerscreen = trackerscreen.getOption();
            if (trackerscreen != null)
            {
                trackerscreen = a(((TrackerOption) (trackerscreen)));
                if (trackerscreen != null && trackerscreen.c() != null)
                {
                    return ((Boolean)trackerscreen.c()).booleanValue();
                }
            }
        }
        return false;
    }

    public Set b()
    {
        Iterator iterator = settings.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (entry.getValue() != null && ((e)entry.getValue()).a())
            {
                dirty.add(entry.getKey());
            }
        } while (true);
        return EnumSet.copyOf(dirty);
    }

    public boolean b(TrackerScreen trackerscreen)
    {
        if (trackerscreen != null)
        {
            trackerscreen = trackerscreen.getGoalType();
            if (trackerscreen != null)
            {
                e e1 = a(TrackerOption.PRIMARY_GOAL);
                if (e1 != null)
                {
                    return trackerscreen.equals(e1.c());
                }
            }
        }
        return false;
    }

    public Set c()
    {
        EnumSet enumset = EnumSet.noneOf(com/fitbit/data/domain/device/TrackerOption);
        Iterator iterator = settings.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (entry.getValue() != null)
            {
                enumset.add(entry.getKey());
            }
        } while (true);
        return enumset;
    }

    public void d()
    {
        dirty.addAll(EnumSet.allOf(com/fitbit/data/domain/device/TrackerOption));
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        settings.clear();
        if (jsonobject.has("displayActiveMinutes"))
        {
            a(TrackerOption.DISPLAY_ACTIVE_MINUTES, new e(Boolean.valueOf(jsonobject.optBoolean("displayActiveMinutes", true))));
        }
        if (jsonobject.has("displayCalories"))
        {
            a(TrackerOption.DISPLAY_CALORIES, new e(Boolean.valueOf(jsonobject.optBoolean("displayCalories", true))));
        }
        if (jsonobject.has("displayChatter"))
        {
            a(TrackerOption.DISPLAY_CHATTER, new e(Boolean.valueOf(jsonobject.optBoolean("displayChatter", true))));
        }
        if (jsonobject.has("displayClock"))
        {
            a(TrackerOption.DISPLAY_CLOCK, new e(Boolean.valueOf(jsonobject.optBoolean("displayClock", true))));
        }
        if (jsonobject.has("displayDistance"))
        {
            a(TrackerOption.DISPLAY_DISTANCE, new e(Boolean.valueOf(jsonobject.optBoolean("displayDistance", true))));
        }
        if (jsonobject.has("displayElevation"))
        {
            a(TrackerOption.DISPLAY_ELEVATION, new e(Boolean.valueOf(jsonobject.optBoolean("displayElevation", true))));
        }
        if (jsonobject.has("displayEmote"))
        {
            a(TrackerOption.DISPLAY_EMOTE, new e(Boolean.valueOf(jsonobject.optBoolean("displayEmote", true))));
        }
        if (jsonobject.has("displayGreeting"))
        {
            a(TrackerOption.DISPLAY_GREETING, new e(Boolean.valueOf(jsonobject.optBoolean("displayGreeting", true))));
        }
        if (jsonobject.has("displaySteps"))
        {
            a(TrackerOption.DISPLAY_STEPS, new e(Boolean.valueOf(jsonobject.optBoolean("displaySteps", true))));
        }
        if (jsonobject.has("displayHeartRate"))
        {
            a(TrackerOption.DISPLAY_HEART_RATE, new e(Boolean.valueOf(jsonobject.optBoolean("displayHeartRate", true))));
        }
        if (!jsonobject.isNull("bondedPeerName"))
        {
            a(TrackerOption.BONDED_PEER_NAME, new e(jsonobject.getString("bondedPeerName")));
        }
        if (!jsonobject.isNull("bondedPeerId"))
        {
            a(TrackerOption.BONDED_PEER_ID, new e(jsonobject.getString("bondedPeerId")));
        }
        a(TrackerOption.ENABLE_ANCS, new e(Boolean.valueOf(jsonobject.optBoolean("enableAncs", true))));
        a(TrackerOption.ENABLE_SLEEP_ANNOTATIONS, new e(Boolean.valueOf(jsonobject.optBoolean("enableSleepAnnotations", true))));
        a(TrackerOption.GREETING, new e(jsonobject.optString("greeting")));
        a(TrackerOption.ON_DOMINANT_HAND, new e(Boolean.valueOf(jsonobject.optBoolean("onDominantHand", true))));
        a(TrackerOption.PRIMARY_GOAL, new e(TrackerGoalType.parse(jsonobject.optString("primaryGoal"))));
        a(TrackerOption.SCREEN_ORDER, new e(bo.b(jsonobject.optString("screenOrder"))));
        a(TrackerOption.HEART_RATE_TRACKING, new e(TrackerHeartRateTrackingType.parse(jsonobject.optString("heartRateTracking"))));
        a(TrackerOption.EXERCISES, new e(bo.c(jsonobject.optString("exercises"))));
        if (!jsonobject.isNull("tapGesture"))
        {
            a(TrackerOption.TAP_GESTURE, new e(new d(jsonobject.optString("tapGesture"), "")));
        }
        if (!jsonobject.isNull("watchCheck"))
        {
            a(TrackerOption.WATCH_CHECK, new e(new f(jsonobject.optString("watchCheck"), "")));
        }
        JSONObject jsonobject1 = jsonobject.optJSONObject("clockFace");
        if (jsonobject1 != null)
        {
            a a1 = new a();
            a1.initFromPublicApiJsonObject(jsonobject1);
            a(TrackerOption.CLOCK_FACE, new e(a1));
        }
        if (!jsonobject.isNull("autoLapInterval"))
        {
            a(TrackerOption.AUTO_LAP, new e(jsonobject.optString("autoLapInterval")));
        }
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        return null;
    }
}
