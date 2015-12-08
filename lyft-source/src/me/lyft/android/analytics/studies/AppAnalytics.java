// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.studies;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.Event;
import me.lyft.android.analytics.RedshiftTrackerExtra;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.EventName;
import me.lyft.android.analytics.definitions.LifecycleEvent;
import me.lyft.android.analytics.definitions.Parameter;
import me.lyft.android.common.DateUtils;

public class AppAnalytics
{

    public AppAnalytics()
    {
    }

    public static void trackAllowPush(String s)
    {
        Analytics.track((new Event(EventName.ALLOW_PUSH)).putParameter(Parameter.PUSH_TOKEN, s).addTracker(RedshiftTrackerExtra.create()));
    }

    public static void trackAppClose()
    {
        Analytics.track((new Event(EventName.APP_CLOSE)).addTracker(RedshiftTrackerExtra.create()));
        Analytics.track(new LifecycleEvent(me.lyft.android.analytics.definitions.LifecycleEvent.Type.APP_CLOSE));
    }

    public static void trackAppCrash(Throwable throwable)
    {
        Analytics.trackSync((new LifecycleEvent(me.lyft.android.analytics.definitions.LifecycleEvent.Type.APP_CRASH)).setParameter(throwable.getClass().getSimpleName()));
    }

    public static void trackAppInstall(long l, String s)
    {
        String s1 = DateUtils.convertEpochToISO(l);
        Analytics.track((new Event(EventName.INSTALL)).putParameter(Parameter.INSTALLED_AT, s1).putParameter(Parameter.SOURCE, s).addTracker(RedshiftTrackerExtra.create()));
        Analytics.track((new LifecycleEvent(me.lyft.android.analytics.definitions.LifecycleEvent.Type.APP_INSTALL)).setOccurredAt(l));
    }

    public static void trackAppOpen(boolean flag)
    {
        Analytics.track((new Event(EventName.APP_OPEN)).addTracker(RedshiftTrackerExtra.create()));
        LifecycleEvent lifecycleevent = new LifecycleEvent(me.lyft.android.analytics.definitions.LifecycleEvent.Type.APP_OPEN);
        String s;
        if (flag)
        {
            s = "cold";
        } else
        {
            s = "warm";
        }
        Analytics.track(lifecycleevent.setParameter(s));
    }

    public static void trackAppVersionUpdateEvent()
    {
        Analytics.track(new LifecycleEvent(me.lyft.android.analytics.definitions.LifecycleEvent.Type.APP_UPDATE));
    }

    public static void trackCompetitiveAppInstalled(String s, String s1, boolean flag)
    {
        Analytics.track((new Event(EventName.COMPETITIVE_APP_INSTALLED)).putParameter(Parameter.APP, s).putParameter(Parameter.BUNDLE_ID, s1).putParameter(Parameter.INSTALLED, Boolean.valueOf(flag)).addTracker(RedshiftTrackerExtra.create()));
    }

    public static void trackDeepLinkLaunched(String s, boolean flag, boolean flag1)
    {
        Analytics.track((new Event(EventName.LAUNCHED_FROM_DEEP_LINK)).putParameter(Parameter.URL, s).putParameter(Parameter.HANDLED, Boolean.valueOf(flag)).putParameter(Parameter.RECOGNIZED, Boolean.valueOf(flag1)).addTracker(RedshiftTrackerExtra.create()));
    }

    private static void trackExperimentVariantAssigned(String s, String s1)
    {
        Analytics.track((new Event(EventName.EXPERIMENT_VARIANT_ASSIGNED)).putParameter(Parameter.EXPERIMENT, s).putParameter(Parameter.VARIANT, s1).addTracker(RedshiftTrackerExtra.create()));
    }

    public static AsyncActionAnalytics trackLoadAdvertiserId()
    {
        AsyncActionAnalytics asyncactionanalytics = new AsyncActionAnalytics(ActionName.LOAD_ADVERTISING_ID, Category.APPLICATION);
        asyncactionanalytics.trackRequest();
        return asyncactionanalytics;
    }

    public static void trackTestsChanged(Map map, Map map1)
    {
        Object obj = new HashSet();
        ((Set) (obj)).addAll(map.keySet());
        ((Set) (obj)).addAll(map1.keySet());
        obj = ((Set) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((Iterator) (obj)).next();
            if (map.get(s) == null || !((String)map.get(s)).equals(map1.get(s)))
            {
                trackExperimentVariantAssigned(s, (String)map1.get(s));
            }
        } while (true);
    }
}
