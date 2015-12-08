// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.studies.ExpressPayAnalytics;
import me.lyft.android.application.driver.expresspay.IExpressPayRepository;
import me.lyft.android.application.driver.expresspay.IExpressPayService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedButton;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.driver.ExpressPay;
import me.lyft.android.domain.driver.ExpressPayAccount;
import me.lyft.android.domain.payment.LineItem;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            IExpressPayErrorHandler

public class ExpressPayView extends LinearLayout
{

    AdvancedButton addOrEditDebitCard;
    AppFlow appFlow;
    private Binder binder;
    DialogFlow dialogFlow;
    IExpressPayErrorHandler expressPayErrorHandler;
    IExpressPayRepository expressPayRepository;
    IExpressPayService expressPayService;
    Button getPaidButton;
    private LayoutInflater inflater;
    TextView inlineErrorTxt;
    LinearLayout itemsContainer;
    IProgressController progressController;
    Toolbar toolbar;
    TextView totalAmount;
    TextView totalLabel;

    public ExpressPayView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = Scoop.a(this);
        attributeset.b(this);
        inflater = attributeset.a(context);
    }

    private void addLineItems()
    {
        ExpressPay expresspay = expressPayRepository.getExpressPay();
        Iterator iterator = expresspay.getLineItems().iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            Object obj = (LineItem)iterator.next();
            String s = Money.format(((LineItem) (obj)).getAmount().getAmount().intValue());
            obj = ((LineItem) (obj)).getTitle();
            i++;
            if (expresspay.isLastItem(i))
            {
                totalLabel.setText(((CharSequence) (obj)));
                totalAmount.setText(s);
            } else
            {
                ViewGroup viewgroup = (ViewGroup)inflater.inflate(0x7f030077, itemsContainer, false);
                ((TextView)viewgroup.findViewById(0x7f0d0215)).setText(((CharSequence) (obj)));
                ((TextView)viewgroup.findViewById(0x7f0d0216)).setText(s);
                itemsContainer.addView(viewgroup);
            }
        }
    }

    private void refreshDebitCardButton(ExpressPayAccount expresspayaccount)
    {
        if (!expresspayaccount.isNull())
        {
            addOrEditDebitCard.setText(getResources().getString(0x7f070165, new Object[] {
                expresspayaccount.getType(), expresspayaccount.getLastFour()
            }));
            TextView textview = inlineErrorTxt;
            Object obj;
            int i;
            if (expresspayaccount.isFailed())
            {
                obj = expresspayaccount.getFailedMessage();
            } else
            {
                obj = "";
            }
            textview.setText(((CharSequence) (obj)));
            obj = inlineErrorTxt;
            if (expresspayaccount.isFailed())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((TextView) (obj)).setVisibility(i);
            addOrEditDebitCard.setValidationMessageView(inlineErrorTxt);
        }
    }

    private void submitPayouts()
    {
        progressController.showProgress();
        binder.bind(expressPayService.submitPayout(), new AsyncCall() {

            final ExpressPayView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                expressPayErrorHandler.handleExpressPayError(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                dialogFlow.show(new ExpressPayDialogs.ExpressPayPayoutSucceededAnimationDialog());
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = ExpressPayView.this;
                super();
            }
        });
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(toolbar.observeHomeClick(), new Action1() {

            final ExpressPayView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                appFlow.goBack();
            }

            
            {
                this$0 = ExpressPayView.this;
                super();
            }
        });
        binder.bind(expressPayRepository.observeExpressPayAccountChange(), new Action1() {

            final ExpressPayView this$0;

            public volatile void call(Object obj)
            {
                call((ExpressPayAccount)obj);
            }

            public void call(ExpressPayAccount expresspayaccount)
            {
                refreshDebitCardButton(expresspayaccount);
            }

            
            {
                this$0 = ExpressPayView.this;
                super();
            }
        });
        addOrEditDebitCard.setOnClickListener(new android.view.View.OnClickListener() {

            final ExpressPayView this$0;

            public void onClick(View view)
            {
                if (expressPayRepository.getExpressPayAccount().isNull())
                {
                    ExpressPayAnalytics.trackAddDebitCardTaps();
                    dialogFlow.show(new ExpressPayDialogs.AddDebitCardDialog());
                    return;
                } else
                {
                    ExpressPayAnalytics.trackEditDebitCardTaps();
                    appFlow.goTo(new me.lyft.android.ui.driver.DriverScreens.EditDebitCardScreen());
                    return;
                }
            }

            
            {
                this$0 = ExpressPayView.this;
                super();
            }
        });
        getPaidButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ExpressPayView this$0;

            public void onClick(View view)
            {
                ExpressPayAnalytics.trackConfirmDepositTaps();
                view = expressPayRepository.getExpressPayAccount();
                if (view.isNull())
                {
                    dialogFlow.show(new ExpressPayDialogs.AddDebitCardDialog());
                    return;
                }
                if (view.isFailed())
                {
                    appFlow.goTo(new me.lyft.android.ui.driver.DriverScreens.EditDebitCardScreen());
                    return;
                } else
                {
                    submitPayouts();
                    return;
                }
            }

            
            {
                this$0 = ExpressPayView.this;
                super();
            }
        });
        totalLabel.setOnClickListener(new android.view.View.OnClickListener() {

            final ExpressPayView this$0;

            public void onClick(View view)
            {
                dialogFlow.show(new ExpressPayDialogs.ExpressPayInfoDialog(expressPayRepository.getExpressPay().getPayoutInfoText(), getResources().getString(0x7f070188), false));
            }

            
            {
                this$0 = ExpressPayView.this;
                super();
            }
        });
        addLineItems();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.setTitle(getResources().getString(0x7f070172));
        toolbar.setHomeIcon(0x7f0200ff);
    }


}
