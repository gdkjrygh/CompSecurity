// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.m;
import android.text.Html;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.dialogs.LoginDialogFragment;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AnalyticsUtil;

// Referenced classes of package com.dominos.activities:
//            LoyaltyInfoFragment_, RegistrationActivity_, UserLoginActivity_, LoyaltyTermsWebActivity_

public class LoyaltyInfoFragment extends m
{

    public static final String TAG = com/dominos/activities/LoyaltyInfoFragment.getSimpleName();
    Button mActivateButton;
    ActivityHelper mActivityHelper;
    TextView mAlreadyHaveAProfile;
    AnalyticsUtil mAnalyticsUtil;
    private OnFinishLoyaltyInfoFragment mFinishListener;
    ImageView mImageLoyalty;
    ImageView mImageShopRunner;
    InfoType mInfoType;
    TextView mLoyaltyTerms;
    MobileSession mMobileSession;
    private UserProfileManager mProfileManager;
    TextView mShoprunnerSignIn;
    TextView mSignInToActivate;
    UserAuthorization mUserAuthorization;

    public LoyaltyInfoFragment()
    {
    }

    public static LoyaltyInfoFragment newInstance(InfoType infotype)
    {
        return LoyaltyInfoFragment_.builder().mInfoType(infotype).build();
    }

    private void setUpViews()
    {
        switch (_cls3..SwitchMap.com.dominos.activities.LoyaltyInfoFragment.InfoType[mInfoType.ordinal()])
        {
        default:
            return;

        case 2: // '\002'
            mActivateButton.setVisibility(8);
            return;

        case 4: // '\004'
            mAnalyticsUtil.postLearnMoreInterstitialLoadLoggedIn();
            mActivateButton.setText(getString(0x7f080048));
            mLoyaltyTerms.setVisibility(0);
            mLoyaltyTerms.setText(Html.fromHtml(getString(0x7f08004a)));
            return;

        case 6: // '\006'
            mAnalyticsUtil.postLearnMoreInterstitialLoadAnonymous();
            mActivateButton.setText(getString(0x7f080112));
            mSignInToActivate.setVisibility(0);
            mAlreadyHaveAProfile.setVisibility(0);
            mSignInToActivate.setText(Html.fromHtml(getString(0x7f0802ac)));
            mLoyaltyTerms.setVisibility(0);
            mLoyaltyTerms.setText(Html.fromHtml(getString(0x7f08004a)));
            return;

        case 3: // '\003'
            mImageLoyalty.setVisibility(8);
            mImageShopRunner.setVisibility(0);
            mActivateButton.setText(getString(0x7f080048));
            mLoyaltyTerms.setVisibility(0);
            mLoyaltyTerms.setText(Html.fromHtml(getString(0x7f08004a)));
            return;

        case 5: // '\005'
            mImageLoyalty.setVisibility(8);
            mImageShopRunner.setVisibility(0);
            mActivateButton.setText(getString(0x7f080112));
            mAlreadyHaveAProfile.setVisibility(0);
            mShoprunnerSignIn.setVisibility(0);
            mShoprunnerSignIn.setText(Html.fromHtml(getString(0x7f0802a5)));
            return;

        case 1: // '\001'
            mImageLoyalty.setVisibility(8);
            mImageShopRunner.setVisibility(0);
            mActivateButton.setText(getString(0x7f0800b8));
            return;
        }
    }

    public void afterInject()
    {
        mProfileManager = (UserProfileManager)mMobileSession.getManager("user_manager");
    }

    void afterView()
    {
        FontManager.applyDominosFont(this);
        setUpViews();
    }

    protected void dismissDialog()
    {
        dismiss();
    }

