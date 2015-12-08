// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

class ScreenStateProvider extends DefaultActivityLightCycle
{

    private static final String BUNDLE_CONFIGURATION_CHANGE = "BUNDLE_CONFIGURATION_CHANGE";
    private boolean isConfigurationChange;
    private boolean isForeground;
    private boolean onCreateCalled;

    public ScreenStateProvider()
    {
    }

    boolean isConfigurationChange()
    {
        return isConfigurationChange;
    }

    boolean isForeground()
    {
        return isForeground;
    }

    boolean isReallyResuming()
    {
        return !onCreateCalled;
    }

    public volatile void onCreate(Activity activity, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        onCreateCalled = true;
        if (bundle != null)
        {
            isConfigurationChange = bundle.getBoolean("BUNDLE_CONFIGURATION_CHANGE", false);
        }
    }

    public volatile void onPause(Activity activity)
    {
        onPause((AppCompatActivity)activity);
    }

    public void onPause(AppCompatActivity appcompatactivity)
    {
        onCreateCalled = false;
        isForeground = false;
    }

    public volatile void onResume(Activity activity)
    {
        onResume((AppCompatActivity)activity);
    }

    public void onResume(AppCompatActivity appcompatactivity)
    {
        isForeground = true;
    }

    public volatile void onSaveInstanceState(Activity activity, Bundle bundle)
    {
        onSaveInstanceState((AppCompatActivity)activity, bundle);
    }

    public void onSaveInstanceState(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        boolean flag;
        if (appcompatactivity.getChangingConfigurations() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("BUNDLE_CONFIGURATION_CHANGE", flag);
    }
}
