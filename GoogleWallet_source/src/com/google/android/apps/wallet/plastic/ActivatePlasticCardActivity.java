// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.fragment.Fragments;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            ActivationFragment

public class ActivatePlasticCardActivity extends WalletActivity
{
    public static class ActivateCancelAlertDialogFragment extends AlertDialogFragment
    {

        UriRegistry uriRegistry;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            if (i == -1)
            {
                getActivity().finish();
                startActivity(uriRegistry.createIntent(2, new Object[0]));
                return;
            } else
            {
                super.onClick(dialoginterface, i);
                return;
            }
        }

        public ActivateCancelAlertDialogFragment()
        {
            super(AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.leave_activation_title).setMessage(com.google.android.apps.walletnfcrel.R.string.leave_activation_message).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.leave_activation_button_label).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).setCancelable(true));
        }
    }


    Provider activatePlasticCardFragmentProvider;
    Provider congratulationsFragmentProvider;
    Provider howItWorksFragmentProvider;
    ActivationFragment.NavState navState;
    UriRegistry uriRegistry;
    UserEventLogger userEventLogger;

    public ActivatePlasticCardActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        navState = ActivationFragment.NavState.UNINITIALIZED;
    }

    private void transitionToFragment(ActivationFragment activationfragment)
    {
        getSupportFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer, activationfragment, Fragments.getTransactionTag(activationfragment.getClass())).commit();
    }

    protected final void doOnCreate(Bundle bundle)
    {
        if (bundle == null)
        {
            transitionNavState(ActivationFragment.NavState.ACTIVATE);
            return;
        } else
        {
            navState = ActivationFragment.NavState.values()[bundle.getInt("nav-state-key")];
            return;
        }
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if (fragment instanceof ActivationFragment)
        {
            ((ActivationFragment)fragment).setNavListener(new ActivationFragment.NavListener() {

                final ActivatePlasticCardActivity this$0;

                public final void onRequestNav(ActivationFragment.NavState navstate)
                {
                    transitionNavState(navstate);
                }

            
            {
                this$0 = ActivatePlasticCardActivity.this;
                super();
            }
            });
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putInt("nav-state-key", navState.ordinal());
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }

    final void transitionNavState(ActivationFragment.NavState navstate)
    {
        if (navState == navstate)
        {
            return;
        }
        navState = navstate;
        static final class _cls2
        {

            static final int $SwitchMap$com$google$android$apps$wallet$plastic$ActivationFragment$NavState[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$plastic$ActivationFragment$NavState = new int[ActivationFragment.NavState.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$ActivationFragment$NavState[ActivationFragment.NavState.ACTIVATE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$ActivationFragment$NavState[ActivationFragment.NavState.HOW_IT_WORKS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$ActivationFragment$NavState[ActivationFragment.NavState.CONGRATULATIONS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2..SwitchMap.com.google.android.apps.wallet.plastic.ActivationFragment.NavState[navstate.ordinal()])
        {
        default:
            throw new IllegalStateException("Unexpected");

        case 1: // '\001'
            userEventLogger.log(22, 96);
            transitionToFragment((ActivationFragment)activatePlasticCardFragmentProvider.get());
            return;

        case 2: // '\002'
            transitionToFragment((ActivationFragment)howItWorksFragmentProvider.get());
            return;

        case 3: // '\003'
            userEventLogger.log(22, 99);
            break;
        }
        transitionToFragment((ActivationFragment)congratulationsFragmentProvider.get());
    }
}
