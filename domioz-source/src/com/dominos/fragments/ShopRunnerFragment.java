// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.activities.LoyaltyInfoFragment;
import com.dominos.activities.ShopRunnerLoginActivity_;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.core.analytics.AnalyticsService;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.android.sdk.extension.shoprunner.ShoprunnerManager;
import com.dominos.utils.AnalyticsUtil;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.api.c.p;

public class ShopRunnerFragment extends Fragment
{

    private static final String TAG = com/dominos/fragments/ShopRunnerFragment.getName();
    private AnalyticsService mAnalyticsService;
    AnalyticsUtil mAnalyticsUtil;
    private ConfigurationManager mConfigurationManager;
    protected LoyaltyManager mLoyaltyManager;
    MobileSession mMobileSession;
    private OrderManager mOrderManager;
    DominosPrefs_ mPrefs;
    protected UserProfileManager mProfileManager;
    TextView mSrFreeDelivery;
    TextView mSrLearnMore;
    ImageView mSrLogo;
    LinearLayout mSrLogoLayout;
    TextView mSrLookingFor;
    private ShoprunnerManager mSrManager;
    TextView mSrSignIn;
    LinearLayout mSrSignInLayout;
    TextView mSrSignOut;

    public ShopRunnerFragment()
    {
    }

    private void hideShoprunner()
    {
        View view = getView();
        if (view != null)
        {
            view.setVisibility(8);
        }
    }

    private void showDisabledAlert()
    {
        (new android.app.AlertDialog.Builder(getActivity())).setTitle(getString(0x7f0800b9)).setMessage(getString(0x7f0802b7)).setPositiveButton(0x7f080046, new _cls1()).setIcon(0x7f020144).show();
    }

    private void showShoprunnerDiscontinued()
    {
        mSrLookingFor.setVisibility(0);
        mSrFreeDelivery.setText(0x7f0802bd);
        mSrSignIn.setVisibility(8);
        mSrSignOut.setVisibility(8);
        mSrLearnMore.setVisibility(0);
        mSrLearnMore.setText(0x7f0802bb);
    }

    private void showShoprunnerLoyaltyMessage()
    {
        if (mProfileManager.isAuthorizedUser())
        {
            if (mLoyaltyManager.isCustomerEnrolledInLoyalty())
            {
                LoyaltyInfoFragment.newInstance(com.dominos.activities.LoyaltyInfoFragment.InfoType.INFO_SR).show(getFragmentManager(), LoyaltyInfoFragment.TAG);
            } else
            {
                LoyaltyInfoFragment.newInstance(com.dominos.activities.LoyaltyInfoFragment.InfoType.ACTIVATE_SR).show(getFragmentManager(), LoyaltyInfoFragment.TAG);
            }
        } else
        {
            LoyaltyInfoFragment.newInstance(com.dominos.activities.LoyaltyInfoFragment.InfoType.REGISTER_SR).show(getFragmentManager(), LoyaltyInfoFragment.TAG);
        }
        App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.GeneralAlertShow());
    }

    private void trackAnalytics(int i)
    {
        HashMap hashmap;
        String s = "";
        hashmap = new HashMap();
        hashmap.put("site_id", "Dominos Android");
        hashmap.put("group", "Shoprunner");
        if (getActivity().getLocalClassName().contains("LandingActivity"))
        {
            s = "/landing";
        } else
        if (getActivity().getLocalClassName().contains("AddressDeliveryActivity"))
        {
            s = "/delivery_address";
        }
        i;
        JVM INSTR lookupswitch 2: default 80
    //                   64: 159
    //                   80: 134;
           goto _L1 _L2 _L3
_L1:
        LogUtil.d(TAG, s, new Object[0]);
        hashmap.put("page_url", s);
        mAnalyticsService.publishEvent(com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW, hashmap);
        return;
_L3:
        hashmap.put("page_name", "Shoprunner Learn More");
        hashmap.put("sub_group", "Learn More");
        continue; /* Loop/switch isn't completed */
_L2:
        hashmap.put("page_name", "Shoprunner Sign In");
        hashmap.put("sub_group", "Sign-in");
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void displayShopprunner()
    {
        boolean flag = false;
        if (mConfigurationManager.getApplicationConfiguration() != null && mConfigurationManager.getApplicationConfiguration().isShopRunnerHardEnabled())
        {
            if (mConfigurationManager.getApplicationConfiguration().isShopRunnerDiscontinued())
            {
                showShoprunnerDiscontinued();
                return;
            }
            Object obj = mSrSignOut;
            int i;
            if (mSrManager.isShopRunnerSession())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((TextView) (obj)).setVisibility(i);
            obj = mSrSignInLayout;
            i = ((flag) ? 1 : 0);
            if (mSrManager.isShopRunnerSession())
            {
                i = 8;
            }
            ((LinearLayout) (obj)).setVisibility(i);
            if (mSrSignOut.getVisibility() == 0)
            {
                mSrSignOut.setText(Html.fromHtml(getString(0x7f0802ba)));
                return;
            } else
            {
                mSrSignOut.setVisibility(8);
                mSrSignIn.setText(Html.fromHtml(getString(0x7f0802b9)));
                return;
            }
        } else
        {
            hideShoprunner();
            return;
        }
    }

    void init()
    {
        FontManager.applyDominosFont(this);
    }

    public void onResume()
    {
        super.onResume();
        LogUtil.d(TAG, "on resume called", new Object[0]);
        if (isAdded())
        {
            displayShopprunner();
        }
    }

    public void onStart()
    {
        super.onStart();
        displayShopprunner();
    }

    public void setup()
    {
        App.getInstance().bus.register(this);
        mSrManager = (ShoprunnerManager)mMobileSession.getManager("shoprunner_manager");
        mAnalyticsService = (AnalyticsService)mMobileSession.getManager("analytics_manager");
        mConfigurationManager = (ConfigurationManager)mMobileSession.getManager("configuration_manager");
        mLoyaltyManager = (LoyaltyManager)mMobileSession.getManager("loyalty_manager");
        mProfileManager = (UserProfileManager)mMobileSession.getManager("user_manager");
        mOrderManager = (OrderManager)mMobileSession.getManager("order_manager");
    }

    protected void srLookingFore()
    {
        if (mConfigurationManager.getApplicationConfiguration().isShopRunnerDiscontinued())
        {
            trackAnalytics(80);
            showShoprunnerLoyaltyMessage();
        }
    }

    public void srSignOut()
    {
        mPrefs.shopRunnerMemberToken().d();
        mSrManager.setShopRunnerSession(false, mOrderManager.getOrder());
        displayShopprunner();
    }

    public void srSignin()
    {
        if (!mConfigurationManager.getApplicationConfiguration().isShopRunnerEnabled())
        {
            showDisabledAlert();
            return;
        } else
        {
            trackAnalytics(64);
            App.getInstance().bus.post(new com.dominos.bus.events.SpeechEvents.StopNinaRequest());
            ShopRunnerLoginActivity_.intent(this).mUrl(mConfigurationManager.getApplicationConfiguration().getShopRunnerLoginWebUrl()).start();
            return;
        }
    }


    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final ShopRunnerFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface.dismiss();
        }

        _cls1()
        {
            this$0 = ShopRunnerFragment.this;
            super();
        }
    }

}
