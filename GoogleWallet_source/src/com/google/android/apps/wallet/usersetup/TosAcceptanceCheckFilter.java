// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.QuitIntent;
import com.google.android.apps.wallet.filter.ActivityFilter;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.NetworkInformationProvider;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.usersetup.service.SetupWalletServiceClient;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Optional;
import dagger.Lazy;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            AcceptTosDialogFragment, NetworkAccessPrompter, TosAcceptanceOracle

public class TosAcceptanceCheckFilter extends ActivityFilter
{
    static final class AcceptTosResult extends Enum
    {

        private static final AcceptTosResult $VALUES[];
        public static final AcceptTosResult ACCEPTANCE_FAILED;
        public static final AcceptTosResult NO_NETWORK;
        public static final AcceptTosResult SUCCESS;
        private final int detailsId;
        private final int titleId;

        public static AcceptTosResult valueOf(String s)
        {
            return (AcceptTosResult)Enum.valueOf(com/google/android/apps/wallet/usersetup/TosAcceptanceCheckFilter$AcceptTosResult, s);
        }

        public static AcceptTosResult[] values()
        {
            return (AcceptTosResult[])$VALUES.clone();
        }

        public final int getDetailsId()
        {
            return detailsId;
        }

        public final int getTitleId()
        {
            return titleId;
        }

        static 
        {
            SUCCESS = new AcceptTosResult("SUCCESS", 0, 0, 0);
            NO_NETWORK = new AcceptTosResult("NO_NETWORK", 1, com.google.android.apps.walletnfcrel.R.string.tos_accept_server_error_title, com.google.android.apps.walletnfcrel.R.string.error_dialog_no_network_access);
            ACCEPTANCE_FAILED = new AcceptTosResult("ACCEPTANCE_FAILED", 2, com.google.android.apps.walletnfcrel.R.string.tos_accept_server_error_title, com.google.android.apps.walletnfcrel.R.string.tos_accept_server_error_detail);
            $VALUES = (new AcceptTosResult[] {
                SUCCESS, NO_NETWORK, ACCEPTANCE_FAILED
            });
        }

        private AcceptTosResult(String s, int i, int j, int k)
        {
            super(s, i);
            titleId = j;
            detailsId = k;
        }
    }


