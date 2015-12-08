// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;
import rx.Observable;
import rx.functions.Action1;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.payment:
//            IPaymentErrorHandler

public class AddChargeAccountView extends LinearLayout
{

    View addPayPalButton;
    View addWalletButton;
    private Binder binder;
    CreditCardInput creditCardInput;
    TextView editChargeAccountNote;
    IPaymentErrorHandler paymentErrorHandler;
    IPaymentService paymentService;
    IProgressController progressController;
    Button saveButton;
    private final PublishSubject saveSuccessSubject = PublishSubject.create();
    View subTitleTextView;

    public AddChargeAccountView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(1);
        context = Scoop.a(this);
        context.b(this);
        context.a(getContext()).inflate(0x7f0300d9, this, true);
        ButterKnife.a(this);
    }

    private void addCard()
    {
        me.lyft.android.domain.payment.ICard icard = creditCardInput.getCard();
        progressController.disableUI();
        progressController.showProgress();
        binder.bind(paymentService.createCreditCard(icard), new AsyncCall() {

            final AddChargeAccountView this$0;

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
                saveSuccessSubject.onNext(Unit.create());
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.enableUI();
                progressController.hideProgress();
            }

            
            {
                this$0 = AddChargeAccountView.this;
                super();
            }
        });
    }

    private void addPayPal()
    {
        progressController.showProgress();
        binder.bind(paymentService.savePayPal(), new AsyncCall() {

            final AddChargeAccountView this$0;

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
                saveSuccessSubject.onNext(null);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = AddChargeAccountView.this;
                super();
            }
        });
    }

    private void addWallet()
    {
        progressController.showProgress();
        binder.bind(paymentService.saveWalletCard(), new AsyncCall() {

            final AddChargeAccountView this$0;

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
                saveSuccessSubject.onNext(null);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = AddChargeAccountView.this;
                super();
            }
        });
    }

    public Observable observeSaveSuccess()
    {
        return saveSuccessSubject.asObservable();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(creditCardInput.observeOnDonePressed(), new Action1() {

            final AddChargeAccountView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                addCard();
            }

            
            {
                this$0 = AddChargeAccountView.this;
                super();
            }
        });
        subTitleTextView.setVisibility(8);
        paymentErrorHandler.attach(creditCardInput, editChargeAccountNote);
        saveButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AddChargeAccountView this$0;

            public void onClick(View view)
            {
                addCard();
            }

            
            {
                this$0 = AddChargeAccountView.this;
                super();
            }
        });
        addWalletButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AddChargeAccountView this$0;

            public void onClick(View view)
            {
                addWallet();
            }

            
            {
                this$0 = AddChargeAccountView.this;
                super();
            }
        });
        addPayPalButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AddChargeAccountView this$0;

            public void onClick(View view)
            {
                addPayPal();
            }

            
            {
                this$0 = AddChargeAccountView.this;
                super();
            }
        });
        creditCardInput.showSoftwareKeyboard();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }




}
