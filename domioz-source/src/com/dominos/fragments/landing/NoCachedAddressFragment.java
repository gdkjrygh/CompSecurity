// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.landing;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.widget.LinearLayout;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.activities.BaseActivity;
import com.dominos.activities.PizzaProfileActivity_;
import com.dominos.activities.PizzaTrackerPhoneNumberActivity_;
import com.dominos.activities.StoreListActivity_;
import com.dominos.activities.UserLoginActivity_;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.controllers.interfaces.IDominosNoCachedAddressFragment;
import com.dominos.controllers.utils.ControllerLocator;
import com.dominos.fragments.ShopRunnerFragment_;
import com.dominos.news.activity.NewsFeedActivity_;
import com.dominos.news.analytics.PushAnalyticsProcessor;
import com.dominos.news.manager.PushManager;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.views.HomeFragmentFooterView;

// Referenced classes of package com.dominos.fragments.landing:
//            NoCachedAddressFragment_

public class NoCachedAddressFragment extends Fragment
    implements IDominosNoCachedAddressFragment, com.dominos.views.HomeFragmentFooterView.OnLandingFragmentFooterClickListener
{

    ControllerLocator controllerLocator;
    AnalyticsUtil mAnalyticsUtil;
    private OnServiceMethodListener mDeliveryActionListener;
    PushAnalyticsProcessor mExternalTrakingUtil;
    HomeFragmentFooterView mFooter;
    MobileSession mMobileSession;
    private UserProfileManager mProfileManager;
    private PushManager mPushManager;
    SpeechManager mSpeechManager;
    LinearLayout signInInfoLayout;

    public NoCachedAddressFragment()
    {
    }

    public static NoCachedAddressFragment newInstance(OnServiceMethodListener onservicemethodlistener)
    {
        NoCachedAddressFragment_ nocachedaddressfragment_ = new NoCachedAddressFragment_();
        nocachedaddressfragment_.setOnServiceMethodListener(onservicemethodlistener);
        return nocachedaddressfragment_;
    }

    private void refreshViews()
    {
        setLoginTouchText();
        if (mProfileManager.isUserWithOrderHistory())
        {
            mFooter.setVisibility(8);
        } else
        {
            mFooter.setOnClickListener(this);
        }
        if (!mPushManager.isPushEnabled())
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

    void afterViews()
    {
        FontManager.applyDominosFont(this);
        refreshViews();
    }

    void onAfterInject()
    {
        mProfileManager = (UserProfileManager)mMobileSession.getManager("user_manager");
        mPushManager = (PushManager)mMobileSession.getManager("push_manager");
    }

    public void onCarryoutButtonClick()
    {
        android.content.SharedPreferences.Editor editor;
        if (mProfileManager.isAuthorizedUser() || mProfileManager.isRemembered())
        {
            mAnalyticsUtil.postProfiledCarryoutClicked();
        } else
        {
            mAnalyticsUtil.postAnonymousCarryoutClicked();
        }
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.CarryOutTapped());
        mSpeechManager.preventNinaPause();
        editor = App.editor();
        editor.putString("orderMode", "Carryout");
        editor.putBoolean("firstTimeUser", false).commit();
        StoreListActivity_.intent(this).start();
        if (mProfileManager.isUserWithOrderHistory())
        {
            ((BaseActivity)getActivity()).finishFragment(this);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            getChildFragmentManager().a().b(0x7f0f030a, new ShopRunnerFragment_()).b();
        }
    }

    public void onDeliveryButtonClick()
    {
        android.content.SharedPreferences.Editor editor;
        if (mProfileManager.isAuthorizedUser() || mProfileManager.isRemembered())
        {
            mAnalyticsUtil.postProfiledDeliveryClicked();
        } else
        {
            mAnalyticsUtil.postAnonymousDeliveryClicked();
        }
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.DeliveryTapped());
        mSpeechManager.preventNinaPause();
        editor = App.editor();
        editor.putString("orderMode", "Delivery");
        editor.putBoolean("firstTimeUser", false).commit();
        if (mDeliveryActionListener != null)
        {
            mDeliveryActionListener.onDeliverySelected();
        }
        if (mProfileManager.isUserWithOrderHistory())
        {
            ((BaseActivity)getActivity()).finishFragment(this);
        }
    }

    public void onLoginButtonClick()
    {
        mAnalyticsUtil.postSignInButtonClicked();
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

    public void onNewsButtonClick()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        mAnalyticsUtil.postNewsFeedLandingTapped();
        NewsFeedActivity_.intent(this).start();
    }

    public void onTrackerButtonClick()
    {
        mAnalyticsUtil.postTrackerHomeClicked();
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        PizzaTrackerPhoneNumberActivity_.intent(this).start();
    }

    public void setOnServiceMethodListener(OnServiceMethodListener onservicemethodlistener)
    {
        mDeliveryActionListener = onservicemethodlistener;
    }

    public void showUserAccountActivity()
    {
        startActivity(new Intent(getActivity(), com/dominos/activities/PizzaProfileActivity_));
    }

    public void showUserLoginActivity()
    {
        Intent intent = new Intent(getActivity(), com/dominos/activities/UserLoginActivity_);
        if (mProfileManager.isRemembered())
        {
            intent.putExtra("confirm-login", true);
        } else
        {
            intent.putExtra("return-to-caller", true);
        }
        startActivity(intent);
    }

    private class OnServiceMethodListener
    {

        public abstract void onDeliverySelected();
    }

}
