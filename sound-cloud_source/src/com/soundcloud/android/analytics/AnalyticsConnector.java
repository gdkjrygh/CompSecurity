// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.android.analytics.appboy.AppboyWrapper;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

public class AnalyticsConnector extends DefaultActivityLightCycle
{

    private final AppboyWrapper appboy;

    public AnalyticsConnector(AppboyWrapper appboywrapper)
    {
        appboy = appboywrapper;
    }

    public volatile void onPause(Activity activity)
    {
        onPause((AppCompatActivity)activity);
    }

    public void onPause(AppCompatActivity appcompatactivity)
    {
        appboy.unregisterInAppMessageManager(appcompatactivity);
    }

    public volatile void onResume(Activity activity)
    {
        onResume((AppCompatActivity)activity);
    }

    public void onResume(AppCompatActivity appcompatactivity)
    {
        appboy.registerInAppMessageManager(appcompatactivity);
    }

    public volatile void onStart(Activity activity)
    {
        onStart((AppCompatActivity)activity);
    }

    public void onStart(AppCompatActivity appcompatactivity)
    {
        if (appboy.openSession(appcompatactivity))
        {
            appboy.requestInAppMessageRefresh();
        }
    }

    public volatile void onStop(Activity activity)
    {
        onStop((AppCompatActivity)activity);
    }

    public void onStop(AppCompatActivity appcompatactivity)
    {
        appboy.closeSession(appcompatactivity);
    }
}
