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
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.payment.FacebookChargeAccount;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.utils.WebBrowser;

// Referenced classes of package me.lyft.android.ui.payment:
//            IPaymentErrorHandler

public class EditFacebookCreditCardView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    TextView cardTitleTextView;
    private final FacebookChargeAccount chargeAccount;
    View defaultCardView;
    DialogFlow dialogFlow;
    IPaymentErrorHandler errorHandler;
    View errorView;
    LinearLayout footerView;
    Button makeDefaultButton;
    IPaymentService paymentService;
    IProgressController progressController;
    Toolbar toolbar;

    public EditFacebookCreditCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        chargeAccount = ((PaymentScreens.EditFacebookCreditCardScreen)context.a()).getChargeAccount();
    }

    private void makeDefault()
    {
        progressController.showProgress();
        binder.bind(paymentService.makeFacebookDefault(chargeAccount.getId()), new AsyncCall() {

            final EditFacebookCreditCardView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                errorHandler.handleFacebookCardError(throwable);
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
                this$0 = EditFacebookCreditCardView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
label0:
        {
            boolean flag = false;
            super.onAttachedToWindow();
            binder = Binder.attach(this);
            toolbar.setTitle(getResources().getString(0x7f070263));
            cardTitleTextView.setText(getResources().getString(0x7f070267, new Object[] {
                chargeAccount.getType(), chargeAccount.getLastFour()
            }));
            Object obj = defaultCardView;
            int i;
            if (chargeAccount.isDefault().booleanValue() && !chargeAccount.isFailed().booleanValue())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((View) (obj)).setVisibility(i);
            obj = errorView;
            if (chargeAccount.isFailed().booleanValue())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((View) (obj)).setVisibility(i);
            obj = makeDefaultButton;
            if (!chargeAccount.isDefault().booleanValue())
            {
                i = ((flag) ? 1 : 0);
                if (!chargeAccount.isFailed().booleanValue())
                {
                    break label0;
                }
            }
            i = 8;
        }
        ((Button) (obj)).setVisibility(i);
        makeDefaultButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EditFacebookCreditCardView this$0;

            public void onClick(View view)
            {
                makeDefault();
            }

            
            {
                this$0 = EditFacebookCreditCardView.this;
                super();
            }
        });
        footerView.setOnClickListener(new android.view.View.OnClickListener() {

            final EditFacebookCreditCardView this$0;

            public void onClick(View view)
            {
                view = PaymentAnalytics.trackOpenFacebookMessenger();
                try
                {
                    WebBrowser.open(getContext(), "fb-messenger://payments/settings");
                    view.trackSuccess();
                    return;
                }
                catch (Throwable throwable)
                {
                    view.trackFailure(throwable);
                }
                dialogFlow.show(new PaymentDialogs.FacebookMessengerNotInstalledDialogScreen());
            }

            
            {
                this$0 = EditFacebookCreditCardView.this;
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
