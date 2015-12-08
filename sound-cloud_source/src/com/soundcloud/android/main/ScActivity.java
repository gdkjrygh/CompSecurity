// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.accounts.AccountPlaybackController;
import com.soundcloud.android.accounts.UserRemovedController;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.analytics.AnalyticsConnector;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.image.ImageOperationsController;
import com.soundcloud.android.playback.notification.PlaybackNotificationController;
import com.soundcloud.android.policies.PolicyUpdateController;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.lightcycle.LightCycleAppCompatActivity;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;

// Referenced classes of package com.soundcloud.android.main:
//            ScreenStateProvider, MainActivity, ActivityLifeCyclePublisher, NetworkConnectivityController

public abstract class ScActivity extends LightCycleAppCompatActivity
{

    protected AccountOperations accountOperations;
    AccountPlaybackController accountPlaybackController;
    ActionBarHelper actionMenuController;
    ActivityLifeCyclePublisher activityLifeCyclePublisher;
    AnalyticsConnector analyticsConnector;
    ApplicationProperties applicationProperties;
    CastConnectionHelper castConnectionHelper;
    public EventBus eventBus;
    ImageOperationsController imageOperationsController;
    NetworkConnectivityController networkConnectivityController;
    PlaybackNotificationController playbackNotificationController;
    PolicyUpdateController policyUpdateController;
    ScreenStateProvider screenStateProvider;
    com.soundcloud.android.receiver.UnauthorisedRequestReceiver.LightCycle unauthorisedRequestLightCycle;
    UserRemovedController userRemovedController;

    public ScActivity()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public static int getContentHolderViewId()
    {
        return 0x7f0f00b5;
    }

    protected void configureMainOptionMenuItems(Menu menu)
    {
        actionMenuController.onCreateOptionsMenu(menu, getMenuInflater());
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        if (castConnectionHelper.onDispatchVolumeEvent(keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEvent(keyevent);
        }
    }

    public boolean isForeground()
    {
        return screenStateProvider.isForeground();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f100001, menu);
        return true;
    }

    public boolean onSearchRequested()
    {
        startActivity((new Intent("com.soundcloud.android.action.SEARCH")).addFlags(0x4000000));
        return false;
    }

    public boolean onSupportNavigateUp()
    {
        if (isTaskRoot())
        {
            startActivity(new Intent(this, com/soundcloud/android/main/MainActivity));
        }
        finish();
        return true;
    }

    public void setActivityContentView()
    {
    }

    public void setContentFragment(Fragment fragment)
    {
        getFragmentManager().beginTransaction().replace(getContentHolderViewId(), fragment).commit();
    }

    public boolean shouldTrackScreen()
    {
        return !screenStateProvider.isConfigurationChange() || screenStateProvider.isReallyResuming();
    }
}
