// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.kyc.api.KycClient;
import com.google.common.primitives.Ints;
import java.util.List;
import java.util.concurrent.Callable;

public class KycVerifyingIdentityActivity extends WalletActivity
{

    public static long RETRY_DELAY_MILLIS = 5000L;
    public static long SUCCESS_DELAY_LENGTH = 2000L;
    AnalyticsUtil analyticsUtil;
    Handler handler;
    KycClient kycClient;
    ObjectAnimator loadingAnimator;

    public KycVerifyingIdentityActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        loadingAnimator = null;
    }

    private static boolean hasVerifiedInfo(int ai[])
    {
        ai = Ints.asList(ai);
        return ai.contains(Integer.valueOf(1)) && ai.contains(Integer.valueOf(2)) && ai.contains(Integer.valueOf(3));
    }

    private static boolean isFailedState(Integer integer)
    {
        return integer.intValue() == 3 || integer.intValue() == 2;
    }

    private void poll(long l)
    {
        handler.postDelayed(new Runnable() {

            final KycVerifyingIdentityActivity this$0;

            public final void run()
            {
                executeAction("CHECK_KYC_STATE", new Callable() {

                    final _cls1 this$1;

                    private com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse call()
                        throws Exception
                    {
                        return kycClient.getGetKycStatusResponse();
                    }

                    public final volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = KycVerifyingIdentityActivity.this;
                super();
            }
        }, l);
    }

    private void showFailed()
    {
        setResult(19);
        finish();
    }

    private void showInProgress()
    {
        ImageView imageview = (ImageView)findViewById(com.google.android.apps.walletnfcrel.R.id.lockBackground);
        ImageView imageview1 = (ImageView)findViewById(com.google.android.apps.walletnfcrel.R.id.statusImage);
        imageview.setVisibility(0);
        imageview1.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_waiting_lock_color_88dp);
        spinBackground();
    }

    private void showKycComplete()
    {
        analyticsUtil.sendScreen("Kyc Two Step Verified", new AnalyticsCustomDimension[0]);
        ImageView imageview = (ImageView)findViewById(com.google.android.apps.walletnfcrel.R.id.lockBackground);
        ImageView imageview1 = (ImageView)findViewById(com.google.android.apps.walletnfcrel.R.id.statusImage);
        TextView textview = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.title);
        TextView textview1 = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.subtitle);
        textview.setText(com.google.android.apps.walletnfcrel.R.string.kyc_twostep_success_title);
        textview1.setVisibility(8);
        imageview.setVisibility(4);
        imageview1.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_check_circle_white_88dp);
        handler.postDelayed(new Runnable() {

            final KycVerifyingIdentityActivity this$0;

            public final void run()
            {
                setResult(15);
                finish();
            }

            
            {
                this$0 = KycVerifyingIdentityActivity.this;
                super();
            }
        }, SUCCESS_DELAY_LENGTH);
    }

    private void showReferred()
    {
        setResult(18);
        finish();
    }

    private void showRetry()
    {
        analyticsUtil.sendScreen("Kyc Two Step Retry", new AnalyticsCustomDimension[0]);
        Object obj = (ImageView)findViewById(com.google.android.apps.walletnfcrel.R.id.lockBackground);
        Object obj1 = (ImageView)findViewById(com.google.android.apps.walletnfcrel.R.id.statusImage);
        if (loadingAnimator != null)
        {
            loadingAnimator.cancel();
        }
        ((ImageView) (obj)).setVisibility(4);
        ((ImageView) (obj1)).setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_id_bad_color_360x212dp);
        findViewById(com.google.android.apps.walletnfcrel.R.id.kycLoaderView).setPadding(0, 0, 0, 0);
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.title)).setText(com.google.android.apps.walletnfcrel.R.string.kyc_twostep_retry_title);
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.subtitle)).setText(com.google.android.apps.walletnfcrel.R.string.kyc_twostep_retry_subtitle);
        obj = (Button)findViewById(com.google.android.apps.walletnfcrel.R.id.tryAgain);
        obj1 = (Button)findViewById(com.google.android.apps.walletnfcrel.R.id.enterManually);
        ((Button) (obj)).setVisibility(0);
        ((Button) (obj1)).setVisibility(0);
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final KycVerifyingIdentityActivity this$0;

            public final void onClick(View view)
            {
                setResult(16);
                finish();
            }

            
            {
                this$0 = KycVerifyingIdentityActivity.this;
                super();
            }
        });
        ((Button) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

            final KycVerifyingIdentityActivity this$0;

            public final void onClick(View view)
            {
                setResult(12);
                finish();
            }

            
            {
                this$0 = KycVerifyingIdentityActivity.this;
                super();
            }
        });
    }

    private void spinBackground()
    {
        final ImageView background = (ImageView)findViewById(com.google.android.apps.walletnfcrel.R.id.lockBackground);
        if (loadingAnimator == null)
        {
            findViewById(com.google.android.apps.walletnfcrel.R.id.kycLoaderView).getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

                final KycVerifyingIdentityActivity this$0;
                final ImageView val$background;

                public final boolean onPreDraw()
                {
                    findViewById(com.google.android.apps.walletnfcrel.R.id.kycLoaderView).getViewTreeObserver().removeOnPreDrawListener(this);
                    loadingAnimator = ObjectAnimator.ofFloat(background, View.ROTATION, new float[] {
                        0.0F, 360F
                    });
                    loadingAnimator.setInterpolator(new LinearInterpolator());
                    loadingAnimator.setRepeatCount(-1);
                    loadingAnimator.setDuration(700L);
                    loadingAnimator.start();
                    return true;
                }

            
            {
                this$0 = KycVerifyingIdentityActivity.this;
                background = imageview;
                super();
            }
            });
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.verify_your_identity);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.kyc_verifying_identity);
        getSupportActionBar().setElevation(0.0F);
        showInProgress();
        poll(0L);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (super.onActionFailure(s, callable, exception))
        {
            return true;
        } else
        {
            poll(RETRY_DELAY_MILLIS);
            return true;
        }
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        s = (com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse)obj;
        if (((com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse) (s)).callError == null)
        {
            if (((com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse) (s)).kycStatus.shouldPoll.booleanValue())
            {
                poll(RETRY_DELAY_MILLIS);
                return;
            }
            if (((com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse) (s)).kycStatus.needsFullSsn.booleanValue() && (hasVerifiedInfo(((com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse) (s)).kycStatus.validatedInformation) || isFailedState(((com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse) (s)).kycStatus.status)))
            {
                setResult(14);
                finish();
                return;
            }
            switch (((com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse) (s)).kycStatus.status.intValue())
            {
            default:
                return;

            case 0: // '\0'
            case 4: // '\004'
                showRetry();
                return;

            case 3: // '\003'
                if (((com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse) (s)).kycStatus.canPerformDocumentVerification.booleanValue())
                {
                    showFailed();
                    return;
                } else
                {
                    showReferred();
                    return;
                }

            case 2: // '\002'
                showFailed();
                return;

            case 1: // '\001'
                showKycComplete();
                return;
            }
        } else
        {
            showRetry();
            return;
        }
    }

    protected void onPause()
    {
        handler.removeCallbacksAndMessages(null);
        super.onPause();
    }

    protected final void onUpPressed()
    {
        onBackPressed();
    }

}
