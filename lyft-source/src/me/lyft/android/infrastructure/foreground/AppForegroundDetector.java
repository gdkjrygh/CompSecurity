// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.foreground;

import java.util.concurrent.atomic.AtomicInteger;
import me.lyft.android.analytics.studies.AppAnalytics;
import me.lyft.android.logging.L;
import rx.Observable;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.infrastructure.foreground:
//            IAppForegroundDetector

public class AppForegroundDetector
    implements IAppForegroundDetector
{

    private static boolean isColdStart = true;
    private final BehaviorSubject appForegroundedSubject = BehaviorSubject.create();
    private AtomicInteger startedActivities;

    public AppForegroundDetector()
    {
        startedActivities = new AtomicInteger(0);
    }

    public boolean isForegrounded()
    {
        return startedActivities.get() > 0;
    }

    public Observable observeAppForegrounded()
    {
        return appForegroundedSubject.asObservable();
    }

    public void onStart()
    {
        int i = startedActivities.incrementAndGet();
        L.d((new StringBuilder()).append("onStart startedActivities = ").append(i).append(" isForegrounded = ").append(isForegrounded()).toString(), new Object[0]);
        if (i == 1)
        {
            L.d("App considered foreground.", new Object[0]);
            AppAnalytics.trackAppOpen(isColdStart);
            isColdStart = false;
            appForegroundedSubject.onNext(Boolean.valueOf(true));
        }
    }

    public void onStop()
    {
        int i = startedActivities.decrementAndGet();
        L.d((new StringBuilder()).append("onStop startedActivities = ").append(i).append(" isForegrounded = ").append(isForegrounded()).toString(), new Object[0]);
        if (i == 0)
        {
            L.d("App considered NOT foreground.", new Object[0]);
            AppAnalytics.trackAppClose();
            appForegroundedSubject.onNext(Boolean.valueOf(false));
        }
    }

}
