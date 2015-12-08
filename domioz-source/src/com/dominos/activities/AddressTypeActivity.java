// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.content.Intent;
import android.support.v4.app.ah;
import android.support.v4.app.u;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.fragments.ShopRunnerFragment_;
import com.dominos.fragments.SignInFragment;
import com.dominos.fragments.SignInFragment_;
import com.dominos.nina.speech.SpeechManager;
import com.dominos.utils.AddressType;
import com.dominos.utils.AnalyticsUtil;
import com.dominos.views.AddressTypeView;
import com.dominos.views.AddressTypeView_;
import com.dominos.views.ToolBarView;
import java.util.List;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, DeliveryActivity_, UserLoginActivity_, SavedAddressActivity_

public class AddressTypeActivity extends BaseActivity
{

    LinearLayout mAddressTypeContainer;
    FrameLayout mFragmentContainer;
    LinearLayout mScrollViewChildLayout;
    ToolBarView mToolBar;

    public AddressTypeActivity()
    {
    }

    private void displayAddressTypes()
    {
        mAddressTypeContainer.removeAllViews();
        _cls2 _lcls2 = new _cls2();
        for (int i = 0; i < AddressType.getAddressTypeList().size(); i++)
        {
            AddressTypeView addresstypeview = AddressTypeView_.build(this);
            addresstypeview.bind((AddressType)AddressType.getAddressTypeList().get(i), i);
            addresstypeview.setOnClickListener(_lcls2);
            mAddressTypeContainer.addView(addresstypeview);
        }

        FontManager.applyDominosFont(mAddressTypeContainer);
    }

    private void navigateDeliveryActivity(View view)
    {
        mSpeechManager.preventNinaPause();
        DeliveryActivity_.intent(this).mAddressTypeIndex(((Integer)view.getTag()).intValue()).startForResult(16);
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.NewAddressRequested());
    }

    private void navigateToLogin()
    {
        UserProfileManager userprofilemanager = (UserProfileManager)mMobileSession.getManager("user_manager");
        Intent intent = new Intent(this, com/dominos/activities/UserLoginActivity_);
        intent.putExtra("return-to-caller", true).putExtra("caller-is-address-delivery-activity", true);
        if (userprofilemanager.isRemembered())
        {
            intent.putExtra("confirm-login", true);
        } else
        {
            intent.putExtra("return-to-caller", true);
        }
        startActivityForResult(intent, 4);
    }

    private void showFragments()
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)mFragmentContainer.getLayoutParams();
        android.support.v4.app.Fragment fragment = getSupportFragmentManager().a(0x7f0f009a);
        if (fragment != null)
        {
            getSupportFragmentManager().a().a(fragment).b();
        }
        if (!mProfileManager.isAuthorizedUser())
        {
            layoutparams.gravity = 3;
            SignInFragment signinfragment = SignInFragment_.builder().build();
            signinfragment.setSignInClickListener(new _cls1());
            mFragmentContainer.setLayoutParams(layoutparams);
            getSupportFragmentManager().a().b(0x7f0f009a, signinfragment).b();
        } else
        if (!mProfileManager.isSavedAddressExists())
        {
            layoutparams.gravity = 17;
            mFragmentContainer.setLayoutParams(layoutparams);
            getSupportFragmentManager().a().b(0x7f0f009a, ShopRunnerFragment_.builder().build()).b();
            return;
        }
    }

    void afterViews()
    {
        mToolBar.setTitle(getString(0x7f080050));
        mScrollViewChildLayout.addView(getNinaPaddingView());
    }

    public boolean handleHomeButtonClicked()
    {
        setResult(4096);
        mSpeechManager.resetDialogModel();
        finish();
        return true;
    }

    protected void onActivityResult(int i, Intent intent)
    {
        switch (i)
        {
        default:
            return;

        case 4096: 
            setResult(4096);
            break;
        }
        finish();
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        App.getInstance().bus.post(new com.dominos.bus.events.OriginatedFromUX.NewAddressDismissed());
    }

    protected void onPostResume()
    {
        super.onPostResume();
        showFragments();
    }

    public void onResume()
    {
        super.onResume();
        displayAddressTypes();
    }

    protected void onStart()
    {
        super.onStart();
        mAnalyticsUtil.postDeliveryAddressTypePage();
        App.getInstance().bus.post(new com.dominos.bus.events.ExplicitNavigationEvents.NewAddressTypeTransition());
    }

    public void onUserLoginResult(int i)
    {
        i;
        JVM INSTR tableswitch 5 5: default 20
    //                   5 21;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (mProfileManager.isSavedAddressExists())
        {
            SavedAddressActivity_.intent(this).start();
            finish();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }



    private class _cls2
        implements android.view.View.OnClickListener
    {

        final AddressTypeActivity this$0;

        public void onClick(View view)
        {
            navigateDeliveryActivity(view);
        }

        _cls2()
        {
            this$0 = AddressTypeActivity.this;
            super();
        }
    }


    private class _cls1
        implements com.dominos.fragments.SignInFragment.SignInClickListener
    {

        final AddressTypeActivity this$0;

        public void onSignInClicked()
        {
            App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
            mAnalyticsUtil.postDeliveryAddressSignInButtonClicked();
            navigateToLogin();
        }

        _cls1()
        {
            this$0 = AddressTypeActivity.this;
            super();
        }
    }

}
