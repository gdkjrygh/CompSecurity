// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.likes:
//            TrackLikesFragment

public class TrackLikesActivity extends ScActivity
{

    ActionBarHelper actionBarHelper;
    BaseLayoutHelper baseLayoutHelper;
    PlayerController playerController;

    public TrackLikesActivity()
    {
    }

    private void attachFragment()
    {
        getSupportFragmentManager().beginTransaction().replace(0x7f0f00b5, new TrackLikesFragment()).commit();
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
            attachFragment();
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (shouldTrackScreen())
        {
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.LIKES));
        }
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setBaseLayout(this);
    }
}
