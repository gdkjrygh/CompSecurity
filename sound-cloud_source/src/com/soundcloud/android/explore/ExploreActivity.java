// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.Navigator;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.explore:
//            ExplorePresenter

public class ExploreActivity extends ScActivity
{

    ActionBarHelper actionBarHelper;
    BaseLayoutHelper baseLayoutHelper;
    ExplorePresenter explorePresenter;
    Navigator navigator;
    PlayerController playerController;

    public ExploreActivity()
    {
    }

    public void onBackPressed()
    {
        if (!playerController.handleBackPressed())
        {
            super.onBackPressed();
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (shouldTrackScreen())
        {
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.EXPLORE_TRENDING_MUSIC));
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
        baseLayoutHelper.createActionBarLayout(this, 0x7f030065);
    }
}
