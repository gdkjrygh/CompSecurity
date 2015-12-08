// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.application.payment.PaymentService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.payment.IPaymentErrorHandler;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;
import me.lyft.android.utils.Keyboard;
import me.lyft.android.utils.ViewExtensions;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            DialogContainerView

public class PaymentDialogView extends DialogContainerView
{

    private Binder binder;
    View closeButton;
    CreditCardInput creditCardInput;
    DialogFlow dialogFlow;
    MessageBus messageBus;
    View otherPaymentGroup;
    IPaymentErrorHandler paymentErrorHandler;
    PaymentService paymentService;
    View paypalButton;
    IProgressController progressController;
    View saveCreditCard;
    TextView sslEncryptedTextView;
    View walletButton;

    public PaymentDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void addGoogleWalletAccount()
    {
        progressController.showProgress();
        binder.bind(paymentService.saveWalletCard(), new AsyncCall() {

            final PaymentDialogView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                paymentErrorHandler.handleWalletError(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                messageBus.post(me/lyft/android/ui/payment/PaymentView$ReloadCardListEvent, null);
                dialogFlow.dismiss();
                messageBus.post(me/lyft/android/ui/dialogs/PaymentDialogView$RequestRideEvent);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = PaymentDialogView.this;
                super();
            }
        });
    }

    private void addPayPalAccount()
    {
        progressController.showProgress();
        binder.bind(paymentService.savePayPal(), new AsyncCall() {

            final PaymentDialogView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                paymentErrorHandler.handlePayPalError(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                messageBus.post(me/lyft/android/ui/payment/PaymentView$ReloadCardListEvent, null);
                dialogFlow.dismiss();
                messageBus.post(me/lyft/android/ui/dialogs/PaymentDialogView$RequestRideEvent);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = PaymentDialogView.this;
                super();
            }
        });
    }

    private void saveCard()
    {
        ICard icard = creditCardInput.getCard();
        progressController.disableUI();
        progressController.showProgress();
        binder.bind(paymentService.createCreditCard(icard), new AsyncCall() {

            final PaymentDialogView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                paymentErrorHandler.handleCardError(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                Keyboard.hideKeyboard(creditCardInput);
                dialogFlow.dismiss();
                messageBus.post(me/lyft/android/ui/dialogs/PaymentDialogView$RequestRideEvent);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.enableUI();
                progressController.hideProgress();
            }

            
            {
                this$0 = PaymentDialogView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            binder = Binder.attach(this);
            binder.bind(creditCardInput.observeOnDonePressed(), new Action1() {

                final PaymentDialogView this$0;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    saveCard();
                }

            
            {
                this$0 = PaymentDialogView.this;
                super();
            }
            });
            creditCardInput.showSoftwareKeyboard();
            paymentErrorHandler.attach(creditCardInput, sslEncryptedTextView);
            return;
        }
    }

    public boolean onBack()
    {
        PaymentAnalytics.trackPaymentDialogClose();
        return super.onBack();
    }

    protected void onFinishInflate()
    {
        if (isInEditMode())
        {
            return;
        } else
        {
            super.onFinishInflate();
            ButterKnife.a(this);
            closeButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PaymentDialogView this$0;

                public void onClick(View view)
                {
                    Keyboard.hideKeyboard(creditCardInput);
                    dialogFlow.dismiss();
                    PaymentAnalytics.trackPaymentDialogClose();
                }

            
            {
                this$0 = PaymentDialogView.this;
                super();
            }
            });
            creditCardInput.requestFocus();
            creditCardInput.addOnInputChangedListener(new me.lyft.android.ui.payment.cardinput.CreditCardInput.OnInputChangedListener() {

                final PaymentDialogView this$0;

                public void onInputChanged()
                {
                    if (creditCardInput.getCard().isEmpty())
                    {
                        otherPaymentGroup.setVisibility(0);
                        ViewExtensions.setVisibility(8, new View[] {
                            sslEncryptedTextView, saveCreditCard
                        });
                    } else
                    {
                        otherPaymentGroup.setVisibility(8);
                        ViewExtensions.setVisibility(0, new View[] {
                            sslEncryptedTextView, saveCreditCard
                        });
                        if (creditCardInput.getCard().validateCard())
                        {
                            PaymentAnalytics.trackEnterCreditCard();
                            return;
                        }
                    }
                }

            
            {
                this$0 = PaymentDialogView.this;
                super();
            }
            });
            saveCreditCard.setOnClickListener(new android.view.View.OnClickListener() {

                final PaymentDialogView this$0;

                public void onClick(View view)
                {
                    saveCard();
                }

            
            {
                this$0 = PaymentDialogView.this;
                super();
            }
            });
            walletButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PaymentDialogView this$0;

                public void onClick(View view)
                {
                    addGoogleWalletAccount();
                }

            
            {
                this$0 = PaymentDialogView.this;
                super();
            }
            });
            paypalButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PaymentDialogView this$0;

                public void onClick(View view)
                {
                    addPayPalAccount();
                }

            
            {
                this$0 = PaymentDialogView.this;
                super();
            }
            });
            return;
        }
    }



}
