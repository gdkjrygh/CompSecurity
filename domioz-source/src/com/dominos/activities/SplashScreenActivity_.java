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
import com.dominos.MobileSession_;
import com.dominos.controllers.utils.ControllerLocator_;
import com.dominos.utils.AnalyticsUtil_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;
import org.androidannotations.api.e;

// Referenced classes of package com.dominos.activities:
//            SplashScreenActivity

public final class SplashScreenActivity_ extends SplashScreenActivity
    implements a, b
{

    public static final String M_BEACON_LAUNCH_MODE_EXTRA = "mBeaconLaunchMode";
    public static final String M_PUSH_CAMPAIGN_ID_EXTRA = "mPushCampaignId";
    private Handler handler_;
    private final c onViewChangedNotifier_ = new c();

    public SplashScreenActivity_()
    {
        handler_ = new Handler(Looper.getMainLooper());
    }

    private void init_(Bundle bundle)
    {
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(this);
        mMobileSession = MobileSession_.getInstance_(this);
        mControllerLocator = ControllerLocator_.getInstance_(this);
        injectExtras_();
        onAfterInject();
        c.a(this);
    }

    private void injectExtras_()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("mPushCampaignId"))
            {
                mPushCampaignId = bundle.getString("mPushCampaignId");
            }
            if (bundle.containsKey("mBeaconLaunchMode"))
            {
                mBeaconLaunchMode = bundle.getBoolean("mBeaconLaunchMode");
            }
        }
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

    public final void onActivityResult(int i, int j, Intent intent1)
    {
        super.onActivityResult(i, j, intent1);
        switch (i)
        {
        default:
            return;

        case 5: // '\005'
            onGooglePlayUpgradeResult(j, intent1);
            break;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        c c1 = c.a(onViewChangedNotifier_);
        init_(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f0300ae);
    }

    public final boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (e.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public final void onLoadingComplete()
    {
        handler_.post(new _cls1());
    }

    public final void onViewChanged(a a1)
    {
        onAfterViews();
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

    public final void setIntent(Intent intent1)
    {
        super.setIntent(intent1);
        injectExtras_();
    }

    public final void showAlertDialog(final int errorCode, final String message)
    {
        handler_.post(new _cls2());
    }

    public final void showGooglePlayServicesDialog(final int playServiceStatusCode, final android.content.DialogInterface.OnCancelListener cancelListener)
    {
        handler_.post(new _cls3());
    }




    private class IntentBuilder_ extends org.androidannotations.api.a.a
    {

        private android.support.v4.app.Fragment fragmentSupport_;
        private Fragment fragment_;

        public IntentBuilder_ mBeaconLaunchMode(boolean flag)
        {
            return (IntentBuilder_)super.extra("mBeaconLaunchMode", flag);
        }

        public IntentBuilder_ mPushCampaignId(String s)
        {
            return (IntentBuilder_)super.extra("mPushCampaignId", s);
        }

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
            super(fragment.getActivity(), com/dominos/activities/SplashScreenActivity_);
            fragment_ = fragment;
        }

        public IntentBuilder_(Context context)
        {
            super(context, com/dominos/activities/SplashScreenActivity_);
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment)
        {
            super(fragment.getActivity(), com/dominos/activities/SplashScreenActivity_);
            fragmentSupport_ = fragment;
        }
    }


    private class _cls1
        implements Runnable
    {

        final SplashScreenActivity_ this$0;

        public void run()
        {
            onLoadingComplete();
        }

        _cls1()
        {
            this$0 = SplashScreenActivity_.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final SplashScreenActivity_ this$0;
        final int val$errorCode;
        final String val$message;

        public void run()
        {
            showAlertDialog(errorCode, message);
        }

        _cls2()
        {
            this$0 = SplashScreenActivity_.this;
            errorCode = i;
            message = s;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final SplashScreenActivity_ this$0;
        final android.content.DialogInterface.OnCancelListener val$cancelListener;
        final int val$playServiceStatusCode;

        public void run()
        {
            showGooglePlayServicesDialog(playServiceStatusCode, cancelListener);
        }

        _cls3()
        {
            this$0 = SplashScreenActivity_.this;
            playServiceStatusCode = i;
            cancelListener = oncancellistener;
            super();
        }
    }

}
