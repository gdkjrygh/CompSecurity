// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.settings.b;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEventsHandler, SessionAnalyticsManagerStrategy

class b
    implements Runnable
{

    final b a;
    final String b;
    final AnswersEventsHandler c;

    public void run()
    {
        try
        {
            c.b.a(a, b);
            return;
        }
        catch (Exception exception)
        {
            io.fabric.sdk.android.c.a().c("Answers", "Failed to set analytics settings data", exception);
        }
    }

    Strategy(AnswersEventsHandler answerseventshandler, b b1, String s)
    {
        c = answerseventshandler;
        a = b1;
        b = s;
        super();
    }
}
