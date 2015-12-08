// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Preconditions;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.CreditCardChargeAccount;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.DialogResult;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            BaseCreditCardView

public class EditCreditCardView extends BaseCreditCardView
{

    IChargeAccountsProvider chargeAccountsProvider;
    View defaultCardView;
    View deleteCardButton;
    View makeDefaultButton;
    private Action1 onDeleteCreditCardDialogResult;

    public EditCreditCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onDeleteCreditCardDialogResult = new Action1() {

            final EditCreditCardView this$0;

            public volatile void call(Object obj)
            {
                call((DialogResult)obj);
            }

            public void call(DialogResult dialogresult)
            {
                if (dialogresult.getButtonId() == 0x7f0d000b)
                {
                    deleteCard();
                }
            }

            
            {
                this$0 = EditCreditCardView.this;
                super();
            }
        };
    }

    private void deleteCard()
    {
        progressController.showProgress();
        binder.bind(paymentService.deleteChargeAccount(getChargeAccountId()), createResponseHandler());
    }

    private String getChargeAccountId()
    {
        return getCreditCardChargeAccount().getId();
    }

    private CreditCardChargeAccount getCreditCardChargeAccount()
    {
        return ((PaymentScreens.EditCreditCardScreen)getScreen()).getChargeAccount();
    }

    private void initData()
    {
        byte byte0 = 8;
        CreditCardChargeAccount creditcardchargeaccount = getCreditCardChargeAccount();
        Preconditions.checkNotNull(creditcardchargeaccount);
        boolean flag = creditcardchargeaccount.isDefault().booleanValue();
        boolean flag1 = creditcardchargeaccount.isFailed().booleanValue();
        View view = makeDefaultButton;
        int i;
        if (flag || flag1)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        view = defaultCardView;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        view = deleteCardButton;
        if (chargeAccountsProvider.hasLessThanTwoPaymentMethods())
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        view.setVisibility(i);
        creditCardInput.setExistingCard(creditcardchargeaccount.getLastFour(), creditcardchargeaccount.getType(), creditcardchargeaccount.isFailed().booleanValue());
        if (Strings.isNullOrEmpty((String)label.get()))
        {
            label.onNext(creditcardchargeaccount.getLabel());
        }
        if (Strings.isNullOrEmpty((String)labelType.get()))
        {
            labelType.onNext(creditcardchargeaccount.getLabelType());
        }
    }

    private void onDeleteCardClicked()
    {
        Object obj = getCreditCardChargeAccount();
        obj = getResources().getString(0x7f070259, new Object[] {
            ((CreditCardChargeAccount) (obj)).getType(), ((CreditCardChargeAccount) (obj)).getLastFour()
        });
        obj = (new me.lyft.android.ui.Dialogs.AlertDialog("delete_card_confirmation_dialog")).setTitle(getResources().getString(0x7f07025a)).setMessage(((String) (obj))).addNegativeButton(getResources().getString(0x7f070087)).addPositiveButton(getResources().getString(0x7f07010c), 0x7f030059).setDialogEventClass(me/lyft/android/ui/payment/EditCreditCardView$DeleteChargeAccountDialogResultEvent);
        dialogFlow.show(((com.lyft.scoop.Screen) (obj)));
    }

    private void onMakeDefaultButtonClicked()
    {
        progressController.showProgress();
        binder.bind(paymentService.makeCardDefault(getChargeAccountId()), createResponseHandler());
    }

    protected int getToolbarTitleResource()
    {
        return 0x7f070263;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        initData();
        binder.bind(bus.observe(me/lyft/android/ui/payment/EditCreditCardView$DeleteChargeAccountDialogResultEvent), onDeleteCreditCardDialogResult);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        deleteCardButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EditCreditCardView this$0;

            public void onClick(View view)
            {
                onDeleteCardClicked();
            }

            
            {
                this$0 = EditCreditCardView.this;
                super();
            }
        });
        makeDefaultButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EditCreditCardView this$0;

            public void onClick(View view)
            {
                onMakeDefaultButtonClicked();
            }

            
            {
                this$0 = EditCreditCardView.this;
                super();
            }
        });
    }

    protected Observable saveCardRequest(ICard icard, String s, String s1)
    {
        return paymentService.updateCreditCard(getChargeAccountId(), icard, s, s1);
    }



}
