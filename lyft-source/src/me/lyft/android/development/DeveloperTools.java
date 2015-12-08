// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.development;

import me.lyft.android.ILyftPreferences;
import me.lyft.android.LyftApplication;
import me.lyft.android.logging.AndroidLogger;
import me.lyft.android.logging.CrashlyticsLogger;
import me.lyft.android.logging.L;
import rx.Observable;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.development:
//            LeakCanarySupport, StethoSupport

public class DeveloperTools
{

    private ILyftPreferences preferences;
    private BehaviorSubject subject;

    public DeveloperTools(ILyftPreferences ilyftpreferences)
    {
        preferences = ilyftpreferences;
        subject = BehaviorSubject.create(Boolean.valueOf(isDeveloperMode()));
        updateLoggers(isDeveloperMode());
    }

    private static void startStrictMode()
    {
    }

    private void updateLoggers(boolean flag)
    {
        L.removeAll();
        L.add(new CrashlyticsLogger());
        if (flag)
        {
            L.add(new AndroidLogger());
        }
    }

    public void initDeveloperTools(LyftApplication lyftapplication)
    {
        LeakCanarySupport.installIfPresent(lyftapplication);
        StethoSupport.initStethoIfPresent(lyftapplication);
        startStrictMode();
    }

    public boolean isDeveloperMode()
    {
        return preferences.isDeveloperMode();
    }

    public Observable observeDeveloperMode()
    {
        return subject.asObservable();
    }

    public void toggleDeveloperMode()
    {
        boolean flag;
        if (!preferences.isDeveloperMode())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        preferences.setDeveloperMode(flag);
        subject.onNext(Boolean.valueOf(flag));
        updateLoggers(flag);
    }
}
