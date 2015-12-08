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
import me.lyft.android.analytics.studies.ConcurAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.application.ride.IExpenseNoteSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toggle;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.User;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.DialogResult;
import me.lyft.android.ui.dialogs.Toast;
import rx.functions.Action1;

public class ConcurSendRideReceiptsView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    MessageBus bus;
    DialogFlow dialogFlow;
    IExpenseNoteSession expenseNoteSession;
    private PaymentScreens.ConcurSendRideReceiptsScreen params;
    IPaymentService paymentService;
    IProgressController progressController;
    TextView sendToConcurDescription;
    Toggle sendToConcurToggle;
    Toolbar toolbar;
    Button unlinkConcurButton;
    IUserProvider userProvider;
    IViewErrorHandler viewErrorHandler;

    public ConcurSendRideReceiptsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (PaymentScreens.ConcurSendRideReceiptsScreen)context.a();
    }

    private boolean sendConcurRideReceipts()
    {
        return params.sendConcurRideReceipts() || userProvider.getUser().sendConcurRideReceipts();
    }

    private void setSendToConcurDescription()
    {
        TextView textview = sendToConcurDescription;
        int i;
        if (sendConcurRideReceipts())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    private void showUnlinkConcurDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("unlink_concur_dialog")).setButtonsOrientation(Integer.valueOf(1)).setTitle(getResources().getString(0x7f07037f)).setMessage(getResources().getString(0x7f07037e)).addPositiveButton(getResources().getString(0x7f07037c), 0x7f030056).addNegativeButton(getResources().getString(0x7f070087)).setDialogEventClass(me/lyft/android/ui/payment/ConcurSendRideReceiptsView$UnlinkConcurDialogResultEvent);
        dialogFlow.show(alertdialog);
    }

    private void unlinkConcur()
    {
        progressController.showProgress();
        progressController.disableUI();
        binder.bind(paymentService.unlinkConcur(), new AsyncCall() {

            final ConcurSendRideReceiptsView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                expenseNoteSession.reset();
                dialogFlow.show(new Toast(getResources().getString(0x7f0700b6)));
                appFlow.resetTo(new PaymentScreens.PaymentScreen());
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
                progressController.enableUI();
            }

            
            {
                this$0 = ConcurSendRideReceiptsView.this;
                super();
            }
        });
    }

    private void updateConcurSendRideReceipts(final boolean concurSendRideReceipts)
    {
        progressController.showProgress();
        progressController.disableUI();
        binder.bind(paymentService.updateConcurSendRideReceipts(concurSendRideReceipts), new AsyncCall() {

            final ConcurSendRideReceiptsView this$0;
            final boolean val$concurSendRideReceipts;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                dialogFlow.show(new Toast(getResources().getString(0x7f070322)));
                expenseNoteSession.setConcurEnabled(concurSendRideReceipts);
                setSendToConcurDescription();
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
                progressController.enableUI();
            }

            
            {
                this$0 = ConcurSendRideReceiptsView.this;
                concurSendRideReceipts = flag;
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
        } else
        {
            binder = Binder.attach(this);
            toolbar.setTitle(getResources().getString(0x7f07024d));
            sendToConcurToggle.setChecked(sendConcurRideReceipts(), false);
            binder.bind(sendToConcurToggle.observeChange(), new Action1() {

                final ConcurSendRideReceiptsView this$0;

                public void call(Boolean boolean1)
                {
                    if (boolean1.booleanValue())
                    {
                        ConcurAnalytics.sendReceiptsEnabled();
                    } else
                    {
                        ConcurAnalytics.sendReceiptsDisabled();
                    }
                    updateConcurSendRideReceipts(boolean1.booleanValue());
                }

                public volatile void call(Object obj)
                {
                    call((Boolean)obj);
                }

            
            {
                this$0 = ConcurSendRideReceiptsView.this;
                super();
            }
            });
            binder.bind(bus.observe(me/lyft/android/ui/payment/ConcurSendRideReceiptsView$UnlinkConcurDialogResultEvent), new Action1() {

                final ConcurSendRideReceiptsView this$0;

                public volatile void call(Object obj)
                {
                    call((DialogResult)obj);
                }

                public void call(DialogResult dialogresult)
                {
                    if (dialogresult.getButtonId() == 0x7f0d000b)
                    {
                        unlinkConcur();
                    }
                }

            
            {
                this$0 = ConcurSendRideReceiptsView.this;
                super();
            }
            });
            unlinkConcurButton.setOnClickListener(new android.view.View.OnClickListener() {

                final ConcurSendRideReceiptsView this$0;

                public void onClick(View view)
                {
                    showUnlinkConcurDialog();
                }

            
            {
                this$0 = ConcurSendRideReceiptsView.this;
                super();
            }
            });
            setSendToConcurDescription();
            return;
        }
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
            return;
        }
    }




}
