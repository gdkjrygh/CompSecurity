// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.p2p.people.UserProfilePhotoEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.tile.HeaderTile;
import com.google.android.apps.wallet.tile.Tile;
import com.google.android.apps.wallet.transfer.api.TransferApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.roundedimage.RoundedImage;
import com.google.common.base.Optional;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            BalanceView

public class BalanceHeader extends Tile
    implements android.view.View.OnClickListener, HeaderTile
{
    public static class GooglePlusPhotoDialog extends AlertDialogFragment
    {

        protected final void configureAlertDialog(android.app.AlertDialog.Builder builder)
        {
            super.configureAlertDialog(builder);
            builder.setPositiveButton(com.google.android.apps.walletnfcrel.R.string.google_plus_dialog_button, new android.content.DialogInterface.OnClickListener() {

                final GooglePlusPhotoDialog this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse("https://plus.google.com/"));
                    startActivity(dialoginterface);
                }

            
            {
                this$0 = GooglePlusPhotoDialog.this;
                super();
            }
            });
            builder.setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel, this).setTitle(com.google.android.apps.walletnfcrel.R.string.google_plus_dialog_title).setMessage(com.google.android.apps.walletnfcrel.R.string.google_plus_dialog_message);
        }

        public GooglePlusPhotoDialog()
        {
            super(newBuilder());
        }
    }


    private com.google.wallet.proto.NanoWalletEntities.MoneyProto amountOwed;
    private final AnalyticsUtil analyticsUtil;
    private String balance;
    private BalanceView balanceView;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private final GooglePlusPhotoDialog googlePlusDialog;
    private boolean isNegative;
    private final NetworkAccessChecker networkAccessChecker;
    private RoundedImage photoView;
    private Button requestMoneyButton;
    private Button sendMoneyButton;
    private Button settleBalanceButton;
    private Toolbar toolbar;
    private final UriRegistry uriRegistry;

    public BalanceHeader(Activity activity, EventBus eventbus, GooglePlusPhotoDialog googleplusphotodialog, FeatureManager featuremanager, NetworkAccessChecker networkaccesschecker, AnalyticsUtil analyticsutil, UriRegistry uriregistry)
    {
        super(activity);
        balance = "";
        isNegative = false;
        eventBus = eventbus;
        googlePlusDialog = googleplusphotodialog;
        featureManager = featuremanager;
        networkAccessChecker = networkaccesschecker;
        analyticsUtil = analyticsutil;
        uriRegistry = uriregistry;
    }

    private void startActivityWithAnimation(Intent intent, View view)
    {
        view.setTransitionName("transfer");
        view = ActivityOptions.makeSceneTransitionAnimation(context, view, "transfer");
        context.startActivity(intent, view.toBundle());
    }

    private void startActivityWithTransferTransition(Intent intent, View view)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            startActivityWithAnimation(intent, view);
            return;
        } else
        {
            context.startActivity(intent);
            return;
        }
    }

    public final void animateOnScroll(float f)
    {
        if (photoView == null)
        {
            return;
        }
        float f1 = 1.0F - f;
        float f2 = context.getResources().getDimension(com.google.android.apps.walletnfcrel.R.dimen.toolbar_elevation);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            toolbar.setElevation(f1 * f2);
        }
        int i;
        if ((double)f1 < 0.01D)
        {
            context.setTitle("");
        } else
        {
            context.setTitle(balance);
        }
        f *= f;
        photoView.animate().alpha(f).setDuration(0L);
        balanceView.animate().alpha(f).setDuration(0L);
        i = Color.argb((int)Math.ceil(255F * f1), 255, 255, 255);
        toolbar.setTitleTextColor(i);
    }

    public final boolean canDismiss(Object obj)
    {
        return false;
    }

    protected final void onActivate()
    {
        super.onActivate();
        getView().setOnTouchListener(null);
        eventBus.register(this);
    }

    public void onClick(View view)
    {
        if (mActive)
        {
            googlePlusDialog.show(((FragmentActivity)context).getSupportFragmentManager());
        }
    }

    protected final View onCreateView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.balance_header, viewgroup, false);
        setView(viewgroup);
        photoView = (RoundedImage)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.ProfilePhoto);
        photoView.setContentDescription(context.getString(com.google.android.apps.walletnfcrel.R.string.google_plus_dialog_title));
        photoView.setOnClickListener(this);
        balanceView = (BalanceView)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.WalletBalanceView);
        balanceView.setOnClickListener(new android.view.View.OnClickListener() {

            final BalanceHeader this$0;

            public final void onClick(View view)
            {
                settleOrOpenWalletBalance();
            }

            
            {
                this$0 = BalanceHeader.this;
                super();
            }
        });
        sendMoneyButton = (Button)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.SendMoneyButton);
        sendMoneyButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BalanceHeader this$0;

            public final void onClick(View view)
            {
                view = uriRegistry.createIntent(4000, new Object[0]);
                startActivityWithTransferTransition(view, sendMoneyButton);
                analyticsUtil.sendButtonTap("OpenSendMoney", new AnalyticsCustomDimension[0]);
                analyticsUtil.startTiming("OpenSendMoney", "user_open_send_money");
            }

            
            {
                this$0 = BalanceHeader.this;
                super();
            }
        });
        if (!featureManager.isFeatureEnabled(Feature.P2P_SEND_MONEY))
        {
            sendMoneyButton.setVisibility(8);
        }
        requestMoneyButton = (Button)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.RequestMoneyButton);
        requestMoneyButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BalanceHeader this$0;

            public final void onClick(View view)
            {
                view = uriRegistry.createIntent(4001, new Object[0]);
                startActivityWithTransferTransition(view, requestMoneyButton);
                analyticsUtil.sendButtonTap("OpenRequestMoney", new AnalyticsCustomDimension[0]);
                analyticsUtil.startTiming("OpenRequestMoney", "user_open_request_money");
            }

            
            {
                this$0 = BalanceHeader.this;
                super();
            }
        });
        if (!featureManager.isFeatureEnabled(Feature.P2P_REQUEST_PAYMENT))
        {
            requestMoneyButton.setVisibility(8);
        }
        settleBalanceButton = (Button)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.SettleBalanceButton);
        settleBalanceButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BalanceHeader this$0;

            public final void onClick(View view)
            {
                settleOrOpenWalletBalance();
            }

            
            {
                this$0 = BalanceHeader.this;
                super();
            }
        });
        toolbar = (Toolbar)Views.findViewById(context, com.google.android.apps.walletnfcrel.R.id.toolbar);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            toolbar.setElevation(0.0F);
        }
        return viewgroup;
    }

    protected final void onDeactivate()
    {
        super.onDeactivate();
        eventBus.unregisterAll(this);
        if (googlePlusDialog.isVisible())
        {
            googlePlusDialog.dismiss();
        }
    }

    void onNewUserProfilePhoto(UserProfilePhotoEvent userprofilephotoevent)
    {
        userprofilephotoevent = userprofilephotoevent.getPhoto();
        if (userprofilephotoevent.isPresent())
        {
            userprofilephotoevent = ((Bitmap)userprofilephotoevent.get()).copy(android.graphics.Bitmap.Config.ARGB_8888, false);
            if (userprofilephotoevent != null)
            {
                photoView.setImage(userprofilephotoevent);
            } else
            {
                photoView.setImage(null);
            }
        } else
        {
            photoView.setImage(null);
        }
        photoView.setOnClickListener(this);
    }

    public void onStoredValueEvent(StoredValueEvent storedvalueevent)
    {
label0:
        {
            boolean flag1 = true;
            BalanceView balanceview = balanceView;
            StoredValueModel storedvaluemodel = storedvalueevent.getModel();
            boolean flag;
            if (storedvalueevent.getFailureCause() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            balanceview.displayStoredValue(storedvaluemodel, flag);
            if (storedvalueevent.getFailureCause() == null && storedvalueevent.getModel() != null && storedvalueevent.getModel().getStoredValue() != null && storedvalueevent.getModel().getStoredValue().balance != null)
            {
                balance = storedvalueevent.getModel().getStoredValue().balance.displayAmount;
                if (storedvalueevent.getModel().getStoredValue().balanceState.intValue() == 2)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                isNegative = flag;
                if (!isNegative)
                {
                    break label0;
                }
                amountOwed = storedvalueevent.getModel().getStoredValue().requiredTopUpAmount.amount;
                settleBalanceButton.setVisibility(0);
                sendMoneyButton.setVisibility(8);
            }
            return;
        }
        settleBalanceButton.setVisibility(8);
        sendMoneyButton.setVisibility(0);
    }

    protected final void settleOrOpenWalletBalance()
    {
        if (!networkAccessChecker.check())
        {
            return;
        }
        if (isNegative)
        {
            Intent intent = TransferApi.createConfirmMoneyTransferIntent(context, 3, amountOwed.micros.longValue(), amountOwed.currencyCode, null, null);
            context.startActivity(intent);
            return;
        } else
        {
            analyticsUtil.sendButtonTap("OpenWalletBalance", new AnalyticsCustomDimension[0]);
            analyticsUtil.startTiming("OpenWalletBalance", "user_open_wallet_balance");
            context.startActivity(uriRegistry.createIntent(5003, new Object[0]));
            return;
        }
    }

    public final boolean shouldShow()
    {
        return featureManager.isFeatureEnabled(Feature.STORED_VALUE_BALANCE);
    }





}
