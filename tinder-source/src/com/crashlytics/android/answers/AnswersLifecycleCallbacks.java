// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Activity;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManager

class AnswersLifecycleCallbacks extends io.fabric.sdk.android.a.b
{

    private final SessionAnalyticsManager a;

    public AnswersLifecycleCallbacks(SessionAnalyticsManager sessionanalyticsmanager)
    {
        a = sessionanalyticsmanager;
    }

    public final void a(Activity activity)
    {
        a.a(activity, SessionEvent.Type.a);
    }

    public final void b(Activity activity)
    {
        a.a(activity, SessionEvent.Type.b);
    }

    public final void c(Activity activity)
    {
        a.a(activity, SessionEvent.Type.c);
    }

    public final void d(Activity activity)
    {
        a.a(activity, SessionEvent.Type.e);
    }

    public final void e(Activity activity)
    {
        a.a(activity, SessionEvent.Type.f);
    }

    public final void f(Activity activity)
    {
        a.a(activity, SessionEvent.Type.d);
    }

    public final void g(Activity activity)
    {
        a.a(activity, SessionEvent.Type.g);
    }
}
