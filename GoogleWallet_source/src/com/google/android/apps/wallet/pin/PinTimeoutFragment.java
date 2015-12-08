// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.preferences.PreferenceClient;
import com.google.android.apps.wallet.settings.ui.TextAndButtonListRowDisplay;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.primitives.Ints;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.pin:
//            VerifyCloudPinActivity, CloudPinManager

public class PinTimeoutFragment extends WalletFragment
{

    private static final String TAG = com/google/android/apps/wallet/pin/PinTimeoutFragment.getSimpleName();
    ActionExecutor actionExecutor;
    FragmentActivity activity;
    CloudPinManager cloudPinManager;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private final Object lock = new Object();
    private boolean needToShowTimeoutDialog;
    private int pinMenuValues[];
    private android.content.DialogInterface.OnClickListener pinSelectionListener;
    PreferenceClient preferenceClient;
    TextAndButtonListRowDisplay settingsEntryDisplay;
    private volatile boolean viewUpdatedFromServer;

    public PinTimeoutFragment()
    {
        viewUpdatedFromServer = false;
    }

    private String[] buildPinMenuEntries(int ai[])
    {
        String as[] = new String[ai.length];
        for (int i = 0; i < ai.length; i++)
        {
            as[i] = getShortFormUserVisibleTimeString(ai[i]);
        }

        return as;
    }

    private static String convertFromMinutesToUserVisibleTimeString(Context context, int i)
    {
        if (i == 0)
        {
            return context.getResources().getString(com.google.android.apps.walletnfcrel.R.string.pin_settings_timeout_option_never);
        }
        if (i <= 0)
        {
            throw new IllegalArgumentException("The pin timeout must be positive.");
        }
        int j = i / 1440;
        int k = i / 60;
        i %= 60;
        if (j == 0)
        {
            if (k == 0)
            {
                return String.format(context.getResources().getQuantityString(com.google.android.apps.walletnfcrel.R.plurals.pin_settings_minutes, i), new Object[] {
                    Integer.valueOf(i)
                });
            }
            if (i != 0)
            {
                throw new IllegalArgumentException("The pin timeout must either be less than 60 or a multiple of 60.");
            } else
            {
                return String.format(context.getResources().getQuantityString(com.google.android.apps.walletnfcrel.R.plurals.pin_settings_hours, k), new Object[] {
                    Integer.valueOf(k)
                });
            }
        } else
        {
            return String.format(context.getResources().getQuantityString(com.google.android.apps.walletnfcrel.R.plurals.pin_settings_days, j), new Object[] {
                Integer.valueOf(j)
            });
        }
    }

    private void forcePinVerification()
    {
        fullScreenProgressSpinnerManager.show();
        VerifyCloudPinActivity.startActivityAllowBack(activity, this, 3);
    }

    private String getLongFormUserVisibleTimeString(int i)
    {
        if (i == 0)
        {
            return getString(com.google.android.apps.walletnfcrel.R.string.pin_settings_timeout_text_never);
        } else
        {
            return getString(com.google.android.apps.walletnfcrel.R.string.pin_settings_current_pin_timeout_format, new Object[] {
                getShortFormUserVisibleTimeString(i)
            });
        }
    }

    private String getShortFormUserVisibleTimeString(int i)
    {
        if (i == 0)
        {
            return getString(com.google.android.apps.walletnfcrel.R.string.pin_settings_timeout_option_never);
        } else
        {
            return convertFromMinutesToUserVisibleTimeString(activity, i);
        }
    }

