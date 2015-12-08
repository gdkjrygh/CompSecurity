// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.User;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.infrastructure.cardscan.ICardScanService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;
import me.lyft.android.utils.Keyboard;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            IPaymentErrorHandler

public class PaymentFraudView extends LinearLayout
    implements IHandleBack
{

    AppFlow appFlow;
    private Binder binder;
    AdvancedEditText cardNumberEditText;
    ICardScanService cardScanService;
    CreditCardInput creditCardInput;
    AdvancedEditText cvcEditText;
    ScrollView enterCreditCardInfoGroup;
    MessageBus messageBus;
    private Action1 onCreditCardScanned;
    IPaymentErrorHandler paymentErrorHandler;
    IPaymentService paymentService;
    IProgressController progressController;
    View saveButton;
    LinearLayout scanCardButton;
    Toolbar toolbar;
    IUserProvider userProvider;

    public PaymentFraudView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onCreditCardScanned = new Action1() {

            final PaymentFraudView this$0;

            public volatile void call(Object obj)
            {
                call((ICard)obj);
            }

            public void call(ICard icard)
            {
                enterCreditCardInfoGroup.setVisibility(0);
                scanCardButton.setVisibility(8);
                creditCardInput.clearCardEditTexts();
                cardNumberEditText.setText(icard.getNumber());
                Keyboard.showKeyboard(cvcEditText);
            }

            
            {
                this$0 = PaymentFraudView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void saveCard()
    {
        ICard icard = creditCardInput.getCard();
        progressController.disableUI();
        progressController.showProgress();
        binder.bind(paymentService.createCreditCard(icard, null, null), new AsyncCall() {

            final PaymentFraudView this$0;

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
                appFlow.goBack();
                messageBus.post(me/lyft/android/ui/dialogs/PaymentDialogView$RequestRideEvent);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.enableUI();
                progressController.hideProgress();
            }

            
            {
                this$0 = PaymentFraudView.this;
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
        }
        binder = Binder.attach(this);
        binder.bind(creditCardInput.observeOnDonePressed(), new Action1() {

            final PaymentFraudView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                saveCard();
            }

            
            {
                this$0 = PaymentFraudView.this;
                super();
            }
        });
        paymentErrorHandler.attach(creditCardInput, null);
        if (userProvider.getUser().isCreditCardCaptureRequired())
        {
            binder.bind(cardScanService.observeScannedCard(), onCreditCardScanned);
            enterCreditCardInfoGroup.setVisibility(8);
            scanCardButton.setVisibility(0);
            scanCardButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PaymentFraudView this$0;

                public void onClick(View view)
                {
                    cardScanService.startCardScan();
                }

            
            {
                this$0 = PaymentFraudView.this;
                super();
            }
            });
            return;
        } else
        {
            scanCardButton.setVisibility(8);
            enterCreditCardInfoGroup.setVisibility(0);
            creditCardInput.showSoftwareKeyboard();
            return;
        }
    }

    public boolean onBack()
    {
        PaymentAnalytics.trackPaymentFraudClose();
        appFlow.goBack();
        return true;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            toolbar.showTitle().setTitle(getResources().getString(0x7f070270));
            toolbar.setHomeIcon(0x7f020003);
            toolbar.setHomeButtonEnabled(true);
            toolbar.findViewById(0x7f0d0406).setOnClickListener(new android.view.View.OnClickListener() {

                final PaymentFraudView this$0;

                public void onClick(View view)
                {
                    PaymentAnalytics.trackPaymentFraudClose();
                    appFlow.goBack();
                }

            
            {
                this$0 = PaymentFraudView.this;
                super();
            }
            });
            saveButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PaymentFraudView this$0;

                public void onClick(View view)
                {
                    saveCard();
                }

            
            {
                this$0 = PaymentFraudView.this;
                super();
            }
            });
            return;
        }
    }

}
