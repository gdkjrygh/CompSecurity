// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEventsHandler, DisabledSessionAnalyticsManagerStrategy, SessionAnalyticsManagerStrategy

class a
    implements Runnable
{

    final AnswersEventsHandler a;

    public void run()
    {
        try
        {
            SessionAnalyticsManagerStrategy sessionanalyticsmanagerstrategy = a.b;
            a.b = new DisabledSessionAnalyticsManagerStrategy();
            sessionanalyticsmanagerstrategy.c();
            return;
        }
        catch (Exception exception)
        {
            c.a().c("Answers", "Failed to disable events", exception);
        }
    }

    Strategy(AnswersEventsHandler answerseventshandler)
    {
        a = answerseventshandler;
        super();
    }
}
