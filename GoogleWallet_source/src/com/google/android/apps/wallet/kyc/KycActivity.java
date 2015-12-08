// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.fragment.Fragments;
import com.google.android.apps.wallet.kyc.api.KycClient;
import com.google.android.apps.wallet.kyc.api.KycStatusPublisher;
import com.google.android.apps.wallet.kyc.api.KycUserFlow;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcCaller;
import com.google.android.apps.wallet.storedvalue.api.StoredValuePublisher;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycUiModel, FetchKycPrefillDataAction, KycFragmentInterface, KycUserEvent, 
//            KycEnterAddressFragment, KycOowIntroFragment, KycReferredFragment, KycNavListener

public class KycActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/kyc/KycActivity.getSimpleName();
    AnalyticsUtil analyticsUtil;
    private com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse dataResponse;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    KycClient kycClient;
    Provider kycEnterAddressFragmentProvider;
    Provider kycEnterPersonalInfoFragmentProvider;
    Provider kycFailedFragmentProvider;
    Provider kycOowFragment;
    Provider kycOowIntroFragmentProvider;
    Provider kycReferredFragmentProvider;
    KycStatusPublisher kycStatusPublisher;
    KycUiModel model;
    RpcCaller rpcCaller;
    StoredValuePublisher storedValuePublisher;
    UserEventLogger userEventLogger;

    public KycActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        dataResponse = new com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse();
    }

    private Callable createFetchKycStatusAction()
    {
        return new Callable() {

            final KycActivity this$0;

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
                this$0 = KycActivity.this;
                super();
            }
        };
    }

    private KycUiModel createModel(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle = bundle.getParcelable("ui_model");
            if (bundle instanceof KycUiModel)
            {
                return (KycUiModel)bundle;
            }
        }
        bundle = (KycUserFlow)getIntent().getSerializableExtra("user_flow");
        if (bundle == null)
        {
            throw new IllegalArgumentException("missing user flow parameter for KYC activity");
        } else
        {
            KycUiModel kycuimodel = new KycUiModel();
            kycuimodel.setUserFlow(bundle);
            return kycuimodel;
        }
    }

    private void handleFetchKycPrefillDataSuccess(Object aobj[], int i)
    {
        fullScreenProgressSpinnerManager.hide();
        com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse getkycdataresponse = (com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse)aobj[0];
        dataResponse = getkycdataresponse;
        aobj = (List)aobj[1];
        if (getkycdataresponse.callError != null)
        {
            CallErrorDialogs.createBuilderWithGenericTitle(getkycdataresponse.callError, com.google.android.apps.walletnfcrel.R.string.kyc_error_please_try_again).setFinishActivityOnClick().setCancelable(false).build().show(getSupportFragmentManager());
            return;
        }
        model.populateModel(getkycdataresponse, ((List) (aobj)));
        if (i == 0)
        {
            transitionNavState(KycNavListener.NavState.ENTER_PERSONAL_INFO);
            return;
        }
        if (i == 4)
        {
            transitionNavState(KycNavListener.NavState.ENTER_PERSONAL_INFO_RETRY);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder(34)).append("unhandled kyc status = ").append(i).toString());
        }
    }

    private void handleFetchKycStatusSuccess(com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse getkycstatusresponse)
    {
        int i = 0;
        boolean flag = false;
        if (getkycstatusresponse.kycStatus != null)
        {
            i = getkycstatusresponse.kycStatus.status.intValue();
            flag = getkycstatusresponse.kycStatus.canPerformDocumentVerification.booleanValue();
        }
        if (i != 0 && i != 4)
        {
            fullScreenProgressSpinnerManager.hide();
        }
        switch (i)
        {
        default:
            WLog.efmt(TAG, "unknown KYC status %s", new Object[] {
                Integer.valueOf(i)
            });
            finish();
            return;

        case 0: // '\0'
        case 4: // '\004'
            executeAction("fetch_kyc_data", new FetchKycPrefillDataAction(kycClient, rpcCaller, i));
            return;

        case 2: // '\002'
            transitionNavState(KycNavListener.NavState.FAILED);
            return;

        case 3: // '\003'
            if (flag)
            {
                transitionNavState(KycNavListener.NavState.FAILED);
                return;
            } else
            {
                transitionNavState(KycNavListener.NavState.REFERRED);
                return;
            }

        case 1: // '\001'
            transitionNavState(KycNavListener.NavState.PASSED);
            return;
        }
    }

    private void showErrorDialog()
    {
        AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.kyc_error_please_try_again)).setFinishActivityOnClick().setCancelable(false).build().show(getSupportFragmentManager());
    }

    private void startKycFlow()
    {
        fullScreenProgressSpinnerManager.showImmediately();
        executeAction("fetch_kyc_status", createFetchKycStatusAction());
    }

    private void transitionToFragment(Fragment fragment)
    {
        getSupportFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer, fragment, Fragments.getTransactionTag(fragment.getClass())).commit();
    }

    protected final void doOnCreate(Bundle bundle)
    {
        getWindow().addFlags(8192);
        setTitle(com.google.android.apps.walletnfcrel.R.string.verify_your_identity);
        if (bundle == null)
        {
            startKycFlow();
        }
    }

    public final void doOnResume()
    {
        if (isActionRunning("fetch_kyc_status") || isActionRunning("fetch_kyc_data"))
        {
            fullScreenProgressSpinnerManager.showImmediately();
        }
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
            fullScreenProgressSpinnerManager.hide();
            showErrorDialog();
            return true;
        }
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        if ("fetch_kyc_status".equals(s))
        {
            handleFetchKycStatusSuccess((com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse)obj);
        } else
        if ("fetch_kyc_data".equals(s))
        {
            handleFetchKycPrefillDataSuccess((Object[])obj, ((FetchKycPrefillDataAction)callable).getKycStatus());
            return;
        }
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if (fragment instanceof KycFragmentInterface)
        {
            fragment = (KycFragmentInterface)fragment;
            fragment.setKycUiModel(model);
            fragment.setKycNavListener(new KycNavListener() {

                final KycActivity this$0;

                public final void onRequestNav(KycNavListener.NavState navstate)
                {
                    transitionNavState(navstate);
                }

            
            {
                this$0 = KycActivity.this;
                super();
            }
            });
        }
    }

    protected final void onBeforeCreate(Bundle bundle)
    {
        model = createModel(bundle);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("ui_model", model);
    }

    protected final void onUpPressed()
    {
        finish();
    }

    final void transitionNavState(KycNavListener.NavState navstate)
    {
        if (model.getCurrentNavState() != navstate) goto _L2; else goto _L1
_L1:
        return;
_L2:
        setTitle(com.google.android.apps.walletnfcrel.R.string.verify_your_identity);
        model.setPreviousNavState(model.getCurrentNavState());
        model.setCurrentNavState(navstate);
        Object obj = model.getKycUserEvent();
        static final class _cls3
        {

            static final int $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState = new int[KycNavListener.NavState.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[KycNavListener.NavState.ENTER_PERSONAL_INFO.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[KycNavListener.NavState.ENTER_PERSONAL_INFO_RETRY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[KycNavListener.NavState.ENTER_ADDRESS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[KycNavListener.NavState.OOW_INTRO.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[KycNavListener.NavState.ENTER_OOW.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[KycNavListener.NavState.PASSED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[KycNavListener.NavState.REFERRED.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[KycNavListener.NavState.FAILED.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.google.android.apps.wallet.kyc.KycNavListener.NavState[navstate.ordinal()])
        {
        default:
            navstate = String.valueOf(navstate);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(navstate).length() + 18)).append("Unknown nav state:").append(navstate).toString());

        case 1: // '\001'
            analyticsUtil.sendKycState("KycStart", AnalyticsUtil.getCustomDimensions(dataResponse.gaCustomDimensions));
            userEventLogger.log(((KycUserEvent) (obj)).getUserEventContextType(), ((KycUserEvent) (obj)).getStartedUserEventType());
            model.setIsRetryMode(false);
            transitionToFragment((Fragment)kycEnterPersonalInfoFragmentProvider.get());
            return;

        case 2: // '\002'
            if (model.getPreviousNavState() != KycNavListener.NavState.ENTER_PERSONAL_INFO)
            {
                model.setIsRetryMode(true);
                analyticsUtil.sendKycState("KycStart", AnalyticsUtil.getCustomDimensions(dataResponse.gaCustomDimensions));
                userEventLogger.log(((KycUserEvent) (obj)).getUserEventContextType(), ((KycUserEvent) (obj)).getStartedUserEventType());
                transitionToFragment((Fragment)kycEnterPersonalInfoFragmentProvider.get());
                return;
            }
            break;

        case 3: // '\003'
            navstate = (KycEnterAddressFragment)kycEnterAddressFragmentProvider.get();
            obj = new Bundle();
            ((Bundle) (obj)).putString("KYC_COUNTRY", model.getAddress().countryCode);
            navstate.setArguments(((Bundle) (obj)));
            transitionToFragment(navstate);
            return;

        case 4: // '\004'
            analyticsUtil.sendKycState("KycOowStart", AnalyticsUtil.getCustomDimensions(dataResponse.gaCustomDimensions));
            userEventLogger.log(((KycUserEvent) (obj)).getUserEventContextType(), ((KycUserEvent) (obj)).getStartedOowUserEventType());
            model.setOowQuizStartTimeMillis(SystemClock.elapsedRealtime());
            transitionToFragment((KycOowIntroFragment)kycOowIntroFragmentProvider.get());
            return;

        case 5: // '\005'
            transitionToFragment((Fragment)kycOowFragment.get());
            return;

        case 6: // '\006'
            if (model.getPreviousNavState() != KycNavListener.NavState.UNINITIALIZED)
            {
                analyticsUtil.sendKycState("KycSuccess", AnalyticsUtil.getCustomDimensions(dataResponse.gaCustomDimensions));
                userEventLogger.log(((KycUserEvent) (obj)).getUserEventContextType(), ((KycUserEvent) (obj)).getSuccessUserEventType());
            }
            storedValuePublisher.generateAndPostEvent();
            setResult(15);
            finish();
            return;

        case 7: // '\007'
            if (model.getPreviousNavState() != KycNavListener.NavState.UNINITIALIZED)
            {
                analyticsUtil.sendKycState("KycFail", AnalyticsUtil.getCustomDimensions(dataResponse.gaCustomDimensions));
                userEventLogger.log(((KycUserEvent) (obj)).getUserEventContextType(), ((KycUserEvent) (obj)).getFailureUserEventType());
            }
            transitionToFragment((KycReferredFragment)kycReferredFragmentProvider.get());
            return;

        case 8: // '\b'
            if (model.getPreviousNavState() != KycNavListener.NavState.UNINITIALIZED)
            {
                analyticsUtil.sendKycState("KycFail", AnalyticsUtil.getCustomDimensions(dataResponse.gaCustomDimensions));
                userEventLogger.log(((KycUserEvent) (obj)).getUserEventContextType(), ((KycUserEvent) (obj)).getFailureUserEventType());
            }
            transitionToFragment((Fragment)kycFailedFragmentProvider.get());
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

}
