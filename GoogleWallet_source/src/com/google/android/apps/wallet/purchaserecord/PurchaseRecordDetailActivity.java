// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.p2p.api.Contact;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import com.google.android.apps.wallet.transfer.api.TransferApi;
import com.google.android.apps.wallet.transfer.request.CancelMoneyRequestAction;
import com.google.android.apps.wallet.transfer.request.SendMoneyRequestReminderAction;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordEvent, PurchaseRecordPublisher, PurchaseRecord, PurchaseRecordDetailFragment, 
//            DeclineMoneyRequestDialog, InferredMerchantFeedbackManager, FixedFragmentStatePagerAdapter

public class PurchaseRecordDetailActivity extends WalletActivity
    implements PurchaseRecordDetailFragment.UiActionListener
{
    final class PurchaseRecordAdapter extends FixedFragmentStatePagerAdapter
    {

        private List purchaseRecords;
        final PurchaseRecordDetailActivity this$0;

        public final int getCount()
        {
            return purchaseRecords.size();
        }

        public final Fragment getItem(int i)
        {
            PurchaseRecordDetailFragment purchaserecorddetailfragment = (PurchaseRecordDetailFragment)purchaseRecordDetailFragmentProvider.get();
            purchaserecorddetailfragment.setPurchaseRecord((PurchaseRecord)purchaseRecords.get(i));
            return purchaserecorddetailfragment;
        }

        public final String getItemId(int i)
        {
            Object obj = (PurchaseRecord)purchaseRecords.get(i);
            String s = ((PurchaseRecord) (obj)).getId();
            obj = String.valueOf(((PurchaseRecord) (obj)).getStatus());
            return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(obj).length())).append(s).append("-").append(((String) (obj))).toString();
        }

        public final int getItemPosition(Object obj)
        {
            Object obj1 = (PurchaseRecordDetailFragment)obj;
            obj = ((PurchaseRecordDetailFragment) (obj1)).getPurchaseRecordId();
            obj1 = ((PurchaseRecordDetailFragment) (obj1)).getPurchaseRecordStatus();
            int i = Iterables.indexOf(purchaseRecords, PurchaseRecordDetailActivity.hasPurchaseRecordIdAndStatus(((String) (obj)), ((Integer) (obj1))));
            if (i >= 0)
            {
                return i;
            } else
            {
                return -2;
            }
        }

        final PurchaseRecord getPurchaseRecord(int i)
        {
            return (PurchaseRecord)purchaseRecords.get(i);
        }

        public final void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
        {
            super.setPrimaryItem(viewgroup, i, obj);
            if (i < purchaseRecords.size())
            {
                purchaseRecordId = ((PurchaseRecord)purchaseRecords.get(i)).getId();
            }
        }

        final void setPurchaseRecords(List list)
        {
            purchaseRecords = list;
            notifyDataSetChanged();
        }

        private PurchaseRecordAdapter(FragmentManager fragmentmanager)
        {
            this$0 = PurchaseRecordDetailActivity.this;
            super(fragmentmanager);
            purchaseRecords = Lists.newArrayList();
        }

    }


    private static final String TAG = com/google/android/apps/wallet/purchaserecord/PurchaseRecordDetailActivity.getSimpleName();
    ActionExecutor actionExecutor;
    private PurchaseRecordAdapter adapter;
    AnalyticsUtil analyticsUtil;
    private View errorContainer;
    EventBus eventBus;
    FeatureManager featureManager;
    private boolean firstLoad;
    private PurchaseRecordDetailFragment fragment;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    FundsTransferClient fundsTransferClient;
    final AlertDialogFragment geoMerchantFeedbackDialog;
    InferredMerchantFeedbackManager inferredMerchantFeedbackManager;
    boolean isFromNewIntent;
    Provider purchaseRecordDetailFragmentProvider;
    String purchaseRecordId;
    PurchaseRecordPublisher purchaseRecordPublisher;
    TransferApi transferApi;
    UriRegistry uriRegistry;
    private ViewPager viewPager;

    public PurchaseRecordDetailActivity()
    {
        this(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public PurchaseRecordDetailActivity(int i)
    {
        super(i);
        geoMerchantFeedbackDialog = AlertDialogFragment.newBuilder().setCancelable(true).setTitle(com.google.android.apps.walletnfcrel.R.string.inferred_merchant_feedback_modal_title).setMessage(com.google.android.apps.walletnfcrel.R.string.inferred_merchant_feedback_modal_content).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.inferred_merchant_feedback_confirmation_button).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.nevermind).build();
        firstLoad = true;
        isFromNewIntent = false;
    }

    private void displayPurchaseRecord()
    {
        firstLoad = true;
        fullScreenProgressSpinnerManager.show();
        eventBus.register(this, com/google/android/apps/wallet/purchaserecord/PurchaseRecordEvent, PurchaseRecordPublisher.ALL_PURCHASE_RECORDS, new EventHandler() {

            final PurchaseRecordDetailActivity this$0;

            private int getPurchaseRecordIndex(List list)
            {
                return Iterables.indexOf(list, PurchaseRecordDetailActivity.hasPurchaseRecordId(purchaseRecordId));
            }

            private void handleEvent(PurchaseRecordEvent purchaserecordevent)
            {
                static final class _cls17
                {

                    static final int $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[];

                    static 
                    {
                        $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType = new int[PurchaseRecordEvent.PurchaseRecordEventType.values().length];
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.LOADED_PAGE.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCH_FIRST_PAGE_ERROR.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_ADDITIONAL_PAGE.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_FIRST_PAGE.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCH_ADDITIONAL_PAGE_ERROR.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCHING_PURCHASE_RECORD.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCH_PURCHASE_RECORD_NOT_FOUND.ordinal()] = 7;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCH_PURCHASE_RECORD_FAIL.ordinal()] = 8;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$google$android$apps$wallet$purchaserecord$PurchaseRecordEvent$PurchaseRecordEventType[PurchaseRecordEvent.PurchaseRecordEventType.FETCH_PURCHASE_RECORD_SUCCESS.ordinal()] = 9;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls17..SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType[purchaserecordevent.getType().ordinal()];
                JVM INSTR tableswitch 1 2: default 32
            //                           1 33
            //                           2 129;
                   goto _L1 _L2 _L3
_L1:
                return;
_L2:
                purchaserecordevent = purchaserecordevent.getPurchaseRecords();
                int i = getPurchaseRecordIndex(purchaserecordevent);
                if (i >= 0)
                {
                    adapter.setPurchaseRecords(purchaserecordevent);
                    viewPager.setCurrentItem(i, false);
                    fullScreenProgressSpinnerManager.hide();
                    if (firstLoad)
                    {
                        doFirstLoadActions();
                        return;
                    }
                } else
                {
                    WLog.wfmt(PurchaseRecordDetailActivity.TAG, "Could not find previously selected PurchaseRecord in new list; fetching it individually: %s", new Object[] {
                        purchaseRecordId
                    });
                    fetchSinglePurchaseRecord();
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L3:
                if (firstLoad)
                {
                    showErrorRetryView();
                    return;
                }
                if (true) goto _L1; else goto _L4
_L4:
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((PurchaseRecordEvent)obj);
            }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                super();
            }
        });
    }

    private void fetchSinglePurchaseRecord()
    {
        eventBus.register(this, com/google/android/apps/wallet/purchaserecord/PurchaseRecordEvent, purchaseRecordId, new EventHandler() {

            final PurchaseRecordDetailActivity this$0;

            private void handleEvent(PurchaseRecordEvent purchaserecordevent)
            {
                if (!firstLoad) goto _L2; else goto _L1
_L1:
                _cls17..SwitchMap.com.google.android.apps.wallet.purchaserecord.PurchaseRecordEvent.PurchaseRecordEventType[purchaserecordevent.getType().ordinal()];
                JVM INSTR tableswitch 6 9: default 52
            //                           6 52
            //                           7 53
            //                           8 72
            //                           9 103;
                   goto _L2 _L2 _L3 _L4 _L5
_L2:
                return;
_L3:
                finish();
                Toasts.show(PurchaseRecordDetailActivity.this, com.google.android.apps.walletnfcrel.R.string.purchase_record_details_deleted_toast);
                return;
_L4:
                showErrorRetryView();
                adapter.setPurchaseRecords(Lists.newArrayList());
                fullScreenProgressSpinnerManager.hide();
                return;
_L5:
                adapter.setPurchaseRecords(Lists.newArrayList(new PurchaseRecord[] {
                    purchaserecordevent.getPurchaseRecord()
                }));
                viewPager.setCurrentItem(0);
                updateTitle();
                fullScreenProgressSpinnerManager.hide();
                doFirstLoadActions();
                return;
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((PurchaseRecordEvent)obj);
            }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                super();
            }
        });
    }

    private int getPurchaseRecordType()
    {
        if (viewPager.getCurrentItem() < 0 || viewPager.getCurrentItem() >= adapter.getCount())
        {
            return -1;
        } else
        {
            return adapter.getPurchaseRecord(viewPager.getCurrentItem()).getType().intValue();
        }
    }

    private static Predicate hasPurchaseRecordId(final String id)
    {
        return new Predicate() {

            final String val$id;

            private boolean apply(PurchaseRecord purchaserecord)
            {
                return id.equals(purchaserecord.getId());
            }

            public final volatile boolean apply(Object obj)
            {
                return apply((PurchaseRecord)obj);
            }

            
            {
                id = s;
                super();
            }
        };
    }

    private static Predicate hasPurchaseRecordIdAndStatus(final String id, final Integer status)
    {
        return new Predicate() {

            final String val$id;
            final Integer val$status;

            private boolean apply(PurchaseRecord purchaserecord)
            {
                return id.equals(purchaserecord.getId()) && status.equals(purchaserecord.getStatus());
            }

            public final volatile boolean apply(Object obj)
            {
                return apply((PurchaseRecord)obj);
            }

            
            {
                id = s;
                status = integer;
                super();
            }
        };
    }

    private void initializePurchaseRecordIdFromIntent(Intent intent)
    {
        Preconditions.checkNotNull(intent.getData());
        UriRegistry uriregistry = uriRegistry;
        if (UriRegistry.isLocalScheme(intent.getData().getScheme()))
        {
            purchaseRecordId = parsePurchaseRecordIdFromUri(8001, intent.getDataString());
            if (purchaseRecordId == null)
            {
                purchaseRecordId = parsePurchaseRecordIdFromUri(4008, intent.getDataString());
            }
            if (purchaseRecordId == null)
            {
                purchaseRecordId = parsePurchaseRecordIdFromUri(4002, intent.getDataString());
            }
            if (purchaseRecordId == null)
            {
                purchaseRecordId = parsePurchaseRecordIdFromUri(4016, intent.getDataString());
            }
            if (purchaseRecordId == null)
            {
                purchaseRecordId = parsePurchaseRecordIdFromUri(13000, intent.getDataString());
            }
        }
        if (purchaseRecordId == null && intent.getData().getScheme().equals("https") && intent.getData().getQueryParameter("txid") != null)
        {
            purchaseRecordId = intent.getData().getQueryParameter("txid");
        }
    }

    private static boolean isMatchingRequest(int i, Uri uri)
    {
        return UriRegistry.parseVariables(i, uri) != null;
    }

    private void onCancelMoneyRequestConfirmed(String s)
    {
        analyticsUtil.sendButtonTap("CancelOutgoingMoneyRequest", new AnalyticsCustomDimension[0]);
        com.google.wallet.proto.api.NanoWalletFundsTransfer.CancelMoneyRequestRequest cancelmoneyrequestrequest = new com.google.wallet.proto.api.NanoWalletFundsTransfer.CancelMoneyRequestRequest();
        cancelmoneyrequestrequest.id = s;
        actionExecutor.executeAction(new CancelMoneyRequestAction(fundsTransferClient, cancelmoneyrequestrequest), new AsyncCallback() {

            final PurchaseRecordDetailActivity this$0;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletFundsTransfer.CancelMoneyRequestResponse cancelmoneyrequestresponse)
            {
                if (cancelmoneyrequestresponse.callError != null)
                {
                    analyticsUtil.sendError("CancelOutgoingMoneyRequest", new AnalyticsCustomDimension[0]);
                    WLog.e(PurchaseRecordDetailActivity.TAG, cancelmoneyrequestresponse.callError.toString());
                    if (cancelmoneyrequestresponse.callError.content != null && cancelmoneyrequestresponse.callError.title != null)
                    {
                        AlertDialogFragment.newBuilder().setTitle(cancelmoneyrequestresponse.callError.title).setMessage(cancelmoneyrequestresponse.callError.content).build().show(getSupportFragmentManager());
                        return;
                    } else
                    {
                        showToast(com.google.android.apps.walletnfcrel.R.string.request_money_cancel_failed);
                        return;
                    }
                } else
                {
                    analyticsUtil.sendSuccess("CancelOutgoingMoneyRequest", new AnalyticsCustomDimension[0]);
                    showToast(com.google.android.apps.walletnfcrel.R.string.request_money_cancel_complete);
                    purchaseRecordPublisher.reload();
                    return;
                }
            }

            private void showToast(int i)
            {
                Toasts.show(PurchaseRecordDetailActivity.this, i);
            }

            public final void onFailure(Exception exception)
            {
                analyticsUtil.sendError("CancelOutgoingMoneyRequest", new AnalyticsCustomDimension[0]);
                WLog.e(PurchaseRecordDetailActivity.TAG, "Failed to cancel money request", exception);
                showToast(com.google.android.apps.walletnfcrel.R.string.request_money_cancel_failed);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletFundsTransfer.CancelMoneyRequestResponse)obj);
            }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                super();
            }
        });
    }

    private void onGeoInferenceFeedbackRequest(PurchaseRecord purchaserecord, String s)
    {
        analyticsUtil.sendButtonTap("OpenGeoInferenceFeedback", new AnalyticsCustomDimension[0]);
        geoMerchantFeedbackDialog.getArguments().putString("KEY_TRANSACTION_ID", purchaserecord.getId());
        geoMerchantFeedbackDialog.getArguments().putString("KEY_GEO_MERCHANT_DOCID", s);
        geoMerchantFeedbackDialog.show(getSupportFragmentManager(), "DIALOG_GEO_MERCHANT_FEEDBACK");
    }

    private void onGeoMerchantFeedbackConfirmed(final String transactionId, final String geoMerchantDocid)
    {
        actionExecutor.executeAction(new Callable() {

            final PurchaseRecordDetailActivity this$0;
            final String val$geoMerchantDocid;
            final String val$transactionId;

            private com.google.wallet.proto.api.NanoWalletTransaction.TransactionGeoMerchantFeedbackResponse call()
                throws Exception
            {
                com.google.wallet.proto.api.NanoWalletTransaction.TransactionGeoMerchantFeedbackRequest transactiongeomerchantfeedbackrequest = new com.google.wallet.proto.api.NanoWalletTransaction.TransactionGeoMerchantFeedbackRequest();
                transactiongeomerchantfeedbackrequest.transactionId = transactionId;
                transactiongeomerchantfeedbackrequest.feedbackValue = Integer.valueOf(0);
                transactiongeomerchantfeedbackrequest.geoMerchant = new com.google.wallet.proto.api.NanoWalletTransaction.TransactionGeoMerchantFeedbackRequest.GeoMerchant();
                transactiongeomerchantfeedbackrequest.geoMerchant.locationDocid = Long.valueOf(Long.parseLong(geoMerchantDocid));
                return inferredMerchantFeedbackManager.sendFeedback(transactiongeomerchantfeedbackrequest);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                transactionId = s;
                geoMerchantDocid = s1;
                super();
            }
        }, new AsyncCallback() {

            final PurchaseRecordDetailActivity this$0;
            final String val$transactionId;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletTransaction.TransactionGeoMerchantFeedbackResponse transactiongeomerchantfeedbackresponse)
            {
                if (transactiongeomerchantfeedbackresponse.callError != null)
                {
                    if (transactiongeomerchantfeedbackresponse.callError.content != null && transactiongeomerchantfeedbackresponse.callError.title != null)
                    {
                        WLog.e(PurchaseRecordDetailActivity.TAG, transactiongeomerchantfeedbackresponse.callError.toString());
                        AlertDialogFragment.newBuilder().setTitle(transactiongeomerchantfeedbackresponse.callError.title).setMessage(transactiongeomerchantfeedbackresponse.callError.content).build().show(getSupportFragmentManager());
                        return;
                    } else
                    {
                        Toasts.show(PurchaseRecordDetailActivity.this, getString(com.google.android.apps.walletnfcrel.R.string.inferred_merchant_feedback_failure_toast));
                        return;
                    }
                } else
                {
                    Toasts.show(PurchaseRecordDetailActivity.this, getString(com.google.android.apps.walletnfcrel.R.string.inferred_merchant_feedback_success_toast));
                    purchaseRecordPublisher.fetchPurchaseRecord(transactionId);
                    return;
                }
            }

            public final void onFailure(Exception exception)
            {
                WLog.e(PurchaseRecordDetailActivity.TAG, "Failed to send geo merchant feedback", exception);
                Toasts.show(PurchaseRecordDetailActivity.this, com.google.android.apps.walletnfcrel.R.string.inferred_merchant_feedback_failure_toast);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletTransaction.TransactionGeoMerchantFeedbackResponse)obj);
            }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                transactionId = s;
                super();
            }
        });
    }

    private void onReturnMoneyConfirmed(final String transactionId)
    {
        actionExecutor.executeAction(new Callable() {

            final PurchaseRecordDetailActivity this$0;
            final String val$transactionId;

            private com.google.wallet.proto.api.NanoWalletFundsTransfer.RejectMoneyResponse call()
                throws Exception
            {
                com.google.wallet.proto.api.NanoWalletFundsTransfer.RejectMoneyRequest rejectmoneyrequest = new com.google.wallet.proto.api.NanoWalletFundsTransfer.RejectMoneyRequest();
                rejectmoneyrequest.id = transactionId;
                return fundsTransferClient.rejectMoney(rejectmoneyrequest);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                transactionId = s;
                super();
            }
        }, new AsyncCallback() {

            final PurchaseRecordDetailActivity this$0;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletFundsTransfer.RejectMoneyResponse rejectmoneyresponse)
            {
                if (rejectmoneyresponse.callError != null)
                {
                    if (rejectmoneyresponse.callError.content != null && rejectmoneyresponse.callError.title != null)
                    {
                        AlertDialogFragment.newBuilder().setTitle(rejectmoneyresponse.callError.title).setMessage(rejectmoneyresponse.callError.content).build().show(getSupportFragmentManager());
                        return;
                    } else
                    {
                        showToast(com.google.android.apps.walletnfcrel.R.string.return_money_failure_toast);
                        return;
                    }
                } else
                {
                    showToast(com.google.android.apps.walletnfcrel.R.string.return_money_success_toast);
                    purchaseRecordPublisher.reload();
                    return;
                }
            }

            private void showToast(int i)
            {
                Toasts.show(PurchaseRecordDetailActivity.this, i);
            }

            public final void onFailure(Exception exception)
            {
                showToast(com.google.android.apps.walletnfcrel.R.string.return_money_failure_toast);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletFundsTransfer.RejectMoneyResponse)obj);
            }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                super();
            }
        });
    }

    private static String parsePurchaseRecordIdFromUri(int i, String s)
    {
        s = UriRegistry.parseVariables(i, Uri.parse(s));
        if (s != null)
        {
            return s[0];
        } else
        {
            return null;
        }
    }

    private void setPurchaseRecordAdapter(PurchaseRecordAdapter purchaserecordadapter)
    {
        adapter = purchaserecordadapter;
        viewPager.setAdapter(purchaserecordadapter);
    }

    private void showErrorRetryView()
    {
        errorContainer.setVisibility(0);
        viewPager.setVisibility(4);
    }

    private void showPurchaseRecordView()
    {
        errorContainer.setVisibility(4);
        viewPager.setVisibility(0);
    }

    private void updateTitle()
    {
        int i = getPurchaseRecordType();
        if (i == 12 || i == 13)
        {
            setTitle(com.google.android.apps.walletnfcrel.R.string.request_money_details_title);
            return;
        } else
        {
            setTitle(com.google.android.apps.walletnfcrel.R.string.purchase_record_detail_title);
            return;
        }
    }

    protected final void doFirstLoadActions()
    {
        firstLoad = false;
        if (getIntent().getData() != null && getIntent().getData().getScheme().equals("comgooglewallet"))
        {
            PurchaseRecord purchaserecord = adapter.getPurchaseRecord(viewPager.getCurrentItem());
            if (purchaserecord != null && purchaserecord.getId().equals(purchaseRecordId) && isFromNewIntent)
            {
                isFromNewIntent = false;
                if (isMatchingRequest(4008, getIntent().getData()))
                {
                    onDeclineMoneyRequest(purchaserecord);
                } else
                {
                    if (isMatchingRequest(4002, getIntent().getData()))
                    {
                        onReturnMoneyClicked(purchaserecord);
                        return;
                    }
                    if (isMatchingRequest(13000, getIntent().getData()) && !geoMerchantFeedbackDialog.isVisible())
                    {
                        String as[] = UriRegistry.parseVariables(13000, getIntent().getData());
                        if (as.length == 3)
                        {
                            onGeoInferenceFeedbackRequest(purchaserecord, as[1]);
                            return;
                        }
                    }
                }
            }
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.purchase_record_detail_activity);
        setTitle(com.google.android.apps.walletnfcrel.R.string.purchase_record_detail_title);
        errorContainer = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.PurchaseRecordDetailErrorContainer);
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.loading_list_error_message)).setText(com.google.android.apps.walletnfcrel.R.string.purchase_record_detail_error_loading);
        findViewById(com.google.android.apps.walletnfcrel.R.id.loading_list_retry_button).setOnClickListener(new android.view.View.OnClickListener() {

            final PurchaseRecordDetailActivity this$0;

            public final void onClick(View view)
            {
                showPurchaseRecordView();
                displayPurchaseRecord();
            }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                super();
            }
        });
        viewPager = (ViewPager)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.PurchaseRecordViewPager);
        Views.disableHardwareAccelerationAtView(viewPager);
        setPurchaseRecordAdapter(new PurchaseRecordAdapter(getSupportFragmentManager()));
        viewPager.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final PurchaseRecordDetailActivity this$0;

            public final void onPageScrollStateChanged(int i)
            {
            }

            public final void onPageScrolled(int i, float f, int j)
            {
            }

            public final void onPageSelected(int i)
            {
                if (i == viewPager.getAdapter().getCount() - 2)
                {
                    purchaseRecordPublisher.fetchNextPage();
                }
                updateTitle();
            }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                super();
            }
        });
        if (bundle != null && bundle.getString("KEY_PURCHASE_RECORD") != null)
        {
            purchaseRecordId = bundle.getString("KEY_PURCHASE_RECORD");
            return;
        } else
        {
            initializePurchaseRecordIdFromIntent(getIntent());
            return;
        }
    }

    public final void doOnResume()
    {
        displayPurchaseRecord();
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (1 == i && j == -1)
        {
            finish();
        }
    }

    public final void onAttachFragment(final Fragment alertDialog)
    {
        super.onAttachFragment(alertDialog);
        if (alertDialog instanceof PurchaseRecordDetailFragment)
        {
            fragment = (PurchaseRecordDetailFragment)alertDialog;
            fragment.setUiActionListener(this);
        } else
        {
            if ("DIALOG_RETURN_MONEY".equals(alertDialog.getTag()))
            {
                alertDialog = (AlertDialogFragment)alertDialog;
                alertDialog.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                    final PurchaseRecordDetailActivity this$0;
                    final AlertDialogFragment val$alertDialog;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        if (i == -1)
                        {
                            String s = alertDialog.getArguments().getString("KEY_TRANSACTION_ID");
                            Preconditions.checkNotNull(s);
                            onReturnMoneyConfirmed(s);
                            dialoginterface.dismiss();
                        }
                    }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                alertDialog = alertdialogfragment;
                super();
            }
                });
                return;
            }
            if ("DIALOG_CANCEL_REQUEST".equals(alertDialog.getTag()))
            {
                alertDialog = (AlertDialogFragment)alertDialog;
                alertDialog.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                    final PurchaseRecordDetailActivity this$0;
                    final AlertDialogFragment val$alertDialog;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        if (i == -1)
                        {
                            String s = alertDialog.getArguments().getString("KEY_TRANSACTION_ID");
                            Preconditions.checkNotNull(s);
                            onCancelMoneyRequestConfirmed(s);
                            dialoginterface.dismiss();
                        }
                    }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                alertDialog = alertdialogfragment;
                super();
            }
                });
                return;
            }
            if ("DIALOG_GEO_MERCHANT_FEEDBACK".equals(alertDialog.getTag()))
            {
                alertDialog = (AlertDialogFragment)alertDialog;
                alertDialog.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

                    final PurchaseRecordDetailActivity this$0;
                    final AlertDialogFragment val$alertDialog;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        if (i == -1)
                        {
                            analyticsUtil.sendButtonTap("ReportIncorrectGeoMerchant", new AnalyticsCustomDimension[0]);
                            String s = alertDialog.getArguments().getString("KEY_TRANSACTION_ID");
                            String s1 = alertDialog.getArguments().getString("KEY_GEO_MERCHANT_DOCID");
                            Preconditions.checkNotNull(s);
                            Preconditions.checkNotNull(s1);
                            onGeoMerchantFeedbackConfirmed(s, s1);
                            dialoginterface.dismiss();
                        }
                    }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                alertDialog = alertdialogfragment;
                super();
            }
                });
                return;
            }
        }
    }

    public final void onCancelMoneyRequest(PurchaseRecord purchaserecord)
    {
        purchaserecord = purchaserecord.getSenderDisplayName(purchaserecord.getCounterPartyEmail());
        purchaserecord = AlertDialogFragment.newBuilder().setCancelable(true).setTitle(com.google.android.apps.walletnfcrel.R.string.request_money_cancel_dialog_title).setMessage(getString(com.google.android.apps.walletnfcrel.R.string.request_money_cancel_dialog_detail, new Object[] {
            purchaserecord
        })).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.request_money_cancel_confirm_button).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.nevermind).build();
        purchaserecord.getArguments().putString("KEY_TRANSACTION_ID", purchaseRecordId);
        purchaserecord.show(getSupportFragmentManager(), "DIALOG_CANCEL_REQUEST");
    }

    public final void onDeclineMoneyRequest(PurchaseRecord purchaserecord)
    {
        DeclineMoneyRequestDialog.show(purchaserecord, getSupportFragmentManager(), new Runnable() {

            final PurchaseRecordDetailActivity this$0;

            public final void run()
            {
                finish();
            }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                super();
            }
        });
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        eventBus.unregisterAll(this);
        setIntent(intent);
        initializePurchaseRecordIdFromIntent(intent);
        isFromNewIntent = true;
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        actionExecutor.cancelAll();
        super.onPause();
    }

    public final void onReturnMoneyClicked(PurchaseRecord purchaserecord)
    {
        purchaserecord = AlertDialogFragment.newBuilder().setCancelable(true).setTitle(com.google.android.apps.walletnfcrel.R.string.return_money_title).setMessage(getString(com.google.android.apps.walletnfcrel.R.string.return_money_message, new Object[] {
            purchaserecord.getDisplayableAmount().get(), purchaserecord.getSenderDisplayName(getString(com.google.android.apps.walletnfcrel.R.string.claim_money_empty_sender_name))
        })).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.return_money_positive_button).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).build();
        purchaserecord.getArguments().putString("KEY_TRANSACTION_ID", purchaseRecordId);
        purchaserecord.show(getSupportFragmentManager(), "DIALOG_RETURN_MONEY");
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("KEY_PURCHASE_RECORD", purchaseRecordId);
        super.onSaveInstanceState(bundle);
    }

    public final void onSendMoneyRequestReminder(PurchaseRecord purchaserecord)
    {
        com.google.wallet.proto.api.NanoWalletFundsTransfer.SendReminderRequest sendreminderrequest = new com.google.wallet.proto.api.NanoWalletFundsTransfer.SendReminderRequest();
        sendreminderrequest.id = purchaserecord.getId();
        actionExecutor.executeAction(new SendMoneyRequestReminderAction(fundsTransferClient, sendreminderrequest), new AsyncCallback() {

            final PurchaseRecordDetailActivity this$0;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletFundsTransfer.SendReminderResponse sendreminderresponse)
            {
                if (sendreminderresponse.callError != null)
                {
                    analyticsUtil.sendError("RequestMoneyRemind", new AnalyticsCustomDimension[0]);
                    if (sendreminderresponse.callError.content != null && sendreminderresponse.callError.title != null)
                    {
                        WLog.e(PurchaseRecordDetailActivity.TAG, sendreminderresponse.callError.toString());
                        AlertDialogFragment.newBuilder().setTitle(sendreminderresponse.callError.title).setMessage(sendreminderresponse.callError.content).build().show(getSupportFragmentManager());
                        return;
                    } else
                    {
                        Toasts.show(PurchaseRecordDetailActivity.this, getString(com.google.android.apps.walletnfcrel.R.string.request_money_reminder_failed));
                        return;
                    }
                } else
                {
                    analyticsUtil.sendSuccess("RequestMoneyRemind", new AnalyticsCustomDimension[0]);
                    Toasts.show(PurchaseRecordDetailActivity.this, getString(com.google.android.apps.walletnfcrel.R.string.request_money_reminder_sent));
                    purchaseRecordPublisher.reload();
                    return;
                }
            }

            public final void onFailure(Exception exception)
            {
                analyticsUtil.sendError("RequestMoneyRemind", new AnalyticsCustomDimension[0]);
                WLog.e(PurchaseRecordDetailActivity.TAG, "Failed to send reminder for money request", exception);
                Toasts.show(PurchaseRecordDetailActivity.this, getString(com.google.android.apps.walletnfcrel.R.string.request_money_reminder_failed));
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletFundsTransfer.SendReminderResponse)obj);
            }

            
            {
                this$0 = PurchaseRecordDetailActivity.this;
                super();
            }
        });
    }

    public final void onSettleMoneyRequest(PurchaseRecord purchaserecord)
    {
        purchaserecord = TransferApi.createSettleRequestIntent(this, purchaserecord.getId(), purchaserecord.getTotalAmountMicros(), purchaserecord.getTotalAmountCurrencyCode(), purchaserecord.getMemo(), new Contact(purchaserecord.getCounterPartyEmail()), featureManager);
        analyticsUtil.sendButtonTap("AcceptIncomingMoneyRequest", new AnalyticsCustomDimension[0]);
        startActivityForResult(purchaserecord, 1);
    }

    public final void onUpPressed()
    {
        if (getPurchaseRecordType() == 13)
        {
            navigateUpWithIntent(transferApi.createIncomingMoneyRequestListIntent());
        } else
        {
            navigateUpWithIntent(uriRegistry.createIntent(8000, new Object[0]));
        }
        finish();
    }















}
