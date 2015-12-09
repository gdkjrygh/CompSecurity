// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SpinnerAdapter;
import com.dominos.MobileSession_;
import com.dominos.analytics.facebook.FacebookAnalyticsProcessor_;
import com.dominos.android.sdk.common.ConnectionUtil_;
import com.dominos.android.sdk.common.dom.locator.BuildingResult;
import com.dominos.android.sdk.common.dom.locator.RegionResult;
import com.dominos.android.sdk.common.dom.locator.SiteResult;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.controllers.utils.ControllerLocator_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;
import org.androidannotations.api.e;

// Referenced classes of package com.dominos.activities:
//            UserAddLocation, BaseActivity

public final class UserAddLocation_ extends UserAddLocation
    implements a, b
{

    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public UserAddLocation_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    private void init_(Bundle bundle)
    {
        c.a(this);
        mPowerService = PowerRestClient_.getInstance_(this);
        mSpeechManager = SpeechManager_.getInstance_(this);
        userAuth = UserAuthorization_.getInstance_(this);
        mFBAnalyticsProcessor = FacebookAnalyticsProcessor_.getInstance_(this);
        mMobileSession = MobileSession_.getInstance_(this);
        mActivityHelper = ActivityHelper_.getInstance_(this);
        mConnectionUtil = ConnectionUtil_.getInstance_(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        mControllerLocator = ControllerLocator_.getInstance_(this);
        onBaseAfterInject();
        initialize();
        onAfterInject();
    }

    public static IntentBuilder_ intent(Fragment fragment)
    {
        return new IntentBuilder_(fragment);
    }

    public static IntentBuilder_ intent(Context context)
    {
        return new IntentBuilder_(context);
    }

    public static IntentBuilder_ intent(android.support.v4.app.Fragment fragment)
    {
        return new IntentBuilder_(fragment);
    }

    public final void checkDeliveryAddressStoreStatus(LabsAddress labsaddress)
    {
        org.androidannotations.api.a.a(new _cls14(0, "", labsaddress));
    }

    public final void fillSpinnersWithSavedData(final RegionResult regionResult, final SiteResult siteResult, final BuildingResult buildingResult)
    {
        handler_.post(new _cls7());
    }

    public final void goToCart()
    {
        handler_.post(new _cls5());
    }

    public final void goToCouponWizard()
    {
        handler_.post(new _cls3());
    }

    public final void hideLoading()
    {
        handler_.post(new _cls2());
    }

    public final void navigateToCart()
    {
        handler_.post(new _cls10());
    }

    public final void onActivityResult(int i, int j, Intent intent1)
    {
        super.onActivityResult(i, j, intent1);
        switch (i)
        {
        default:
            return;

        case 49: // '1'
            onStoreListActivityResult(j);
            break;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public final void onGetBuildingCompleted(final BuildingResult buildingResult)
    {
        handler_.post(new _cls13());
    }

    public final void onGetRegionCompleted(final RegionResult regionResult)
    {
        handler_.post(new _cls6());
    }

    public final void onGetSitesCompleted(final SiteResult siteResult)
    {
        handler_.post(new _cls9());
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (e.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public final void onViewChanged(a a1)
    {
        a1 = a1.findViewById(0x7f0f007f);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls1());
        }
        setupFonts();
    }

    public final void setBuildingText(final SpinnerAdapter adapter)
    {
        handler_.post(new _cls11());
    }

    public final void setContentView(int i)
    {
        super.setContentView(i);
        onViewChangedNotifier_.a(this);
    }

    public final void setContentView(View view)
    {
        super.setContentView(view);
        onViewChangedNotifier_.a(this);
    }

    public final void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        onViewChangedNotifier_.a(this);
    }

    public final void setRegionText(final SpinnerAdapter adapter)
    {
        handler_.post(new _cls8());
    }

    public final void setSiteText(final SpinnerAdapter adapter)
    {
        handler_.post(new _cls12());
    }

    public final void showLoading()
    {
        handler_.post(new _cls4());
    }














    private class IntentBuilder_ extends org.androidannotations.api.a.a
    {

        private android.support.v4.app.Fragment fragmentSupport_;
        private Fragment fragment_;

        public void startForResult(int i)
        {
            if (fragmentSupport_ != null)
            {
                fragmentSupport_.startActivityForResult(intent, i);
                return;
            }
            if (fragment_ != null)
            {
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    fragment_.startActivityForResult(intent, i, lastOptions);
                    return;
                } else
                {
                    fragment_.startActivityForResult(intent, i);
                    return;
                }
            }
            if (context instanceof Activity)
            {
                android.support.v4.app.a.a((Activity)context, intent, i, lastOptions);
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                context.startActivity(intent, lastOptions);
                return;
            } else
            {
                context.startActivity(intent);
                return;
            }
        }

        public IntentBuilder_(Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/UserAddLocation_);
            fragment_ = fragment;
        }

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/activities/UserAddLocation_);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/UserAddLocation_);
            fragmentSupport_ = fragment;
        }
    }


    private class _cls14 extends org.androidannotations.api.c
    {

        final UserAddLocation_ this$0;
        final LabsAddress val$deliveryAddress;

        public void execute()
        {
            try
            {
                checkDeliveryAddressStoreStatus(deliveryAddress);
                return;
            }
            catch (Throwable throwable)
            {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
            }
        }

        _cls14(int i, String s1, LabsAddress labsaddress)
        {
            this$0 = UserAddLocation_.this;
            deliveryAddress = labsaddress;
            super(final_s, i, s1);
        }
    }


    private class _cls7
        implements Runnable
    {

        final UserAddLocation_ this$0;
        final BuildingResult val$buildingResult;
        final RegionResult val$regionResult;
        final SiteResult val$siteResult;

        public void run()
        {
            fillSpinnersWithSavedData(regionResult, siteResult, buildingResult);
        }

        _cls7()
        {
            this$0 = UserAddLocation_.this;
            regionResult = regionresult;
            siteResult = siteresult;
            buildingResult = buildingresult;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final UserAddLocation_ this$0;

        public void run()
        {
            goToCart();
        }

        _cls5()
        {
            this$0 = UserAddLocation_.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final UserAddLocation_ this$0;

        public void run()
        {
            goToCouponWizard();
        }

        _cls3()
        {
            this$0 = UserAddLocation_.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final UserAddLocation_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls2()
        {
            this$0 = UserAddLocation_.this;
            super();
        }
    }


    private class _cls10
        implements Runnable
    {

        final UserAddLocation_ this$0;

        public void run()
        {
            navigateToCart();
        }

        _cls10()
        {
            this$0 = UserAddLocation_.this;
            super();
        }
    }


    private class _cls13
        implements Runnable
    {

        final UserAddLocation_ this$0;
        final BuildingResult val$buildingResult;

        public void run()
        {
            onGetBuildingCompleted(buildingResult);
        }

        _cls13()
        {
            this$0 = UserAddLocation_.this;
            buildingResult = buildingresult;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final UserAddLocation_ this$0;
        final RegionResult val$regionResult;

        public void run()
        {
            onGetRegionCompleted(regionResult);
        }

        _cls6()
        {
            this$0 = UserAddLocation_.this;
            regionResult = regionresult;
            super();
        }
    }


    private class _cls9
        implements Runnable
    {

        final UserAddLocation_ this$0;
        final SiteResult val$siteResult;

        public void run()
        {
            onGetSitesCompleted(siteResult);
        }

        _cls9()
        {
            this$0 = UserAddLocation_.this;
            siteResult = siteresult;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UserAddLocation_ this$0;

        public void onClick(View view)
        {
            onHomeButtonClick();
        }

        _cls1()
        {
            this$0 = UserAddLocation_.this;
            super();
        }
    }


    private class _cls11
        implements Runnable
    {

        final UserAddLocation_ this$0;
        final SpinnerAdapter val$adapter;

        public void run()
        {
            setBuildingText(adapter);
        }

        _cls11()
        {
            this$0 = UserAddLocation_.this;
            adapter = spinneradapter;
            super();
        }
    }


    private class _cls8
        implements Runnable
    {

        final UserAddLocation_ this$0;
        final SpinnerAdapter val$adapter;

        public void run()
        {
            setRegionText(adapter);
        }

        _cls8()
        {
            this$0 = UserAddLocation_.this;
            adapter = spinneradapter;
            super();
        }
    }


    private class _cls12
        implements Runnable
    {

        final UserAddLocation_ this$0;
        final SpinnerAdapter val$adapter;

        public void run()
        {
            setSiteText(adapter);
        }

        _cls12()
        {
            this$0 = UserAddLocation_.this;
            adapter = spinneradapter;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final UserAddLocation_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls4()
        {
            this$0 = UserAddLocation_.this;
            super();
        }
    }

}
