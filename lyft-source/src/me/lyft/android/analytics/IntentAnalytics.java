// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import me.lyft.android.analytics.definitions.IntentEvent;
import me.lyft.android.analytics.definitions.SpanningEvent;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.analytics:
//            SpanningAnalytics

public class IntentAnalytics extends SpanningAnalytics
{

    private final String intent;
    private String reason;

    public IntentAnalytics(me.lyft.android.analytics.definitions.IntentEvent.Intent intent1)
    {
        intent = intent1.toString();
    }

    protected IntentEvent createSpanningEvent(me.lyft.android.analytics.definitions.SpanningEvent.Type type, String s)
    {
        return new IntentEvent(type, me.lyft.android.analytics.definitions.IntentEvent.Intent.fromString(intent), s);
    }

    protected volatile SpanningEvent createSpanningEvent(me.lyft.android.analytics.definitions.SpanningEvent.Type type, String s)
    {
        return createSpanningEvent(type, s);
    }

    protected final void mapBaseProperties(SpanningEvent spanningevent)
    {
        super.mapBaseProperties(spanningevent);
        spanningevent = (IntentEvent)spanningevent;
        if (!Strings.isNullOrEmpty(reason))
        {
            spanningevent.setReason(reason);
        }
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
