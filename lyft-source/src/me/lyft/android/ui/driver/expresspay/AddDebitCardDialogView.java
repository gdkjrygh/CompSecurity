// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.ExpressPayAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.expresspay.IExpressPayRepository;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.SimpleTextWatcher;
import me.lyft.android.domain.driver.ExpressPayAccount;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.ui.payment.IPaymentErrorHandler;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;
import me.lyft.android.utils.Keyboard;
import rx.functions.Action1;

public class AddDebitCardDialogView extends DialogContainerView
{

    TextView addCardButton;
    private Binder binder;
    AdvancedEditText cardNumberEditText;
    View closeButton;
    IConstantsProvider constantsProvider;
    CreditCardInput creditCardInput;
    DialogFlow dialogFlow;
    IExpressPayRepository expressPayRepository;
    TextView inlineErrorText;
    IPaymentErrorHandler paymentErrorHandler;
    IPaymentService paymentService;
    IProgressController progressController;

    public AddDebitCardDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void saveCard()
    {
        me.lyft.android.domain.payment.ICard icard = creditCardInput.getCard();
        ExpressPayAnalytics.trackSaveDebitCardTaps("add_debit_card_screen");
        progressController.disableUI();
        progressController.showProgress();
        binder.bind(paymentService.createDebitCard(icard), new AsyncCall() {

            final AddDebitCardDialogView this$0;

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
                dialogFlow.dismiss();
                unit = expressPayRepository.getExpressPayAccount().getSuccessMessage();
                DialogFlow dialogflow = dialogFlow;
                if (Strings.isNullOrEmpty(unit))
                {
                    unit = new Toast(getResources().getString(0x7f0700ee));
                } else
                {
                    unit = new ExpressPayDialogs.ExpressPayDebitCardInfoDialog(unit, getResources().getString(0x7f070188), false, getResources().getString(0x7f0701ee), constantsProvider.getConstants().getExpressPayDebitCardInfoLink());
                }
                dialogflow.show(unit);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.enableUI();
                progressController.hideProgress();
            }

            
            {
                this$0 = AddDebitCardDialogView.this;
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

                final AddDebitCardDialogView this$0;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    saveCard();
                }

            
            {
                this$0 = AddDebitCardDialogView.this;
                super();
            }
            });
            creditCardInput.showSoftwareKeyboard();
            cardNumberEditText.addTextChangedListener(new SimpleTextWatcher() {

                final AddDebitCardDialogView this$0;

                public void afterTextChanged(Editable editable)
                {
                    super.afterTextChanged(editable);
                    if (editable.length() == 0)
                    {
                        cardNumberEditText.setHint(getResources().getText(0x7f0700ef));
                    }
                }

            
            {
                this$0 = AddDebitCardDialogView.this;
                super();
            }
            });
            return;
        }
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

                final AddDebitCardDialogView this$0;

                public void onClick(View view)
                {
                    Keyboard.hideKeyboard(creditCardInput);
                    dialogFlow.dismiss();
                }

            
            {
                this$0 = AddDebitCardDialogView.this;
                super();
            }
            });
            creditCardInput.requestFocus();
            creditCardInput.addOnInputChangedListener(new me.lyft.android.ui.payment.cardinput.CreditCardInput.OnInputChangedListener() {

                final AddDebitCardDialogView this$0;

                public void onInputChanged()
                {
                    inlineErrorText.setVisibility(8);
                }

            
            {
                this$0 = AddDebitCardDialogView.this;
                super();
            }
            });
            paymentErrorHandler.attach(creditCardInput, inlineErrorText);
            addCardButton.setOnClickListener(new android.view.View.OnClickListener() {

                final AddDebitCardDialogView this$0;

                public void onClick(View view)
                {
                    saveCard();
                }

            
            {
                this$0 = AddDebitCardDialogView.this;
                super();
            }
            });
            cardNumberEditText.setHint(getResources().getText(0x7f0700ef));
            return;
        }
    }

}
