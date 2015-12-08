// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.crashlytics;

import android.content.Context;
import b.a.a.a.d;
import com.a.a.a;
import com.a.a.a.o;
import com.soundcloud.android.analytics.AnalyticsProvider;
import com.soundcloud.android.events.ActivityLifeCycleEvent;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.EncryptionEvent;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.events.PaymentFailureEvent;
import com.soundcloud.android.events.PlaybackErrorEvent;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.events.TrackingEvent;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.properties.ApplicationProperties;

public class FabricAnalyticsProvider
    implements AnalyticsProvider
{

    private static final String TAG = "CrashlyticsLogger";
    private final boolean debugBuild;

    FabricAnalyticsProvider(ApplicationProperties applicationproperties)
    {
        debugBuild = applicationproperties.isDebugBuild();
    }

    private void logWithCrashlytics(TrackingEvent trackingevent)
    {
label0:
        {
            if (shouldIncludeInCrashlyticsLogs(trackingevent))
            {
                if (!debugBuild)
                {
                    break label0;
                }
                a.a(3, "CrashlyticsLogger", trackingevent.toString());
            }
            return;
        }
        a.a(trackingevent.toString());
    }

    private boolean shouldIncludeInCrashlyticsLogs(TrackingEvent trackingevent)
    {
        return (trackingevent instanceof ScreenEvent) || (trackingevent instanceof UIEvent);
    }

    private void trackEncryptionError(EncryptionEvent encryptionevent)
    {
        com.a.a.a.a.c().a((o)(new o("Encryption test")).a("Kind", encryptionevent.getKind()));
    }

    private void trackPaymentFailure(PaymentFailureEvent paymentfailureevent)
    {
        com.a.a.a.a.c().a((o)(new o("Payment failure")).a("Reason", paymentfailureevent.getReason()));
    }

    private void trackWithAnswers(TrackingEvent trackingevent)
    {
        if (trackingevent instanceof PaymentFailureEvent)
        {
            trackPaymentFailure((PaymentFailureEvent)trackingevent);
        } else
        if (trackingevent instanceof EncryptionEvent)
        {
            trackEncryptionError((EncryptionEvent)trackingevent);
            return;
        }
    }

    public void flush()
    {
    }

    public void handleActivityLifeCycleEvent(ActivityLifeCycleEvent activitylifecycleevent)
    {
    }

    public void handleCurrentUserChangedEvent(CurrentUserChangedEvent currentuserchangedevent)
    {
    }

    public void handleOnboardingEvent(OnboardingEvent onboardingevent)
    {
    }

    public void handlePlaybackErrorEvent(PlaybackErrorEvent playbackerrorevent)
    {
    }

    public void handlePlaybackPerformanceEvent(PlaybackPerformanceEvent playbackperformanceevent)
    {
    }

    public void handleTrackingEvent(TrackingEvent trackingevent)
    {
        if (d.c())
        {
            logWithCrashlytics(trackingevent);
            trackWithAnswers(trackingevent);
        }
    }

    public void onAppCreated(Context context)
    {
    }
}
