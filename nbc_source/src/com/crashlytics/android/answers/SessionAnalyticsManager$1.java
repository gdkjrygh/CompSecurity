// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.events.EventsStrategy;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManager, SessionEvent, Answers

class val.sessionId
    implements Runnable
{

    final SessionAnalyticsManager this$0;
    final String val$sessionId;

    public void run()
    {
        try
        {
            SessionAnalyticsManager.access$100(SessionAnalyticsManager.this).recordEvent(SessionEvent.buildCrashEvent(SessionAnalyticsManager.access$000(SessionAnalyticsManager.this), val$sessionId));
            return;
        }
        catch (Exception exception)
        {
            CommonUtils.logControlledError(Answers.getInstance().getContext(), "Crashlytics failed to record crash event", exception);
        }
    }

    ()
    {
        this$0 = final_sessionanalyticsmanager;
        val$sessionId = String.this;
        super();
    }
}
