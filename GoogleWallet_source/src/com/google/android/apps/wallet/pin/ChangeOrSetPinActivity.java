// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.QuitIntent;
import com.google.android.apps.wallet.base.activity.OrientationController;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.device.DeviceInfoManager;
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
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            UserPin, CloudPinManager, CloudPinState, PinQualityVerifier, 
//            PinView, TryAgainDialogFragment, ResetPinDialog, CloudPinCallback

public class ChangeOrSetPinActivity extends WalletActivity
{
    static final class DisplayState extends Enum
    {

        private static final DisplayState $VALUES[];
        public static final DisplayState CONFIRM_NEW_PIN;
        public static final DisplayState ENTER_INITIAL_PIN;
        public static final DisplayState ENTER_NEW_PIN;
        public static final DisplayState VERIFY_CURRENT_PIN;
        public static final DisplayState WAITING;

        public static DisplayState valueOf(String s)
        {
            return (DisplayState)Enum.valueOf(com/google/android/apps/wallet/pin/ChangeOrSetPinActivity$DisplayState, s);
        }

        public static DisplayState[] values()
        {
            return (DisplayState[])$VALUES.clone();
        }

        static 
        {
            VERIFY_CURRENT_PIN = new DisplayState("VERIFY_CURRENT_PIN", 0);
            ENTER_INITIAL_PIN = new DisplayState("ENTER_INITIAL_PIN", 1);
            ENTER_NEW_PIN = new DisplayState("ENTER_NEW_PIN", 2);
            CONFIRM_NEW_PIN = new DisplayState("CONFIRM_NEW_PIN", 3);
            WAITING = new DisplayState("WAITING", 4);
            $VALUES = (new DisplayState[] {
                VERIFY_CURRENT_PIN, ENTER_INITIAL_PIN, ENTER_NEW_PIN, CONFIRM_NEW_PIN, WAITING
            });
        }

        private DisplayState(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = com/google/android/apps/wallet/pin/ChangeOrSetPinActivity.getSimpleName();
    AccessibilityManager accessibilityManager;
    AccessibilityUtil accessibilityUtil;
    String accountName;
    ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    CloudPinManager cloudPinManager;
    DeviceInfoManager deviceInfoManager;
    EventBus eventBus;
    private int failedPinAttempts;
    private UserPin firstPin;
    private UserPin originalPin;
    PinEncryptionPrewarmer pinEncryptionPrewarmer;
    PinQualityVerifier pinQualityVerifier;
    private PinView pinView;
    ResetPinDialog resetPinDialog;
    private UserPin secondPin;
    UserEventLogger userEventLogger;

    public ChangeOrSetPinActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        originalPin = UserPin.NO_PIN;
        firstPin = UserPin.NO_PIN;
        secondPin = UserPin.NO_PIN;
    }

    private DisplayState calculateDisplayState()
    {
        if (cloudPinManager.getCloudPinState() == CloudPinState.UNSET)
        {
            if (firstPin == UserPin.NO_PIN)
            {
                return DisplayState.ENTER_INITIAL_PIN;
            }
        } else
        {
            if (originalPin == UserPin.NO_PIN)
            {
                return DisplayState.VERIFY_CURRENT_PIN;
            }
            if (firstPin == UserPin.NO_PIN)
            {
                return DisplayState.ENTER_NEW_PIN;
            }
        }
        return DisplayState.CONFIRM_NEW_PIN;
    }

