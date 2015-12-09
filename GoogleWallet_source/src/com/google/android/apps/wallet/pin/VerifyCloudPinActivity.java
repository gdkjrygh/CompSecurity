// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.analytics.AppStartTimeLogger;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.QuitIntent;
import com.google.android.apps.wallet.api.Sound;
import com.google.android.apps.wallet.base.activity.OrientationController;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.encryption.api.PinEncryptionPrewarmer;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.filter.ActivityFilters;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.NetworkConnectivityEvent;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.proto.Protos;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            PinView, TryAgainDialogFragment, CloudPinManager, ResetPinDialog, 
//            UserPin, CloudPinCallback

public class VerifyCloudPinActivity extends WalletActivity
{
    static final class DisplayState extends Enum
    {

        private static final DisplayState $VALUES[];
        public static final DisplayState VERIFY_CURRENT_PIN;
        public static final DisplayState WAITING;

        public static DisplayState valueOf(String s)
        {
            return (DisplayState)Enum.valueOf(com/google/android/apps/wallet/pin/VerifyCloudPinActivity$DisplayState, s);
        }

        public static DisplayState[] values()
        {
            return (DisplayState[])$VALUES.clone();
        }

        static 
        {
            VERIFY_CURRENT_PIN = new DisplayState("VERIFY_CURRENT_PIN", 0);
            WAITING = new DisplayState("WAITING", 1);
            $VALUES = (new DisplayState[] {
                VERIFY_CURRENT_PIN, WAITING
            });
        }

        private DisplayState(String s, int i)
        {
            super(s, i);
        }
    }

    final class VerifyPinAction
        implements Callable
    {

        private final UserPin pinToVerify;
        final VerifyCloudPinActivity this$0;

        private com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyResponse call()
            throws Exception
        {
            com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyResponse pinverifyresponse = cloudPinManager.verifyPin(pinToVerify);
            pinToVerify.shred();
            return pinverifyresponse;
            Exception exception;
            exception;
            pinToVerify.shred();
            throw exception;
        }

        public final volatile Object call()
            throws Exception
        {
            return call();
        }

        public VerifyPinAction(UserPin userpin)
        {
            this$0 = VerifyCloudPinActivity.this;
            super();
            pinToVerify = userpin.deepCopy();
        }
    }

    final class VerifyPinCallback extends CloudPinCallback
    {

        final VerifyCloudPinActivity this$0;

        private void onSuccess(com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyResponse pinverifyresponse)
        {
            WLog.d(VerifyCloudPinActivity.TAG, "Entered: VerifyPinCallback.onSuccess()");
            if (pinverifyresponse.callError == null) goto _L2; else goto _L1
_L1:
            userEventLogger.log(29, 121);
            int i = 
// JavaClassFileOutputException: get_constant: invalid tag

        public final void onFailure(Exception exception)
        {
            analyticsUtil.sendError("PinVerify", new AnalyticsCustomDimension[0]);
            onFailure(exception);
        }

        public final volatile void onSuccess(Object obj)
        {
            onSuccess((com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyResponse)obj);
        }

        public VerifyPinCallback()
        {
            this$0 = VerifyCloudPinActivity.this;
            super(VerifyCloudPinActivity.this, "try_again_verify_pin");
        }
    }


    private static final String TAG = com/google/android/apps/wallet/pin/VerifyCloudPinActivity.getSimpleName();
    AccessibilityManager accessibilityManager;
    AccessibilityUtil accessibilityUtil;
    String accountName;
    ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    AppStartTimeLogger appStartTimeLogger;
    CloudPinManager cloudPinManager;
    EventBus eventBus;
    private int failedPinAttempts;
    PinEncryptionPrewarmer pinEncryptionPrewarmer;
    private PinView pinView;
    ResetPinDialog resetPinDialog;
    UserEventLogger userEventLogger;

