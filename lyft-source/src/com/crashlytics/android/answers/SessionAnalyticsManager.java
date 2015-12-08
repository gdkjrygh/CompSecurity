// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.services.common.ExecutorUtils;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.settings.AnalyticsSettingsData;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionEventsHandler, EnabledSessionAnalyticsManagerStrategy, SessionEvent, SessionEventMetadata, 
//            SessionAnalyticsFilesManager

class SessionAnalyticsManager
{

    final SessionEventMetadata a;
    final SessionEventsHandler b;
    boolean c;

    SessionAnalyticsManager(SessionEventMetadata sessioneventmetadata, SessionEventsHandler sessioneventshandler)
    {
        c = true;
        a = sessioneventmetadata;
        b = sessioneventshandler;
    }

    public static SessionAnalyticsManager a(Context context, SessionEventMetadata sessioneventmetadata, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, HttpRequestFactory httprequestfactory)
    {
        java.util.concurrent.ScheduledExecutorService scheduledexecutorservice = ExecutorUtils.b("Crashlytics SAM");
        return new SessionAnalyticsManager(sessioneventmetadata, new SessionEventsHandler(context, new EnabledSessionAnalyticsManagerStrategy(context, scheduledexecutorservice, sessionanalyticsfilesmanager, httprequestfactory), sessionanalyticsfilesmanager, scheduledexecutorservice));
    }

    public void a()
    {
        b.b();
    }

    public void a(Activity activity)
    {
        b.a(SessionEvent.a(a, SessionEvent.Type.a, activity), false);
    }

    public void a(AnalyticsSettingsData analyticssettingsdata, String s)
    {
        c = analyticssettingsdata.f;
        b.a(analyticssettingsdata, s);
    }

    public void a(String s)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("onCrash called from main thread!!!");
        } else
        {
            b.a(SessionEvent.b(a, s));
            return;
        }
    }

    public void b()
    {
        b.a(SessionEvent.a(a), true);
    }

    public void b(Activity activity)
    {
        b.a(SessionEvent.a(a, SessionEvent.Type.g, activity), false);
    }

    public void b(String s)
    {
        b.a(SessionEvent.a(a, s), false);
    }

    public void c(Activity activity)
    {
        b.a(SessionEvent.a(a, SessionEvent.Type.e, activity), false);
    }

    public void d(Activity activity)
    {
        b.a(SessionEvent.a(a, SessionEvent.Type.c, activity), false);
    }

    public void e(Activity activity)
    {
        b.a(SessionEvent.a(a, SessionEvent.Type.d, activity), false);
    }

    public void f(Activity activity)
    {
        b.a(SessionEvent.a(a, SessionEvent.Type.b, activity), false);
    }

    public void g(Activity activity)
    {
        b.a(SessionEvent.a(a, SessionEvent.Type.f, activity), false);
    }
}
