// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import java.util.UUID;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.EventName;
import me.lyft.android.analytics.definitions.Parameter;
import me.lyft.android.analytics.utils.AnalyticsUtils;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.analytics:
//            Event, RedshiftTrackerExtra, Analytics

public class AsyncActionAnalytics
{

    public static final String STATUS_FAILURE = "failure";
    public static final String STATUS_SUCCESS = "success";
    private final String actionName;
    private final String category;
    private Long startTime;
    private String uuid;

    public AsyncActionAnalytics(String s, String s1)
    {
        actionName = s;
        category = s1;
    }

    public AsyncActionAnalytics(ActionName actionname, Category category1)
    {
        actionName = actionname.toString();
        category = category1.toString();
    }

    private void clearRequest()
    {
        uuid = null;
        startTime = null;
    }

    private Event createResponseEvent()
    {
        Event event = new Event(EventName.ACTION_RESPONSE);
        if (startTime != null)
        {
            long l = System.currentTimeMillis();
            long l1 = startTime.longValue();
            event.putParameter(Parameter.RESPONSE_TIME, Long.valueOf(l - l1));
        }
        return event;
    }

    private void trackEventInRedshift(Event event)
    {
        event.putParameter(Parameter.ACTION_NAME, actionName).addTracker(RedshiftTrackerExtra.create());
        if (!Strings.isNullOrEmpty(uuid))
        {
            event.putParameter(Parameter.ACTION_ID, uuid);
        }
        Analytics.track(event);
    }

    public AsyncActionAnalytics trackRequest()
    {
        uuid = UUID.randomUUID().toString();
        startTime = Long.valueOf(System.currentTimeMillis());
        trackEventInRedshift(new Event(EventName.ACTION_ATTEMPT));
        return this;
    }

    public void trackResponseFailure(String s)
    {
        Event event = createResponseEvent().putParameter(Parameter.STATUS, "failure");
        if (!Strings.isNullOrEmpty(s))
        {
            event.putParameter(Parameter.REASON, s);
        }
        trackEventInRedshift(event);
        clearRequest();
    }

    public void trackResponseFailure(String s, Throwable throwable)
    {
        trackResponseFailure(String.format("%s : %s", new Object[] {
            s, AnalyticsUtils.resolveReason(throwable)
        }));
    }

    public void trackResponseFailure(Throwable throwable)
    {
        trackResponseFailure(AnalyticsUtils.resolveReason(throwable));
    }

    public void trackResponseSuccess()
    {
        trackResponseSuccess(null);
    }

    public void trackResponseSuccess(String s)
    {
        Event event = createResponseEvent().putParameter(Parameter.STATUS, "success");
        if (!Strings.isNullOrEmpty(s))
        {
            event.putParameter(Parameter.REASON, s);
        }
        trackEventInRedshift(event);
        clearRequest();
    }
}
