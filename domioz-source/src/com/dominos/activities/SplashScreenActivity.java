// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.widget.ScrollView;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.AmazonUtil;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.core.user.UserProfileManager;
import com.dominos.controllers.SplashScreenController;
import com.dominos.controllers.interfaces.IDominosSplashScreen;
import com.dominos.controllers.utils.ControllerLocator;
import com.dominos.utils.AnalyticsUtil;
import com.google.android.gms.common.e;

// Referenced classes of package com.dominos.activities:
//            LandingActivity_

public class SplashScreenActivity extends FragmentActivity
    implements IDominosSplashScreen
{

    private static final float ALERT_TEXT_SIZE = 14F;
    private static Uri MARKET_LINK;
    private static final String TAG = com/dominos/activities/SplashScreenActivity.getName();
    AnalyticsUtil mAnalyticsUtil;
    boolean mBeaconLaunchMode;
    ControllerLocator mControllerLocator;
    MobileSession mMobileSession;
    String mPushCampaignId;
    private SplashScreenController mSplashScreenController;

    public SplashScreenActivity()
    {
    }

    private Dialog createAlertDialog(int i, String s)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setIcon(0x7f020144);
        android.app.AlertDialog alertdialog = builder.create();
        TextView textview = new TextView(this);
        int j = getResources().getInteger(0x7f0d0008);
        int k = getResources().getInteger(0x7f0d0009);
        textview.setPadding(j, k, j, k);
        textview.setTextSize(14F);
        ScrollView scrollview = new ScrollView(this);
        scrollview.addView(textview);
        switch (i)
        {
        case 2: // '\002'
        case 5: // '\005'
        default:
            return alertdialog;

        case 1: // '\001'
            textview.setText(s);
            return builder.setCancelable(false).setTitle(0x7f080064).setView(scrollview).setPositiveButton(0x7f0800fa, new _cls1()).create();

        case 3: // '\003'
            textview.setText(s);
            return builder.setCancelable(false).setTitle(0x7f080330).setView(scrollview).setPositiveButton(0x7f0800fb, new _cls3()).setNegativeButton(0x7f0800f8, new _cls2()).create();

        case 4: // '\004'
            textview.setText(s);
            return builder.setCancelable(false).setTitle(0x7f080331).setView(scrollview).setPositiveButton(0x7f0800fb, new _cls5()).setNegativeButton(0x7f0800f9, new _cls4()).create();

        case 8: // '\b'
            textview.setText(s);
            return builder.setCancelable(false).setTitle(0x7f080218).setView(scrollview).setPositiveButton(0x7f080212, new _cls7()).setNegativeButton(0x7f0800a9, new _cls6()).create();

        case 7: // '\007'
            textview.setText(getResources().getString(0x7f080399));
            return builder.setCancelable(false).setTitle(0x7f08039a).setView(scrollview).setPositiveButton(0x7f0800fa, new _cls8()).create();

        case 6: // '\006'
            textview.setText(getResources().getString(0x7f080438));
            return builder.setCancelable(false).setTitle(0x7f080358).setView(scrollview).setPositiveButton(0x7f0800fa, new _cls9()).create();
        }
    }

    private void launchLanding()
    {
        Intent intent = ((LandingActivity_.IntentBuilder_)LandingActivity_.intent(this).flags(0x4000000)).get();
        intent.putExtra("push_campaign", mPushCampaignId);
        startActivity(intent);
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0x10a0000, 0x10a0001);
    }

    void onAfterInject()
    {
        mSplashScreenController = mControllerLocator.getSplashScreenController(this);
        mSplashScreenController.setupApplication(mBeaconLaunchMode);
    }

    protected void onAfterViews()
    {
        UserProfileManager userprofilemanager = (UserProfileManager)mMobileSession.getManager("user_manager");
        FontManager.applyDominosFont(this);
        if (userprofilemanager.isSessionTimedOut())
        {
            userprofilemanager.clearCurrentUser();
        }
    }

    public void onAttachedToWindow()
    {
        LogUtil.v(TAG, "onAttachedToWindow", new Object[0]);
        getWindow().setFlags(0x680400, 0x680400);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        MARKET_LINK = Uri.parse((new StringBuilder()).append(AmazonUtil.getMarketURI()).append(getPackageName()).toString());
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    void onGooglePlayUpgradeResult(int i, Intent intent)
    {
        mSplashScreenController.checkGooglePlayServicesAndContinueVerification();
    }

    public void onLoadingComplete()
    {
        mAnalyticsUtil.postApplicationStart();
        launchLanding();
        finish();
    }

    public void showAlertDialog(int i, String s)
    {
        if (isFinishing())
        {
            LogUtil.d(TAG, "Unable to show dialog. Activity is finished/finishing", new Object[0]);
            return;
        } else
        {
            createAlertDialog(i, s).show();
            return;
        }
    }

    public void showGooglePlayServicesDialog(int i, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        e.a(i, this, 5, oncancellistener).show();
    }

    public void startActivity(Intent intent)
    {
        super.startActivity(intent);
        overridePendingTransition(0x10a0000, 0x10a0001);
    }




    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final SplashScreenActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            finish();
        }

        _cls1()
        {
            this$0 = SplashScreenActivity.this;
            super();
        }
    }


    private class _cls3
        implements android.content.DialogInterface.OnClickListener
    {

        final SplashScreenActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = new Intent("android.intent.action.VIEW");
            dialoginterface.setData(SplashScreenActivity.MARKET_LINK);
            startActivity(dialoginterface);
            finish();
        }

        _cls3()
        {
            this$0 = SplashScreenActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        final SplashScreenActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            finish();
        }

        _cls2()
        {
            this$0 = SplashScreenActivity.this;
            super();
        }
    }


    private class _cls5
        implements android.content.DialogInterface.OnClickListener
    {

        final SplashScreenActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = new Intent("android.intent.action.VIEW");
            dialoginterface.setData(SplashScreenActivity.MARKET_LINK);
            startActivity(dialoginterface);
            finish();
        }

        _cls5()
        {
            this$0 = SplashScreenActivity.this;
            super();
        }
    }


    private class _cls4
        implements android.content.DialogInterface.OnClickListener
    {

        final SplashScreenActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            mSplashScreenController.continueVerification();
        }

        _cls4()
        {
            this$0 = SplashScreenActivity.this;
            super();
        }
    }


    private class _cls7
        implements android.content.DialogInterface.OnClickListener
    {

        final SplashScreenActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = new Intent("android.intent.action.VIEW");
            dialoginterface.setData(Uri.parse("http://www.dominos.com"));
            startActivity(dialoginterface);
            finish();
        }

        _cls7()
        {
            this$0 = SplashScreenActivity.this;
            super();
        }
    }


    private class _cls6
        implements android.content.DialogInterface.OnClickListener
    {

        final SplashScreenActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            finish();
        }

        _cls6()
        {
            this$0 = SplashScreenActivity.this;
            super();
        }
    }


    private class _cls8
        implements android.content.DialogInterface.OnClickListener
    {

        final SplashScreenActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            finish();
        }

        _cls8()
        {
            this$0 = SplashScreenActivity.this;
            super();
        }
    }


    private class _cls9
        implements android.content.DialogInterface.OnClickListener
    {

        final SplashScreenActivity this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            finish();
        }

        _cls9()
        {
            this$0 = SplashScreenActivity.this;
            super();
        }
    }

}
