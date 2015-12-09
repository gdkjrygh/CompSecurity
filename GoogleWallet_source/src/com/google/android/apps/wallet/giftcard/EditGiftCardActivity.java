// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.callstatus.CallErrorException;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.fragment.FragmentFactory;
import com.google.android.apps.wallet.giftcard.api.GiftCardApi;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.add.EditCardInfoFragment;
import com.google.android.apps.wallet.wobs.add.ProgramCardInfo;
import com.google.android.apps.wallet.wobs.add.ProgramCardsHandler;
import com.google.android.apps.wallet.wobs.add.ProgramCardsUiProperties;
import com.google.android.apps.wallet.wobs.add.RpcAware;
import com.google.android.apps.wallet.wobs.caching.WobsManager;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            GiftCardsUiProperties, GiftCardProgram, GiftCardInfo, GiftCardsClient, 
//            GiftCardsHandler

public class EditGiftCardActivity extends WalletActivity
    implements com.google.android.apps.wallet.wobs.add.EditCardInfoFragment.EditCardInfoCallback
{

    private static final String TAG = com/google/android/apps/wallet/giftcard/EditGiftCardActivity.getSimpleName();
    AnalyticsUtil analyticsUtil;
    private GiftCardInfo cardInfo;
    private String editWobUri;
    EventBus eventBus;
    FragmentFactory fragmentFactory;
    GiftCardsClient giftCardsClient;
    GiftCardsHandler giftCardsHandler;
    NetworkAccessChecker networkAccessChecker;
    private byte serverData[];
    FullScreenProgressSpinnerManager spinnerManager;
    private final GiftCardsUiProperties uiProperties = new GiftCardsUiProperties();
    private String wobInstanceId;
    WobsManager wobsManager;

    public EditGiftCardActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private Callable createGetEditFormAction()
    {
        return new Callable() {

            final EditGiftCardActivity this$0;

            private com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormResponse call()
                throws Exception
            {
                return giftCardsClient.getEditForm(serverData, editWobUri);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = EditGiftCardActivity.this;
                super();
            }
        };
    }

    private GiftCardInfo getCardInfo()
    {
        return cardInfo;
    }

    private void handleGetEditFormFailure(Exception exception)
    {
        WLog.e(TAG, "failed to fetch edit form.", exception);
        CallErrorDialogs.createBuilder(exception, com.google.android.apps.walletnfcrel.R.string.wobs_editing_error_title, com.google.android.apps.walletnfcrel.R.string.wobs_editing_error_details).build().show(getSupportFragmentManager());
    }

    private void handleGetEditFormSuccess(com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormResponse geteditformresponse)
    {
        if (geteditformresponse.giftCardForm == null)
        {
            WLog.e(TAG, "response.giftCardForm sent from crossbar was null");
            return;
        } else
        {
            geteditformresponse = new GiftCardProgram(this, geteditformresponse.giftCardForm);
            cardInfo.setupNewPrompts(geteditformresponse);
            geteditformresponse = fragmentFactory;
            geteditformresponse = FragmentFactory.get(com/google/android/apps/wallet/wobs/add/EditCardInfoFragment);
            Bundle bundle = new Bundle();
            bundle.putInt("edit_mode", 2);
            geteditformresponse.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer, geteditformresponse, com/google/android/apps/wallet/wobs/add/EditCardInfoFragment.getName()).commit();
            return;
        }
    }

    private void handleSaveEditFormFailure(Exception exception)
    {
        analyticsUtil.endTiming("EditGiftCard", null);
        analyticsUtil.sendError("EditGiftCard", new AnalyticsCustomDimension[0]);
        WLog.e(TAG, "failed to save changes gift card.", exception);
        CallErrorDialogs.createBuilder(exception, com.google.android.apps.walletnfcrel.R.string.wobs_update_card_error_title, com.google.android.apps.walletnfcrel.R.string.wobs_update_card_error_message).build().show(getSupportFragmentManager());
    }

    private void handleSaveEditFormSuccess()
    {
        analyticsUtil.endTiming("EditGiftCard", null);
        analyticsUtil.sendSuccess("EditGiftCard", new AnalyticsCustomDimension[0]);
        Toasts.show(this, com.google.android.apps.walletnfcrel.R.string.gift_cards_update_card_success_message);
        finish();
    }

    private void saveEditedGiftCard()
    {
        if (!networkAccessChecker.check())
        {
            return;
        } else
        {
            analyticsUtil.startTiming("EditGiftCard", null);
            setSaveCardButtonEnabled(false);
            spinnerManager.show();
            executeAction("saveEditForm", new Callable() {

                final EditGiftCardActivity this$0;

                private Void call()
                    throws RpcException, CallErrorException
                {
                    com.google.wallet.proto.NanoWalletObjects.WobInstance wobinstance = giftCardsClient.updateWobInstance(serverData, cardInfo.getAllPrompts());
                    wobsManager.upsertWobIfNecessary(wobinstance);
                    return null;
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = EditGiftCardActivity.this;
                super();
            }
            });
            return;
        }
    }

    private void setSaveCardButtonEnabled(boolean flag)
    {
        ((RpcAware)getSupportFragmentManager().findFragmentById(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer)).setSavingEnabled(flag);
    }

    private void showFatalErrorDialog()
    {
        AlertDialogFragment.newBuilder().setCancelable(false).setTitle(com.google.android.apps.walletnfcrel.R.string.wobs_editing_error_title).setMessage(com.google.android.apps.walletnfcrel.R.string.wobs_editing_error_details).setFinishActivityOnClick().setFinishActivityOnDismiss().build().show(getSupportFragmentManager());
    }

    protected final void doOnCreate(Bundle bundle)
    {
        if (bundle == null)
        {
            cardInfo = (GiftCardInfo)getProgramCardsHandler().createProgramCard();
        }
        editWobUri = getIntent().getData().toString();
        if (GiftCardApi.uriMatchesFullEditGiftCardPattern(editWobUri))
        {
            wobInstanceId = GiftCardApi.parseGiftCardIdFromFullEditGiftCardUri(editWobUri);
            return;
        } else
        {
            showFatalErrorDialog();
            return;
        }
    }

    protected final void doOnResume()
    {
        analyticsUtil.sendScreen("Edit Gift Card", new AnalyticsCustomDimension[0]);
        while (wobInstanceId == null || serverData != null) 
        {
            return;
        }
        spinnerManager.show();
        eventBus.register(this, com/google/android/apps/wallet/wobs/provider/WobUpdateEvent, wobInstanceId, new EventHandler() {

            final EditGiftCardActivity this$0;

            private void handleEvent(WobUpdateEvent wobupdateevent)
            {
                eventBus.unregisterAll(EditGiftCardActivity.this);
                if (!networkAccessChecker.check(true))
                {
                    spinnerManager.hide();
                    return;
                }
                if (wobupdateevent.hasError())
                {
                    showFatalErrorDialog();
                    return;
                } else
                {
                    serverData = wobupdateevent.getWobInstance().serverData;
                    executeAction("getEditForm", createGetEditFormAction());
                    return;
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((WobUpdateEvent)obj);
            }

            
            {
                this$0 = EditGiftCardActivity.this;
                super();
            }
        });
    }

    public final volatile ProgramCardInfo getCardInfo()
    {
        return getCardInfo();
    }

    public final ProgramCardsHandler getProgramCardsHandler()
    {
        return giftCardsHandler;
    }

    public final ProgramCardsUiProperties getUiProperties()
    {
        return uiProperties;
    }

    public final boolean hasImageCaptureActivity()
    {
        return false;
    }

    public final void intentToImageCapture(int i)
    {
    }

    public final boolean isMerchantNameEditable()
    {
        return false;
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        spinnerManager.hide();
        if (!super.onActionFailure(s, callable, exception))
        {
            if ("getEditForm".equals(s))
            {
                handleGetEditFormFailure(exception);
                return true;
            }
            if ("saveEditForm".equals(s))
            {
                setSaveCardButtonEnabled(true);
                handleSaveEditFormFailure(exception);
                return true;
            }
        }
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        if ("getEditForm".equals(s))
        {
            spinnerManager.hide();
            handleGetEditFormSuccess((com.google.wallet.proto.api.NanoWalletGiftCards.GetEditFormResponse)obj);
        } else
        if ("saveEditForm".equals(s))
        {
            handleSaveEditFormSuccess();
            return;
        }
    }

    protected final void onBeforeCreate(Bundle bundle)
    {
        if (bundle != null)
        {
            cardInfo = (GiftCardInfo)bundle.getParcelable("card_info");
            serverData = bundle.getByteArray("server_data");
        }
    }

    public final void onCardInfoComplete()
    {
        saveEditedGiftCard();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }

    public final void onEditMerchantNameIconClicked()
    {
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("card_info", cardInfo);
        bundle.putByteArray("server_data", serverData);
    }

    public final void onSaveRequested()
    {
        analyticsUtil.sendButtonTap("EditGiftCard", new AnalyticsCustomDimension[0]);
    }

    protected final void onUpPressed()
    {
        finish();
    }

    public final void onValidationError()
    {
        analyticsUtil.sendUserError("EditGiftCard", new AnalyticsCustomDimension[0]);
    }





/*
    static byte[] access$102(EditGiftCardActivity editgiftcardactivity, byte abyte0[])
    {
        editgiftcardactivity.serverData = abyte0;
        return abyte0;
    }

*/



}
