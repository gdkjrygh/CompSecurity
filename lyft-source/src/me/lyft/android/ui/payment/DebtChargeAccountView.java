// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.CreditCardChargeAccount;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;

// Referenced classes of package me.lyft.android.ui.payment:
//            IPaymentErrorHandler

public class DebtChargeAccountView extends ScrollView
{

    AppFlow appFlow;
    ImageButton backButton;
    private Binder binder;
    private String cardId;
    CreditCardInput creditCardInput;
    DialogFlow dialogFlow;
    TextView editCardNote;
    private final PaymentScreens.DebtAddChargeAccountScreen params;
    IPaymentErrorHandler paymentErrorHandler;
    IPaymentService paymentService;
    IProgressController progressController;
    Button saveButton;
    TextView subTitleTxt;
    TextView titleTxt;
    IUserProvider userProvider;

    public DebtChargeAccountView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (PaymentScreens.DebtAddChargeAccountScreen)context.a();
    }

    private void initData()
    {
        Object obj = getSelectedChargeAccount();
        if (obj != null)
        {
            cardId = ((ChargeAccount) (obj)).getId();
            if (obj instanceof CreditCardChargeAccount)
            {
                obj = (CreditCardChargeAccount)obj;
                creditCardInput.setExistingCard(((CreditCardChargeAccount) (obj)).getLastFour(), ((CreditCardChargeAccount) (obj)).getType(), true);
            }
        }
        if (isNewCard())
        {
            obj = getContext().getString(0x7f070245);
        } else
        {
            obj = getContext().getString(0x7f070264);
        }
        titleTxt.setText(((CharSequence) (obj)));
        obj = userProvider.getUser().getDebtMoney().format();
        obj = getResources().getString(0x7f0700fa, new Object[] {
            obj
        });
        subTitleTxt.setText(Html.fromHtml(((String) (obj))));
    }

    private boolean isNewCard()
    {
        return Strings.isNullOrEmpty(cardId);
    }

    private void saveCard()
    {
        Object obj = creditCardInput.getCard();
        final String debt;
        if (isNewCard())
        {
            obj = paymentService.createCreditCard(((me.lyft.android.domain.payment.ICard) (obj)));
        } else
        {
            obj = paymentService.updateCreditCard(cardId, ((me.lyft.android.domain.payment.ICard) (obj)));
        }
        debt = userProvider.getUser().getDebtMoney().format();
        progressController.showProgress(getResources().getString(0x7f0700f9));
        binder.bind(((rx.Observable) (obj)), new AsyncCall() {

            final DebtChargeAccountView this$0;
            final String val$debt;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                paymentErrorHandler.handleSaveDebtCardError(throwable);
            }

            public volatile void onSuccess(Object obj1)
            {
                onSuccess((Unit)obj1);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                dialogFlow.show(new Toast(getResources().getString(0x7f0700fb, new Object[] {
                    debt
                }), Integer.valueOf(0x7f0201ca)));
                appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = DebtChargeAccountView.this;
                debt = s;
                super();
            }
        });
    }

    public ChargeAccount getSelectedChargeAccount()
    {
        return params.getChargeAccount();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        initData();
        backButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DebtChargeAccountView this$0;

            public void onClick(View view)
            {
                appFlow.goUp();
            }

            
            {
                this$0 = DebtChargeAccountView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        paymentErrorHandler.attach(creditCardInput, editCardNote);
        saveButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DebtChargeAccountView this$0;

            public void onClick(View view)
            {
                saveCard();
            }

            
            {
                this$0 = DebtChargeAccountView.this;
                super();
            }
        });
    }

}