    private void changePin()
    {
        update(false, DisplayState.WAITING);
        Callable callable = new Callable() {

            final ChangeOrSetPinActivity this$0;

            private com.google.wallet.proto.api.NanoWalletCloudPin.PinChangeResponse call()
                throws Exception
            {
                WLog.i(ChangeOrSetPinActivity.TAG, "changing PIN in CloudPinManager and SecurePinManager");
                com.google.wallet.proto.api.NanoWalletCloudPin.PinChangeResponse pinchangeresponse = cloudPinManager.changePin(originalPin, firstPin);
                if (pinchangeresponse.callError != null)
                {
                    return pinchangeresponse;
                } else
                {
                    return null;
                }
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = ChangeOrSetPinActivity.this;
                super();
            }
        };
        CloudPinCallback cloudpincallback = new CloudPinCallback(this, "dialog_try_again_change_pin") {

            final ChangeOrSetPinActivity this$0;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletCloudPin.PinChangeResponse pinchangeresponse)
            {
                if (pinchangeresponse == null)
                {
                    accessibilityUtil.announce(getWindow().getDecorView(), getString(com.google.android.apps.walletnfcrel.R.string.pin_set_or_changed_message));
                    setResult(-1);
                    finish();
                    return;
                }
                Integer integer;
                String s;
                String s1;
                boolean flag;
                if (pinchangeresponse.callError != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag);
                pinchangeresponse = pinchangeresponse.callError;
                integer = ((com.google.wallet.proto.NanoWalletError.CallError) (pinchangeresponse)).errorCode;
                s = ChangeOrSetPinActivity.TAG;
                s1 = String.valueOf(integer);
                WLog.e(s, (new StringBuilder(String.valueOf(s1).length() + 39)).append("PinChangeResponse contains error code: ").append(s1).toString());
                switch (Protos.valueWithDefault(integer, 0))
                {
                default:
                    throw new IllegalStateException();

                case 4: // '\004'
                    resetPinDialog.showPinLocked(getSupportFragmentManager());
                    return;

                case 1: // '\001'
                case 2: // '\002'
                    if (((com.google.wallet.proto.NanoWalletError.CallError) (pinchangeresponse)).title != null && ((com.google.wallet.proto.NanoWalletError.CallError) (pinchangeresponse)).content != null)
                    {
                        showDialog(((com.google.wallet.proto.NanoWalletError.CallError) (pinchangeresponse)).title, ((com.google.wallet.proto.NanoWalletError.CallError) (pinchangeresponse)).content);
                    } else
                    {
                        WLog.d(ChangeOrSetPinActivity.TAG, "Got NEW_PIN_INVALID without a provided error message.");
                    }
                    resetNewPin();
                    update(true);
                    return;

                case 3: // '\003'
                    throw new IllegalStateException("server responded PIN_NOT_SET");
                }
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletCloudPin.PinChangeResponse)obj);
            }

            
            {
                this$0 = ChangeOrSetPinActivity.this;
                super(fragmentactivity, s);
            }
        };
        actionExecutor.executeAction(callable, cloudpincallback);
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

    private void onPinEntered(UserPin userpin)
    {
        if (firstPin != UserPin.NO_PIN)
        {
            secondPin = userpin.deepCopy();
            if (firstPin.equals(secondPin))
            {
                if (originalPin == UserPin.NO_PIN)
                {
                    setInitialPin();
                    return;
                } else
                {
                    changePin();
                    return;
                }
            } else
            {
                showInvalidPinDialog(com.google.android.apps.walletnfcrel.R.string.pin_new_pin_invalid_message_pins_mismatch);
                resetNewPin();
                update(true);
                return;
            }
        }
        if (originalPin != UserPin.NO_PIN || cloudPinManager.getCloudPinState() == CloudPinState.UNSET)
        {
            firstPin = userpin.deepCopy();
            userpin = pinQualityVerifier.verifyPinQuality(firstPin);
            if (userpin == PinQualityVerifier.PinQualityResult.VALID)
            {
                update(true);
                return;
            } else
            {
                resetNewPin();
                showInvalidPinDialog(userpin.getLocalizedMessageResourceId());
                update(true);
                return;
            }
        } else
        {
            originalPin = userpin.deepCopy();
            verifyOriginalPin();
            return;
        }
    }

    private void resetNewPin()
    {
        if (firstPin != UserPin.NO_PIN)
        {
            firstPin.shred();
            firstPin = UserPin.NO_PIN;
        }
        if (secondPin != UserPin.NO_PIN)
        {
            secondPin.shred();
            secondPin = UserPin.NO_PIN;
        }
    }

    private void resetOriginalPin()
    {
        if (originalPin != UserPin.NO_PIN)
        {
            originalPin.shred();
            originalPin = UserPin.NO_PIN;
        }
    }

    private void setInitialPin()
    {
        update(false, DisplayState.WAITING);
        Callable callable = new Callable() {

            final ChangeOrSetPinActivity this$0;

            private com.google.wallet.proto.api.NanoWalletCloudPin.SetPinResponse call()
                throws Exception
            {
                WLog.i(ChangeOrSetPinActivity.TAG, "setting initial PIN in CloudPinManager");
                return cloudPinManager.setInitialPin(firstPin);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = ChangeOrSetPinActivity.this;
                super();
            }
        };
        CloudPinCallback cloudpincallback = new CloudPinCallback(this, "dialog_try_again_set_pin") {

            final ChangeOrSetPinActivity this$0;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletCloudPin.SetPinResponse setpinresponse)
            {
                if (setpinresponse.callError == null)
                {
                    userEventLogger.log(28, 119);
                    accessibilityUtil.announce(getWindow().getDecorView(), getString(com.google.android.apps.walletnfcrel.R.string.pin_set_or_changed_message));
                    setpinresponse = getSuccessComponentIntent();
                    if (setpinresponse != null)
                    {
                        WLog.ifmt(ChangeOrSetPinActivity.TAG, "continuing to success component: %s", new Object[] {
                            setpinresponse.toString()
                        });
                        startActivity(setpinresponse);
                    }
                    finish();
                    return;
                }
                String s = ChangeOrSetPinActivity.TAG;
                String s1 = String.valueOf(setpinresponse.callError.errorCode);
                WLog.e(s, (new StringBuilder(String.valueOf(s1).length() + 36)).append("SetPinResponse contains error code: ").append(s1).toString());
                switch (Protos.valueWithDefault(setpinresponse.callError.errorCode, 0))
                {
                default:
                    throw new IllegalStateException();

                case 2: // '\002'
                    showDialog(com.google.android.apps.walletnfcrel.R.string.pin_already_set_title, com.google.android.apps.walletnfcrel.R.string.pin_already_set_message, "dialog_pin_already_set");
                    resetNewPin();
                    update(true);
                    return;

                case 1: // '\001'
                    break;
                }
                if (setpinresponse.callError.title != null && setpinresponse.callError.content != null)
                {
                    showDialog(setpinresponse.callError.title, setpinresponse.callError.content);
                }
                resetNewPin();
                update(true);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletCloudPin.SetPinResponse)obj);
            }

            
            {
                this$0 = ChangeOrSetPinActivity.this;
                super(fragmentactivity, s);
            }
        };
        actionExecutor.executeAction(callable, cloudpincallback);
    }

    private void showDialog(int i, int j, String s)
    {
        AlertDialogFragment.newBuilder().setTitle(i).setMessage(j).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok).build().show(getSupportFragmentManager(), s);
    }

    private void showDialog(String s, String s1)
    {
        AlertDialogFragment.newBuilder().setTitle(s).setMessage(s1).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok).build().show(getSupportFragmentManager());
    }

    private void showInvalidPinDialog(int i)
    {
        AlertDialogFragment.newBuilder().setMessage(i).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok).build().show(getSupportFragmentManager());
    }

    private void update(boolean flag)
    {
        update(flag, calculateDisplayState());
    }

    private void update(boolean flag, DisplayState displaystate)
    {
        static final class _cls11
        {

            static final int $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState = new int[DisplayState.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState[DisplayState.CONFIRM_NEW_PIN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState[DisplayState.ENTER_INITIAL_PIN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState[DisplayState.VERIFY_CURRENT_PIN.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState[DisplayState.ENTER_NEW_PIN.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$pin$ChangeOrSetPinActivity$DisplayState[DisplayState.WAITING.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls11..SwitchMap.com.google.android.apps.wallet.pin.ChangeOrSetPinActivity.DisplayState[displaystate.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 240
    //                   2 140
    //                   3 53
    //                   4 190
    //                   5 290;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        pinView.updateDisplay(flag);
        return;
_L4:
        analyticsUtil.sendScreen("Enter Wallet Pin", new AnalyticsCustomDimension[0]);
        displaystate = pinView;
        int i;
        boolean flag1;
        if (failedPinAttempts > 0)
        {
            i = com.google.android.apps.walletnfcrel.R.string.pin_wrong_pin;
        } else
        {
            i = com.google.android.apps.walletnfcrel.R.string.pin_enter_current_pin;
        }
        displaystate.setPinViewTitle(i);
        pinView.announceTitleText();
        displaystate = pinView;
        if (failedPinAttempts > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        displaystate.setShowForgotPin(flag1);
        pinView.setWaiting(false);
        continue; /* Loop/switch isn't completed */
_L3:
        analyticsUtil.sendScreen("Set Wallet Pin", new AnalyticsCustomDimension[0]);
        pinView.setPinViewTitle(com.google.android.apps.walletnfcrel.R.string.pin_set_initial_pin);
        pinView.announceTitleText();
        pinView.setShowForgotPin(false);
        pinView.setWaiting(false);
        continue; /* Loop/switch isn't completed */
_L5:
        analyticsUtil.sendScreen("Set Wallet Pin", new AnalyticsCustomDimension[0]);
        pinView.setPinViewTitle(com.google.android.apps.walletnfcrel.R.string.pin_enter_new_pin);
        pinView.announceTitleText();
        pinView.setShowForgotPin(false);
        pinView.setWaiting(false);
        continue; /* Loop/switch isn't completed */
_L2:
        analyticsUtil.sendScreen("Confirm New Wallet Pin", new AnalyticsCustomDimension[0]);
        pinView.setPinViewTitle(com.google.android.apps.walletnfcrel.R.string.pin_confirm_new_pin);
        pinView.announceTitleText();
        pinView.setShowForgotPin(false);
        pinView.setWaiting(false);
        continue; /* Loop/switch isn't completed */
_L6:
        pinView.setWaiting(true);
        if (true) goto _L1; else goto _L7
_L7:
    }

    private void verifyOriginalPin()
    {
        update(false, DisplayState.WAITING);
        Callable callable = new Callable() {

            final ChangeOrSetPinActivity this$0;

            private com.google.wallet.proto.api.NanoWalletCloudPin.PinVerifyResponse call()
                throws Exception
            {
                WLog.i(ChangeOrSetPinActivity.TAG, "verifying PIN with CloudPinManager");
                return cloudPinManager.verifyPin(originalPin);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = ChangeOrSetPinActivity.this;
                super();
            }
        };
        CloudPinCallback cloudpincallback = new CloudPinCallback(this, "dialog_try_again_verify_pin") ;
        actionExecutor.executeAction(callable, cloudpincallback);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        getSupportActionBar().hide();
        pinEncryptionPrewarmer.prewarm();
        pinView = new PinView(this, accountName, accessibilityUtil, accessibilityManager);
        pinView.setPinEnteredListener(new OnActionListener() {

            final ChangeOrSetPinActivity this$0;

            private void onAction(UserPin userpin)
            {
                onPinEntered(userpin);
            }

            public final volatile void onAction(Object obj)
            {
                onAction((UserPin)obj);
            }

            
            {
                this$0 = ChangeOrSetPinActivity.this;
                super();
            }
        });
        pinView.setForgotPinOnClickListener(new android.view.View.OnClickListener() {

            final ChangeOrSetPinActivity this$0;

            public final void onClick(View view)
            {
                resetPinDialog.showForgotPin(getSupportFragmentManager());
            }

            
            {
                this$0 = ChangeOrSetPinActivity.this;
                super();
            }
        });
        if (bundle != null)
        {
            failedPinAttempts = bundle.getInt("FAILED_PIN_ATTEMPTS", 0);
        }
        setContentView(pinView);
        if (cloudPinManager.getCloudPinState() == CloudPinState.UNSET)
        {
            userEventLogger.log(28, 118);
        }
        OrientationController.setRequestedOrientationIfAllowed(this);
    }

    protected final void doOnResume()
    {
        eventBus.register(this);
        update(true);
    }

    public void handleNetworkConnectivityEvent(NetworkConnectivityEvent networkconnectivityevent)
    {
        pinView.setNetworkAvailable(networkconnectivityevent.isConnected());
        update(false);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if (fragment instanceof TryAgainDialogFragment)
        {
            fragment = (TryAgainDialogFragment)fragment;
            fragment.setListener(new TryAgainDialogFragment.Listener() {

                final ChangeOrSetPinActivity this$0;
                final String val$tag;

                private void reset()
                {
                    if ("dialog_try_again_verify_pin".equals(tag))
                    {
                        resetOriginalPin();
                        update(true);
                    } else
                    if ("dialog_try_again_change_pin".equals(tag) || "dialog_try_again_set_pin".equals(tag))
                    {
                        resetNewPin();
                        update(true);
                        return;
                    }
                }

                public final void onCancel()
                {
                    reset();
                    if (calculateDisplayState().equals(DisplayState.ENTER_INITIAL_PIN))
                    {
                        startActivity(QuitIntent.create());
                        return;
                    } else
                    {
                        setResult(0);
                        finish();
                        return;
                    }
                }

                public final void onTryAgain()
                {
                    reset();
                }

            
            {
                this$0 = ChangeOrSetPinActivity.this;
                tag = s;
                super();
            }
            });
        } else
        if ("dialog_pin_already_set".equals(fragment.getTag()))
        {
            ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final ChangeOrSetPinActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    if (i == -1)
                    {
                        setResult(0);
                        finish();
                    }
                }

            
            {
                this$0 = ChangeOrSetPinActivity.this;
                super();
            }
            });
            return;
        }
    }

    public void onBackPressed()
    {
        switch (_cls11..SwitchMap.com.google.android.apps.wallet.pin.ChangeOrSetPinActivity.DisplayState[calculateDisplayState().ordinal()])
        {
        default:
            super.onBackPressed();
            return;

        case 1: // '\001'
            resetNewPin();
            update(true);
            return;

        case 2: // '\002'
            startActivity(QuitIntent.create());
            break;
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

    protected void onPause()
    {
        actionExecutor.cancelAll();
        eventBus.unregisterAll(this);
        resetOriginalPin();
        resetNewPin();
        super.onPause();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("FAILED_PIN_ATTEMPTS", failedPinAttempts);
    }

    protected final void onUpPressed()
    {
    }












/*
    static int access$702(ChangeOrSetPinActivity changeorsetpinactivity, int i)
    {
        changeorsetpinactivity.failedPinAttempts = i;
        return i;
    }

*/


/*
    static int access$708(ChangeOrSetPinActivity changeorsetpinactivity)
    {
        int i = changeorsetpinactivity.failedPinAttempts;
        changeorsetpinactivity.failedPinAttempts = i + 1;
        return i;
    }

*/


}
