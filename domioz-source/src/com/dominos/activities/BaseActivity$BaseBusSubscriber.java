// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.nina.dialog.agent.CouponGlobalCommandAgent;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import com.dominos.utils.CommandBuilder;

// Referenced classes of package com.dominos.activities:
//            BaseActivity

class <init>
{

    final BaseActivity this$0;

    public void onHideSpeechBar(com.dominos.bus.events. )
    {
        class _cls2
            implements Runnable
        {

            final BaseActivity.BaseBusSubscriber this$1;

            public void run()
            {
                setNinaPaddingVisibility(8);
                mSpeechManager.isNinaBusy = false;
                mSpeechManager.enableDisableActivityViews(true, this$0);
            }

            _cls2()
            {
                this$1 = BaseActivity.BaseBusSubscriber.this;
                super();
            }
        }

        runOnUiThread(new _cls2());
    }

    public void onHomeClickRequested(com.dominos.bus.events.equested equested)
    {
        mSpeechManager.preventNinaPause();
        onHomeButtonClick();
    }

    public void onRedemptionRequested(com.dominos.bus.events.eem eem)
    {
        if (!mLoyaltyManager.isLoyaltyAvailable() || !mLoyaltyManager.isCustomerEnrolledInLoyalty())
        {
            eem = (new CommandBuilder()).appendReset(CouponGlobalCommandAgent.NAME).build();
            mActivityHelper.showAlert(AlertType.LOYALTY_CANNOT_REDEEM, eem);
        }
    }

    public void onShowSpeechBar(com.dominos.bus.events. )
    {
        class _cls1
            implements Runnable
        {

            final BaseActivity.BaseBusSubscriber this$1;

            public void run()
            {
                setNinaPaddingVisibility(0);
                mAnalyticsUtil.postTrackVoiceActive();
            }

            _cls1()
            {
                this$1 = BaseActivity.BaseBusSubscriber.this;
                super();
            }
        }

        runOnUiThread(new _cls1());
    }

    private ()
    {
        this$0 = BaseActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
