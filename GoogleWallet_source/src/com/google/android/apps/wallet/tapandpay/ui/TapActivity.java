// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tapandpay.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.Sound;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.nano.MessageNano;
import java.util.Map;

// Referenced classes of package com.google.android.apps.wallet.tapandpay.ui:
//            TapCompletedActivity

public class TapActivity extends WalletActivity
{

    private static final IntentFilter INTENT_FILTER = new IntentFilter("com.google.android.apps.wallet.nfcevent.TAP_SAFE_TO_REMOVE");
    private static final Map STATE_MAP = ImmutableMap.builder().put("com.google.android.apps.wallet.tap.START", Integer.valueOf(1)).put("com.google.android.apps.wallet.nfcevent.TAP_SAFE_TO_REMOVE", Integer.valueOf(2)).put("com.google.android.apps.wallet.tap.FAIL", Integer.valueOf(3)).put("com.google.android.apps.wallet.tap.FAIL_HCE_TRANSACTION_COUNT_LIMIT_REACHED", Integer.valueOf(4)).put("com.google.android.apps.wallet.tap.FAIL_HCE_BUNDLE_EXPIRED", Integer.valueOf(5)).put("com.google.android.apps.wallet.tap.SUCCESS", Integer.valueOf(6)).build();
    private static final String TAG = com/google/android/apps/wallet/tapandpay/ui/TapActivity.getSimpleName();
    AnalyticsUtil analyticsUtil;
    private View errorLayout;
    private TextView errorMessageBody;
    private TextView errorMessageHeadline;
    private boolean firstResume;
    private AnimationDrawable mNfcAnimation;
    private View nfcProgressImage;
    private final BroadcastReceiver receiver = new BroadcastReceiver() {

        final TapActivity this$0;

        public final void onReceive(Context context, Intent intent)
        {
            context = TapActivity.TAG;
            String s = String.valueOf(intent);
            WLog.d(context, (new StringBuilder(String.valueOf(s).length() + 34)).append("BroadcastReceiver handling intent=").append(s).toString());
            handleIntent(intent);
        }

            
            {
                this$0 = TapActivity.this;
                super();
            }
    };
    private int state;
    private boolean successSoundPlayed;

    public TapActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        state = 1;
    }

    private static Intent createBaseIntent(Context context, String s)
    {
        return InternalIntents.forClass(context, com/google/android/apps/wallet/tapandpay/ui/TapActivity).setAction(s).setFlags(0x30010000);
    }

    private void disableErrorMessage()
    {
        nfcProgressImage.setBackgroundResource(com.google.android.apps.walletnfcrel.R.drawable.nfc_sending_animation_all);
        errorLayout.setVisibility(4);
    }

    private void enableErrorMessage(Intent intent, int i)
    {
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.google.android.apps.walletnfcrel.R.drawable.img_tap_fail);
        i;
        JVM INSTR tableswitch 3 5: default 40
    //                   3 64
    //                   4 170
    //                   5 122;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalStateException(String.format("Illegal failure state: %s", new Object[] {
            Integer.valueOf(i)
        }));
_L2:
        i = com.google.android.apps.walletnfcrel.R.string.payment_notification_tearing_error_message;
        intent = getString(com.google.android.apps.walletnfcrel.R.string.payment_notification_progress_unknown);
_L6:
        nfcProgressImage.setBackgroundDrawable(drawable);
        errorMessageHeadline.setText(i);
        errorMessageBody.setText(intent);
        errorLayout.setVisibility(0);
        analyticsUtil.sendScreen("Tap And Pay Tap Fail", new AnalyticsCustomDimension[0]);
        return;
_L4:
        Preconditions.checkState(intent.hasExtra("atcLimit"));
        intent = (com.google.android.apps.wallet.hce.emv.RotatingAtc.RotatingAtcLimit)intent.getParcelableExtra("atcLimit");
        i = com.google.android.apps.walletnfcrel.R.string.payment_notification_bring_device_online;
        intent = String.format(getString(com.google.android.apps.walletnfcrel.R.string.payment_notification_bundle_expired), new Object[] {
            intent.getBundleDurationString()
        });
        continue; /* Loop/switch isn't completed */
