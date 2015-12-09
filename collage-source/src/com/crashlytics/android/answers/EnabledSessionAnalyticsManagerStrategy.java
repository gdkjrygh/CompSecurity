// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.services.b.e;
import io.fabric.sdk.android.services.common.g;
import io.fabric.sdk.android.services.common.h;
import io.fabric.sdk.android.services.events.b;
import io.fabric.sdk.android.services.events.k;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManagerStrategy, KeepAllEventFilter, EventFilter, Answers, 
//            SessionEvent, SessionAnalyticsFilesSender, AnswersRetryFilesSender, SessionAnalyticsFilesManager, 
//            SamplingEventFilter

class EnabledSessionAnalyticsManagerStrategy extends b
    implements SessionAnalyticsManagerStrategy
{

    EventFilter eventFilter;
    k filesSender;
    private final e httpRequestFactory;

    public EnabledSessionAnalyticsManagerStrategy(Context context, ScheduledExecutorService scheduledexecutorservice, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, e e)
    {
        super(context, scheduledexecutorservice, sessionanalyticsfilesmanager);
        eventFilter = new KeepAllEventFilter();
        httpRequestFactory = e;
    }

    public k getFilesSender()
    {
        return filesSender;
    }

    public void recordEvent(SessionEvent sessionevent)
    {
        if (eventFilter.skipEvent(sessionevent))
        {
            h.a(Answers.getInstance().getContext(), (new StringBuilder()).append("skipping filtered event ").append(sessionevent).toString());
            return;
        } else
        {
            super.recordEvent(sessionevent);
            return;
        }
    }

    public volatile void recordEvent(Object obj)
    {
        recordEvent((SessionEvent)obj);
    }

    public void setAnalyticsSettingsData(io.fabric.sdk.android.services.d.b b1, String s)
    {
        filesSender = AnswersRetryFilesSender.build(new SessionAnalyticsFilesSender(Answers.getInstance(), s, b1.a, httpRequestFactory, (new g()).a(context)));
        ((SessionAnalyticsFilesManager)filesManager).setAnalyticsSettingsData(b1);
        configureRollover(b1.b);
        if (b1.g > 1)
        {
            eventFilter = new SamplingEventFilter(b1.g);
        }
    }
}
