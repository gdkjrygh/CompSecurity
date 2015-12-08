// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import java.util.UUID;
import me.lyft.android.analytics.definitions.SpanningEvent;
import me.lyft.android.common.DeviceClock;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.analytics:
//            Analytics

public abstract class SpanningAnalytics
{

    private String parameter;
    private Float sampleRate;
    private Long startTime;
    private String tag;
    private String uuid;
    private Long value;

    public SpanningAnalytics()
    {
    }

    protected abstract SpanningEvent createSpanningEvent(me.lyft.android.analytics.definitions.SpanningEvent.Type type, String s);

    public final String getId()
    {
        return uuid;
    }

    public final String getParameter()
    {
        return parameter;
    }

    protected void mapBaseProperties(SpanningEvent spanningevent)
    {
        if (!Strings.isNullOrEmpty(tag))
        {
            spanningevent.setTag(tag);
        }
        if (!Strings.isNullOrEmpty(parameter))
        {
            spanningevent.setParameter(parameter);
        }
        if (value != null)
        {
            spanningevent.setValue(value.longValue());
        }
        if (sampleRate != null)
        {
            spanningevent.setSampleRate(sampleRate.floatValue());
        }
    }

    public final SpanningAnalytics setParameter(String s)
    {
        parameter = s;
        return this;
    }

    public final SpanningAnalytics setSampleRate(float f)
    {
        sampleRate = Float.valueOf(f);
        return this;
    }

    public final SpanningAnalytics setTag(String s)
    {
        tag = s;
        return this;
    }

    public final SpanningAnalytics setValue(long l)
    {
        value = Long.valueOf(l);
        return this;
    }

    public final void trackCanceled()
    {
        trackResult(me.lyft.android.analytics.definitions.SpanningEvent.Result.CANCELED);
    }

    public final void trackFailure()
    {
        trackResult(me.lyft.android.analytics.definitions.SpanningEvent.Result.FAILURE);
    }

    public final SpanningAnalytics trackInitiation()
    {
        uuid = UUID.randomUUID().toString();
        startTime = Long.valueOf(DeviceClock.getElapsedTimeMs());
        SpanningEvent spanningevent = createSpanningEvent(me.lyft.android.analytics.definitions.SpanningEvent.Type.INITIATION, uuid);
        mapBaseProperties(spanningevent);
        Analytics.track(spanningevent);
        return this;
    }

    public final void trackProhibited()
    {
        trackResult(me.lyft.android.analytics.definitions.SpanningEvent.Result.PROHIBITED);
    }

    protected void trackResult(me.lyft.android.analytics.definitions.SpanningEvent.Result result)
    {
        SpanningEvent spanningevent = createSpanningEvent(me.lyft.android.analytics.definitions.SpanningEvent.Type.RESULT, uuid);
        spanningevent.setResult(result);
        mapBaseProperties(spanningevent);
        if (startTime != null)
        {
            spanningevent.setDurationMs((int)(DeviceClock.getElapsedTimeMs() - startTime.longValue()));
            startTime = null;
        }
        Analytics.track(spanningevent);
    }

    public final void trackSuccess()
    {
        trackResult(me.lyft.android.analytics.definitions.SpanningEvent.Result.SUCCESS);
    }
}
