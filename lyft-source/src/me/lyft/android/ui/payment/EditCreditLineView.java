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
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.payment.CreditLineChargeAccount;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.payment:
//            IPaymentErrorHandler

public class EditCreditLineView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    TextView cardTitleTextView;
    private CreditLineChargeAccount chargeAccount;
    View isDefaultTextView;
    View makeDefaultButton;
    IPaymentErrorHandler paymentErrorHandler;
    IPaymentService paymentService;
    IProgressController progressController;
    Toolbar toolbar;

    public EditCreditLineView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (isInEditMode())
        {
            return;
        } else
        {
            context = Scoop.a(this);
            context.b(this);
            chargeAccount = ((PaymentScreens.EditCreditLineScreen)context.a()).getChargeAccount();
            return;
        }
    }

    private void makeDefault()
    {
        progressController.showProgress();
        binder.bind(paymentService.makeCreditLineDefault(chargeAccount.getId()), new AsyncCall() {

            final EditCreditLineView this$0;

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

            
            {
                this$0 = EditCreditLineView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        cardTitleTextView.setText(chargeAccount.getLabel());
        toolbar.setTitle(getResources().getString(0x7f070263));
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        if (chargeAccount.isDefault().booleanValue())
        {
            isDefaultTextView.setVisibility(0);
            makeDefaultButton.setVisibility(8);
        } else
        {
            isDefaultTextView.setVisibility(8);
            if (chargeAccount.isFailed().booleanValue())
            {
                makeDefaultButton.setVisibility(8);
            } else
            {
                makeDefaultButton.setVisibility(0);
            }
        }
        makeDefaultButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EditCreditLineView this$0;

            public void onClick(View view)
            {
                makeDefault();
            }

            
            {
                this$0 = EditCreditLineView.this;
                super();
            }
        });
    }

}
