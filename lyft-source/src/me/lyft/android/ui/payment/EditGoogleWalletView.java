// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.payment.WalletChargeAccount;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.DialogResult;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            IPaymentErrorHandler

public class EditGoogleWalletView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    MessageBus bus;
    TextView cardTitleTextView;
    private final WalletChargeAccount chargeAccount;
    IChargeAccountsProvider chargeAccountsProvider;
    View defaultCardView;
    Button deleteButton;
    DialogFlow dialogFlow;
    Button editCardButton;
    IPaymentErrorHandler errorHandler;
    Button makeDefaultButton;
    IPaymentService paymentService;
    IProgressController progressController;
    Toolbar toolbar;

    public EditGoogleWalletView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        chargeAccount = ((PaymentScreens.EditGoogleWalletScreen)context.a()).getChargeAccount();
    }

    private void deleteWallet()
    {
        progressController.showProgress();
        binder.bind(paymentService.deleteChargeAccount(chargeAccount.getId()), new AsyncCall() {

            final EditGoogleWalletView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                errorHandler.handleWalletError(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                appFlow.goBack();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = EditGoogleWalletView.this;
                super();
            }
        });
    }

    private void editCard()
    {
        progressController.showProgress();
        binder.bind(paymentService.saveWalletCard(), new AsyncCall() {

            final EditGoogleWalletView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                errorHandler.handleWalletError(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                appFlow.goBack();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = EditGoogleWalletView.this;
                super();
            }
        });
    }

    private void makeDefault()
    {
        progressController.showProgress();
        binder.bind(paymentService.makeWalletDefault(chargeAccount.getId()), new AsyncCall() {

            final EditGoogleWalletView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                errorHandler.handleWalletError(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                appFlow.goBack();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = EditGoogleWalletView.this;
                super();
            }
        });
    }

    private void showDeleteConfirmationDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("delete_wallet_confirmation_dialog")).setTitle(getResources().getString(0x7f07025e)).setTitleColorResource(0x7f0c00b7).setMessage(getResources().getString(0x7f07025d)).addNegativeButton(getResources().getString(0x7f070087)).addPositiveButton(getResources().getString(0x7f07011a), 0x7f030059).setDialogEventClass(me/lyft/android/ui/payment/EditGoogleWalletView$DeleteWalletDialogResultEvent);
        dialogFlow.show(alertdialog);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        toolbar.setTitle(getResources().getString(0x7f070286));
        cardTitleTextView.setText(getResources().getString(0x7f070269, new Object[] {
            chargeAccount.getType(), chargeAccount.getLastFour()
        }));
        if (chargeAccount.isDefault().booleanValue())
        {
            defaultCardView.setVisibility(0);
            makeDefaultButton.setVisibility(8);
        } else
        {
            defaultCardView.setVisibility(8);
            makeDefaultButton.setVisibility(0);
        }
        if (chargeAccountsProvider.hasLessThanTwoPaymentMethods())
        {
            deleteButton.setVisibility(8);
        } else
        {
            deleteButton.setVisibility(0);
        }
        makeDefaultButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EditGoogleWalletView this$0;

            public void onClick(View view)
            {
                makeDefault();
            }

            
            {
                this$0 = EditGoogleWalletView.this;
                super();
            }
        });
        editCardButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EditGoogleWalletView this$0;

            public void onClick(View view)
            {
                editCard();
            }

            
            {
                this$0 = EditGoogleWalletView.this;
                super();
            }
        });
        deleteButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EditGoogleWalletView this$0;

            public void onClick(View view)
            {
                showDeleteConfirmationDialog();
            }

            
            {
                this$0 = EditGoogleWalletView.this;
                super();
            }
        });
        binder.bind(bus.observe(me/lyft/android/ui/payment/EditGoogleWalletView$DeleteWalletDialogResultEvent), new Action1() {

            final EditGoogleWalletView this$0;

            public volatile void call(Object obj)
            {
                call((DialogResult)obj);
            }

            public void call(DialogResult dialogresult)
            {
                if (dialogresult.getButtonId() == 0x7f0d000b)
                {
                    deleteWallet();
                }
            }

            
            {
                this$0 = EditGoogleWalletView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }




}
