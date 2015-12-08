// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.device.TrackerGoalType;
import com.fitbit.data.domain.device.TrackerHeartRateTrackingType;
import com.fitbit.data.domain.device.TrackerOption;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.d;
import com.fitbit.data.domain.device.e;
import com.fitbit.data.domain.device.f;
import com.fitbit.e.a;
import com.fitbit.e.b;
import com.fitbit.util.bo;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class TrackerSettingsMapper
    implements EntityMapper
{

    private static final String TAG = "TrackerSettingsMapper";

    public TrackerSettingsMapper()
    {
    }

    private Object getSettingValue(TrackerSettings trackersettings, TrackerOption trackeroption)
    {
        trackersettings = trackersettings.a(trackeroption);
        if (trackersettings != null && trackersettings.c() != null)
        {
            return trackersettings.c();
        } else
        {
            return null;
        }
    }

    private Object getSettingValue(TrackerSettings trackersettings, TrackerOption trackeroption, Object obj)
    {
        trackersettings = ((TrackerSettings) (getSettingValue(trackersettings, trackeroption)));
        if (trackersettings != null)
        {
            obj = trackersettings;
        }
        return obj;
    }

    private com.fitbit.data.repo.greendao.TrackerSettings toDbEntity(TrackerSettings trackersettings, com.fitbit.data.repo.greendao.TrackerSettings trackersettings1, boolean flag)
    {
        if (trackersettings == null)
        {
            a.a("TrackerSettingsMapper", "Trying to map from null entity", new Object[0]);
            return null;
        }
        if (trackersettings1 == null)
        {
            a.a("TrackerSettingsMapper", "Trying to map to null db entity", new Object[0]);
            return null;
        }
        if (trackersettings1.getId() == null)
        {
            trackersettings1.setId(trackersettings.getEntityId());
        }
        if (!trackersettings.b().isEmpty())
        {
            a.a(getClass().getSimpleName(), "Saving dirty fields %s", new Object[] {
                trackersettings.b()
            });
        }
        static class _cls1
        {

            static final int $SwitchMap$com$fitbit$data$domain$device$TrackerOption[];

            static 
            {
                $SwitchMap$com$fitbit$data$domain$device$TrackerOption = new int[TrackerOption.values().length];
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.BONDED_PEER_ID.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.BONDED_PEER_NAME.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.DISPLAY_ACTIVE_MINUTES.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.DISPLAY_CALORIES.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.DISPLAY_CHATTER.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.DISPLAY_CLOCK.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.DISPLAY_DISTANCE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.DISPLAY_EMOTE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.DISPLAY_GREETING.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.DISPLAY_ELEVATION.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.DISPLAY_STEPS.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.DISPLAY_HEART_RATE.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.ENABLE_ANCS.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.ENABLE_SLEEP_ANNOTATIONS.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.ON_DOMINANT_HAND.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.GREETING.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.PRIMARY_GOAL.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.SCREEN_ORDER.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.HEART_RATE_TRACKING.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.EXERCISES.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.TAP_GESTURE.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.WATCH_CHECK.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.CLOCK_FACE.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fitbit$data$domain$device$TrackerOption[TrackerOption.AUTO_LAP.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Object obj;
        Iterator iterator;
        if (flag)
        {
            obj = trackersettings.b();
        } else
        {
            obj = trackersettings.c();
        }
        iterator = ((Set) (obj)).iterator();
_L29:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        obj = (TrackerOption)iterator.next();
        _cls1..SwitchMap.com.fitbit.data.domain.device.TrackerOption[((TrackerOption) (obj)).ordinal()];
        JVM INSTR tableswitch 1 24: default 244
    //                   1 272
    //                   2 290
    //                   3 308
    //                   4 326
    //                   5 344
    //                   6 362
    //                   7 380
    //                   8 398
    //                   9 416
    //                   10 434
    //                   11 452
    //                   12 470
    //                   13 488
    //                   14 510
    //                   15 532
    //                   16 554
    //                   17 574
    //                   18 598
    //                   19 622
    //                   20 646
    //                   21 670
    //                   22 711
    //                   23 752
    //                   24 819;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27
_L3:
        a.e(getClass().getSimpleName(), "Tried to map an entity which does not exist on disk", new Object[0]);
        break; /* Loop/switch isn't completed */
_L4:
        trackersettings1.setBondedPeerId((String)getSettingValue(trackersettings, TrackerOption.BONDED_PEER_ID));
        break; /* Loop/switch isn't completed */
_L5:
        trackersettings1.setBondedPeerName((String)getSettingValue(trackersettings, TrackerOption.BONDED_PEER_NAME));
        break; /* Loop/switch isn't completed */
_L6:
        trackersettings1.setDisplayActiveMinutes((Boolean)getSettingValue(trackersettings, TrackerOption.DISPLAY_ACTIVE_MINUTES));
        break; /* Loop/switch isn't completed */
_L7:
        trackersettings1.setDisplayCalories((Boolean)getSettingValue(trackersettings, TrackerOption.DISPLAY_CALORIES));
        break; /* Loop/switch isn't completed */
_L8:
        trackersettings1.setDisplayChatter((Boolean)getSettingValue(trackersettings, TrackerOption.DISPLAY_CHATTER));
        break; /* Loop/switch isn't completed */
_L9:
        trackersettings1.setDisplayClock((Boolean)getSettingValue(trackersettings, TrackerOption.DISPLAY_CLOCK));
        break; /* Loop/switch isn't completed */
_L10:
        trackersettings1.setDisplayDistance((Boolean)getSettingValue(trackersettings, TrackerOption.DISPLAY_DISTANCE));
        break; /* Loop/switch isn't completed */
_L11:
        trackersettings1.setDisplayEmote((Boolean)getSettingValue(trackersettings, TrackerOption.DISPLAY_EMOTE));
        break; /* Loop/switch isn't completed */
_L12:
        trackersettings1.setDisplayGreeting((Boolean)getSettingValue(trackersettings, TrackerOption.DISPLAY_GREETING));
        break; /* Loop/switch isn't completed */
_L13:
        trackersettings1.setDisplayElevation((Boolean)getSettingValue(trackersettings, TrackerOption.DISPLAY_ELEVATION));
        break; /* Loop/switch isn't completed */
_L14:
        trackersettings1.setDisplaySteps((Boolean)getSettingValue(trackersettings, TrackerOption.DISPLAY_STEPS));
        break; /* Loop/switch isn't completed */
_L15:
        trackersettings1.setDisplayHeartRate((Boolean)getSettingValue(trackersettings, TrackerOption.DISPLAY_HEART_RATE));
        break; /* Loop/switch isn't completed */
_L16:
        trackersettings1.setEnableAncs((Boolean)getSettingValue(trackersettings, TrackerOption.ENABLE_ANCS, Boolean.valueOf(true)));
        break; /* Loop/switch isn't completed */
_L17:
        trackersettings1.setEnableSleepAnnotations((Boolean)getSettingValue(trackersettings, TrackerOption.ENABLE_SLEEP_ANNOTATIONS, Boolean.valueOf(true)));
        break; /* Loop/switch isn't completed */
_L18:
        trackersettings1.setOnDominantHand((Boolean)getSettingValue(trackersettings, TrackerOption.ON_DOMINANT_HAND, Boolean.valueOf(true)));
        break; /* Loop/switch isn't completed */
_L19:
        trackersettings1.setGreeting((String)getSettingValue(trackersettings, TrackerOption.GREETING, ""));
        break; /* Loop/switch isn't completed */
_L20:
        trackersettings1.setPrimaryGoal(((TrackerGoalType)getSettingValue(trackersettings, TrackerOption.PRIMARY_GOAL, TrackerGoalType.STEPS)).getName());
        break; /* Loop/switch isn't completed */
_L21:
        trackersettings1.setScreenOrder(bo.a((List)getSettingValue(trackersettings, TrackerOption.SCREEN_ORDER, Collections.emptyList())));
        break; /* Loop/switch isn't completed */
_L22:
        trackersettings1.setHeartRateTracking(((TrackerHeartRateTrackingType)getSettingValue(trackersettings, TrackerOption.HEART_RATE_TRACKING, TrackerHeartRateTrackingType.AUTO)).getName());
        break; /* Loop/switch isn't completed */
_L23:
        trackersettings1.setExercises(bo.b((List)getSettingValue(trackersettings, TrackerOption.EXERCISES, Collections.emptyList())));
        break; /* Loop/switch isn't completed */
_L24:
        Object obj1 = (d)getSettingValue(trackersettings, TrackerOption.TAP_GESTURE, null);
        if (obj1 != null)
        {
            obj1 = ((d) (obj1)).a();
        } else
        {
            obj1 = null;
        }
        trackersettings1.setTapGesture(((String) (obj1)));
        break; /* Loop/switch isn't completed */
_L25:
        Object obj2 = (f)getSettingValue(trackersettings, TrackerOption.WATCH_CHECK, null);
        if (obj2 != null)
        {
            obj2 = ((f) (obj2)).a();
        } else
        {
            obj2 = null;
        }
        trackersettings1.setWatchCheck(((String) (obj2)));
        break; /* Loop/switch isn't completed */
_L26:
        com.fitbit.data.domain.device.a a1 = (com.fitbit.data.domain.device.a)getSettingValue(trackersettings, TrackerOption.CLOCK_FACE, null);
        if (a1 != null)
        {
            trackersettings1.setClockFaceImageUrl(a1.a());
            trackersettings1.setClockFaceName(a1.b());
            trackersettings1.setClockFaceDisplayName(a1.c());
        } else
        {
            trackersettings1.setClockFaceImageUrl(null);
            trackersettings1.setClockFaceName(null);
            trackersettings1.setClockFaceDisplayName(null);
        }
        break; /* Loop/switch isn't completed */
_L27:
        trackersettings1.setAutoLap((String)getSettingValue(trackersettings, TrackerOption.AUTO_LAP, "OFF"));
        if (true) goto _L3; else goto _L2
_L2:
        return trackersettings1;
        if (true) goto _L29; else goto _L28
_L28:
    }

    private boolean unboxBoolean(Boolean boolean1, boolean flag)
    {
        if (boolean1 == null)
        {
            a.a("TrackerSettingsMapper", "Trying to unbox null Boolean. Applying default value: [%s]", new Object[] {
                Boolean.valueOf(flag)
            });
            b.a(7, "From here", new Object[0]);
            return flag;
        } else
        {
            return boolean1.booleanValue();
        }
    }

    public TrackerSettings fromDbEntity(com.fitbit.data.repo.greendao.TrackerSettings trackersettings)
    {
        if (trackersettings == null)
        {
            a.a("TrackerSettingsMapper", "Trying to unmap null db entity", new Object[0]);
            trackersettings = null;
        } else
        {
            TrackerSettings trackersettings1 = new TrackerSettings();
            trackersettings1.setEntityId(trackersettings.getId());
            if (trackersettings.getDisplayActiveMinutes() != null)
            {
                trackersettings1.a(TrackerOption.DISPLAY_ACTIVE_MINUTES, new e(Boolean.valueOf(unboxBoolean(trackersettings.getDisplayActiveMinutes(), true))));
            }
            if (trackersettings.getDisplayCalories() != null)
            {
                trackersettings1.a(TrackerOption.DISPLAY_CALORIES, new e(Boolean.valueOf(unboxBoolean(trackersettings.getDisplayCalories(), true))));
            }
            if (trackersettings.getDisplayChatter() != null)
            {
                trackersettings1.a(TrackerOption.DISPLAY_CHATTER, new e(Boolean.valueOf(unboxBoolean(trackersettings.getDisplayChatter(), true))));
            }
            if (trackersettings.getDisplayClock() != null)
            {
                trackersettings1.a(TrackerOption.DISPLAY_CLOCK, new e(Boolean.valueOf(unboxBoolean(trackersettings.getDisplayClock(), true))));
            }
            if (trackersettings.getDisplayDistance() != null)
            {
                trackersettings1.a(TrackerOption.DISPLAY_DISTANCE, new e(Boolean.valueOf(unboxBoolean(trackersettings.getDisplayDistance(), true))));
            }
            if (trackersettings.getDisplayElevation() != null)
            {
                trackersettings1.a(TrackerOption.DISPLAY_ELEVATION, new e(Boolean.valueOf(unboxBoolean(trackersettings.getDisplayElevation(), true))));
            }
            if (trackersettings.getDisplayEmote() != null)
            {
                trackersettings1.a(TrackerOption.DISPLAY_EMOTE, new e(Boolean.valueOf(unboxBoolean(trackersettings.getDisplayEmote(), true))));
            }
            if (trackersettings.getDisplayGreeting() != null)
            {
                trackersettings1.a(TrackerOption.DISPLAY_GREETING, new e(Boolean.valueOf(unboxBoolean(trackersettings.getDisplayGreeting(), true))));
            }
            if (trackersettings.getDisplaySteps() != null)
            {
                trackersettings1.a(TrackerOption.DISPLAY_STEPS, new e(Boolean.valueOf(unboxBoolean(trackersettings.getDisplaySteps(), true))));
            }
            if (trackersettings.getDisplayHeartRate() != null)
            {
                trackersettings1.a(TrackerOption.DISPLAY_HEART_RATE, new e(Boolean.valueOf(unboxBoolean(trackersettings.getDisplayHeartRate(), true))));
            }
            trackersettings1.a(TrackerOption.ENABLE_ANCS, new e(Boolean.valueOf(unboxBoolean(trackersettings.getEnableAncs(), true))));
            trackersettings1.a(TrackerOption.ENABLE_SLEEP_ANNOTATIONS, new e(Boolean.valueOf(unboxBoolean(trackersettings.getEnableSleepAnnotations(), true))));
            trackersettings1.a(TrackerOption.GREETING, new e(trackersettings.getGreeting()));
            trackersettings1.a(TrackerOption.ON_DOMINANT_HAND, new e(Boolean.valueOf(unboxBoolean(trackersettings.getOnDominantHand(), true))));
            trackersettings1.a(TrackerOption.PRIMARY_GOAL, new e(TrackerGoalType.parse(trackersettings.getPrimaryGoal())));
            trackersettings1.a(TrackerOption.SCREEN_ORDER, new e(bo.b(trackersettings.getScreenOrder())));
            trackersettings1.a(TrackerOption.HEART_RATE_TRACKING, new e(TrackerHeartRateTrackingType.parse(trackersettings.getHeartRateTracking())));
            trackersettings1.a(TrackerOption.EXERCISES, new e(bo.c(trackersettings.getExercises())));
            trackersettings1.a(TrackerOption.BONDED_PEER_NAME, new e(trackersettings.getBondedPeerName()));
            trackersettings1.a(TrackerOption.BONDED_PEER_ID, new e(trackersettings.getBondedPeerId()));
            trackersettings1.a(TrackerOption.AUTO_LAP, new e(trackersettings.getAutoLap()));
            String s = trackersettings.getClockFaceImageUrl();
            String s1 = trackersettings.getClockFaceName();
            String s2 = trackersettings.getClockFaceDisplayName();
            if (s != null && s1 != null && s2 != null)
            {
                trackersettings1.a(TrackerOption.CLOCK_FACE, new e(new com.fitbit.data.domain.device.a(s, s1, s2)));
            }
            s = trackersettings.getTapGesture();
            if (s != null)
            {
                trackersettings1.a(TrackerOption.TAP_GESTURE, new e(new d(s, "")));
            }
            s = trackersettings.getWatchCheck();
            trackersettings = trackersettings1;
            if (s != null)
            {
                trackersettings1.a(TrackerOption.WATCH_CHECK, new e(new f(s, "")));
                return trackersettings1;
            }
        }
        return trackersettings;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.TrackerSettings)obj);
    }

    public com.fitbit.data.repo.greendao.TrackerSettings toDbEntity(TrackerSettings trackersettings)
    {
        return toDbEntity(trackersettings, new com.fitbit.data.repo.greendao.TrackerSettings(), false);
    }

    public com.fitbit.data.repo.greendao.TrackerSettings toDbEntity(TrackerSettings trackersettings, com.fitbit.data.repo.greendao.TrackerSettings trackersettings1)
    {
        return toDbEntity(trackersettings, trackersettings1, true);
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((TrackerSettings)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((TrackerSettings)obj, (com.fitbit.data.repo.greendao.TrackerSettings)obj1);
    }
}
