// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.Window;
import rx.Observable;
import rx.subjects.BehaviorSubject;

public class ActivityController
{

    private final BehaviorSubject configurationSubject = BehaviorSubject.create();
    private Activity currentActivity;

    ActivityController()
    {
    }

    public void disableKeepScreenOn()
    {
        currentActivity.getWindow().clearFlags(0x600080);
    }

    public void enableKeepScreenOn()
    {
        currentActivity.getWindow().addFlags(0x600080);
    }

    public void finish()
    {
        currentActivity.finish();
    }

    public Activity getActivity()
    {
        return currentActivity;
    }

    public Observable observeConfigurationChange()
    {
        return configurationSubject.asObservable();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        configurationSubject.onNext(configuration);
    }

    public void onCreate(Activity activity)
    {
        currentActivity = activity;
    }

    public void onDestroy(Activity activity)
    {
        if (activity.equals(currentActivity))
        {
            currentActivity = null;
        }
    }

    public void restoreDefaultOrientation()
    {
        currentActivity.setRequestedOrientation(1);
    }

    public void setLandscapeOrientation()
    {
        currentActivity.setRequestedOrientation(0);
    }

    public void setRotationOrientation()
    {
        currentActivity.setRequestedOrientation(4);
    }

    public void startActivity(Intent intent)
    {
        currentActivity.startActivity(intent);
    }
}
