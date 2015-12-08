// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEventsHandler, SessionAnalyticsManagerStrategy

class b
    implements Runnable
{

    final Strategy.e a;
    final boolean b;
    final AnswersEventsHandler c;

    public void run()
    {
        try
        {
            c.b.a(a);
            if (b)
            {
                c.b.e();
            }
            return;
        }
        catch (Exception exception)
        {
            io.fabric.sdk.android.c.a().c("Answers", "Failed to process event", exception);
        }
    }

    Strategy(AnswersEventsHandler answerseventshandler, Strategy strategy, boolean flag)
    {
        c = answerseventshandler;
        a = strategy;
        b = flag;
        super();
    }
}