    public VerifyCloudPinActivity()
    {
        WalletActivity(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void continueToSuccessComponentOrFinish()
    {
        setResult(-1);
        Intent intent = getSuccessComponentIntent();
        if (intent != null)
        {
            WLog.ifmt(TAG, "continuing to success component: %s", new Object[] {
                intent.toString()
            });
            startActivity(intent);
        }
        finish();
    }

    private Intent getSuccessComponentIntent()
    {
        Intent intent;
        if (getIntent().hasExtra("successComponent"))
        {
            WLog.v(TAG, "Starting success activity.");
            intent = InternalIntents.forClass(this, getIntent().getStringExtra("successComponent")).addFlags(0x40000000);
        } else
        {
            intent = ActivityFilters.getRedirectIntent(getIntent());
        }
        if (intent != null)
        {
            intent.addFlags(0x20000000);
        }
        return intent;
    }

    private void setDisplayState(DisplayState displaystate, boolean flag)
    {
        boolean flag1;
        flag1 = true;
        String s = TAG;
        String s1 = String.valueOf(displaystate);
        WLog.d(s, (new StringBuilder(String.valueOf(s1).length() + 35)).append("Entered: setDisplayState(), state: ").append(s1).toString());
        static final class _cls6
        {

            static final int $SwitchMap$com$google$android$apps$wallet$pin$VerifyCloudPinActivity$DisplayState[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$pin$VerifyCloudPinActivity$DisplayState = new int[DisplayState.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$pin$VerifyCloudPinActivity$DisplayState[DisplayState.VERIFY_CURRENT_PIN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$pin$VerifyCloudPinActivity$DisplayState[DisplayState.WAITING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls6..SwitchMap.com.google.android.apps.wallet.pin.VerifyCloudPinActivity.DisplayState[displaystate.ordinal()];
        JVM INSTR tableswitch 1 2: default 80
    //                   1 89
    //                   2 155;
           goto _L1 _L2 _L3
_L1:
        pinView.updateDisplay(flag);
        return;
_L2:
        displaystate = pinView;
        int i;
        if (failedPinAttempts <= 0)
        {
            flag1 = false;
        }
        displaystate.setShowForgotPin(flag1);
        pinView.setWaiting(false);
        displaystate = pinView;
        if (failedPinAttempts > 0)
        {
            i = com.google.android.apps.walletnfcrel.R.string.pin_wrong_pin;
        } else
        {
            i = com.google.android.apps.walletnfcrel.R.string.pin_enter_current_pin;
        }
        displaystate.setPinViewTitle(i);
        continue; /* Loop/switch isn't completed */
_L3:
        pinView.setWaiting(true);
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void startActivityAllowBack(Activity activity, Fragment fragment, int i)
    {
        fragment.startActivityForResult(InternalIntents.forClass(activity, com/google/android/apps/wallet/pin/VerifyCloudPinActivity).addFlags(0x20000000).putExtra("enabled_back_button", true), i);
    }

    public final void doOnCreate(Bundle bundle)
    {
        pinEncryptionPrewarmer.prewarm();
        if (bundle != null)
        {
            failedPinAttempts = bundle.getInt("FORGOT_PIN", 0);
        }
        pinView = new PinView(this, accountName, accessibilityUtil, accessibilityManager);
        pinView.setPinEnteredListener(new OnActionListener() {

            final VerifyCloudPinActivity this$0;

            private void onAction(UserPin userpin)
            {
                WLog.d(VerifyCloudPinActivity.TAG, "Entered: PinEnteredListener.onAction()");
                appStartTimeLogger.notifyVerifyPin();
                analyticsUtil.startTiming(null, "user_verify_pin");
                setDisplayState(DisplayState.WAITING, false);
                actionExecutor.executeAction(new VerifyPinAction(userpin), new VerifyPinCallback());
            }

            public final volatile void onAction(Object obj)
            {
                onAction((UserPin)obj);
            }

            
            {
                this$0 = VerifyCloudPinActivity.this;
                super();
            }
        });
        pinView.setForgotPinOnClickListener(new android.view.View.OnClickListener() {

            final VerifyCloudPinActivity this$0;

            public final void onClick(View view)
            {
                resetPinDialog.showForgotPin(getSupportFragmentManager());
            }

            
            {
                this$0 = VerifyCloudPinActivity.this;
                super();
            }
        });
        setContentView(pinView);
        OrientationController.setRequestedOrientationIfAllowed(this);
    }

    protected final void doOnResume()
    {
        getSupportActionBar().hide();
        setTitle(com.google.android.apps.walletnfcrel.R.string.pin_enter_current_pin);
        if (getIntent() != null && getIntent().getBooleanExtra("play_failure_sound", false))
        {
            Sound.playPaymentFailureSound(this);
        }
        if (getIntent() != null && getIntent().getBooleanExtra("floatTop", false))
        {
            getWindow().addFlags(0x280000);
        }
        if (getIntent() != null && getIntent().getBooleanExtra("EXPIRE_PIN", false))
        {
            setDisplayState(DisplayState.WAITING, false);
            actionExecutor.executeAction(new Callable() {

                final VerifyCloudPinActivity this$0;

                private Void call()
                    throws Exception
                {
                    cloudPinManager.expirePin();
                    return null;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = VerifyCloudPinActivity.this;
                super();
            }
            }, new AsyncCallback() {

                final VerifyCloudPinActivity this$0;

                private void onSuccess(Void void1)
                {
                    setDisplayState(DisplayState.VERIFY_CURRENT_PIN, false);
                }

                public final void onFailure(Exception exception)
                {
                    setDisplayState(DisplayState.VERIFY_CURRENT_PIN, false);
                }

                public final volatile void onSuccess(Object obj)
                {
                    onSuccess((Void)obj);
                }

            
            {
                this$0 = VerifyCloudPinActivity.this;
                super();
            }
            });
        } else
        {
            setDisplayState(DisplayState.VERIFY_CURRENT_PIN, false);
        }
        eventBus.register(this);
        userEventLogger.log(29, 120);
        analyticsUtil.sendScreen("Enter Wallet Pin", new AnalyticsCustomDimension[0]);
        appStartTimeLogger.notifyVerifyPinRenderred();
    }

    public void handleNetworkConnectivityEvent(NetworkConnectivityEvent networkconnectivityevent)
    {
        String s = TAG;
        boolean flag = networkconnectivityevent.isConnected();
        WLog.d(s, (new StringBuilder(40)).append("Received NetworkConnectivityEvent: ").append(flag).toString());
        if (!networkconnectivityevent.isConnected())
        {
            analyticsUtil.sendError("NetworkConnectivity", new AnalyticsCustomDimension[0]);
        }
        pinView.setNetworkAvailable(networkconnectivityevent.isConnected());
        pinView.updateDisplay(false);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final void onAttachFragment(Fragment fragment)
    {
        WLog.d(TAG, "Entered: onAttachFragment()");
        super.onAttachFragment(fragment);
        if (fragment instanceof TryAgainDialogFragment)
        {
            fragment = (TryAgainDialogFragment)fragment;
            fragment.setListener(new TryAgainDialogFragment.Listener() {

                final VerifyCloudPinActivity this$0;
                final String val$tag;

                private void reset()
                {
                    if ("try_again_verify_pin".equals(tag))
                    {
                        setDisplayState(DisplayState.VERIFY_CURRENT_PIN, true);
                    }
                }

                public final void onCancel()
                {
                    reset();
                    startActivity(QuitIntent.create());
                }

                public final void onTryAgain()
                {
                    reset();
                }

            
            {
                this$0 = VerifyCloudPinActivity.this;
                tag = s;
                super();
            }
            });
        }
    }

    public void onBackPressed()
    {
        if (getIntent().hasExtra("enabled_back_button"))
        {
            super.onBackPressed();
            return;
        } else
        {
            startActivity(QuitIntent.create());
            return;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (pinView.onKeyUp(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        WLog.d(TAG, "Entered: onNewIntent()");
        super.onNewIntent(intent);
        setIntent(intent);
    }

    protected void onPause()
    {
        WLog.d(TAG, "Entered: onPause()");
        eventBus.unregisterAll(this);
        actionExecutor.cancelAll();
        super.onPause();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("FORGOT_PIN", failedPinAttempts);
    }

    protected final void onUpPressed()
    {
    }





/*
    static int access$202(VerifyCloudPinActivity verifycloudpinactivity, int i)
    {
        verifycloudpinactivity.failedPinAttempts = i;
        return i;
    }

*/


/*
    static int access$208(VerifyCloudPinActivity verifycloudpinactivity)
    {
        int i = verifycloudpinactivity.failedPinAttempts;
        verifycloudpinactivity.failedPinAttempts = i + 1;
        return i;
    }

*/


}
