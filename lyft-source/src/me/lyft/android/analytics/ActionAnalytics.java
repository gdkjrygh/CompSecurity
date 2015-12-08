// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import me.lyft.android.analytics.definitions.ActionEvent;
import me.lyft.android.analytics.definitions.SpanningEvent;
import me.lyft.android.analytics.utils.AnalyticsUtils;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.analytics:
//            SpanningAnalytics

public class ActionAnalytics extends SpanningAnalytics
{

    private final String action;
    private String intentId;
    private String reason;

    public ActionAnalytics(me.lyft.android.analytics.definitions.ActionEvent.Action action1)
    {
        action = action1.toString();
    }

    protected ActionEvent createSpanningEvent(me.lyft.android.analytics.definitions.SpanningEvent.Type type, String s)
    {
        return new ActionEvent(type, me.lyft.android.analytics.definitions.ActionEvent.Action.fromString(action), s);
    }

    protected volatile SpanningEvent createSpanningEvent(me.lyft.android.analytics.definitions.SpanningEvent.Type type, String s)
    {
        return createSpanningEvent(type, s);
    }

    protected final void mapBaseProperties(SpanningEvent spanningevent)
    {
        super.mapBaseProperties(spanningevent);
        spanningevent = (ActionEvent)spanningevent;
        if (!Strings.isNullOrEmpty(reason))
        {
            spanningevent.setReason(reason);
        }
        if (!Strings.isNullOrEmpty(intentId))
        {
            spanningevent.setIntentId(intentId);
        }
    }

    public ActionAnalytics setIntentId(String s)
    {
        intentId = s;
        return this;
    }

    public void trackCanceled(String s)
    {
        reason = s;
        super.trackCanceled();
    }

    public void trackFailure(String s)
    {
        reason = s;
        super.trackFailure();
    }

    public void trackFailure(Throwable throwable)
    {
        reason = AnalyticsUtils.resolveReason(throwable);
        super.trackFailure();
    }

    public void trackProhibited(String s)
    {
        reason = s;
        super.trackProhibited();
    }

    public void trackSuccess(String s)
    {
        reason = s;
        super.trackSuccess();
    }
}
