// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;
import me.lyft.android.utils.Keyboard;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentScreens, IPaymentErrorHandler

public abstract class BaseCreditCardView extends LinearLayout
{

    AppFlow appFlow;
    Binder binder;
    MessageBus bus;
    View changeLabelButton;
    CreditCardInput creditCardInput;
    DialogFlow dialogFlow;
    TextView editChargeAccountNote;
    ReactiveProperty label;
    ReactiveProperty labelType;
    private final Action1 onReceivedLabelResponse = new Action1() {

        final BaseCreditCardView this$0;

        public volatile void call(Object obj)
        {
            call((ChangeChargeAccountLabelView.ResponseData)obj);
        }

        public void call(ChangeChargeAccountLabelView.ResponseData responsedata)
        {
            if (!responsedata.consume())
            {
                labelType.onNext(responsedata.labelType);
                label.onNext(responsedata.label);
            }
        }

            
            {
                this$0 = BaseCreditCardView.this;
                super();
            }
    };
    private final Action1 onToolbarItemClicked = new Action1() {

        final BaseCreditCardView this$0;

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
                this$0 = BaseCreditCardView.this;
                super();
            }
    };
    IPaymentErrorHandler paymentErrorHandler;
    IPaymentService paymentService;
    IProgressController progressController;
    TextView selectedLabelTxt;
    Toolbar toolbar;

    public BaseCreditCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        label = ReactiveProperty.create();
        labelType = ReactiveProperty.create();
        Scoop.a(this).b(this);
    }

    private void changeLabel()
    {
        appFlow.goTo(new PaymentScreens.ChangeCreditCardLabelScreen((String)labelType.get(), (String)label.get()));
    }

    private void initToolbar()
    {
        toolbar.showTitle().addItem(0x7f0d0024, getResources().getString(0x7f070321));
        TextView textview = (TextView)ButterKnife.a(toolbar.getToolbarItemView(0x7f0d0024), 0x7f0d0061);
        textview.setTypeface(null, 1);
        textview.setTextColor(getResources().getColor(0x7f0c000b));
        toolbar.setTitle(getResources().getString(getToolbarTitleResource()));
    }

    private void saveCard()
    {
        Keyboard.hideKeyboard(creditCardInput);
        progressController.showProgress();
        ICard icard = creditCardInput.getCard();
        binder.bind(saveCardRequest(icard, (String)label.get(), (String)labelType.get()), createResponseHandler());
    }

    protected final AsyncCall createResponseHandler()
    {
        return new ResponseHandler();
    }

    protected final PaymentScreens getScreen()
    {
        return (PaymentScreens)Scoop.a(this).a();
    }

    protected abstract int getToolbarTitleResource();

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        initToolbar();
        binder.bind(toolbar.observeItemClick(), onToolbarItemClicked);
        binder.bind(creditCardInput.observeOnDonePressed(), new Action1() {

            final BaseCreditCardView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                saveCard();
            }

            
            {
                this$0 = BaseCreditCardView.this;
                super();
            }
        });
        binder.bind(bus.observe(me/lyft/android/ui/payment/ChangeChargeAccountLabelView$ResponseEvent), onReceivedLabelResponse);
        binder.bind(label, new Action1() {

            final BaseCreditCardView this$0;

            public volatile void call(Object obj)
            {
                call((String)obj);
            }

            public void call(String s)
            {
                selectedLabelTxt.setText(s);
            }

            
            {
                this$0 = BaseCreditCardView.this;
                super();
            }
        });
        paymentErrorHandler.attach(creditCardInput, editChargeAccountNote);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        changeLabelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final BaseCreditCardView this$0;

            public void onClick(View view)
            {
                changeLabel();
            }

            
            {
                this$0 = BaseCreditCardView.this;
                super();
            }
        });
    }

    protected abstract Observable saveCardRequest(ICard icard, String s, String s1);



    private class ResponseHandler extends AsyncCall
    {

        final BaseCreditCardView this$0;

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
        }

        public void onUnsubscribe()
        {
            super.onUnsubscribe();
            progressController.hideProgress();
        }

        private ResponseHandler()
        {
            this$0 = BaseCreditCardView.this;
            super();
        }

    }

}
