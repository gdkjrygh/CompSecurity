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
import me.lyft.android.domain.payment.PayPalChargeAccount;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.DialogResult;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            IPaymentErrorHandler

public class EditPayPalView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    MessageBus bus;
    private final PayPalChargeAccount chargeAccount;
    IChargeAccountsProvider chargeAccountsProvider;
    View defaultCardView;
    Button deleteButton;
    DialogFlow dialogFlow;
    TextView emailTextView;
    IPaymentErrorHandler errorHandler;
    Button makeDefaultButton;
    IPaymentService paymentService;
    IProgressController progressController;
    Toolbar toolbar;

    public EditPayPalView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        chargeAccount = ((PaymentScreens.EditPayPalScreen)context.a()).getChargeAccount();
    }

    private void deletePayPal()
    {
        progressController.showProgress();
        binder.bind(paymentService.deleteChargeAccount(chargeAccount.getId()), new AsyncCall() {

            final EditPayPalView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                errorHandler.handlePayPalError(throwable);
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
                this$0 = EditPayPalView.this;
                super();
            }
        });
    }

    private void makeDefault()
    {
        progressController.showProgress();
        binder.bind(paymentService.makePayPalDefault(chargeAccount.getId()), new AsyncCall() {

            final EditPayPalView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                errorHandler.handlePayPalError(throwable);
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
                this$0 = EditPayPalView.this;
                super();
            }
        });
    }

    private void showDeleteConfirmationDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("delete_paypal_confirmation_dialog")).setTitle(getResources().getString(0x7f07025c)).setTitleColorResource(0x7f0c00b7).setMessage(getResources().getString(0x7f07025b, new Object[] {
            chargeAccount.getEmail()
        })).addNegativeButton(getResources().getString(0x7f070087)).addPositiveButton(getResources().getString(0x7f070340), 0x7f030058).setDialogEventClass(me/lyft/android/ui/payment/EditPayPalView$DeletePayPalDialogResultEvent);
        dialogFlow.show(alertdialog);
    }

    protected void onAttachedToWindow()
    {
        byte byte0 = 8;
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        toolbar.setTitle(getResources().getString(0x7f07027f));
        emailTextView.setText(chargeAccount.getEmail());
        Object obj = chargeAccount.isDefault();
        Object obj1 = defaultCardView;
        int i;
        boolean flag;
        if (((Boolean) (obj)).booleanValue())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj1)).setVisibility(i);
        obj1 = makeDefaultButton;
        if (((Boolean) (obj)).booleanValue())
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((Button) (obj1)).setVisibility(i);
        flag = chargeAccountsProvider.hasLessThanTwoPaymentMethods();
        obj = deleteButton;
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((Button) (obj)).setVisibility(i);
        makeDefaultButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EditPayPalView this$0;

            public void onClick(View view)
            {
                makeDefault();
            }

            
            {
                this$0 = EditPayPalView.this;
                super();
            }
        });
        deleteButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EditPayPalView this$0;

            public void onClick(View view)
            {
                showDeleteConfirmationDialog();
            }

            
            {
                this$0 = EditPayPalView.this;
                super();
            }
        });
        binder.bind(bus.observe(me/lyft/android/ui/payment/EditPayPalView$DeletePayPalDialogResultEvent), new Action1() {

            final EditPayPalView this$0;

            public volatile void call(Object obj2)
            {
                call((DialogResult)obj2);
            }

            public void call(DialogResult dialogresult)
            {
                if (dialogresult.getButtonId() == 0x7f0d000b)
                {
                    deletePayPal();
                }
            }

            
            {
                this$0 = EditPayPalView.this;
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
