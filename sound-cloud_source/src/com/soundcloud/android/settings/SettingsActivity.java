// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.os.Bundle;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.android.you.BasicSettingsFragment;
import com.soundcloud.rx.eventbus.EventBus;

public class SettingsActivity extends ScActivity
{

    BaseLayoutHelper baseLayoutHelper;
    FeatureFlags featureFlags;
    Navigator navigator;

    public SettingsActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentFragment(BasicSettingsFragment.create());
        setTitle(0x7f070208);
    }

    protected void onResume()
    {
        super.onResume();
        if (shouldTrackScreen())
        {
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.SETTINGS_MAIN));
        }
    }

    public boolean onSupportNavigateUp()
    {
        navigator.openHome(this);
        finish();
        return true;
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setContainerLayout(this);
    }
}
