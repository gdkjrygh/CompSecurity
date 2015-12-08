// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.rpcrejection;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.kyc.api.KycApi;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.pin.PinTokenResponseProcessor;
import com.google.android.apps.wallet.reset.api.ResetApi;
import com.google.android.apps.wallet.restrictioncheck.WalletRestrictionCheckFailActivity;
import com.google.android.apps.wallet.rpc.ResponseMetadataProcessor;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.user.UserInfoManager;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.List;
import java.util.concurrent.Callable;

public class RpcRejectionActivity extends WalletActivity
{
    static final class DownloadUserInfoAction
        implements Callable
    {

        private final UserInfoManager mUserInfoManager;

        private Void call()
            throws RpcException
        {
            mUserInfoManager.downloadAndPersistUserInfo();
            return null;
        }

        public final volatile Object call()
            throws Exception
        {
            return call();
        }

        public DownloadUserInfoAction(UserInfoManager userinfomanager)
        {
            mUserInfoManager = userinfomanager;
        }
    }


    private static final String TAG = com/google/android/apps/wallet/rpcrejection/RpcRejectionActivity.getSimpleName();
    ActionExecutor actionExecutor;
    String currentAccountName;
    EventBus eventBus;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    KycApi kycApi;
    private Optional mCurrentlyRunningDownloadAction;
    PinTokenResponseProcessor mPinTokenRpcProcessor;
    private com.google.wallet.proto.NanoWalletTransport.ResponseMetadata mResponseMetadata;
    ResponseMetadataProcessor mResponseMetadataProcessor;
    private final AsyncCallback mUserFedbackDownloadedCallback = new AsyncCallback() {

        final RpcRejectionActivity this$0;

        private void onSuccess(Void void1)
        {
            fullScreenProgressSpinnerManager.hide();
            startActivity(uriRegistry.createIntent(2, new Object[0]));
            WLog.i(RpcRejectionActivity.TAG, "Downloaded new UserInfo for latest TOS");
            mResponseMetadataProcessor.onMetadataProcessed();
            mCurrentlyRunningDownloadAction = Optional.absent();
            finish();
        }

        public final void onFailure(Exception exception)
        {
            WLog.i(RpcRejectionActivity.TAG, "Downloaded of UserInfo for latest TOS failed.", exception);
            fullScreenProgressSpinnerManager.hide();
            CallErrorDialogs.createBuilder(exception, com.google.android.apps.walletnfcrel.R.string.rpc_rejection_tos_download_failed_title, com.google.android.apps.walletnfcrel.R.string.rpc_rejection_tos_download_failed_content).build().show(getSupportFragmentManager());
            mResponseMetadataProcessor.onMetadataProcessed();
            mCurrentlyRunningDownloadAction = Optional.absent();
        }

        public final volatile void onSuccess(Object obj)
        {
            onSuccess((Void)obj);
        }

            
            {
                this$0 = RpcRejectionActivity.this;
                super();
            }
    };
    UserInfoManager mUserInfoManager;
    UriRegistry uriRegistry;

