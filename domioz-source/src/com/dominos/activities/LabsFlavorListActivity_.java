// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.adapters.LabsVariantListAdapter_;
import com.dominos.analytics.facebook.FacebookAnalyticsProcessor_;
import com.dominos.android.sdk.common.ConnectionUtil_;
import com.dominos.android.sdk.common.dom.useraccounts.UserAuthorization_;
import com.dominos.android.sdk.data.http.power.PowerRestClient_;
import com.dominos.nina.speech.SpeechManager_;
import com.dominos.utils.ActivityHelper_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;
import org.androidannotations.api.e;

// Referenced classes of package com.dominos.activities:
//            LabsFlavorListActivity, BaseActivity

public final class LabsFlavorListActivity_ extends LabsFlavorListActivity
    implements a, b
{

    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public LabsFlavorListActivity_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    private void init_(Bundle bundle)
    {
        c.a(this);
        userAuth = UserAuthorization_.getInstance_(this);
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        mPowerService = PowerRestClient_.getInstance_(this);
        mSpeechManager = SpeechManager_.getInstance_(this);
        mConnectionUtil = ConnectionUtil_.getInstance_(this);
        mMobileSession = MobileSession_.getInstance_(this);
        mActivityHelper = ActivityHelper_.getInstance_(this);
        mFBAnalyticsProcessor = FacebookAnalyticsProcessor_.getInstance_(this);
        variantListAdapter = LabsVariantListAdapter_.getInstance_(this);
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

    public final void goToCart()
    {
        handler_.post(new _cls3());
    }

    public final void goToCouponWizard()
    {
        handler_.post(new _cls5());
    }

    public final void hideLoading()
    {
        handler_.post(new _cls2());
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f03007f);
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
        menuListTitle = (TextView)a1.findViewById(0x7f0f01db);
        a1 = a1.findViewById(0x7f0f007f);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls1());
        }
        setupFonts();
        setupVariantList();
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
            super(fragment.getActivity(), com/dominos/activities/LabsFlavorListActivity_);
            fragment_ = fragment;
        }

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/activities/LabsFlavorListActivity_);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/LabsFlavorListActivity_);
            fragmentSupport_ = fragment;
        }
    }


    private class _cls3
        implements Runnable
    {

        final LabsFlavorListActivity_ this$0;

        public void run()
        {
            goToCart();
        }

        _cls3()
        {
            this$0 = LabsFlavorListActivity_.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final LabsFlavorListActivity_ this$0;

        public void run()
        {
            goToCouponWizard();
        }

        _cls5()
        {
            this$0 = LabsFlavorListActivity_.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final LabsFlavorListActivity_ this$0;

        public void run()
        {
            hideLoading();
        }

        _cls2()
        {
            this$0 = LabsFlavorListActivity_.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LabsFlavorListActivity_ this$0;

        public void onClick(View view)
        {
            onHomeButtonClick();
        }

        _cls1()
        {
            this$0 = LabsFlavorListActivity_.this;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final LabsFlavorListActivity_ this$0;

        public void run()
        {
            showLoading();
        }

        _cls4()
        {
            this$0 = LabsFlavorListActivity_.this;
            super();
        }
    }

}
