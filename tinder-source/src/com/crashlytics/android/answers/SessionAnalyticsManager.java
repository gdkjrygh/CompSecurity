// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Activity;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEvent, AnswersEventsHandler

public class SessionAnalyticsManager
{

    public final AnswersEventsHandler a;

    public SessionAnalyticsManager(AnswersEventsHandler answerseventshandler)
    {
        a = answerseventshandler;
    }

    public final void a(Activity activity, SessionEvent.Type type)
    {
        c.a().a("Answers", (new StringBuilder("Logged lifecycle event: ")).append(type.name()).toString());
        a.a(SessionEvent.a(type, activity), false, false);
    }
}
