// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;

import android.content.Intent;
import android.widget.Toast;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.activities.HistoricalListActivity_;
import com.dominos.activities.PizzaProfileActivity_;
import com.dominos.activities.PizzaTrackerPhoneNumberActivity_;
import com.dominos.activities.UserLoginActivity_;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.controllers.FastPathFragmentController;
import com.dominos.controllers.interfaces.IDominosFastPathFragment;
import com.dominos.controllers.utils.ControllerLocator;
import com.dominos.news.activity.NewsFeedActivity_;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.views.HomeFragmentFooterView;

// Referenced classes of package com.dominos.fragments.landing:
//            ReOrderFragment, FastPathFragment_

public class FastPathFragment extends ReOrderFragment
    implements IDominosFastPathFragment, com.dominos.views.HomeFragmentFooterView.OnLandingFragmentFooterClickListener
{

    private OnNewOrderSelectedListener callback;
    FastPathFragmentController controller;
    ControllerLocator controllerLocator;
    HomeFragmentFooterView mFooter;
    private UserProfileManager mProfileManager;
    private RecentOrderBus mRecentOrderBus;

    public FastPathFragment()
    {
    }

    public static FastPathFragment newInstance(OnNewOrderSelectedListener onneworderselectedlistener)
    {
        FastPathFragment_ fastpathfragment_ = new FastPathFragment_();
        fastpathfragment_.setNewOrderSelectedListener(onneworderselectedlistener);
        return fastpathfragment_;
    }

    private void refreshViews()
    {
        setLoginTouchText();
        mFooter.setOnClickListener(this);
        if (!mConfigurationManager.getApplicationConfiguration().isPushNotificationsEnabled())
        {
            mFooter.showNewsfeed(false);
        }
    }

    private void setLoginTouchText()
    {
label0:
        {
            if (mFooter != null)
            {
                if (!mProfileManager.isAuthorizedUser())
                {
                    break label0;
                }
                mFooter.setLoginText(getString(0x7f080338));
            }
            return;
        }
        mFooter.setLoginText(getString(0x7f080397));
    }

    public OnNewOrderSelectedListener getCallback()
    {
        return callback;
    }

    void onAfterInject()
    {
        controller = controllerLocator.getFastPathFragmentController(this);
        mProfileManager = (UserProfileManager)mMobileSession.getManager("user_manager");
    }

    void onAfterViews()
    {
        FontManager.applyDominosFont(this);
        refreshViews();
    }

    public void onLoginButtonClick()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        Intent intent;
        if (mProfileManager.getAuthorizationCode() == null)
        {
            intent = new Intent(getActivity(), com/dominos/activities/UserLoginActivity_);
            if (mProfileManager.isRemembered())
            {
                intent.putExtra("confirm-login", true);
            } else
            {
                mProfileManager.clearCurrentUser();
                intent.putExtra("return-to-caller", true);
            }
        } else
        {
            intent = new Intent(getActivity(), com/dominos/activities/PizzaProfileActivity_);
        }
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        startActivity(intent);
    }

    public void onNewOrderButtonClick()
    {
        mAnalyticsUtil.postCreateNewOrderClicked();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.LandingNewOrderTapped());
        callback.onNewOrder();
    }

    public void onNewsButtonClick()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        mAnalyticsUtil.postNewsFeedLandingTapped();
        NewsFeedActivity_.intent(this).start();
    }

    public void onOrderHistoryButtonClick()
    {
        mAnalyticsUtil.postRecentOrdersClicked();
        controller.showOrderHistory();
    }

    public void onPause()
    {
        super.onPause();
        if (mRecentOrderBus != null)
        {
            App.getInstance().bus.unregister(mRecentOrderBus);
            mRecentOrderBus = null;
        }
    }

    public void onResume()
    {
        super.onResume();
        if (mRecentOrderBus == null)
        {
            mRecentOrderBus = new RecentOrderBus(null);
        }
        App.getInstance().bus.register(mRecentOrderBus);
    }

    public void onTrackerButtonClick()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        PizzaTrackerPhoneNumberActivity_.intent(this).start();
    }

    public void setCallback(OnNewOrderSelectedListener onneworderselectedlistener)
    {
        callback = onneworderselectedlistener;
    }

    public void setNewOrderSelectedListener(OnNewOrderSelectedListener onneworderselectedlistener)
    {
        callback = onneworderselectedlistener;
    }

    public void showOrderHistoryActivity()
    {
        mSpeechManager.preventNinaPause();
        ((com.dominos.activities.HistoricalListActivity_.IntentBuilder_)HistoricalListActivity_.intent(this).flags(0x40000000)).start();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.LandingRecentOrderTapped());
    }

    public void showSessionTimeoutAlert()
    {
        Toast.makeText(getActivity(), getString(0x7f0802a2), 1).show();
    }


    private class OnNewOrderSelectedListener
    {

        public abstract void onNewOrder();
    }


    private class RecentOrderBus
    {

        final FastPathFragment this$0;

        public void reOrderMostRecentOrder(com.dominos.bus.events.OriginatedFromSpeech.RecentOrderSelection recentorderselection)
        {
            if (mProfileManager.getOrderHistoryList() != null && !mProfileManager.getOrderHistoryList().isEmpty())
            {
                recentorderselection = (LabsOrder)mProfileManager.getOrderHistoryList().get(recentorderselection.getIndex());
                reorder(recentorderselection);
            }
        }

        public void showRecentOrder(com.dominos.bus.events.OriginatedFromSpeech.OpenRecentOrderList openrecentorderlist)
        {
            showOrderHistoryActivity();
        }

        private RecentOrderBus()
        {
            this$0 = FastPathFragment.this;
            super();
        }

        RecentOrderBus(_cls1 _pcls1)
        {
            this();
        }
    }

}