    private static final String TAG = com/google/android/apps/wallet/usersetup/TosAcceptanceCheckFilter.getSimpleName();
    private final ActionExecutor actionExecutor;
    private final FragmentActivity activity;
    private final AnalyticsUtil analyticsUtil;
    private final FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument latestLegalDocument;
    private final NetworkAccessPrompter networkAccessPrompter;
    private final NetworkInformationProvider networkInformationProvider;
    private final SetupWalletServiceClient setupWalletServiceClient;
    private final Lazy tosAcceptanceOracleLazy;
    private final android.content.DialogInterface.OnClickListener tosOnClickListener = new android.content.DialogInterface.OnClickListener() {

        final TosAcceptanceCheckFilter this$0;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            i;
            JVM INSTR tableswitch -2 -1: default 24
        //                       -2 68
        //                       -1 25;
               goto _L1 _L2 _L3
_L1:
            return;
_L3:
            analyticsUtil.sendButtonTap("AcceptTermsOfService", new AnalyticsCustomDimension[0]);
            if (networkAccessPrompter.checkIfNetworkAvailableAndPromptIfNot(AcceptTosResult.NO_NETWORK.getTitleId()))
            {
                runAcceptTos();
                return;
            }
              goto _L1
_L2:
            activity.startActivity(QuitIntent.create());
            return;
        }

            
            {
                this$0 = TosAcceptanceCheckFilter.this;
                super();
            }
    };

    TosAcceptanceCheckFilter(FragmentActivity fragmentactivity, Lazy lazy, ActionExecutor actionexecutor, SetupWalletServiceClient setupwalletserviceclient, NetworkInformationProvider networkinformationprovider, NetworkAccessPrompter networkaccessprompter, FullScreenProgressSpinnerManager fullscreenprogressspinnermanager, 
            AnalyticsUtil analyticsutil)
    {
        activity = fragmentactivity;
        tosAcceptanceOracleLazy = lazy;
        actionExecutor = actionexecutor;
        setupWalletServiceClient = setupwalletserviceclient;
        networkInformationProvider = networkinformationprovider;
        networkAccessPrompter = networkaccessprompter;
        fullScreenProgressSpinnerManager = fullscreenprogressspinnermanager;
        analyticsUtil = analyticsutil;
    }

    private AcceptTosResult acceptUpdatedTos()
    {
        Object obj = new com.google.wallet.proto.api.NanoWalletSetup.AcceptTosRequest();
        obj.acceptedTosId = latestLegalDocument.documentId;
        try
        {
            obj = setupWalletServiceClient.acceptTos(((com.google.wallet.proto.api.NanoWalletSetup.AcceptTosRequest) (obj)));
            String s = TAG;
            obj = String.valueOf(((com.google.wallet.proto.api.NanoWalletSetup.AcceptTosResponse) (obj)).acceptedTosId);
            if (((String) (obj)).length() != 0)
            {
                obj = "TOS accepted on server: ".concat(((String) (obj)));
            } else
            {
                obj = new String("TOS accepted on server: ");
            }
            WLog.i(s, ((String) (obj)));
            return AcceptTosResult.SUCCESS;
        }
        catch (RpcException rpcexception)
        {
            String s1 = TAG;
            String s2 = String.valueOf(rpcexception);
            WLog.e(s1, (new StringBuilder(String.valueOf(s2).length() + 33)).append("TOS acceptance failed on server: ").append(s2).toString(), rpcexception);
            return AcceptTosResult.ACCEPTANCE_FAILED;
        }
    }

    private AcceptTosDialogFragment getAcceptTosDialogIfShowing()
    {
        return (AcceptTosDialogFragment)activity.getSupportFragmentManager().findFragmentByTag("accept_tos");
    }

    private AlertDialogFragment getTryAgainDialogIfShowing()
    {
        return (AlertDialogFragment)activity.getSupportFragmentManager().findFragmentByTag("tos_try_again");
    }

    private void runAcceptTos()
    {
        WLog.d(TAG, "accepting TOS on server");
        Callable callable = new Callable() {

            final TosAcceptanceCheckFilter this$0;

            private AcceptTosResult call()
                throws Exception
            {
                AcceptTosResult accepttosresult;
                if (!networkInformationProvider.hasNetworkAccess())
                {
                    accepttosresult = AcceptTosResult.NO_NETWORK;
                } else
                {
                    AcceptTosResult accepttosresult1 = acceptUpdatedTos();
                    accepttosresult = accepttosresult1;
                    if (accepttosresult1 == AcceptTosResult.SUCCESS)
                    {
                        ((TosAcceptanceOracle)tosAcceptanceOracleLazy.get()).setLocalAcceptedTosState(latestLegalDocument);
                        return accepttosresult1;
                    }
                }
                return accepttosresult;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = TosAcceptanceCheckFilter.this;
                super();
            }
        };
        AsyncCallback asynccallback = new AsyncCallback() {

            final TosAcceptanceCheckFilter this$0;

            private void onSuccess(AcceptTosResult accepttosresult)
            {
                fullScreenProgressSpinnerManager.hide();
                if (accepttosresult == AcceptTosResult.SUCCESS)
                {
                    return;
                } else
                {
                    accepttosresult = AlertDialogFragment.newBuilder().setTitle(accepttosresult.getTitleId()).setMessage(accepttosresult.getDetailsId()).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.dialog_option_try_again).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.dialog_option_try_later).setCancelable(false).build();
                    accepttosresult.setOnClickListener(tosOnClickListener);
                    accepttosresult.show(activity.getSupportFragmentManager(), "tos_try_again");
                    return;
                }
            }

            public final void onFailure(Exception exception)
            {
                fullScreenProgressSpinnerManager.hide();
                activity.startActivity(QuitIntent.create());
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((AcceptTosResult)obj);
            }

            
            {
                this$0 = TosAcceptanceCheckFilter.this;
                super();
            }
        };
        fullScreenProgressSpinnerManager.show();
        actionExecutor.executeAction(callable, asynccallback);
    }

    private void showTos(Optional optional)
    {
label0:
        {
            if (optional.isPresent())
            {
                latestLegalDocument = (com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)optional.get();
                if (getTryAgainDialogIfShowing() == null)
                {
                    break label0;
                }
            }
            return;
        }
        optional = getAcceptTosDialogIfShowing();
        if (optional == null)
        {
            optional = new AcceptTosDialogFragment();
            optional.setLatestLegalDocument(latestLegalDocument);
            optional.setOnClickListener(tosOnClickListener);
            WLog.ifmt(TAG, "Showing tos acceptance dialog for document ID: %s", new Object[] {
                latestLegalDocument.documentId
            });
            optional.show(activity.getSupportFragmentManager(), "accept_tos");
            return;
        } else
        {
            optional.setLatestLegalDocument(latestLegalDocument);
            return;
        }
    }

    protected final void onPause()
    {
        super.onPause();
        actionExecutor.cancelAll();
    }

    protected final void onResume()
    {
        Object obj = getAcceptTosDialogIfShowing();
        if (obj != null)
        {
            ((AcceptTosDialogFragment) (obj)).setOnClickListener(tosOnClickListener);
        }
        obj = getTryAgainDialogIfShowing();
        if (obj != null)
        {
            ((AlertDialogFragment) (obj)).setOnClickListener(tosOnClickListener);
        }
        actionExecutor.executeAction(new Callable() {

            final TosAcceptanceCheckFilter this$0;

            private Optional call()
                throws Exception
            {
                return ((TosAcceptanceOracle)tosAcceptanceOracleLazy.get()).lookupLegalDocumentToAccept();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = TosAcceptanceCheckFilter.this;
                super();
            }
        }, new AsyncCallback() {

            final TosAcceptanceCheckFilter this$0;

            private void onSuccess(Optional optional)
            {
                showTos(optional);
            }

            public final void onFailure(Exception exception)
            {
                activity.startActivity(QuitIntent.create());
            }

            public final volatile void onSuccess(Object obj1)
            {
                onSuccess((Optional)obj1);
            }

            
            {
                this$0 = TosAcceptanceCheckFilter.this;
                super();
            }
        });
    }












}
