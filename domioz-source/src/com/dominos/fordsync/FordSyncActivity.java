// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fordsync;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.dominos.activities.InitialLaunchActivity;
import com.dominos.activities.LandingActivity;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.fordsync.service.AppLinkManager;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.fordsync:
//            FordSyncSession

public class FordSyncActivity extends Activity
{

    public static final String TAG = com/dominos/fordsync/FordSyncActivity.getSimpleName();
    AnalyticsUtil mAnalyticsUtil;
    private final BroadcastReceiver mAppLinkActionReceiver = new AppLinkActionReceiver(null);
    AppLinkManager mAppLinkManager;
    FordSyncSession mFordSyncSession;

    public FordSyncActivity()
    {
    }

    private void launchApplicationAndDismissLockScreen()
    {
        mAppLinkManager.setLockScreenUp(false);
        if (LandingActivity.getInstance() == null)
        {
            startActivity(new Intent(this, com/dominos/activities/InitialLaunchActivity));
        }
        finish();
    }

    protected void afterInject()
    {
        mAppLinkManager.setLockScreenUp(true);
        mAnalyticsUtil.postFordSyncInitialized();
        mAnalyticsUtil.postFordSyncConnected();
    }

    public void onBackPressed()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new IntentFilter();
        bundle.addAction("intent.action.FORDSYNC_DISCONNECT");
        registerReceiver(mAppLinkActionReceiver, bundle);
    }

    protected void onDestroy()
    {
        mAppLinkManager.setLockScreenUp(false);
        unregisterReceiver(mAppLinkActionReceiver);
        super.onDestroy();
    }

    protected void onFordsyncDisconnectClick()
    {
        LogUtil.v(TAG, "disconnect", new Object[0]);
        mAnalyticsUtil.postFordSyncDisconnected();
        mAppLinkManager.restart();
        launchApplicationAndDismissLockScreen();
    }



    private class AppLinkActionReceiver extends BroadcastReceiver
    {

        final FordSyncActivity this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent != null && StringHelper.equals(intent.getAction(), "intent.action.FORDSYNC_DISCONNECT"))
            {
                launchApplicationAndDismissLockScreen();
            }
        }

        private AppLinkActionReceiver()
        {
            this$0 = FordSyncActivity.this;
            super();
        }

        AppLinkActionReceiver(_cls1 _pcls1)
        {
            this();
        }
    }

}
