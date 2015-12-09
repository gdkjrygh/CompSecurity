// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.funding.api.FundingApi;
import com.google.android.apps.wallet.hce.setup.api.NfcSetupApi;
import com.google.android.apps.wallet.hce.setup.ui.NfcCancelConfirmationDialogFragment;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            NfcPaymentSetupService

public class LegacySetupNfcPaymentActivity extends WalletActivity
{
    static final class NavState extends Enum
    {

        private static final NavState $VALUES[];
        public static final NavState CONGRATS;
        public static final NavState EXIT;
        public static final NavState FUNDING;
        public static final NavState WAITING;

        public static NavState valueOf(String s)
        {
            return (NavState)Enum.valueOf(com/google/android/apps/wallet/hce/setup/LegacySetupNfcPaymentActivity$NavState, s);
        }

        public static NavState[] values()
        {
            return (NavState[])$VALUES.clone();
        }

        static 
        {
            FUNDING = new NavState("FUNDING", 0);
            WAITING = new NavState("WAITING", 1);
            CONGRATS = new NavState("CONGRATS", 2);
            EXIT = new NavState("EXIT", 3);
            $VALUES = (new NavState[] {
                FUNDING, WAITING, CONGRATS, EXIT
            });
        }

        private NavState(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = com/google/android/apps/wallet/hce/setup/LegacySetupNfcPaymentActivity.getSimpleName();
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private NavState navState;
    UriRegistry uriRegistry;
    UserEventLogger userEventLogger;

    public LegacySetupNfcPaymentActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private static NavState getNavState(Bundle bundle)
    {
        if (bundle == null || bundle.getSerializable("nav_state") == null)
        {
            return NavState.FUNDING;
        } else
        {
            return (NavState)bundle.getSerializable("nav_state");
        }
    }

    private void transitionNavState(NavState navstate)
    {
        String s = TAG;
        String s1 = String.valueOf(navstate);
        WLog.d(s, (new StringBuilder(String.valueOf(s1).length() + 24)).append("Transitioning to state: ").append(s1).toString());
        navState = navstate;
        static final class _cls1
        {

            static final int $SwitchMap$com$google$android$apps$wallet$hce$setup$LegacySetupNfcPaymentActivity$NavState[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$hce$setup$LegacySetupNfcPaymentActivity$NavState = new int[NavState.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$hce$setup$LegacySetupNfcPaymentActivity$NavState[NavState.FUNDING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$hce$setup$LegacySetupNfcPaymentActivity$NavState[NavState.WAITING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$hce$setup$LegacySetupNfcPaymentActivity$NavState[NavState.CONGRATS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$hce$setup$LegacySetupNfcPaymentActivity$NavState[NavState.EXIT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.google.android.apps.wallet.hce.setup.LegacySetupNfcPaymentActivity.NavState[navState.ordinal()])
        {
        case 2: // '\002'
        default:
            return;

        case 1: // '\001'
            startActivityForResult(FundingApi.createLegacySetupNfcBackingInstrumentsActivityIntent(this), 1);
            transitionNavState(NavState.WAITING);
            return;

        case 3: // '\003'
            NfcPaymentSetupService.requestNfcPaymentSetup(this);
            startActivity(NfcSetupApi.createLegacySetupNfcPaymentCongratsActivityIntent(this));
            finish();
            return;

        case 4: // '\004'
            finish();
            break;
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        fullScreenProgressSpinnerManager.show();
        navState = getNavState(bundle);
        transitionNavState(navState);
        userEventLogger.log(26, 110);
    }

    protected final boolean isWidthLimited()
    {
        return true;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (j == -1)
        {
            switch (i)
            {
            default:
                return;

            case 1: // '\001'
                transitionNavState(NavState.CONGRATS);
                break;
            }
            return;
        } else
        {
            finish();
            return;
        }
    }

    public void onBackPressed()
    {
        NfcCancelConfirmationDialogFragment.createAndShow(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("nav_state", navState);
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }

    public void startActivity(Intent intent)
    {
        super.startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        super.startActivityForResult(intent, i);
        overridePendingTransition(0, 0);
    }

}
