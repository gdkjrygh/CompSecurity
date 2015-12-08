// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.actionbar.ActionBarHelper;
import com.soundcloud.android.analytics.Referrer;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.deeplinks.ResolveActivity;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ForegroundEvent;
import com.soundcloud.android.facebookinvites.FacebookInvitesController;
import com.soundcloud.android.gcm.GcmManager;
import com.soundcloud.android.playback.PlaySessionController;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.main:
//            ScActivity, NavigationIntentHelper, EmailOptInDialogFragment, Screen, 
//            PlayerController, MainTabsPresenter

public class MainActivity extends ScActivity
{

    public static final String EXTRA_FROM_SIGNIN = "from_sign_in";
    public static final String EXTRA_REFRESH_STREAM = "refresh_stream";
    ActionBarHelper actionBarHelper;
    CastConnectionHelper castConnectionHelper;
    FacebookInvitesController facebookInvitesController;
    GcmManager gcmManager;
    MainTabsPresenter mainPresenter;
    PlaySessionController playSessionController;
    PlayerController playerController;

    public MainActivity()
    {
    }

    private void redirectFacebookDeeplinkToResolver(Uri uri)
    {
        startActivity((new Intent(this, com/soundcloud/android/deeplinks/ResolveActivity)).setAction("android.intent.action.VIEW").setData(uri));
        finish();
    }

    private void redirectToResolverIfNecessary(Intent intent)
    {
        intent = intent.getData();
        if (intent != null && ResolveActivity.accept(intent, getResources()) && !NavigationIntentHelper.resolvesToNavigationItem(intent))
        {
            redirectFacebookDeeplinkToResolver(intent);
        }
    }

    private void setupEmailOptIn()
    {
        if (getIntent().getBooleanExtra("from_sign_in", false))
        {
            EmailOptInDialogFragment.show(this);
        }
    }

    private void trackForegroundEvent(Intent intent)
    {
        if (Referrer.hasReferrer(intent) && Screen.hasScreen(intent))
        {
            eventBus.publish(EventQueue.TRACKING, ForegroundEvent.open(Screen.fromIntent(intent), Referrer.fromIntent(intent)));
        }
    }

    public void onBackPressed()
    {
        if (accountOperations.isCrawler() || !playerController.handleBackPressed())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        redirectToResolverIfNecessary(getIntent());
        super.onCreate(bundle);
        if (bundle == null)
        {
            playSessionController.reloadQueueAndShowPlayerIfEmpty();
            setupEmailOptIn();
        }
        castConnectionHelper.reconnectSessionIfPossible();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        configureMainOptionMenuItems(menu);
        return true;
    }

    protected void onNewIntent(Intent intent)
    {
        redirectToResolverIfNecessary(intent);
        super.onNewIntent(intent);
        trackForegroundEvent(intent);
        setIntent(intent);
    }

    protected void onResume()
    {
        super.onResume();
        if (!accountOperations.isUserLoggedIn())
        {
            accountOperations.triggerLoginFlow(this);
            finish();
        }
        if (shouldTrackScreen())
        {
            mainPresenter.trackScreen();
        }
    }

    protected void setActivityContentView()
    {
        mainPresenter.setBaseLayout(this);
    }
}
