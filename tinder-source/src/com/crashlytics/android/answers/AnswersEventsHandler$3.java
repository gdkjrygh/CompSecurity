// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEventsHandler, SessionAnalyticsManagerStrategy

class a
    implements Runnable
{

    final AnswersEventsHandler a;

    public void run()
    {
        try
        {
            a.b.b();
            return;
        }
        catch (Exception exception)
        {
            c.a().c("Answers", "Failed to send events files", exception);
        }
    }

    Strategy(AnswersEventsHandler answerseventshandler)
    {
        a = answerseventshandler;
        super();
    }
}
