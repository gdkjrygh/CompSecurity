// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.tapandpay.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.fragment.Fragments;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.NetworkInformationProvider;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordDetailFragment;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager;
import com.google.android.apps.wallet.purchaserecord.api.NewPurchaseRecordReceiptEvent;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadPreconditions;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Optional;
import com.google.common.base.Throwables;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.tapandpay.ui:
//            TapTroubleshooterActivity

public class TapCompletedActivity extends WalletActivity
{
    final class DoEndOfPause
        implements Runnable
    {

        final TapCompletedActivity this$0;

        public final void run()
        {
            ThreadPreconditions.checkOnUiThread();
            static final class _cls6
            {

                static final int $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState[];

                static 
                {
                    $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState = new int[TransactionDetailState.values().length];
                    try
                    {
                        $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState[TransactionDetailState.NOT_STARTED.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState[TransactionDetailState.REQUESTING.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState[TransactionDetailState.DETAILS_DELAYED.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState[TransactionDetailState.DETAILS_DELAYED_LONGER.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$google$android$apps$wallet$tapandpay$ui$TapCompletedActivity$TransactionDetailState[TransactionDetailState.DETAILS_DONE.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls6..SwitchMap.com.google.android.apps.wallet.tapandpay.ui.TapCompletedActivity.TransactionDetailState[transactionDetailState.ordinal()])
            {
            default:
                throw new IllegalStateException();

            case 2: // '\002'
                onDetailsDelayed();
                // fall through

            case 1: // '\001'
            case 5: // '\005'
                return;

            case 3: // '\003'
                onDetailsDelayedLonger();
                return;

            case 4: // '\004'
                onDetailsDone();
                break;
            }
        }

        private DoEndOfPause()
        {
            this$0 = TapCompletedActivity.this;
            super();
        }

    }

    static final class TransactionDetailState extends Enum
    {

        private static final TransactionDetailState $VALUES[];
        public static final TransactionDetailState DETAILS_DELAYED;
        public static final TransactionDetailState DETAILS_DELAYED_LONGER;
        public static final TransactionDetailState DETAILS_DONE;
        public static final TransactionDetailState NOT_STARTED;
        public static final TransactionDetailState REQUESTING;

        public static TransactionDetailState valueOf(String s)
        {
            return (TransactionDetailState)Enum.valueOf(com/google/android/apps/wallet/tapandpay/ui/TapCompletedActivity$TransactionDetailState, s);
        }

        public static TransactionDetailState[] values()
        {
            return (TransactionDetailState[])$VALUES.clone();
        }

        static 
        {
            NOT_STARTED = new TransactionDetailState("NOT_STARTED", 0);
            REQUESTING = new TransactionDetailState("REQUESTING", 1);
            DETAILS_DELAYED = new TransactionDetailState("DETAILS_DELAYED", 2);
            DETAILS_DELAYED_LONGER = new TransactionDetailState("DETAILS_DELAYED_LONGER", 3);
            DETAILS_DONE = new TransactionDetailState("DETAILS_DONE", 4);
            $VALUES = (new TransactionDetailState[] {
                NOT_STARTED, REQUESTING, DETAILS_DELAYED, DETAILS_DELAYED_LONGER, DETAILS_DONE
            });
        }

        private TransactionDetailState(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = com/google/android/apps/wallet/tapandpay/ui/TapCompletedActivity.getSimpleName();
    AccessibilityUtil accessibilityUtil;
    ActionExecutor actionExecutor;
    AnalyticsUtil analyticsUtil;
    TranslateAnimation animation;
    private int currentTransactionDetailViewPosition;
    EventBus eventBus;
    FeatureManager featureManager;
    private final Handler handler = new Handler();
    private boolean isPaused;
    private boolean navigatedToTapTroubleshooter;
    NetworkInformationProvider networkInformationProvider;
    PurchaseRecord purchaseRecord;
    PurchaseRecordDetailFragment purchaseRecordDetailFragment;
    private boolean purchaseRecordFetched;
    PurchaseRecordManager purchaseRecordManager;
    private boolean shouldRegisterWithEventBus;
    private TextView tapCompletedStatusMsg;
    private TextView tapTroubleShooterLauncherBar;
    private ViewGroup transactionDetailContainerNode;
    private TransactionDetailState transactionDetailState;
    UriRegistry uriRegistry;
    UserEventLogger userEventLogger;

    public TapCompletedActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        isPaused = false;
        navigatedToTapTroubleshooter = false;
        transactionDetailState = TransactionDetailState.NOT_STARTED;
    }

    public static Intent createIntentWithNfcTapEvent(Context context, byte abyte0[])
    {
        context = InternalIntents.forClass(context, com/google/android/apps/wallet/tapandpay/ui/TapCompletedActivity);
        context.putExtra("NFC_TAP_EVENT", abyte0);
        context.addFlags(0x4000000);
        return context;
    }

    private void doTapAnimation(int i, int j, long l, android.view.animation.Animation.AnimationListener animationlistener)
    {
        animation = new TranslateAnimation(0.0F, 0.0F, i, j);
        animation.setDuration(l);
        animation.setFillAfter(true);
        animation.setAnimationListener(animationlistener);
        transactionDetailContainerNode.startAnimation(animation);
        currentTransactionDetailViewPosition = j;
    }

    private static String getTransactionId(String as[])
    {
        if (as != null)
        {
            String as1[] = UriRegistry.parseVariables(8002, Uri.parse(as[0]));
            if (as1 != null)
            {
                return as1[0];
            }
        }
        WLog.wfmt("Could not find transaction id from target URI: %s", as[0], new Object[0]);
        return null;
    }

    private void initializeTapTroubleshooterBar()
    {
        Views.setLinkOnClickListener(tapTroubleShooterLauncherBar, new android.view.View.OnClickListener() {

            final TapCompletedActivity this$0;

            public final void onClick(View view)
            {
                view = TapTroubleshooterActivity.createIntent(TapCompletedActivity.this);
                startActivity(view);
                navigatedToTapTroubleshooter = true;
            }

            
            {
                this$0 = TapCompletedActivity.this;
                super();
            }
        });
    }

    private void onAnimationEnded()
    {
        if (transactionDetailState != TransactionDetailState.DETAILS_DONE)
        {
            handler.postDelayed(new DoEndOfPause(), TimeUnit.SECONDS.toMillis(5L));
        }
    }

    private void onDetailsDelayed()
    {
        transactionDetailState = TransactionDetailState.DETAILS_DELAYED;
        if (!networkInformationProvider.hasNetworkAccess())
        {
            WLog.dfmt(TAG, "onDetailsDelayed(), no network. isPaused: %s", new Object[] {
                Boolean.valueOf(isPaused)
            });
            userEventLogger.log(15, 71);
            analyticsUtil.sendNfcEvent("TapAndPayDetailsOffline", new AnalyticsCustomDimension[0]);
            if (!isPaused)
            {
                AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.error_dialog_no_network_access_title).setMessage(com.google.android.apps.walletnfcrel.R.string.tap_completed_network_access_required_msg_box_text).build().show(getSupportFragmentManager());
            }
        } else
        {
            analyticsUtil.sendNfcEvent("TapAndPayDetailsDelayed", new AnalyticsCustomDimension[0]);
        }
        tapCompletedStatusMsg.setText(getString(com.google.android.apps.walletnfcrel.R.string.tap_completed_details_delayed));
        tapCompletedStatusMsg.sendAccessibilityEvent(32);
        startAlphaFadeAnimation(tapCompletedStatusMsg, 0.0F, 1.0F, TimeUnit.SECONDS.toMillis(1L));
        if (!purchaseRecordFetched)
        {
            tapTroubleShooterLauncherBar.setVisibility(0);
            startAlphaFadeAnimation(tapTroubleShooterLauncherBar, 0.0F, 1.0F, TimeUnit.SECONDS.toMillis(1L));
        }
        onAnimationEnded();
    }

    private void onDetailsDelayedLonger()
    {
        analyticsUtil.sendNfcEvent("TapAndPayDetailsDelayedLonger", new AnalyticsCustomDimension[0]);
        transactionDetailState = TransactionDetailState.DETAILS_DELAYED_LONGER;
        tapCompletedStatusMsg.clearAnimation();
        tapCompletedStatusMsg.setText(getString(com.google.android.apps.walletnfcrel.R.string.tap_completed_details_delayed_longer));
        tapCompletedStatusMsg.sendAccessibilityEvent(32);
        startAlphaFadeAnimation(tapCompletedStatusMsg, 0.0F, 1.0F, TimeUnit.SECONDS.toMillis(1L));
        onAnimationEnded();
    }

    private void onDetailsDone()
    {
        transactionDetailState = TransactionDetailState.DETAILS_DONE;
        android.view.animation.Animation.AnimationListener animationlistener = new android.view.animation.Animation.AnimationListener() {

            final TapCompletedActivity this$0;

            public final void onAnimationEnd(Animation animation1)
            {
                findViewById(com.google.android.apps.walletnfcrel.R.id.TapCompletedImage).animate().alpha(0.0F).setDuration(0x10e0000L);
                animation1 = getIntent().getByteArrayExtra("NFC_TAP_EVENT");
                if (purchaseRecordFetched)
                {
                    break MISSING_BLOCK_LABEL_122;
                }
                analyticsUtil.sendNfcEvent("TapAndPayDetailsUnknown", new AnalyticsCustomDimension[0]);
                accessibilityUtil.announce(tapCompletedStatusMsg, com.google.android.apps.walletnfcrel.R.string.tap_completed_accessibility_unknown);
                purchaseRecord = PurchaseRecord.from((com.google.wallet.proto.NanoWalletEntities.NfcTapEvent)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.NfcTapEvent(), animation1), TapCompletedActivity.this, com.google.android.apps.walletnfcrel.R.string.receipt_paypass_merchant);
_L1:
                setPurchaseRecordOnFragment();
                return;
                try
                {
                    analyticsUtil.sendNfcEvent("TapAndPayDetailsFetched", new AnalyticsCustomDimension[0]);
                    accessibilityUtil.announce(tapCompletedStatusMsg, com.google.android.apps.walletnfcrel.R.string.tap_completed_accessibility_unknown);
                }
                // Misplaced declaration of an exception variable
                catch (Animation animation1)
                {
                    throw Throwables.propagate(animation1);
                }
                  goto _L1
            }

            public final void onAnimationRepeat(Animation animation1)
            {
            }

            public final void onAnimationStart(Animation animation1)
            {
                tapCompletedStatusMsg.clearAnimation();
                tapCompletedStatusMsg.setVisibility(4);
            }

            
            {
                this$0 = TapCompletedActivity.this;
                super();
            }
        };
        doTapAnimation(currentTransactionDetailViewPosition, 0, 2500L, animationlistener);
    }

    private void onRequesting()
    {
        transactionDetailState = TransactionDetailState.REQUESTING;
        userEventLogger.log(15, 70);
        transactionDetailContainerNode.clearAnimation();
        transactionDetailContainerNode.setVisibility(0);
        doTapAnimation(transactionDetailContainerNode.getHeight() + 1, transactionDetailContainerNode.getHeight() - 220, 1500L, new android.view.animation.Animation.AnimationListener() {

            final TapCompletedActivity this$0;

            public final void onAnimationEnd(Animation animation1)
            {
                onAnimationEnded();
            }

            public final void onAnimationRepeat(Animation animation1)
            {
            }

            public final void onAnimationStart(Animation animation1)
            {
            }

            
            {
                this$0 = TapCompletedActivity.this;
                super();
            }
        });
        tapTroubleShooterLauncherBar.setVisibility(4);
    }

    private void setPurchaseRecordOnFragment()
    {
        ((PurchaseRecordDetailFragment)Fragments.findByTag(getSupportFragmentManager(), com/google/android/apps/wallet/purchaserecord/PurchaseRecordDetailFragment)).setPurchaseRecord(purchaseRecord);
    }

    private static void startAlphaFadeAnimation(View view, float f, float f1, long l)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(f, f1);
        alphaanimation.setFillAfter(true);
        alphaanimation.setDuration(l);
        view.setAnimation(alphaanimation);
        alphaanimation.start();
    }

    protected final void doOnCreate(Bundle bundle)
    {
        isPaused = false;
        getWindow().addFlags(0x680000);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.tap_completed);
        transactionDetailContainerNode = (ViewGroup)findViewById(com.google.android.apps.walletnfcrel.R.id.TransactionDetailContainerNode);
        tapCompletedStatusMsg = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.TapCompletedText);
        tapTroubleShooterLauncherBar = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.TapTroubleshooterLauncherBar);
        bundle = getIntent().getByteArrayExtra("NFC_TAP_EVENT");
        try
        {
            purchaseRecord = PurchaseRecord.from((com.google.wallet.proto.NanoWalletEntities.NfcTapEvent)MessageNano.mergeFrom(new com.google.wallet.proto.NanoWalletEntities.NfcTapEvent(), bundle), this, com.google.android.apps.walletnfcrel.R.string.tap_completed_requesting_transaction);
            getSupportFragmentManager().beginTransaction().add(com.google.android.apps.walletnfcrel.R.id.TransactionDetailContainerNode, purchaseRecordDetailFragment, Fragments.getTransactionTag(com/google/android/apps/wallet/purchaserecord/PurchaseRecordDetailFragment)).commit();
            purchaseRecordDetailFragment.setPurchaseRecord(purchaseRecord);
            initializeTapTroubleshooterBar();
            shouldRegisterWithEventBus = true;
            return;
        }
        catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
        {
            bundle = TAG;
            String s = String.valueOf(invalidprotocolbuffernanoexception);
            WLog.e(bundle, (new StringBuilder(String.valueOf(s).length() + 11)).append("parse error").append(s).toString());
            return;
        }
    }

    public final void doOnResume()
    {
        isPaused = false;
        if (shouldRegisterWithEventBus)
        {
            eventBus.register(this);
        }
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public void onBackPressed()
    {
        finish();
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        startActivity(intent);
        finish();
    }

    public void onNewPurchaseRecordReceiptEvent(final NewPurchaseRecordReceiptEvent id)
    {
        WLog.d(TAG, "received event ");
        if (id.getNotificationType().isPresent() && (((Integer)id.getNotificationType().get()).intValue() == 1 || ((Integer)id.getNotificationType().get()).intValue() == 5))
        {
            analyticsUtil.sendNfcEvent("TapAndPayTransactionResolved", new AnalyticsCustomDimension[0]);
            id = getTransactionId(id.getTargetUris());
            if (id != null)
            {
                actionExecutor.executeAction(new Callable() {

                    final TapCompletedActivity this$0;
                    final String val$id;

                    private PurchaseRecord call()
                        throws Exception
                    {
                        return purchaseRecordManager.get(id);
                    }

                    public final volatile Object call()
                        throws Exception
                    {
                        return call();
                    }

            
            {
                this$0 = TapCompletedActivity.this;
                id = s;
                super();
            }
                }, new AsyncCallback() {

                    final TapCompletedActivity this$0;
                    final String val$id;

                    private void onSuccess(PurchaseRecord purchaserecord)
                    {
                        purchaseRecordFetched = true;
                        purchaseRecord = purchaserecord;
                        setPurchaseRecordOnFragment();
                        if (transactionDetailState != TransactionDetailState.NOT_STARTED && transactionDetailState != TransactionDetailState.DETAILS_DONE)
                        {
                            onDetailsDone();
                        }
                        tapTroubleShooterLauncherBar.setVisibility(4);
                        shouldRegisterWithEventBus = false;
                        eventBus.unregisterAll(this);
                    }

                    public final void onFailure(Exception exception)
                    {
                        String s = TapCompletedActivity.TAG;
                        exception = String.valueOf(id);
                        if (exception.length() != 0)
                        {
                            exception = "Unable to fetch purchase record for id: ".concat(exception);
                        } else
                        {
                            exception = new String("Unable to fetch purchase record for id: ");
                        }
                        WLog.d(s, exception);
                    }

                    public final volatile void onSuccess(Object obj)
                    {
                        onSuccess((PurchaseRecord)obj);
                    }

            
            {
                this$0 = TapCompletedActivity.this;
                id = s;
                super();
            }
                });
                return;
            }
        }
    }

    protected void onPause()
    {
        WLog.d(TAG, "onPause");
        isPaused = true;
        getWindow().clearFlags(0x480000);
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }

    protected void onUserLeaveHint()
    {
        if (navigatedToTapTroubleshooter)
        {
            navigatedToTapTroubleshooter = false;
            return;
        } else
        {
            finish();
            return;
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag && transactionDetailState == TransactionDetailState.NOT_STARTED)
        {
            onRequesting();
        }
    }








/*
    static boolean access$202(TapCompletedActivity tapcompletedactivity, boolean flag)
    {
        tapcompletedactivity.purchaseRecordFetched = flag;
        return flag;
    }

*/






/*
    static boolean access$702(TapCompletedActivity tapcompletedactivity, boolean flag)
    {
        tapcompletedactivity.shouldRegisterWithEventBus = flag;
        return flag;
    }

*/



/*
    static boolean access$902(TapCompletedActivity tapcompletedactivity, boolean flag)
    {
        tapcompletedactivity.navigatedToTapTroubleshooter = flag;
        return flag;
    }

*/
}