    public void onActivateClick()
    {
        switch (_cls3..SwitchMap.com.dominos.activities.LoyaltyInfoFragment.InfoType[mInfoType.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
            dismissDialog();
            return;

        case 3: // '\003'
        case 4: // '\004'
            mAnalyticsUtil.postInterstitialActivateTap();
            saveCustomerWithLoyalty();
            return;

        case 5: // '\005'
        case 6: // '\006'
            mAnalyticsUtil.postInterstitialEnrollTap();
            break;
        }
        dismissDialog();
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        RegistrationActivity_.intent(getActivity()).mPreSelectLoyalty(true).start();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof OnFinishLoyaltyInfoFragment)
        {
            mFinishListener = (OnFinishLoyaltyInfoFragment)activity;
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        super.onCancel(dialoginterface);
        App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
    }

    public void onCloseClick()
    {
        if (mProfileManager.isAuthorizedUser() || mProfileManager.isRemembered())
        {
            mAnalyticsUtil.postCloseRewardsInterstitialLoggedIn();
        } else
        {
            mAnalyticsUtil.postCloseRewardsInterstitialAnonymous();
        }
        App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
        dismissDialog();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = super.onCreateDialog(bundle);
        bundle.requestWindowFeature(1);
        bundle.setCanceledOnTouchOutside(false);
        bundle.getWindow().setBackgroundDrawableResource(0x7f0e009e);
        return bundle;
    }

    public void onDetach()
    {
        super.onDetach();
        mFinishListener = null;
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (mFinishListener != null)
        {
            mFinishListener.onFinishLoyaltyInfoFragment();
        }
    }

    public void onSignInToActivateClick()
    {
        mAnalyticsUtil.postInterstitialSignInToActivateTap();
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        dismissDialog();
        UserLoginActivity_.intent(getActivity()).mEnrollInLoyalty(true).start();
    }

    public void onTermsClick()
    {
        if (mProfileManager.isAuthorizedUser() || mProfileManager.isRemembered())
        {
            mAnalyticsUtil.postRewardsTermsAndConditionClickLoggedIn();
        } else
        {
            mAnalyticsUtil.postRewardsTermsAndConditionClickAnonymous();
        }
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        LoyaltyTermsWebActivity_.intent(this).start();
    }

    protected void popLoginDialog()
    {
        LoginDialogFragment.newInstance(null, null, false, false, new _cls2()).show(getFragmentManager());
    }

    protected void saveCustomerWithLoyalty()
    {
        mProfileManager.enrollCustomerWithLoyalty(new _cls1());
    }

    protected void shoprunnerSignIn()
    {
        App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
        dismissDialog();
        Intent intent = new Intent(getActivity(), com/dominos/activities/UserLoginActivity_);
        intent.putExtra("return-to-caller", true);
        startActivity(intent);
    }


    private class _cls3
    {

        static final int $SwitchMap$com$dominos$activities$LoyaltyInfoFragment$InfoType[];

        static 
        {
            $SwitchMap$com$dominos$activities$LoyaltyInfoFragment$InfoType = new int[InfoType.values().length];
            try
            {
                $SwitchMap$com$dominos$activities$LoyaltyInfoFragment$InfoType[InfoType.INFO_SR.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$activities$LoyaltyInfoFragment$InfoType[InfoType.INFO.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$activities$LoyaltyInfoFragment$InfoType[InfoType.ACTIVATE_SR.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$activities$LoyaltyInfoFragment$InfoType[InfoType.ACTIVATE.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$activities$LoyaltyInfoFragment$InfoType[InfoType.REGISTER_SR.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$activities$LoyaltyInfoFragment$InfoType[InfoType.REGISTER.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class InfoType extends Enum
    {

        private static final InfoType $VALUES[];
        public static final InfoType ACTIVATE;
        public static final InfoType ACTIVATE_SR;
        public static final InfoType INFO;
        public static final InfoType INFO_SR;
        public static final InfoType REGISTER;
        public static final InfoType REGISTER_SR;

        public static InfoType valueOf(String s)
        {
            return (InfoType)Enum.valueOf(com/dominos/activities/LoyaltyInfoFragment$InfoType, s);
        }

        public static InfoType[] values()
        {
            return (InfoType[])$VALUES.clone();
        }

        static 
        {
            ACTIVATE = new InfoType("ACTIVATE", 0);
            INFO = new InfoType("INFO", 1);
            REGISTER = new InfoType("REGISTER", 2);
            ACTIVATE_SR = new InfoType("ACTIVATE_SR", 3);
            REGISTER_SR = new InfoType("REGISTER_SR", 4);
            INFO_SR = new InfoType("INFO_SR", 5);
            $VALUES = (new InfoType[] {
                ACTIVATE, INFO, REGISTER, ACTIVATE_SR, REGISTER_SR, INFO_SR
            });
        }

        private InfoType(String s, int i)
        {
            super(s, i);
        }
    }


    private class OnFinishLoyaltyInfoFragment
    {

        public abstract void onFinishLoyaltyInfoFragment();
    }


    private class _cls2
        implements com.dominos.dialogs.LoginDialogFragment.OnActionListener
    {

        final LoyaltyInfoFragment this$0;

        public void onCanceled()
        {
        }

        public void onContinueAsGuest()
        {
        }

        public void onLoginSuccess()
        {
            saveCustomerWithLoyalty();
        }

        public void onSignOut()
        {
        }

        _cls2()
        {
            this$0 = LoyaltyInfoFragment.this;
            super();
        }
    }


    private class _cls1 extends com.dominos.android.sdk.core.user.UserProfileManager.UpdateCustomerWithLoyaltyCallback
    {

        final LoyaltyInfoFragment this$0;

        public void onAuthorizationRequired()
        {
            popLoginDialog();
        }

        public void onBegin()
        {
            super.onBegin();
            if (getActivity() instanceof BaseActivity)
            {
                ((BaseActivity)getActivity()).showLoading();
            }
        }

        public void onCustomerUpdateError()
        {
            mActivityHelper.showAlert(AlertType.LOYALTY_PROFILED_USER_ACTIVATE_ERROR);
        }

        public void onCustomerUpdated()
        {
            App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertClose(new String[0]));
            mAnalyticsUtil.postLoyaltyEnrolledEvent();
            dismissDialog();
        }

        public void onFinish()
        {
            super.onFinish();
            if (getActivity() instanceof BaseActivity)
            {
                ((BaseActivity)getActivity()).hideLoading();
            }
        }

        public void onLoyaltyEnrollFail()
        {
            mActivityHelper.showAlert(AlertType.LOYALTY_PROFILED_USER_ACTIVATE_ERROR);
        }

        _cls1()
        {
            this$0 = LoyaltyInfoFragment.this;
            super();
        }
    }

}
