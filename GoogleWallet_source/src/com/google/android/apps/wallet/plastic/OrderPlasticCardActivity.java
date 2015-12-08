// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.google.android.apps.wallet.address.FetchAddressAction;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.fragment.Fragments;
import com.google.android.apps.wallet.kyc.api.KycStatusPublisher;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.storedvalue.api.StoredValueClient;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Objects;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            OrderPlasticCardUiModel, EnterPlasticCardShippingAddressFragment, ConfirmPlasticCardOrderFragment, SelectShippingAddressFragment

public class OrderPlasticCardActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/plastic/OrderPlasticCardActivity.getSimpleName();
    private static boolean hasFetchedAddresses = false;
    Provider confirmAddressFragmentProvider;
    Provider enterAddressFragmentProvider;
    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    KycStatusPublisher kycStatusPublisher;
    Provider orderPlasticCardKycFragmentProvider;
    RpcCaller rpcCaller;
    StoredValueClient storedValueClient;
    OrderPlasticCardUiModel uiModel;
    UserEventLogger userEventLogger;

    public OrderPlasticCardActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private static OrderPlasticCardUiModel createModel(Bundle bundle)
    {
        if (bundle != null && bundle.containsKey("plastic_card_model_extra"))
        {
            return (OrderPlasticCardUiModel)bundle.getParcelable("plastic_card_model_extra");
        } else
        {
            return new OrderPlasticCardUiModel();
        }
    }

    private void executeFragmentTransition(Fragment fragment)
    {
        getSupportFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer, fragment, Fragments.getTransactionTag(fragment.getClass())).commit();
    }

    private void handleAddressLoaded()
    {
        fullScreenProgressSpinnerManager.hide();
        if (uiModel.getAddresses().size() > 0)
        {
            uiModel.setSelectedAddressIndex(0);
            Fragment fragment;
            if (!uiModel.isSelectedAddressValid(getResources()))
            {
                fragment = (Fragment)enterAddressFragmentProvider.get();
            } else
            {
                fragment = (Fragment)confirmAddressFragmentProvider.get();
            }
            executeFragmentTransition(fragment);
            return;
        } else
        {
            AlertDialogFragment.newBuilder().setTitle(getString(com.google.android.apps.walletnfcrel.R.string.order_plastic_card_load_address_error_title)).setMessage(getString(com.google.android.apps.walletnfcrel.R.string.order_plastic_card_load_address_error_text)).setFinishActivityOnClick().setCancelable(false).build().show(getSupportFragmentManager());
            return;
        }
    }

    private void loadAddresses()
    {
        hasFetchedAddresses = true;
        userEventLogger.log(21, 88);
        fullScreenProgressSpinnerManager.showImmediately();
        executeAction("load_address", new FetchAddressAction(rpcCaller));
    }

    private void onKycStatusEvent(com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent kycstatusevent)
    {
        if (Objects.equal(kycstatusevent.getStatus(), Integer.valueOf(1)) && !hasFetchedAddresses)
        {
            fullScreenProgressSpinnerManager.showImmediately();
            loadAddresses();
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        if (!kycStatusPublisher.hasPassedKyc())
        {
            executeFragmentTransition((Fragment)orderPlasticCardKycFragmentProvider.get());
        } else
        if (bundle == null)
        {
            loadAddresses();
            return;
        }
    }

    public final void doOnResume()
    {
        if (isActionRunning("load_address"))
        {
            fullScreenProgressSpinnerManager.showImmediately();
        }
        eventBus.register(this);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (!super.onActionFailure(s, callable, exception))
        {
            if ("get_stored_value".equals(s))
            {
                WLog.e(TAG, "Error getting/creating SV account", exception);
                CallErrorDialogs.createBuilderWithGenericTitle(exception, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setFinishActivityOnClick().setFinishActivityOnDismiss().build().show(getSupportFragmentManager(), "error_dialog");
            }
            handleAddressLoaded();
        }
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        if ("load_address".equals(s))
        {
            uiModel.setAddresses((List)obj);
            executeAction("get_stored_value", new Callable() {

                final OrderPlasticCardActivity this$0;

                private com.google.wallet.proto.api.NanoWalletInstrument.GetStoredValueResponse call()
                    throws Exception
                {
                    return storedValueClient.getStoredValue(new com.google.wallet.proto.api.NanoWalletInstrument.GetStoredValueRequest());
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = OrderPlasticCardActivity.this;
                super();
            }
            });
            if (!isActionRunning("load_address"))
            {
                handleAddressLoaded();
            }
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            super.onActivityResult(i, j, intent);
            if (i == 1)
            {
                if (j != -1)
                {
                    break label0;
                }
                loadAddresses();
            }
            return;
        }
        finish();
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if (Fragments.hasTagForClass(fragment, com/google/android/apps/wallet/plastic/EnterPlasticCardShippingAddressFragment))
        {
            ((EnterPlasticCardShippingAddressFragment)fragment).setModel(uiModel);
        } else
        {
            if (Fragments.hasTagForClass(fragment, com/google/android/apps/wallet/plastic/ConfirmPlasticCardOrderFragment))
            {
                ((ConfirmPlasticCardOrderFragment)fragment).setModel(uiModel);
                return;
            }
            if (Fragments.hasTagForClass(fragment, com/google/android/apps/wallet/plastic/SelectShippingAddressFragment))
            {
                ((SelectShippingAddressFragment)fragment).setModel(uiModel);
                return;
            }
        }
    }

    protected final void onBeforeCreate(Bundle bundle)
    {
        uiModel = createModel(bundle);
    }

    protected void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("plastic_card_model_extra", uiModel);
    }

    protected final void onUpPressed()
    {
        finish();
    }

}