    private void handlePinTimeOutSelection(DialogInterface dialoginterface, final int pinTimeoutMinutes)
    {
        WLog.v(TAG, "handlePinTimeOutSelection()");
        fullScreenProgressSpinnerManager.show();
        dialoginterface.dismiss();
        actionExecutor.executeAction(new Callable() {

            final PinTimeoutFragment this$0;
            final int val$pinTimeoutMinutes;

            private Void call()
                throws Exception
            {
                preferenceClient.updatePinTimeoutMinutesSetting(pinTimeoutMinutes);
                cloudPinManager.changePinTimeout(pinTimeoutMinutes);
                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = PinTimeoutFragment.this;
                pinTimeoutMinutes = i;
                super();
            }
        }, new AsyncCallback() {

            final PinTimeoutFragment this$0;
            final int val$pinTimeoutMinutes;

            private void onSuccess(Void void1)
            {
                updateView(pinTimeoutMinutes);
                fullScreenProgressSpinnerManager.hide();
                if (pinTimeoutMinutes == 0)
                {
                    AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.pin_settings_timeout_option_never_alert_message_title).setMessage(com.google.android.apps.walletnfcrel.R.string.pin_settings_timeout_option_never_alert_message_body).build().show(getFragmentManager());
                }
            }

            public final void onFailure(Exception exception)
            {
                WLog.v(PinTimeoutFragment.TAG, "Failed to update server with new PIN timeout setting", exception);
                Toasts.show(getActivity(), com.google.android.apps.walletnfcrel.R.string.settings_view_pin_timeout_update_failure);
                fullScreenProgressSpinnerManager.hide();
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((Void)obj);
            }

            
            {
                this$0 = PinTimeoutFragment.this;
                pinTimeoutMinutes = i;
                super();
            }
        });
    }

    private void showPinTimeoutDialog()
    {
        WLog.v(TAG, "setupAndDisplayTimeSelectionDialog(): RELOCK_PERIOD Clicked");
        String as[] = buildPinMenuEntries(pinMenuValues);
        int i = cloudPinManager.getPinTimeout();
        i = Ints.indexOf(pinMenuValues, i);
        AlertDialogFragment alertdialogfragment = AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.pin_settings_timeout_dialog_title).setSingleChoiceItems(as, i).setPositiveButton(0).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).build();
        alertdialogfragment.setOnClickListener(pinSelectionListener);
        alertdialogfragment.show(activity.getSupportFragmentManager(), "DIALOG_PIN_TIMEOUT");
        needToShowTimeoutDialog = false;
    }

    private void updatePinTimeoutContent()
    {
        settingsEntryDisplay.setTitle(getString(com.google.android.apps.walletnfcrel.R.string.settings_view_wallet_pin_timeout));
        actionExecutor.executeAction(new Callable() {

            final PinTimeoutFragment this$0;

            private Integer call()
                throws Exception
            {
                return Integer.valueOf(cloudPinManager.getPinTimeout());
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = PinTimeoutFragment.this;
                super();
            }
        }, new AsyncCallback() {

            final PinTimeoutFragment this$0;

            private void onSuccess(Integer integer)
            {
                updateView(integer.intValue(), false);
            }

            public final void onFailure(Exception exception)
            {
                WLog.v(PinTimeoutFragment.TAG, "Could not get Pin timeout setting from local db", exception);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((Integer)obj);
            }

            
            {
                this$0 = PinTimeoutFragment.this;
                super();
            }
        });
        actionExecutor.executeAction(new Callable() {

            final PinTimeoutFragment this$0;

            private Integer call()
                throws Exception
            {
                return Integer.valueOf(preferenceClient.fetchPinTimeoutMinutesSetting());
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = PinTimeoutFragment.this;
                super();
            }
        }, new AsyncCallback() {

            final PinTimeoutFragment this$0;

            private void onSuccess(Integer integer)
            {
                updateView(integer.intValue(), true);
            }

            public final void onFailure(Exception exception)
            {
                WLog.v(PinTimeoutFragment.TAG, "Could not get Pin timeout setting from server", exception);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((Integer)obj);
            }

            
            {
                this$0 = PinTimeoutFragment.this;
                super();
            }
        });
    }

    private void updateView(int i)
    {
        settingsEntryDisplay.setSubtitle(getLongFormUserVisibleTimeString(i));
    }

    private void updateView(int i, boolean flag)
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        viewUpdatedFromServer = true;
        updateView(i);
_L4:
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!viewUpdatedFromServer)
        {
            updateView(i);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 3)
        {
            fullScreenProgressSpinnerManager.hide();
            if (j == -1)
            {
                needToShowTimeoutDialog = true;
            }
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        needToShowTimeoutDialog = false;
        pinMenuValues = getResources().getIntArray(com.google.android.apps.walletnfcrel.R.array.cloud_pin_settings_timeout_array);
        settingsEntryDisplay.setRowActionListener(new OnActionListener() {

            final PinTimeoutFragment this$0;

            private void onAction(Void void1)
            {
                forcePinVerification();
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = PinTimeoutFragment.this;
                super();
            }
        });
        pinSelectionListener = new android.content.DialogInterface.OnClickListener() {

            final PinTimeoutFragment this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (i >= 0)
                {
                    handlePinTimeOutSelection(dialoginterface, pinMenuValues[i]);
                }
            }

            
            {
                this$0 = PinTimeoutFragment.this;
                super();
            }
        };
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        updatePinTimeoutContent();
        return settingsEntryDisplay.getView();
    }

    public final void onDestroy()
    {
        super.onDestroy();
        actionExecutor.cancelAll();
    }

    public final void onResume()
    {
        super.onResume();
        settingsEntryDisplay.setDividerVisible(true);
        if (needToShowTimeoutDialog)
        {
            showPinTimeoutDialog();
        }
    }







}
