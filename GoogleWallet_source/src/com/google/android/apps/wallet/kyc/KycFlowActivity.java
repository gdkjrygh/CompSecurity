// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.fragment.Fragments;
import com.google.android.apps.wallet.kyc.api.KycApi;
import com.google.android.apps.wallet.kyc.api.KycClient;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.refresh.RequestRefreshEvent;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.concurrent.Callable;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycUiModel, KycTosDialogFragment

public class KycFlowActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/kyc/KycFlowActivity.getName();
    AnalyticsUtil analyticsUtil;
    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    Handler handler;
    KycClient kycClient;
    private com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse kycDataResponse;
    private com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse kycStatusResponse;
    Provider kycTosDialogFragmentProvider;

    public KycFlowActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void acceptTos()
    {
        analyticsUtil.sendScreen("Kyc Two Step ECP", new AnalyticsCustomDimension[0]);
        executeAction("accept_tos", createAcceptTosAction());
    }

    private Callable createAcceptTosAction()
    {
        return new Callable() {

            final KycFlowActivity this$0;

            private com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosResponse call()
                throws Exception
            {
                com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosRequest acceptkyctosrequest = new com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosRequest();
                acceptkyctosrequest.acceptedTosId = (new String[] {
                    kycDataResponse.walletLegalDocument.documentId, kycDataResponse.esignLegalDocument.documentId
                });
                return kycClient.acceptKycTos(acceptkyctosrequest);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = KycFlowActivity.this;
                super();
            }
        };
    }

    private static Intent createManualKycActivity(Activity activity)
    {
        return InternalIntents.forClass(activity, "com.google.android.apps.wallet.kyc.KycActivity").putExtras(activity.getIntent());
    }

    private void dispatch()
    {
        analyticsUtil.sendKycState("KycStart", AnalyticsUtil.getCustomDimensions(kycDataResponse.gaCustomDimensions));
        Object obj = kycStatusResponse.kycStatus.status;
        if (((Integer) (obj)).intValue() == 1)
        {
            kycPassed();
            return;
        }
        if (((Integer) (obj)).intValue() == 3 && !kycStatusResponse.kycStatus.canPerformDocumentVerification.booleanValue())
        {
            kycReferred();
            return;
        }
        if (((Integer) (obj)).intValue() == 3 || ((Integer) (obj)).intValue() == 2)
        {
            kycFailed();
            return;
        }
        if (kycDataResponse.esignLegalDocument != null && kycDataResponse.walletLegalDocument != null)
        {
            showTosDialog();
            return;
        }
        if (kycStatusResponse.kycStatus.canPerformDocumentVerification.booleanValue() && (((Integer) (obj)).intValue() == 0 || ((Integer) (obj)).intValue() == 4))
        {
            startActivityForResult(KycApi.createKycCaptureIdActivity(this), 0);
            return;
        }
        String s = TAG;
        obj = String.valueOf(kycStatusResponse.toString());
        if (((String) (obj)).length() != 0)
        {
            obj = "Unexpected state ".concat(((String) (obj)));
        } else
        {
            obj = new String("Unexpected state ");
        }
        WLog.e(s, ((String) (obj)));
        showSomethingWentWrongError();
    }

    private void fallbackToManualKYC()
    {
        startActivityForResult(createManualKycActivity(this), 0);
    }

    private void handleAcceptTosSuccess(com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosResponse acceptkyctosresponse)
    {
        if (acceptkyctosresponse.callError != null)
        {
            acceptkyctosresponse = CallErrorDialogs.createBuilderWithGenericTitle(acceptkyctosresponse.callError, com.google.android.apps.walletnfcrel.R.string.kyc_error_accept_tos).build();
            acceptkyctosresponse.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final KycFlowActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    finish();
                }

            
            {
                this$0 = KycFlowActivity.this;
                super();
            }
            });
            acceptkyctosresponse.show(getSupportFragmentManager());
            return;
        } else
        {
            refresh();
            return;
        }
    }

    private void kycFailed()
    {
        KycUiModel kycuimodel = new KycUiModel();
        kycuimodel.setCurrentNavState(KycNavListener.NavState.FAILED);
        Intent intent = createManualKycActivity(this);
        intent.putExtra("ui_model", kycuimodel);
        startActivityForResult(intent, 0);
    }

    private void kycPassed()
    {
        eventBus.post(new RequestRefreshEvent());
        setResult(-1);
        finish();
    }

    private void kycReferred()
    {
        KycUiModel kycuimodel = new KycUiModel();
        kycuimodel.setCurrentNavState(KycNavListener.NavState.REFERRED);
        Intent intent = createManualKycActivity(this);
        intent.putExtra("ui_model", kycuimodel);
        startActivityForResult(intent, 0);
    }

    private void refresh()
    {
        kycDataResponse = null;
        kycStatusResponse = null;
        executeAction("CHECK_KYC_STATE", new Callable() {

            final KycFlowActivity this$0;

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
                this$0 = KycFlowActivity.this;
                super();
            }
        });
        executeAction("CHECK_KYC_DATA", new Callable() {

            final KycFlowActivity this$0;

            private com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse call()
                throws Exception
            {
                return kycClient.getKycData();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = KycFlowActivity.this;
                super();
            }
        });
    }

    private void showSomethingWentWrongError()
    {
        fullScreenProgressSpinnerManager.hide();
        AlertDialogFragment.newBuilder().setMessage(getString(com.google.android.apps.walletnfcrel.R.string.kyc_error_please_try_again)).setFinishActivityOnClick().setCancelable(false).build().show(getSupportFragmentManager());
    }

    private void showTosDialog()
    {
        KycTosDialogFragment kyctosdialogfragment = (KycTosDialogFragment)kycTosDialogFragmentProvider.get();
        kyctosdialogfragment.setLegalDocuments(kycDataResponse.walletLegalDocument, kycDataResponse.esignLegalDocument);
        kyctosdialogfragment.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

            final KycFlowActivity this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                default:
                    return;

                case -1: 
                    acceptTos();
                    return;

                case -2: 
                    setResult(0);
                    finish();
                    return;
                }
            }

            
            {
                this$0 = KycFlowActivity.this;
                super();
            }
        });
        kyctosdialogfragment.show(getSupportFragmentManager(), Fragments.getTransactionTag(com/google/android/apps/wallet/kyc/KycTosDialogFragment));
    }

    protected final void doOnCreate(Bundle bundle)
    {
label0:
        {
            super.doOnCreate(bundle);
            setContentView(com.google.android.apps.walletnfcrel.R.layout.generic_progress_activity);
            getSupportActionBar().hide();
            fullScreenProgressSpinnerManager.show();
            if (bundle == null)
            {
                if (!getIntent().getBooleanExtra("KYC_MANUAL_FLOW", false))
                {
                    break label0;
                }
                fallbackToManualKYC();
            }
            return;
        }
        refresh();
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
            showSomethingWentWrongError();
            return true;
        }
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        if ("accept_tos".equals(s))
        {
            handleAcceptTosSuccess((com.google.wallet.proto.api.NanoWalletKyc.AcceptKycTosResponse)obj);
        } else
        {
            if ("CHECK_KYC_DATA".equals(s))
            {
                s = (com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse)obj;
                if (((com.google.wallet.proto.api.NanoWalletKyc.GetKycDataResponse) (s)).callError != null)
                {
                    showSomethingWentWrongError();
                } else
                {
                    kycDataResponse = s;
                }
            } else
            if ("CHECK_KYC_STATE".equals(s))
            {
                s = (com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse)obj;
                if (((com.google.wallet.proto.api.NanoWalletKyc.GetKycStatusResponse) (s)).callError != null)
                {
                    showSomethingWentWrongError();
                } else
                {
                    kycStatusResponse = s;
                }
            }
            if (kycDataResponse != null && kycStatusResponse != null)
            {
                dispatch();
                return;
            }
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        default:
            WLog.e(TAG, (new StringBuilder(34)).append("Unexpected result code ").append(j).toString());
            finish();
            return;

        case 16: // '\020'
            startActivityForResult(KycApi.createKycCaptureIdActivity(this), 0);
            return;

        case 11: // '\013'
            startActivityForResult(KycApi.createKycSsnActivityIntent(this, intent.getByteArrayExtra("CLIENT_ENCRYPTED_DATA")), 0);
            return;

        case 12: // '\f'
            fallbackToManualKYC();
            return;

        case 10: // '\n'
            finish();
            return;

        case 14: // '\016'
            startActivityForResult(KycApi.createKycFullSsnActivityIntent(this), 0);
            return;

        case 13: // '\r'
            startActivityForResult(KycApi.createKycVerifyingIdentityActivityIntent(this), 0);
            return;

        case 15: // '\017'
            kycPassed();
            return;

        case 20: // '\024'
            setResult(0);
            finish();
            return;

        case 18: // '\022'
            kycReferred();
            return;

        case 19: // '\023'
            kycFailed();
            return;

        case 17: // '\021'
            startActivityForResult(KycApi.createKycCaptureIdActivity(this), 0);
            return;

        case 0: // '\0'
            setResult(0);
            finish();
            return;
        }
    }

    protected final void onUpPressed()
    {
        setResult(0);
        finish();
    }



}
