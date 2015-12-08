// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import me.lyft.android.analytics.definitions.CallEvent;
import me.lyft.android.analytics.definitions.SpanningEvent;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.analytics:
//            SpanningAnalytics

public class CallAnalytics extends SpanningAnalytics
{

    private final String call;
    private String errorMessage;
    private String errorType;

    public CallAnalytics(me.lyft.android.analytics.definitions.CallEvent.Call call1)
    {
        call = call1.toString();
    }

    protected CallEvent createSpanningEvent(me.lyft.android.analytics.definitions.SpanningEvent.Type type, String s)
    {
        return new CallEvent(type, me.lyft.android.analytics.definitions.CallEvent.Call.fromString(call), s);
    }

    protected volatile SpanningEvent createSpanningEvent(me.lyft.android.analytics.definitions.SpanningEvent.Type type, String s)
    {
        return createSpanningEvent(type, s);
    }

    protected final void mapBaseProperties(SpanningEvent spanningevent)
    {
        super.mapBaseProperties(spanningevent);
        spanningevent = (CallEvent)spanningevent;
        if (!Strings.isNullOrEmpty(errorType))
        {
            spanningevent.setErrorType(errorType);
        }
        if (!Strings.isNullOrEmpty(errorMessage))
        {
            spanningevent.setErrorMessage(errorMessage);
        }
    }

    public void trackFailure(Throwable throwable)
    {
        errorType = throwable.getClass().getSimpleName();
        errorMessage = throwable.getMessage();
        trackResult(me.lyft.android.analytics.definitions.SpanningEvent.Result.FAILURE);
    }
}
