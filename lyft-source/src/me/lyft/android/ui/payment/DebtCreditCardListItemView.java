// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.CreditCardChargeAccount;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.utils.CardExtensions;

// Referenced classes of package me.lyft.android.ui.payment:
//            DebtListItemView, IPaymentErrorHandler

public class DebtCreditCardListItemView extends DebtListItemView
{

    AppFlow appFlow;
    private Binder binder;
    DialogFlow dialogFlow;
    IPaymentErrorHandler errorHandler;
    IPaymentService paymentService;
    IProgressController progressController;
    IUserProvider userProvider;

    public DebtCreditCardListItemView(Context context, CreditCardChargeAccount creditcardchargeaccount)
    {
        super(context, creditcardchargeaccount);
    }

    private String getCardText(CreditCardChargeAccount creditcardchargeaccount)
    {
        Resources resources = getResources();
        int i;
        if (creditcardchargeaccount.isFailed().booleanValue())
        {
            i = 0x7f0700f6;
        } else
        {
            i = 0x7f0700f7;
        }
        return resources.getString(i, new Object[] {
            creditcardchargeaccount.getLastFour()
        });
    }

    private CreditCardChargeAccount getCreditCardChargeAccount()
    {
        return (CreditCardChargeAccount)getChargeAccount();
    }

    private void useChargeAccount(ChargeAccount chargeaccount)
    {
        final String debt = userProvider.getUser().getDebtMoney().format();
        progressController.showProgress(getResources().getString(0x7f0700f9));
        binder.bind(paymentService.payDebtWithCreditCard(chargeaccount.getId()), new AsyncCall() {

            final DebtCreditCardListItemView this$0;
            final String val$debt;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                errorHandler.handlePayDebtError(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                dialogFlow.show(new Toast(getResources().getString(0x7f0700fb, new Object[] {
                    debt
                }), Integer.valueOf(0x7f0201ca)));
                appFlow.goUp();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = DebtCreditCardListItemView.this;
                debt = s;
                super();
            }
        });
    }

    protected int getIcon()
    {
        return CardExtensions.getCardTypeImageResourceWithOutline(getCreditCardChargeAccount().getType());
    }

    protected String getTitle()
    {
        return getCardText(getCreditCardChargeAccount());
    }

    protected boolean isFailed()
    {
        return getChargeAccount().isFailed().booleanValue();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
    }

    public boolean performClick()
    {
        ChargeAccount chargeaccount = getChargeAccount();
        if (chargeaccount.isFailed().booleanValue())
        {
            appFlow.goTo(new PaymentScreens.DebtAddChargeAccountScreen(chargeaccount));
        } else
        {
            useChargeAccount(chargeaccount);
        }
        return true;
    }
}