    public RpcRejectionActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        mCurrentlyRunningDownloadAction = Optional.absent();
    }

    public static Intent createIntent(Context context, com.google.wallet.proto.NanoWalletTransport.ResponseMetadata responsemetadata)
    {
        context = InternalIntents.forClass(context, com/google/android/apps/wallet/rpcrejection/RpcRejectionActivity);
        context.putExtra("RESPONSE_METADATA_INTENT_EXTRA", MessageNano.toByteArray(responsemetadata));
        return context;
    }

    private void handleCoppaViolation()
    {
        AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.coppa_violation_dialog_title).setMessage(com.google.android.apps.walletnfcrel.R.string.coppa_violation_dialog_message).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_learn_more).setFinishActivityOnClick().setCancelable(false).build().show(getSupportFragmentManager(), "coppa_violation");
    }

    private void showUiForRpcRejections()
    {
        com.google.wallet.proto.NanoWalletTransport.ResponseMetadata.RejectedRequestInfo arejectedrequestinfo[];
        int i;
        boolean flag;
        int k;
        flag = false;
        arejectedrequestinfo = mResponseMetadata.rejections;
        k = arejectedrequestinfo.length;
        i = 0;
_L11:
        if (i >= k) goto _L2; else goto _L1
_L1:
        com.google.wallet.proto.NanoWalletTransport.ResponseMetadata.RejectedRequestInfo rejectedrequestinfo;
        rejectedrequestinfo = arejectedrequestinfo[i];
        WLog.ifmt(TAG, "RPCv2 ResponseMetdata has rejection: %s", new Object[] {
            rejectedrequestinfo.reason
        });
        Protos.valueWithDefault(rejectedrequestinfo.reason, 0);
        JVM INSTR tableswitch 1 7: default 100
    //                   1 109
    //                   2 183
    //                   3 123
    //                   4 171
    //                   5 193
    //                   6 203
    //                   7 208;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L3:
        i++;
          goto _L11
_L4:
        startService(ResetApi.createResetIntent(this, currentAccountName));
_L12:
        return;
_L6:
        fullScreenProgressSpinnerManager.show();
        mCurrentlyRunningDownloadAction = Optional.of(new DownloadUserInfoAction(mUserInfoManager));
        actionExecutor.executeAction((Callable)mCurrentlyRunningDownloadAction.get(), mUserFedbackDownloadedCallback);
        return;
_L7:
        startActivityForResult(InternalIntents.forClass(this, "com.google.android.apps.wallet.p2p.GenericVerifyYourIdentityActivity"), 0);
        return;
_L5:
        startActivityForResult(WalletRestrictionCheckFailActivity.createIntentForMustUpgradeWallet(this), 0);
        return;
_L8:
        mPinTokenRpcProcessor.process(rejectedrequestinfo, this);
        return;
_L9:
        handleCoppaViolation();
        return;
_L10:
        com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification systemnotification = new com.google.wallet.proto.NanoWalletTransport.SystemNotificationBundle.SystemNotification();
        systemnotification.type = Integer.valueOf(9);
        eventBus.post(systemnotification);
          goto _L3
_L2:
        java.util.ArrayList arraylist = Lists.newArrayList();
        String s = "";
        com.google.wallet.proto.NanoWalletTransport.ResponseMetadata.RejectedRequestInfo arejectedrequestinfo1[] = mResponseMetadata.rejections;
        int l = arejectedrequestinfo1.length;
        for (int j = ((flag) ? 1 : 0); j < l;)
        {
            com.google.wallet.proto.NanoWalletTransport.ResponseMetadata.RejectedRequestInfo rejectedrequestinfo1 = arejectedrequestinfo1[j];
            String s1 = s;
            if (rejectedrequestinfo1.callError != null)
            {
                if (rejectedrequestinfo1.callError.title != null)
                {
                    s = rejectedrequestinfo1.callError.title;
                }
                s1 = s;
                if (rejectedrequestinfo1.callError.content != null)
                {
                    arraylist.add(rejectedrequestinfo1.callError.content);
                    s1 = s;
                }
            }
            j++;
            s = s1;
        }

        String s2;
        if (mResponseMetadata.rejections.length > 1)
        {
            s2 = getString(com.google.android.apps.walletnfcrel.R.string.rpc_rejection_handler_multiple_errors_title);
        } else
        {
            s2 = s;
            if (s.isEmpty())
            {
                s2 = getString(com.google.android.apps.walletnfcrel.R.string.rpc_rejection_handler_untitled_error_title);
            }
        }
        if (getSupportFragmentManager().findFragmentByTag("deny_reasons") == null)
        {
            AlertDialogFragment.newBuilder().setTitle(s2).setMessage(Joiner.on("<br>").join(arraylist)).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok).setCancelable(true).build().show(getSupportFragmentManager(), "deny_reasons");
            return;
        }
          goto _L12
    }

    protected final void doOnCreate(Bundle bundle)
    {
        try
        {
            mResponseMetadata = (com.google.wallet.proto.NanoWalletTransport.ResponseMetadata)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletTransport.ResponseMetadata(), getIntent().getExtras().getByteArray("RESPONSE_METADATA_INTENT_EXTRA"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw new RuntimeException("Can't deserialize ResponseMetadata", bundle);
        }
    }

    protected final void doOnResume()
    {
        showUiForRpcRejections();
    }

    protected final boolean isWidthLimited()
    {
        return true;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        mResponseMetadataProcessor.onMetadataProcessed();
        finish();
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if ("deny_reasons".equals(fragment.getTag()))
        {
            ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final RpcRejectionActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    mResponseMetadataProcessor.onMetadataProcessed();
                    finish();
                }

            
            {
                this$0 = RpcRejectionActivity.this;
                super();
            }
            });
        } else
        if ("coppa_violation".equals(fragment.getTag()))
        {
            ((AlertDialogFragment)fragment).setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                final RpcRejectionActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = UriIntents.create(RpcRejectionActivity.this, HelpUrls.createCoppaViolationHelpUrl());
                    startActivity(dialoginterface);
                }

            
            {
                this$0 = RpcRejectionActivity.this;
                super();
            }
            });
            return;
        }
    }

    protected void onPause()
    {
        if (mCurrentlyRunningDownloadAction.isPresent())
        {
            actionExecutor.cancelAll();
        }
        super.onPause();
    }

    protected final void onUpPressed()
    {
    }




/*
    static Optional access$102(RpcRejectionActivity rpcrejectionactivity, Optional optional)
    {
        rpcrejectionactivity.mCurrentlyRunningDownloadAction = optional;
        return optional;
    }

*/
}