_L3:
        i = com.google.android.apps.walletnfcrel.R.string.payment_notification_bring_device_online;
        intent = getString(com.google.android.apps.walletnfcrel.R.string.payment_notification_transaction_limit_reached);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void handleIntent(Intent intent)
    {
        setIntent(intent);
        String s = intent.getAction();
        String s1 = TAG;
        Object obj = String.valueOf(s);
        if (((String) (obj)).length() != 0)
        {
            obj = "Handling intent: ".concat(((String) (obj)));
        } else
        {
            obj = new String("Handling intent: ");
        }
        WLog.d(s1, ((String) (obj)));
        obj = (Integer)STATE_MAP.get(s);
        if (obj == null)
        {
            obj = TAG;
            intent = String.valueOf(s);
            if (intent.length() != 0)
            {
                intent = "Unknown intent action received, finishing: ".concat(intent);
            } else
            {
                intent = new String("Unknown intent action received, finishing: ");
            }
            WLog.w(((String) (obj)), intent);
            finish();
            return;
        }
        state = ((Integer) (obj)).intValue();
        switch (state)
        {
        default:
            int i = state;
            throw new IllegalStateException((new StringBuilder(29)).append("Impossible state: ").append(i).toString());

        case 1: // '\001'
            showTapStarted();
            return;

        case 2: // '\002'
            showTapRemoveFromField();
            return;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            showTapFailure(intent, state);
            return;

        case 6: // '\006'
            showTapSucessful();
            break;
        }
    }

    public static void notifyTapFinishedBundleExpired(Context context, com.google.android.apps.wallet.hce.emv.RotatingAtc.RotatingAtcLimit rotatingatclimit)
    {
        WLog.i(TAG, "notifyTapFinishedBundleExpired");
        Intent intent = createBaseIntent(context, "com.google.android.apps.wallet.tap.FAIL_HCE_BUNDLE_EXPIRED");
        intent.putExtra("atcLimit", rotatingatclimit);
        context.startActivity(intent);
    }

    public static void notifyTapFinishedBundleUsedUp(Context context)
    {
        WLog.i(TAG, "notifyTapFinishedBundleUsedUp");
        context.startActivity(createBaseIntent(context, "com.google.android.apps.wallet.tap.FAIL_HCE_TRANSACTION_COUNT_LIMIT_REACHED"));
    }

    public static void notifyTapFinishedTimeout(Context context)
    {
        WLog.i(TAG, "notifyTapFinishedTimeout");
        context.startActivity(createBaseIntent(context, "com.google.android.apps.wallet.tap.FAIL"));
    }

    public static void notifyTapFinishedWaitingForResolution(Context context, com.google.wallet.proto.NanoWalletEntities.NfcTapEvent nfctapevent)
    {
        WLog.i(TAG, "notifyTapFinishedWaitingForResolution");
        Intent intent = createBaseIntent(context, "com.google.android.apps.wallet.tap.SUCCESS");
        intent.putExtra("tap_event", MessageNano.toByteArray(nfctapevent));
        context.startActivity(intent);
    }

    private void playPaymentSuccess()
    {
        if (!successSoundPlayed)
        {
            Sound.playPaymentSuccessSound(this);
            ((Vibrator)getSystemService("vibrator")).vibrate(100L);
            successSoundPlayed = true;
        }
    }

    private void showTapFailure(Intent intent, int i)
    {
        Sound.playPaymentFailureSound(this);
        analyticsUtil.sendNfcEvent("TapAndPayFailure", new AnalyticsCustomDimension[0]);
        stopAnimation();
        enableErrorMessage(intent, i);
        successSoundPlayed = false;
    }

    private void showTapRemoveFromField()
    {
        playPaymentSuccess();
        disableErrorMessage();
        stopAnimation();
        nfcProgressImage.setBackgroundResource(com.google.android.apps.walletnfcrel.R.drawable.img_logo_wallet_color_88dp);
    }

    private void showTapStarted()
    {
        successSoundPlayed = false;
        disableErrorMessage();
        nfcProgressImage.setBackgroundDrawable(null);
        analyticsUtil.sendNfcEvent("TapAndPayInitiated", new AnalyticsCustomDimension[0]);
        startAnimation();
    }

    private void showTapSucessful()
    {
        playPaymentSuccess();
        analyticsUtil.sendNfcEvent("TapAndPayTapCompleted", new AnalyticsCustomDimension[0]);
        startActivity(TapCompletedActivity.createIntentWithNfcTapEvent(this, getIntent().getByteArrayExtra("tap_event")));
        overridePendingTransition(0, 0);
        finish();
    }

    private void startAnimation()
    {
        nfcProgressImage.setBackgroundResource(com.google.android.apps.walletnfcrel.R.drawable.nfc_sending_animation);
        mNfcAnimation = (AnimationDrawable)nfcProgressImage.getBackground();
        mNfcAnimation.setVisible(true, false);
        mNfcAnimation.start();
    }

    private void stopAnimation()
    {
        if (mNfcAnimation != null)
        {
            mNfcAnimation.stop();
            mNfcAnimation = null;
        }
    }

    public final void doOnCreate(Bundle bundle)
    {
        setRequestedOrientation(7);
        getSupportActionBar().hide();
        getWindow().addFlags(0x480000);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.tap_activity);
        nfcProgressImage = findViewById(com.google.android.apps.walletnfcrel.R.id.NfcProgressImage);
        errorLayout = findViewById(com.google.android.apps.walletnfcrel.R.id.NfcSplashErrorMessageLayout);
        errorMessageHeadline = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.NfcSplashMessageHeadline);
        errorMessageBody = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.NfcSplashMessageBody);
        successSoundPlayed = false;
        firstResume = true;
    }

    public final void doOnResume()
    {
        if (firstResume)
        {
            handleIntent(getIntent());
            firstResume = false;
        }
        registerReceiver(receiver, INTENT_FILTER);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    protected void onPause()
    {
        super.onPause();
        stopAnimation();
    }

    protected final void onUpPressed()
    {
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag && state == 1)
        {
            startAnimation();
            return;
        } else
        {
            stopAnimation();
            return;
        }
    }



}
