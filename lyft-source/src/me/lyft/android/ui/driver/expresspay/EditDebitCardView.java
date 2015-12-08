// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.ExpressPayAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.driver.expresspay.IExpressPayRepository;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.SimpleTextWatcher;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.driver.ExpressPayAccount;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.ui.payment.IPaymentErrorHandler;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;
import rx.functions.Action1;

public class EditDebitCardView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    AdvancedEditText cardNumberEditText;
    IConstantsProvider constantsProvider;
    CreditCardInput creditCardInput;
    DialogFlow dialogFlow;
    final ExpressPayAccount expressPayAccount;
    IExpressPayRepository expressPayRepository;
    TextView inlineErrorText;
    IPaymentErrorHandler paymentErrorHandler;
    IPaymentService paymentService;
    IProgressController progressController;
    Toolbar toolbar;

    public EditDebitCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
        expressPayAccount = expressPayRepository.getExpressPayAccount();
    }

    private void initData()
    {
        creditCardInput.setExistingCard(expressPayAccount.getLastFour(), expressPayAccount.getType(), expressPayAccount.isFailed());
        if (expressPayAccount.isFailed())
        {
            showCardErrors();
        }
        cardNumberEditText.addTextChangedListener(new SimpleTextWatcher() {

            final EditDebitCardView this$0;

            public void afterTextChanged(Editable editable)
            {
                super.afterTextChanged(editable);
                if (editable.length() == 0)
                {
                    cardNumberEditText.setHint(getResources().getText(0x7f0700ef));
                }
            }

            
            {
                this$0 = EditDebitCardView.this;
                super();
            }
        });
    }

    private void initToolbar()
    {
        toolbar.setHomeIcon(0x7f0200ff);
        toolbar.setTitle(getResources().getString(0x7f070263));
        toolbar.addItem(0x7f0d0024, getResources().getString(0x7f070321), -1, getResources().getColor(0x7f0c000b), 1);
    }

    private void saveCard()
    {
        ICard icard = creditCardInput.getCard();
        ExpressPayAnalytics.trackSaveDebitCardTaps("edit_debit_card_screen");
        if (icard.isEmpty() && expressPayAccount.isFailed())
        {
            showCardErrors();
            return;
        } else
        {
            progressController.disableUI();
            progressController.showProgress();
            binder.bind(paymentService.updateDebitCard(icard), new AsyncCall() {

                final EditDebitCardView this$0;

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
                    appFlow.goBack();
                }

                public void onUnsubscribe()
                {
                    super.onUnsubscribe();
                    progressController.enableUI();
                    progressController.hideProgress();
                }

            
            {
                this$0 = EditDebitCardView.this;
                super();
            }
            });
            return;
        }
    }

    private void showCardErrors()
    {
        inlineErrorText.setVisibility(0);
        inlineErrorText.setText(expressPayAccount.getFailedMessage());
        creditCardInput.highlightCreditCardFields();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        initToolbar();
        initData();
        binder.bind(toolbar.observeHomeClick(), new Action1() {

            final EditDebitCardView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                appFlow.goBack();
            }

            
            {
                this$0 = EditDebitCardView.this;
                super();
            }
        });
        binder.bind(toolbar.observeItemClick(), new Action1() {

            final EditDebitCardView this$0;

            public void call(Integer integer)
            {
                if (integer.intValue() == 0x7f0d0024)
                {
                    saveCard();
                }
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = EditDebitCardView.this;
                super();
            }
        });
        binder.bind(creditCardInput.observeOnDonePressed(), new Action1() {

            final EditDebitCardView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                saveCard();
            }

            
            {
                this$0 = EditDebitCardView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        creditCardInput.addOnInputChangedListener(new me.lyft.android.ui.payment.cardinput.CreditCardInput.OnInputChangedListener() {

            final EditDebitCardView this$0;

            public void onInputChanged()
            {
                inlineErrorText.setVisibility(8);
            }

            
            {
                this$0 = EditDebitCardView.this;
                super();
            }
        });
        paymentErrorHandler.attach(creditCardInput, inlineErrorText);
    }

}
