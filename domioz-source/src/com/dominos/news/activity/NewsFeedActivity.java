// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.activity;

import android.os.Bundle;
import com.dominos.MobileSession;
import com.dominos.activities.BaseActivity;
import com.dominos.activities.LandingActivity_;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.loader.ApplicationLoader;
import com.dominos.news.manager.PushManager;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.views.ToolBarView;

public class NewsFeedActivity extends BaseActivity
{

    ApplicationLoader mApplicationLoader;
    private PushManager mPushManager;
    ToolBarView mTopBarView;

    public NewsFeedActivity()
    {
    }

    protected void onAfterInject()
    {
        mPushManager = (PushManager)mMobileSession.getManager("push_manager");
        mPushManager.setup(getApplication());
    }

    protected void onAfterViews()
    {
        FontManager.applyDominosFont(this);
        mTopBarView.setTitle(getString(0x7f08039b));
        if (!mApplicationLoader.isApplicationInitialized())
        {
            mTopBarView.setHomeButtonVisibility(8);
            mApplicationLoader.setupAsync(mMobileSession, new _cls1());
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mAnalyticsUtil.postNewsFeedScreenLoad();
    }

    public void onHomeButtonClicked()
    {
        ((com.dominos.activities.LandingActivity_.IntentBuilder_)LandingActivity_.intent(this).flags(0x4000000)).start();
        finish();
    }

    private class _cls1
        implements com.dominos.loader.ApplicationLoader.SetupLoadCallback
    {

        final NewsFeedActivity this$0;

        public void onSetupFailure(int i, String s)
        {
        }

        public void onSetupSuccess()
        {
            mTopBarView.setHomeButtonVisibility(0);
        }

        _cls1()
        {
            this$0 = NewsFeedActivity.this;
            super();
        }
    }

}
