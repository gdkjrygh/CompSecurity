// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.collections.ScListFragment;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.properties.FeatureFlags;
import com.soundcloud.android.properties.Flag;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivitiesFragment

public class ActivitiesActivity extends ScActivity
{

    ActionBarHelper actionBarHelper;
    BaseLayoutHelper baseLayoutHelper;
    FeatureFlags featureFlags;
    Navigator navigator;
    PlayerController playerController;

    public ActivitiesActivity()
    {
    }

    public void onBackPressed()
    {
        if (!playerController.handleBackPressed())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            if (featureFlags.isEnabled(Flag.ACTIVITIES_REFACTOR))
            {
                bundle = new ActivitiesFragment();
            } else
            {
                bundle = ScListFragment.newInstance();
            }
            getSupportFragmentManager().beginTransaction().add(getContentHolderViewId(), bundle).commit();
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (shouldTrackScreen())
        {
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.ACTIVITIES));
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
        baseLayoutHelper.setBaseLayoutWithMargins(this);
    }
}
